package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uq3;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class vc3<KeyProtoT extends uq3> {

    /* renamed from: a */
    private final Class<KeyProtoT> f40385a;

    /* renamed from: b */
    private final Map<Class<?>, uc3<?, KeyProtoT>> f40386b;

    /* renamed from: c */
    private final Class<?> f40387c;

    @SafeVarargs
    protected vc3(Class<KeyProtoT> cls, uc3<?, KeyProtoT>... uc3Arr) {
        String str;
        this.f40385a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            uc3<?, KeyProtoT> uc3 = uc3Arr[i];
            if (hashMap.containsKey(uc3.mo35164a())) {
                String valueOf = String.valueOf(uc3.mo35164a().getCanonicalName());
                if (valueOf.length() != 0) {
                    str = "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf);
                } else {
                    str = new String("KeyTypeManager constructed with duplicate factories for primitive ");
                }
                throw new IllegalArgumentException(str);
            }
            hashMap.put(uc3.mo35164a(), uc3);
        }
        this.f40387c = uc3Arr[0].mo35164a();
        this.f40386b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public tc3<?, KeyProtoT> mo30893a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract KeyProtoT mo30894b(eo3 eo3) throws wp3;

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Class<?> mo35402c() {
        return this.f40387c;
    }

    /* renamed from: d */
    public final Class<KeyProtoT> mo35403d() {
        return this.f40385a;
    }

    /* renamed from: e */
    public final <P> P mo35404e(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        uc3 uc3 = this.f40386b.get(cls);
        if (uc3 != null) {
            return uc3.mo30362b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public abstract String mo30895f();

    /* renamed from: g */
    public final Set<Class<?>> mo35405g() {
        return this.f40386b.keySet();
    }

    /* renamed from: h */
    public abstract void mo30896h(KeyProtoT keyprotot) throws GeneralSecurityException;

    /* renamed from: i */
    public int mo30923i() {
        return 1;
    }

    /* renamed from: j */
    public abstract int mo30897j();
}
