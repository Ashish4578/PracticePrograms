package com.adv.stream;

import java.util.List;
import java.util.Arrays;

class Transaction {
    enum Type { DEPOSIT, WITHDRAWAL }
    private int id;
    private double amount;
    private Type type;

    public Transaction(int id, double amount, Type type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    // Getters for use in the stream
    public double getAmount() { return amount; }
    public Type getType() { return type; }

    public int getId() { return id; }

}