package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p166w.C6257l;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: j */
    private boolean f2436j;

    /* renamed from: k */
    private boolean f2437k;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        super.mo2484m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0572f.f2808a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0572f.f2878h1) {
                    this.f2436j = true;
                } else if (index == C0572f.f2946o1) {
                    this.f2437k = true;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2436j || this.f2437k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f2312c; i++) {
                View h = constraintLayout.mo2840h(this.f2311b[i]);
                if (h != null) {
                    if (this.f2436j) {
                        h.setVisibility(visibility);
                    }
                    if (this.f2437k && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        h.setTranslationZ(h.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2814g();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2814g();
    }

    /* renamed from: v */
    public void mo2508v(C6257l lVar, int i, int i2) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
