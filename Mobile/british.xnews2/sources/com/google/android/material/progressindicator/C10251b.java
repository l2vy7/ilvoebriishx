package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C10220m;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6532l;
import p207f6.C10538a;
import p232m6.C10805c;

/* renamed from: com.google.android.material.progressindicator.b */
/* compiled from: BaseProgressIndicatorSpec */
public abstract class C10251b {

    /* renamed from: a */
    public int f48241a;

    /* renamed from: b */
    public int f48242b;

    /* renamed from: c */
    public int[] f48243c = new int[0];

    /* renamed from: d */
    public int f48244d;

    /* renamed from: e */
    public int f48245e;

    /* renamed from: f */
    public int f48246f;

    protected C10251b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C6524d.mtrl_progress_track_thickness);
        TypedArray h = C10220m.m47116h(context, attributeSet, C6532l.f26719K, i, i2, new int[0]);
        this.f48241a = C10805c.m48755c(context, h, C6532l.f26807S, dimensionPixelSize);
        this.f48242b = Math.min(C10805c.m48755c(context, h, C6532l.f26796R, 0), this.f48241a / 2);
        this.f48245e = h.getInt(C6532l.f26763O, 0);
        this.f48246f = h.getInt(C6532l.f26730L, 0);
        m47244c(context, h);
        m47245d(context, h);
        h.recycle();
    }

    /* renamed from: c */
    private void m47244c(Context context, TypedArray typedArray) {
        int i = C6532l.f26741M;
        if (!typedArray.hasValue(i)) {
            this.f48243c = new int[]{C10538a.m48268b(context, C6522b.f26603p, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f48243c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f48243c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    private void m47245d(Context context, TypedArray typedArray) {
        int i = C6532l.f26785Q;
        if (typedArray.hasValue(i)) {
            this.f48244d = typedArray.getColor(i, -1);
            return;
        }
        this.f48244d = this.f48243c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f48244d = C10538a.m48267a(this.f48244d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean mo41181a() {
        return this.f48246f != 0;
    }

    /* renamed from: b */
    public boolean mo41182b() {
        return this.f48245e != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo41140e();
}
