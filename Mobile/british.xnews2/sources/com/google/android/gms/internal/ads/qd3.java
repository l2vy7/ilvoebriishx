package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qd3 {

    /* renamed from: a */
    public static final String f37988a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f37989b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final il3 f37990c;
    @Deprecated

    /* renamed from: d */
    public static final il3 f37991d;
    @Deprecated

    /* renamed from: e */
    public static final il3 f37992e;

    static {
        new wd3();
        new fe3();
        new ie3();
        new ce3();
        new qe3();
        new ue3();
        new le3();
        new xe3();
        il3 F = il3.m33245F();
        f37990c = F;
        f37991d = F;
        f37992e = F;
        try {
            m36438a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m36438a() throws GeneralSecurityException {
        od3.m35644n(new td3());
        dg3.m31395a();
        od3.m35643m(new wd3(), true);
        od3.m35643m(new fe3(), true);
        if (!bf3.m30694b()) {
            od3.m35643m(new ce3(), true);
            ie3.m33208k(true);
            od3.m35643m(new le3(), true);
            od3.m35643m(new qe3(), true);
            od3.m35643m(new ue3(), true);
            od3.m35643m(new xe3(), true);
        }
    }
}
