package LabWeek09.TourProgram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class SingleTourTest {
    Tour taladNamTour;
    Tour watPrakaewTour;

    @BeforeEach void init() {
        taladNamTour = new SingleTour("Talad Nam", 1500, 10, 0);
        watPrakaewTour = new SingleTour("Wat Pra Kaew", 1200, 12, 0);
    }

    @Test
    public void testingTourName(){
        assertEquals("Talad Nam",taladNamTour.getName());
        assertEquals("Wat Pra Kaew", watPrakaewTour.getName());
    }

    @Test
    public void testingTourPrice(){
        assertEquals(Double.valueOf(1500), taladNamTour.getPrice());
        assertEquals(Double.valueOf(1200),watPrakaewTour.getPrice());
    }

    @Test
    public void testingTourAvailableSeats(){
        assertEquals(10,taladNamTour.getAvailableSeat());
        assertEquals(12,watPrakaewTour.getAvailableSeat());
    }

}