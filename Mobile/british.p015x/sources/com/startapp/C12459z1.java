package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.z1 */
/* compiled from: Sta */
public class C12459z1 {

    /* renamed from: a */
    public final Context f55186a;

    /* renamed from: b */
    public final ConnectivityManager.NetworkCallback f55187b;

    /* renamed from: c */
    public final ConnectivityManager.OnNetworkActiveListener f55188c;

    /* renamed from: d */
    public final List<C12462z2<Void>> f55189d = new LinkedList();

    /* renamed from: e */
    public final AtomicBoolean f55190e = new AtomicBoolean(false);

    /* renamed from: com.startapp.z1$a */
    /* compiled from: Sta */
    public class C12460a extends ConnectivityManager.NetworkCallback {
        public C12460a() {
        }

        public void onAvailable(Network network) {
            C12459z1 z1Var = C12459z1.this;
            synchronized (z1Var) {
                for (C12462z2<Void> call : z1Var.f55189d) {
                    call.call();
                }
            }
        }
    }

    /* renamed from: com.startapp.z1$b */
    /* compiled from: Sta */
    public class C12461b implements ConnectivityManager.OnNetworkActiveListener {
        public C12461b() {
        }

        public void onNetworkActive() {
            C12459z1 z1Var = C12459z1.this;
            synchronized (z1Var) {
                for (C12462z2<Void> call : z1Var.f55189d) {
                    call.call();
                }
            }
        }
    }

    public C12459z1(Context context) {
        this.f55186a = context;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            this.f55187b = new C12460a();
            this.f55188c = null;
        } else if (i >= 21) {
            this.f55187b = null;
            this.f55188c = new C12461b();
        } else {
            this.f55187b = null;
            this.f55188c = null;
        }
    }

    /* renamed from: a */
    public boolean mo46842a() {
        if (C12437y.m53782a(this.f55186a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f55186a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
        return true;
    }
}
