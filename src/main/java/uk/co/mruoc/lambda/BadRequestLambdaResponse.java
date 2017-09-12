package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_BAD_REQUEST;

public class BadRequestLambdaResponse extends ErrorLambdaResponse {

    public BadRequestLambdaResponse() {
        setStatusCode(SC_BAD_REQUEST);
    }

}
