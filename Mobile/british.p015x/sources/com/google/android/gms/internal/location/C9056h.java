package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C7259j;
import p251s5.C10974e;

/* renamed from: com.google.android.gms.internal.location.h */
final class C9056h implements C7259j.C7261b<C10974e> {

    /* renamed from: a */
    private final /* synthetic */ Location f44844a;

    C9056h(C9055g gVar, Location location) {
        this.f44844a = location;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo29879a(Object obj) {
        ((C10974e) obj).onLocationChanged(this.f44844a);
    }

    /* renamed from: b */
    public final void mo29880b() {
    }
}
