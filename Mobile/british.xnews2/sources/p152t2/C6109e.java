package p152t2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import p004a3.C0065j;
import p152t2.C6106c;

/* renamed from: t2.e */
/* compiled from: DefaultConnectivityMonitor */
final class C6109e implements C6106c {

    /* renamed from: b */
    private final Context f25348b;

    /* renamed from: c */
    final C6106c.C6107a f25349c;

    /* renamed from: d */
    boolean f25350d;

    /* renamed from: e */
    private boolean f25351e;

    /* renamed from: f */
    private final BroadcastReceiver f25352f = new C6110a();

    /* renamed from: t2.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C6110a extends BroadcastReceiver {
        C6110a() {
        }

        public void onReceive(Context context, Intent intent) {
            C6109e eVar = C6109e.this;
            boolean z = eVar.f25350d;
            eVar.f25350d = eVar.mo23430i(context);
            if (z != C6109e.this.f25350d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C6109e.this.f25350d);
                }
                C6109e eVar2 = C6109e.this;
                eVar2.f25349c.mo11169a(eVar2.f25350d);
            }
        }
    }

    C6109e(Context context, C6106c.C6107a aVar) {
        this.f25348b = context.getApplicationContext();
        this.f25349c = aVar;
    }

    /* renamed from: j */
    private void m26843j() {
        if (!this.f25351e) {
            this.f25350d = mo23430i(this.f25348b);
            try {
                this.f25348b.registerReceiver(this.f25352f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f25351e = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: k */
    private void m26844k() {
        if (this.f25351e) {
            this.f25348b.unregisterReceiver(this.f25352f);
            this.f25351e = false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: i */
    public boolean mo23430i(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C0065j.m247d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    public void onDestroy() {
    }

    public void onStart() {
        m26843j();
    }

    public void onStop() {
        m26844k();
    }
}
