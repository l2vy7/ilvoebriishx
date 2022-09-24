package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7544bm {

    /* renamed from: a */
    public byte[] f30037a;

    /* renamed from: b */
    private int f30038b;

    /* renamed from: c */
    private int f30039c;

    public C7544bm() {
    }

    public C7544bm(int i) {
        this.f30037a = new byte[i];
        this.f30039c = i;
    }

    /* renamed from: a */
    public final int mo30704a() {
        return this.f30039c - this.f30038b;
    }

    /* renamed from: b */
    public final int mo30705b() {
        byte[] bArr = this.f30037a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public final int mo30706c() {
        return this.f30038b;
    }

    /* renamed from: d */
    public final int mo30707d() {
        return this.f30039c;
    }

    /* renamed from: e */
    public final int mo30708e() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f30038b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f30038b = i4;
        byte b3 = bArr[i3];
        this.f30038b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: f */
    public final int mo30709f() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        this.f30038b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: g */
    public final int mo30710g() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        this.f30038b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo30711h() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f30038b = i3;
        byte b2 = bArr[i2];
        this.f30038b = i3 + 2;
        return (b2 & 255) | ((b & 255) << 8);
    }

    /* renamed from: i */
    public final int mo30712i() {
        int e = mo30708e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public final int mo30713j() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        this.f30038b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: k */
    public final long mo30714k() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f30038b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f30038b = i4;
        byte b3 = bArr[i3];
        this.f30038b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: l */
    public final long mo30715l() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f30038b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f30038b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f30038b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f30038b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f30038b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f30038b = i8;
        byte b7 = bArr[i7];
        this.f30038b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: m */
    public final long mo30716m() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f30038b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f30038b = i4;
        byte b3 = bArr[i3];
        this.f30038b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public final long mo30717n() {
        long l = mo30715l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public final String mo30718o(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f30038b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f30037a, i2, (i3 >= this.f30039c || this.f30037a[i3] != 0) ? i : i - 1);
        this.f30038b += i;
        return str;
    }

    /* renamed from: p */
    public final short mo30719p() {
        byte[] bArr = this.f30037a;
        int i = this.f30038b;
        int i2 = i + 1;
        this.f30038b = i2;
        byte b = bArr[i];
        this.f30038b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b & 255) << 8));
    }

    /* renamed from: q */
    public final void mo30720q(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f30037a, this.f30038b, bArr, i, i2);
        this.f30038b += i2;
    }

    /* renamed from: r */
    public final void mo30721r() {
        this.f30038b = 0;
        this.f30039c = 0;
    }

    /* renamed from: s */
    public final void mo30722s(int i) {
        mo30723t(mo30705b() < i ? new byte[i] : this.f30037a, i);
    }

    /* renamed from: t */
    public final void mo30723t(byte[] bArr, int i) {
        this.f30037a = bArr;
        this.f30039c = i;
        this.f30038b = 0;
    }

    /* renamed from: u */
    public final void mo30724u(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f30037a.length) {
            z = true;
        }
        C8195tl.m37898c(z);
        this.f30039c = i;
    }

    /* renamed from: v */
    public final void mo30725v(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f30039c) {
            z = true;
        }
        C8195tl.m37898c(z);
        this.f30038b = i;
    }

    /* renamed from: w */
    public final void mo30726w(int i) {
        mo30725v(this.f30038b + i);
    }

    public C7544bm(byte[] bArr) {
        this.f30037a = bArr;
        this.f30039c = bArr.length;
    }
}
