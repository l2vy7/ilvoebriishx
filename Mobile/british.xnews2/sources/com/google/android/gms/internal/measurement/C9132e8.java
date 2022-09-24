package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public final class C9132e8 {

    /* renamed from: b */
    private static volatile C9132e8 f45009b;

    /* renamed from: c */
    private static volatile C9132e8 f45010c;

    /* renamed from: d */
    static final C9132e8 f45011d = new C9132e8(true);

    /* renamed from: a */
    private final Map f45012a;

    C9132e8() {
        this.f45012a = new HashMap();
    }

    /* renamed from: a */
    public static C9132e8 m42824a() {
        C9132e8 e8Var = f45009b;
        if (e8Var == null) {
            synchronized (C9132e8.class) {
                e8Var = f45009b;
                if (e8Var == null) {
                    e8Var = f45011d;
                    f45009b = e8Var;
                }
            }
        }
        return e8Var;
    }

    /* renamed from: b */
    public static C9132e8 m42825b() {
        Class<C9132e8> cls = C9132e8.class;
        C9132e8 e8Var = f45010c;
        if (e8Var != null) {
            return e8Var;
        }
        synchronized (cls) {
            C9132e8 e8Var2 = f45010c;
            if (e8Var2 != null) {
                return e8Var2;
            }
            C9132e8 b = C9253m8.m43204b(cls);
            f45010c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final C9314q8 mo37540c(C9409w9 w9Var, int i) {
        return (C9314q8) this.f45012a.get(new C9116d8(w9Var, i));
    }

    C9132e8(boolean z) {
        this.f45012a = Collections.emptyMap();
    }
}
