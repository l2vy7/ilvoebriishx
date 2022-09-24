package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.h2 */
final class C8911h2 implements C8904g2 {
    C8911h2() {
    }

    /* renamed from: b */
    public final Object mo36956b(Object obj) {
        ((C8897f2) obj).mo36925l();
        return obj;
    }

    /* renamed from: c */
    public final Object mo36957c(Object obj) {
        return C8897f2.m41781d().mo36923g();
    }

    /* renamed from: d */
    public final int mo36958d(int i, Object obj, Object obj2) {
        C8897f2 f2Var = (C8897f2) obj;
        if (f2Var.isEmpty()) {
            return 0;
        }
        Iterator it = f2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: e */
    public final C8886e2<?, ?> mo36959e(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: f */
    public final boolean mo36960f(Object obj) {
        return !((C8897f2) obj).mo36918b();
    }

    /* renamed from: g */
    public final Map<?, ?> mo36961g(Object obj) {
        return (C8897f2) obj;
    }

    /* renamed from: h */
    public final Map<?, ?> mo36962h(Object obj) {
        return (C8897f2) obj;
    }

    /* renamed from: i */
    public final Object mo36963i(Object obj, Object obj2) {
        C8897f2 f2Var = (C8897f2) obj;
        C8897f2 f2Var2 = (C8897f2) obj2;
        if (!f2Var2.isEmpty()) {
            if (!f2Var.mo36918b()) {
                f2Var = f2Var.mo36923g();
            }
            f2Var.mo36919c(f2Var2);
        }
        return f2Var;
    }
}
