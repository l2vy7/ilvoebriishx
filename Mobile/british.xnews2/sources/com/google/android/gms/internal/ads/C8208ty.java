package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* renamed from: com.google.android.gms.internal.ads.ty */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8208ty implements AdapterStatus {
    C8208ty(C4632yy yyVar) {
    }

    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    public final AdapterStatus.State getInitializationState() {
        return AdapterStatus.State.READY;
    }

    public final int getLatency() {
        return 0;
    }
}
