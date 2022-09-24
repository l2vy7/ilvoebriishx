package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4598t0 implements C7222b1 {
    @NotOnlyInitialized

    /* renamed from: a */
    private final C4594e1 f20025a;

    public C4598t0(C4594e1 e1Var) {
        this.f20025a = e1Var;
    }

    /* renamed from: a */
    public final void mo17964a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo17965b() {
        this.f20025a.mo17918m();
    }

    /* renamed from: c */
    public final void mo17966c(ConnectionResult connectionResult, C7191a<?> aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo17967d(int i) {
    }

    /* renamed from: e */
    public final void mo17968e() {
        for (C7191a.C7201f disconnect : this.f20025a.f19980g.values()) {
            disconnect.disconnect();
        }
        this.f20025a.f19988o.f28952p = Collections.emptySet();
    }

    /* renamed from: f */
    public final boolean mo17969f() {
        return true;
    }

    /* renamed from: g */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17970g(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
