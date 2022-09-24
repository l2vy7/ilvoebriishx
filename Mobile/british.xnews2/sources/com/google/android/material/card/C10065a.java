package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import p062d0.C5135a;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6526f;
import p193c6.C6531k;
import p193c6.C6532l;
import p207f6.C10538a;
import p232m6.C10805c;
import p236n6.C10841b;
import p242p6.C10885d;
import p242p6.C10886e;
import p242p6.C10889h;
import p242p6.C10896l;
import p242p6.C10897m;

/* renamed from: com.google.android.material.card.a */
/* compiled from: MaterialCardViewHelper */
class C10065a {

    /* renamed from: t */
    private static final int[] f47486t = {16842912};

    /* renamed from: u */
    private static final double f47487u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    private final MaterialCardView f47488a;

    /* renamed from: b */
    private final Rect f47489b = new Rect();

    /* renamed from: c */
    private final C10889h f47490c;

    /* renamed from: d */
    private final C10889h f47491d;

    /* renamed from: e */
    private int f47492e;

    /* renamed from: f */
    private int f47493f;

    /* renamed from: g */
    private int f47494g;

    /* renamed from: h */
    private Drawable f47495h;

    /* renamed from: i */
    private Drawable f47496i;

    /* renamed from: j */
    private ColorStateList f47497j;

    /* renamed from: k */
    private ColorStateList f47498k;

    /* renamed from: l */
    private C10897m f47499l;

    /* renamed from: m */
    private ColorStateList f47500m;

    /* renamed from: n */
    private Drawable f47501n;

    /* renamed from: o */
    private LayerDrawable f47502o;

    /* renamed from: p */
    private C10889h f47503p;

    /* renamed from: q */
    private C10889h f47504q;

    /* renamed from: r */
    private boolean f47505r = false;

    /* renamed from: s */
    private boolean f47506s;

    /* renamed from: com.google.android.material.card.a$a */
    /* compiled from: MaterialCardViewHelper */
    class C10066a extends InsetDrawable {
        C10066a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C10065a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f47488a = materialCardView;
        C10889h hVar = new C10889h(materialCardView.getContext(), attributeSet, i, i2);
        this.f47490c = hVar;
        hVar.mo43084P(materialCardView.getContext());
        hVar.mo43097g0(-12303292);
        C10897m.C10899b v = hVar.mo43076D().mo43140v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C6532l.f26610A0, i, C6531k.f26606a);
        int i3 = C6532l.f26621B0;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo43155o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f47491d = new C10889h();
        mo40006R(v.mo43154m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m46120B(Drawable drawable) {
        int i;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f47488a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) m46128d());
            i2 = (int) Math.ceil((double) m46126c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C10066a(drawable, i2, i, i2, i);
    }

    /* renamed from: V */
    private boolean m46121V() {
        return this.f47488a.getPreventCornerOverlap() && !m46129e();
    }

    /* renamed from: W */
    private boolean m46122W() {
        return this.f47488a.getPreventCornerOverlap() && m46129e() && this.f47488a.getUseCompatPadding();
    }

    /* renamed from: a */
    private float m46123a() {
        return Math.max(Math.max(m46125b(this.f47499l.mo43135q(), this.f47490c.mo43080I()), m46125b(this.f47499l.mo43137s(), this.f47490c.mo43081J())), Math.max(m46125b(this.f47499l.mo43130k(), this.f47490c.mo43114t()), m46125b(this.f47499l.mo43128i(), this.f47490c.mo43113s())));
    }

