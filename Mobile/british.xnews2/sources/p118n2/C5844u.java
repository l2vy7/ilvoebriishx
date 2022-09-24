package p118n2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p004a3.C0065j;
import p081g2.C5318r;
import p081g2.C5323v;

/* renamed from: n2.u */
/* compiled from: LazyBitmapDrawableResource */
public final class C5844u implements C5323v<BitmapDrawable>, C5318r {

    /* renamed from: b */
    private final Resources f24584b;

    /* renamed from: c */
    private final C5323v<Bitmap> f24585c;

    private C5844u(Resources resources, C5323v<Bitmap> vVar) {
        this.f24584b = (Resources) C0065j.m247d(resources);
        this.f24585c = (C5323v) C0065j.m247d(vVar);
    }

    /* renamed from: e */
    public static C5323v<BitmapDrawable> m25817e(Resources resources, C5323v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new C5844u(resources, vVar);
    }

    /* renamed from: a */
    public void mo21591a() {
        this.f24585c.mo21591a();
    }

    /* renamed from: b */
    public int mo21592b() {
        return this.f24585c.mo21592b();
    }

    /* renamed from: c */
    public Class<BitmapDrawable> mo21593c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f24584b, this.f24585c.get());
    }

    public void initialize() {
        C5323v<Bitmap> vVar = this.f24585c;
        if (vVar instanceof C5318r) {
            ((C5318r) vVar).initialize();
        }
    }
}
