package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class l60 implements e70 {

    /* renamed from: a */
    public static final /* synthetic */ l60 f34916a = new l60();

    private /* synthetic */ l60() {
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map map) {
        zu0 zu0 = (zu0) obj;
        e70<xt0> e70 = d70.f30654a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            co0.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zu0.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb = new StringBuilder(str2.length() + 14 + obj2.length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(obj2);
            zze.zza(sb.toString());
        }
        ((t90) zu0).mo18321Z("openableURLs", hashMap);
    }
}
