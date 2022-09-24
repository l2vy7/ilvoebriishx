package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class me2 implements zi2<ne2> {

    /* renamed from: a */
    private final AppSetIdClient f35504a;

    me2(Context context) {
        this.f35504a = AppSet.getClient(context);
    }

    public final mb3<ne2> zzb() {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f36993U1)).booleanValue()) {
            return bb3.m30649i(new ne2((String) null, -1));
        }
        Task<AppSetIdInfo> appSetIdInfo = this.f35504a.getAppSetIdInfo();
        ub3 D = ub3.m38262D();
        appSetIdInfo.addOnCompleteListener(tb3.m37771b(), (OnCompleteListener<AppSetIdInfo>) new e33(D));
        return bb3.m30653m(D, le2.f35014a, po0.f37727f);
    }
}
