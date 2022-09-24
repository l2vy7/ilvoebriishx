package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p194c6.C6522b;
import p194c6.C6531k;

public final class CircularProgressIndicator extends C10246a<CircularProgressIndicatorSpec> {

    /* renamed from: q */
    public static final int f48214q = C6531k.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.circularProgressIndicatorStyle);
    }

    /* renamed from: s */
    private void m47216s() {
        setIndeterminateDrawable(C10266i.m47335s(getContext(), (CircularProgressIndicatorSpec) this.f48223b));
        setProgressDrawable(C10258e.m47282u(getContext(), (CircularProgressIndicatorSpec) this.f48223b));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f48223b).f48217i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f48223b).f48216h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f48223b).f48215g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public CircularProgressIndicatorSpec mo41134i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f48223b).f48217i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f48223b;
        if (((CircularProgressIndicatorSpec) s).f48216h != i) {
            ((CircularProgressIndicatorSpec) s).f48216h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f48223b;
        if (((CircularProgressIndicatorSpec) s).f48215g != max) {
            ((CircularProgressIndicatorSpec) s).f48215g = max;
            ((CircularProgressIndicatorSpec) s).mo41140e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f48223b).mo41140e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f48214q);
        m47216s();
    }
}
