package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* renamed from: com.google.android.gms.internal.ads.qz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8103qz extends C8349xx {

    /* renamed from: b */
    private final OnAdMetadataChangedListener f38359b;

    public C8103qz(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f38359b = onAdMetadataChangedListener;
    }

    public final void zze() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f38359b;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
