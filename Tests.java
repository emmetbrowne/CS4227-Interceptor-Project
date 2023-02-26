public class Tests {
    public static void main(String[] args) {
        // Create three movie objects with different titles and rental types
        Movie movie1 = new Movie("Pacman the movie", Movie.CHILDREN);
        Movie movie2 = new Movie("Spiderman", Movie.REGULAR);
        Movie movie3 = new Movie("Avatar 2", Movie.NEW_RELEASE);

        // Create three rental objects with different movies and rental periods
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 3);

        // Create a new customer object with the name "Emmet Browne"
        Customer customer = new Customer("Emmet Browne");

        // Add the rental objects to the customer object
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // // Create a ContextObject instance with the rentals
        // List<Rental> rentals = Arrays.asList(rental1, rental2, rental3);
        // ContextObject context = new ContextObject(rentals);

        // // Create a new Dispatcher instance
        // Dispatcher dispatcher = new Dispatcher();

        // // Register the ConcreteInterceptor with the Dispatcher
        // Interceptor interceptor = new ConcreteInterceptor();
        // dispatcher.registerInterceptor(interceptor);

        // // Dispatch the ContextObject to all registered Interceptors
        // dispatcher.dispatch(context);

        // Create a string representing the expected output of the statement method of
        // the customer object
        String expected = "Rental record for Emmet Browne\n" +
                "\tPacman the movie\t1.5\n" +
                "\tSpiderman\t2.0\n" +
                "\tAvatar 2\t15.0\n" +
                "Amount owed is 19.50\n" +
                "You earned 5 frequent renter points";

        // Get the actual output of the statement method of the customer object
        String actual = customer.statement();

        // Check if the expected and actual strings are equal
        if (expected.equals(actual)) {
            System.out.println("Test passed");
        } else {
            // Print a message and the expected and actual strings if they are not equal
            System.out.println("Test failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
}