package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class SqlTracker implements Store {
    private Connection cn;

    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("postgres"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    @Override
    public Item add(Item item) {
        try {
            PreparedStatement st = cn.prepareStatement("insert into  item (id,name)  values  (?, ?)");
            st.setString(1, item.getId());
            st.setString(2, item.getName());
            st.executeQuery();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return item;
    }
    @Override
    public boolean replace(String id, Item item) {
        int whenreplaced = 0;
        try {
            PreparedStatement st = cn.prepareStatement("update item set name = ? where id = ?");
            st.setString(1, item.getName());
            st.setString(2, item.getId());
            st.executeQuery();
            st.close();
            whenreplaced++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return whenreplaced != 0;
    }

    @Override
    public boolean delete(String id) {
        int whendelete = 0;
        try {
            PreparedStatement st = cn.prepareStatement("delete from item where id = ?");
            st.setString(1, id);
            st.executeQuery();
            st.close();
            whendelete++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return whendelete != 0;
    }

    @Override
    public List<Item> findAll() {
        List<Item> res = new ArrayList<>();
        try {
            PreparedStatement st = cn.prepareStatement("select * from item");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                var item = new Item(rs.getString("name"));
                item.setId(rs.getString("id"));
                item.setName(rs.getString("name"));
                res.add(item);
            }
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    @Override
    public List<Item> findByName(String key) {
         List<Item> res = new ArrayList<>();
        try {
            PreparedStatement st = cn.prepareStatement("select * from item where name = ?");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                var item = new Item(rs.getString("name"));
                item.setId(rs.getString("id"));
                item.setName(rs.getString("name"));
                res.add(item);
            }
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return res;
    }

    @Override
    public Item findById(String id) {
        Item item = null;
        try {
            PreparedStatement st = cn.prepareStatement("select * from item where id = ?");
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            item = new Item(rs.getString("name"));
            item.setId(rs.getString("id"));
            item.setName(rs.getString("name"));
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return item;
    }
}

