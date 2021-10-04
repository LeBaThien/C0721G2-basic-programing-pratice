package case_study.services;

import case_study.models.*;

import java.util.*;
import java.util.stream.Collectors;

public class ContractServiceImpl implements ContractService {
    private static Scanner scanner = new Scanner(System.in);
    private static Queue<Contract> contractQueue = new ArrayDeque<>();
    //    private static Queue<Contract>contractQueue = new LinkedList<>();
    private static Queue<Booking> bookingQueue = BookingServiceImpl.changeSetToQueue();

    @Override
    public void add() {
        Queue<Booking> bookingQueue = BookingServiceImpl.changeSetToQueue();
        for (Booking booking : bookingQueue) {
            System.out.println(booking);//hiển các booking cần phải tạo hợp đồng theo yêu cầu,
            if (booking.getFacility() instanceof Villa) {
                System.out.print("Enter the contract id: ");
                int idContract = scanner.nextInt();
                System.out.print("Enter the deposit Advance: ");
                double depositAdvance = scanner.nextDouble();
                System.out.print("Enter the total payment: ");
                double totalPayment = scanner.nextDouble();
                Contract contract = new Contract(idContract, depositAdvance, totalPayment, booking);
                contractQueue.add(contract);
            } else if (booking.getFacility() instanceof House) {
                System.out.print("Enter the contract id: ");
                int idContract = scanner.nextInt();
                System.out.print("Enter the deposit Advance: ");
                double depositAdvance = scanner.nextDouble();
                System.out.print("Enter the total payment: ");
                double totalPayment = scanner.nextDouble();
                Contract contract = new Contract(idContract, depositAdvance, totalPayment, booking);
                contractQueue.add(contract);
            }

        }
    }
    

    @Override
    public void edit() {
        int idContract = scanner.nextInt();
        for(Contract contract : contractQueue){
            if(contract.getIdContract() == idContract){
                while (true){
                    System.out.println("Enter number you want to edit\n"
                            +"1. Edit id\n"
                            +"2. Edit deposit advanced\n"
                            +"3. Edit total payment\n"
                            +"4. Exit edit\n");
                    int selection = scanner.nextInt();
                    switch(selection){
                        case 1: {
                            System.out.print("Enter the new id contract: ");
                            int idContract1 = scanner.nextInt();
                            contract.setIdContract(idContract1);
                            break;
                        }
                        case 2: {
                            System.out.print("Enter the new deposit advanced: ");
                            double depositAdvanced1 = scanner.nextDouble();
                            contract.setDepositAdvance(depositAdvanced1);
                            break;
                        }
                        case 3: {
                            System.out.print("Enter the new total payment: ");
                            double totalPayment = scanner.nextDouble();
                            contract.setTotalPayment(totalPayment);
                            break;
                        }
                        case 4: {
                            return;
                        }
                        default:{
                            System.out.println("Please check your number!!!");
                        }
                    }
                }
            }
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for(Contract contract : contractQueue){
            System.out.println(contract);
        }
    }
}
