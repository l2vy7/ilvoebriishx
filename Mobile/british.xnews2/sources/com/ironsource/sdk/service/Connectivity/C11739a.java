package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.p055c.C4946a;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.a */
public final class C11739a implements C11742c {

    /* renamed from: a */
    final C11743d f52459a;

    /* renamed from: b */
    private BroadcastReceiver f52460b = new C11740a();

    /* renamed from: com.ironsource.sdk.service.Connectivity.a$a */
    class C11740a extends BroadcastReceiver {
        C11740a() {
        }

        public void onReceive(Context context, Intent intent) {
            String a = C4946a.m22688a(context);
            if (a.equals("none")) {
                C11739a.this.f52459a.mo44896a();
                return;
            }
            C11743d dVar = C11739a.this.f52459a;
            new JSONObject();
            dVar.mo44897a(a);
        }
    }

    public C11739a(C11743d dVar) {
        this.f52459a = dVar;
    }

    /* renamed from: a */
    public final void mo45042a() {
        this.f52460b = null;
    }

    /* renamed from: a */
    public final void mo45043a(Context context) {
        try {
            context.registerReceiver(this.f52460b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo45044b(Context context) {
        try {
            context.unregisterReceiver(this.f52460b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e);
        }
    }

    /* renamed from: c */
    public final JSONObject mo45045c(Context context) {
        return new JSONObject();
    }
}
