package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiNotFoundExceptionTest {

    @Test
    public void shouldReturnMessage() {
        String message = "my-error-message";

        Exception exception = new ApiNotFoundException(message);

        assertThat(exception.getMessage()).isEqualTo(message);
    }

}
