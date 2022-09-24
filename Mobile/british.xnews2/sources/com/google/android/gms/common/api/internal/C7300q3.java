package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.q3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7300q3 implements C7312t1 {

    /* renamed from: a */
    final /* synthetic */ C7324w f29100a;

    /* synthetic */ C7300q3(C7324w wVar, C7295p3 p3Var) {
        this.f29100a = wVar;
    }

    /* renamed from: a */
    public final void mo29811a(Bundle bundle) {
        this.f29100a.f29174n.lock();
        try {
            this.f29100a.f29172l = ConnectionResult.f28862f;
            C7324w.m29866y(this.f29100a);
        } finally {
            this.f29100a.f29174n.unlock();
        }
    }

    /* renamed from: b */
    public final void mo29812b(int i, boolean z) {
        Lock s;
        this.f29100a.f29174n.lock();
        try {
            C7324w wVar = this.f29100a;
            if (wVar.f29173m) {
                wVar.f29173m = false;
                C7324w.m29864w(this.f29100a, i, z);
                s = this.f29100a.f29174n;
            } else {
                wVar.f29173m = true;
                this.f29100a.f29165e.onConnectionSuspended(i);
                s = this.f29100a.f29174n;
            }
            s.unlock();
        } catch (Throwable th) {
            this.f29100a.f29174n.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo29813c(ConnectionResult connectionResult) {
        this.f29100a.f29174n.lock();
        try {
            this.f29100a.f29172l = connectionResult;
            C7324w.m29866y(this.f29100a);
        } finally {
            this.f29100a.f29174n.unlock();
        }
    }
}
