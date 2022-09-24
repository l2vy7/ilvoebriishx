package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.C10209h;
import java.util.ArrayList;
import java.util.Iterator;
import p063d0.C5135a;
import p105l0.C5648h;
import p111m0.C5723u;
import p194c6.C6521a;
import p200d6.C10493a;
import p200d6.C10494b;
import p200d6.C10498f;
import p200d6.C10499g;
import p200d6.C10500h;
import p237n6.C10838a;
import p237n6.C10841b;
import p240o6.C10858b;
import p243p6.C10889h;
import p243p6.C10893i;
import p243p6.C10897m;
import p243p6.C10913p;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* compiled from: FloatingActionButtonImpl */
class C10164d {

    /* renamed from: F */
    static final TimeInterpolator f47883F = C10493a.f49010c;

    /* renamed from: G */
    static final int[] f47884G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f47885H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f47886I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f47887J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f47888K = {16842910};

    /* renamed from: L */
    static final int[] f47889L = new int[0];

    /* renamed from: A */
    private final Rect f47890A = new Rect();

    /* renamed from: B */
    private final RectF f47891B = new RectF();

    /* renamed from: C */
    private final RectF f47892C = new RectF();

    /* renamed from: D */
    private final Matrix f47893D = new Matrix();

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f47894E;

    /* renamed from: a */
    C10897m f47895a;

    /* renamed from: b */
    C10889h f47896b;

    /* renamed from: c */
    Drawable f47897c;

    /* renamed from: d */
    C10161c f47898d;

    /* renamed from: e */
    Drawable f47899e;

    /* renamed from: f */
    boolean f47900f;

    /* renamed from: g */
    boolean f47901g = true;

    /* renamed from: h */
    float f47902h;

    /* renamed from: i */
    float f47903i;

    /* renamed from: j */
    float f47904j;

    /* renamed from: k */
    int f47905k;

    /* renamed from: l */
    private final C10209h f47906l;

    /* renamed from: m */
    private C10500h f47907m;

    /* renamed from: n */
    private C10500h f47908n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Animator f47909o;

    /* renamed from: p */
    private C10500h f47910p;

    /* renamed from: q */
    private C10500h f47911q;

    /* renamed from: r */
    private float f47912r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f47913s = 1.0f;

    /* renamed from: t */
    private int f47914t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f47915u = 0;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f47916v;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f47917w;

    /* renamed from: x */
    private ArrayList<C10173i> f47918x;

    /* renamed from: y */
    final FloatingActionButton f47919y;

    /* renamed from: z */
    final C10858b f47920z;

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    /* compiled from: FloatingActionButtonImpl */
    class C10165a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f47921a;

        /* renamed from: b */
        final /* synthetic */ boolean f47922b;

        /* renamed from: c */
        final /* synthetic */ C10174j f47923c;

