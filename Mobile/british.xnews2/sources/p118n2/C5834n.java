package p118n2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p081g2.C5323v;
import p086h2.C5387e;
import p086h2.C5388f;

/* renamed from: n2.n */
/* compiled from: DrawableToBitmapConverter */
final class C5834n {

    /* renamed from: a */
    private static final C5387e f24566a = new C5835a();

    /* renamed from: n2.n$a */
    /* compiled from: DrawableToBitmapConverter */
    class C5835a extends C5388f {
        C5835a() {
        }

        /* renamed from: c */
        public void mo21827c(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static C5323v<Bitmap> m25784a(C5387e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m25785b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f24566a;
        }
        return C5811e.m25696e(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m25785b(C5387e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock h = C5793a0.m25649h();
            h.lock();
            Bitmap d = eVar.mo21828d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return d;
            } finally {
                h.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
