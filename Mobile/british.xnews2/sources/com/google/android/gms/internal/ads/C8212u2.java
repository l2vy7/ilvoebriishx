package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;

/* renamed from: com.google.android.gms.internal.ads.u2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8212u2 {

    /* renamed from: a */
    private final ad4 f39723a;

    /* renamed from: b */
    private boolean f39724b;

    /* renamed from: c */
    private boolean f39725c;

    /* renamed from: d */
    private boolean f39726d;

    /* renamed from: e */
    private int f39727e;

    /* renamed from: f */
    private int f39728f;

    /* renamed from: g */
    private long f39729g;

    /* renamed from: h */
    private long f39730h;

    public C8212u2(ad4 ad4) {
        this.f39723a = ad4;
    }

    /* renamed from: a */
    public final void mo35088a(byte[] bArr, int i, int i2) {
        if (this.f39725c) {
            int i3 = this.f39728f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f39726d = ((bArr[i4] & 192) >> 6) == 0;
                this.f39725c = false;
                return;
            }
            this.f39728f = i3 + (i2 - i);
        }
    }

    /* renamed from: b */
    public final void mo35089b(long j, int i, boolean z) {
        if (this.f39727e == 182 && z && this.f39724b) {
            long j2 = this.f39730h;
            if (j2 != C6540C.TIME_UNSET) {
                long j3 = this.f39729g;
                int i2 = (int) (j - j3);
                this.f39723a.mo30358e(j2, this.f39726d ? 1 : 0, i2, i, (zc4) null);
            }
        }
        if (this.f39727e != 179) {
            this.f39729g = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35090c(int r5, long r6) {
        /*
            r4 = this;
            r4.f39727e = r5
            r0 = 0
            r4.f39726d = r0
            r1 = 179(0xb3, float:2.51E-43)
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 1
            if (r5 == r2) goto L_0x0013
            if (r5 != r1) goto L_0x0011
            r5 = 179(0xb3, float:2.51E-43)
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            r4.f39724b = r1
            if (r5 != r2) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            r4.f39725c = r3
            r4.f39728f = r0
            r4.f39730h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8212u2.mo35090c(int, long):void");
    }

    /* renamed from: d */
    public final void mo35091d() {
        this.f39724b = false;
        this.f39725c = false;
        this.f39726d = false;
        this.f39727e = -1;
    }
}
