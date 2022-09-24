package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0572f;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: d */
    private C0554c f2271d = new C0554c();

    /* renamed from: e */
    private boolean f2272e = true;

    /* renamed from: f */
    private float f2273f = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f2274g = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f2275h = Float.NaN;

    /* renamed from: i */
    private Path f2276i;

    /* renamed from: j */
    ViewOutlineProvider f2277j;

    /* renamed from: k */
    RectF f2278k;

    /* renamed from: l */
    Drawable[] f2279l;

    /* renamed from: m */
    LayerDrawable f2280m;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    class C0552a extends ViewOutlineProvider {
        C0552a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f2274g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    class C0553b extends ViewOutlineProvider {
        C0553b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2275h);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    static class C0554c {

        /* renamed from: a */
        float[] f2283a = new float[20];

        /* renamed from: b */
        ColorMatrix f2284b = new ColorMatrix();

        /* renamed from: c */
        ColorMatrix f2285c = new ColorMatrix();

        /* renamed from: d */
        float f2286d = 1.0f;

        /* renamed from: e */
        float f2287e = 1.0f;

        /* renamed from: f */
        float f2288f = 1.0f;

        /* renamed from: g */
        float f2289g = 1.0f;

        C0554c() {
        }

        /* renamed from: a */
        private void m2990a(float f) {
            float[] fArr = this.f2283a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        private void m2991b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f2283a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: d */
        private void m2992d(float f) {
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = (double) (f4 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f4)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            float log = f4 < 66.0f ? f4 > 19.0f ? (((float) Math.log((double) (f4 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f2, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f2283a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2802c(ImageView imageView) {
            boolean z;
            this.f2284b.reset();
            float f = this.f2287e;
            boolean z2 = true;
            if (f != 1.0f) {
                m2991b(f);
                this.f2284b.set(this.f2283a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f2288f;
            if (f2 != 1.0f) {
                this.f2285c.setScale(f2, f2, f2, 1.0f);
                this.f2284b.postConcat(this.f2285c);
                z = true;
            }
            float f3 = this.f2289g;
            if (f3 != 1.0f) {
                m2992d(f3);
                this.f2285c.set(this.f2283a);
                this.f2284b.postConcat(this.f2285c);
                z = true;
            }
            float f4 = this.f2286d;
            if (f4 != 1.0f) {
                m2990a(f4);
                this.f2285c.set(this.f2283a);
                this.f2284b.postConcat(this.f2285c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2284b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2989e(context, attributeSet);
    }

    /* renamed from: e */
    private void m2989e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2975r3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(C0572f.f2984s3);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f3002u3) {
                    this.f2273f = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0572f.f3047z3) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0572f.f3038y3) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0572f.f2993t3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0572f.f3020w3) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0572f.f3029x3) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0572f.f3011v3) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2272e));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2279l = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2279l[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2279l);
                this.f2280m = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2273f * 255.0f));
                super.setImageDrawable(this.f2280m);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.f2272e = z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2274g == 0.0f || this.f2276i == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2276i);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getBrightness() {
        return this.f2271d.f2286d;
    }

    public float getContrast() {
        return this.f2271d.f2288f;
    }

    public float getCrossfade() {
        return this.f2273f;
    }

    public float getRound() {
        return this.f2275h;
    }

    public float getRoundPercent() {
        return this.f2274g;
    }

    public float getSaturation() {
        return this.f2271d.f2287e;
    }

    public float getWarmth() {
        return this.f2271d.f2289g;
    }

    public void setBrightness(float f) {
        C0554c cVar = this.f2271d;
        cVar.f2286d = f;
        cVar.mo2802c(this);
    }

    public void setContrast(float f) {
        C0554c cVar = this.f2271d;
        cVar.f2288f = f;
        cVar.mo2802c(this);
    }

    public void setCrossfade(float f) {
        this.f2273f = f;
        if (this.f2279l != null) {
            if (!this.f2272e) {
                this.f2280m.getDrawable(0).setAlpha((int) ((1.0f - this.f2273f) * 255.0f));
            }
            this.f2280m.getDrawable(1).setAlpha((int) (this.f2273f * 255.0f));
            super.setImageDrawable(this.f2280m);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2275h = f;
            float f2 = this.f2274g;
            this.f2274g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2275h != f;
        this.f2275h = f;
        if (f != 0.0f) {
            if (this.f2276i == null) {
                this.f2276i = new Path();
            }
            if (this.f2278k == null) {
                this.f2278k = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2277j == null) {
                    C0553b bVar = new C0553b();
                    this.f2277j = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.f2278k.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2276i.reset();
            Path path = this.f2276i;
            RectF rectF = this.f2278k;
            float f3 = this.f2275h;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f2274g != f;
        this.f2274g = f;
        if (f != 0.0f) {
            if (this.f2276i == null) {
                this.f2276i = new Path();
            }
            if (this.f2278k == null) {
                this.f2278k = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2277j == null) {
                    C0552a aVar = new C0552a();
                    this.f2277j = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2274g) / 2.0f;
            this.f2278k.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2276i.reset();
            this.f2276i.addRoundRect(this.f2278k, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C0554c cVar = this.f2271d;
        cVar.f2287e = f;
        cVar.mo2802c(this);
    }

    public void setWarmth(float f) {
        C0554c cVar = this.f2271d;
        cVar.f2289g = f;
        cVar.mo2802c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2989e(context, attributeSet);
    }
}
