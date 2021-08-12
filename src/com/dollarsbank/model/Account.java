package com.dollarsbank.model;

import java.util.List;

public class Account {

    private static long idCountStart = 1;

    private long user_id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String address;
    private String password;
    private double checkings;
    private double savings;
    private List<String> transaction_history;

    public Account(String first_name, String last_name, String phone_number, String password, String address, double checkings, double savings) {
        super();
        this.user_id = idCountStart++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.address = address;
        this.password = password;
        this.checkings = checkings;
        this.savings = savings;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCheckings() {
        return checkings;
    }

    public void setCheckings(double checkings) {
        this.checkings = checkings;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public List<String> getTransaction_history() {
        return transaction_history;
    }

    public void setTransaction_history(List<String> transaction_history) {
        this.transaction_history = transaction_history;
    }

    public void addTransactionHistory(String str){
        transaction_history.add(str);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //TODO: Modify this to represent account better
    @Override
    public String toString() {
        return "Account{" +
                "user_id=" + user_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", checkings=" + checkings +
                ", savings=" + savings +
                ", transaction_history=" + transaction_history +
                '}';
    }
}
