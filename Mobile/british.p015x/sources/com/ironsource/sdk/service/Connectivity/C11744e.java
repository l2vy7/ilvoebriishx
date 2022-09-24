package com.ironsource.sdk.service.Connectivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.ironsource.p056c.C4946a;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.e */
public class C11744e implements C11742c {

    /* renamed from: a */
    private String f52463a = C11744e.class.getSimpleName();

    /* renamed from: b */
    private int f52464b = 23;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11743d f52465c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f52466d;

    /* renamed from: com.ironsource.sdk.service.Connectivity.e$a */
    class C11745a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a */
        private /* synthetic */ Context f52467a;

        C11745a(Context context) {
            this.f52467a = context;
        }

        public final void onAvailable(Network network) {
            if (network != null) {
                C11743d a = C11744e.this.f52465c;
                String a2 = C4946a.m22689a(network, this.f52467a);
                C4946a.m22690a(this.f52467a, network);
                a.mo44897a(a2);
                return;
            }
            C11743d a3 = C11744e.this.f52465c;
            String a4 = C4946a.m22688a(this.f52467a);
            Context context = this.f52467a;
            C4946a.m22690a(context, C4946a.m22691b(context));
            a3.mo44897a(a4);
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C11744e.this.f52465c.mo44898a(C4946a.m22689a(network, this.f52467a), C4946a.m22690a(this.f52467a, network));
            }
        }

        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C11744e.this.f52465c.mo44898a(C4946a.m22689a(network, this.f52467a), C4946a.m22690a(this.f52467a, network));
            }
        }

        public final void onLost(Network network) {
            if (C4946a.m22688a(this.f52467a).equals("none")) {
                C11744e.this.f52465c.mo44896a();
            }
        }
    }

    public C11744e(C11743d dVar) {
        this.f52465c = dVar;
    }

    /* renamed from: a */
    public final void mo45042a() {
        this.f52466d = null;
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    /* renamed from: a */
    public final void mo45043a(Context context) {
        if (Build.VERSION.SDK_INT >= this.f52464b) {
            mo45044b(context);
            if (C4946a.m22688a(context).equals("none")) {
                this.f52465c.mo44896a();
            }
            if (this.f52466d == null) {
                this.f52466d = new C11745a(context);
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f52466d);
                }
            } catch (Exception unused) {
                Log.e(this.f52463a, "NetworkCallback was not able to register");
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final void mo45044b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f52464b && this.f52466d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f52466d);
            } catch (Exception unused) {
                Log.e(this.f52463a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo45045c(Context context) {
        return C4946a.m22690a(context, C4946a.m22691b(context));
    }
}
