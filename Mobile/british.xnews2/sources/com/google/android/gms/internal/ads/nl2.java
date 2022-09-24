package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.util.zzcl;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class nl2 implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ nl2 f36043a = new nl2();

    private /* synthetic */ nl2() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) C8311wv.m39277c().mo18570b(p00.f36871F);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) C8311wv.m39277c().mo18570b(p00.f36879G)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzcl.zza(str2));
                }
            }
        }
        return new ql2(hashMap);
    }
}
