// This concrete interceptor class is intercepting a context object
// that contains a list of 'Rental' objects

public class ConcreteInterceptor implements Interceptor {

    // We are implementing the Interceptor interface
    // However, here we want to override the 'intercept()' method

    @Override
    public void intercept(ContextObject context) {

        // Iterate over the list of Rental Objects in the context object
        // We get all of the rental objects in this context object

        for (Rental rental : context.getRentals()) {

            // Check if the number of days for this rental object is more than 7

            if (rental.getDaysRented() > 7) {

                // We set the price code of the movie object to NEW_RELEASE

                rental.getMovie().setPriceCode(Movie.NEW_RELEASE);
            }
        }
    }
}
