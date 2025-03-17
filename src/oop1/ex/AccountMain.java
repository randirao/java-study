package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100000);
        account.withdraw(90000);
        account.withdraw(20000); //오류 메시지 출력
        System.out.println("잔고: " + account.balance);
    }
}
