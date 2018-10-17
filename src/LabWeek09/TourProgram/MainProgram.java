package LabWeek09.TourProgram;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        Tour taladNamTour = new SingleTour("Talad Nam",1500,10,0);
        Tour watPraKaew = new SingleTour("Wat Pra Kaew",1200,12,0);

        List<Tour> tours = new ArrayList<Tour>();
        tours.add(taladNamTour);
        tours.add(watPraKaew);

        Tour tourPackage = new PackageTour("BangkokTour",tours);

        System.out.println("Single Tour 1 ->>" +" Name: "+ taladNamTour.getName() + ". Price: "
                + taladNamTour.getPrice()+" baht. Available Seat:"+taladNamTour.getAvailableSeat() +" seats.");
        System.out.println("Single Tour 2 ->>" +" Name: "+ watPraKaew.getName() + ". Price: "
                + watPraKaew.getPrice()+" baht. Available Seat:"+watPraKaew.getAvailableSeat() +" seats.");
        System.out.println();
        System.out.println("The package tour: "+" Name: "+ tourPackage.getName()+". Price: "+tourPackage.getPrice()+
                " baht. Available Seat: "+tourPackage.getAvailableSeat()+" seats.");
    }
}
