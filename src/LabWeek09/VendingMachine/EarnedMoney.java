package LabWeek09.VendingMachine;

public class EarnedMoney implements VendingState {
    VendingMachine vendingMachine;


    public EarnedMoney(VendingMachine newVendingMachine) {
        vendingMachine = newVendingMachine;
    }

    @Override
    public void insertCash(double cash) {
        System.out.println("You have enough money.");
    }

    @Override
    public void exchangeCash() {

    }

    @Override
    public void printTicket() {

    }
}
