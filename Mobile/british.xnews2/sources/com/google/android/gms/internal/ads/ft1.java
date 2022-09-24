package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ft1 {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, et1> f20334a = new HashMap();

    ft1() {
    }

    @Nullable
    /* renamed from: a */
    public final synchronized et1 mo18337a(String str) {
        return this.f20334a.get(str);
    }

    @Nullable
    /* renamed from: b */
    public final et1 mo18338b(List<String> list) {
        for (String a : list) {
            et1 a2 = mo18337a(a);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo18339c(String str, rs2 rs2) {
        if (!this.f20334a.containsKey(str)) {
            try {
                this.f20334a.put(str, new et1(str, rs2.mo34604h(), rs2.mo34605i()));
            } catch (gs2 unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo18340d(String str, te0 te0) {
        if (!this.f20334a.containsKey(str)) {
            try {
                this.f20334a.put(str, new et1(str, te0.zzf(), te0.zzg()));
            } catch (Throwable unused) {
            }
        }
    }
}
