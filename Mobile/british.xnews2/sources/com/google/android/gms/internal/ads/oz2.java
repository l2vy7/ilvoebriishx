package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class oz2 {

    /* renamed from: a */
    private JSONObject f36823a;

    /* renamed from: b */
    private final xz2 f36824b;

    public oz2(xz2 xz2) {
        this.f36824b = xz2;
    }

    /* renamed from: a */
    public final JSONObject mo34027a() {
        return this.f36823a;
    }

    /* renamed from: b */
    public final void mo34028b() {
        this.f36824b.mo35826b(new yz2(this, (byte[]) null));
    }

    /* renamed from: c */
    public final void mo34029c(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f36824b.mo35826b(new zz2(this, hashSet, jSONObject, j, (long) null));
    }

    /* renamed from: d */
    public final void mo34030d(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f36824b.mo35826b(new a03(this, hashSet, jSONObject, j, (long) null));
    }

    /* renamed from: e */
    public final void mo34031e(JSONObject jSONObject) {
        this.f36823a = jSONObject;
    }
}
