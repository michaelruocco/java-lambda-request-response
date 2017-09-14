package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_NOT_FOUND;

public class NotFoundLambdaResponse extends ErrorLambdaResponse {

    public NotFoundLambdaResponse() {
        setStatusCode(SC_NOT_FOUND);
    }

    public NotFoundLambdaResponse(String message) {
        setErrorMessage(message);
    }

}
