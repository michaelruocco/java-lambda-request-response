package uk.co.mruoc.lambda;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FakeClientTest {

    private final FakeClient client = new FakeClient();

    @Test
    public void shouldSetInstallationId() {
        String id = "my-installation-id";

        client.setInstallationId(id);

        assertThat(client.getInstallationId()).isEqualTo(id);
    }

    @Test
    public void shouldSetAppTitle() {
        String title = "my-app";

        client.setAppTitle(title);

        assertThat(client.getAppTitle()).isEqualTo(title);
    }

    @Test
    public void shouldSetAppVersionName() {
        String versionName = "my-version-name";

        client.setAppVersionName(versionName);

        assertThat(client.getAppVersionName()).isEqualTo(versionName);
    }

    @Test
    public void shouldSetAppVersionCode() {
        String versionCode = "my-version-code";

        client.setAppVersionCode(versionCode);

        assertThat(client.getAppVersionCode()).isEqualTo(versionCode);
    }

    @Test
    public void shouldSetAppPackageName() {
        String packageName = "my-package-name";

        client.setAppPackageName(packageName);

        assertThat(client.getAppPackageName()).isEqualTo(packageName);
    }

}
