package edu.miu.zayed.trainmgmtcliapp;

import edu.miu.zayed.trainmgmtcliapp.JSONUtil.JSONUtil;
import edu.miu.zayed.trainmgmtcliapp.model.Passenger;
import edu.miu.zayed.trainmgmtcliapp.repository.PassengerRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrainSchedulingApp {
    public static void main(String[] args) {
        System.out.println("Hello World!\n.Welcome to the Train App");
        var passengers = findPassengersOfAge20orOlder();
        var jsonData  = JSONUtil.convertListToJSON(passengers);
        System.out.println("JSON Data\n "+jsonData);
    }

    private static List<Passenger> findPassengersOfAge20orOlder(){
        var passengers = PassengerRepository.getInstance().getPassengers();
        return Arrays.stream(passengers)
                .filter(p -> p.getAge() >= 20)
                .sorted(Comparator.comparing(Passenger::getFirstName))
                .toList();

    }
}
