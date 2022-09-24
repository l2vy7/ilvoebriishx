package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cy2 {

    /* renamed from: a */
    private final jy2 f30522a;

    /* renamed from: b */
    private final jy2 f30523b;

    /* renamed from: c */
    private final gy2 f30524c;

    /* renamed from: d */
    private final iy2 f30525d;

    private cy2(gy2 gy2, iy2 iy2, jy2 jy2, jy2 jy22, boolean z) {
        this.f30524c = gy2;
        this.f30525d = iy2;
        this.f30522a = jy2;
        if (jy22 == null) {
            this.f30523b = jy2.NONE;
        } else {
            this.f30523b = jy22;
        }
    }

    /* renamed from: a */
    public static cy2 m31167a(gy2 gy2, iy2 iy2, jy2 jy2, jy2 jy22, boolean z) {
        kz2.m34245b(iy2, "ImpressionType is null");
        kz2.m34245b(jy2, "Impression owner is null");
        if (jy2 == jy2.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (gy2 == gy2.DEFINED_BY_JAVASCRIPT && jy2 == jy2.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (iy2 != iy2.DEFINED_BY_JAVASCRIPT || jy2 != jy2.NATIVE) {
            return new cy2(gy2, iy2, jy2, jy22, true);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: b */
    public final JSONObject mo31055b() {
        JSONObject jSONObject = new JSONObject();
        iz2.m33500g(jSONObject, "impressionOwner", this.f30522a);
        if (this.f30525d != null) {
            iz2.m33500g(jSONObject, "mediaEventsOwner", this.f30523b);
            iz2.m33500g(jSONObject, "creativeType", this.f30524c);
            iz2.m33500g(jSONObject, "impressionType", this.f30525d);
        } else {
            iz2.m33500g(jSONObject, "videoEventsOwner", this.f30523b);
        }
        iz2.m33500g(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
