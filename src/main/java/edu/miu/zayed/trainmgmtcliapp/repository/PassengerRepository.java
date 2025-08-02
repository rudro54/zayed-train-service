package edu.miu.zayed.trainmgmtcliapp.repository;

import edu.miu.zayed.trainmgmtcliapp.model.Passenger;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PassengerRepository {
    private static Passenger[] passengers;
    private static PassengerRepository instance;

    public static synchronized PassengerRepository getInstance() {
        if (instance == null) {
            instance = new PassengerRepository();
        }
        return instance;
    }

    private void loadData() {
        passengers = new Passenger[]{
                // First passenger
                new Passenger(1, "Daniel", "Agar", "(641) 123-0099",
                        LocalDate.of(1987, 3, 21), "Picadilly",
                        LocalDateTime.of(2025, 7, 15, 13, 9, 0)),

                // Second passenger
                new Passenger(2, "Anna", "Smith", "(641) 819-8452",
                        LocalDate.of(2001, 12, 7), "Saints",
                        LocalDateTime.of(1987, 3, 21, 18, 25)),

                // Third passenger
                new Passenger(3, "Mike", "Jonathon", "(555) 987-6543",
                        LocalDate.of(2008, 2, 28), "Fairfield",
                        LocalDateTime.of(2025, 7, 13, 9, 0))
        };
    }

    public Passenger[] getPassengers() {
        if (passengers == null || passengers.length == 0) {
            loadData();
        }
        return passengers;
    }
}