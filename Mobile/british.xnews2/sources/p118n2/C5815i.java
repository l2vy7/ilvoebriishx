package p118n2;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p064d2.C5159f;
import p086h2.C5387e;

/* renamed from: n2.i */
/* compiled from: CenterCrop */
public class C5815i extends C5812f {

    /* renamed from: b */
    private static final byte[] f24533b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C5159f.f22594a);

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        messageDigest.update(f24533b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo22709c(C5387e eVar, Bitmap bitmap, int i, int i2) {
        return C5793a0.m25643b(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C5815i;
    }

    public int hashCode() {
        return -599754482;
    }
}
