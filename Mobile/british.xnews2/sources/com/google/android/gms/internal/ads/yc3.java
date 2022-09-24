package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yc3 {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<xc3> f41786a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static xc3 m39855a(String str) throws GeneralSecurityException {
        Iterator<xc3> it = f41786a.iterator();
        while (it.hasNext()) {
            xc3 next = it.next();
            if (next.zza()) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
