package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mv1 {

    /* renamed from: a */
    private final Map<String, String> f35627a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ nv1 f35628b;

    mv1(nv1 nv1) {
        this.f35628b = nv1;
    }

    /* renamed from: b */
    public final mv1 mo33597b(String str, String str2) {
        this.f35627a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final mv1 mo33598c(ir2 ir2) {
        this.f35627a.put("aai", ir2.f33498x);
        return this;
    }

    /* renamed from: d */
    public final mv1 mo33599d(lr2 lr2) {
        this.f35627a.put("gqi", lr2.f35215b);
        return this;
    }

    /* renamed from: e */
    public final String mo33600e() {
        return this.f35628b.f36156a.mo35503a(this.f35627a);
    }

    /* renamed from: f */
    public final void mo33601f() {
        this.f35628b.f36157b.execute(new lv1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo33602g() {
        this.f35628b.f36156a.mo35504b(this.f35627a);
    }
}
