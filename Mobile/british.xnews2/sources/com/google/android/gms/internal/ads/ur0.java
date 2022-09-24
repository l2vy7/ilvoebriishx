package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ur0 implements C7613dl {

    /* renamed from: a */
    private final C7613dl f39930a;

    /* renamed from: b */
    private final long f39931b;

    /* renamed from: c */
    private final C7613dl f39932c;

    /* renamed from: d */
    private long f39933d;

    /* renamed from: e */
    private Uri f39934e;

    ur0(C7613dl dlVar, int i, C7613dl dlVar2) {
        this.f39930a = dlVar;
        this.f39931b = (long) i;
        this.f39932c = dlVar2;
    }

    /* renamed from: a */
    public final int mo30699a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f39933d;
        long j2 = this.f39931b;
        if (j < j2) {
            int a = this.f39930a.mo30699a(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f39933d + ((long) a);
            this.f39933d = j3;
            i3 = a;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f39931b) {
            return i3;
        }
        int a2 = this.f39932c.mo30699a(bArr, i + i3, i2 - i3);
        this.f39933d += (long) a2;
        return i3 + a2;
    }

    /* renamed from: b */
    public final long mo30700b(C7687fl flVar) throws IOException {
        C7687fl flVar2;
        C7687fl flVar3 = flVar;
        this.f39934e = flVar3.f31785a;
        long j = flVar3.f31787c;
        long j2 = this.f39931b;
        C7687fl flVar4 = null;
        if (j >= j2) {
            flVar2 = null;
        } else {
            long j3 = flVar3.f31788d;
            flVar2 = new C7687fl(flVar3.f31785a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = flVar3.f31788d;
        if (j4 == -1 || flVar3.f31787c + j4 > this.f39931b) {
            long max = Math.max(this.f39931b, flVar3.f31787c);
            long j5 = flVar3.f31788d;
            flVar4 = new C7687fl(flVar3.f31785a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (flVar3.f31787c + j5) - this.f39931b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long b = flVar2 != null ? this.f39930a.mo30700b(flVar2) : 0;
        if (flVar4 != null) {
            j6 = this.f39932c.mo30700b(flVar4);
        }
        this.f39933d = flVar3.f31787c;
        if (j6 == -1) {
            return -1;
        }
        return b + j6;
    }

    public final Uri zzc() {
        return this.f39934e;
    }

    public final void zzd() throws IOException {
        this.f39930a.zzd();
        this.f39932c.zzd();
    }
}
