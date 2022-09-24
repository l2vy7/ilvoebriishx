package com.google.ads.interactivemedia.p039v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xc */
/* compiled from: IMASDK */
public final class C4469xc {

    /* renamed from: a */
    private final String f19530a;

    /* renamed from: b */
    private final int f19531b;

    /* renamed from: c */
    private final int f19532c;

    /* renamed from: d */
    private int f19533d;

    /* renamed from: e */
    private String f19534e;

    public C4469xc(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    /* renamed from: d */
    private final void m19433d() {
        if (this.f19533d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final void mo16763a() {
        int i = this.f19533d;
        int i2 = i == Integer.MIN_VALUE ? this.f19531b : i + this.f19532c;
        this.f19533d = i2;
        String str = this.f19530a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i2);
        this.f19534e = sb.toString();
    }

    /* renamed from: b */
    public final int mo16764b() {
        m19433d();
        return this.f19533d;
    }

    /* renamed from: c */
    public final String mo16765c() {
        m19433d();
        return this.f19534e;
    }

    public C4469xc(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f19530a = str;
        this.f19531b = i2;
        this.f19532c = i3;
        this.f19533d = Integer.MIN_VALUE;
        this.f19534e = "";
    }
}
