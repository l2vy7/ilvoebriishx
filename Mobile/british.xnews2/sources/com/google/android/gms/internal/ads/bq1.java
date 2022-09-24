package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bq1 {

    /* renamed from: a */
    private final Executor f30071a;

    /* renamed from: b */
    private final e31 f30072b;

    /* renamed from: c */
    private final ai1 f30073c;

    bq1(Executor executor, e31 e31, ai1 ai1) {
        this.f30071a = executor;
        this.f30073c = ai1;
        this.f30072b = e31;
    }

    /* renamed from: a */
    public final void mo30773a(xt0 xt0) {
        if (xt0 != null) {
            this.f30073c.mo30383E0(xt0.mo18790t());
            this.f30073c.mo30921s0(new xp1(xt0), this.f30071a);
            this.f30073c.mo30921s0(new yp1(xt0), this.f30071a);
            this.f30073c.mo30921s0(this.f30072b, this.f30071a);
            this.f30072b.mo31463g(xt0);
            xt0.mo18726O("/trackActiveViewUnit", new zp1(this));
            xt0.mo18726O("/untrackActiveViewUnit", new aq1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo30774b(xt0 xt0, Map map) {
        this.f30072b.mo31460c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo30775c(xt0 xt0, Map map) {
        this.f30072b.mo31459a();
    }
}
