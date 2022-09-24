package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import p199d5.C10487a;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.ads.uz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8245uz extends h50 {

    /* renamed from: b */
    private final ShouldDelayBannerRenderingListener f40133b;

    public C8245uz(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.f40133b = shouldDelayBannerRenderingListener;
    }

    /* renamed from: O */
    public final boolean mo32009O(C10487a aVar) throws RemoteException {
        return this.f40133b.shouldDelayBannerRendering((Runnable) C10489b.m48194f3(aVar));
    }
}
