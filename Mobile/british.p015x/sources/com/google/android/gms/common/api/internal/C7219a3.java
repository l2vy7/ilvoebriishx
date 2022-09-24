package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7206f;

/* renamed from: com.google.android.gms.common.api.internal.a3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7219a3 implements C7206f.C7209c {

    /* renamed from: b */
    public final int f28964b;

    /* renamed from: c */
    public final C7206f f28965c;

    /* renamed from: d */
    public final C7206f.C7209c f28966d;

    /* renamed from: e */
    final /* synthetic */ C7224b3 f28967e;

    public C7219a3(C7224b3 b3Var, int i, C7206f fVar, C7206f.C7209c cVar) {
        this.f28967e = b3Var;
        this.f28964b = i;
        this.f28965c = fVar;
        this.f28966d = cVar;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f28967e.mo29860h(connectionResult, this.f28964b);
    }
}
