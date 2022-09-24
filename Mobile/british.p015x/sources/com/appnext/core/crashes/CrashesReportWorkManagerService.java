package com.appnext.core.crashes;

import android.content.Context;
import androidx.work.C1423c;
import androidx.work.C1427e;
import androidx.work.C1430g;
import androidx.work.C1485n;
import androidx.work.C1486o;
import androidx.work.C1503x;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CrashesReportWorkManagerService extends Worker {
    public CrashesReportWorkManagerService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static void m10708a(Context context, String str, String str2) {
        Class<CrashesReportWorkManagerService> cls = CrashesReportWorkManagerService.class;
        try {
            C1427e a = new C1427e.C1428a().mo6911f("methodName", str).mo6911f("exception", str2).mo6906a();
            C1423c.C1424a aVar = new C1423c.C1424a();
            aVar.mo6889b(C1485n.CONNECTED);
            C1423c a2 = aVar.mo6888a();
            String simpleName = cls.getSimpleName();
            C1503x.m7802j(context).mo7046h(simpleName, C1430g.APPEND, (C1486o) ((C1486o.C1487a) ((C1486o.C1487a) ((C1486o.C1487a) ((C1486o.C1487a) new C1486o.C1487a(cls).mo7056g(a)).mo7056g(a)).mo7052a(simpleName)).mo7054e(a2)).mo7053b());
        } catch (Throwable unused) {
        }
    }

    public ListenableWorker.C1412a doWork() {
        try {
            C1427e inputData = getInputData();
            if (inputData == null) {
                return ListenableWorker.C1412a.m7513c();
            }
            new C3177a(getApplicationContext(), inputData.mo6903j("methodName"), inputData.mo6903j("exception")).mo10766aE();
            return ListenableWorker.C1412a.m7513c();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
