package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i32 {

    /* renamed from: a */
    private int f33074a = 0;

    /* renamed from: b */
    private long f33075b = 0;

    /* renamed from: c */
    private long f33076c = 0;

    /* renamed from: d */
    private long f33077d = 0;

    /* renamed from: e */
    private final Object f33078e = new Object();

    /* renamed from: f */
    private final Object f33079f = new Object();

    /* renamed from: g */
    private final Object f33080g = new Object();

    /* renamed from: h */
    private final Object f33081h = new Object();

    /* renamed from: a */
    public final int mo32538a() {
        int i;
        synchronized (this.f33078e) {
            i = this.f33074a;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized long mo32539b() {
        long j;
        synchronized (this.f33081h) {
            j = this.f33077d;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long mo32540c() {
        long j;
        synchronized (this.f33080g) {
            j = this.f33076c;
        }
        return j;
    }

    /* renamed from: d */
    public final long mo32541d() {
        long j;
        synchronized (this.f33079f) {
            j = this.f33075b;
        }
        return j;
    }

    /* renamed from: e */
    public final synchronized void mo32542e(long j) {
        synchronized (this.f33081h) {
            this.f33077d = j;
        }
    }

    /* renamed from: f */
    public final synchronized void mo32543f(long j) {
        synchronized (this.f33080g) {
            this.f33076c = j;
        }
    }

    /* renamed from: g */
    public final void mo32544g(int i) {
        synchronized (this.f33078e) {
            this.f33074a = i;
        }
    }

    /* renamed from: h */
    public final void mo32545h(long j) {
        synchronized (this.f33079f) {
            this.f33075b = j;
        }
    }
}
