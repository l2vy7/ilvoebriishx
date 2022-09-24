package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.measurement.internal.C4670h4;
import com.google.android.gms.measurement.internal.C9779g6;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9706a extends C9709d {

    /* renamed from: a */
    private final C4670h4 f46132a;

    /* renamed from: b */
    private final C9779g6 f46133b;

    public C9706a(C4670h4 h4Var) {
        super((C9708c) null);
        C4604n.m20098k(h4Var);
        this.f46132a = h4Var;
        this.f46133b = h4Var.mo19367I();
    }

    /* renamed from: E */
    public final List mo38813E(String str, String str2) {
        return this.f46133b.mo38946b0(str, str2);
    }

    /* renamed from: a */
    public final Map mo38814a(String str, String str2, boolean z) {
        return this.f46133b.mo38947c0(str, str2, z);
    }

    /* renamed from: b */
    public final void mo38815b(Bundle bundle) {
        this.f46133b.mo38925D(bundle);
    }

    /* renamed from: c */
    public final void mo38816c(String str, String str2, Bundle bundle) {
        this.f46133b.mo38953q(str, str2, bundle);
    }

    /* renamed from: d */
    public final void mo38817d(String str, String str2, Bundle bundle) {
        this.f46132a.mo19367I().mo38949h0(str, str2, bundle);
    }

    /* renamed from: j */
    public final void mo38818j(String str) {
        this.f46132a.mo19391y().mo39314k(str, this.f46132a.mo19274f().elapsedRealtime());
    }

    /* renamed from: l */
    public final void mo38819l(String str) {
        this.f46132a.mo19391y().mo39315l(str, this.f46132a.mo19274f().elapsedRealtime());
    }

    public final int zza(String str) {
        this.f46133b.mo38937S(str);
        return 25;
    }

    public final long zzb() {
        return this.f46132a.mo19372N().mo19325r0();
    }

    public final String zzh() {
        return this.f46133b.mo38942X();
    }

    public final String zzi() {
        return this.f46133b.mo38943Y();
    }

    public final String zzj() {
        return this.f46133b.mo38944Z();
    }

    public final String zzk() {
        return this.f46133b.mo38942X();
    }
}
