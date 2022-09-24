package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
/* compiled from: CardViewApi21Impl */
class C0456b implements C0460e {
    C0456b() {
    }

    /* renamed from: p */
    private C0461f m2391p(C0459d dVar) {
        return (C0461f) dVar.mo2430f();
    }

    /* renamed from: a */
    public void mo2434a(C0459d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2427c(new C0461f(colorStateList, f));
        View g = dVar.mo2431g();
        g.setClipToOutline(true);
        g.setElevation(f2);
        mo2447o(dVar, f3);
    }

    /* renamed from: b */
    public void mo2435b(C0459d dVar, float f) {
        m2391p(dVar).mo2456h(f);
    }

    /* renamed from: c */
    public float mo2436c(C0459d dVar) {
        return dVar.mo2431g().getElevation();
    }

    /* renamed from: d */
    public float mo2437d(C0459d dVar) {
        return m2391p(dVar).mo2450d();
    }

    /* renamed from: e */
    public void mo2438e(C0459d dVar) {
        mo2447o(dVar, mo2440g(dVar));
    }

    /* renamed from: f */
    public void mo2439f(C0459d dVar, float f) {
        dVar.mo2431g().setElevation(f);
    }

    /* renamed from: g */
    public float mo2440g(C0459d dVar) {
        return m2391p(dVar).mo2449c();
    }

    /* renamed from: h */
    public ColorStateList mo2441h(C0459d dVar) {
        return m2391p(dVar).mo2448b();
    }

    /* renamed from: i */
    public void mo2442i(C0459d dVar) {
        if (!dVar.mo2429e()) {
            dVar.mo2425a(0, 0, 0, 0);
            return;
        }
        float g = mo2440g(dVar);
        float d = mo2437d(dVar);
        int ceil = (int) Math.ceil((double) C0462g.m2458c(g, d, dVar.mo2428d()));
        int ceil2 = (int) Math.ceil((double) C0462g.m2459d(g, d, dVar.mo2428d()));
        dVar.mo2425a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: j */
    public void mo2432j() {
    }

    /* renamed from: k */
    public float mo2443k(C0459d dVar) {
        return mo2437d(dVar) * 2.0f;
    }

    /* renamed from: l */
    public float mo2444l(C0459d dVar) {
        return mo2437d(dVar) * 2.0f;
    }

    /* renamed from: m */
    public void mo2445m(C0459d dVar) {
        mo2447o(dVar, mo2440g(dVar));
    }

    /* renamed from: n */
    public void mo2446n(C0459d dVar, ColorStateList colorStateList) {
        m2391p(dVar).mo2452f(colorStateList);
    }

    /* renamed from: o */
    public void mo2447o(C0459d dVar, float f) {
        m2391p(dVar).mo2453g(f, dVar.mo2429e(), dVar.mo2428d());
        mo2442i(dVar);
    }
}
