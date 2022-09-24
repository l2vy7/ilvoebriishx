package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.C8311wv;
import com.google.android.gms.internal.ads.p00;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f28078a = ((Integer) C8311wv.m39277c().mo18570b(p00.f37189q5)).intValue();

    /* renamed from: b */
    private final long f28079b = ((Long) C8311wv.m39277c().mo18570b(p00.f37198r5)).longValue();

    /* renamed from: c */
    private final Map<String, Pair<Long, String>> f28080c = Collections.synchronizedMap(new zza(this));

    /* renamed from: b */
    private final void m28879b() {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.f28080c.entrySet().iterator();
            while (it.hasNext() && currentTimeMillis - ((Long) ((Pair) it.next().getValue()).first).longValue() > this.f28079b) {
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            zzt.zzo().mo18592s(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String zzb(String str) {
        Pair pair = this.f28080c.get(str);
        if (pair == null) {
            return null;
        }
        String str2 = (String) pair.second;
        this.f28080c.remove(str);
        return str2;
    }

    public final synchronized void zzc(String str, String str2) {
        this.f28080c.put(str, new Pair(Long.valueOf(zzt.zzA().currentTimeMillis()), str2));
        m28879b();
    }

    public final synchronized void zzd(String str) {
        this.f28080c.remove(str);
    }
}
