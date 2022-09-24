package com.appnext.base.moments.services.p031a;

import android.content.Context;
import androidx.work.C1427e;
import androidx.work.C1429f;
import androidx.work.C1430g;
import androidx.work.C1486o;
import androidx.work.C1495r;
import androidx.work.C1503x;
import com.appnext.base.C3117a;
import com.appnext.base.moments.p027a.p028a.C3130c;
import com.appnext.base.moments.services.OperationWorkManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.appnext.base.moments.services.a.b */
public final class C3146b extends C3145a {

    /* renamed from: aM */
    private Context f12229aM;

    public C3146b(Context context) {
        try {
            this.f12229aM = context.getApplicationContext();
        } catch (Throwable th) {
            C3117a.m10553a("WorkManagerLogic$WorkManagerLogic", th);
        }
    }

    /* renamed from: e */
    private static C1427e m10630e(C3130c cVar) {
        try {
            return new C1427e.C1428a().mo6911f("key", cVar.mo10568ad()).mo6911f("key", cVar.mo10568ad()).mo6911f("cycle", cVar.mo10566ab()).mo6911f("cycle_type", cVar.mo10567ac()).mo6911f("sample", cVar.mo10564Z()).mo6911f("sample_type", cVar.mo10565aa()).mo6911f("service_key", cVar.mo10569ae()).mo6911f(IronSourceConstants.EVENTS_STATUS, cVar.mo10563Y()).mo6911f("data", (cVar.mo10570af() != null ? cVar.mo10570af() : new JSONObject()).toString()).mo6906a();
        } catch (Throwable th) {
            C3117a.m10553a("WorkManagerLogic$createDataFromConfigDataModel", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo10584a(C3130c cVar, long j, long j2) {
        Class<OperationWorkManager> cls = OperationWorkManager.class;
        try {
            C1427e e = m10630e(cVar);
            if (j2 == 0) {
                C1503x.m7802j(this.f12229aM).mo7046h(cVar.mo10568ad(), C1430g.REPLACE, (C1486o) ((C1486o.C1487a) ((C1486o.C1487a) ((C1486o.C1487a) new C1486o.C1487a(cls).mo7056g(e)).mo7056g(e)).mo7052a(cVar.mo10568ad())).mo7053b());
                return;
            }
            if (j2 < 0 || (j2 > 0 && j2 < 900000)) {
                j2 = 900000;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1495r.C1496a aVar = (C1495r.C1496a) ((C1495r.C1496a) new C1495r.C1496a(cls, j2, timeUnit).mo7056g(e)).mo7052a(cVar.mo10568ad());
            if (j > System.currentTimeMillis()) {
                aVar.mo7055f(Math.max(j - System.currentTimeMillis(), 60000), timeUnit);
            }
            C1503x.m7802j(this.f12229aM).mo7045g(cVar.mo10568ad(), C1429f.REPLACE, (C1495r) aVar.mo7053b());
        } catch (Throwable th) {
            C3117a.m10553a("WorkManagerLogic$scheduleOperation", th);
        }
    }

    /* renamed from: d */
    public final void mo10588d(C3130c cVar) {
        try {
            C1503x.m7802j(this.f12229aM).mo7041c(cVar.mo10569ae());
        } catch (Throwable th) {
            C3117a.m10553a("WorkManagerLogic$cancelOperationLogic", th);
        }
    }
}
