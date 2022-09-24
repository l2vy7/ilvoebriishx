package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C9338s0;
import com.google.android.gms.internal.measurement.C9354t0;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9904s3 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f46728b;

    /* renamed from: c */
    final /* synthetic */ C9914t3 f46729c;

    C9904s3(C9914t3 t3Var, String str) {
        this.f46729c = t3Var;
        this.f46728b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                C9354t0 b2 = C9338s0.m43595b2(iBinder);
                if (b2 == null) {
                    this.f46729c.f46742a.mo19276j().mo19287w().mo38856a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f46729c.f46742a.mo19276j().mo19286v().mo38856a("Install Referrer Service connected");
                this.f46729c.f46742a.mo19273e().mo38909z(new C9894r3(this, b2, this));
            } catch (RuntimeException e) {
                this.f46729c.f46742a.mo19276j().mo19287w().mo38857b("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.f46729c.f46742a.mo19276j().mo19287w().mo38856a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f46729c.f46742a.mo19276j().mo19286v().mo38856a("Install Referrer Service disconnected");
    }
}
