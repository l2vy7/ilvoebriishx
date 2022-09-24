package com.appnext.core.p034ra.services;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.work.C1427e;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.appnext.base.C3117a;
import com.appnext.core.p034ra.p035a.C3223c;
import com.appnext.core.p034ra.services.C3235a;

/* renamed from: com.appnext.core.ra.services.RecentAppsWorkManagerService */
public class RecentAppsWorkManagerService extends Worker {
    public RecentAppsWorkManagerService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: b */
    private static Bundle m10896b(C1427e eVar) {
        try {
            int h = eVar.mo6900h("action", -1);
            String j = eVar.mo6903j("more_data");
            Bundle bundle = new Bundle();
            bundle.putInt("action", h);
            if (!TextUtils.isEmpty(j)) {
                bundle.putString("more_data", j);
            }
            return bundle;
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsWorkManagerService$createBundleFromData", th);
            return null;
        }
    }

    public ListenableWorker.C1412a doWork() {
        try {
            C1427e inputData = getInputData();
            if (inputData == null) {
                return ListenableWorker.C1412a.m7513c();
            }
            Bundle b = m10896b(inputData);
            int h = inputData.mo6900h("action", -1);
            if (h >= 0) {
                if (h < C3235a.C3236a.values().length) {
                    C3223c.m10865a(getApplicationContext(), C3235a.C3236a.values()[h], b).mo10836aO();
                    return ListenableWorker.C1412a.m7513c();
                }
            }
            return ListenableWorker.C1412a.m7513c();
        } catch (Throwable th) {
            C3117a.m10553a("RecentAppsWorkManagerService$doWork", th);
        }
    }
}
