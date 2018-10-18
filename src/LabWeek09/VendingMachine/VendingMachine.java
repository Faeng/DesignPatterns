package LabWeek09.VendingMachine;

public class VendingMachine {
    double totalPrice = 0;
    static double exchangeMoney = 0;
    VendingState ready;
    VendingState noMoney;
    VendingState earnedMoney;

    VendingState problem;

    VendingState vendingState;

    public VendingMachine(){
        noMoney = new NoMoney(this);
        ready = new Ready(this);
        earnedMoney = new EarnedMoney(this);
       // problem = new Problem(this);

        vendingState = ready;
    }

    public void setVendingState(VendingState newVendingState){
        vendingState = newVendingState;
    }
    public VendingState getReady(){return ready;}
    public VendingState getNoMoney(){return noMoney;}
    public VendingState getEarnedMoney(){ return earnedMoney;}
    public VendingState getProblem(){ return problem;}

    public double getTotalPrice(){
        return totalPrice;
    }

}
