package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ContractServiceImpl implements ContractService {
    private static Queue<Contract>contractQueue = new ArrayDeque<>();
//    private static Queue<Contract>contractQueue = new LinkedList<>();

    @Override
    public void creatNewContract() {
    Queue<Booking> bookingQueue = BookingServiceImpl.changeSetToQueue();
    for(Booking booking : bookingQueue) {
//        for(Contract contract : )
    }
    }
}
