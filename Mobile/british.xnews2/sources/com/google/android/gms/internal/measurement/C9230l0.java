package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9230l0 extends C9415x {
    /* renamed from: a */
    public final C9306q mo37304a(String str, C9326r4 r4Var, List list) {
        if (str == null || str.isEmpty() || !r4Var.mo37983h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C9306q d = r4Var.mo37979d(str);
        if (d instanceof C9199j) {
            return ((C9199j) d).mo37655d(r4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
