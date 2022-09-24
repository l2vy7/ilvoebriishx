package com.google.ads.interactivemedia.p038v3.internal;

import android.util.Log;
import com.google.ads.interactivemedia.p038v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p038v3.api.player.VideoAdPlayer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fh */
/* compiled from: IMASDK */
final class C3988fh implements C4203ng {

    /* renamed from: a */
    final /* synthetic */ C3990fj f17056a;

    C3988fh(C3990fj fjVar) {
        this.f17056a = fjVar;
    }

    /* renamed from: aj */
    private final void m17121aj(AdMediaInfo adMediaInfo) {
        if (adMediaInfo != null && !this.f17056a.f17064g.contains(adMediaInfo)) {
            for (VideoAdPlayer.VideoAdPlayerCallback onEnded : this.f17056a.f17063f) {
                onEnded.onEnded(adMediaInfo);
            }
            this.f17056a.f17064g.add(adMediaInfo);
        }
    }

    /* renamed from: A */
    public final void mo15782A() {
    }

    /* renamed from: B */
    public final void mo15783B() {
    }

    /* renamed from: C */
    public final void mo15784C() {
    }

    /* renamed from: D */
    public final void mo15785D() {
    }

    /* renamed from: E */
    public final void mo15786E() {
    }

    /* renamed from: F */
    public final void mo15787F() {
    }

    /* renamed from: G */
    public final void mo15788G() {
    }

    /* renamed from: H */
    public final void mo15789H() {
    }

    /* renamed from: I */
    public final void mo15790I() {
    }

    /* renamed from: J */
    public final void mo15791J() {
    }

    /* renamed from: K */
    public final void mo15792K() {
    }

    /* renamed from: L */
    public final void mo15793L() {
    }

    /* renamed from: M */
    public final void mo15794M() {
    }

    /* renamed from: N */
    public final void mo15795N(int i) {
        AdMediaInfo h = this.f17056a.m17194j();
        if (h != null) {
            if (i == 2) {
                for (VideoAdPlayer.VideoAdPlayerCallback onBuffering : this.f17056a.f17063f) {
                    onBuffering.onBuffering(h);
                }
            } else if (i == 3) {
                for (VideoAdPlayer.VideoAdPlayerCallback onLoaded : this.f17056a.f17063f) {
                    onLoaded.onLoaded(h);
                }
            } else if (i == 4) {
                m17121aj(h);
            }
        }
    }

    /* renamed from: O */
    public final void mo15796O(int i) {
        if (i == 0) {
            if (this.f17056a.f17070m == null) {
                Log.d("IMASDK", "Position discontinuity occurred when there is no active media source.");
                return;
            }
            int n = this.f17056a.f17058a.mo16010n();
            for (int i2 = 0; i2 < n; i2++) {
                m17121aj(this.f17056a.m17197m(i2));
            }
            AdMediaInfo c = this.f17056a.m17197m(n);
            if (c != null) {
                for (VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback : this.f17056a.f17063f) {
                    videoAdPlayerCallback.onLoaded(c);
                    videoAdPlayerCallback.onPlay(c);
                }
            }
        }
    }

    /* renamed from: P */
    public final void mo15797P() {
    }

    /* renamed from: Q */
    public final void mo15798Q() {
    }

    /* renamed from: R */
    public final void mo15799R() {
    }

    /* renamed from: S */
    public final void mo15800S() {
    }

    /* renamed from: T */
    public final void mo15801T() {
    }

    /* renamed from: U */
    public final void mo15802U() {
    }

    /* renamed from: V */
    public final void mo15803V() {
    }

    /* renamed from: W */
    public final void mo15804W() {
    }

    /* renamed from: X */
    public final void mo15805X() {
    }

    /* renamed from: Y */
    public final void mo15806Y() {
    }

    /* renamed from: Z */
    public final void mo15807Z() {
    }

    /* renamed from: a */
    public final void mo15808a(C4202nf nfVar, C4089ja jaVar) {
        AdMediaInfo c = this.f17056a.m17197m(nfVar.f18057c);
        this.f17056a.f17064g.add(c);
        for (VideoAdPlayer.VideoAdPlayerCallback onError : this.f17056a.f17063f) {
            onError.onError(c);
        }
        String valueOf = String.valueOf(jaVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Player Error:");
        sb.append(valueOf);
        Log.e("IMASDK", sb.toString());
    }

    /* renamed from: aa */
    public final void mo15809aa() {
    }

    /* renamed from: ab */
    public final void mo15810ab() {
    }

    /* renamed from: ac */
    public final void mo15811ac() {
    }

    /* renamed from: ad */
    public final void mo15812ad() {
    }

    /* renamed from: ae */
    public final void mo15813ae() {
    }

    /* renamed from: af */
    public final void mo15814af() {
    }

    /* renamed from: ag */
    public final void mo15815ag() {
    }

    /* renamed from: ah */
    public final void mo15816ah() {
    }

    /* renamed from: ai */
    public final void mo15817ai() {
    }

    /* renamed from: b */
    public final void mo15818b() {
    }

    /* renamed from: c */
    public final void mo15819c() {
    }

    /* renamed from: d */
    public final void mo15820d() {
    }

    /* renamed from: e */
    public final void mo15821e() {
    }

    /* renamed from: f */
    public final void mo15822f() {
    }

    /* renamed from: g */
    public final void mo15823g() {
    }

    /* renamed from: h */
    public final void mo15824h() {
    }

    /* renamed from: i */
    public final void mo15825i() {
    }

    /* renamed from: j */
    public final void mo15826j() {
    }

    /* renamed from: k */
    public final void mo15827k() {
    }

    /* renamed from: l */
    public final void mo15828l() {
    }

    /* renamed from: m */
    public final void mo15829m() {
    }

    /* renamed from: n */
    public final void mo15830n() {
    }

    /* renamed from: o */
    public final void mo15831o() {
    }

    /* renamed from: p */
    public final void mo15832p() {
    }

    /* renamed from: q */
    public final void mo15833q() {
    }

    /* renamed from: r */
    public final void mo15834r() {
    }

    /* renamed from: s */
    public final void mo15835s() {
    }

    /* renamed from: t */
    public final void mo15836t() {
    }

    /* renamed from: u */
    public final void mo15837u() {
    }

    /* renamed from: v */
    public final void mo15838v() {
    }

    /* renamed from: w */
    public final void mo15839w() {
    }

    /* renamed from: x */
    public final void mo15840x() {
    }

    /* renamed from: y */
    public final void mo15841y() {
    }

    /* renamed from: z */
    public final void mo15842z() {
    }
}
