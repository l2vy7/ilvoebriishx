package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p198d5.C10489b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ok0 {
    /* renamed from: a */
    public static final bk0 m35746a(Context context, String str, tc0 tc0) {
        try {
            IBinder n6 = ((gk0) ho0.m32903b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", nk0.f36033a)).mo32154n6(C10489b.m48195m6(context), str, tc0, 214106000);
            if (n6 == null) {
                return null;
            }
            IInterface queryLocalInterface = n6.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof bk0 ? (bk0) queryLocalInterface : new zj0(n6);
        } catch (RemoteException | go0 e) {
            co0.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
