package com.guenther.spring2.controller;

/**
 * Created by Grand Circus Student on 8/14/2017.
 */
public class Customer {

    private String customerID;

    private String companyName;

    public Customer(String cid, String cname){
        customerID = "";
        companyName = "";

        customerID = cid;
        companyName = cname;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Customer(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    }

