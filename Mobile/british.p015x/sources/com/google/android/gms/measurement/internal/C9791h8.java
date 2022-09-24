package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C9318qc;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9791h8 {

    /* renamed from: a */
    final /* synthetic */ C9813j8 f46337a;

    C9791h8(C9813j8 j8Var) {
        this.f46337a = j8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo38977a() {
        this.f46337a.mo19272b();
        if (this.f46337a.f21269a.mo19365F().mo19400v(this.f46337a.f21269a.mo19274f().currentTimeMillis())) {
            this.f46337a.f21269a.mo19365F().f21336l.mo39051a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f46337a.f21269a.mo19276j().mo19286v().mo38856a("Detected application was in foreground");
                mo38979c(this.f46337a.f21269a.mo19274f().currentTimeMillis(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38978b(long j, boolean z) {
        this.f46337a.mo19272b();
        this.f46337a.m45187s();
        if (this.f46337a.f21269a.mo19365F().mo19400v(j)) {
            this.f46337a.f21269a.mo19365F().f21336l.mo39051a(true);
        }
        this.f46337a.f21269a.mo19365F().f21339o.mo39076b(j);
        if (this.f46337a.f21269a.mo19365F().f21336l.mo39052b()) {
            mo38979c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo38979c(long j, boolean z) {
        this.f46337a.mo19272b();
        if (this.f46337a.f21269a.mo19385n()) {
            this.f46337a.f21269a.mo19365F().f21339o.mo39076b(j);
            this.f46337a.f21269a.mo19276j().mo19286v().mo38857b("Session started, time", Long.valueOf(this.f46337a.f21269a.mo19274f().elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f46337a.f21269a.mo19367I().mo38935N(TtmlNode.TEXT_EMPHASIS_AUTO, "_sid", valueOf, j);
            this.f46337a.f21269a.mo19365F().f21336l.mo39051a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f46337a.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46679b0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f46337a.f21269a.mo19367I().mo38957v(TtmlNode.TEXT_EMPHASIS_AUTO, "_s", j, bundle);
            C9318qc.m43515b();
            if (this.f46337a.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46685e0)) {
                String a = this.f46337a.f21269a.mo19365F().f21344t.mo39098a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f46337a.f21269a.mo19367I().mo38957v(TtmlNode.TEXT_EMPHASIS_AUTO, "_ssr", j, bundle2);
                }
            }
        }
    }
}
