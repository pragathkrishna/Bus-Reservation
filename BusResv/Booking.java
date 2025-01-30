package BusResv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengername;
    int busno;
    Date date;
    Booking(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name of the passenger : ");
        passengername = scanner.next();
        System.out.println("Enter  busno :");
        busno=scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput= scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable() throws SQLException {
        BusDAO busdao=new BusDAO();
        int capacity=busdao.getCapacity(busno);
        BookingDAO bookingDAO=new BookingDAO();
        int booked=bookingDAO.getBookedCount(busno,date);
        return booked<capacity?true:false;
    }
}
