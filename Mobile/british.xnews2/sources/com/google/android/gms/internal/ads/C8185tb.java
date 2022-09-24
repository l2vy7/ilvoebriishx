package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8185tb implements g23 {

    /* renamed from: a */
    private final m03 f39368a;

    /* renamed from: b */
    private final e13 f39369b;

    /* renamed from: c */
    private final C7715gc f39370c;

    /* renamed from: d */
    private final zzaml f39371d;

    /* renamed from: e */
    private final C7603db f39372e;

    C8185tb(m03 m03, e13 e13, C7715gc gcVar, zzaml zzaml, C7603db dbVar) {
        this.f39368a = m03;
        this.f39369b = e13;
        this.f39370c = gcVar;
        this.f39371d = zzaml;
        this.f39372e = dbVar;
    }

    /* renamed from: b */
    private final Map<String, Object> m37768b() {
        HashMap hashMap = new HashMap();
        C8218u8 b = this.f39369b.mo31444b();
        hashMap.put("v", this.f39368a.mo33454b());
        hashMap.put("gms", Boolean.valueOf(this.f39368a.mo33455c()));
        hashMap.put("int", b.mo35145y0());
        hashMap.put("up", Boolean.valueOf(this.f39371d.mo36182a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34901a(View view) {
        this.f39370c.mo32053d(view);
    }

    public final Map<String, Object> zza() {
        Map<String, Object> b = m37768b();
        b.put("lts", Long.valueOf(this.f39370c.mo32051a()));
        return b;
    }

    public final Map<String, Object> zzb() {
        Map<String, Object> b = m37768b();
        C8218u8 a = this.f39369b.mo31443a();
        b.put("gai", Boolean.valueOf(this.f39368a.mo33456d()));
        b.put("did", a.mo35144x0());
        b.put("dst", Integer.valueOf(a.mo35142m0() - 1));
        b.put("doo", Boolean.valueOf(a.mo35139j0()));
        C7603db dbVar = this.f39372e;
        if (dbVar != null) {
            b.put("nt", Long.valueOf(dbVar.mo31194a()));
        }
        return b;
    }

    public final Map<String, Object> zzc() {
        return m37768b();
    }
}
