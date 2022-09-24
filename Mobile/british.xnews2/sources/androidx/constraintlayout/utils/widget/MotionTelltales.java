package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0572f;

public class MotionTelltales extends MockView {

    /* renamed from: m */
    private Paint f2301m = new Paint();

    /* renamed from: n */
    MotionLayout f2302n;

    /* renamed from: o */
    float[] f2303o = new float[2];

    /* renamed from: p */
    Matrix f2304p = new Matrix();

    /* renamed from: q */
    int f2305q = 0;

    /* renamed from: r */
    int f2306r = -65281;

    /* renamed from: s */
    float f2307s = 0.25f;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2995a(context, attributeSet);
    }

    /* renamed from: a */
    private void m2995a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2732R6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2741S6) {
                    this.f2306r = obtainStyledAttributes.getColor(index, this.f2306r);
                } else if (index == C0572f.f2759U6) {
                    this.f2305q = obtainStyledAttributes.getInt(index, this.f2305q);
                } else if (index == C0572f.f2750T6) {
                    this.f2307s = obtainStyledAttributes.getFloat(index, this.f2307s);
                }
            }
        }
        this.f2301m.setColor(this.f2306r);
        this.f2301m.setStrokeWidth(5.0f);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2304p);
        if (this.f2302n == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2302n = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f2302n.mo2538g0(this, f2, f, this.f2303o, this.f2305q);
                this.f2304p.mapVectors(this.f2303o);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.f2303o;
                float f5 = fArr2[0];
                float f6 = this.f2307s;
                float f7 = f4 - (fArr2[1] * f6);
                this.f2304p.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f2301m);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2295g = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2995a(context, attributeSet);
    }
}
