package training.iqgatway;

import javax.jws.WebService;

@WebService
public class AirlineReservation {
    public String fromCity(String cityName){
        return "Moving from "+cityName;
    }
    public String destination(String cityName){
        return "Destination is "+cityName;
    }
    public String selectSeatNo(String SeatNo){
        return "Seat Number is "+SeatNo;
    }
    public boolean cancelReservation(boolean cancel){
        return cancel;
    }
}
