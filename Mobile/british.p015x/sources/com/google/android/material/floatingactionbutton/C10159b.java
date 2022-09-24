package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p105l0.C5648h;
import p200d6.C10493a;
import p200d6.C10494b;
import p200d6.C10500h;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: BaseMotionStrategy */
abstract class C10159b implements C10179f {

    /* renamed from: a */
    private final Context f47859a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ExtendedFloatingActionButton f47860b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f47861c = new ArrayList<>();

    /* renamed from: d */
    private final C10158a f47862d;

    /* renamed from: e */
    private C10500h f47863e;

    /* renamed from: f */
    private C10500h f47864f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* compiled from: BaseMotionStrategy */
    class C10160a extends Property<ExtendedFloatingActionButton, Float> {
        C10160a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C10493a.m48198a(0.0f, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f47808G.getColorForState(extendedFloatingActionButton.getDrawableState(), C10159b.this.f47860b.f47808G.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f47808G.getColorForState(extendedFloatingActionButton.getDrawableState(), C10159b.this.f47860b.f47808G.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C10493a.m48198a(0.0f, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo40548D(extendedFloatingActionButton.f47808G);
            } else {
                extendedFloatingActionButton.mo40548D(valueOf);
            }
        }
    }

    C10159b(ExtendedFloatingActionButton extendedFloatingActionButton, C10158a aVar) {
        this.f47860b = extendedFloatingActionButton;
        this.f47859a = extendedFloatingActionButton.getContext();
        this.f47862d = aVar;
    }

    /* renamed from: a */
    public void mo40598a() {
        this.f47862d.mo40687b();
    }

    /* renamed from: b */
    public void mo40605b() {
        this.f47862d.mo40687b();
    }

    /* renamed from: e */
    public C10500h mo40689e() {
        return this.f47864f;
    }

    /* renamed from: g */
    public AnimatorSet mo40602g() {
        return mo40692l(mo40693m());
    }

    /* renamed from: h */
    public final List<Animator.AnimatorListener> mo40690h() {
        return this.f47861c;
    }

    /* renamed from: j */
    public final void mo40691j(C10500h hVar) {
        this.f47864f = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public AnimatorSet mo40692l(C10500h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.mo42627j("opacity")) {
            arrayList.add(hVar.mo42622f("opacity", this.f47860b, View.ALPHA));
        }
        if (hVar.mo42627j("scale")) {
            arrayList.add(hVar.mo42622f("scale", this.f47860b, View.SCALE_Y));
            arrayList.add(hVar.mo42622f("scale", this.f47860b, View.SCALE_X));
        }
        if (hVar.mo42627j("width")) {
            arrayList.add(hVar.mo42622f("width", this.f47860b, ExtendedFloatingActionButton.f47798I));
        }
        if (hVar.mo42627j("height")) {
            arrayList.add(hVar.mo42622f("height", this.f47860b, ExtendedFloatingActionButton.f47799J));
        }
        if (hVar.mo42627j("paddingStart")) {
            arrayList.add(hVar.mo42622f("paddingStart", this.f47860b, ExtendedFloatingActionButton.f47800K));
        }
        if (hVar.mo42627j("paddingEnd")) {
            arrayList.add(hVar.mo42622f("paddingEnd", this.f47860b, ExtendedFloatingActionButton.f47801L));
        }
        if (hVar.mo42627j("labelOpacity")) {
            arrayList.add(hVar.mo42622f("labelOpacity", this.f47860b, new C10160a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C10494b.m48201a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final C10500h mo40693m() {
        C10500h hVar = this.f47864f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f47863e == null) {
            this.f47863e = C10500h.m48214d(this.f47859a, mo40599c());
        }
        return (C10500h) C5648h.m24964c(this.f47863e);
    }

    public void onAnimationStart(Animator animator) {
        this.f47862d.mo40688c(animator);
    }
}
