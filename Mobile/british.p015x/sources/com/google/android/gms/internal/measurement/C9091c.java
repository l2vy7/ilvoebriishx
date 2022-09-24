package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
public final class C9091c {

    /* renamed from: a */
    private C9076b f44908a;

    /* renamed from: b */
    private C9076b f44909b;

    /* renamed from: c */
    private final List f44910c;

    public C9091c() {
        this.f44908a = new C9076b("", 0, (Map) null);
        this.f44909b = new C9076b("", 0, (Map) null);
        this.f44910c = new ArrayList();
    }

    /* renamed from: a */
    public final C9076b mo37430a() {
        return this.f44908a;
    }

    /* renamed from: b */
    public final C9076b mo37431b() {
        return this.f44909b;
    }

    /* renamed from: c */
    public final List mo37432c() {
        return this.f44910c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C9091c cVar = new C9091c(this.f44908a.clone());
        for (C9076b b : this.f44910c) {
            cVar.f44910c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo37434d(C9076b bVar) {
        this.f44908a = bVar;
        this.f44909b = bVar.clone();
        this.f44910c.clear();
    }

    /* renamed from: e */
    public final void mo37435e(String str, long j, Map map) {
        this.f44910c.add(new C9076b(str, j, map));
    }

    /* renamed from: f */
    public final void mo37436f(C9076b bVar) {
        this.f44909b = bVar;
    }

    public C9091c(C9076b bVar) {
        this.f44908a = bVar;
        this.f44909b = bVar.clone();
        this.f44910c = new ArrayList();
    }
}
