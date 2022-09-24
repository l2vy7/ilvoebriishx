package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.internal.bln;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axd */
/* compiled from: IMASDK */
public abstract class axd<KeyProtoT extends bln> {

    /* renamed from: a */
    private final Class<KeyProtoT> f15868a;

    /* renamed from: b */
    private final Map<Class<?>, axc<?, KeyProtoT>> f15869b;

    /* renamed from: c */
    private final Class<?> f15870c;

    @SafeVarargs
    protected axd(Class<KeyProtoT> cls, axc<?, KeyProtoT>... axcArr) {
        String str;
        this.f15868a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            axc<?, KeyProtoT> axc = axcArr[i];
            if (hashMap.containsKey(axc.mo14732a())) {
                String valueOf = String.valueOf(axc.mo14732a().getCanonicalName());
                if (valueOf.length() != 0) {
                    str = "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf);
                } else {
                    str = new String("KeyTypeManager constructed with duplicate factories for primitive ");
                }
                throw new IllegalArgumentException(str);
            }
            hashMap.put(axc.mo14732a(), axc);
        }
        this.f15870c = axcArr[0].mo14732a();
        this.f15869b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final Class<KeyProtoT> mo14734a() {
        return this.f15868a;
    }

    /* renamed from: b */
    public abstract String mo14735b();

    /* renamed from: c */
    public abstract bbz mo14736c();

    /* renamed from: d */
    public abstract KeyProtoT mo14737d(bjq bjq) throws bkt;

    /* renamed from: e */
    public abstract void mo14738e(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* renamed from: f */
    public final <P> P mo14739f(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        axc axc = this.f15869b.get(cls);
        if (axc != null) {
            return axc.mo14733b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public final Set<Class<?>> mo14740g() {
        return this.f15869b.keySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Class<?> mo14741h() {
        return this.f15870c;
    }

    /* renamed from: i */
    public axb<?, KeyProtoT> mo14742i() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
