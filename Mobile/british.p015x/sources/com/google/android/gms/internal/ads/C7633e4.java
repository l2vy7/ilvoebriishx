package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7633e4 {

    /* renamed from: a */
    private final String f31217a;

    /* renamed from: b */
    private final int f31218b;

    /* renamed from: c */
    private final int f31219c;

    /* renamed from: d */
    private int f31220d;

    /* renamed from: e */
    private String f31221e;

    public C7633e4(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f31217a = str;
        this.f31218b = i2;
        this.f31219c = i3;
        this.f31220d = Integer.MIN_VALUE;
        this.f31221e = "";
    }

    /* renamed from: d */
    private final void m31700d() {
        if (this.f31220d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final int mo31469a() {
        m31700d();
        return this.f31220d;
    }

    /* renamed from: b */
    public final String mo31470b() {
        m31700d();
        return this.f31221e;
    }

    /* renamed from: c */
    public final void mo31471c() {
        int i = this.f31220d;
        int i2 = i == Integer.MIN_VALUE ? this.f31218b : i + this.f31219c;
        this.f31220d = i2;
        String str = this.f31217a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i2);
        this.f31221e = sb.toString();
    }
}
