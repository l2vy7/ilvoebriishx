package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.C0600b;
import java.util.ArrayList;
import p105l0.C5648h;
import p194c6.C6523c;
import p237n6.C10841b;
import p240o6.C10858b;
import p243p6.C10889h;
import p243p6.C10897m;

/* renamed from: com.google.android.material.floatingactionbutton.e */
/* compiled from: FloatingActionButtonImplLollipop */
class C10177e extends C10164d {

    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    /* compiled from: FloatingActionButtonImplLollipop */
    static class C10178a extends C10889h {
        C10178a(C10897m mVar) {
            super(mVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    C10177e(FloatingActionButton floatingActionButton, C10858b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: j0 */
    private Animator m46871j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f47919y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f47919y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C10164d.f47883F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo40715A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo40717C() {
        mo40748f0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo40719E(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f47919y.isEnabled()) {
            this.f47919y.setElevation(this.f47902h);
            if (this.f47919y.isPressed()) {
                this.f47919y.setTranslationZ(this.f47904j);
            } else if (this.f47919y.isFocused() || this.f47919y.isHovered()) {
                this.f47919y.setTranslationZ(this.f47903i);
            } else {
                this.f47919y.setTranslationZ(0.0f);
            }
        } else {
            this.f47919y.setElevation(0.0f);
            this.f47919y.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo40720F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f47919y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C10164d.f47884G, m46871j0(f, f3));
            stateListAnimator.addState(C10164d.f47885H, m46871j0(f, f2));
            stateListAnimator.addState(C10164d.f47886I, m46871j0(f, f2));
            stateListAnimator.addState(C10164d.f47887J, m46871j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f47919y, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f47919y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f47919y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C10164d.f47883F);
            stateListAnimator.addState(C10164d.f47888K, animatorSet);
            stateListAnimator.addState(C10164d.f47889L, m46871j0(0.0f, 0.0f));
            this.f47919y.setStateListAnimator(stateListAnimator);
        }
        if (mo40740Z()) {
            mo40748f0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo40725K() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo40736V(ColorStateList colorStateList) {
        Drawable drawable = this.f47897c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C10841b.m48833d(colorStateList));
        } else {
            super.mo40736V(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo40740Z() {
        return this.f47920z.mo40681c() || !mo40741b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo40744d0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C10161c mo40777i0(int i, ColorStateList colorStateList) {
        Context context = this.f47919y.getContext();
        C10161c cVar = new C10161c((C10897m) C5648h.m24964c(this.f47895a));
        cVar.mo40702e(C0600b.m3292d(context, C6523c.design_fab_stroke_top_outer_color), C0600b.m3292d(context, C6523c.design_fab_stroke_top_inner_color), C0600b.m3292d(context, C6523c.design_fab_stroke_end_inner_color), C0600b.m3292d(context, C6523c.design_fab_stroke_end_outer_color));
        cVar.mo40700d((float) i);
        cVar.mo40699c(colorStateList);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10889h mo40750j() {
        return new C10178a((C10897m) C5648h.m24964c(this.f47895a));
    }

    /* renamed from: n */
    public float mo40752n() {
        return this.f47919y.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo40756s(Rect rect) {
        if (this.f47920z.mo40681c()) {
            super.mo40756s(rect);
        } else if (!mo40741b0()) {
            int sizeDimension = (this.f47905k - this.f47919y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo40761x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C10889h j = mo40750j();
        this.f47896b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.f47896b.setTintMode(mode);
        }
        this.f47896b.mo43084P(this.f47919y.getContext());
        if (i > 0) {
            this.f47898d = mo40777i0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C5648h.m24964c(this.f47898d), (Drawable) C5648h.m24964c(this.f47896b)});
        } else {
            this.f47898d = null;
            drawable = this.f47896b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C10841b.m48833d(colorStateList2), drawable, (Drawable) null);
        this.f47897c = rippleDrawable;
        this.f47899e = rippleDrawable;
    }
}
