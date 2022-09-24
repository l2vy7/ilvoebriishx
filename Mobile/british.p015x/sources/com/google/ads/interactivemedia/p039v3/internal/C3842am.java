package com.google.ads.interactivemedia.p039v3.internal;

import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.am */
/* compiled from: IMASDK */
public final class C3842am {

    /* renamed from: a */
    private final C3852at f15262a;

    /* renamed from: b */
    private final C3852at f15263b;

    /* renamed from: c */
    private final C3849aq f15264c;

    /* renamed from: d */
    private final C3851as f15265d;

    private C3842am(C3849aq aqVar, C3851as asVar, C3852at atVar, C3852at atVar2) {
        this.f15264c = aqVar;
        this.f15265d = asVar;
        this.f15262a = atVar;
        if (atVar2 == null) {
            this.f15263b = C3852at.NONE;
        } else {
            this.f15263b = atVar2;
        }
    }

    /* renamed from: b */
    public static C3842am m14121b(C3849aq aqVar, C3851as asVar, C3852at atVar, C3852at atVar2) {
        C4038hd.m17319e(aqVar, "CreativeType is null");
        C4038hd.m17319e(asVar, "ImpressionType is null");
        C4038hd.m17319e(atVar, "Impression owner is null");
        if (atVar == C3852at.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (aqVar == C3849aq.DEFINED_BY_JAVASCRIPT && atVar == C3852at.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (asVar != C3851as.DEFINED_BY_JAVASCRIPT || atVar != C3852at.NATIVE) {
            return new C3842am(aqVar, asVar, atVar, atVar2);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public final JSONObject mo13979a() {
        JSONObject jSONObject = new JSONObject();
        C3887bo.m16853d(jSONObject, "impressionOwner", this.f15262a);
        if (this.f15264c == null || this.f15265d == null) {
            C3887bo.m16853d(jSONObject, "videoEventsOwner", this.f15263b);
        } else {
            C3887bo.m16853d(jSONObject, "mediaEventsOwner", this.f15263b);
            C3887bo.m16853d(jSONObject, "creativeType", this.f15264c);
            C3887bo.m16853d(jSONObject, "impressionType", this.f15265d);
        }
        C3887bo.m16853d(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
