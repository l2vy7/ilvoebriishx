package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.j1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7401j1 implements ServiceConnection, C7413n1 {

    /* renamed from: b */
    private final Map<ServiceConnection, ServiceConnection> f29328b = new HashMap();

    /* renamed from: c */
    private int f29329c = 2;

    /* renamed from: d */
    private boolean f29330d;

    /* renamed from: e */
    private IBinder f29331e;

    /* renamed from: f */
    private final C7398i1 f29332f;

    /* renamed from: g */
    private ComponentName f29333g;

    /* renamed from: h */
    final /* synthetic */ C7411m1 f29334h;

    public C7401j1(C7411m1 m1Var, C7398i1 i1Var) {
        this.f29334h = m1Var;
        this.f29332f = i1Var;
    }

    /* renamed from: a */
    public final int mo30119a() {
        return this.f29329c;
    }

    /* renamed from: b */
    public final ComponentName mo30120b() {
        return this.f29333g;
    }

    /* renamed from: c */
    public final IBinder mo30121c() {
        return this.f29331e;
    }

    /* renamed from: d */
    public final void mo30122d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f29328b.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo30123e(String str, Executor executor) {
        this.f29329c = 3;
        C7411m1 m1Var = this.f29334h;
        boolean d = m1Var.f29343j.mo24300d(m1Var.f29340g, str, this.f29332f.mo30111c(m1Var.f29340g), this, this.f29332f.mo30109a(), executor);
        this.f29330d = d;
        if (d) {
            this.f29334h.f29341h.sendMessageDelayed(this.f29334h.f29341h.obtainMessage(1, this.f29332f), this.f29334h.f29345l);
            return;
        }
        this.f29329c = 2;
        try {
            C7411m1 m1Var2 = this.f29334h;
            m1Var2.f29343j.mo24299c(m1Var2.f29340g, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void mo30124f(ServiceConnection serviceConnection, String str) {
        this.f29328b.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo30125g(String str) {
        this.f29334h.f29341h.removeMessages(1, this.f29332f);
        C7411m1 m1Var = this.f29334h;
        m1Var.f29343j.mo24299c(m1Var.f29340g, this);
        this.f29330d = false;
        this.f29329c = 2;
    }

    /* renamed from: h */
    public final boolean mo30126h(ServiceConnection serviceConnection) {
        return this.f29328b.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo30127i() {
        return this.f29328b.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo30128j() {
        return this.f29330d;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f29334h.f29339f) {
            this.f29334h.f29341h.removeMessages(1, this.f29332f);
            this.f29331e = iBinder;
            this.f29333g = componentName;
            for (ServiceConnection onServiceConnected : this.f29328b.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f29329c = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f29334h.f29339f) {
            this.f29334h.f29341h.removeMessages(1, this.f29332f);
            this.f29331e = null;
            this.f29333g = componentName;
            for (ServiceConnection onServiceDisconnected : this.f29328b.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f29329c = 2;
        }
    }
}
