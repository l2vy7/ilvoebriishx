package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.C1344b;

/* renamed from: com.google.android.material.progressindicator.h */
/* compiled from: IndeterminateAnimatorDelegate */
abstract class C10265h<T extends Animator> {

    /* renamed from: a */
    protected C10266i f48291a;

    /* renamed from: b */
    protected final float[] f48292b;

    /* renamed from: c */
    protected final int[] f48293c;

    protected C10265h(int i) {
        this.f48292b = new float[(i * 2)];
        this.f48293c = new int[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo41188a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo41241b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo41189c();

    /* renamed from: d */
    public abstract void mo41190d(C1344b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo41242e(C10266i iVar) {
        this.f48291a = iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo41191f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo41192g();

    /* renamed from: h */
    public abstract void mo41193h();
}
