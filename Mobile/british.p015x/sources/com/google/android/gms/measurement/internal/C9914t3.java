package com.google.android.gms.measurement.internal;

import p193c5.C6519b;
import p193c5.C6520c;

/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9914t3 {

    /* renamed from: a */
    final C4670h4 f46742a;

    C9914t3(C9958x8 x8Var) {
        this.f46742a = x8Var.mo39287b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo39191a() {
        try {
            C6519b a = C6520c.m28321a(this.f46742a.mo19277r());
            if (a == null) {
                this.f46742a.mo19276j().mo19286v().mo38856a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.mo24355f("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f46742a.mo19276j().mo19286v().mo38857b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
