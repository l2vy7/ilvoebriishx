package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i83 extends p63<Object> {

    /* renamed from: d */
    private final transient Object[] f33138d;

    /* renamed from: e */
    private final transient int f33139e;

    /* renamed from: f */
    private final transient int f33140f;

    i83(Object[] objArr, int i, int i2) {
        this.f33138d = objArr;
        this.f33139e = i;
        this.f33140f = i2;
    }

    public final Object get(int i) {
        b43.m20204a(i, this.f33140f, "index");
        Object obj = this.f33138d[i + i + this.f33139e];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo18466j() {
        return true;
    }

    public final int size() {
        return this.f33140f;
    }
}
