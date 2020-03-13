package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Dmitry Faroyants");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Dmitry Faroyants");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Dmitry Faroyants");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150.0));
        bank.addAccount(user.getPassport(), new Account("112", 50.0));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "112", 150.0);
        assertThat(bank.findByRequisite("3434", "112").getBalance(), is(200.0));
    }

    @Test
    public void transferMoneyThanNot() {
        User user = new User("3434", "Dmitry Faroyants");
        BankService bank = new BankService();
        bank.addUser(user);
        boolean rsl = bank.transferMoney(user.getPassport(), "4040", user.getPassport(), "5050", 150.0);
        assertThat(rsl, is(false));
    }

}
