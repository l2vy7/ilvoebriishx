package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C7254i;

/* renamed from: com.google.android.gms.common.internal.a0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7370a0 extends C7373b0 {

    /* renamed from: b */
    final /* synthetic */ Intent f29303b;

    /* renamed from: c */
    final /* synthetic */ C7254i f29304c;

    C7370a0(Intent intent, C7254i iVar, int i) {
        this.f29303b = intent;
        this.f29304c = iVar;
    }

    /* renamed from: a */
    public final void mo30039a() {
        Intent intent = this.f29303b;
        if (intent != null) {
            this.f29304c.startActivityForResult(intent, 2);
        }
    }
}
