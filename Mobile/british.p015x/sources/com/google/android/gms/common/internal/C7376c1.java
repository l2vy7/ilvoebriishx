package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.c1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7376c1 extends C7412n0 {

    /* renamed from: g */
    final /* synthetic */ C7377d f29310g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7376c1(C7377d dVar, int i, Bundle bundle) {
        super(dVar, i, (Bundle) null);
        this.f29310g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30043f(ConnectionResult connectionResult) {
        if (!this.f29310g.enableLocalFallback() || !C7377d.zzo(this.f29310g)) {
            this.f29310g.zzc.mo29866a(connectionResult);
            this.f29310g.onConnectionFailed(connectionResult);
            return;
        }
        C7377d.zzk(this.f29310g, 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo30044g() {
        this.f29310g.zzc.mo29866a(ConnectionResult.f28862f);
        return true;
    }
}
