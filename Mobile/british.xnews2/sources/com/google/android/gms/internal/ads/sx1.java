package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sx1 extends a90 {

    /* renamed from: b */
    final /* synthetic */ Object f39112b;

    /* renamed from: c */
    final /* synthetic */ String f39113c;

    /* renamed from: d */
    final /* synthetic */ long f39114d;

    /* renamed from: e */
    final /* synthetic */ uo0 f39115e;

    /* renamed from: f */
    final /* synthetic */ tx1 f39116f;

    sx1(tx1 tx1, Object obj, String str, long j, uo0 uo0) {
        this.f39116f = tx1;
        this.f39112b = obj;
        this.f39113c = str;
        this.f39114d = j;
        this.f39115e = uo0;
    }

    /* renamed from: b */
    public final void mo30639b(String str) {
        synchronized (this.f39112b) {
            this.f39116f.m38055u(this.f39113c, false, str, (int) (zzt.zzA().elapsedRealtime() - this.f39114d));
            this.f39116f.f39573l.mo35809a(this.f39113c, "error");
            this.f39116f.f39576o.mo33088c(this.f39113c, "error");
            this.f39115e.zzd(Boolean.FALSE);
        }
    }

    public final void zzf() {
        synchronized (this.f39112b) {
            this.f39116f.m38055u(this.f39113c, true, "", (int) (zzt.zzA().elapsedRealtime() - this.f39114d));
            this.f39116f.f39573l.mo35811c(this.f39113c);
            this.f39116f.f39576o.mo33089z(this.f39113c);
            this.f39115e.zzd(Boolean.TRUE);
        }
    }
}
