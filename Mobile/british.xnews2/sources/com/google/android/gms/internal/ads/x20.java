package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class x20 {

    /* renamed from: a */
    private final Context f41005a;

    public x20(Context context) {
        this.f41005a = context;
    }

    /* renamed from: a */
    public final void mo35709a(hi0 hi0) {
        String str;
        String str2;
        try {
            ((y20) ho0.m32903b(this.f41005a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", w20.f40667a)).mo35840n6(hi0);
        } catch (go0 e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(valueOf);
            } else {
                str = new String("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:");
            }
            co0.zzj(str);
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Error calling setFlagsAccessedBeforeInitializedListener: ".concat(valueOf2);
            } else {
                str2 = new String("Error calling setFlagsAccessedBeforeInitializedListener: ");
            }
            co0.zzj(str2);
        }
    }
}
