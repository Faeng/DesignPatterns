package LabWeek09.TourProgram;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int availableSeat;
    private int reservedSeat;

    public SingleTour(String name, double price, int availableSeat , int reservedSeat){
        this.name = name;
        this.price = price;
        this.availableSeat = availableSeat;
        this.reservedSeat = reservedSeat;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeat() {
        return availableSeat;
    }
}
