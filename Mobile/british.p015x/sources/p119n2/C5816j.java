package p119n2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p065d2.C5159f;
import p087h2.C5387e;

/* renamed from: n2.j */
/* compiled from: CenterInside */
public class C5816j extends C5812f {

    /* renamed from: b */
    private static final byte[] f24534b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C5159f.f22594a);

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        messageDigest.update(f24534b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo22709c(C5387e eVar, Bitmap bitmap, int i, int i2) {
        return C5793a0.m25644c(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C5816j;
    }

    public int hashCode() {
        return -670243078;
    }
}
