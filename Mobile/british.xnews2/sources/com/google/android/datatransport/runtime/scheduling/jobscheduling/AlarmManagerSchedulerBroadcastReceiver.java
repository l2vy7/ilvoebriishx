package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p066d4.C5190a;
import p153t3.C6150m;
import p153t3.C6156r;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m19697a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C6156r.m27012f(context);
        C6150m.C6151a d = C6150m.m26992a().mo23509b(queryParameter).mo23511d(C5190a.m23551b(intValue));
        if (queryParameter2 != null) {
            d.mo23510c(Base64.decode(queryParameter2, 0));
        }
        C6156r.m27010c().mo23539e().mo24293g(d.mo23508a(), i, C4569a.m19699a());
    }
}
