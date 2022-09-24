package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axg */
/* compiled from: IMASDK */
public final class axg {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<axf> f15872a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static axf m15108a(String str) throws GeneralSecurityException {
        Iterator<axf> it = f15872a.iterator();
        while (it.hasNext()) {
            axf next = it.next();
            if (next.mo14745a()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
