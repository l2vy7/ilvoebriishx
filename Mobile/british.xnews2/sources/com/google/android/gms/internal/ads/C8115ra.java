package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ra */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8115ra implements c23 {

    /* renamed from: a */
    final /* synthetic */ f03 f38608a;

    C8115ra(C8184ta taVar, f03 f03) {
        this.f38608a = f03;
    }

    /* renamed from: a */
    public final boolean mo30844a(File file) {
        try {
            return this.f38608a.mo31707a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
