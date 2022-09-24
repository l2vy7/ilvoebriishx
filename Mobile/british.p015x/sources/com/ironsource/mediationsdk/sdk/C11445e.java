package com.ironsource.mediationsdk.sdk;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.sdk.e */
public final class C11445e {

    /* renamed from: b */
    private static C11445e f51464b;

    /* renamed from: a */
    private JSONObject f51465a = new JSONObject();

    private C11445e() {
    }

    /* renamed from: a */
    public static synchronized C11445e m51160a() {
        C11445e eVar;
        synchronized (C11445e.class) {
            if (f51464b == null) {
                f51464b = new C11445e();
            }
            eVar = f51464b;
        }
        return eVar;
    }

    /* renamed from: a */
    public final synchronized String mo44496a(String str) {
        return this.f51465a.optString(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44497a(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            org.json.JSONObject r0 = r1.f51465a     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x000b, all -> 0x0008 }
            monitor-exit(r1)
            return
        L_0x0008:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x000b:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.sdk.C11445e.mo44497a(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: a */
    public final synchronized void mo44498a(Map<String, Object> map) {
        if (map != null) {
            for (String next : map.keySet()) {
                mo44497a(next, map.get(next));
            }
        }
    }

    /* renamed from: b */
    public final synchronized JSONObject mo44499b() {
        return this.f51465a;
    }
}
