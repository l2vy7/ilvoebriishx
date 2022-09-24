package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.c4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9486c4 implements C9690z3 {
    C9486c4() {
    }

    /* renamed from: a */
    public final Map<?, ?> mo38301a(Object obj) {
        return (C9466a4) obj;
    }

    /* renamed from: b */
    public final Object mo38302b(Object obj, Object obj2) {
        C9466a4 a4Var = (C9466a4) obj;
        C9466a4 a4Var2 = (C9466a4) obj2;
        if (!a4Var2.isEmpty()) {
            if (!a4Var.mo38240b()) {
                a4Var = a4Var.mo38246h();
            }
            a4Var.mo38241c(a4Var2);
        }
        return a4Var;
    }

    /* renamed from: c */
    public final C9674x3<?, ?> mo38303c(Object obj) {
        C9682y3 y3Var = (C9682y3) obj;
        throw new NoSuchMethodError();
    }

    /* renamed from: d */
    public final int mo38304d(int i, Object obj, Object obj2) {
        C9466a4 a4Var = (C9466a4) obj;
        C9682y3 y3Var = (C9682y3) obj2;
        if (a4Var.isEmpty()) {
            return 0;
        }
        Iterator it = a4Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    /* renamed from: e */
    public final Map<?, ?> mo38305e(Object obj) {
        return (C9466a4) obj;
    }

    /* renamed from: f */
    public final Object mo38306f(Object obj) {
        return C9466a4.m44031g().mo38246h();
    }

    /* renamed from: g */
    public final Object mo38307g(Object obj) {
        ((C9466a4) obj).mo38243d();
        return obj;
    }

    /* renamed from: h */
    public final boolean mo38308h(Object obj) {
        return !((C9466a4) obj).mo38240b();
    }
}
