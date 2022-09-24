package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kd3 implements md3 {

    /* renamed from: a */
    final /* synthetic */ hd3 f34256a;

    /* renamed from: b */
    final /* synthetic */ vc3 f34257b;

    kd3(hd3 hd3, vc3 vc3) {
        this.f34256a = hd3;
        this.f34257b = vc3;
    }

    /* renamed from: a */
    public final <Q> nc3<Q> mo32615a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new gd3(this.f34256a, this.f34257b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final nc3<?> zzb() {
        hd3 hd3 = this.f34256a;
        return new gd3(hd3, this.f34257b, hd3.mo35402c());
    }

    public final Class<?> zzc() {
        return this.f34256a.getClass();
    }

    public final Class<?> zzd() {
        return this.f34257b.getClass();
    }

    public final Set<Class<?>> zze() {
        return this.f34256a.mo35405g();
    }
}
