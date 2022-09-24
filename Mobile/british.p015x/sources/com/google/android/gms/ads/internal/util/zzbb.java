package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.C7635e6;
import com.google.android.gms.internal.ads.C7820j6;
import com.google.android.gms.internal.ads.C7856k6;
import com.google.android.gms.internal.ads.C8074q5;
import com.google.android.gms.internal.ads.C8111r6;
import com.google.android.gms.internal.ads.C8215u5;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.C8253v6;
import com.google.android.gms.internal.ads.C8287w6;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.C8322x5;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.vn0;
import com.google.android.gms.internal.ads.x80;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbb extends C7856k6 {

    /* renamed from: d */
    private final Context f27852d;

    private zzbb(Context context, C7820j6 j6Var) {
        super(j6Var);
        this.f27852d = context;
    }

    public static C8322x5 zzb(Context context) {
        C8322x5 x5Var = new C8322x5(new C8111r6(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzbb(context, new C8287w6((C8253v6) null, (SSLSocketFactory) null)), 4);
        x5Var.mo35721d();
        return x5Var;
    }

    public final C8074q5 zza(C8215u5<?> u5Var) throws C7635e6 {
        String str;
        if (u5Var.zza() == 0) {
            if (Pattern.matches((String) C8311wv.m39277c().mo18570b(p00.f37026Y2), u5Var.zzk())) {
                C8241uv.m38463b();
                if (vn0.m38855n(this.f27852d, 13400000)) {
                    C8074q5 zza = new x80(this.f27852d).zza(u5Var);
                    if (zza != null) {
                        String valueOf = String.valueOf(u5Var.zzk());
                        zze.zza(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zza;
                    }
                    String valueOf2 = String.valueOf(u5Var.zzk());
                    if (valueOf2.length() != 0) {
                        str = "Failed to get gmscore asset response: ".concat(valueOf2);
                    } else {
                        str = new String("Failed to get gmscore asset response: ");
                    }
                    zze.zza(str);
                }
            }
        }
        return super.zza(u5Var);
    }
}
