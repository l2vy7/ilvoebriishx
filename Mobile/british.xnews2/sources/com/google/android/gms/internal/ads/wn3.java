package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wn3 extends ao3 {

    /* renamed from: g */
    private final int f40829g;

    /* renamed from: h */
    private final int f40830h;

    wn3(byte[] bArr, int i, int i2) {
        super(bArr);
        eo3.m31870G(i, i + i2, bArr.length);
        this.f40829g = i;
        this.f40830h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final int mo30453S() {
        return this.f40829g;
    }

    /* renamed from: h */
    public final byte mo30455h(int i) {
        eo3.m31878b(i, this.f40830h);
        return this.f29707f[this.f40829g + i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final byte mo30456i(int i) {
        return this.f29707f[this.f40829g + i];
    }

    /* renamed from: q */
    public final int mo30457q() {
        return this.f40830h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo30458r(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f29707f, this.f40829g + i, bArr, i2, i3);
    }
}
