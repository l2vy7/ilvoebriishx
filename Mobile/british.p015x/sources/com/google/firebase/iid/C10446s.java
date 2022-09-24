package com.google.firebase.iid;

import android.util.Log;

/* renamed from: com.google.firebase.iid.s */
final class C10446s implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C10443p f48911b;

    /* renamed from: c */
    private final /* synthetic */ C10445r f48912c;

    C10446s(C10445r rVar, C10443p pVar) {
        this.f48912c = rVar;
        this.f48911b = pVar;
    }

    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.f48912c.f48910b.mo41874e(this.f48911b.f48904a);
        this.f48911b.mo41907a();
    }
}
