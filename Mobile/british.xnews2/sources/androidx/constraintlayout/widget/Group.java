package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo2484m(AttributeSet attributeSet) {
        super.mo2484m(attributeSet);
        this.f2315f = false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2814g();
    }

    /* renamed from: p */
    public void mo2510p(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2395n0.mo23792F0(0);
        layoutParams.f2395n0.mo23827i0(0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2814g();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2814g();
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
