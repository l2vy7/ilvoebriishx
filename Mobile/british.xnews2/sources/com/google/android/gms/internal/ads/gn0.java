package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gn0 {

    /* renamed from: a */
    private long f32370a = -1;

    /* renamed from: b */
    private long f32371b = -1;

    /* renamed from: c */
    final /* synthetic */ hn0 f32372c;

    public gn0(hn0 hn0) {
        this.f32372c = hn0;
    }

    /* renamed from: a */
    public final long mo32168a() {
        return this.f32371b;
    }

    /* renamed from: b */
    public final Bundle mo32169b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f32370a);
        bundle.putLong("tclose", this.f32371b);
        return bundle;
    }

    /* renamed from: c */
    public final void mo32170c() {
        this.f32371b = this.f32372c.f32761a.elapsedRealtime();
    }

    /* renamed from: d */
    public final void mo32171d() {
        this.f32370a = this.f32372c.f32761a.elapsedRealtime();
    }
}
