package p118n2;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p004a3.C0065j;
import p004a3.C0066k;
import p064d2.C5159f;
import p086h2.C5387e;

/* renamed from: n2.y */
/* compiled from: RoundedCorners */
public final class C5849y extends C5812f {

    /* renamed from: c */
    private static final byte[] f24595c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C5159f.f22594a);

    /* renamed from: b */
    private final int f24596b;

    public C5849y(int i) {
        C0065j.m244a(i > 0, "roundingRadius must be greater than 0.");
        this.f24596b = i;
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        messageDigest.update(f24595c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f24596b).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Bitmap mo22709c(C5387e eVar, Bitmap bitmap, int i, int i2) {
        return C5793a0.m25655n(eVar, bitmap, this.f24596b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5849y) || this.f24596b != ((C5849y) obj).f24596b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C0066k.m261m(-569625254, C0066k.m260l(this.f24596b));
    }
}
