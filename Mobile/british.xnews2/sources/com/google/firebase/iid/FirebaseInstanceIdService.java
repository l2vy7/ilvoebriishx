package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
public class FirebaseInstanceIdService extends zzb {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Intent mo41873c(Intent intent) {
        return C10434i.m48059c().f48879c.poll();
    }

    /* renamed from: e */
    public final void mo41874e(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo7222f();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(stringExtra.length() + 21 + valueOf.length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m47991a().mo41869y();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m47991a().mo41856C();
            }
        }
    }

    @Deprecated
    /* renamed from: f */
    public void mo7222f() {
    }
}
