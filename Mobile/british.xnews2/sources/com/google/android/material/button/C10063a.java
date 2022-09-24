package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.internal.C10227s;
import p062d0.C5135a;
import p110m0.C5723u;
import p193c6.C6522b;
import p193c6.C6532l;
import p207f6.C10538a;
import p232m6.C10805c;
import p236n6.C10838a;
import p236n6.C10841b;
import p242p6.C10889h;
import p242p6.C10897m;
import p242p6.C10913p;

/* renamed from: com.google.android.material.button.a */
/* compiled from: MaterialButtonHelper */
class C10063a {

    /* renamed from: t */
    private static final boolean f47457t = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f47458a;

    /* renamed from: b */
    private C10897m f47459b;

    /* renamed from: c */
    private int f47460c;

    /* renamed from: d */
    private int f47461d;

    /* renamed from: e */
    private int f47462e;

    /* renamed from: f */
    private int f47463f;

    /* renamed from: g */
    private int f47464g;

    /* renamed from: h */
    private int f47465h;

    /* renamed from: i */
    private PorterDuff.Mode f47466i;

    /* renamed from: j */
    private ColorStateList f47467j;

    /* renamed from: k */
    private ColorStateList f47468k;

    /* renamed from: l */
    private ColorStateList f47469l;

    /* renamed from: m */
    private Drawable f47470m;

    /* renamed from: n */
    private boolean f47471n = false;

    /* renamed from: o */
    private boolean f47472o = false;

    /* renamed from: p */
    private boolean f47473p = false;

    /* renamed from: q */
    private boolean f47474q;

    /* renamed from: r */
    private LayerDrawable f47475r;

    /* renamed from: s */
    private int f47476s;

    C10063a(MaterialButton materialButton, C10897m mVar) {
        this.f47458a = materialButton;
        this.f47459b = mVar;
    }

