package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.q */
final /* synthetic */ class C10444q implements Runnable {

    /* renamed from: b */
    private final C10443p f48908b;

    /* renamed from: c */
    private final Intent f48909c;

    C10444q(C10443p pVar, Intent intent) {
        this.f48908b = pVar;
        this.f48909c = intent;
    }

    public final void run() {
        C10443p pVar = this.f48908b;
        String action = this.f48909c.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        pVar.mo41907a();
    }
}
