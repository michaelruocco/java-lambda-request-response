package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class FakeLambdaLogger implements LambdaLogger {

    public String lastLoggedString;

    @Override
    public void log(String message) {
        this.lastLoggedString = message;
    }

    public String getLastLoggedMessage() {
        return lastLoggedString;
    }

}
