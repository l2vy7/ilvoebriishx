package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.se */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9352se extends C9199j {

    /* renamed from: d */
    private final Callable f45449d;

    public C9352se(String str, Callable callable) {
        super("internal.appMetadata");
        this.f45449d = callable;
    }

    /* renamed from: d */
    public final C9306q mo37655d(C9326r4 r4Var, List list) {
        try {
            return C9360t6.m43660b(this.f45449d.call());
        } catch (Exception unused) {
            return C9306q.f45372d0;
        }
    }
}
