package com.appnext.core.p035ra.services.p038a;

import android.content.Context;
import android.os.Bundle;
import androidx.work.C1423c;
import androidx.work.C1427e;
import androidx.work.C1429f;
import androidx.work.C1430g;
import androidx.work.C1485n;
import androidx.work.C1486o;
import androidx.work.C1495r;
import androidx.work.C1500v;
import androidx.work.C1503x;
import com.appnext.base.C3117a;
import com.appnext.core.p035ra.p037b.C3227a;
import com.appnext.core.p035ra.services.RecentAppsWorkManagerService;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appnext.core.ra.services.a.b */
public final class C3238b extends C3237a {
    public C3238b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[Catch:{ all -> 0x003d }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10854F(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = r4.getContext()     // Catch:{ all -> 0x003d }
            androidx.work.x r1 = androidx.work.C1503x.m7802j(r1)     // Catch:{ all -> 0x003d }
            com.google.common.util.concurrent.b r5 = r1.mo7048k(r5)     // Catch:{ all -> 0x003d }
            java.lang.Object r1 = r5.get()     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x003d }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x003d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x003d }
        L_0x001e:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x003d }
            androidx.work.w r1 = (androidx.work.C1501w) r1     // Catch:{ all -> 0x003d }
            androidx.work.w$a r2 = r1.mo7034a()     // Catch:{ all -> 0x003d }
            androidx.work.w$a r3 = androidx.work.C1501w.C1502a.RUNNING     // Catch:{ all -> 0x003d }
            if (r2 == r3) goto L_0x003a
            androidx.work.w$a r1 = r1.mo7034a()     // Catch:{ all -> 0x003d }
            androidx.work.w$a r2 = androidx.work.C1501w.C1502a.ENQUEUED     // Catch:{ all -> 0x003d }
            if (r1 != r2) goto L_0x001e
        L_0x003a:
            r5 = 1
            return r5
        L_0x003c:
            return r0
        L_0x003d:
            r5 = move-exception
            java.lang.String r1 = "RecentAppsWorkManagerLogic$isRAServicesScheduled"
            com.appnext.base.C3117a.m10553a(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.p035ra.services.p038a.C3238b.mo10854F(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo10855G(String str) {
        C1503x.m7802j(getContext()).mo7042d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10856a(C3227a aVar) {
        Class<RecentAppsWorkManagerService> cls = RecentAppsWorkManagerService.class;
        try {
            C1427e a = m10911a(aVar.mo10839aP());
            String name = aVar.mo10840aT().name();
            if (aVar.mo10841aU() == 0) {
                C1503x.m7802j(getContext()).mo7046h(name, C1430g.APPEND, (C1486o) ((C1486o.C1487a) ((C1486o.C1487a) ((C1486o.C1487a) new C1486o.C1487a(cls).mo7056g(a)).mo7056g(a)).mo7052a(name)).mo7053b());
                return;
            }
            long aU = aVar.mo10841aU();
            if (aVar.mo10841aU() < 0 || (aVar.mo10841aU() > 0 && aVar.mo10841aU() < 900000)) {
                aU = 900000;
            }
            C1423c.C1424a aVar2 = new C1423c.C1424a();
            aVar2.mo6889b(C1485n.CONNECTED);
            C1423c a2 = aVar2.mo6888a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1495r.C1496a aVar3 = (C1495r.C1496a) ((C1495r.C1496a) ((C1495r.C1496a) new C1495r.C1496a(cls, aU, timeUnit).mo7054e(a2)).mo7056g(a)).mo7052a(name);
            if (aVar.mo10842aV() > 0) {
                aVar3.mo7055f(Math.max(aVar.mo10842aV(), 60000), timeUnit);
            }
            C1503x.m7802j(getContext()).mo7045g(name, C1429f.REPLACE, (C1495r) aVar3.mo7053b());
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsWorkManagerLogic$scheduleEvent", th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo10861d(List<C3227a> list) {
        try {
            int size = list.size();
            C1500v vVar = null;
            for (int i = 0; i < size; i++) {
                C3227a aVar = list.get(i);
                C1427e a = m10911a(aVar.mo10839aP());
                C1486o oVar = (C1486o) ((C1486o.C1487a) ((C1486o.C1487a) ((C1486o.C1487a) new C1486o.C1487a(RecentAppsWorkManagerService.class).mo7056g(a)).mo7056g(a)).mo7052a(aVar.mo10840aT().name())).mo7053b();
                if (i == 0) {
                    vVar = C1503x.m7802j(getContext()).mo7039a(oVar);
                } else {
                    vVar = vVar.mo7032b(oVar);
                }
            }
            if (vVar != null) {
                vVar.mo7031a();
            }
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsWorkManagerLogic$scheduleEventsOrdered", th);
        }
    }

    /* renamed from: a */
    private static C1427e m10911a(Bundle bundle) {
        try {
            return new C1427e.C1428a().mo6910e("action", bundle.getInt("action")).mo6911f("more_data", bundle.getString("more_data")).mo6906a();
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsWorkManagerLogic$createDataFromBundle", th);
            return null;
        }
    }
}
