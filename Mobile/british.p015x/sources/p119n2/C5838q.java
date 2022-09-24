package p119n2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p065d2.C5159f;
import p087h2.C5387e;

/* renamed from: n2.q */
/* compiled from: FitCenter */
public class C5838q extends C5812f {

    /* renamed from: b */
    private static final byte[] f24569b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C5159f.f22594a);

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        messageDigest.update(f24569b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo22709c(C5387e eVar, Bitmap bitmap, int i, int i2) {
        return C5793a0.m25646e(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C5838q;
    }

    public int hashCode() {
        return 1572326941;
    }
}
