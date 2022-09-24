package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.jo */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C4614jo {

    /* renamed from: b */
    private static MessageDigest f20470b;

    /* renamed from: a */
    protected final Object f20471a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo18455a() {
        synchronized (this.f20471a) {
            MessageDigest messageDigest = f20470b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f20470b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f20470b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte[] mo18456b(String str);
}
