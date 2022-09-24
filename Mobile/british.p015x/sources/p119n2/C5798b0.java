package p119n2;

import android.graphics.Bitmap;
import p004a3.C0066k;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;

/* renamed from: n2.b0 */
/* compiled from: UnitBitmapDecoder */
public final class C5798b0 implements C5165j<Bitmap, Bitmap> {

    /* renamed from: n2.b0$a */
    /* compiled from: UnitBitmapDecoder */
    private static final class C5799a implements C5323v<Bitmap> {

        /* renamed from: b */
        private final Bitmap f24514b;

        C5799a(Bitmap bitmap) {
            this.f24514b = bitmap;
        }

        /* renamed from: a */
        public void mo21591a() {
        }

        /* renamed from: b */
        public int mo21592b() {
            return C0066k.m255g(this.f24514b);
        }

        /* renamed from: c */
        public Class<Bitmap> mo21593c() {
            return Bitmap.class;
        }

        /* renamed from: d */
        public Bitmap get() {
            return this.f24514b;
        }
    }

    /* renamed from: c */
    public C5323v<Bitmap> mo21345b(Bitmap bitmap, int i, int i2, C5163h hVar) {
        return new C5799a(bitmap);
    }

    /* renamed from: d */
    public boolean mo21344a(Bitmap bitmap, C5163h hVar) {
        return true;
    }
}
