package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class FakeContext implements Context {

    private String awsRequestId;
    private String logGroupName;
    private String logStreamName;
    private String functionName;
    private String functionVersion;
    private String invokedFunctionArn;
    private CognitoIdentity cognitoIdentity;
    private ClientContext clientContext;
    private int remainingTimeInMillis;
    private int memoryLimitInMB;
    private LambdaLogger lambdaLogger;

    @Override
    public String getAwsRequestId() {
        return awsRequestId;
    }

    @Override
    public String getLogGroupName() {
        return logGroupName;
    }

    @Override
    public String getLogStreamName() {
        return logStreamName;
    }

    @Override
    public String getFunctionName() {
        return functionName;
    }

    @Override
    public String getFunctionVersion() {
        return functionVersion;
    }

    @Override
    public String getInvokedFunctionArn() {
        return invokedFunctionArn;
    }

    @Override
    public CognitoIdentity getIdentity() {
        return cognitoIdentity;
    }

    @Override
    public ClientContext getClientContext() {
        return clientContext;
    }

    @Override
    public int getRemainingTimeInMillis() {
        return remainingTimeInMillis;
    }

    @Override
    public int getMemoryLimitInMB() {
        return memoryLimitInMB;
    }

    @Override
    public LambdaLogger getLogger() {
        return lambdaLogger;
    }

    public void setAwsRequestId(String awsRequestId) {
        this.awsRequestId = awsRequestId;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    public void setInvokedFunctionArn(String invokedFunctionArn) {
        this.invokedFunctionArn = invokedFunctionArn;
    }

    public void setIdentity(CognitoIdentity cognitoIdentity) {
        this.cognitoIdentity = cognitoIdentity;
    }

    public void setClientContext(ClientContext clientContext) {
        this.clientContext = clientContext;
    }

    public void setRemainingTimeInMillis(int remainingTimeInMillis) {
        this.remainingTimeInMillis = remainingTimeInMillis;
    }

    public void setMemoryLimitInMB(int memoryLimitInMB) {
        this.memoryLimitInMB = memoryLimitInMB;
    }

    public void setLogger(LambdaLogger lambdaLogger) {
        this.lambdaLogger = lambdaLogger;
    }

}
