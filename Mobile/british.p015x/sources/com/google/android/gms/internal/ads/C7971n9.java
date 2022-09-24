package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.n9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7971n9 implements Runnable {
    /* synthetic */ C7971n9(C7933m9 m9Var) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            C8007o9.f36338b = MessageDigest.getInstance("MD5");
            countDownLatch = C8007o9.f36341e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = C8007o9.f36341e;
        } catch (Throwable th) {
            C8007o9.f36341e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
