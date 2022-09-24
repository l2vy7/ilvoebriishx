package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7855k5 implements Runnable {

    /* renamed from: b */
    private final C8215u5 f34156b;

    /* renamed from: c */
    private final C7492a6 f34157c;

    /* renamed from: d */
    private final Runnable f34158d;

    public C7855k5(C8215u5 u5Var, C7492a6 a6Var, Runnable runnable) {
        this.f34156b = u5Var;
        this.f34157c = a6Var;
        this.f34158d = runnable;
    }

    public final void run() {
        this.f34156b.zzw();
        if (this.f34157c.mo30310c()) {
            this.f34156b.mo28548c(this.f34157c.f29536a);
        } else {
            this.f34156b.zzn(this.f34157c.f29538c);
        }
        if (this.f34157c.f29539d) {
            this.f34156b.zzm("intermediate-response");
        } else {
            this.f34156b.mo35104d("done");
        }
        Runnable runnable = this.f34158d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
