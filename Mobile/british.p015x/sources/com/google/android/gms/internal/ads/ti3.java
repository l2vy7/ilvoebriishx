package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ti3 implements ow3 {

    /* renamed from: b */
    private final rx3 f39432b;

    /* renamed from: c */
    private final sh3 f39433c;

    /* renamed from: d */
    private hx3 f39434d;

    /* renamed from: e */
    private ow3 f39435e;

    /* renamed from: f */
    private boolean f39436f = true;

    /* renamed from: g */
    private boolean f39437g;

    public ti3(sh3 sh3, ov1 ov1) {
        this.f39433c = sh3;
        this.f39432b = new rx3(ov1);
    }

    /* renamed from: a */
    public final long mo34960a(boolean z) {
        hx3 hx3 = this.f39434d;
        if (hx3 == null || hx3.zzL() || (!this.f39434d.mo32483u() && (z || this.f39434d.mo32473b()))) {
            this.f39436f = true;
            if (this.f39437g) {
                this.f39432b.mo34636b();
            }
        } else {
            ow3 ow3 = this.f39435e;
            Objects.requireNonNull(ow3);
            long zza = ow3.zza();
            if (this.f39436f) {
                if (zza < this.f39432b.zza()) {
                    this.f39432b.mo34637c();
                } else {
                    this.f39436f = false;
                    if (this.f39437g) {
                        this.f39432b.mo34636b();
                    }
                }
            }
            this.f39432b.mo34635a(zza);
            h20 zzc = ow3.zzc();
            if (!zzc.equals(this.f39432b.zzc())) {
                this.f39432b.mo34017r(zzc);
                this.f39433c.mo33202a(zzc);
            }
        }
        if (this.f39436f) {
            return this.f39432b.zza();
        }
        ow3 ow32 = this.f39435e;
        Objects.requireNonNull(ow32);
        return ow32.zza();
    }

    /* renamed from: b */
    public final void mo34961b(hx3 hx3) {
        if (hx3 == this.f39434d) {
            this.f39435e = null;
            this.f39434d = null;
            this.f39436f = true;
        }
    }

    /* renamed from: c */
    public final void mo34962c(hx3 hx3) throws vk3 {
        ow3 ow3;
        ow3 zzi = hx3.zzi();
        if (zzi != null && zzi != (ow3 = this.f39435e)) {
            if (ow3 == null) {
                this.f39435e = zzi;
                this.f39434d = hx3;
                zzi.mo34017r(this.f39432b.zzc());
                return;
            }
            throw vk3.m38833d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    /* renamed from: d */
    public final void mo34963d(long j) {
        this.f39432b.mo34635a(j);
    }

    /* renamed from: e */
    public final void mo34964e() {
        this.f39437g = true;
        this.f39432b.mo34636b();
    }

    /* renamed from: f */
    public final void mo34965f() {
        this.f39437g = false;
        this.f39432b.mo34637c();
    }

    /* renamed from: r */
    public final void mo34017r(h20 h20) {
        ow3 ow3 = this.f39435e;
        if (ow3 != null) {
            ow3.mo34017r(h20);
            h20 = this.f39435e.zzc();
        }
        this.f39432b.mo34017r(h20);
    }

    public final long zza() {
        throw null;
    }

    public final h20 zzc() {
        ow3 ow3 = this.f39435e;
        return ow3 != null ? ow3.zzc() : this.f39432b.zzc();
    }
}
