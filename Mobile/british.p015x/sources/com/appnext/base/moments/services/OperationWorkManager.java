package com.appnext.base.moments.services;

import android.content.Context;
import androidx.work.C1427e;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.appnext.base.C3117a;
import com.appnext.base.moments.operations.C3141b;
import com.appnext.base.moments.p028a.C3127a;
import com.appnext.base.moments.p028a.p029a.C3130c;
import com.appnext.base.moments.p031b.C3138c;
import com.appnext.base.p027b.C3125a;
import com.appnext.base.p027b.C3126b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class OperationWorkManager extends Worker {
    public OperationWorkManager(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    private static C3130c m10622a(C1427e eVar) {
        try {
            String j = eVar.mo6903j("key");
            String j2 = eVar.mo6903j("cycle");
            String j3 = eVar.mo6903j("cycle_type");
            return new C3130c(eVar.mo6903j(IronSourceConstants.EVENTS_STATUS), eVar.mo6903j("sample"), eVar.mo6903j("sample_type"), j2, j3, j, eVar.mo6903j("service_key"), eVar.mo6903j("data"));
        } catch (Throwable unused) {
            return null;
        }
    }

    public ListenableWorker.C1412a doWork() {
        C3125a.init(getApplicationContext());
        C3126b.m10572ak().init(getApplicationContext());
        C1427e inputData = getInputData();
        if (inputData == null) {
            return ListenableWorker.C1412a.m7513c();
        }
        C3130c a = m10622a(inputData);
        if (a == null) {
            return ListenableWorker.C1412a.m7513c();
        }
        new C3144a();
        Context applicationContext = getApplicationContext();
        String ad = a.mo10568ad();
        try {
            C3126b.m10572ak().init(applicationContext.getApplicationContext());
            C3125a.init(applicationContext.getApplicationContext());
            if (C3138c.m10614c(applicationContext.getApplicationContext())) {
                C3126b.m10572ak().mo10551b("lat", true);
            } else {
                C3130c k = C3127a.m10579Q().mo10557T().mo10576k(ad);
                if (k != null) {
                    C3141b.m10618aj().mo10581b(k);
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("OperationController$scheduleOperation", th);
        }
        return ListenableWorker.C1412a.m7513c();
    }
}
