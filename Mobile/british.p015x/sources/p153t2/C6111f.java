package p153t2;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0600b;
import p153t2.C6106c;

/* renamed from: t2.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C6111f implements C6108d {
    /* renamed from: a */
    public C6106c mo23429a(Context context, C6106c.C6107a aVar) {
        boolean z = C0600b.m3289a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new C6109e(context, aVar);
        }
        return new C6115j();
    }
}
