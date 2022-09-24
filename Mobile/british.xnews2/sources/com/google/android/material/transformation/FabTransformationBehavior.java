package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C10076a;
import com.google.android.material.circularreveal.C10078b;
import com.google.android.material.circularreveal.C10080c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p110m0.C5723u;
import p193c6.C6526f;
import p199d6.C10493a;
import p199d6.C10494b;
import p199d6.C10495c;
import p199d6.C10496d;
import p199d6.C10497e;
import p199d6.C10500h;
import p199d6.C10501i;
import p199d6.C10502j;
import p226k6.C10648a;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f48777c = new Rect();

    /* renamed from: d */
    private final RectF f48778d = new RectF();

    /* renamed from: e */
    private final RectF f48779e = new RectF();

    /* renamed from: f */
    private final int[] f48780f = new int[2];

    /* renamed from: g */
    private float f48781g;

    /* renamed from: h */
    private float f48782h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C10376a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f48783a;

        /* renamed from: b */
        final /* synthetic */ View f48784b;

        /* renamed from: c */
        final /* synthetic */ View f48785c;

        C10376a(boolean z, View view, View view2) {
            this.f48783a = z;
            this.f48784b = view;
            this.f48785c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f48783a) {
                this.f48784b.setVisibility(4);
                this.f48785c.setAlpha(1.0f);
                this.f48785c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f48783a) {
                this.f48784b.setVisibility(0);
                this.f48785c.setAlpha(0.0f);
                this.f48785c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C10377b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f48787a;

        C10377b(View view) {
            this.f48787a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f48787a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C10378c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10080c f48789a;

        /* renamed from: b */
        final /* synthetic */ Drawable f48790b;

        C10378c(C10080c cVar, Drawable drawable) {
            this.f48789a = cVar;
            this.f48790b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f48789a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f48789a.setCircularRevealOverlayDrawable(this.f48790b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C10379d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C10080c f48792a;

        C10379d(C10080c cVar) {
            this.f48792a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            C10080c.C10085e revealInfo = this.f48792a.getRevealInfo();
            revealInfo.f47633c = Float.MAX_VALUE;
            this.f48792a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C10380e {

        /* renamed from: a */
        public C10500h f48794a;

        /* renamed from: b */
        public C10502j f48795b;

        protected C10380e() {
        }
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: K */
    private ViewGroup m47893K(View view) {
        View findViewById = view.findViewById(C6526f.mtrl_child_content_container);
        if (findViewById != null) {
            return m47913f0(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return m47913f0(((ViewGroup) view).getChildAt(0));
        }
        return m47913f0(view);
    }

    /* renamed from: L */
    private void m47894L(View view, C10380e eVar, C10501i iVar, C10501i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m47901S(eVar, iVar, f, f3);
        float S2 = m47901S(eVar, iVar2, f2, f4);
        Rect rect = this.f48777c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f48778d;
        rectF2.set(rect);
        RectF rectF3 = this.f48779e;
        m47902T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m47895M(View view, RectF rectF) {
        m47902T(view, rectF);
        rectF.offset(this.f48781g, this.f48782h);
    }

    /* renamed from: N */
    private Pair<C10501i, C10501i> m47896N(float f, float f2, boolean z, C10380e eVar) {
        C10501i iVar;
        C10501i iVar2;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f48794a.mo42624h("translationXLinear");
            iVar = eVar.f48794a.mo42624h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar2 = eVar.f48794a.mo42624h("translationXCurveDownwards");
            iVar = eVar.f48794a.mo42624h("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f48794a.mo42624h("translationXCurveUpwards");
            iVar = eVar.f48794a.mo42624h("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: O */
    private float m47897O(View view, View view2, C10502j jVar) {
        RectF rectF = this.f48778d;
        RectF rectF2 = this.f48779e;
        m47895M(view, rectF);
        m47902T(view2, rectF2);
        rectF2.offset(-m47899Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m47898P(View view, View view2, C10502j jVar) {
        RectF rectF = this.f48778d;
        RectF rectF2 = this.f48779e;
        m47895M(view, rectF);
        m47902T(view2, rectF2);
        rectF2.offset(0.0f, -m47900R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m47899Q(View view, View view2, C10502j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f48778d;
        RectF rectF2 = this.f48779e;
        m47895M(view, rectF);
        m47902T(view2, rectF2);
        int i = jVar.f49028a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f49029b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f49029b;
    }

    /* renamed from: R */
    private float m47900R(View view, View view2, C10502j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f48778d;
        RectF rectF2 = this.f48779e;
        m47895M(view, rectF);
        m47902T(view2, rectF2);
        int i = jVar.f49028a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f49030c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f49030c;
    }

    /* renamed from: S */
    private float m47901S(C10380e eVar, C10501i iVar, float f, float f2) {
        long c = iVar.mo42633c();
        long d = iVar.mo42634d();
        C10501i h = eVar.f48794a.mo42624h("expansion");
        return C10493a.m48198a(f, f2, iVar.mo42635e().getInterpolation(((float) (((h.mo42633c() + h.mo42634d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m47902T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f48780f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m47903U(View view, View view2, boolean z, boolean z2, C10380e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C10080c) || C10078b.f47617j != 0) && (K = m47893K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C10496d.f49014a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C10496d.f49014a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C10496d.f49014a, new float[]{0.0f});
                }
                eVar.f48794a.mo42624h("contentFade").mo42632a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m47904V(View view, View view2, boolean z, boolean z2, C10380e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C10080c) {
            C10080c cVar = (C10080c) view2;
            int d0 = m47912d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, C10080c.C10084d.f47630a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, C10080c.C10084d.f47630a, new int[]{d0});
            }
            objectAnimator.setEvaluator(C10495c.m48202b());
            eVar.f48794a.mo42624h(TtmlNode.ATTR_TTS_COLOR).mo42632a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m47905W(View view, View view2, boolean z, C10380e eVar, List<Animator> list) {
        float Q = m47899Q(view, view2, eVar.f48795b);
        float R = m47900R(view, view2, eVar.f48795b);
        Pair<C10501i, C10501i> N = m47896N(Q, R, z, eVar);
        C10501i iVar = (C10501i) N.first;
        C10501i iVar2 = (C10501i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f48781g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f48782h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo42632a(ofFloat);
        iVar2.mo42632a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m47906X(View view, View view2, boolean z, boolean z2, C10380e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float w = C5723u.m25345w(view2) - C5723u.m25345w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-w);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-w});
        }
        eVar.f48794a.mo42624h("elevation").mo42632a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m47907Y(View view, View view2, boolean z, boolean z2, C10380e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C10380e eVar2 = eVar;
        if (view4 instanceof C10080c) {
            C10080c cVar = (C10080c) view4;
            float O = m47897O(view3, view4, eVar2.f48795b);
            float P = m47898P(view3, view4, eVar2.f48795b);
            ((FloatingActionButton) view3).mo40627i(this.f48777c);
            float width = ((float) this.f48777c.width()) / 2.0f;
            C10501i h = eVar2.f48794a.mo42624h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new C10080c.C10085e(O, P, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().f47633c;
                }
                animator = C10076a.m46386a(cVar, O, P, C10648a.m48414b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C10379d(cVar));
                m47910b0(view2, h.mo42633c(), (int) O, (int) P, width, list);
            } else {
                float f3 = cVar.getRevealInfo().f47633c;
                Animator a = C10076a.m46386a(cVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                m47910b0(view5, h.mo42633c(), i, i2, f3, list);
                long c = h.mo42633c();
                long d = h.mo42634d();
                long i3 = eVar2.f48794a.mo42626i();
                m47909a0(view5, c, d, i3, i, i2, width, list);
                animator = a;
            }
            h.mo42632a(animator);
            list.add(animator);
            list2.add(C10076a.m46387b(cVar));
        }
    }

    /* renamed from: Z */
    private void m47908Z(View view, View view2, boolean z, boolean z2, C10380e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C10080c) && (view instanceof ImageView)) {
            C10080c cVar = (C10080c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C10497e.f49015b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C10497e.f49015b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C10377b(view2));
                eVar.f48794a.mo42624h("iconFade").mo42632a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C10378c(cVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m47909a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m47910b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m47911c0(View view, View view2, boolean z, boolean z2, C10380e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C10380e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = m47899Q(view3, view4, eVar2.f48795b);
        float R = m47900R(view3, view4, eVar2.f48795b);
        Pair<C10501i, C10501i> N = m47896N(Q, R, z3, eVar2);
        C10501i iVar = (C10501i) N.first;
        C10501i iVar2 = (C10501i) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m47894L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.mo42632a(objectAnimator2);
        iVar2.mo42632a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m47912d0(View view) {
        ColorStateList s = C5723u.m25337s(view);
        if (s != null) {
            return s.getColorForState(view.getDrawableState(), s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m47913f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo41812J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C10380e e0 = mo41814e0(view2.getContext(), z3);
        if (z3) {
            this.f48781g = view.getTranslationX();
            this.f48782h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m47906X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f48778d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m47911c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m47905W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        C10380e eVar = e0;
        m47908Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m47907Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m47904V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m47903U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C10494b.m48201a(animatorSet, arrayList);
        animatorSet.addListener(new C10376a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2998e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C10380e mo41814e0(Context context, boolean z);

    /* renamed from: g */
    public void mo3000g(CoordinatorLayout.C0581e eVar) {
        if (eVar.f3102h == 0) {
            eVar.f3102h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
