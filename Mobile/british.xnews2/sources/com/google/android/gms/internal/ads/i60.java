package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class i60 implements e70 {

    /* renamed from: a */
    public static final /* synthetic */ i60 f33104a = new i60();

    private /* synthetic */ i60() {
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        zu0 zu0 = (zu0) obj;
        e70<xt0> e70 = d70.f30654a;
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37037Z5)).booleanValue()) {
            co0.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            co0.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zu0.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + obj2.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(obj2);
        zze.zza(sb.toString());
        ((t90) zu0).mo18321Z("openableApp", hashMap);
    }
}
