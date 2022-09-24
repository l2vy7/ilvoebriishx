package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import p198d5.C10489b;
import p198d5.C10490c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class s50 extends C10490c<d40> {
    public s50() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof d40 ? (d40) queryLocalInterface : new b40(iBinder);
    }

    /* renamed from: c */
    public final a40 mo34662c(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        try {
            IBinder z4 = ((d40) mo42606b(view.getContext())).mo30620z4(C10489b.m48195m6(view), C10489b.m48195m6(hashMap), C10489b.m48195m6(hashMap2));
            if (z4 == null) {
                return null;
            }
            IInterface queryLocalInterface = z4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof a40 ? (a40) queryLocalInterface : new y30(z4);
        } catch (RemoteException | C10490c.C10491a e) {
            co0.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
