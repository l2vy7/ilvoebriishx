package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6531k;

public final class LinearProgressIndicator extends C10246a<LinearProgressIndicatorSpec> {

    /* renamed from: q */
    public static final int f48218q = C6531k.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.linearProgressIndicatorStyle);
    }

    /* renamed from: s */
    private void m47220s() {
        setIndeterminateDrawable(C10266i.m47336t(getContext(), (LinearProgressIndicatorSpec) this.f48223b));
        setProgressDrawable(C10258e.m47283v(getContext(), (LinearProgressIndicatorSpec) this.f48223b));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f48223b).f48219g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f48223b).f48220h;
    }

    /* renamed from: o */
    public void mo41143o(int i, boolean z) {
        S s = this.f48223b;
        if (s == null || ((LinearProgressIndicatorSpec) s).f48219g != 0 || !isIndeterminate()) {
            super.mo41143o(i, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f48223b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (!(((LinearProgressIndicatorSpec) s).f48220h == 1 || ((C5723u.m25265B(this) == 1 && ((LinearProgressIndicatorSpec) this.f48223b).f48220h == 2) || (C5723u.m25265B(this) == 0 && ((LinearProgressIndicatorSpec) this.f48223b).f48220h == 3)))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f48221i = z2;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C10266i indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C10258e progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public LinearProgressIndicatorSpec mo41134i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f48223b).f48219g != i) {
            if (!mo41169q() || !isIndeterminate()) {
                S s = this.f48223b;
                ((LinearProgressIndicatorSpec) s).f48219g = i;
                ((LinearProgressIndicatorSpec) s).mo41140e();
                if (i == 0) {
                    getIndeterminateDrawable().mo41248w(new C10268k((LinearProgressIndicatorSpec) this.f48223b));
                } else {
                    getIndeterminateDrawable().mo41248w(new C10271l(getContext(), (LinearProgressIndicatorSpec) this.f48223b));
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f48223b).mo41140e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f48223b;
        ((LinearProgressIndicatorSpec) s).f48220h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (!(i == 1 || ((C5723u.m25265B(this) == 1 && ((LinearProgressIndicatorSpec) this.f48223b).f48220h == 2) || (C5723u.m25265B(this) == 0 && i == 3)))) {
            z = false;
        }
        linearProgressIndicatorSpec.f48221i = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f48223b).mo41140e();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f48218q);
        m47220s();
    }
}
