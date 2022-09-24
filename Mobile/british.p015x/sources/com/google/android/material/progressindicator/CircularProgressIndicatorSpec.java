package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C10220m;
import p194c6.C6522b;
import p194c6.C6524d;
import p194c6.C6532l;
import p233m6.C10805c;

public final class CircularProgressIndicatorSpec extends C10251b {

    /* renamed from: g */
    public int f48215g;

    /* renamed from: h */
    public int f48216h;

    /* renamed from: i */
    public int f48217i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.circularProgressIndicatorStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41140e() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f48214q);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6524d.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C6524d.mtrl_progress_circular_inset_medium);
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26611A1, i, i2, new int[0]);
        this.f48215g = Math.max(C10805c.m48755c(context, h, C6532l.f26644D1, dimensionPixelSize), this.f48241a * 2);
        this.f48216h = C10805c.m48755c(context, h, C6532l.f26633C1, dimensionPixelSize2);
        this.f48217i = h.getInt(C6532l.f26622B1, 0);
        h.recycle();
        mo41140e();
    }
}
