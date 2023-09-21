package com.example.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class RadioHutTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport
                = t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson()
                        + "-- Buyer: " + t.getBuyerName() + " -- State: "
                        + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());

        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");

        tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .forEach(radioReport);

        // Print out the total number of transactions
        long counter = tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .count();
        System.out.println("Total Transactions: " + counter);

        // Print largest transaction
        System.out.println("=== Radio Hut Largest ===");

        Optional<SalesTxn> MaxTransaction = tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .max(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if(MaxTransaction.isPresent()){
            SalesTxn buyerDetails = (SalesTxn) MaxTransaction.get();
            
            System.out.printf("ID: " + buyerDetails.getTxnId() + "  Seller: " + buyerDetails.getSalesPerson()+ "-- Buyer: " + buyerDetails.getBuyerName() + " -- State: "
                        + buyerDetails.getState() + " -- Amt: $%,9.0f%n", buyerDetails.getTransactionTotal());
        }

        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");
        
        Optional<SalesTxn> MinTransaction = tList.stream()
                .filter(t -> t.getBuyerName().equals("Radio Hut"))
                .min(Comparator.comparing(SalesTxn::getTransactionTotal));
        
        if(MinTransaction.isPresent()){
            SalesTxn buyerDetails = (SalesTxn) MinTransaction.get();
            
            System.out.printf("ID: " + buyerDetails.getTxnId() + "  Seller: " + buyerDetails.getSalesPerson()+ "-- Buyer: " + buyerDetails.getBuyerName() + " -- State: "
                        + buyerDetails.getState() + " -- Amt: $%,9.0f%n", buyerDetails.getTransactionTotal());
        }
        
    }
}
