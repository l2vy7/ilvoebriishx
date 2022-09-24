package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acw */
/* compiled from: IMASDK */
public final class acw {

    /* renamed from: a */
    private final int[] f14212a;

    /* renamed from: b */
    private final acg[] f14213b;

    public acw(int[] iArr, acg[] acgArr) {
        this.f14212a = iArr;
        this.f14213b = acgArr;
    }

    /* renamed from: a */
    public final int[] mo13470a() {
        int[] iArr = new int[this.f14213b.length];
        int i = 0;
        while (true) {
            acg[] acgArr = this.f14213b;
            if (i >= acgArr.length) {
                return iArr;
            }
            iArr[i] = acgArr[i].mo13415m();
            i++;
        }
    }

    /* renamed from: b */
    public final void mo13471b(long j) {
        for (acg G : this.f14213b) {
            G.mo13397G(j);
        }
    }

    /* renamed from: c */
    public final C4327rw mo13472c(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f14212a;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new C4305ra();
            } else if (i == iArr[i2]) {
                return this.f14213b[i2];
            } else {
                i2++;
            }
        }
    }
}
