package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.t3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7314t3 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ LifecycleCallback f29146b;

    /* renamed from: c */
    final /* synthetic */ String f29147c;

    /* renamed from: d */
    final /* synthetic */ C7319u3 f29148d;

    C7314t3(C7319u3 u3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f29148d = u3Var;
        this.f29146b = lifecycleCallback;
        this.f29147c = str;
    }

    public final void run() {
        C7319u3 u3Var = this.f29148d;
        if (u3Var.f29155n0 > 0) {
            this.f29146b.onCreate(u3Var.f29156o0 != null ? u3Var.f29156o0.getBundle(this.f29147c) : null);
        }
        if (this.f29148d.f29155n0 >= 2) {
            this.f29146b.onStart();
        }
        if (this.f29148d.f29155n0 >= 3) {
            this.f29146b.onResume();
        }
        if (this.f29148d.f29155n0 >= 4) {
            this.f29146b.onStop();
        }
        if (this.f29148d.f29155n0 >= 5) {
            this.f29146b.onDestroy();
        }
    }
}
