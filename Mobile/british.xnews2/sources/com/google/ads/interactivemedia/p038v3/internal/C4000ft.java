package com.google.ads.interactivemedia.p038v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ft */
/* compiled from: IMASDK */
final class C4000ft implements Runnable {
    private C4000ft() {
    }

    /* synthetic */ C4000ft(byte[] bArr) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            C4001fu.f17086c = MessageDigest.getInstance("MD5");
            countDownLatch = C4001fu.f17085b;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = C4001fu.f17085b;
        } catch (Throwable th) {
            C4001fu.f17085b.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
