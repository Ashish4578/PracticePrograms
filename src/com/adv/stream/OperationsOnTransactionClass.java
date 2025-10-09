package com.adv.stream;

import java.util.Arrays;
import java.util.List;

public class OperationsOnTransactionClass {

    //    Calculate the net balance (Total Deposits - Total Withdrawals) from a list of transactions,
//    but only include transactions that have an amount of $50.00 or more.
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 150.00, Transaction.Type.DEPOSIT),
                new Transaction(2, 40.00, Transaction.Type.WITHDRAWAL), // Should be filtered out
                new Transaction(3, 300.00, Transaction.Type.DEPOSIT),
                new Transaction(4, 75.00, Transaction.Type.WITHDRAWAL),
                new Transaction(5, 50.00, Transaction.Type.DEPOSIT) // Should be included
        );
        double netBalance = transactions.stream()
                .filter(t -> t.getAmount() >= 50)
                .mapToDouble(t -> {
                            if (t.getType() == Transaction.Type.WITHDRAWAL) {
                                return -t.getAmount();
                            }
                            return t.getAmount();
                        }
                ).sum();
        System.out.println(netBalance);
    }
}





