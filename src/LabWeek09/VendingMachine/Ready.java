package LabWeek09.VendingMachine;

import java.util.ArrayList;
import java.util.List;

import static sun.util.calendar.CalendarUtils.mod;

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

    @Override
    public void chooseTheStation(int station) {
        System.out.println("Now you are at "+stations.get(currentStation));
        if(station+currentStation>6){
            station = currentStation - mod(station,6);
            currentStation = 6;

        }
        else {
            currentStation = currentStation+station;

        }
        vendingMachine.totalPrice = stationPrice*station;
        if(vendingMachine.totalPrice<0) vendingMachine.totalPrice = vendingMachine.totalPrice* -1;
        System.out.println("The price is "+ vendingMachine.totalPrice + " Baht to " + stations.get(currentStation)+".");
        vendingMachine.setVendingState(vendingMachine.getEarnedMoney());
    }

    @Override
    public void insertCash(double cash) {
        // no implementation
    }


    @Override
    public void exchangeCash() {
        // no implementation
    }

    @Override
    public void printTicket() {
        // no implementation
    }
}
