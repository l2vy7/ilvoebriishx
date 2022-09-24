package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rn0 implements C7510ao {

    /* renamed from: a */
    private final Object f38733a = new Object();

    /* renamed from: b */
    private final zzg f38734b;

    /* renamed from: c */
    private final pn0 f38735c;

    /* renamed from: d */
    final on0 f38736d;

    /* renamed from: e */
    final HashSet<hn0> f38737e = new HashSet<>();

    /* renamed from: f */
    final HashSet<qn0> f38738f = new HashSet<>();

    /* renamed from: g */
    private boolean f38739g = false;

    public rn0(String str, zzg zzg) {
        this.f38736d = new on0(str, zzg);
        this.f38734b = zzg;
        this.f38735c = new pn0();
    }

    /* renamed from: a */
    public final hn0 mo34565a(C6483e eVar, String str) {
        return new hn0(eVar, this, this.f38735c.mo34157a(), str);
    }

    /* renamed from: b */
    public final void mo34566b(hn0 hn0) {
        synchronized (this.f38733a) {
            this.f38737e.add(hn0);
        }
    }

    /* renamed from: c */
    public final void mo34567c() {
        synchronized (this.f38733a) {
            this.f38736d.mo33948b();
        }
    }

    /* renamed from: d */
    public final void mo34568d() {
        synchronized (this.f38733a) {
            this.f38736d.mo33949c();
        }
    }

    /* renamed from: e */
    public final void mo34569e() {
        synchronized (this.f38733a) {
            this.f38736d.mo33950d();
        }
    }

    /* renamed from: f */
    public final void mo34570f() {
        synchronized (this.f38733a) {
            this.f38736d.mo33951e();
        }
    }

    /* renamed from: g */
    public final void mo34571g(zzbfd zzbfd, long j) {
        synchronized (this.f38733a) {
            this.f38736d.mo33952f(zzbfd, j);
        }
    }

    /* renamed from: h */
    public final void mo34572h(HashSet<hn0> hashSet) {
        synchronized (this.f38733a) {
            this.f38737e.addAll(hashSet);
        }
    }

    /* renamed from: i */
    public final boolean mo34573i() {
        return this.f38739g;
    }

    /* renamed from: j */
    public final Bundle mo34574j(Context context, at2 at2) {
        HashSet hashSet = new HashSet();
        synchronized (this.f38733a) {
            hashSet.addAll(this.f38737e);
            this.f38737e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f38736d.mo33947a(context, this.f38735c.mo34158b()));
        Bundle bundle2 = new Bundle();
        Iterator<qn0> it = this.f38738f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((hn0) it2.next()).mo32401a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            at2.mo30489b(hashSet);
            return bundle;
        }
        qn0 next = it.next();
        throw null;
    }

    public final void zza(boolean z) {
        long currentTimeMillis = zzt.zzA().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.f38734b.zzc() > ((Long) C8311wv.m39277c().mo18570b(p00.f36888H0)).longValue()) {
                this.f38736d.f36542d = -1;
            } else {
                this.f38736d.f36542d = this.f38734b.zzb();
            }
            this.f38739g = true;
            return;
        }
        this.f38734b.zzr(currentTimeMillis);
        this.f38734b.zzF(this.f38736d.f36542d);
    }
}
