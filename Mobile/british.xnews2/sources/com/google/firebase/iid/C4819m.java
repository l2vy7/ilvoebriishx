package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.firebase.iid.m */
final class C4819m extends BroadcastReceiver {
    @Nullable

    /* renamed from: a */
    private C10440l f21620a;

    public C4819m(C10440l lVar) {
        this.f21620a = lVar;
    }

    /* renamed from: a */
    public final void mo20033a() {
        if (FirebaseInstanceId.m48002x()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f21620a.mo41901a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C10440l lVar = this.f21620a;
        if (lVar != null && lVar.mo41902d()) {
            if (FirebaseInstanceId.m48002x()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.m47996j(this.f21620a, 0);
            this.f21620a.mo41901a().unregisterReceiver(this);
            this.f21620a = null;
        }
    }
}
