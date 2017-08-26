package uk.co.mruoc.lambda;

import static org.apache.http.HttpStatus.SC_NO_CONTENT;

public class NotContentLambdaResponse extends LambdaResponse {

    public NotContentLambdaResponse() {
        setStatusCode(SC_NO_CONTENT);
    }

}
