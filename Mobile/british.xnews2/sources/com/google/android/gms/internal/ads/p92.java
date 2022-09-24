package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p92 implements t42<te0, p62> {

    /* renamed from: a */
    private final ua2 f37361a;

    public p92(ua2 ua2) {
        this.f37361a = ua2;
    }

    /* renamed from: a */
    public final u42<te0, p62> mo32361a(String str, JSONObject jSONObject) throws gs2 {
        te0 a = this.f37361a.mo18884a(str);
        if (a == null) {
            return null;
        }
        return new u42<>(a, new p62(), str);
    }
}
