package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C0572f;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: d */
    private ImageFilterView.C0554c f2259d = new ImageFilterView.C0554c();

    /* renamed from: e */
    private float f2260e = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f2261f = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f2262g = Float.NaN;

    /* renamed from: h */
    private Path f2263h;

    /* renamed from: i */
    ViewOutlineProvider f2264i;

    /* renamed from: j */
    RectF f2265j;

    /* renamed from: k */
    Drawable[] f2266k;

    /* renamed from: l */
    LayerDrawable f2267l;

    /* renamed from: m */
    private boolean f2268m = true;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    class C0550a extends ViewOutlineProvider {
        C0550a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f2261f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    class C0551b extends ViewOutlineProvider {
        C0551b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2262g);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2986c(context, attributeSet);
    }

    /* renamed from: c */
    private void m2986c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2975r3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            Drawable drawable = obtainStyledAttributes.getDrawable(C0572f.f2984s3);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f3002u3) {
                    this.f2260e = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2268m));
                }
            }
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f2266k = drawableArr;
                drawableArr[0] = getDrawable();
                this.f2266k[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f2266k);
                this.f2267l = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f2260e * 255.0f));
                super.setImageDrawable(this.f2267l);
            }
        }
    }

    private void setOverlay(boolean z) {
        this.f2268m = z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2262g == 0.0f || this.f2263h == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2263h);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getContrast() {
        return this.f2259d.f2288f;
    }

    public float getCrossfade() {
        return this.f2260e;
    }

    public float getRound() {
        return this.f2262g;
    }

    public float getRoundPercent() {
        return this.f2261f;
    }

    public float getSaturation() {
        return this.f2259d.f2287e;
    }

    public float getWarmth() {
        return this.f2259d.f2289g;
    }

    public void setBrightness(float f) {
        ImageFilterView.C0554c cVar = this.f2259d;
        cVar.f2286d = f;
        cVar.mo2802c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C0554c cVar = this.f2259d;
        cVar.f2288f = f;
        cVar.mo2802c(this);
    }

    public void setCrossfade(float f) {
        this.f2260e = f;
        if (this.f2266k != null) {
            if (!this.f2268m) {
                this.f2267l.getDrawable(0).setAlpha((int) ((1.0f - this.f2260e) * 255.0f));
            }
            this.f2267l.getDrawable(1).setAlpha((int) (this.f2260e * 255.0f));
            super.setImageDrawable(this.f2267l);
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2262g = f;
            float f2 = this.f2261f;
            this.f2261f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2262g != f;
        this.f2262g = f;
        if (f != 0.0f) {
            if (this.f2263h == null) {
                this.f2263h = new Path();
            }
            if (this.f2265j == null) {
                this.f2265j = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2264i == null) {
                    C0551b bVar = new C0551b();
                    this.f2264i = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.f2265j.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2263h.reset();
            Path path = this.f2263h;
            RectF rectF = this.f2265j;
            float f3 = this.f2262g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f2261f != f;
        this.f2261f = f;
        if (f != 0.0f) {
            if (this.f2263h == null) {
                this.f2263h = new Path();
            }
            if (this.f2265j == null) {
                this.f2265j = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2264i == null) {
                    C0550a aVar = new C0550a();
                    this.f2264i = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2261f) / 2.0f;
            this.f2265j.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2263h.reset();
            this.f2263h.addRoundRect(this.f2265j, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C0554c cVar = this.f2259d;
        cVar.f2287e = f;
        cVar.mo2802c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C0554c cVar = this.f2259d;
        cVar.f2289g = f;
        cVar.mo2802c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2986c(context, attributeSet);
    }
}
