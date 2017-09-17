package uk.co.mruoc.lambda;

public class ApiNotFoundException extends RuntimeException {

    public ApiNotFoundException(String message) {
        super(message);
    }

}
