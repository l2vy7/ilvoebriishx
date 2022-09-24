package p086h2;

import android.graphics.Bitmap;

/* renamed from: h2.f */
/* compiled from: BitmapPoolAdapter */
public class C5388f implements C5387e {
    /* renamed from: a */
    public void mo21825a(int i) {
    }

    /* renamed from: b */
    public void mo21826b() {
    }

    /* renamed from: c */
    public void mo21827c(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: d */
    public Bitmap mo21828d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: e */
    public Bitmap mo21829e(int i, int i2, Bitmap.Config config) {
        return mo21828d(i, i2, config);
    }
}
