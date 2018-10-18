package LabWeek09.VendingMachine;

public class EarnMoney implements VendingState {
    VendingMachine vendingMachine;


    public EarnMoney(VendingMachine newVendingMachine) {
        vendingMachine = newVendingMachine;
    }

    @Override
    public void insertCash(double cash) {
        if (cash>=vendingMachine.totalPrice){
            System.out.println("Insert cash "+ cash + " baht.");
            vendingMachine.exchangeMoney = cash - vendingMachine.getTotalPrice();
            vendingMachine.setVendingState(vendingMachine.getEarnedMoney());
        }else{
            System.out.println("You have no enough cash");
            vendingMachine.setVendingState(vendingMachine.getFinish());
        }
    }

    @Override
    public void exchangeCash() {
        double exchange = vendingMachine.getExchangeMoney();
        System.out.println("Exchange : "+ exchange+" Baht.");
        vendingMachine.setExchangeMoney(0);
        vendingMachine.setVendingState(vendingMachine.getFinish());
    }

    @Override
    public void printTicket() {
        //no implementation
    }

    @Override
    public void chooseTheStation(int station) {
        //no implementation
    }
}
