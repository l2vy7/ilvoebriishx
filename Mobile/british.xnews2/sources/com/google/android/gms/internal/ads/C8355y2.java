package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.y2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8355y2 {

    /* renamed from: a */
    private final ad4 f41658a;

    /* renamed from: b */
    private final SparseArray<jg2> f41659b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<if2> f41660c = new SparseArray<>();

    /* renamed from: d */
    private final vr2 f41661d;

    /* renamed from: e */
    private final byte[] f41662e;

    /* renamed from: f */
    private int f41663f;

    /* renamed from: g */
    private long f41664g;

    /* renamed from: h */
    private long f41665h;

    /* renamed from: i */
    private final C8319x2 f41666i = new C8319x2((C8283w2) null);

    /* renamed from: j */
    private final C8319x2 f41667j = new C8319x2((C8283w2) null);

    /* renamed from: k */
    private boolean f41668k;

    /* renamed from: l */
    private long f41669l;

    /* renamed from: m */
    private long f41670m;

    /* renamed from: n */
    private boolean f41671n;

    public C8355y2(ad4 ad4, boolean z, boolean z2) {
        this.f41658a = ad4;
        byte[] bArr = new byte[128];
        this.f41662e = bArr;
        this.f41661d = new vr2(bArr, 0, 0);
        this.f41668k = false;
    }

    /* renamed from: a */
    public final void mo35835a(if2 if2) {
        this.f41660c.append(if2.f33235a, if2);
    }

    /* renamed from: b */
    public final void mo35836b(jg2 jg2) {
        this.f41659b.append(jg2.f33882d, jg2);
    }

    /* renamed from: c */
    public final void mo35837c() {
        this.f41668k = false;
    }

    /* renamed from: d */
    public final void mo35838d(long j, int i, long j2) {
        this.f41663f = i;
        this.f41665h = j2;
        this.f41664g = j;
    }

    /* renamed from: e */
    public final boolean mo35839e(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f41663f == 9) {
            if (z && this.f41668k) {
                long j2 = this.f41664g;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f41670m;
                if (j3 != C6540C.TIME_UNSET) {
                    boolean z4 = this.f41671n;
                    long j4 = this.f41669l;
                    this.f41658a.mo30358e(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, (zc4) null);
                }
            }
            this.f41669l = this.f41664g;
            this.f41670m = this.f41665h;
            this.f41671n = false;
            this.f41668k = true;
        }
        boolean z5 = this.f41671n;
        int i3 = this.f41663f;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.f41671n = z6;
        return z6;
    }
}
