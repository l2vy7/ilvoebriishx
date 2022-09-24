package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7231d;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.internal.v2 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7323v2<A extends C7231d<? extends C7341k, C7191a.C7193b>> extends C7339z2 {

    /* renamed from: b */
    protected final A f29161b;

    public C7323v2(int i, A a) {
        super(i);
        this.f29161b = (C7231d) C4604n.m20099l(a, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo29920a(Status status) {
        try {
            this.f29161b.mo29848w(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: b */
    public final void mo29921b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f29161b.mo29848w(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: c */
    public final void mo29922c(C4596m1<?> m1Var) throws DeadObjectException {
        try {
            this.f29161b.mo29847u(m1Var.mo17958s());
        } catch (RuntimeException e) {
            mo29921b(e);
        }
    }

    /* renamed from: d */
    public final void mo29949d(C7336z zVar, boolean z) {
        zVar.mo29953c(this.f29161b, z);
    }
}
