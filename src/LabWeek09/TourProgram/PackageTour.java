package LabWeek09.TourProgram;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour{
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    @Override
    public String getName() {
       return packageName;
    }

    @Override
    public Double getPrice() {
       double total = 0;
        for (Tour t: tours) {
           total+= t.getPrice();
        }
        return total*0.9;
    }

    @Override
    public int getAvailableSeat() {
        return 0;
    }
}
