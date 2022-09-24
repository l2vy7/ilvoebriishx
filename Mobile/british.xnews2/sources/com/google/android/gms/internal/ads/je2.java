package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class je2 implements zi2<yi2<Bundle>> {

    /* renamed from: a */
    private final Executor f33860a;

    /* renamed from: b */
    private final nn0 f33861b;

    je2(Executor executor, nn0 nn0) {
        this.f33860a = executor;
        this.f33861b = nn0;
    }

    public final mb3<yi2<Bundle>> zzb() {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36985T1)).booleanValue()) {
            return bb3.m30649i(null);
        }
        return bb3.m30653m(this.f33861b.mo18584j(), ie2.f33232a, this.f33860a);
    }
}
