package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.C10219l;
import com.google.android.material.textfield.TextInputLayout;
import p078g.C5264a;
import p110m0.C5723u;
import p116n0.C5771c;
import p193c6.C6522b;
import p193c6.C6524d;
import p193c6.C6525e;
import p193c6.C6530j;
import p199d6.C10493a;
import p207f6.C10538a;
import p242p6.C10889h;
import p242p6.C10897m;

/* renamed from: com.google.android.material.textfield.d */
/* compiled from: DropdownMenuEndIconDelegate */
class C10333d extends C10346e {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final boolean f48636q = (Build.VERSION.SDK_INT >= 21);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f48637d = new C10334a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f48638e = new C10337c();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final TextInputLayout.C10317e f48639f = new C10338d(this.f48665a);

    /* renamed from: g */
    private final TextInputLayout.C10318f f48640g = new C10339e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: h */
    private final TextInputLayout.C10319g f48641h = new C10340f();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f48642i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f48643j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f48644k = Long.MAX_VALUE;

    /* renamed from: l */
    private StateListDrawable f48645l;

    /* renamed from: m */
    private C10889h f48646m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AccessibilityManager f48647n;

    /* renamed from: o */
    private ValueAnimator f48648o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ValueAnimator f48649p;

    /* renamed from: com.google.android.material.textfield.d$a */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10334a extends C10219l {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C10335a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ AutoCompleteTextView f48651b;

            C10335a(AutoCompleteTextView autoCompleteTextView) {
                this.f48651b = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f48651b.isPopupShowing();
                C10333d.this.m47736E(isPopupShowing);
                boolean unused = C10333d.this.f48642i = isPopupShowing;
            }
        }

