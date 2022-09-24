package p119n2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C3319b;
import java.security.MessageDigest;
import p065d2.C5167l;
import p082g2.C5323v;
import p087h2.C5387e;

/* renamed from: n2.o */
/* compiled from: DrawableTransformation */
public class C5836o implements C5167l<Drawable> {

    /* renamed from: b */
    private final C5167l<Bitmap> f24567b;

    /* renamed from: c */
    private final boolean f24568c;

    public C5836o(C5167l<Bitmap> lVar, boolean z) {
        this.f24567b = lVar;
        this.f24568c = z;
    }

    /* renamed from: d */
    private C5323v<Drawable> m25787d(Context context, C5323v<Bitmap> vVar) {
        return C5844u.m25817e(context.getResources(), vVar);
    }

    /* renamed from: a */
    public void mo21331a(MessageDigest messageDigest) {
        this.f24567b.mo21331a(messageDigest);
    }

    /* renamed from: b */
    public C5323v<Drawable> mo21347b(Context context, C5323v<Drawable> vVar, int i, int i2) {
        C5387e f = C3319b.m11097c(context).mo11093f();
        Drawable drawable = vVar.get();
        C5323v<Bitmap> a = C5834n.m25784a(f, drawable, i, i2);
        if (a != null) {
            C5323v<Bitmap> b = this.f24567b.mo21347b(context, a, i, i2);
            if (!b.equals(a)) {
                return m25787d(context, b);
            }
            b.mo21591a();
            return vVar;
        } else if (!this.f24568c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: c */
    public C5167l<BitmapDrawable> mo22732c() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5836o) {
            return this.f24567b.equals(((C5836o) obj).f24567b);
        }
        return false;
    }

    public int hashCode() {
        return this.f24567b.hashCode();
    }
}
