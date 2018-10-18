package LabWeek09.VendingMachine;

public interface VendingState {
    void insertCash(double cash);
    //void chooseTheStation(int station); //in parameter is how many stations from the current station to the terminal station.
    void exchangeCash();
    void printTicket();

}
