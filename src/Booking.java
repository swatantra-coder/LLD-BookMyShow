import java.util.List;

public class Booking {
    Show show;
    List<Seat> bookedSeats;
    Payment payment;

    public Booking(Show show, List<Seat> bookedSeats, Payment payment) {
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.payment = payment;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }



}
