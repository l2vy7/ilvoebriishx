package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jd3 implements md3 {

    /* renamed from: a */
    final /* synthetic */ vc3 f33856a;

    jd3(vc3 vc3) {
        this.f33856a = vc3;
    }

    /* renamed from: a */
    public final <Q> nc3<Q> mo32615a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new pc3(this.f33856a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final nc3<?> zzb() {
        vc3 vc3 = this.f33856a;
        return new pc3(vc3, vc3.mo35402c());
    }

    public final Class<?> zzc() {
        return this.f33856a.getClass();
    }

    public final Class<?> zzd() {
        return null;
    }

    public final Set<Class<?>> zze() {
        return this.f33856a.mo35405g();
    }
}
