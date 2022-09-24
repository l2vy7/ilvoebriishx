package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public abstract class C9415x {

    /* renamed from: a */
    final List f45508a = new ArrayList();

    protected C9415x() {
    }

    /* renamed from: a */
    public abstract C9306q mo37304a(String str, C9326r4 r4Var, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9306q mo38134b(String str) {
        String str2;
        if (this.f45508a.contains(C9343s5.m43608e(str))) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Command not implemented: ".concat(valueOf);
            } else {
                str2 = new String("Command not implemented: ");
            }
            throw new UnsupportedOperationException(str2);
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
