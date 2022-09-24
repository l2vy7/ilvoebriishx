package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p199d5.C10489b;
import p199d5.C10490c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class vg0 extends C10490c<bh0> {
    public vg0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof bh0 ? (bh0) queryLocalInterface : new zg0(iBinder);
    }

    /* renamed from: c */
    public final yg0 mo35424c(Activity activity) {
        try {
            IBinder zze = ((bh0) mo42606b(activity)).zze(C10489b.m48195m6(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof yg0 ? (yg0) queryLocalInterface : new wg0(zze);
        } catch (RemoteException e) {
            co0.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (C10490c.C10491a e2) {
            co0.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
