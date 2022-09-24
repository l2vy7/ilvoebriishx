package com.startapp.sdk.omsdk;

import com.startapp.C5010hb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: Sta */
public class AdVerification implements Serializable {
    private static final long serialVersionUID = 1;
    @C5010hb(name = "adVerifications", type = VerificationDetails.class)
    private VerificationDetails[] adVerification;

    public AdVerification() {
    }

    /* renamed from: a */
    public List<VerificationDetails> mo46490a() {
        VerificationDetails[] verificationDetailsArr = this.adVerification;
        if (verificationDetailsArr == null) {
            return null;
        }
        return Arrays.asList(verificationDetailsArr);
    }

    public AdVerification(VerificationDetails[] verificationDetailsArr) {
        this.adVerification = verificationDetailsArr;
    }
}
