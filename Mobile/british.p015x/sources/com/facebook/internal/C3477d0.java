package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.facebook.internal.d0 */
/* compiled from: SmartLoginOption */
public enum C3477d0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    

    /* renamed from: f */
    public static final EnumSet<C3477d0> f13049f = null;

    /* renamed from: b */
    private final long f13051b;

    static {
        f13049f = EnumSet.allOf(C3477d0.class);
    }

    private C3477d0(long j) {
        this.f13051b = j;
    }

    /* renamed from: i */
    public static EnumSet<C3477d0> m11584i(long j) {
        EnumSet<C3477d0> noneOf = EnumSet.noneOf(C3477d0.class);
        Iterator it = f13049f.iterator();
        while (it.hasNext()) {
            C3477d0 d0Var = (C3477d0) it.next();
            if ((d0Var.mo11932d() & j) != 0) {
                noneOf.add(d0Var);
            }
        }
        return noneOf;
    }

    /* renamed from: d */
    public long mo11932d() {
        return this.f13051b;
    }
}
