package com.customer.laboratorna2;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private int numberOfCard;
    private double amountOfMoney;
    public Customer(){
    }
    public Customer(int id, String lName, String fName, String mName, String address, int numberOfCard, double amountOfMoney){
        this.id = id;
        this.lastName = lName;
        this.firstName = fName;
        this.middleName = mName;
        this.address = address;
        this.numberOfCard = numberOfCard;
        this.amountOfMoney = amountOfMoney;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String LastName){
        this.lastName = LastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String FirstName){
        this.firstName = FirstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String MiddleName){
        this.middleName = MiddleName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String Address){
        this.address = Address;
    }
    public int getNumberOfCard(){
        return numberOfCard;
    }
    public void setNumberOfCard(int NumberOfCard){
        this.numberOfCard = NumberOfCard;
    }
    public double getAmountOfMoney(){
        return amountOfMoney;
    }
    public void setAmountOfMoney(double AmountOfMoney){
        this.amountOfMoney = AmountOfMoney;
    }
    public String toString(){
        return "The customer: "+ lastName +" "+ firstName +" "+ middleName +" "+id+"\t"+ numberOfCard +"\t"+ amountOfMoney +"$\t"+ address +"\n";
    }
}
