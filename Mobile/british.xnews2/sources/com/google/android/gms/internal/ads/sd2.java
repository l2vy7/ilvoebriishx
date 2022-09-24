package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sd2 implements zi2<yi2<Bundle>> {

    /* renamed from: a */
    private final Set<String> f38953a;

    sd2(Set<String> set) {
        this.f38953a = set;
    }

    public final mb3<yi2<Bundle>> zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f38953a) {
            arrayList.add(add);
        }
        return bb3.m30649i(new rd2(arrayList));
    }
}
