package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class iu2 {

    /* renamed from: a */
    private final long f33523a;

    /* renamed from: b */
    private final hu2 f33524b = new hu2();

    /* renamed from: c */
    private long f33525c;

    /* renamed from: d */
    private int f33526d = 0;

    /* renamed from: e */
    private int f33527e = 0;

    /* renamed from: f */
    private int f33528f = 0;

    public iu2() {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        this.f33523a = currentTimeMillis;
        this.f33525c = currentTimeMillis;
    }

    /* renamed from: a */
    public final int mo32768a() {
        return this.f33526d;
    }

    /* renamed from: b */
    public final long mo32769b() {
        return this.f33523a;
    }

    /* renamed from: c */
    public final long mo32770c() {
        return this.f33525c;
    }

    /* renamed from: d */
    public final hu2 mo32771d() {
        hu2 a = this.f33524b.clone();
        hu2 hu2 = this.f33524b;
        hu2.f32849b = false;
        hu2.f32850c = 0;
        return a;
    }

    /* renamed from: e */
    public final String mo32772e() {
        return "Created: " + this.f33523a + " Last accessed: " + this.f33525c + " Accesses: " + this.f33526d + "\nEntries retrieved: Valid: " + this.f33527e + " Stale: " + this.f33528f;
    }

    /* renamed from: f */
    public final void mo32773f() {
        this.f33525c = zzt.zzA().currentTimeMillis();
        this.f33526d++;
    }

    /* renamed from: g */
    public final void mo32774g() {
        this.f33528f++;
        this.f33524b.f32850c++;
    }

    /* renamed from: h */
    public final void mo32775h() {
        this.f33527e++;
        this.f33524b.f32849b = true;
    }
}
