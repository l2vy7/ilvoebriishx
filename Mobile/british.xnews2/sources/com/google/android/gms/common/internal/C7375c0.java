package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.C7240f;
import com.google.android.gms.common.internal.C7377d;

/* renamed from: com.google.android.gms.common.internal.c0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7375c0 implements C7377d.C7378a {

    /* renamed from: b */
    final /* synthetic */ C7240f f29309b;

    C7375c0(C7240f fVar) {
        this.f29309b = fVar;
    }

    public final void onConnected(Bundle bundle) {
        this.f29309b.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.f29309b.onConnectionSuspended(i);
    }
}
