// This class is created to represent the context in which the 
// requests and responses are being intercepted and processed 
// by interceptor componenets

import java.util.List;

public class ContextObject {

    // Declare a private field 'rentals' of type List<Rental>
    // Create rentals, of type List<Rental>
    private List<Rental> rentals;

    // Create a constructor that takes List<Rental>
    public ContextObject(List<Rental> rentals) {
        this.rentals = rentals;
    }

    // Getter method for rentals
    public List<Rental> getRentals() {
        return rentals;
    }
}
