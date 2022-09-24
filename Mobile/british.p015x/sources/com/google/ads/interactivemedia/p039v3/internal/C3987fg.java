package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fg */
/* compiled from: IMASDK */
final class C3987fg {

    /* renamed from: a */
    private final C3986ff f17053a;

    /* renamed from: b */
    private final Handler f17054b = new Handler();

    /* renamed from: c */
    private boolean f17055c = false;

    C3987fg(C3986ff ffVar) {
        this.f17053a = ffVar;
    }

    /* renamed from: c */
    static final /* synthetic */ void m17117c(C3986ff ffVar, Handler handler) {
        ffVar.mo15779a();
        m17118d(ffVar, handler);
    }

    /* renamed from: d */
    private static void m17118d(C3986ff ffVar, Handler handler) {
        handler.postDelayed(new C3985fe(ffVar, handler), 200);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15780a() {
        if (!this.f17055c) {
            this.f17055c = true;
            this.f17053a.mo15779a();
            m17118d(this.f17053a, this.f17054b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15781b() {
        if (this.f17055c) {
            this.f17055c = false;
            this.f17054b.removeCallbacksAndMessages((Object) null);
        }
    }
}
