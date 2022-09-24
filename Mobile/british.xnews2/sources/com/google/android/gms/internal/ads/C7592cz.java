package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p198d5.C10489b;
import p198d5.C10490c;

/* renamed from: com.google.android.gms.internal.ads.cz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7592cz extends C10490c<C7883kx> {
    public C7592cz() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C7883kx ? (C7883kx) queryLocalInterface : new C7883kx(iBinder);
    }

    /* renamed from: c */
    public final C7846jx mo31056c(Context context) {
        try {
            IBinder n6 = ((C7883kx) mo42606b(context)).mo33206n6(C10489b.m48195m6(context), 214106000);
            if (n6 == null) {
                return null;
            }
            IInterface queryLocalInterface = n6.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C7846jx ? (C7846jx) queryLocalInterface : new C7735gx(n6);
        } catch (RemoteException | C10490c.C10491a e) {
            co0.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
