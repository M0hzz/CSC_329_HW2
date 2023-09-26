package org.example;

public class Account extends PQList {
    private String name;
    private double balance;

    //default constructor
    public Account(){
        this.setName(" ");
        this.setBalance(0.0);
    }

    //parametric constructor
    public Account(String nameOriginal, Double balanceOriginal) {
        this.name = nameOriginal;
        this.balance = balanceOriginal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //copy constructor
    public Account(Account x){
        this.name = x.getName();
        this.balance = x.getBalance();
    }

    //deep constructor
    public Account deepCopy(){
        String nameOriginal = this.name;
        Double balanceOriginal = this.balance;
        return new Account(nameOriginal, balanceOriginal);
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass() != obj.getClass()){
            return false;
        }
        if(this.getName() != ((Account)obj).getName()){
            return false;
        }
        return true;
    }

    
}
