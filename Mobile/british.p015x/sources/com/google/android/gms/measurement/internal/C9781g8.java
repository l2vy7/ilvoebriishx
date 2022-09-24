package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C9074ad;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9781g8 {

    /* renamed from: a */
    protected long f46309a;

    /* renamed from: b */
    protected long f46310b;

    /* renamed from: c */
    private final C9826l f46311c;

    /* renamed from: d */
    final /* synthetic */ C9813j8 f46312d;

    public C9781g8(C9813j8 j8Var) {
        this.f46312d = j8Var;
        this.f46311c = new C9770f8(this, j8Var.f21269a);
        long elapsedRealtime = j8Var.f21269a.mo19274f().elapsedRealtime();
        this.f46309a = elapsedRealtime;
        this.f46310b = elapsedRealtime;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo38963a() {
        this.f46311c.mo39048b();
        this.f46309a = 0;
        this.f46310b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38964b(long j) {
        this.f46311c.mo39048b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo38965c(long j) {
        this.f46312d.mo19272b();
        this.f46311c.mo39048b();
        this.f46309a = j;
        this.f46310b = j;
    }

    /* renamed from: d */
    public final boolean mo38966d(boolean z, boolean z2, long j) {
        this.f46312d.mo19272b();
        this.f46312d.mo39230d();
        C9074ad.m42632b();
        if (!this.f46312d.f21269a.mo19392z().mo19337B((String) null, C9903s2.f46687f0)) {
            this.f46312d.f21269a.mo19365F().f21339o.mo39076b(this.f46312d.f21269a.mo19274f().currentTimeMillis());
        } else if (this.f46312d.f21269a.mo19385n()) {
            this.f46312d.f21269a.mo19365F().f21339o.mo39076b(this.f46312d.f21269a.mo19274f().currentTimeMillis());
        }
        long j2 = j - this.f46309a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f46310b;
                this.f46310b = j;
            }
            this.f46312d.f21269a.mo19276j().mo19286v().mo38857b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C4668d9.m21502x(this.f46312d.f21269a.mo19369K().mo39202t(!this.f46312d.f21269a.mo19392z().mo19339D()), bundle, true);
            if (!z2) {
                this.f46312d.f21269a.mo19367I().mo38956u(TtmlNode.TEXT_EMPHASIS_AUTO, "_e", bundle);
            }
            this.f46309a = j;
            this.f46311c.mo39048b();
            this.f46311c.mo39049d(3600000);
            return true;
        }
        this.f46312d.f21269a.mo19276j().mo19286v().mo38857b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