    /* renamed from: a0 */
    private void m46124a0(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f47488a.getForeground() instanceof InsetDrawable)) {
            this.f47488a.setForeground(m46120B(drawable));
        } else {
            ((InsetDrawable) this.f47488a.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: b */
    private float m46125b(C10885d dVar, float f) {
        if (dVar instanceof C10896l) {
            double d = (double) f;
            Double.isNaN(d);
            return (float) ((1.0d - f47487u) * d);
        } else if (dVar instanceof C10886e) {
            return f / 2.0f;
        } else {
            return 0.0f;
        }
    }

    /* renamed from: c */
    private float m46126c() {
        return this.f47488a.getMaxCardElevation() + (m46122W() ? m46123a() : 0.0f);
    }

    /* renamed from: c0 */
    private void m46127c0() {
        Drawable drawable;
        if (!C10841b.f49599a || (drawable = this.f47501n) == null) {
            C10889h hVar = this.f47503p;
            if (hVar != null) {
                hVar.mo43091a0(this.f47497j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f47497j);
    }

    /* renamed from: d */
    private float m46128d() {
        return (this.f47488a.getMaxCardElevation() * 1.5f) + (m46122W() ? m46123a() : 0.0f);
    }

    /* renamed from: e */
    private boolean m46129e() {
        return Build.VERSION.SDK_INT >= 21 && this.f47490c.mo43086S();
    }

    /* renamed from: f */
    private Drawable m46130f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f47496i;
        if (drawable != null) {
            stateListDrawable.addState(f47486t, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m46131g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C10889h i = m46133i();
        this.f47503p = i;
        i.mo43091a0(this.f47497j);
        stateListDrawable.addState(new int[]{16842919}, this.f47503p);
        return stateListDrawable;
    }

    /* renamed from: h */
    private Drawable m46132h() {
        if (!C10841b.f49599a) {
            return m46131g();
        }
        this.f47504q = m46133i();
        return new RippleDrawable(this.f47497j, (Drawable) null, this.f47504q);
    }

    /* renamed from: i */
    private C10889h m46133i() {
        return new C10889h(this.f47499l);
    }

    /* renamed from: r */
    private Drawable m46134r() {
        if (this.f47501n == null) {
            this.f47501n = m46132h();
        }
        if (this.f47502o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f47501n, this.f47491d, m46130f()});
            this.f47502o = layerDrawable;
            layerDrawable.setId(2, C6526f.mtrl_card_checked_layer_id);
        }
        return this.f47502o;
    }

    /* renamed from: t */
    private float m46135t() {
        if (!this.f47488a.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.f47488a.getUseCompatPadding()) {
            return 0.0f;
        }
        double d = 1.0d - f47487u;
        double cardViewRadius = (double) this.f47488a.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d * cardViewRadius);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect mo39990A() {
        return this.f47489b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo39991C() {
        return this.f47505r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo39992D() {
        return this.f47506s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo39993E(TypedArray typedArray) {
        ColorStateList a = C10805c.m48753a(this.f47488a.getContext(), typedArray, C6532l.f26614A4);
        this.f47500m = a;
        if (a == null) {
            this.f47500m = ColorStateList.valueOf(-1);
        }
        this.f47494g = typedArray.getDimensionPixelSize(C6532l.f26625B4, 0);
        boolean z = typedArray.getBoolean(C6532l.f27102t4, false);
        this.f47506s = z;
        this.f47488a.setLongClickable(z);
        this.f47498k = C10805c.m48753a(this.f47488a.getContext(), typedArray, C6532l.f27157y4);
        mo39999K(C10805c.m48756d(this.f47488a.getContext(), typedArray, C6532l.f27124v4));
        mo40001M(typedArray.getDimensionPixelSize(C6532l.f27146x4, 0));
        mo40000L(typedArray.getDimensionPixelSize(C6532l.f27135w4, 0));
        ColorStateList a2 = C10805c.m48753a(this.f47488a.getContext(), typedArray, C6532l.f27168z4);
        this.f47497j = a2;
        if (a2 == null) {
            this.f47497j = ColorStateList.valueOf(C10538a.m48270d(this.f47488a, C6522b.f26602m));
        }
        mo39997I(C10805c.m48753a(this.f47488a.getContext(), typedArray, C6532l.f27113u4));
        m46127c0();
        mo40012Z();
        mo40014d0();
        this.f47488a.setBackgroundInternal(m46120B(this.f47490c));
        Drawable r = this.f47488a.isClickable() ? m46134r() : this.f47491d;
        this.f47495h = r;
        this.f47488a.setForeground(m46120B(r));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo39994F(int i, int i2) {
        int i3;
        int i4;
        if (this.f47502o != null) {
            int i5 = this.f47492e;
            int i6 = this.f47493f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if ((Build.VERSION.SDK_INT < 21) || this.f47488a.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (m46128d() * 2.0f));
                i7 -= (int) Math.ceil((double) (m46126c() * 2.0f));
            }
            int i9 = i8;
            int i10 = this.f47492e;
            if (C5723u.m25265B(this.f47488a) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            this.f47502o.setLayerInset(2, i4, this.f47492e, i3, i9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo39995G(boolean z) {
        this.f47505r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo39996H(ColorStateList colorStateList) {
        this.f47490c.mo43091a0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo39997I(ColorStateList colorStateList) {
        C10889h hVar = this.f47491d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.mo43091a0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo39998J(boolean z) {
        this.f47506s = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo39999K(Drawable drawable) {
        this.f47496i = drawable;
        if (drawable != null) {
            Drawable r = C5135a.m23418r(drawable.mutate());
            this.f47496i = r;
            C5135a.m23415o(r, this.f47498k);
        }
        if (this.f47502o != null) {
            this.f47502o.setDrawableByLayerId(C6526f.mtrl_card_checked_layer_id, m46130f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo40000L(int i) {
        this.f47492e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo40001M(int i) {
        this.f47493f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo40002N(ColorStateList colorStateList) {
        this.f47498k = colorStateList;
        Drawable drawable = this.f47496i;
        if (drawable != null) {
            C5135a.m23415o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo40003O(float f) {
        mo40006R(this.f47499l.mo43141w(f));
        this.f47495h.invalidateSelf();
        if (m46122W() || m46121V()) {
            mo40011Y();
        }
        if (m46122W()) {
            mo40013b0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo40004P(float f) {
        this.f47490c.mo43092b0(f);
        C10889h hVar = this.f47491d;
        if (hVar != null) {
            hVar.mo43092b0(f);
        }
        C10889h hVar2 = this.f47504q;
        if (hVar2 != null) {
            hVar2.mo43092b0(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo40005Q(ColorStateList colorStateList) {
        this.f47497j = colorStateList;
        m46127c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo40006R(C10897m mVar) {
        this.f47499l = mVar;
        this.f47490c.setShapeAppearanceModel(mVar);
        C10889h hVar = this.f47490c;
        hVar.mo43096f0(!hVar.mo43086S());
        C10889h hVar2 = this.f47491d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(mVar);
        }
        C10889h hVar3 = this.f47504q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(mVar);
        }
        C10889h hVar4 = this.f47503p;
        if (hVar4 != null) {
            hVar4.setShapeAppearanceModel(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo40007S(ColorStateList colorStateList) {
        if (this.f47500m != colorStateList) {
            this.f47500m = colorStateList;
            mo40014d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo40008T(int i) {
        if (i != this.f47494g) {
            this.f47494g = i;
            mo40014d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo40009U(int i, int i2, int i3, int i4) {
        this.f47489b.set(i, i2, i3, i4);
        mo40011Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo40010X() {
        Drawable drawable = this.f47495h;
        Drawable r = this.f47488a.isClickable() ? m46134r() : this.f47491d;
        this.f47495h = r;
        if (drawable != r) {
            m46124a0(r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo40011Y() {
        int a = (int) ((m46121V() || m46122W() ? m46123a() : 0.0f) - m46135t());
        MaterialCardView materialCardView = this.f47488a;
        Rect rect = this.f47489b;
        materialCardView.mo39961m(rect.left + a, rect.top + a, rect.right + a, rect.bottom + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo40012Z() {
        this.f47490c.mo43090Z(this.f47488a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo40013b0() {
        if (!mo39991C()) {
            this.f47488a.setBackgroundInternal(m46120B(this.f47490c));
        }
        this.f47488a.setForeground(m46120B(this.f47495h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo40014d0() {
        this.f47491d.mo43106k0((float) this.f47494g, this.f47500m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo40015j() {
        Drawable drawable = this.f47501n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f47501n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f47501n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C10889h mo40016k() {
        return this.f47490c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo40017l() {
        return this.f47490c.mo43117x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ColorStateList mo40018m() {
        return this.f47491d.mo43117x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Drawable mo40019n() {
        return this.f47496i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo40020o() {
        return this.f47492e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo40021p() {
        return this.f47493f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList mo40022q() {
        return this.f47498k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo40023s() {
        return this.f47490c.mo43080I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo40024u() {
        return this.f47490c.mo43118y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList mo40025v() {
        return this.f47497j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C10897m mo40026w() {
        return this.f47499l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo40027x() {
        ColorStateList colorStateList = this.f47500m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList mo40028y() {
        return this.f47500m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo40029z() {
        return this.f47494g;
    }
}
