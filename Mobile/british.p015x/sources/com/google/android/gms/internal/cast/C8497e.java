package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Looper;
import android.support.p007v4.media.session.MediaSessionCompat;
import androidx.mediarouter.media.C1001r;
import androidx.mediarouter.media.C1003s;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p006a5.C6492o;
import p018c1.C2643j;

/* renamed from: com.google.android.gms.internal.cast.e */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8497e extends C8830ye {

    /* renamed from: b */
    private final C1003s f43422b;

    /* renamed from: c */
    private final Map<C1001r, Set<C1003s.C1005b>> f43423c = new HashMap();

    public C8497e(C1003s sVar, CastOptions castOptions) {
        this.f43422b = sVar;
        if (C6492o.m28290m()) {
            boolean zzc = castOptions.zzc();
            boolean K0 = castOptions.mo29427K0();
            sVar.mo4715t(new C2643j.C2644a().mo9303c(zzc).mo9304d(K0).mo9301a());
            if (zzc) {
                C4646v8.m21378b(C8652n7.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (K0) {
                C4646v8.m21378b(C8652n7.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    /* renamed from: n6 */
    private final void m40776n6(C1001r rVar, int i) {
        for (C1003s.C1005b b : this.f43423c.get(rVar)) {
            this.f43422b.mo4703b(rVar, b, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o6 */
    public final void mo36449f3(C1001r rVar) {
        for (C1003s.C1005b p : this.f43423c.get(rVar)) {
            this.f43422b.mo4711p(p);
        }
    }

    /* renamed from: G2 */
    public final boolean mo36442G2(Bundle bundle, int i) {
        return this.f43422b.mo4710n(C1001r.m5118d(bundle), i);
    }

    /* renamed from: V0 */
    public final void mo36443V0(Bundle bundle, int i) {
        C1001r d = C1001r.m5118d(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m40776n6(d, i);
        } else {
            new C8564i0(Looper.getMainLooper()).post(new C8463c(this, d, i));
        }
    }

    /* renamed from: b2 */
    public final void mo36444b2(MediaSessionCompat mediaSessionCompat) {
        this.f43422b.mo4714s(mediaSessionCompat);
    }

    /* renamed from: c */
    public final void mo36445c(String str) {
        for (C1003s.C1022i next : this.f43422b.mo4708k()) {
            if (next.mo4805k().equals(str)) {
                this.f43422b.mo4713r(next);
                return;
            }
        }
    }

    /* renamed from: d3 */
    public final void mo36446d3(Bundle bundle, C8692pf pfVar) {
        C1001r d = C1001r.m5118d(bundle);
        if (!this.f43423c.containsKey(d)) {
            this.f43423c.put(d, new HashSet());
        }
        this.f43423c.get(d).add(new C8446b(pfVar));
    }

    /* renamed from: e */
    public final void mo36447e(Bundle bundle) {
        C1001r d = C1001r.m5118d(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo36449f3(d);
        } else {
            new C8564i0(Looper.getMainLooper()).post(new C8480d(this, d));
        }
    }

    /* renamed from: f0 */
    public final Bundle mo36448f0(String str) {
        for (C1003s.C1022i next : this.f43422b.mo4708k()) {
            if (next.mo4805k().equals(str)) {
                return next.mo4803i();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m6 */
    public final /* synthetic */ void mo36450m6(C1001r rVar, int i) {
        synchronized (this.f43423c) {
            m40776n6(rVar, i);
        }
    }

    public final void zzg() {
        C1003s sVar = this.f43422b;
        sVar.mo4713r(sVar.mo4705f());
    }

    public final boolean zzh() {
        return this.f43422b.mo4709l().mo4805k().equals(this.f43422b.mo4705f().mo4805k());
    }

    public final String zzj() {
        return this.f43422b.mo4709l().mo4805k();
    }

    public final void zzk() {
        for (Set<C1003s.C1005b> it : this.f43423c.values()) {
            for (C1003s.C1005b p : it) {
                this.f43422b.mo4711p(p);
            }
        }
        this.f43423c.clear();
    }
}
