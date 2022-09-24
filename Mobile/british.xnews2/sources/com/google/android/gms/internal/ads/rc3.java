package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rc3 {
    /* renamed from: a */
    public static qc3 m37020a(String str) throws GeneralSecurityException {
        String str2;
        if (od3.m35640j().containsKey(str)) {
            return od3.m35640j().get(str);
        }
        if (str.length() != 0) {
            str2 = "cannot find key template: ".concat(str);
        } else {
            str2 = new String("cannot find key template: ");
        }
        throw new GeneralSecurityException(str2);
    }
}
