package com.google.ads.interactivemedia.p038v3.internal;

import com.startapp.C12425x3;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wc */
/* compiled from: IMASDK */
final class C4442wc {

    /* renamed from: a */
    private final C4327rw f19352a;

    /* renamed from: b */
    private long f19353b;

    /* renamed from: c */
    private boolean f19354c;

    /* renamed from: d */
    private int f19355d;

    /* renamed from: e */
    private long f19356e;

    /* renamed from: f */
    private boolean f19357f;

    /* renamed from: g */
    private boolean f19358g;

    /* renamed from: h */
    private boolean f19359h;

    /* renamed from: i */
    private boolean f19360i;

    /* renamed from: j */
    private boolean f19361j;

    /* renamed from: k */
    private long f19362k;

    /* renamed from: l */
    private long f19363l;

    /* renamed from: m */
    private boolean f19364m;

    public C4442wc(C4327rw rwVar) {
        this.f19352a = rwVar;
    }

    /* renamed from: e */
    private final void m19327e(int i) {
        boolean z = this.f19364m;
        long j = this.f19353b;
        long j2 = this.f19362k;
        int i2 = z ? 1 : 0;
        this.f19352a.mo13404b(this.f19363l, i2, (int) (j - j2), i, (C4326rv) null);
    }

    /* renamed from: a */
    public final void mo16737a() {
        this.f19357f = false;
        this.f19358g = false;
        this.f19359h = false;
        this.f19360i = false;
        this.f19361j = false;
    }

    /* renamed from: b */
    public final void mo16738b(long j, int i, int i2, long j2, boolean z) {
        boolean z2 = false;
        this.f19358g = false;
        this.f19359h = false;
        this.f19356e = j2;
        this.f19355d = 0;
        this.f19353b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.f19360i && !this.f19361j) {
                if (z) {
                    m19327e(i);
                }
                this.f19360i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.f19359h = !this.f19361j;
                this.f19361j = true;
            }
        }
        boolean z3 = i2 >= 16 && i2 <= 21;
        this.f19354c = z3;
        if (z3 || i2 <= 9) {
            z2 = true;
        }
        this.f19357f = z2;
    }

    /* renamed from: c */
    public final void mo16739c(byte[] bArr, int i, int i2) {
        if (this.f19357f) {
            int i3 = this.f19355d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                this.f19358g = (bArr[i4] & C12425x3.f55111d) != 0;
                this.f19357f = false;
                return;
            }
            this.f19355d = i3 + (i2 - i);
        }
    }

    /* renamed from: d */
    public final void mo16740d(long j, int i, boolean z) {
        if (this.f19361j && this.f19358g) {
            this.f19364m = this.f19354c;
            this.f19361j = false;
        } else if (this.f19359h || this.f19358g) {
            if (z && this.f19360i) {
                m19327e(i + ((int) (j - this.f19353b)));
            }
            this.f19362k = this.f19353b;
            this.f19363l = this.f19356e;
            this.f19364m = this.f19354c;
            this.f19360i = true;
        }
    }
}
