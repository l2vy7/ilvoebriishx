package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.r3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7304r3 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ LifecycleCallback f29103b;

    /* renamed from: c */
    final /* synthetic */ String f29104c;

    /* renamed from: d */
    final /* synthetic */ C7309s3 f29105d;

    C7304r3(C7309s3 s3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f29105d = s3Var;
        this.f29103b = lifecycleCallback;
        this.f29104c = str;
    }

    public final void run() {
        C7309s3 s3Var = this.f29105d;
        if (s3Var.f29136c > 0) {
            this.f29103b.onCreate(s3Var.f29137d != null ? s3Var.f29137d.getBundle(this.f29104c) : null);
        }
        if (this.f29105d.f29136c >= 2) {
            this.f29103b.onStart();
        }
        if (this.f29105d.f29136c >= 3) {
            this.f29103b.onResume();
        }
        if (this.f29105d.f29136c >= 4) {
            this.f29103b.onStop();
        }
        if (this.f29105d.f29136c >= 5) {
            this.f29103b.onDestroy();
        }
    }
}
