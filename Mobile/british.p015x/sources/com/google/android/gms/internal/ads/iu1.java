package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iu1 implements kd1, cc1, pa1, hb1, C7659eu, yf1 {

    /* renamed from: b */
    private final C7728gq f20455b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f20456c = false;

    public iu1(C7728gq gqVar, @Nullable bp2 bp2) {
        this.f20455b = gqVar;
        gqVar.mo32217c(2);
        if (bp2 != null) {
            gqVar.mo32217c(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE);
        }
    }

    /* renamed from: G */
    public final void mo18433G(ur2 ur2) {
        this.f20455b.mo32216b(new hu1(ur2));
    }

    /* renamed from: I */
    public final void mo18434I(C7513ar arVar) {
        this.f20455b.mo32216b(new fu1(arVar));
        this.f20455b.mo32217c(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE);
    }

    /* renamed from: Q */
    public final void mo18435Q(boolean z) {
        this.f20455b.mo32217c(true != z ? 1108 : 1107);
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        switch (zzbew.f42935b) {
            case 1:
                this.f20455b.mo32217c(101);
                return;
            case 2:
                this.f20455b.mo32217c(102);
                return;
            case 3:
                this.f20455b.mo32217c(5);
                return;
            case 4:
                this.f20455b.mo32217c(103);
                return;
            case 5:
                this.f20455b.mo32217c(104);
                return;
            case 6:
                this.f20455b.mo32217c(105);
                return;
            case 7:
                this.f20455b.mo32217c(106);
                return;
            default:
                this.f20455b.mo32217c(4);
                return;
        }
    }

    /* renamed from: h0 */
    public final void mo18437h0(zzcdq zzcdq) {
    }

    /* renamed from: o0 */
    public final void mo18438o0(C7513ar arVar) {
        this.f20455b.mo32216b(new eu1(arVar));
        this.f20455b.mo32217c(1103);
    }

    public final synchronized void onAdClicked() {
        if (!this.f20456c) {
            this.f20455b.mo32217c(7);
            this.f20456c = true;
            return;
        }
        this.f20455b.mo32217c(8);
    }

    /* renamed from: r */
    public final void mo18439r(C7513ar arVar) {
        this.f20455b.mo32216b(new gu1(arVar));
        this.f20455b.mo32217c(1104);
    }

    /* renamed from: x */
    public final void mo18440x(boolean z) {
        this.f20455b.mo32217c(true != z ? 1106 : 1105);
    }

    public final void zzb() {
        this.f20455b.mo32217c(1109);
    }

    public final synchronized void zzl() {
        this.f20455b.mo32217c(6);
    }

    public final void zzn() {
        this.f20455b.mo32217c(3);
    }
}
