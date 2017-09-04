package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.Client;

public class FakeClient implements Client {

    private String installationId;
    private String appTitle;
    private String appVersionName;
    private String appVersionCode;
    private String appPackageName;

    @Override
    public String getInstallationId() {
        return installationId;
    }

    @Override
    public String getAppTitle() {
        return appTitle;
    }

    @Override
    public String getAppVersionName() {
        return appVersionName;
    }

    @Override
    public String getAppVersionCode() {
        return appVersionCode;
    }

    @Override
    public String getAppPackageName() {
        return appPackageName;
    }

    public void setInstallationId(String installationId) {
        this.installationId = installationId;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
    }

    public void setAppVersionCode(String appVersionCode) {
        this.appVersionCode = appVersionCode;
    }

    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

}
