package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C4580e;
import java.util.List;
import p244q4.C10940k;

/* renamed from: com.google.android.gms.cast.framework.media.d0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C7113d0 implements C10940k {

    /* renamed from: a */
    final /* synthetic */ C4580e f28692a;

    /* synthetic */ C7113d0(C4580e eVar, C7127l lVar) {
        this.f28692a = eVar;
    }

    /* renamed from: g */
    private final void m29366g() {
        MediaStatus k;
        if (this.f28692a.f19935k != null && (k = this.f28692a.mo17846k()) != null) {
            k.mo29350W0().mo29360a(this.f28692a.f19935k.mo17875b(k));
            List<AdBreakInfo> a = this.f28692a.f19935k.mo17874a(k);
            MediaInfo j = this.f28692a.mo17845j();
            if (j != null) {
                j.mo29233R0().mo29243a(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo29546a(int[] iArr) {
        for (C4580e.C4581a j : this.f28692a.f19932h) {
            j.mo17871j(iArr);
        }
    }

    /* renamed from: b */
    public final void mo29547b(int[] iArr, int i) {
        for (C4580e.C4581a i2 : this.f28692a.f19932h) {
            i2.mo17870i(iArr, i);
        }
    }

    /* renamed from: c */
    public final void mo29548c(int[] iArr) {
        for (C4580e.C4581a k : this.f28692a.f19932h) {
            k.mo17872k(iArr);
        }
    }

    /* renamed from: d */
    public final void mo29549d(int[] iArr) {
        for (C4580e.C4581a h : this.f28692a.f19932h) {
            h.mo17869h(iArr);
        }
    }

    /* renamed from: e */
    public final void mo29550e(MediaQueueItem[] mediaQueueItemArr) {
        for (C4580e.C4581a l : this.f28692a.f19932h) {
            l.mo17873l(mediaQueueItemArr);
        }
    }

    /* renamed from: f */
    public final void mo29551f(MediaError mediaError) {
        for (C4580e.C4581a b : this.f28692a.f19932h) {
            b.mo17863b(mediaError);
        }
    }

    public final void zza() {
        m29366g();
        C4580e.m19847V(this.f28692a);
        for (C4580e.C4582b g : this.f28692a.f19931g) {
            g.mo9083g();
        }
        for (C4580e.C4581a g2 : this.f28692a.f19932h) {
            g2.mo17868g();
        }
    }

    public final void zzb() {
        m29366g();
        for (C4580e.C4582b c : this.f28692a.f19931g) {
            c.mo9079c();
        }
        for (C4580e.C4581a c2 : this.f28692a.f19932h) {
            c2.mo17864c();
        }
    }

    public final void zzc() {
        for (C4580e.C4582b d : this.f28692a.f19931g) {
            d.mo9080d();
        }
        for (C4580e.C4581a e : this.f28692a.f19932h) {
            e.mo17866e();
        }
    }

    public final void zzd() {
        for (C4580e.C4582b f : this.f28692a.f19931g) {
            f.mo9082f();
        }
        for (C4580e.C4581a d : this.f28692a.f19932h) {
            d.mo17865d();
        }
    }

    public final void zze() {
        for (C4580e.C4582b l : this.f28692a.f19931g) {
            l.mo9084l();
        }
        for (C4580e.C4581a a : this.f28692a.f19932h) {
            a.mo17862a();
        }
    }
}
