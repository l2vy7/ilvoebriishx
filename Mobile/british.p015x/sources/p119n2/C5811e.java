package p119n2;

import android.graphics.Bitmap;
import p004a3.C0065j;
import p004a3.C0066k;
import p082g2.C5318r;
import p082g2.C5323v;
import p087h2.C5387e;

/* renamed from: n2.e */
/* compiled from: BitmapResource */
public class C5811e implements C5323v<Bitmap>, C5318r {

    /* renamed from: b */
    private final Bitmap f24529b;

    /* renamed from: c */
    private final C5387e f24530c;

    public C5811e(Bitmap bitmap, C5387e eVar) {
        this.f24529b = (Bitmap) C0065j.m248e(bitmap, "Bitmap must not be null");
        this.f24530c = (C5387e) C0065j.m248e(eVar, "BitmapPool must not be null");
    }

    /* renamed from: e */
    public static C5811e m25696e(Bitmap bitmap, C5387e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C5811e(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo21591a() {
        this.f24530c.mo21827c(this.f24529b);
    }

    /* renamed from: b */
    public int mo21592b() {
        return C0066k.m255g(this.f24529b);
    }

    /* renamed from: c */
    public Class<Bitmap> mo21593c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public Bitmap get() {
        return this.f24529b;
    }

    public void initialize() {
        this.f24529b.prepareToDraw();
    }
}