        C10165a(boolean z, C10174j jVar) {
            this.f47922b = z;
            this.f47923c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f47921a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C10164d.this.f47915u = 0;
            Animator unused2 = C10164d.this.f47909o = null;
            if (!this.f47921a) {
                FloatingActionButton floatingActionButton = C10164d.this.f47919y;
                boolean z = this.f47922b;
                floatingActionButton.mo40884b(z ? 8 : 4, z);
                C10174j jVar = this.f47923c;
                if (jVar != null) {
                    jVar.mo40678b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C10164d.this.f47919y.mo40884b(0, this.f47922b);
            int unused = C10164d.this.f47915u = 1;
            Animator unused2 = C10164d.this.f47909o = animator;
            this.f47921a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    /* compiled from: FloatingActionButtonImpl */
    class C10166b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f47925a;

        /* renamed from: b */
        final /* synthetic */ C10174j f47926b;

        C10166b(boolean z, C10174j jVar) {
            this.f47925a = z;
            this.f47926b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C10164d.this.f47915u = 0;
            Animator unused2 = C10164d.this.f47909o = null;
            C10174j jVar = this.f47926b;
            if (jVar != null) {
                jVar.mo40677a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C10164d.this.f47919y.mo40884b(0, this.f47925a);
            int unused = C10164d.this.f47915u = 2;
            Animator unused2 = C10164d.this.f47909o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    /* compiled from: FloatingActionButtonImpl */
    class C10167c extends C10499g {
        C10167c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C10164d.this.f47913s = f;
            return super.mo40769a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* compiled from: FloatingActionButtonImpl */
    class C10168d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f47929a = new FloatEvaluator();

        C10168d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f47929a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    /* compiled from: FloatingActionButtonImpl */
    class C10169e implements ViewTreeObserver.OnPreDrawListener {
        C10169e() {
        }

        public boolean onPreDraw() {
            C10164d.this.mo40722H();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C10170f extends C10176l {
        C10170f() {
            super(C10164d.this, (C10165a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo40774a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    /* compiled from: FloatingActionButtonImpl */
    private class C10171g extends C10176l {
        C10171g() {
            super(C10164d.this, (C10165a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo40774a() {
            C10164d dVar = C10164d.this;
            return dVar.f47902h + dVar.f47903i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C10172h extends C10176l {
        C10172h() {
            super(C10164d.this, (C10165a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo40774a() {
            C10164d dVar = C10164d.this;
            return dVar.f47902h + dVar.f47904j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    /* compiled from: FloatingActionButtonImpl */
    interface C10173i {
        /* renamed from: a */
        void mo40682a();

        /* renamed from: b */
        void mo40683b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    /* compiled from: FloatingActionButtonImpl */
    interface C10174j {
        /* renamed from: a */
        void mo40677a();

        /* renamed from: b */
        void mo40678b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    /* compiled from: FloatingActionButtonImpl */
    private class C10175k extends C10176l {
        C10175k() {
            super(C10164d.this, (C10165a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo40774a() {
            return C10164d.this.f47902h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C10176l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f47936a;

        /* renamed from: b */
        private float f47937b;

        /* renamed from: c */
        private float f47938c;

        private C10176l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo40774a();

        public void onAnimationEnd(Animator animator) {
            C10164d.this.mo40749g0((float) ((int) this.f47938c));
            this.f47936a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f47936a) {
                C10889h hVar = C10164d.this.f47896b;
                this.f47937b = hVar == null ? 0.0f : hVar.mo43116w();
                this.f47938c = mo40774a();
                this.f47936a = true;
            }
            C10164d dVar = C10164d.this;
            float f = this.f47937b;
            dVar.mo40749g0((float) ((int) (f + ((this.f47938c - f) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ C10176l(C10164d dVar, C10165a aVar) {
            this();
        }
    }

    C10164d(FloatingActionButton floatingActionButton, C10858b bVar) {
        this.f47919y = floatingActionButton;
        this.f47920z = bVar;
        C10209h hVar = new C10209h();
        this.f47906l = hVar;
        hVar.mo40977a(f47884G, m46807i(new C10172h()));
        hVar.mo40977a(f47885H, m46807i(new C10171g()));
        hVar.mo40977a(f47886I, m46807i(new C10171g()));
        hVar.mo40977a(f47887J, m46807i(new C10171g()));
        hVar.mo40977a(f47888K, m46807i(new C10175k()));
        hVar.mo40977a(f47889L, m46807i(new C10170f()));
        this.f47912r = floatingActionButton.getRotation();
    }

    /* renamed from: a0 */
    private boolean m46801a0() {
        return C5723u.m25294T(this.f47919y) && !this.f47919y.isInEditMode();
    }

    /* renamed from: g */
    private void m46804g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f47919y.getDrawable();
        if (drawable != null && this.f47914t != 0) {
            RectF rectF = this.f47891B;
            RectF rectF2 = this.f47892C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f47914t;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f47914t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m46805h(C10500h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f47919y, View.ALPHA, new float[]{f});
        hVar.mo42624h("opacity").mo42632a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f47919y, View.SCALE_X, new float[]{f2});
        hVar.mo42624h("scale").mo42632a(ofFloat2);
        m46806h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f47919y, View.SCALE_Y, new float[]{f2});
        hVar.mo42624h("scale").mo42632a(ofFloat3);
        m46806h0(ofFloat3);
        arrayList.add(ofFloat3);
        m46804g(f3, this.f47893D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f47919y, new C10498f(), new C10167c(), new Matrix[]{new Matrix(this.f47893D)});
        hVar.mo42624h("iconScale").mo42632a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C10494b.m48201a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: h0 */
    private void m46806h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C10168d());
        }
    }

    /* renamed from: i */
    private ValueAnimator m46807i(C10176l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f47883F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: l */
    private C10500h m46808l() {
        if (this.f47908n == null) {
            this.f47908n = C10500h.m48214d(this.f47919y.getContext(), C6521a.design_fab_hide_motion_spec);
        }
        return (C10500h) C5648h.m24964c(this.f47908n);
    }

    /* renamed from: m */
    private C10500h m46809m() {
        if (this.f47907m == null) {
            this.f47907m = C10500h.m48214d(this.f47919y.getContext(), C6521a.design_fab_show_motion_spec);
        }
        return (C10500h) C5648h.m24964c(this.f47907m);
    }

    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m46810r() {
        if (this.f47894E == null) {
            this.f47894E = new C10169e();
        }
        return this.f47894E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo40715A() {
        this.f47906l.mo40978c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo40716B() {
        C10889h hVar = this.f47896b;
        if (hVar != null) {
            C10893i.m48987f(this.f47919y, hVar);
        }
        if (mo40725K()) {
            this.f47919y.getViewTreeObserver().addOnPreDrawListener(m46810r());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo40717C() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo40718D() {
        ViewTreeObserver viewTreeObserver = this.f47919y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f47894E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f47894E = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo40719E(int[] iArr) {
        this.f47906l.mo40979d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo40720F(float f, float f2, float f3) {
        mo40748f0();
        mo40749g0(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo40721G(Rect rect) {
        C5648h.m24965d(this.f47899e, "Didn't initialize content background");
        if (mo40740Z()) {
            this.f47920z.mo40680b(new InsetDrawable(this.f47899e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f47920z.mo40680b(this.f47899e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo40722H() {
        float rotation = this.f47919y.getRotation();
        if (this.f47912r != rotation) {
            this.f47912r = rotation;
            mo40744d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo40723I() {
        ArrayList<C10173i> arrayList = this.f47918x;
        if (arrayList != null) {
            Iterator<C10173i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo40683b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo40724J() {
        ArrayList<C10173i> arrayList = this.f47918x;
        if (arrayList != null) {
            Iterator<C10173i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo40682a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo40725K() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo40726L(ColorStateList colorStateList) {
        C10889h hVar = this.f47896b;
        if (hVar != null) {
            hVar.setTintList(colorStateList);
        }
        C10161c cVar = this.f47898d;
        if (cVar != null) {
            cVar.mo40699c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo40727M(PorterDuff.Mode mode) {
        C10889h hVar = this.f47896b;
        if (hVar != null) {
            hVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo40728N(float f) {
        if (this.f47902h != f) {
            this.f47902h = f;
            mo40720F(f, this.f47903i, this.f47904j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo40729O(boolean z) {
        this.f47900f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo40730P(C10500h hVar) {
        this.f47911q = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo40731Q(float f) {
        if (this.f47903i != f) {
            this.f47903i = f;
            mo40720F(this.f47902h, f, this.f47904j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo40732R(float f) {
        this.f47913s = f;
        Matrix matrix = this.f47893D;
        m46804g(f, matrix);
        this.f47919y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo40733S(int i) {
        if (this.f47914t != i) {
            this.f47914t = i;
            mo40746e0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo40734T(int i) {
        this.f47905k = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo40735U(float f) {
        if (this.f47904j != f) {
            this.f47904j = f;
            mo40720F(this.f47902h, this.f47903i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo40736V(ColorStateList colorStateList) {
        Drawable drawable = this.f47897c;
        if (drawable != null) {
            C5135a.m23415o(drawable, C10841b.m48833d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo40737W(boolean z) {
        this.f47901g = z;
        mo40748f0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo40738X(C10897m mVar) {
        this.f47895a = mVar;
        C10889h hVar = this.f47896b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        Drawable drawable = this.f47897c;
        if (drawable instanceof C10913p) {
            ((C10913p) drawable).setShapeAppearanceModel(mVar);
        }
        C10161c cVar = this.f47898d;
        if (cVar != null) {
            cVar.mo40703f(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final void mo40739Y(C10500h hVar) {
        this.f47910p = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo40740Z() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo40741b0() {
        return !this.f47900f || this.f47919y.getSizeDimension() >= this.f47905k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo40742c0(C10174j jVar, boolean z) {
        if (!mo40763z()) {
            Animator animator = this.f47909o;
            if (animator != null) {
                animator.cancel();
            }
            if (m46801a0()) {
                if (this.f47919y.getVisibility() != 0) {
                    this.f47919y.setAlpha(0.0f);
                    this.f47919y.setScaleY(0.0f);
                    this.f47919y.setScaleX(0.0f);
                    mo40732R(0.0f);
                }
                C10500h hVar = this.f47910p;
                if (hVar == null) {
                    hVar = m46809m();
                }
                AnimatorSet h = m46805h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C10166b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f47916v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f47919y.mo40884b(0, z);
            this.f47919y.setAlpha(1.0f);
            this.f47919y.setScaleY(1.0f);
            this.f47919y.setScaleX(1.0f);
            mo40732R(1.0f);
            if (jVar != null) {
                jVar.mo40677a();
            }
        }
    }

    /* renamed from: d */
    public void mo40743d(Animator.AnimatorListener animatorListener) {
        if (this.f47917w == null) {
            this.f47917w = new ArrayList<>();
        }
        this.f47917w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo40744d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f47912r % 90.0f != 0.0f) {
                if (this.f47919y.getLayerType() != 1) {
                    this.f47919y.setLayerType(1, (Paint) null);
                }
            } else if (this.f47919y.getLayerType() != 0) {
                this.f47919y.setLayerType(0, (Paint) null);
            }
        }
        C10889h hVar = this.f47896b;
        if (hVar != null) {
            hVar.mo43102h0((int) this.f47912r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo40745e(Animator.AnimatorListener animatorListener) {
        if (this.f47916v == null) {
            this.f47916v = new ArrayList<>();
        }
        this.f47916v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void mo40746e0() {
        mo40732R(this.f47913s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo40747f(C10173i iVar) {
        if (this.f47918x == null) {
            this.f47918x = new ArrayList<>();
        }
        this.f47918x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void mo40748f0() {
        Rect rect = this.f47890A;
        mo40756s(rect);
        mo40721G(rect);
        this.f47920z.mo40679a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo40749g0(float f) {
        C10889h hVar = this.f47896b;
        if (hVar != null) {
            hVar.mo43090Z(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10889h mo40750j() {
        return new C10889h((C10897m) C5648h.m24964c(this.f47895a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Drawable mo40751k() {
        return this.f47899e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo40752n() {
        return this.f47902h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo40753o() {
        return this.f47900f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C10500h mo40754p() {
        return this.f47911q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo40755q() {
        return this.f47903i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo40756s(Rect rect) {
        int sizeDimension = this.f47900f ? (this.f47905k - this.f47919y.getSizeDimension()) / 2 : 0;
        float n = this.f47901g ? mo40752n() + this.f47904j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public float mo40757t() {
        return this.f47904j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C10897m mo40758u() {
        return this.f47895a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C10500h mo40759v() {
        return this.f47910p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo40760w(C10174j jVar, boolean z) {
        if (!mo40762y()) {
            Animator animator = this.f47909o;
            if (animator != null) {
                animator.cancel();
            }
            if (m46801a0()) {
                C10500h hVar = this.f47911q;
                if (hVar == null) {
                    hVar = m46808l();
                }
                AnimatorSet h = m46805h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C10165a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f47917w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f47919y.mo40884b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo40678b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo40761x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C10889h j = mo40750j();
        this.f47896b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.f47896b.setTintMode(mode);
        }
        this.f47896b.mo43097g0(-12303292);
        this.f47896b.mo43084P(this.f47919y.getContext());
        C10838a aVar = new C10838a(this.f47896b.mo43076D());
        aVar.setTintList(C10841b.m48833d(colorStateList2));
        this.f47897c = aVar;
        this.f47899e = new LayerDrawable(new Drawable[]{(Drawable) C5648h.m24964c(this.f47896b), aVar});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo40762y() {
        if (this.f47919y.getVisibility() == 0) {
            if (this.f47915u == 1) {
                return true;
            }
            return false;
        } else if (this.f47915u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo40763z() {
        if (this.f47919y.getVisibility() != 0) {
            if (this.f47915u == 2) {
                return true;
            }
            return false;
        } else if (this.f47915u != 1) {
            return true;
        } else {
            return false;
        }
    }
}