        C10334a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e = C10333d.m47760y(C10333d.this.f48665a.getEditText());
            if (C10333d.this.f48647n.isTouchExplorationEnabled() && C10333d.m47735D(e) && !C10333d.this.f48667c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new C10335a(e));
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10336b implements ValueAnimator.AnimatorUpdateListener {
        C10336b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10333d.this.f48667c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10337c implements View.OnFocusChangeListener {
        C10337c() {
        }

        public void onFocusChange(View view, boolean z) {
            C10333d.this.f48665a.setEndIconActivated(z);
            if (!z) {
                C10333d.this.m47736E(false);
                boolean unused = C10333d.this.f48642i = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10338d extends TextInputLayout.C10317e {
        C10338d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            if (!C10333d.m47735D(C10333d.this.f48665a.getEditText())) {
                cVar.mo22627c0(Spinner.class.getName());
            }
            if (cVar.mo22613M()) {
                cVar.mo22644m0((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo5795h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5795h(view, accessibilityEvent);
            AutoCompleteTextView e = C10333d.m47760y(C10333d.this.f48665a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C10333d.this.f48647n.isTouchExplorationEnabled() && !C10333d.m47735D(C10333d.this.f48665a.getEditText())) {
                C10333d.this.m47739H(e);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10339e implements TextInputLayout.C10318f {
        C10339e() {
        }

        /* renamed from: a */
        public void mo41705a(TextInputLayout textInputLayout) {
            AutoCompleteTextView e = C10333d.m47760y(textInputLayout.getEditText());
            C10333d.this.m47737F(e);
            C10333d.this.m47757v(e);
            C10333d.this.m47738G(e);
            e.setThreshold(0);
            e.removeTextChangedListener(C10333d.this.f48637d);
            e.addTextChangedListener(C10333d.this.f48637d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C10333d.m47735D(e)) {
                C5723u.m25350y0(C10333d.this.f48667c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C10333d.this.f48639f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10340f implements TextInputLayout.C10319g {

        /* renamed from: com.google.android.material.textfield.d$f$a */
        /* compiled from: DropdownMenuEndIconDelegate */
        class C10341a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ AutoCompleteTextView f48658b;

            C10341a(AutoCompleteTextView autoCompleteTextView) {
                this.f48658b = autoCompleteTextView;
            }

            public void run() {
                this.f48658b.removeTextChangedListener(C10333d.this.f48637d);
            }
        }

        C10340f() {
        }

        /* renamed from: a */
        public void mo41706a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C10341a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C10333d.this.f48638e) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C10333d.f48636q) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10342g implements View.OnClickListener {
        C10342g() {
        }

        public void onClick(View view) {
            C10333d.this.m47739H((AutoCompleteTextView) C10333d.this.f48665a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10343h implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ AutoCompleteTextView f48661b;

        C10343h(AutoCompleteTextView autoCompleteTextView) {
            this.f48661b = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C10333d.this.m47734C()) {
                    boolean unused = C10333d.this.f48642i = false;
                }
                C10333d.this.m47739H(this.f48661b);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10344i implements AutoCompleteTextView.OnDismissListener {
        C10344i() {
        }

        public void onDismiss() {
            boolean unused = C10333d.this.f48642i = true;
            long unused2 = C10333d.this.f48644k = System.currentTimeMillis();
            C10333d.this.m47736E(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$j */
    /* compiled from: DropdownMenuEndIconDelegate */
    class C10345j extends AnimatorListenerAdapter {
        C10345j() {
        }

        public void onAnimationEnd(Animator animator) {
            C10333d dVar = C10333d.this;
            dVar.f48667c.setChecked(dVar.f48643j);
            C10333d.this.f48649p.start();
        }
    }

    C10333d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: A */
    private C10889h m47732A(float f, float f2, float f3, int i) {
        C10897m m = C10897m.m48992a().mo43148E(f).mo43152I(f).mo43162v(f2).mo43166z(f2).mo43154m();
        C10889h m2 = C10889h.m48929m(this.f48666b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo43093c0(0, i, 0, i);
        return m2;
    }

    /* renamed from: B */
    private void m47733B() {
        this.f48649p = m47761z(67, 0.0f, 1.0f);
        ValueAnimator z = m47761z(50, 1.0f, 0.0f);
        this.f48648o = z;
        z.addListener(new C10345j());
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public boolean m47734C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f48644k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m47735D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m47736E(boolean z) {
        if (this.f48643j != z) {
            this.f48643j = z;
            this.f48649p.cancel();
            this.f48648o.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m47737F(AutoCompleteTextView autoCompleteTextView) {
        if (f48636q) {
            int boxBackgroundMode = this.f48665a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f48646m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f48645l);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: G */
    public void m47738G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C10343h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f48638e);
        if (f48636q) {
            autoCompleteTextView.setOnDismissListener(new C10344i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m47739H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m47734C()) {
                this.f48642i = false;
            }
            if (!this.f48642i) {
                if (f48636q) {
                    m47736E(!this.f48643j);
                } else {
                    this.f48643j = !this.f48643j;
                    this.f48667c.toggle();
                }
                if (this.f48643j) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f48642i = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m47757v(AutoCompleteTextView autoCompleteTextView) {
        if (!m47735D(autoCompleteTextView)) {
            int boxBackgroundMode = this.f48665a.getBoxBackgroundMode();
            C10889h boxBackground = this.f48665a.getBoxBackground();
            int d = C10538a.m48270d(autoCompleteTextView, C6522b.f26602m);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m47759x(autoCompleteTextView, d, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m47758w(autoCompleteTextView, d, iArr, boxBackground);
            }
        }
    }

    /* renamed from: w */
    private void m47758w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C10889h hVar) {
        int boxBackgroundColor = this.f48665a.getBoxBackgroundColor();
        int[] iArr2 = {C10538a.m48273g(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f48636q) {
            C5723u.m25336r0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), hVar, hVar));
            return;
        }
        C10889h hVar2 = new C10889h(hVar.mo43076D());
        hVar2.mo43091a0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hVar, hVar2});
        int G = C5723u.m25275G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int F = C5723u.m25273F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C5723u.m25336r0(autoCompleteTextView, layerDrawable);
        C5723u.m25268C0(autoCompleteTextView, G, paddingTop, F, paddingBottom);
    }

    /* renamed from: x */
    private void m47759x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C10889h hVar) {
        LayerDrawable layerDrawable;
        int d = C10538a.m48270d(autoCompleteTextView, C6522b.colorSurface);
        C10889h hVar2 = new C10889h(hVar.mo43076D());
        int g = C10538a.m48273g(i, d, 0.1f);
        hVar2.mo43091a0(new ColorStateList(iArr, new int[]{g, 0}));
        if (f48636q) {
            hVar2.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{g, d});
            C10889h hVar3 = new C10889h(hVar.mo43076D());
            hVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{hVar2, hVar});
        }
        C5723u.m25336r0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m47760y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m47761z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10493a.f49008a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C10336b());
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41707a() {
        float dimensionPixelOffset = (float) this.f48666b.getResources().getDimensionPixelOffset(C6524d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f48666b.getResources().getDimensionPixelOffset(C6524d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f48666b.getResources().getDimensionPixelOffset(C6524d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C10889h A = m47732A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C10889h A2 = m47732A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f48646m = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f48645l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f48645l.addState(new int[0], A2);
        this.f48665a.setEndIconDrawable(C5264a.m23789d(this.f48666b, f48636q ? C6525e.mtrl_dropdown_arrow : C6525e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f48665a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C6530j.exposed_dropdown_menu_content_description));
        this.f48665a.setEndIconOnClickListener(new C10342g());
        this.f48665a.mo41547e(this.f48640g);
        this.f48665a.mo41549f(this.f48641h);
        m47733B();
        this.f48647n = (AccessibilityManager) this.f48666b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo41723b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo41724d() {
        return true;
    }
}
