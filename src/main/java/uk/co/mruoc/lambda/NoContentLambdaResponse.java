package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_NO_CONTENT;

public class NoContentLambdaResponse extends LambdaResponse {

    public NoContentLambdaResponse() {
        setStatusCode(SC_NO_CONTENT);
    }

}
