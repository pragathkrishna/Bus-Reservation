package BusResv;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        BusDAO busdao=new BusDAO();
        busdao.displayBusInfo();
        int userOut=1;
        Scanner scanner= new Scanner(System.in);
        while(userOut==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOut=scanner.nextInt();
            if(userOut==1){
                Booking booking=new Booking();
                if(booking.isAvailable()){
                    BookingDAO bookingDAO=new BookingDAO();
                    bookingDAO.addBooking(booking);
                    System.out.println("Your booking is confirmed!");
                }else{
                    System.out.println("Sorry, Bus is full.Try another bus");
                }
            }
        }
        scanner.close();
    }
}