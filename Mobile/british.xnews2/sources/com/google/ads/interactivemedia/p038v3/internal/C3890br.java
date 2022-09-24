package com.google.ads.interactivemedia.p038v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.br */
/* compiled from: IMASDK */
public final class C3890br {

    /* renamed from: a */
    private JSONObject f16781a;

    /* renamed from: b */
    private final C3898bz f16782b;

    public C3890br(C3898bz bzVar) {
        this.f16782b = bzVar;
    }

    /* renamed from: a */
    public final void mo15590a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f16782b.mo15605a(new C3902cc(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public final void mo15591b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f16782b.mo15605a(new C3901cb(this, hashSet, jSONObject, j));
    }

    /* renamed from: c */
    public final void mo15592c() {
        this.f16782b.mo15605a(new C3900ca(this));
    }

    /* renamed from: d */
    public final JSONObject mo15593d() {
        return this.f16781a;
    }

    /* renamed from: e */
    public final void mo15594e(JSONObject jSONObject) {
        this.f16781a = jSONObject;
    }
}
