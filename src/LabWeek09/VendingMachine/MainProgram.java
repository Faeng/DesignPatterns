package LabWeek09.VendingMachine;

public class MainProgram {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.chooseTheStation(2);
        vendingMachine.insertCash(500);
        vendingMachine.exchangeCash();
        vendingMachine.printTicket();

        vendingMachine.chooseTheStation(-2); //going back to Mochit Station.
        vendingMachine.insertCash(40);
        vendingMachine.exchangeCash();
        vendingMachine.printTicket();

    }
}
