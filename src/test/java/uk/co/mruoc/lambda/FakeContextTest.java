package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FakeContextTest {

    private final FakeContext context = new FakeContext();

    @Test
    public void shouldSetAwsRequestId() {
        String awsRequestId = "my-request-id";

        context.setAwsRequestId(awsRequestId);

        assertThat(context.getAwsRequestId()).isEqualTo(awsRequestId);
    }

    @Test
    public void shouldSetLogGroupName() {
        String logGroupName = "my-log-group";

        context.setLogGroupName(logGroupName);

        assertThat(context.getLogGroupName()).isEqualTo(logGroupName);
    }

    @Test
    public void shouldSetLogStreamName() {
        String logStreamName = "my-log-stream";

        context.setLogStreamName(logStreamName);

        assertThat(context.getLogStreamName()).isEqualTo(logStreamName);
    }

    @Test
    public void shouldSetFunctionName() {
        String functionName = "my-function";

        context.setFunctionName(functionName);

        assertThat(context.getFunctionName()).isEqualTo(functionName);
    }

    @Test
    public void shouldSetFunctionVersion() {
        String functionVersion = "my-function-version";

        context.setFunctionVersion(functionVersion);

        assertThat(context.getFunctionVersion()).isEqualTo(functionVersion);
    }

    @Test
    public void shouldSetInvokedFunctionArn() {
        String arn = "my-arn";

        context.setInvokedFunctionArn(arn);

        assertThat(context.getInvokedFunctionArn()).isEqualTo(arn);
    }

    @Test
    public void shouldSetIdentity() {
        CognitoIdentity identity = new FakeCognitoIdentity();

        context.setIdentity(identity);

        assertThat(context.getIdentity()).isEqualTo(identity);
    }

    @Test
    public void shouldSetClientContext() {
        ClientContext clientContext = new FakeClientContext();

        context.setClientContext(clientContext);

        assertThat(context.getClientContext()).isEqualTo(clientContext);
    }

    @Test
    public void shouldSetRemainingTimeInMillis() {
        int timeInMillis = 100;

        context.setRemainingTimeInMillis(timeInMillis);

        assertThat(context.getRemainingTimeInMillis()).isEqualTo(timeInMillis);
    }

    @Test
    public void shouldSetMemoryLimitInMBs() {
        int memoryLimitMBs = 1;

        context.setMemoryLimitInMB(memoryLimitMBs);

        assertThat(context.getMemoryLimitInMB()).isEqualTo(memoryLimitMBs);
    }

    @Test
    public void shouldSetLambdaLogger() {
        LambdaLogger logger = new FakeLambdaLogger();

        context.setLogger(logger);

        assertThat(context.getLogger()).isEqualTo(logger);
    }

}
