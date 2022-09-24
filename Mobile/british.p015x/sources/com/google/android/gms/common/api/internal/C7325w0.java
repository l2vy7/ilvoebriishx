package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7325w0 implements C7206f.C7209c {

    /* renamed from: b */
    final /* synthetic */ C7305s f29176b;

    C7325w0(C7217a1 a1Var, C7305s sVar) {
        this.f29176b = sVar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f29176b.mo29791i(new Status(8));
    }
}
