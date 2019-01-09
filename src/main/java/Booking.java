public class Booking {

    private Bedroom bedroom;
    private double numberOfNights;

    public Booking(Bedroom bedroom, double numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }


    public Bedroom getBedroom() {
        return this.bedroom;
    }


    public double getNumberOfNights() {
        return numberOfNights;
    }

    public double calculateBookingPrice(){
        double duration = numberOfNights;
        Bedroom thisBedroom = bedroom;
        double price = thisBedroom.getNightlyRate();
        return (duration * price);
    }

}
