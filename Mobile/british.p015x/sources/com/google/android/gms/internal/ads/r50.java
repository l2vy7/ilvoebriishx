package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p199d5.C10489b;
import p199d5.C10490c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class r50 extends C10490c<x30> {
    public r50() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof x30 ? (x30) queryLocalInterface : new v30(iBinder);
    }

    /* renamed from: c */
    public final u30 mo34500c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder Y3 = ((x30) mo42606b(context)).mo35355Y3(C10489b.m48195m6(context), C10489b.m48195m6(frameLayout), C10489b.m48195m6(frameLayout2), 214106000);
            if (Y3 == null) {
                return null;
            }
            IInterface queryLocalInterface = Y3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof u30 ? (u30) queryLocalInterface : new s30(Y3);
        } catch (RemoteException | C10490c.C10491a e) {
            co0.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
