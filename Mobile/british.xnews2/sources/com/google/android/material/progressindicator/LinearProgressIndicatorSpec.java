package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C10220m;
import p193c6.C6522b;
import p193c6.C6532l;

public final class LinearProgressIndicatorSpec extends C10251b {

    /* renamed from: g */
    public int f48219g;

    /* renamed from: h */
    public int f48220h;

    /* renamed from: i */
    boolean f48221i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6522b.linearProgressIndicatorStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41140e() {
        if (this.f48219g != 0) {
            return;
        }
        if (this.f48242b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f48243c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f48218q);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        boolean z = false;
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f27090s3, C6522b.linearProgressIndicatorStyle, LinearProgressIndicator.f48218q, new int[0]);
        this.f48219g = h.getInt(C6532l.f27101t3, 1);
        this.f48220h = h.getInt(C6532l.f27112u3, 0);
        h.recycle();
        mo41140e();
        this.f48221i = this.f48220h == 1 ? true : z;
    }
}
