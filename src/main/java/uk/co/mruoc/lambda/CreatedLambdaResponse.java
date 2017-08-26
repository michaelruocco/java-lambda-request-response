package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_CREATED;

public class CreatedLambdaResponse extends LambdaResponse {

    public CreatedLambdaResponse() {
        setStatusCode(SC_CREATED);
    }

}
