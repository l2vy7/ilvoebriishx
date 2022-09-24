package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hl2 implements uu3<cj2<JSONObject>> {
    /* renamed from: a */
    public static cj2<JSONObject> m32884a(bn0 bn0, dn0 dn0, Object obj, vj2 vj2, uk2 uk2, ou3<pj2> ou3, ou3<yj2> ou32, ou3<ek2> ou33, ou3<ik2> ou34, ou3<qk2> ou35, ou3<xk2> ou36, ou3<pl2> ou37, ou3<kl2> ou38, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((mk2) obj);
        hashSet.add(vj2);
        hashSet.add(uk2);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37098g4)).booleanValue()) {
            hashSet.add(ou3.zzb());
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37107h4)).booleanValue()) {
            hashSet.add(ou32.zzb());
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37116i4)).booleanValue()) {
            hashSet.add(ou33.zzb());
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37125j4)).booleanValue()) {
            hashSet.add(ou34.zzb());
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37161n4)).booleanValue()) {
            hashSet.add(ou36.zzb());
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37170o4)).booleanValue()) {
            hashSet.add(ou37.zzb());
        }
        return new cj2<>(executor, hashSet);
    }
}
