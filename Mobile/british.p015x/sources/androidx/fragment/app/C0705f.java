package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C0795t;
import p105l0.C5648h;

/* renamed from: androidx.fragment.app.f */
/* compiled from: FragmentController */
public class C0705f {

    /* renamed from: a */
    private final C0707h<?> f3614a;

    private C0705f(C0707h<?> hVar) {
        this.f3614a = hVar;
    }

    /* renamed from: b */
    public static C0705f m3964b(C0707h<?> hVar) {
        return new C0705f((C0707h) C5648h.m24965d(hVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo3746a(Fragment fragment) {
        C0707h<?> hVar = this.f3614a;
        hVar.f3620f.mo3594k(hVar, hVar, fragment);
    }

    /* renamed from: c */
    public void mo3747c() {
        this.f3614a.f3620f.mo3615z();
    }

    /* renamed from: d */
    public void mo3748d(Configuration configuration) {
        this.f3614a.f3620f.mo3534B(configuration);
    }

    /* renamed from: e */
    public boolean mo3749e(MenuItem menuItem) {
        return this.f3614a.f3620f.mo3536C(menuItem);
    }

    /* renamed from: f */
    public void mo3750f() {
        this.f3614a.f3620f.mo3538D();
    }

    /* renamed from: g */
    public boolean mo3751g(Menu menu, MenuInflater menuInflater) {
        return this.f3614a.f3620f.mo3540E(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo3752h() {
        this.f3614a.f3620f.mo3542F();
    }

    /* renamed from: i */
    public void mo3753i() {
        this.f3614a.f3620f.mo3544H();
    }

    /* renamed from: j */
    public void mo3754j(boolean z) {
        this.f3614a.f3620f.mo3546I(z);
    }

    /* renamed from: k */
    public boolean mo3755k(MenuItem menuItem) {
        return this.f3614a.f3620f.mo3550K(menuItem);
    }

    /* renamed from: l */
    public void mo3756l(Menu menu) {
        this.f3614a.f3620f.mo3552L(menu);
    }

    /* renamed from: m */
    public void mo3757m() {
        this.f3614a.f3620f.mo3554N();
    }

    /* renamed from: n */
    public void mo3758n(boolean z) {
        this.f3614a.f3620f.mo3556O(z);
    }

    /* renamed from: o */
    public boolean mo3759o(Menu menu) {
        return this.f3614a.f3620f.mo3558P(menu);
    }

    /* renamed from: p */
    public void mo3760p() {
        this.f3614a.f3620f.mo3562R();
    }

    /* renamed from: q */
    public void mo3761q() {
        this.f3614a.f3620f.mo3564S();
    }

    /* renamed from: r */
    public void mo3762r() {
        this.f3614a.f3620f.mo3567U();
    }

    /* renamed from: s */
    public boolean mo3763s() {
        return this.f3614a.f3620f.mo3575b0(true);
    }

    /* renamed from: t */
    public FragmentManager mo3764t() {
        return this.f3614a.f3620f;
    }

    /* renamed from: u */
    public void mo3765u() {
        this.f3614a.f3620f.mo3563R0();
    }

    /* renamed from: v */
    public View mo3766v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3614a.f3620f.mo3609v0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void mo3767w(Parcelable parcelable) {
        C0707h<?> hVar = this.f3614a;
        if (hVar instanceof C0795t) {
            hVar.f3620f.mo3578d1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable mo3768x() {
        return this.f3614a.f3620f.mo3582f1();
    }
}
