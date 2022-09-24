package p142r2;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C3319b;
import java.security.MessageDigest;
import p065d2.C5167l;
import p082g2.C5323v;
import p119n2.C5811e;

/* renamed from: r2.f */
/* compiled from: GifDrawableTransformation */
public class C5986f implements C5167l<C5982c> {

    /* renamed from: b */
    private final C5167l<Bitmap> f24952b;

    /* JADX WARNING: type inference failed for: r1v0, types: [d2.l<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5986f(p065d2.C5167l<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p004a3.C0065j.m247d(r1)
            d2.l r1 = (p065d2.C5167l) r1
            r0.f24952b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p142r2.C5986f.<init>(d2.l):void");
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        this.f24952b.mo21331a(messageDigest);
    }

    /* renamed from: b */
    public C5323v<C5982c> mo21347b(Context context, C5323v<C5982c> vVar, int i, int i2) {
        C5982c cVar = vVar.get();
        C5811e eVar = new C5811e(cVar.mo23045e(), C3319b.m11097c(context).mo11093f());
        C5323v<Bitmap> b = this.f24952b.mo21347b(context, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.mo21591a();
        }
        cVar.mo23055m(this.f24952b, b.get());
        return vVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5986f) {
            return this.f24952b.equals(((C5986f) obj).f24952b);
        }
        return false;
    }

    public int hashCode() {
        return this.f24952b.hashCode();
    }
}
