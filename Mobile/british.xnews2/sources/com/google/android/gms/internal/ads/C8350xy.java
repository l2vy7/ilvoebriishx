package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C8350xy extends d90 {

    /* renamed from: b */
    final /* synthetic */ C4632yy f41372b;

    /* synthetic */ C8350xy(C4632yy yyVar, C8314wy wyVar) {
        this.f41372b = yyVar;
    }

    /* renamed from: O4 */
    public final void mo30862O4(List<zzbtn> list) throws RemoteException {
        this.f41372b.f21025d = false;
        this.f41372b.f21026e = true;
        InitializationStatus d = C4632yy.m21236x(list);
        ArrayList h = C4632yy.m21230f().f21022a;
        int size = h.size();
        for (int i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) h.get(i)).onInitializationComplete(d);
        }
        C4632yy.m21230f().f21022a.clear();
    }
}
