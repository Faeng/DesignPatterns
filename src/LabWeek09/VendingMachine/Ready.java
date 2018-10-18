package LabWeek09.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Ready implements VendingState {
    double stationPrice = 16; //กำหนดให้แต่ละสถานีที่ห่างกันมีค่าโดยสารสถานีละ 16 บาท
    int currentStation = 0;
    List<String> stations = new ArrayList<String>();
    VendingMachine vendingMachine;

    public Ready(VendingMachine newVendingMachine,int currentStation){
        vendingMachine = newVendingMachine;
        this.currentStation = currentStation;
        stations.add("Mochit station");
        stations.add("LadPrao station");
        stations.add("Ratchada station");
        stations.add("HuiKwang station");
        stations.add("Rama9 station");
        stations.add("Sukumvit station");
        stations.add("Klongtoei station");
    }

    public void chooseTheStation(int station) {
        if(station+currentStation>6){
            currentStation = 6;
            station = station-currentStation;
        }
        System.out.println("Now you are at "+stations.get(currentStation));
        vendingMachine.totalPrice = stationPrice*station;
        System.out.println("The price is "+ vendingMachine.totalPrice + " Baht.");
    }

    @Override
    public void insertCash(double cash) {
        if (cash>=vendingMachine.totalPrice){
            System.out.println("Insert cash "+ cash + " baht.");
            vendingMachine.exchangeMoney = vendingMachine.totalPrice-cash;
            vendingMachine.setVendingState(vendingMachine.getEarnedMoney());
        }else{
            System.out.println("You have no enough cash");
            vendingMachine.setVendingState(vendingMachine.getNoMoney());
        }
    }


    @Override
    public void exchangeCash() {

    }

    @Override
    public void printTicket() {
        // no implementation
    }
}
