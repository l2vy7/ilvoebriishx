package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9451z6 {
    /* renamed from: a */
    public static C9391v6 m43938a(C9391v6 v6Var) {
        if ((v6Var instanceof C4664x6) || (v6Var instanceof C4663w6)) {
            return v6Var;
        }
        if (v6Var instanceof Serializable) {
            return new C4663w6(v6Var);
        }
        return new C4664x6(v6Var);
    }

    /* renamed from: b */
    public static C9391v6 m43939b(Object obj) {
        return new C4665y6(obj);
    }
}
