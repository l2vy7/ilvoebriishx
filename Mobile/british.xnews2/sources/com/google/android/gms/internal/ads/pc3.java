package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.uq3;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class pc3<PrimitiveT, KeyProtoT extends uq3> implements nc3<PrimitiveT> {

    /* renamed from: a */
    private final vc3<KeyProtoT> f37582a;

    /* renamed from: b */
    private final Class<PrimitiveT> f37583b;

    public pc3(vc3<KeyProtoT> vc3, Class<PrimitiveT> cls) {
        if (vc3.mo35405g().contains(cls) || Void.class.equals(cls)) {
            this.f37582a = vc3;
            this.f37583b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{vc3.toString(), cls.getName()}));
    }

    /* renamed from: e */
    private final oc3<?, KeyProtoT> m36054e() {
        return new oc3<>(this.f37582a.mo30893a());
    }

    /* renamed from: f */
    private final PrimitiveT m36055f(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f37583b)) {
            this.f37582a.mo30896h(keyprotot);
            return this.f37582a.mo35404e(keyprotot, this.f37583b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final PrimitiveT mo33677a(uq3 uq3) throws GeneralSecurityException {
        String str;
        String name = this.f37582a.mo35403d().getName();
        if (name.length() != 0) {
            str = "Expected proto of type ".concat(name);
        } else {
            str = new String("Expected proto of type ");
        }
        if (this.f37582a.mo35403d().isInstance(uq3)) {
            return m36055f(uq3);
        }
        throw new GeneralSecurityException(str);
    }

    /* renamed from: b */
    public final PrimitiveT mo33678b(eo3 eo3) throws GeneralSecurityException {
        try {
            return m36055f(this.f37582a.mo30894b(eo3));
        } catch (wp3 e) {
            String name = this.f37582a.mo35403d().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: c */
    public final uq3 mo33679c(eo3 eo3) throws GeneralSecurityException {
        try {
            return m36054e().mo33866a(eo3);
        } catch (wp3 e) {
            String name = this.f37582a.mo30893a().mo34902b().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e);
        }
    }

    /* renamed from: d */
    public final ak3 mo33680d(eo3 eo3) throws GeneralSecurityException {
        try {
            uq3 a = m36054e().mo33866a(eo3);
            zj3 E = ak3.m30368E();
            E.mo36069y(this.f37582a.mo30895f());
            E.mo36067B(a.mo33364c());
            E.mo36068C(this.f37582a.mo30897j());
            return (ak3) E.mo32424p();
        } catch (wp3 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final Class<PrimitiveT> zzc() {
        return this.f37583b;
    }

    public final String zzf() {
        return this.f37582a.mo30895f();
    }
}
