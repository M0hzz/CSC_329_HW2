package org.example;

public interface PriorityQueue {
    void add(Account a);
    Account getMax();
    void clear();
    int getLength();
    boolean isEmpty();

}
