package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.C4580e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.media.f0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7116f0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Set<C4580e.C4585e> f28703a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f28704b;

    /* renamed from: c */
    private final Runnable f28705c;

    /* renamed from: d */
    private boolean f28706d;

    /* renamed from: e */
    final /* synthetic */ C4580e f28707e;

    public C7116f0(C4580e eVar, long j) {
        this.f28707e = eVar;
        this.f28704b = j;
        this.f28705c = new C7114e0(this, eVar);
    }

    /* renamed from: a */
    public final long mo29558a() {
        return this.f28704b;
    }

    /* renamed from: b */
    public final void mo29559b(C4580e.C4585e eVar) {
        this.f28703a.add(eVar);
    }

    /* renamed from: c */
    public final void mo29560c(C4580e.C4585e eVar) {
        this.f28703a.remove(eVar);
    }

    /* renamed from: d */
    public final boolean mo29561d() {
        return !this.f28703a.isEmpty();
    }

    /* renamed from: e */
    public final void mo29562e() {
        this.f28707e.f19926b.removeCallbacks(this.f28705c);
        this.f28706d = true;
        this.f28707e.f19926b.postDelayed(this.f28705c, this.f28704b);
    }

    /* renamed from: f */
    public final void mo29563f() {
        this.f28707e.f19926b.removeCallbacks(this.f28705c);
        this.f28706d = false;
    }

    /* renamed from: g */
    public final boolean mo29564g() {
        return this.f28706d;
    }
}
