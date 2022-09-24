package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wu1 implements ew2 {

    /* renamed from: b */
    private final Map<wv2, vu1> f40904b;

    /* renamed from: c */
    private final C7728gq f40905c;

    wu1(C7728gq gqVar, Map<wv2, vu1> map) {
        this.f40904b = map;
        this.f40905c = gqVar;
    }

    /* renamed from: g */
    public final void mo18539g(wv2 wv2, String str) {
        if (this.f40904b.containsKey(wv2)) {
            this.f40905c.mo32217c(this.f40904b.get(wv2).f40552a);
        }
    }

    /* renamed from: l */
    public final void mo18540l(wv2 wv2, String str, Throwable th) {
        if (this.f40904b.containsKey(wv2)) {
            this.f40905c.mo32217c(this.f40904b.get(wv2).f40554c);
        }
    }

    /* renamed from: n */
    public final void mo18541n(wv2 wv2, String str) {
        if (this.f40904b.containsKey(wv2)) {
            this.f40905c.mo32217c(this.f40904b.get(wv2).f40553b);
        }
    }

    /* renamed from: z */
    public final void mo18543z(wv2 wv2, String str) {
    }
}
