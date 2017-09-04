package uk.co.mruoc.lambda;

import com.amazonaws.services.lambda.runtime.CognitoIdentity;

public class FakeCognitoIdentity implements CognitoIdentity {

    private String identityId;
    private String identityPoolId;

    @Override
    public String getIdentityId() {
        return identityId;
    }

    @Override
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

}
