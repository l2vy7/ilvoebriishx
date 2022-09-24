package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d */
final class C8876d extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C8866c f44489a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8876d(C8866c cVar, Handler handler) {
        super((Handler) null);
        this.f44489a = cVar;
    }

    public final void onChange(boolean z) {
        this.f44489a.mo36857d();
        this.f44489a.m41637f();
    }
}
