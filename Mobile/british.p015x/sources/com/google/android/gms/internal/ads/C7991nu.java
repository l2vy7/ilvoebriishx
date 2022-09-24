package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p199d5.C10489b;
import p199d5.C10490c;

/* renamed from: com.google.android.gms.internal.ads.nu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7991nu extends C10490c<C8170sw> {

    /* renamed from: c */
    private bi0 f36134c;

    public C7991nu() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo30142a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C8170sw ? (C8170sw) queryLocalInterface : new C8170sw(iBinder);
    }

    /* renamed from: c */
    public final C8136rw mo33762c(Context context, zzbfi zzbfi, String str, tc0 tc0, int i) {
        p00.m35913c(context);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37110h7)).booleanValue()) {
            try {
                IBinder n6 = ((C8170sw) ho0.m32903b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", C7955mu.f35618a)).mo34804n6(C10489b.m48195m6(context), zzbfi, str, tc0, 214106000, i);
                if (n6 == null) {
                    return null;
                }
                IInterface queryLocalInterface = n6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof C8136rw ? (C8136rw) queryLocalInterface : new C8065pw(n6);
            } catch (RemoteException | go0 | NullPointerException e) {
                bi0 c = zh0.m21287c(context);
                this.f36134c = c;
                c.mo19058b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                co0.zzl("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder n62 = ((C8170sw) mo42606b(context)).mo34804n6(C10489b.m48195m6(context), zzbfi, str, tc0, 214106000, i);
                if (n62 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = n62.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof C8136rw ? (C8136rw) queryLocalInterface2 : new C8065pw(n62);
            } catch (RemoteException | C10490c.C10491a e2) {
                co0.zzf("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
