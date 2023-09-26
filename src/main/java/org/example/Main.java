package org.example;

public class Main {
    public static void main(String[] args) {
        PQList x = new PQList();

        Account test = new Account();
        test.setName("Lo");
        test.setBalance(123.12);
        x.add(test);



        Account test2 = new Account();
        test2.setName("Blo");
        test2.setBalance(12212.1);
        x.add(test2);

        Account test3 = new Account();
        test3.setName("Dio");
        test3.setBalance(1.1);
        x.add(test3);

        Account test4 = new Account();
        test4.setName("Pio");
        test4.setBalance(19.1);
        x.add(test4);

//        Account test5 = new Account();
//        test5.setName("Leo");
//        test5.setBalance(2);
//        x.add(test5);

        System.out.println(test.equals(test2));

        x.printList();


    }
}