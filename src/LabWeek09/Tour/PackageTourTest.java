package LabWeek09.Tour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {
    Tour taladNamTour;
    Tour watPrakaewTour;
    List<Tour> tourList = new ArrayList<Tour>();
    Tour bangkokPackageTour;

    @BeforeEach
    void init() {
        taladNamTour = new SingleTour("Talad Nam", 1500, 10, 0);
        watPrakaewTour = new SingleTour("Wat Pra Kaew", 1200, 12, 0);
        tourList.add(taladNamTour);
        tourList.add(watPrakaewTour);
        bangkokPackageTour = new PackageTour("Bangkok Tour",tourList);
    }

    @Test
    public void testingPackageTourName(){
        assertEquals("Bangkok Tour",bangkokPackageTour.getName());
    }

   @Test
   public void testingPackageTourPrice(){
        assertEquals(2430,bangkokPackageTour.getPrice());
   }

   @Test
    public void testingPackageTourAvailableSeat(){
        assertEquals(10,bangkokPackageTour.getAvailableSeat());
   }
}