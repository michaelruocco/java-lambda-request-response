package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

public class CreatedLambdaResponse extends LambdaResponse {

    public CreatedLambdaResponse() {
        setStatusCode(SC_CREATED);
    }

    public CreatedLambdaResponse(String body) {
        super(SC_OK, body);
    }

}
