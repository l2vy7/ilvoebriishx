package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.o */
final class C10442o implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Intent f48901b;

    /* renamed from: c */
    private final /* synthetic */ Intent f48902c;

    /* renamed from: d */
    private final /* synthetic */ zzb f48903d;

    C10442o(zzb zzb, Intent intent, Intent intent2) {
        this.f48903d = zzb;
        this.f48901b = intent;
        this.f48902c = intent2;
    }

    public final void run() {
        this.f48903d.mo41874e(this.f48901b);
        this.f48903d.m48122a(this.f48902c);
    }
}
