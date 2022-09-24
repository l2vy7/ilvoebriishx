package p130p2;

import android.graphics.drawable.Drawable;
import p082g2.C5323v;

/* renamed from: p2.c */
/* compiled from: NonOwnedDrawableResource */
final class C5899c extends C5898b<Drawable> {
    private C5899c(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: e */
    static C5323v<Drawable> m26048e(Drawable drawable) {
        if (drawable != null) {
            return new C5899c(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo21591a() {
    }

    /* renamed from: b */
    public int mo21592b() {
        return Math.max(1, this.f24734b.getIntrinsicWidth() * this.f24734b.getIntrinsicHeight() * 4);
    }

    /* renamed from: c */
    public Class<Drawable> mo21593c() {
        return this.f24734b.getClass();
    }
}
