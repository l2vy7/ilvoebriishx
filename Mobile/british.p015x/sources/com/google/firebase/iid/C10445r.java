package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.r */
public final class C10445r extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzb f48910b;

    C10445r(zzb zzb) {
        this.f48910b = zzb;
    }

    /* renamed from: b */
    public final void mo41909b(C10443p pVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }
            if (this.f48910b.mo41919d(pVar.f48904a)) {
                pVar.mo41907a();
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }
            this.f48910b.f48932b.execute(new C10446s(this, pVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
