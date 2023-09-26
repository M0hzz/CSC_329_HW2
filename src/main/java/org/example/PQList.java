package org.example;
class Node {
    private String name;
    private double data;
    public Node next;

    public Node(String name, double data) {
        this.setName(name);
        this.setData(data);
        this.next = null;
    }

    public Node(){
        this.setName(" ");
        this.setData(0);
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
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
        return this.head.getData();
    }

    //Copy Constructor
    public PQList(PQList x){
        this.head = null;
        this.tail = x.tail;
        Node temp = head;
        Account a = new Account(temp.getName(), temp.getData());
        while(temp != null){
            this.add(a);
            temp = temp.next;
        }

    }

    public void add(Account acc) {
        String y = acc.getName();
        double x = acc.getBalance();
        Node newNode = new Node(y, x);
        if (head == null || x >= head.getData()) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse the list to find the appropriate position for the new node
        Node current = head;
        Node prev = null;
        while (current != null && current.getData() > x) {
            prev = current;
            current = current.next;
        }

        // Insert the new node at the correct position
        newNode.next = current;
        if (prev != null) {
            prev.next = newNode;
        } else {
            head = newNode;
        }

    }



    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getName() + " " + temp.getData());
            temp = temp.next;
        }
    }
}