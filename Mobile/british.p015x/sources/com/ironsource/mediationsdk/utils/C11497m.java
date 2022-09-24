package com.ironsource.mediationsdk.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.utils.m */
public final class C11497m {

    /* renamed from: a */
    private Map<String, Integer> f51736a = new HashMap();

    /* renamed from: b */
    private Map<String, Integer> f51737b = new HashMap();

    /* renamed from: com.ironsource.mediationsdk.utils.m$a */
    public interface C11498a {
        /* renamed from: j */
        int mo43925j();

        /* renamed from: k */
        String mo43926k();
    }

    public C11497m(List<C11498a> list) {
        for (C11498a next : list) {
            this.f51736a.put(next.mo43926k(), 0);
            this.f51737b.put(next.mo43926k(), Integer.valueOf(next.mo43925j()));
        }
    }

    /* renamed from: a */
    public final void mo44563a(C11498a aVar) {
        synchronized (this) {
            String k = aVar.mo43926k();
            if (this.f51736a.containsKey(k)) {
                Map<String, Integer> map = this.f51736a;
                map.put(k, Integer.valueOf(map.get(k).intValue() + 1));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo44564a() {
        for (String next : this.f51737b.keySet()) {
            if (this.f51736a.get(next).intValue() < this.f51737b.get(next).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        return r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44565b(com.ironsource.mediationsdk.utils.C11497m.C11498a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r4.mo43926k()     // Catch:{ all -> 0x0025 }
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f51736a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r3.f51736a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0025 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0025 }
            int r4 = r4.mo43925j()     // Catch:{ all -> 0x0025 }
            if (r0 < r4) goto L_0x0021
            r2 = 1
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            return r2
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C11497m.mo44565b(com.ironsource.mediationsdk.utils.m$a):boolean");
    }
}
