package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;
import p115m4.C5759d;
import p126o4.C10843a;
import p126o4.C10844c;
import p242p4.C10863a;
import p242p4.C10864b;
import p242p4.C10866d;

/* renamed from: com.google.android.gms.internal.cast.f */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C8513f extends C10843a implements C4580e.C4585e {

    /* renamed from: b */
    private final CastSeekBar f43451b;

    /* renamed from: c */
    private final long f43452c;

    /* renamed from: d */
    private final C10844c f43453d;

    public C8513f(CastSeekBar castSeekBar, long j, C10844c cVar) {
        this.f43451b = castSeekBar;
        this.f43452c = j;
        this.f43453d = cVar;
        mo36476g();
    }

    /* renamed from: a */
    public final void mo17876a(long j, long j2) {
        mo36478i();
        mo36477h();
    }

    /* renamed from: b */
    public final C4580e mo36472b() {
        return super.mo36472b();
    }

    /* renamed from: c */
    public final void mo36473c() {
        mo36476g();
    }

    /* renamed from: e */
    public final void mo36474e(C5759d dVar) {
        super.mo36474e(dVar);
        if (super.mo36472b() != null) {
            super.mo36472b().mo17838c(this, this.f43452c);
        }
        mo36476g();
    }

    /* renamed from: f */
    public final void mo36475f() {
        if (super.mo36472b() != null) {
            super.mo36472b().mo17822G(this);
        }
        super.mo36475f();
        mo36476g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo36476g() {
        int i;
        mo36478i();
        ArrayList arrayList = null;
        if (super.mo36472b() == null) {
            this.f43451b.mo29589a((List<C10863a>) null);
        } else {
            MediaInfo j = super.mo36472b().mo17845j();
            if (!super.mo36472b().mo17850o() || super.mo36472b().mo17853r() || j == null) {
                this.f43451b.mo29589a((List<C10863a>) null);
            } else {
                CastSeekBar castSeekBar = this.f43451b;
                List<AdBreakInfo> D0 = j.mo29219D0();
                if (D0 != null) {
                    arrayList = new ArrayList();
                    for (AdBreakInfo next : D0) {
                        if (next != null) {
                            long F0 = next.mo29155F0();
                            if (F0 == -1000) {
                                i = this.f43453d.mo43012b();
                            } else {
                                i = Math.min((int) (F0 - this.f43453d.mo43018h()), this.f43453d.mo43012b());
                            }
                            if (i >= 0) {
                                arrayList.add(new C10863a(i, (int) next.mo29153D0(), next.mo29157H0()));
                            }
                        }
                    }
                }
                castSeekBar.mo29589a(arrayList);
            }
        }
        mo36477h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo36477h() {
        C4580e b = super.mo36472b();
        AdBreakClipInfo adBreakClipInfo = null;
        if (b == null || !b.mo17856u()) {
            CastSeekBar castSeekBar = this.f43451b;
            castSeekBar.f28760e = null;
            castSeekBar.postInvalidate();
            return;
        }
        int d = (int) b.mo17839d();
        MediaStatus k = b.mo17846k();
        if (k != null) {
            adBreakClipInfo = k.mo29332E0();
        }
        int F0 = adBreakClipInfo != null ? (int) adBreakClipInfo.mo29140F0() : d;
        if (d < 0) {
            d = 0;
        }
        if (F0 < 0) {
            F0 = 1;
        }
        if (d > F0) {
            F0 = d;
        }
        CastSeekBar castSeekBar2 = this.f43451b;
        castSeekBar2.f28760e = new C10864b(d, F0);
        castSeekBar2.postInvalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo36478i() {
        int i;
        int i2;
        C4580e b = super.mo36472b();
        boolean z = true;
        if (b == null || !b.mo17850o() || b.mo17856u()) {
            this.f43451b.setEnabled(false);
        } else {
            this.f43451b.setEnabled(true);
        }
        C10866d dVar = new C10866d();
        dVar.f49650a = this.f43453d.mo43013c();
        dVar.f49651b = this.f43453d.mo43012b();
        dVar.f49652c = (int) (-this.f43453d.mo43018h());
        C4580e b2 = super.mo36472b();
        if (b2 == null || !b2.mo17850o() || !b2.mo17835T()) {
            i = this.f43453d.mo43013c();
        } else {
            i = this.f43453d.mo43016f();
        }
        dVar.f49653d = i;
        C4580e b3 = super.mo36472b();
        if (b3 == null || !b3.mo17850o() || !b3.mo17835T()) {
            i2 = this.f43453d.mo43013c();
        } else {
            i2 = this.f43453d.mo43017g();
        }
        dVar.f49654e = i2;
        C4580e b4 = super.mo36472b();
        if (b4 == null || !b4.mo17850o() || !b4.mo17835T()) {
            z = false;
        }
        dVar.f49655f = z;
        this.f43451b.mo29590b(dVar);
    }
}
