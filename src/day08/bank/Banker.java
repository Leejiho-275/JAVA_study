package day08.bank;

public class Banker {

    String name;

    public Banker(String n) {
        name = n;
    }

    //    계좌 개설 기능
    Account makeAccount(Paper paper) {
        Account acc = new Account();
        acc.accNum = "111-2222-333444";
        acc.balance = 0;
        acc.owner = paper.userName;
        acc.password = paper.userPw;

        return acc;
    }

}
