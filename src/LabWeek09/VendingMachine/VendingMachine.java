package LabWeek09.VendingMachine;

public class VendingMachine {
    double totalPrice = 0;
    static double exchangeMoney = 0;
    VendingState ready;
    VendingState noMoney;
    VendingState earnedMoney;
    VendingState finish;
    VendingState vendingState;

    public VendingMachine(){
        ready = new Ready(this,0); //current station for the beginning at Mochit station.
        earnedMoney = new EarnMoney(this);
        finish = new Finish(this);
        vendingState = ready;
    }

    public void setVendingState(VendingState newVendingState){
        vendingState = newVendingState;
    }
    public VendingState getReady(){return ready;}
    //public VendingState getNoMoney(){return noMoney;}
    public VendingState getEarnedMoney(){ return earnedMoney;}
    public VendingState getFinish(){ return finish;}

    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }
    public double getExchangeMoney(){
        return exchangeMoney;
    }
    public void setExchangeMoney(double n){
        exchangeMoney = n;
    }
    public void chooseTheStation(int station){
        vendingState.chooseTheStation(station);
    }


    public void insertCash(double cash) {
        vendingState.insertCash(cash);
    }

    public void exchangeCash() {
        vendingState.exchangeCash();
    }

    public void printTicket() {
        vendingState.printTicket();
    }
}
