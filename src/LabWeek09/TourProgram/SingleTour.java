package LabWeek09.TourProgram;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeat;
    private int reservedSeat;

    public SingleTour(String name, double price, int allSeats, int reservedSeat){
        this.name = name;
        this.price = price;
        this.allSeat = allSeats;
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
        return allSeat-reservedSeat;
    }
}
