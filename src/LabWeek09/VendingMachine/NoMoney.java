package LabWeek09.VendingMachine;

public class NoMoney implements VendingState {

    VendingMachine vendingMachine;

    public NoMoney(VendingMachine newVendingMachine) {
        vendingMachine = newVendingMachine;
    }

    @Override
    public void insertCash(double cash) {
        System.out.println("You insert cash: "+cash+" baht.");
        vendingMachine.setVendingState(vendingMachine.getEarnedMoney()); //changed state to earned cash
    }


    @Override
    public void exchangeCash() {

    }

    @Override
    public void printTicket() {

    }
}
