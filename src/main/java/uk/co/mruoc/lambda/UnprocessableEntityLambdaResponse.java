package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_UNPROCESSABLE_ENTITY;

public class UnprocessableEntityLambdaResponse extends ErrorLambdaResponse {

    public UnprocessableEntityLambdaResponse() {
        setStatusCode(SC_UNPROCESSABLE_ENTITY);
    }

    public UnprocessableEntityLambdaResponse(String message) {
        setErrorMessage(message);
    }

}
