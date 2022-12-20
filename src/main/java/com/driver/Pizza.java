package com.driver;

public class Pizza {

    private int price;    // calculating final bill price
    private boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded= false;
        this.isTakeAwayAdded= false;
        this.isToppingsAdded=false;

        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg== true){
            this.price = 300;
            this.toppingsPrice=70;
        }
        else {
            this.price =400;
            this.toppingsPrice= 120;

        }



        this.bill = "Base Price Of The Pizza: "+ this.price+ "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(isCheeseAdded==false){
            // if false then we add cheesetrpice first time
            this.price= this.price+this.cheesePrice;
            this.isCheeseAdded=true;
        }

        // your code goes here
    }

    public void addExtraToppings(){

        if(isToppingsAdded==false){
            this.price =this.price+toppingsPrice;
            isToppingsAdded=true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(isTakeAwayAdded==false){
            this.price= this.price+takeAwayPrice;
            isTakeAwayAdded=true;
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated == false){

            if(isCheeseAdded== true){
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice +"\n";

            }
            if(isToppingsAdded== true){
                this.bill = this.bill + "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if(isTakeAwayAdded== true){
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice +"\n";
            }

            this.bill = this.bill +"Total Price: "+ this.price +"\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}
