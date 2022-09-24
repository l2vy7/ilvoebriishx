package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: com.google.android.gms.common.api.internal.d3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C7235d3 {

    /* renamed from: a */
    private final int f28998a;

    /* renamed from: b */
    private final ConnectionResult f28999b;

    C7235d3(ConnectionResult connectionResult, int i) {
        C4604n.m20098k(connectionResult);
        this.f28999b = connectionResult;
        this.f28998a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo29851a() {
        return this.f28998a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult mo29852b() {
        return this.f28999b;
    }
}
