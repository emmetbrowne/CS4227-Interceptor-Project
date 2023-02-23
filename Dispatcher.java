// This class is used to co-ordinate and dispatch requests and responses
// to different interceptor components, allowing for different interceptors
// to interact and modify the context object as needed

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    // Create a list of interceptors
    private List<Interceptor> interceptors = new ArrayList<>();

    // Register an interceptor to this list
    public void registerInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    // Dispatch the context to the interceptors
    public void dispatch(ContextObject context) {

        for (Interceptor interceptor : interceptors) {

            // Intercept this context object
            interceptor.intercept(context);
        }
    }
}