    /* renamed from: E */
    private void m46078E(int i, int i2) {
        int G = C5723u.m25275G(this.f47458a);
        int paddingTop = this.f47458a.getPaddingTop();
        int F = C5723u.m25273F(this.f47458a);
        int paddingBottom = this.f47458a.getPaddingBottom();
        int i3 = this.f47462e;
        int i4 = this.f47463f;
        this.f47463f = i2;
        this.f47462e = i;
        if (!this.f47472o) {
            m46079F();
        }
        C5723u.m25268C0(this.f47458a, G, (paddingTop + i) - i3, F, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m46079F() {
        this.f47458a.setInternalBackground(m46083a());
        C10889h f = mo39927f();
        if (f != null) {
            f.mo43090Z((float) this.f47476s);
        }
    }

    /* renamed from: G */
    private void m46080G(C10897m mVar) {
        if (mo39927f() != null) {
            mo39927f().setShapeAppearanceModel(mVar);
        }
        if (m46085n() != null) {
            m46085n().setShapeAppearanceModel(mVar);
        }
        if (mo39926e() != null) {
            mo39926e().setShapeAppearanceModel(mVar);
        }
    }

    /* renamed from: I */
    private void m46081I() {
        C10889h f = mo39927f();
        C10889h n = m46085n();
        if (f != null) {
            f.mo43106k0((float) this.f47465h, this.f47468k);
            if (n != null) {
                n.mo43105j0((float) this.f47465h, this.f47471n ? C10538a.m48270d(this.f47458a, C6522b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m46082J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f47460c, this.f47462e, this.f47461d, this.f47463f);
    }

    /* renamed from: a */
    private Drawable m46083a() {
        C10889h hVar = new C10889h(this.f47459b);
        hVar.mo43084P(this.f47458a.getContext());
        C5135a.m23415o(hVar, this.f47467j);
        PorterDuff.Mode mode = this.f47466i;
        if (mode != null) {
            C5135a.m23416p(hVar, mode);
        }
        hVar.mo43106k0((float) this.f47465h, this.f47468k);
        C10889h hVar2 = new C10889h(this.f47459b);
        hVar2.setTint(0);
        hVar2.mo43105j0((float) this.f47465h, this.f47471n ? C10538a.m48270d(this.f47458a, C6522b.colorSurface) : 0);
        if (f47457t) {
            C10889h hVar3 = new C10889h(this.f47459b);
            this.f47470m = hVar3;
            C5135a.m23414n(hVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C10841b.m48833d(this.f47469l), m46082J(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f47470m);
            this.f47475r = rippleDrawable;
            return rippleDrawable;
        }
        C10838a aVar = new C10838a(this.f47459b);
        this.f47470m = aVar;
        C5135a.m23415o(aVar, C10841b.m48833d(this.f47469l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hVar2, hVar, this.f47470m});
        this.f47475r = layerDrawable;
        return m46082J(layerDrawable);
    }

    /* renamed from: g */
    private C10889h m46084g(boolean z) {
        LayerDrawable layerDrawable = this.f47475r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f47457t) {
            return (C10889h) ((LayerDrawable) ((InsetDrawable) this.f47475r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C10889h) this.f47475r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: n */
    private C10889h m46085n() {
        return m46084g(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo39918A(ColorStateList colorStateList) {
        if (this.f47468k != colorStateList) {
            this.f47468k = colorStateList;
            m46081I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo39919B(int i) {
        if (this.f47465h != i) {
            this.f47465h = i;
            m46081I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo39920C(ColorStateList colorStateList) {
        if (this.f47467j != colorStateList) {
            this.f47467j = colorStateList;
            if (mo39927f() != null) {
                C5135a.m23415o(mo39927f(), this.f47467j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo39921D(PorterDuff.Mode mode) {
        if (this.f47466i != mode) {
            this.f47466i = mode;
            if (mo39927f() != null && this.f47466i != null) {
                C5135a.m23416p(mo39927f(), this.f47466i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo39922H(int i, int i2) {
        Drawable drawable = this.f47470m;
        if (drawable != null) {
            drawable.setBounds(this.f47460c, this.f47462e, i2 - this.f47461d, i - this.f47463f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo39923b() {
        return this.f47464g;
    }

    /* renamed from: c */
    public int mo39924c() {
        return this.f47463f;
    }

    /* renamed from: d */
    public int mo39925d() {
        return this.f47462e;
    }

    /* renamed from: e */
    public C10913p mo39926e() {
        LayerDrawable layerDrawable = this.f47475r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f47475r.getNumberOfLayers() > 2) {
            return (C10913p) this.f47475r.getDrawable(2);
        }
        return (C10913p) this.f47475r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C10889h mo39927f() {
        return m46084g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo39928h() {
        return this.f47469l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C10897m mo39929i() {
        return this.f47459b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo39930j() {
        return this.f47468k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo39931k() {
        return this.f47465h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo39932l() {
        return this.f47467j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode mo39933m() {
        return this.f47466i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo39934o() {
        return this.f47472o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo39935p() {
        return this.f47474q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo39936q(TypedArray typedArray) {
        this.f47460c = typedArray.getDimensionPixelOffset(C6532l.f26635C3, 0);
        this.f47461d = typedArray.getDimensionPixelOffset(C6532l.f26646D3, 0);
        this.f47462e = typedArray.getDimensionPixelOffset(C6532l.f26657E3, 0);
        this.f47463f = typedArray.getDimensionPixelOffset(C6532l.f26668F3, 0);
        int i = C6532l.f26712J3;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f47464g = dimensionPixelSize;
            mo39944y(this.f47459b.mo43141w((float) dimensionPixelSize));
            this.f47473p = true;
        }
        this.f47465h = typedArray.getDimensionPixelSize(C6532l.f26822T3, 0);
        this.f47466i = C10227s.m47141i(typedArray.getInt(C6532l.f26701I3, -1), PorterDuff.Mode.SRC_IN);
        this.f47467j = C10805c.m48753a(this.f47458a.getContext(), typedArray, C6532l.f26690H3);
        this.f47468k = C10805c.m48753a(this.f47458a.getContext(), typedArray, C6532l.f26811S3);
        this.f47469l = C10805c.m48753a(this.f47458a.getContext(), typedArray, C6532l.f26800R3);
        this.f47474q = typedArray.getBoolean(C6532l.f26679G3, false);
        this.f47476s = typedArray.getDimensionPixelSize(C6532l.f26723K3, 0);
        int G = C5723u.m25275G(this.f47458a);
        int paddingTop = this.f47458a.getPaddingTop();
        int F = C5723u.m25273F(this.f47458a);
        int paddingBottom = this.f47458a.getPaddingBottom();
        if (typedArray.hasValue(C6532l.f26624B3)) {
            mo39938s();
        } else {
            m46079F();
        }
        C5723u.m25268C0(this.f47458a, G + this.f47460c, paddingTop + this.f47462e, F + this.f47461d, paddingBottom + this.f47463f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo39937r(int i) {
        if (mo39927f() != null) {
            mo39927f().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo39938s() {
        this.f47472o = true;
        this.f47458a.setSupportBackgroundTintList(this.f47467j);
        this.f47458a.setSupportBackgroundTintMode(this.f47466i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo39939t(boolean z) {
        this.f47474q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo39940u(int i) {
        if (!this.f47473p || this.f47464g != i) {
            this.f47464g = i;
            this.f47473p = true;
            mo39944y(this.f47459b.mo43141w((float) i));
        }
    }

    /* renamed from: v */
    public void mo39941v(int i) {
        m46078E(this.f47462e, i);
    }

    /* renamed from: w */
    public void mo39942w(int i) {
        m46078E(i, this.f47463f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo39943x(ColorStateList colorStateList) {
        if (this.f47469l != colorStateList) {
            this.f47469l = colorStateList;
            boolean z = f47457t;
            if (z && (this.f47458a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f47458a.getBackground()).setColor(C10841b.m48833d(colorStateList));
            } else if (!z && (this.f47458a.getBackground() instanceof C10838a)) {
                ((C10838a) this.f47458a.getBackground()).setTintList(C10841b.m48833d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo39944y(C10897m mVar) {
        this.f47459b = mVar;
        m46080G(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo39945z(boolean z) {
        this.f47471n = z;
        m46081I();
    }
}
