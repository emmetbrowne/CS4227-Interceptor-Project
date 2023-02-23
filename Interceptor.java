//  This is where we define a common interface for intercepting and 
//  processing requests and responses between components

public interface Interceptor {

    // This interface allows different interceptor components to be
    // Seamlessly integrated withing a large system

    // This is a method that will be implemented by the concrete interceptor
    // It takes 'ContextObject' as a parameter
    void intercept(ContextObject context);

}