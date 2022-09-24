package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zx2 {

    /* renamed from: a */
    private boolean f42825a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36144a(Context context) {
        kz2.m34245b(context, "Application Context cannot be null");
        if (!this.f42825a) {
            this.f42825a = true;
            xy2.m39683b().mo35820c(context);
            sy2.m37611a().mo34832c(context);
            iz2.m33499f(context);
            uy2.m38542b().mo35337c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo36145b() {
        return this.f42825a;
    }
}
