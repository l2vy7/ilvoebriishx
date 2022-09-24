package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.id3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7791id3 implements md3 {

    /* renamed from: a */
    final /* synthetic */ nc3 f33209a;

    C7791id3(nc3 nc3) {
        this.f33209a = nc3;
    }

    /* renamed from: a */
    public final <Q> nc3<Q> mo32615a(Class<Q> cls) throws GeneralSecurityException {
        if (this.f33209a.zzc().equals(cls)) {
            return this.f33209a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final nc3<?> zzb() {
        return this.f33209a;
    }

    public final Class<?> zzc() {
        return this.f33209a.getClass();
    }

    public final Class<?> zzd() {
        return null;
    }

    public final Set<Class<?>> zze() {
        return Collections.singleton(this.f33209a.zzc());
    }
}
