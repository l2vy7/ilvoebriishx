package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.o3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7290o3 implements C7312t1 {

    /* renamed from: a */
    final /* synthetic */ C7324w f29088a;

    /* synthetic */ C7290o3(C7324w wVar, C7284n3 n3Var) {
        this.f29088a = wVar;
    }

    /* renamed from: a */
    public final void mo29811a(Bundle bundle) {
        this.f29088a.f29174n.lock();
        try {
            C7324w.m29865x(this.f29088a, bundle);
            this.f29088a.f29171k = ConnectionResult.f28862f;
            C7324w.m29866y(this.f29088a);
        } finally {
            this.f29088a.f29174n.unlock();
        }
    }

    /* renamed from: b */
    public final void mo29812b(int i, boolean z) {
        Lock s;
        this.f29088a.f29174n.lock();
        try {
            C7324w wVar = this.f29088a;
            if (!wVar.f29173m && wVar.f29172l != null) {
                if (wVar.f29172l.mo29686G0()) {
                    this.f29088a.f29173m = true;
                    this.f29088a.f29166f.onConnectionSuspended(i);
                    s = this.f29088a.f29174n;
                    s.unlock();
                }
            }
            this.f29088a.f29173m = false;
            C7324w.m29864w(this.f29088a, i, z);
            s = this.f29088a.f29174n;
            s.unlock();
        } catch (Throwable th) {
            this.f29088a.f29174n.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo29813c(ConnectionResult connectionResult) {
        this.f29088a.f29174n.lock();
        try {
            this.f29088a.f29171k = connectionResult;
            C7324w.m29866y(this.f29088a);
        } finally {
            this.f29088a.f29174n.unlock();
        }
    }
}
