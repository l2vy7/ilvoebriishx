package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vk1 implements uu3<Set<String>> {

    /* renamed from: a */
    private final iv3<tm1> f40448a;

    public vk1(iv3<tm1> iv3) {
        this.f40448a = iv3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((sk1) this.f40448a).mo34717a().mo34983e() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        cv3.m31156b(set);
        return set;
    }
}
