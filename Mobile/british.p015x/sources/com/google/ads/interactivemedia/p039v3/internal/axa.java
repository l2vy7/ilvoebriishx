package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.internal.bln;
import java.security.GeneralSecurityException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axa */
/* compiled from: IMASDK */
public final class axa<PrimitiveT, KeyProtoT extends bln> implements awy<PrimitiveT> {

    /* renamed from: a */
    private final axd<KeyProtoT> f15864a;

    /* renamed from: b */
    private final Class<PrimitiveT> f15865b;

    public axa(axd<KeyProtoT> axd, Class<PrimitiveT> cls) {
        if (axd.mo14740g().contains(cls) || Void.class.equals(cls)) {
            this.f15864a = axd;
            this.f15865b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{axd.toString(), cls.getName()}));
    }

    /* renamed from: g */
    private final PrimitiveT m15081g(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f15865b)) {
            this.f15864a.mo14738e(keyprotot);
            return this.f15864a.mo14739f(keyprotot, this.f15865b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: h */
    private final awz<?, KeyProtoT> m15082h() {
        return new awz<>(this.f15864a.mo14742i());
    }

    /* renamed from: a */
    public final PrimitiveT mo14720a(bjq bjq) throws GeneralSecurityException {
        try {
            return m15081g(this.f15864a.mo14737d(bjq));
        } catch (bkt e) {
            String name = this.f15864a.mo14734a().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: b */
    public final PrimitiveT mo14721b(bln bln) throws GeneralSecurityException {
        String str;
        String name = this.f15864a.mo14734a().getName();
        if (name.length() != 0) {
            str = "Expected proto of type ".concat(name);
        } else {
            str = new String("Expected proto of type ");
        }
        if (this.f15864a.mo14734a().isInstance(bln)) {
            return m15081g(bln);
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: c */
    public final bln mo14722c(bjq bjq) throws GeneralSecurityException {
        try {
            return m15082h().mo14726a(bjq);
        } catch (bkt e) {
            String name = this.f15864a.mo14742i().mo14728a().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: d */
    public final String mo14723d() {
        return this.f15864a.mo14735b();
    }

    /* renamed from: e */
    public final Class<PrimitiveT> mo14724e() {
        return this.f15865b;
    }

    /* renamed from: f */
    public final bca mo14725f(bjq bjq) throws GeneralSecurityException {
        try {
            bln a = m15082h().mo14726a(bjq);
            bby e = bca.m15583e();
            e.mo14876b(mo14723d());
            e.mo14877c(a.mo15166af());
            e.mo14875a(this.f15864a.mo14736c());
            return (bca) e.mo15385ae();
        } catch (bkt e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public axa(axn axn, Class cls) {
        this(axn, cls);
    }
}
