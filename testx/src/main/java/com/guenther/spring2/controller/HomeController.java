package com.guenther.spring2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@Controller
public class HomeController {

    //This is called DAO
    @RequestMapping(value = "getAllCustomers")
    public ModelAndView getAllCustomers() {
//define data for thr connection
        String dbAddress = "jdbc:mysql://localhost:3306/northwind";
        String username = "root";
        String password = "LetMeIn";
        // load driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //

            //create the .db connection object
            Connection mysqlConnection;
            mysqlConnection = DriverManager.getConnection(dbAddress, username, password);

            //create db statement

            String readCustomersCommand = "select customerId, companyname from customers";

            Statement readCustomers = mysqlConnection.createStatement();// creates the statement

            ResultSet results = readCustomers.executeQuery(readCustomersCommand);//executes the statement
            ArrayList<Customer> customerList = new ArrayList<Customer>();

            //map from the ResultSet to the ArrayList
            while (results.next()) {
                Customer temp = new Customer(results.getString(1), results.getString(2));
                customerList.add(temp);
            }

            return new ModelAndView("customerView", "cList", customerList);

            //array list of customers


        } catch (Exception ex) {
            ex.printStackTrace();
        }
return null; // todo: create an error page with custom error messages !!!!
    }



    @RequestMapping("/")
    public ModelAndView helloWorld()
    {
        ModelAndView mv = new
                ModelAndView("welcome");
        mv.addObject("message","Welcome to Grand Circus Coffee Shop!!!");
        mv.addObject("bob", "This is another string");
        mv.addObject("title", "Welcome to Grand Circus Coffee Shop!!!");
        return mv;
    }

    @RequestMapping("/userform")
    public ModelAndView userform () {
        return new ModelAndView("form", "inst",
                "Please enter info: ");
    }

    @RequestMapping("/formhandler")
    public ModelAndView formhandler (
            @RequestParam("name") String name,
            @RequestParam("email") String email
    ) {

        //here's where the magic happens

        ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("email", email);
        return mv;
    }
}