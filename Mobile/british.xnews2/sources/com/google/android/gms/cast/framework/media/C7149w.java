package com.google.android.gms.cast.framework.media;

import com.google.android.exoplayer2.ext.ima.ImaAdsLoader;
import java.util.concurrent.atomic.AtomicLong;
import p108l4.C10697p0;
import p243q4.C10920a;
import p243q4.C10945o;

/* renamed from: com.google.android.gms.cast.framework.media.w */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7149w implements C10945o {

    /* renamed from: a */
    private C10697p0 f28752a;

    /* renamed from: b */
    private final AtomicLong f28753b = new AtomicLong((C10920a.m49144g() & 65535) * ImaAdsLoader.Builder.DEFAULT_AD_PRELOAD_TIMEOUT_MS);

    /* renamed from: c */
    final /* synthetic */ C4580e f28754c;

    public C7149w(C4580e eVar) {
        this.f28754c = eVar;
    }

    /* renamed from: a */
    public final void mo29586a(String str, String str2, long j, String str3) {
        C10697p0 p0Var = this.f28752a;
        if (p0Var != null) {
            p0Var.mo22363a(str, str2).addOnFailureListener(new C7147v(this, j));
            return;
        }
        throw new IllegalStateException("Device is not connected");
    }

    /* renamed from: b */
    public final void mo29587b(C10697p0 p0Var) {
        this.f28752a = p0Var;
    }

    public final long zzc() {
        return this.f28753b.getAndIncrement();
    }
}
