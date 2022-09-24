package p119n2;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C3319b;
import p004a3.C0066k;
import p065d2.C5167l;
import p082g2.C5323v;
import p087h2.C5387e;

/* renamed from: n2.f */
/* compiled from: BitmapTransformation */
public abstract class C5812f implements C5167l<Bitmap> {
    /* renamed from: b */
    public final C5323v<Bitmap> mo21347b(Context context, C5323v<Bitmap> vVar, int i, int i2) {
        if (C0066k.m267s(i, i2)) {
            C5387e f = C3319b.m11097c(context).mo11093f();
            Bitmap bitmap = vVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo22709c(f, bitmap, i, i2);
            return bitmap.equals(c) ? vVar : C5811e.m25696e(c, f);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Bitmap mo22709c(C5387e eVar, Bitmap bitmap, int i, int i2);
}
