package BusResv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {
    public int getBookedCount(int id, Date date) throws SQLException{
        String query="select count(passenger_name) from booking where bus_no=? and travel_date=?";
        Connection con=DbConnection.getConnection();
        PreparedStatement pst= con.prepareStatement(query);
        java.sql.Date sqldate=new java.sql.Date(date.getTime());
        pst.setInt(1,id);
        pst.setDate(2,sqldate);
        ResultSet rs= pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
    public void addBooking(Booking booking) throws SQLException{
        String query="Insert into booking values(?,?,?)";
        Connection con=DbConnection.getConnection();
        PreparedStatement pst= con.prepareStatement(query);
        java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
        pst.setString(1, booking.passengername);
        pst.setInt(2,booking.busno);
        pst.setDate(3,sqldate);
        pst.executeUpdate();
    }
}
