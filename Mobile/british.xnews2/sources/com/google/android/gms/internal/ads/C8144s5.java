package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8144s5 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ String f38874b;

    /* renamed from: c */
    final /* synthetic */ long f38875c;

    /* renamed from: d */
    final /* synthetic */ C8215u5 f38876d;

    C8144s5(C8215u5 u5Var, String str, long j) {
        this.f38876d = u5Var;
        this.f38874b = str;
        this.f38875c = j;
    }

    public final void run() {
        this.f38876d.f39769b.mo32017a(this.f38874b, this.f38875c);
        this.f38876d.f39769b.mo32018b(this.f38876d.toString());
    }
}
