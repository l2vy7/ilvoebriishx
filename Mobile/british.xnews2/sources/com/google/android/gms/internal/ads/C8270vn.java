package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* renamed from: com.google.android.gms.internal.ads.vn */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C8270vn extends C8348xw {

    /* renamed from: b */
    private final AppEventListener f40471b;

    public C8270vn(AppEventListener appEventListener) {
        this.f40471b = appEventListener;
    }

    /* renamed from: Y */
    public final void mo35445Y(String str, String str2) {
        this.f40471b.onAppEvent(str, str2);
    }

    /* renamed from: o6 */
    public final AppEventListener mo35446o6() {
        return this.f40471b;
    }
}
