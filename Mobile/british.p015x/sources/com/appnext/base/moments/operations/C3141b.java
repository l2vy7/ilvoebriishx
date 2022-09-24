package com.appnext.base.moments.operations;

import com.appnext.base.C3117a;
import com.appnext.base.moments.p028a.p029a.C3130c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appnext.base.moments.operations.b */
public class C3141b {

    /* renamed from: cq */
    private static volatile C3141b f12227cq;

    /* renamed from: cr */
    private List<C3140a> f12228cr = new ArrayList();

    private C3141b() {
    }

    /* renamed from: a */
    private static C3140a m10617a(C3130c cVar) {
        if (cVar == null) {
            return null;
        }
        try {
            String ad = cVar.mo10568ad();
            Object newInstance = Class.forName("com.appnext.base.moments.operations.imp." + ad).getConstructor(new Class[]{C3130c.class}).newInstance(new Object[]{cVar});
            if (newInstance instanceof C3140a) {
                return (C3140a) newInstance;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return null;
    }

    /* renamed from: aj */
    public static C3141b m10618aj() {
        if (f12227cq == null) {
            synchronized (C3141b.class) {
                if (f12227cq == null) {
                    f12227cq = new C3141b();
                }
            }
        }
        return f12227cq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        com.appnext.base.C3117a.m10553a("OperationsManager$startOperation", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10581b(com.appnext.base.moments.p028a.p029a.C3130c r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            com.appnext.base.moments.operations.a r0 = m10617a(r4)     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            monitor-enter(r3)     // Catch:{ all -> 0x0036 }
            java.util.List<com.appnext.base.moments.operations.a> r1 = r3.f12228cr     // Catch:{ all -> 0x0033 }
            r1.add(r0)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            com.appnext.base.b.b r0 = com.appnext.base.p027b.C3126b.m10572ak()     // Catch:{ all -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.mo10568ad()     // Catch:{ all -> 0x0036 }
            r1.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "_lastupdate"
            r1.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0036 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0036 }
            r0.mo10550b((java.lang.String) r4, (long) r1)     // Catch:{ all -> 0x0036 }
            r4 = 0
            throw r4     // Catch:{ all -> 0x0036 }
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r4     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r4 = move-exception
            java.lang.String r0 = "OperationsManager$startOperation"
            com.appnext.base.C3117a.m10553a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.moments.operations.C3141b.mo10581b(com.appnext.base.moments.a.a.c):void");
    }

    /* renamed from: c */
    public final void mo10582c(C3130c cVar) {
        if (cVar != null) {
            try {
                m10617a(cVar);
            } catch (Throwable th) {
                C3117a.m10553a("OperationsManager$cancelOperation", th);
            }
        }
    }
}
