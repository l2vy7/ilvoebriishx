package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.C4604n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;
import p114m4.C10777q;
import p114m4.C5758b;
import p114m4.C5759d;
import p243q4.C10922b;

/* renamed from: com.google.android.gms.internal.cast.r4 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C4643r4 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C10922b f21189g = new C10922b("ApplicationAnalytics");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4639n0 f21190a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4644t6 f21191b;

    /* renamed from: c */
    private final Runnable f21192c = new C8662o1(this);

    /* renamed from: d */
    private final Handler f21193d = new C8564i0(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SharedPreferences f21194e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C8729s5 f21195f;

    public C4643r4(SharedPreferences sharedPreferences, C4639n0 n0Var, Bundle bundle, String str) {
        this.f21194e = sharedPreferences;
        this.f21190a = n0Var;
        this.f21191b = new C4644t6(bundle, str);
    }

    /* renamed from: j */
    static /* synthetic */ void m21352j(C4643r4 r4Var, C5759d dVar, int i) {
        r4Var.m21359r(dVar);
        r4Var.f21190a.mo19116b(r4Var.f21191b.mo19125d(r4Var.f21195f, i), C8435a5.APP_SESSION_END);
        r4Var.m21357p();
        r4Var.f21195f = null;
    }

    /* renamed from: l */
    static /* synthetic */ void m21354l(C4643r4 r4Var, SharedPreferences sharedPreferences, String str) {
        if (r4Var.m21362u(str)) {
            f21189g.mo43190a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            C4604n.m20098k(r4Var.f21195f);
            return;
        }
        r4Var.f21195f = C8729s5.m41303b(sharedPreferences);
        if (r4Var.m21362u(str)) {
            f21189g.mo43190a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            C4604n.m20098k(r4Var.f21195f);
            C8729s5.f43981h = r4Var.f21195f.f43984c + 1;
            return;
        }
        f21189g.mo43190a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        C8729s5 a = C8729s5.m41302a();
        r4Var.f21195f = a;
        a.f43982a = m21363v();
        r4Var.f21195f.f43987f = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m21356o() {
        ((Handler) C4604n.m20098k(this.f21193d)).postDelayed((Runnable) C4604n.m20098k(this.f21192c), DefaultDrmSessionManager.DEFAULT_SESSION_KEEPALIVE_MS);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m21357p() {
        this.f21193d.removeCallbacks(this.f21192c);
    }

    /* access modifiers changed from: private */
    @EnsuresNonNull({"analyticsSession"})
    /* renamed from: q */
    public final void m21358q(C5759d dVar) {
        CastDevice castDevice;
        f21189g.mo43190a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C8729s5 a = C8729s5.m41302a();
        this.f21195f = a;
        a.f43982a = m21363v();
        if (dVar == null) {
            castDevice = null;
        } else {
            castDevice = dVar.mo22549p();
        }
        if (castDevice != null) {
            m21360s(castDevice);
        }
        C4604n.m20098k(this.f21195f);
    }

    /* access modifiers changed from: private */
    @EnsuresNonNull({"analyticsSession"})
    /* renamed from: r */
    public final void m21359r(C5759d dVar) {
        if (m21361t()) {
            CastDevice p = dVar != null ? dVar.mo22549p() : null;
            if (p != null && !TextUtils.equals(this.f21195f.f43983b, p.mo29188L0())) {
                m21360s(p);
            }
            C4604n.m20098k(this.f21195f);
            return;
        }
        f21189g.mo43195f("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        m21358q(dVar);
    }

    /* renamed from: s */
    private final void m21360s(CastDevice castDevice) {
        C8729s5 s5Var = this.f21195f;
        if (s5Var != null) {
            s5Var.f43983b = castDevice.mo29188L0();
            C4604n.m20098k(this.f21195f);
            this.f21195f.f43986e = castDevice.mo29189M0();
        }
    }

    @EnsuresNonNullIf(expression = {"analyticsSession"}, result = true)
    /* renamed from: t */
    private final boolean m21361t() {
        String str;
        if (this.f21195f == null) {
            f21189g.mo43190a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String v = m21363v();
        if (v == null || (str = this.f21195f.f43982a) == null || !TextUtils.equals(str, v)) {
            f21189g.mo43190a("The analytics session doesn't match the application ID %s", v);
            return false;
        }
        C4604n.m20098k(this.f21195f);
        return true;
    }

    /* renamed from: u */
    private final boolean m21362u(String str) {
        String str2;
        if (!m21361t()) {
            return false;
        }
        C4604n.m20098k(this.f21195f);
        if (str != null && (str2 = this.f21195f.f43987f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f21189g.mo43190a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    @Pure
    /* renamed from: v */
    private static String m21363v() {
        return ((C5758b) C4604n.m20098k(C5758b.m25463d())).mo22533a().mo29422F0();
    }

    /* renamed from: a */
    public final void mo19120a(C10777q qVar) {
        qVar.mo42951b(new C8696q3(this, (C8679p2) null), C5759d.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo19121n() {
        C8729s5 s5Var = this.f21195f;
        if (s5Var != null) {
            this.f21190a.mo19116b(this.f21191b.mo19122a(s5Var), C8435a5.APP_SESSION_PING);
        }
        m21356o();
    }
}
