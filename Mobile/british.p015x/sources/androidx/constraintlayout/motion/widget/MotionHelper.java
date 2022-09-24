package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0572f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MotionHelper extends ConstraintHelper implements MotionLayout.C0472i {

    /* renamed from: j */
    private boolean f1839j = false;

    /* renamed from: k */
    private boolean f1840k = false;

    /* renamed from: l */
    private float f1841l;

    /* renamed from: m */
    protected View[] f1842m;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2484m(attributeSet);
    }

    /* renamed from: a */
    public void mo2522a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo2523b(MotionLayout motionLayout, int i, int i2) {
    }

    /* renamed from: c */
    public void mo2524c(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    /* renamed from: d */
    public void mo2525d(MotionLayout motionLayout, int i) {
    }

    public float getProgress() {
        return this.f1841l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        super.mo2484m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2615E6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2633G6) {
                    this.f1839j = obtainStyledAttributes.getBoolean(index, this.f1839j);
                } else if (index == C0572f.f2624F6) {
                    this.f1840k = obtainStyledAttributes.getBoolean(index, this.f1840k);
                }
            }
        }
    }

    public void setProgress(float f) {
        this.f1841l = f;
        int i = 0;
        if (this.f2312c > 0) {
            this.f1842m = mo2817l((ConstraintLayout) getParent());
            while (i < this.f2312c) {
                mo2530x(this.f1842m[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                mo2530x(childAt, f);
            }
            i++;
        }
    }

    /* renamed from: v */
    public boolean mo2528v() {
        return this.f1840k;
    }

    /* renamed from: w */
    public boolean mo2529w() {
        return this.f1839j;
    }

    /* renamed from: x */
    public void mo2530x(View view, float f) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2484m(attributeSet);
    }
}
