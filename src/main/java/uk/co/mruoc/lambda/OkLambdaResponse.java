package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.*;
import static org.apache.http.HttpStatus.SC_OK;

public class OkLambdaResponse extends LambdaResponse {

    public OkLambdaResponse() {
        setStatusCode(SC_OK);
    }

}
