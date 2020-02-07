package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user.getPassport())) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> ac  = users.get(user);
        if (!ac.contains(account)) {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        for (User pas : users.keySet()) {
            if (pas.getPassport().equals(passport)) {
                return pas;
            }
        }
        return  null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> ac  = users.get(user);
        for (Account acc : ac) {
            if (acc.getRequisite().equals(requisite)) {
                return acc;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcaccount = findByRequisite(srcPassport, srcRequisite);
        Account destaccount = findByRequisite(destPassport, destRequisite);
        if (srcaccount.getBalance() < amount || srcaccount == null || destaccount == null) {
            return false;
        }
        destaccount.setBalance(destaccount.getBalance() + amount);
        return true;
    }
}