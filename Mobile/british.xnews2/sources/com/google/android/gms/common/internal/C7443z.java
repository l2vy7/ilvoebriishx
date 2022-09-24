package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.z */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7443z extends C7373b0 {

    /* renamed from: b */
    final /* synthetic */ Intent f29375b;

    /* renamed from: c */
    final /* synthetic */ Activity f29376c;

    /* renamed from: d */
    final /* synthetic */ int f29377d;

    C7443z(Intent intent, Activity activity, int i) {
        this.f29375b = intent;
        this.f29376c = activity;
        this.f29377d = i;
    }

    /* renamed from: a */
    public final void mo30039a() {
        Intent intent = this.f29375b;
        if (intent != null) {
            this.f29376c.startActivityForResult(intent, this.f29377d);
        }
    }
}
