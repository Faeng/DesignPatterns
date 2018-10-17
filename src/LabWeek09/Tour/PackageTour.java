package LabWeek09.Tour;

import java.util.ArrayList;
import java.util.List;


public class PackageTour implements Tour{
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    public PackageTour(String packageName, List<Tour> tours){
        this.packageName = packageName;
        this.tours = tours;
    }

    @Override
    public String getName() {
       return packageName;
    }

    @Override
    public double getPrice() {
       double total = 0;
        for (Tour t: tours) {
           total+= t.getPrice();
        }
        return total*0.9;
    }

    static int max = 0;
    private void getMax(){
        for (Tour t: tours) {
            if(t.getAvailableSeat()>=max){
                max = t.getAvailableSeat();
            }
        }
    }

    @Override
    public int getAvailableSeat() {
        getMax();
        int minSeat = max;
        for (Tour t: tours) {
            if(minSeat>=t.getAvailableSeat()){
                minSeat = t.getAvailableSeat();
            }
        }
        max = 0;
        return minSeat;
    }




}
