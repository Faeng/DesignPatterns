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
        stations.add("Mochit");
        stations.add("LadPrao");
        stations.add("Ratchada");
        stations.add("HuiKwang");
        stations.add("Rama9");
        stations.add("Sukumvit");
        stations.add("Klongtoei");
    }

    @Override
    public void chooseTheStation(int station) {
        System.out.print("The Line of train (16 Baht/station) --> ");
        for (String t:stations) {
            System.out.print(t+" ");
        }
        System.out.println();
        System.out.println("Now you are at "+stations.get(currentStation));

        if((station+currentStation)>6){
            station = mod(6-currentStation,6);
            currentStation = 6;
        }
        else if(station+currentStation<0){
            station = mod((0-currentStation)*-1,6);
            currentStation = 0;

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
