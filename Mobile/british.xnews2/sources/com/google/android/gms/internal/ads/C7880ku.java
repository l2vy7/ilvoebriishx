package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.google.android.gms.internal.ads.ku */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C7880ku {

    /* renamed from: a */
    public final Object f34474a;

    /* renamed from: b */
    public final int f34475b;

    /* renamed from: c */
    public final int f34476c;

    /* renamed from: d */
    public final long f34477d;

    /* renamed from: e */
    public final int f34478e;

    protected C7880ku(C7880ku kuVar) {
        this.f34474a = kuVar.f34474a;
        this.f34475b = kuVar.f34475b;
        this.f34476c = kuVar.f34476c;
        this.f34477d = kuVar.f34477d;
        this.f34478e = kuVar.f34478e;
    }

    public C7880ku(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private C7880ku(Object obj, int i, int i2, long j, int i3) {
        this.f34474a = obj;
        this.f34475b = i;
        this.f34476c = i2;
        this.f34477d = j;
        this.f34478e = i3;
    }

    /* renamed from: a */
    public final C7880ku mo33182a(Object obj) {
        if (this.f34474a.equals(obj)) {
            return this;
        }
        return new C7880ku(obj, this.f34475b, this.f34476c, this.f34477d, this.f34478e);
    }

    /* renamed from: b */
    public final boolean mo33183b() {
        return this.f34475b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7880ku)) {
            return false;
        }
        C7880ku kuVar = (C7880ku) obj;
        return this.f34474a.equals(kuVar.f34474a) && this.f34475b == kuVar.f34475b && this.f34476c == kuVar.f34476c && this.f34477d == kuVar.f34477d && this.f34478e == kuVar.f34478e;
    }

    public final int hashCode() {
        return ((((((((this.f34474a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f34475b) * 31) + this.f34476c) * 31) + ((int) this.f34477d)) * 31) + this.f34478e;
    }

    public C7880ku(Object obj, long j) {
        this(obj, -1, -1, -1, -1);
    }

    public C7880ku(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
