package com.example.moboBank.model;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class AccountDetails {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "mobo_sequence"
    )
    @SequenceGenerator(
            name = "mobo_sequence",
            sequenceName = "mobo_sequence",
            allocationSize = 1
    )

    private Long id;

    private String transactionReference;

    private String transactionCode;

    private double amount;

    private String accountName;

    private String phoneNumber;

    private double actualBalance;

    private double availableBalance;

    // Default Constructor
    public AccountDetails() {
    }

    // Parameterised Constructor
    public AccountDetails(Long id, String transactionReference, String transactionCode,
                          double amount, String accountName, String phoneNumber,
                          double actualBalance, double availableBalance) {
        this.id = id;
        this.transactionReference = transactionReference;
        this.transactionCode = transactionCode;
        this.amount = amount;
        this.accountName = accountName;
        this.phoneNumber = phoneNumber;
        this.actualBalance = actualBalance;
        this.availableBalance = availableBalance;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(double actualBalance) {
        this.actualBalance = actualBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
