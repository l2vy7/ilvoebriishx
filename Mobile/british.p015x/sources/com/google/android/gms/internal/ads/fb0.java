package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fb0 implements v90, eb0 {

    /* renamed from: b */
    private final eb0 f31688b;

    /* renamed from: c */
    private final HashSet<AbstractMap.SimpleEntry<String, e70<? super eb0>>> f31689c = new HashSet<>();

    public fb0(eb0 eb0) {
        this.f31688b = eb0;
    }

    /* renamed from: B0 */
    public final void mo18315B0(String str, e70<? super eb0> e70) {
        this.f31688b.mo18315B0(str, e70);
        this.f31689c.remove(new AbstractMap.SimpleEntry(str, e70));
    }

    /* renamed from: E0 */
    public final /* synthetic */ void mo18317E0(String str, JSONObject jSONObject) {
        u90.m38245d(this, str, jSONObject);
    }

    /* renamed from: Z */
    public final /* synthetic */ void mo18321Z(String str, Map map) {
        u90.m38242a(this, str, map);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo18322a(String str, JSONObject jSONObject) {
        u90.m38243b(this, str, jSONObject);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo18325g(String str, String str2) {
        u90.m38244c(this, str, str2);
    }

    /* renamed from: z */
    public final void mo18328z(String str, e70<? super eb0> e70) {
        this.f31688b.mo18328z(str, e70);
        this.f31689c.add(new AbstractMap.SimpleEntry(str, e70));
    }

    public final void zza(String str) {
        this.f31688b.zza(str);
    }

    public final void zzc() {
        String str;
        Iterator<AbstractMap.SimpleEntry<String, e70<? super eb0>>> it = this.f31689c.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((e70) next.getValue()).toString());
            if (valueOf.length() != 0) {
                str = "Unregistering eventhandler: ".concat(valueOf);
            } else {
                str = new String("Unregistering eventhandler: ");
            }
            zze.zza(str);
            this.f31688b.mo18315B0((String) next.getKey(), (e70) next.getValue());
        }
        this.f31689c.clear();
    }
}
