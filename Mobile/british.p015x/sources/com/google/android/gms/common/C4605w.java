package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.w */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
class C4605w {

    /* renamed from: d */
    private static final C4605w f20071d = new C4605w(true, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f20072a;
    @Nullable

    /* renamed from: b */
    final String f20073b;
    @Nullable

    /* renamed from: c */
    final Throwable f20074c;

    C4605w(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f20072a = z;
        this.f20073b = str;
        this.f20074c = th;
    }

    /* renamed from: b */
    static C4605w m20105b() {
        return f20071d;
    }

    /* renamed from: c */
    static C4605w m20106c(String str) {
        return new C4605w(false, str, (Throwable) null);
    }

    /* renamed from: d */
    static C4605w m20107d(String str, Throwable th) {
        return new C4605w(false, str, th);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public String mo18008a() {
        return this.f20073b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo18009e() {
        if (!this.f20072a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f20074c != null) {
                Log.d("GoogleCertificatesRslt", mo18008a(), this.f20074c);
            } else {
                Log.d("GoogleCertificatesRslt", mo18008a());
            }
        }
    }
}
