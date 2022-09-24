package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.C7562c5;
import com.google.android.gms.internal.ads.C7564c7;
import com.google.android.gms.internal.ads.C7820j6;
import com.google.android.gms.internal.ads.C8074q5;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.C8322x5;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.mb3;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.uo0;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import p006a5.C6482d;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbs {

    /* renamed from: a */
    private static C8322x5 f19873a;

    /* renamed from: b */
    private static final Object f19874b = new Object();
    @Deprecated
    public static final zzbn<Void> zza = new zzbk();

    public zzbs(Context context) {
        C8322x5 x5Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f19874b) {
            if (f19873a == null) {
                p00.m35913c(context);
                if (!C6482d.m28249a()) {
                    if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37018X2)).booleanValue()) {
                        x5Var = zzbb.zzb(context);
                        f19873a = x5Var;
                    }
                }
                x5Var = C7564c7.m30908a(context, (C7820j6) null);
                f19873a = x5Var;
            }
        }
    }

    public final mb3<C8074q5> zza(String str) {
        uo0 uo0 = new uo0();
        f19873a.mo35718a(new zzbr(str, (Map<String, String>) null, uo0));
        return uo0;
    }

    public final mb3<String> zzb(int i, String str, Map<String, String> map, byte[] bArr) {
        String str2 = str;
        zzbp zzbp = new zzbp((zzbo) null);
        zzbl zzbl = new zzbl(this, str2, zzbp);
        bo0 bo0 = new bo0((String) null);
        zzbm zzbm = new zzbm(this, i, str, zzbp, zzbl, bArr, map, bo0);
        if (bo0.m30771l()) {
            try {
                bo0.mo30739d(str2, "GET", zzbm.zzl(), zzbm.zzx());
            } catch (C7562c5 e) {
                co0.zzj(e.getMessage());
            }
        }
        f19873a.mo35718a(zzbm);
        return zzbp;
    }
}
