package org.example;
class Node {
    public String name;
    public double data;
    public Node next;

    public Node(String name, double data) {
        this.name = name;
        this.data = data;
        this.next = null;
    }

    public Node(){
        this.name = " ";
        this.data = 0;
        this.next = null;
    }
}
public class PQList {
    private Node head;
    private Node tail;

    //Default Constructor
    public PQList() {
        head = null;
        tail = null;
    }

    public double getBalance(){
        return this.head.data;
    }

    //Copy Constructor
    public PQList(PQList x){
        this.head = null;
        this.tail = x.tail;
        Node temp = head;
        Account a = new Account(temp.name, temp.data);
        while(temp != null){
            this.add(a);
            temp = temp.next;
        }

    }

    public void add(Account acc) {
        String y = acc.getName();
        double x = acc.getBalance();
        Node newNode = new Node(y, x);
        Node temp1 = new Node;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            temp1 = head;
            if (x < this.getBalance() && tail.next != null) {
                temp1.next = newNode;
            }
            else {
                Node temp = new Node();
                temp = head;
                this.head = newNode;
                head.next = temp;
            }
        }

    }



    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.name + " " + temp.data);
            temp = temp.next;
        }
    }
}