package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.C10251b;

/* renamed from: com.google.android.material.progressindicator.g */
/* compiled from: DrawingDelegate */
abstract class C10264g<S extends C10251b> {

    /* renamed from: a */
    S f48289a;

    /* renamed from: b */
    protected C10260f f48290b;

    public C10264g(S s) {
        this.f48289a = s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo41183a(Canvas canvas, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo41184b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo41185c(Canvas canvas, Paint paint);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo41186d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo41187e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo41239f(C10260f fVar) {
        this.f48290b = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo41240g(Canvas canvas, float f) {
        this.f48289a.mo41140e();
        mo41183a(canvas, f);
    }
}
