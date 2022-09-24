package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w64<V> {

    /* renamed from: a */
    private int f40718a;

    /* renamed from: b */
    private final SparseArray<V> f40719b = new SparseArray<>();

    /* renamed from: c */
    private final sy1<V> f40720c;

    public w64(sy1<V> sy1) {
        this.f40720c = sy1;
        this.f40718a = -1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    public final V mo35562a(int r4) {
        /*
            r3 = this;
            int r0 = r3.f40718a
            r1 = -1
            if (r0 == r1) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0 = 0
        L_0x0007:
            r3.f40718a = r0
        L_0x0009:
            int r0 = r3.f40718a
            if (r0 > 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            android.util.SparseArray<V> r2 = r3.f40719b
            int r0 = r2.keyAt(r0)
            if (r4 >= r0) goto L_0x001a
            int r0 = r3.f40718a
            int r0 = r0 + r1
            goto L_0x0007
        L_0x001a:
            int r0 = r3.f40718a
            android.util.SparseArray<V> r2 = r3.f40719b
            int r2 = r2.size()
            int r2 = r2 + r1
            if (r0 >= r2) goto L_0x0038
            android.util.SparseArray<V> r0 = r3.f40719b
            int r2 = r3.f40718a
            int r2 = r2 + 1
            int r0 = r0.keyAt(r2)
            if (r4 < r0) goto L_0x0038
            int r0 = r3.f40718a
            int r0 = r0 + 1
            r3.f40718a = r0
            goto L_0x001a
        L_0x0038:
            android.util.SparseArray<V> r4 = r3.f40719b
            int r0 = r3.f40718a
            java.lang.Object r4 = r4.valueAt(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w64.mo35562a(int):java.lang.Object");
    }

    /* renamed from: b */
    public final V mo35563b() {
        SparseArray<V> sparseArray = this.f40719b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* renamed from: c */
    public final void mo35564c(int i, V v) {
        boolean z = true;
        if (this.f40718a == -1) {
            nu1.m20747f(this.f40719b.size() == 0);
            this.f40718a = 0;
        }
        if (this.f40719b.size() > 0) {
            SparseArray<V> sparseArray = this.f40719b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i < keyAt) {
                z = false;
            }
            nu1.m20745d(z);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.f40719b;
                q64.m36313A((o64) sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f40719b.append(i, v);
    }

    /* renamed from: d */
    public final void mo35565d() {
        for (int i = 0; i < this.f40719b.size(); i++) {
            q64.m36313A((o64) this.f40719b.valueAt(i));
        }
        this.f40718a = -1;
        this.f40719b.clear();
    }

    /* renamed from: e */
    public final void mo35566e(int i) {
        int i2 = 0;
        while (i2 < this.f40719b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f40719b.keyAt(i3)) {
                q64.m36313A((o64) this.f40719b.valueAt(i2));
                this.f40719b.removeAt(i2);
                int i4 = this.f40718a;
                if (i4 > 0) {
                    this.f40718a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo35567f() {
        return this.f40719b.size() == 0;
    }
}
