package p157u1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.C1483m;
import p085h0.C5369a;
import p146s1.C6014b;
import p178y1.C6400a;

/* renamed from: u1.e */
/* compiled from: NetworkStateTracker */
public class C6181e extends C6179d<C6014b> {

    /* renamed from: j */
    static final String f25528j = C1483m.m7773f("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f25529g = ((ConnectivityManager) this.f25522b.getSystemService("connectivity"));

    /* renamed from: h */
    private C6183b f25530h;

    /* renamed from: i */
    private C6182a f25531i;

    /* renamed from: u1.e$a */
    /* compiled from: NetworkStateTracker */
    private class C6182a extends BroadcastReceiver {
        C6182a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C1483m.m7771c().mo7013a(C6181e.f25528j, "Network broadcast received", new Throwable[0]);
                C6181e eVar = C6181e.this;
                eVar.mo23592d(eVar.mo23594g());
            }
        }
    }

    /* renamed from: u1.e$b */
    /* compiled from: NetworkStateTracker */
    private class C6183b extends ConnectivityManager.NetworkCallback {
        C6183b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C1483m.m7771c().mo7013a(C6181e.f25528j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C6181e eVar = C6181e.this;
            eVar.mo23592d(eVar.mo23594g());
        }

        public void onLost(Network network) {
            C1483m.m7771c().mo7013a(C6181e.f25528j, "Network connection lost", new Throwable[0]);
            C6181e eVar = C6181e.this;
            eVar.mo23592d(eVar.mo23594g());
        }
    }

    public C6181e(Context context, C6400a aVar) {
        super(context, aVar);
        if (m27113j()) {
            this.f25530h = new C6183b();
        } else {
            this.f25531i = new C6182a();
        }
    }

    /* renamed from: j */
    private static boolean m27113j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: e */
    public void mo23587e() {
        if (m27113j()) {
            try {
                C1483m.m7771c().mo7013a(f25528j, "Registering network callback", new Throwable[0]);
                this.f25529g.registerDefaultNetworkCallback(this.f25530h);
            } catch (IllegalArgumentException | SecurityException e) {
                C1483m.m7771c().mo7014b(f25528j, "Received exception while registering network callback", e);
            }
        } else {
            C1483m.m7771c().mo7013a(f25528j, "Registering broadcast receiver", new Throwable[0]);
            this.f25522b.registerReceiver(this.f25531i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: f */
    public void mo23588f() {
        if (m27113j()) {
            try {
                C1483m.m7771c().mo7013a(f25528j, "Unregistering network callback", new Throwable[0]);
                this.f25529g.unregisterNetworkCallback(this.f25530h);
            } catch (IllegalArgumentException | SecurityException e) {
                C1483m.m7771c().mo7014b(f25528j, "Received exception while unregistering network callback", e);
            }
        } else {
            C1483m.m7771c().mo7013a(f25528j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f25522b.unregisterReceiver(this.f25531i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6014b mo23594g() {
        NetworkInfo activeNetworkInfo = this.f25529g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i = mo23596i();
        boolean a = C5369a.m24183a(this.f25529g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C6014b(z2, i, a, z);
    }

    /* renamed from: h */
    public C6014b mo23582b() {
        return mo23594g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo23596i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f25529g.getNetworkCapabilities(this.f25529g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            C1483m.m7771c().mo7014b(f25528j, "Unable to validate active network", e);
            return false;
        }
    }
}
