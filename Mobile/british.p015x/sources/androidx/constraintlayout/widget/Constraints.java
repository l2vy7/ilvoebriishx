package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Constraints extends ViewGroup {

    /* renamed from: b */
    C0564c f2419b;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3042c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: c */
    private void m3042c(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C0564c getConstraintSet() {
        if (this.f2419b == null) {
            this.f2419b = new C0564c();
        }
        this.f2419b.mo2911k(this);
        return this.f2419b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3042c(attributeSet);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f2420A0;

        /* renamed from: B0 */
        public float f2421B0;

        /* renamed from: p0 */
        public float f2422p0;

        /* renamed from: q0 */
        public boolean f2423q0;

        /* renamed from: r0 */
        public float f2424r0;

        /* renamed from: s0 */
        public float f2425s0;

        /* renamed from: t0 */
        public float f2426t0;

        /* renamed from: u0 */
        public float f2427u0;

        /* renamed from: v0 */
        public float f2428v0;

        /* renamed from: w0 */
        public float f2429w0;

        /* renamed from: x0 */
        public float f2430x0;

        /* renamed from: y0 */
        public float f2431y0;

        /* renamed from: z0 */
        public float f2432z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2422p0 = 1.0f;
            this.f2423q0 = false;
            this.f2424r0 = 0.0f;
            this.f2425s0 = 0.0f;
            this.f2426t0 = 0.0f;
            this.f2427u0 = 0.0f;
            this.f2428v0 = 1.0f;
            this.f2429w0 = 1.0f;
            this.f2430x0 = 0.0f;
            this.f2431y0 = 0.0f;
            this.f2432z0 = 0.0f;
            this.f2420A0 = 0.0f;
            this.f2421B0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2422p0 = 1.0f;
            this.f2423q0 = false;
            this.f2424r0 = 0.0f;
            this.f2425s0 = 0.0f;
            this.f2426t0 = 0.0f;
            this.f2427u0 = 0.0f;
            this.f2428v0 = 1.0f;
            this.f2429w0 = 1.0f;
            this.f2430x0 = 0.0f;
            this.f2431y0 = 0.0f;
            this.f2432z0 = 0.0f;
            this.f2420A0 = 0.0f;
            this.f2421B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2710P2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2719Q2) {
                    this.f2422p0 = obtainStyledAttributes.getFloat(index, this.f2422p0);
                } else if (index == C0572f.f2820b3) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2424r0 = obtainStyledAttributes.getFloat(index, this.f2424r0);
                        this.f2423q0 = true;
                    }
                } else if (index == C0572f.f2791Y2) {
                    this.f2426t0 = obtainStyledAttributes.getFloat(index, this.f2426t0);
                } else if (index == C0572f.f2800Z2) {
                    this.f2427u0 = obtainStyledAttributes.getFloat(index, this.f2427u0);
                } else if (index == C0572f.f2782X2) {
                    this.f2425s0 = obtainStyledAttributes.getFloat(index, this.f2425s0);
                } else if (index == C0572f.f2764V2) {
                    this.f2428v0 = obtainStyledAttributes.getFloat(index, this.f2428v0);
                } else if (index == C0572f.f2773W2) {
                    this.f2429w0 = obtainStyledAttributes.getFloat(index, this.f2429w0);
                } else if (index == C0572f.f2728R2) {
                    this.f2430x0 = obtainStyledAttributes.getFloat(index, this.f2430x0);
                } else if (index == C0572f.f2737S2) {
                    this.f2431y0 = obtainStyledAttributes.getFloat(index, this.f2431y0);
                } else if (index == C0572f.f2746T2) {
                    this.f2432z0 = obtainStyledAttributes.getFloat(index, this.f2432z0);
                } else if (index == C0572f.f2755U2) {
                    this.f2420A0 = obtainStyledAttributes.getFloat(index, this.f2420A0);
                } else if (index == C0572f.f2810a3 && Build.VERSION.SDK_INT >= 21) {
                    this.f2421B0 = obtainStyledAttributes.getFloat(index, this.f2421B0);
                }
            }
        }
    }
}
