package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p228l5.C10723k;

/* renamed from: com.google.android.gms.common.api.internal.g3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7248g3 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    protected volatile boolean f29012b;

    /* renamed from: c */
    protected final AtomicReference<C7235d3> f29013c = new AtomicReference<>((Object) null);

    /* renamed from: d */
    private final Handler f29014d = new C10723k(Looper.getMainLooper());

    /* renamed from: e */
    protected final C7190a f29015e;

    C7248g3(C7254i iVar, C7190a aVar) {
        super(iVar);
        this.f29015e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m29660a(ConnectionResult connectionResult, int i) {
        this.f29013c.set((Object) null);
        mo29807b(connectionResult, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m29661d() {
        this.f29013c.set((Object) null);
        mo29808c();
    }

    /* renamed from: e */
    private static final int m29662e(C7235d3 d3Var) {
        if (d3Var == null) {
            return -1;
        }
        return d3Var.mo29851a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29807b(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo29808c();

    /* renamed from: h */
    public final void mo29860h(ConnectionResult connectionResult, int i) {
        C7235d3 d3Var = new C7235d3(connectionResult, i);
        if (this.f29013c.compareAndSet((Object) null, d3Var)) {
            this.f29014d.post(new C7244f3(this, d3Var));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C7235d3 d3Var = this.f29013c.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f29015e.mo29708i(getActivity());
                if (i3 == 0) {
                    m29661d();
                    return;
                } else if (d3Var != null) {
                    if (d3Var.mo29852b().mo29682C0() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m29661d();
            return;
        } else if (i2 == 0) {
            if (d3Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m29660a(new ConnectionResult(i4, (PendingIntent) null, d3Var.mo29852b().toString()), m29662e(d3Var));
                return;
            }
            return;
        }
        if (d3Var != null) {
            m29660a(d3Var.mo29852b(), d3Var.mo29851a());
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m29660a(new ConnectionResult(13, (PendingIntent) null), m29662e(this.f29013c.get()));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f29013c.set(bundle.getBoolean("resolving_error", false) ? new C7235d3(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C7235d3 d3Var = this.f29013c.get();
        if (d3Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", d3Var.mo29851a());
            bundle.putInt("failed_status", d3Var.mo29852b().mo29682C0());
            bundle.putParcelable("failed_resolution", d3Var.mo29852b().mo29684E0());
        }
    }

    public void onStart() {
        super.onStart();
        this.f29012b = true;
    }

    public void onStop() {
        super.onStop();
        this.f29012b = false;
    }
}
