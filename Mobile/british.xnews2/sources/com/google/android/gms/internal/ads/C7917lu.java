package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p198d5.C10489b;
import p198d5.C10490c;

/* renamed from: com.google.android.gms.internal.ads.lu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7917lu extends C10490c<C8029ow> {
    public C7917lu() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C8029ow ? (C8029ow) queryLocalInterface : new C8029ow(iBinder);
    }

    /* renamed from: c */
    public final C7993nw mo33403c(Context context, String str, tc0 tc0) {
        try {
            IBinder n6 = ((C8029ow) mo42606b(context)).mo34016n6(C10489b.m48195m6(context), str, tc0, 214106000);
            if (n6 == null) {
                return null;
            }
            IInterface queryLocalInterface = n6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C7993nw ? (C7993nw) queryLocalInterface : new C7919lw(n6);
        } catch (RemoteException | C10490c.C10491a e) {
            co0.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
