package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9797i3 extends C9868o8 {
    public C9797i3(C9958x8 x8Var) {
        super(x8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo39017l() {
        mo39090d();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f21269a.mo19277r().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
