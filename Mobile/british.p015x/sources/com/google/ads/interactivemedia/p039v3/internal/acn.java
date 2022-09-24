package com.google.ads.interactivemedia.p039v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acn */
/* compiled from: IMASDK */
final class acn<V> {

    /* renamed from: a */
    private int f14185a;

    /* renamed from: b */
    private final SparseArray<V> f14186b;

    /* renamed from: c */
    private final akv<V> f14187c;

    public acn() {
        akv akv = acm.f14182a;
        throw null;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    public final V mo13438a(int r4) {
        /*
            r3 = this;
            int r0 = r3.f14185a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r3.f14185a = r0
        L_0x0009:
            int r0 = r3.f14185a
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray<V> r2 = r3.f14186b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L_0x001a
            int r0 = r3.f14185a
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r3.f14185a
            android.util.SparseArray<V> r2 = r3.f14186b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L_0x0038
            android.util.SparseArray<V> r0 = r3.f14186b
            int r2 = r3.f14185a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L_0x0038
            int r0 = r3.f14185a
            int r0 = r0 + 1
            r3.f14185a = r0
            goto L_0x001a
        L_0x0038:
            android.util.SparseArray<V> r4 = r3.f14186b
            int r0 = r3.f14185a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.acn.mo13438a(int):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo13439b(int i, V v) {
        boolean z = true;
        if (this.f14185a == -1) {
            aup.m14887r(this.f14186b.size() == 0);
            this.f14185a = 0;
        }
        if (this.f14186b.size() > 0) {
            SparseArray<V> sparseArray = this.f14186b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z = false;
            }
            aup.m14885p(z);
            if (keyAt == i) {
                akv<V> akv = this.f14187c;
                SparseArray<V> sparseArray2 = this.f14186b;
                akv.mo13437a(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f14186b.append(i, v);
    }

    /* renamed from: c */
    public final V mo13440c() {
        SparseArray<V> sparseArray = this.f14186b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: d */
    public final void mo13441d(int i) {
        int i2 = 0;
        while (i2 < this.f14186b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f14186b.keyAt(i3)) {
                this.f14187c.mo13437a(this.f14186b.valueAt(i2));
                this.f14186b.removeAt(i2);
                int i4 = this.f14185a;
                if (i4 > 0) {
                    this.f14185a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final void mo13442e(int i) {
        int i2 = -1;
        int size = this.f14186b.size() - 1;
        while (size >= 0 && i < this.f14186b.keyAt(size)) {
            this.f14187c.mo13437a(this.f14186b.valueAt(size));
            this.f14186b.removeAt(size);
            size--;
        }
        if (this.f14186b.size() > 0) {
            i2 = Math.min(this.f14185a, this.f14186b.size() - 1);
        }
        this.f14185a = i2;
    }

    /* renamed from: f */
    public final void mo13443f() {
        for (int i = 0; i < this.f14186b.size(); i++) {
            this.f14187c.mo13437a(this.f14186b.valueAt(i));
        }
        this.f14185a = -1;
        this.f14186b.clear();
    }

    /* renamed from: g */
    public final boolean mo13444g() {
        return this.f14186b.size() == 0;
    }

    public acn(akv<V> akv) {
        this.f14186b = new SparseArray<>();
        this.f14187c = akv;
        this.f14185a = -1;
    }
}
