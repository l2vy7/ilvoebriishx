package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p063d0.C5137c;

/* renamed from: androidx.appcompat.widget.i */
/* compiled from: AppCompatProgressBarHelper */
class C0391i {

    /* renamed from: c */
    private static final int[] f1589c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1590a;

    /* renamed from: b */
    private Bitmap f1591b;

    C0391i(ProgressBar progressBar) {
        this.f1590a = progressBar;
    }

    /* renamed from: a */
    private Shape m2065a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: d */
    private Drawable m2066d(Drawable drawable, boolean z) {
        if (drawable instanceof C5137c) {
            C5137c cVar = (C5137c) drawable;
            Drawable b = cVar.mo21284b();
            if (b != null) {
                cVar.mo21283a(m2066d(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m2066d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1591b == null) {
                this.f1591b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m2065a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m2067e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = m2066d(animationDrawable.getFrame(i), true);
            d.setLevel(10000);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo2163b() {
        return this.f1591b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2164c(AttributeSet attributeSet, int i) {
        C0384f0 v = C0384f0.m1994v(this.f1590a.getContext(), attributeSet, f1589c, i, 0);
        Drawable h = v.mo2102h(0);
        if (h != null) {
            this.f1590a.setIndeterminateDrawable(m2067e(h));
        }
        Drawable h2 = v.mo2102h(1);
        if (h2 != null) {
            this.f1590a.setProgressDrawable(m2066d(h2, false));
        }
        v.mo2114w();
    }
}
