package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C7377d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class w80 implements C7377d.C7379b {

    /* renamed from: b */
    final /* synthetic */ uo0 f40724b;

    w80(x80 x80, uo0 uo0) {
        this.f40724b = uo0;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f40724b.zze(new RuntimeException("Connection failed."));
    }
}
