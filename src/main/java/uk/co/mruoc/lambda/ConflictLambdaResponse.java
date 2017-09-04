package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_CONFLICT;

public class ConflictLambdaResponse extends ErrorLambdaResponse {

    public ConflictLambdaResponse() {
        setStatusCode(SC_CONFLICT);
    }

}
