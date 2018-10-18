package LabWeek09.VendingMachine;

public class Finish implements VendingState {

    VendingMachine vendingMachine;
    public Finish(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCash(double cash) {
        //no implementation
    }

    @Override
    public void exchangeCash() {
        //no implementation
    }

    @Override
    public void printTicket() {
        System.out.println("Here is you ticket.");
        System.out.println("----------------------------------");
        System.out.println();
        vendingMachine.setVendingState(vendingMachine.getReady());
        vendingMachine.setTotalPrice(0);
        vendingMachine.setExchangeMoney(0);
    }

    @Override
    public void chooseTheStation(int station) {
        System.out.println("can't choose the station right now.");
    }
}
