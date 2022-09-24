package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.DefaultLoadControl;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ys0 implements nw3 {

    /* renamed from: a */
    private final o84 f41984a = new o84(true, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE);

    /* renamed from: b */
    private long f41985b = 15000000;

    /* renamed from: c */
    private long f41986c = 30000000;

    /* renamed from: d */
    private long f41987d = 2500000;

    /* renamed from: e */
    private long f41988e = 5000000;

    /* renamed from: f */
    private int f41989f;

    /* renamed from: g */
    private boolean f41990g;

    ys0() {
    }

    /* renamed from: a */
    public final void mo33773a(hx3[] hx3Arr, cm0 cm0, e74[] e74Arr) {
        this.f41989f = 0;
        for (int i = 0; i < 2; i++) {
            if (e74Arr[i] != null) {
                this.f41989f += hx3Arr[i].zzb() != 1 ? DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE : 13107200;
            }
        }
        this.f41984a.mo33856f(this.f41989f);
    }

    /* renamed from: b */
    public final boolean mo33774b(long j, float f, boolean z, long j2) {
        long j3 = z ? this.f41988e : this.f41987d;
        return j3 <= 0 || j >= j3;
    }

    /* renamed from: c */
    public final boolean mo33775c(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.f41986c ? 0 : j2 < this.f41985b ? (char) 2 : 1;
        int a = this.f41984a.mo33851a();
        int i = this.f41989f;
        if (c != 2 && (c != 1 || !this.f41990g || a >= i)) {
            z = false;
        }
        this.f41990g = z;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo35966d(boolean z) {
        this.f41989f = 0;
        this.f41990g = false;
        if (z) {
            this.f41984a.mo33855e();
        }
    }

    /* renamed from: e */
    public final synchronized void mo35967e(int i) {
        this.f41987d = ((long) i) * 1000;
    }

    /* renamed from: f */
    public final synchronized void mo35968f(int i) {
        this.f41988e = ((long) i) * 1000;
    }

    /* renamed from: g */
    public final synchronized void mo35969g(int i) {
        this.f41986c = ((long) i) * 1000;
    }

    /* renamed from: h */
    public final synchronized void mo35970h(int i) {
        this.f41985b = ((long) i) * 1000;
    }

    public final long zza() {
        return 0;
    }

    public final void zzb() {
        mo35966d(false);
    }

    public final void zzc() {
        mo35966d(true);
    }

    public final void zzd() {
        mo35966d(true);
    }

    public final boolean zze() {
        return false;
    }

    public final o84 zzh() {
        return this.f41984a;
    }
}
