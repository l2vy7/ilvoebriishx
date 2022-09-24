package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfx */
/* compiled from: IMASDK */
public final class bfx implements Cloneable, bfj {

    /* renamed from: a */
    public static final bfx f16262a = new bfx();

    /* renamed from: b */
    private final double f16263b = -1.0d;

    /* renamed from: c */
    private final int f16264c = 136;

    /* renamed from: d */
    private final boolean f16265d = true;

    /* renamed from: e */
    private List<arq> f16266e = Collections.emptyList();

    /* renamed from: f */
    private final List<arq> f16267f = Collections.emptyList();

    /* renamed from: f */
    private final boolean m15833f(Class<?> cls) {
        return m15835h(cls);
    }

    /* renamed from: g */
    private final boolean m15834g(Class<?> cls, boolean z) {
        for (arq next : z ? this.f16266e : this.f16267f) {
        }
        return false;
    }

    /* renamed from: h */
    private static final boolean m15835h(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final <T> bfi<T> mo14244a(bet bet, biu<T> biu) {
        boolean z;
        boolean z2;
        Class<? super T> a = biu.mo15133a();
        boolean f = m15833f(a);
        if (!f) {
            m15834g(a, true);
            z = false;
        } else {
            z = true;
        }
        if (!f) {
            m15834g(a, false);
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return new bfw(this, z2, z, bet, biu);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bfx clone() {
        try {
            return (bfx) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final boolean mo15032c(Field field, boolean z) {
        List<arq> list;
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || m15835h(field.getType())) {
            return true;
        }
        if (z) {
            list = this.f16266e;
        } else {
            list = this.f16267f;
        }
        if (list.isEmpty()) {
            return false;
        }
        bek bek = new bek(field);
        for (arq next : list) {
            if (arq.m14619c(bek)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo15034d(Class<?> cls, boolean z) {
        if (m15833f(cls)) {
            return true;
        }
        m15834g(cls, z);
        return false;
    }

    /* renamed from: e */
    public final bfx mo15035e(arq arq) {
        bfx b = clone();
        ArrayList arrayList = new ArrayList(this.f16266e);
        b.f16266e = arrayList;
        arrayList.add(arq);
        return b;
    }
}
