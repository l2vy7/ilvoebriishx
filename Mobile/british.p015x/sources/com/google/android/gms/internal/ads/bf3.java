package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bf3 {

    /* renamed from: a */
    private static final Logger f29995a = Logger.getLogger(bf3.class.getName());

    /* renamed from: b */
    private static final AtomicBoolean f29996b = new AtomicBoolean(false);

    private bf3() {
    }

    /* renamed from: a */
    static Boolean m30693a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            f29995a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m30694b() {
        return f29996b.get();
    }
}
