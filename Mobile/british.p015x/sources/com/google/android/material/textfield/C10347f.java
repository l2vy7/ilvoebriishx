package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C0624k;
import java.util.ArrayList;
import java.util.List;
import p111m0.C5723u;
import p194c6.C6524d;
import p194c6.C6526f;
import p200d6.C10493a;
import p200d6.C10494b;
import p233m6.C10805c;

/* renamed from: com.google.android.material.textfield.f */
/* compiled from: IndicatorViewController */
final class C10347f {

    /* renamed from: a */
    private final Context f48668a;

    /* renamed from: b */
    private final TextInputLayout f48669b;

    /* renamed from: c */
    private LinearLayout f48670c;

    /* renamed from: d */
    private int f48671d;

    /* renamed from: e */
    private FrameLayout f48672e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Animator f48673f;

    /* renamed from: g */
    private final float f48674g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f48675h;

    /* renamed from: i */
    private int f48676i;

    /* renamed from: j */
    private CharSequence f48677j;

    /* renamed from: k */
    private boolean f48678k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public TextView f48679l;

    /* renamed from: m */
    private CharSequence f48680m;

    /* renamed from: n */
    private int f48681n;

    /* renamed from: o */
    private ColorStateList f48682o;

    /* renamed from: p */
    private CharSequence f48683p;

    /* renamed from: q */
    private boolean f48684q;

    /* renamed from: r */
    private TextView f48685r;

    /* renamed from: s */
    private int f48686s;

    /* renamed from: t */
    private ColorStateList f48687t;

    /* renamed from: u */
    private Typeface f48688u;

    /* renamed from: com.google.android.material.textfield.f$a */
    /* compiled from: IndicatorViewController */
    class C10348a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f48689a;

        /* renamed from: b */
        final /* synthetic */ TextView f48690b;

        /* renamed from: c */
        final /* synthetic */ int f48691c;

        /* renamed from: d */
        final /* synthetic */ TextView f48692d;

        C10348a(int i, TextView textView, int i2, TextView textView2) {
            this.f48689a = i;
            this.f48690b = textView;
            this.f48691c = i2;
            this.f48692d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C10347f.this.f48675h = this.f48689a;
            Animator unused2 = C10347f.this.f48673f = null;
            TextView textView = this.f48690b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f48691c == 1 && C10347f.this.f48679l != null) {
                    C10347f.this.f48679l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f48692d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f48692d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f48692d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C10347f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f48668a = context;
        this.f48669b = textInputLayout;
        this.f48674g = (float) context.getResources().getDimensionPixelSize(C6524d.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    private void m47773A(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m47785l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m47785l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f48675h = i2;
        }
    }

    /* renamed from: I */
    private void m47774I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: K */
    private void m47775K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: L */
    private boolean m47776L(TextView textView, CharSequence charSequence) {
        return C5723u.m25294T(this.f48669b) && this.f48669b.isEnabled() && (this.f48676i != this.f48675h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: O */
    private void m47777O(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f48673f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                m47782h(arrayList2, this.f48684q, this.f48685r, 2, i3, i4);
                m47782h(arrayList2, this.f48678k, this.f48679l, 1, i3, i4);
                C10494b.m48201a(animatorSet, arrayList);
                animatorSet.addListener(new C10348a(i2, m47785l(i), i, m47785l(i2)));
                animatorSet.start();
            } else {
                m47773A(i, i2);
            }
            this.f48669b.mo41605s0();
            this.f48669b.mo41691v0(z2);
            this.f48669b.mo41533F0();
        }
    }

    /* renamed from: f */
    private boolean m47781f() {
        return (this.f48670c == null || this.f48669b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m47782h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m47783i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m47784j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m47783i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C10493a.f49008a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m47784j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f48674g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C10493a.f49011d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m47785l(int i) {
        if (i == 1) {
            return this.f48679l;
        }
        if (i != 2) {
            return null;
        }
        return this.f48685r;
    }

    /* renamed from: s */
    private int m47786s(boolean z, int i, int i2) {
        return z ? this.f48668a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: v */
    private boolean m47787v(int i) {
        if (i != 1 || this.f48679l == null || TextUtils.isEmpty(this.f48677j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo41733B(CharSequence charSequence) {
        this.f48680m = charSequence;
        TextView textView = this.f48679l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo41734C(boolean z) {
        if (this.f48678k != z) {
            mo41745g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f48668a);
                this.f48679l = appCompatTextView;
                appCompatTextView.setId(C6526f.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f48679l.setTextAlignment(5);
                }
                Typeface typeface = this.f48688u;
                if (typeface != null) {
                    this.f48679l.setTypeface(typeface);
                }
                mo41735D(this.f48681n);
                mo41736E(this.f48682o);
                mo41733B(this.f48680m);
                this.f48679l.setVisibility(4);
                C5723u.m25334q0(this.f48679l, 1);
                mo41743d(this.f48679l, 0);
            } else {
                mo41753t();
                mo41758z(this.f48679l, 0);
                this.f48679l = null;
                this.f48669b.mo41605s0();
                this.f48669b.mo41533F0();
            }
            this.f48678k = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo41735D(int i) {
        this.f48681n = i;
        TextView textView = this.f48679l;
        if (textView != null) {
            this.f48669b.mo41548e0(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo41736E(ColorStateList colorStateList) {
        this.f48682o = colorStateList;
        TextView textView = this.f48679l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo41737F(int i) {
        this.f48686s = i;
        TextView textView = this.f48685r;
        if (textView != null) {
            C0624k.m3467q(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo41738G(boolean z) {
        if (this.f48684q != z) {
            mo41745g();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f48668a);
                this.f48685r = appCompatTextView;
                appCompatTextView.setId(C6526f.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f48685r.setTextAlignment(5);
                }
                Typeface typeface = this.f48688u;
                if (typeface != null) {
                    this.f48685r.setTypeface(typeface);
                }
                this.f48685r.setVisibility(4);
                C5723u.m25334q0(this.f48685r, 1);
                mo41737F(this.f48686s);
                mo41739H(this.f48687t);
                mo41743d(this.f48685r, 1);
            } else {
                mo41754u();
                mo41758z(this.f48685r, 1);
                this.f48685r = null;
                this.f48669b.mo41605s0();
                this.f48669b.mo41533F0();
            }
            this.f48684q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo41739H(ColorStateList colorStateList) {
        this.f48687t = colorStateList;
        TextView textView = this.f48685r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo41740J(Typeface typeface) {
        if (typeface != this.f48688u) {
            this.f48688u = typeface;
            m47774I(this.f48679l, typeface);
            m47774I(this.f48685r, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo41741M(CharSequence charSequence) {
        mo41745g();
        this.f48677j = charSequence;
        this.f48679l.setText(charSequence);
        int i = this.f48675h;
        if (i != 1) {
            this.f48676i = 1;
        }
        m47777O(i, this.f48676i, m47776L(this.f48679l, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo41742N(CharSequence charSequence) {
        mo41745g();
        this.f48683p = charSequence;
        this.f48685r.setText(charSequence);
        int i = this.f48675h;
        if (i != 2) {
            this.f48676i = 2;
        }
        m47777O(i, this.f48676i, m47776L(this.f48685r, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41743d(TextView textView, int i) {
        if (this.f48670c == null && this.f48672e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f48668a);
            this.f48670c = linearLayout;
            linearLayout.setOrientation(0);
            this.f48669b.addView(this.f48670c, -1, -2);
            this.f48672e = new FrameLayout(this.f48668a);
            this.f48670c.addView(this.f48672e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f48669b.getEditText() != null) {
                mo41744e();
            }
        }
        if (mo41755w(i)) {
            this.f48672e.setVisibility(0);
            this.f48672e.addView(textView);
        } else {
            this.f48670c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f48670c.setVisibility(0);
        this.f48671d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41744e() {
        if (m47781f()) {
            EditText editText = this.f48669b.getEditText();
            boolean g = C10805c.m48759g(this.f48668a);
            LinearLayout linearLayout = this.f48670c;
            int i = C6524d.material_helper_text_font_1_3_padding_horizontal;
            C5723u.m25268C0(linearLayout, m47786s(g, i, C5723u.m25275G(editText)), m47786s(g, C6524d.material_helper_text_font_1_3_padding_top, this.f48668a.getResources().getDimensionPixelSize(C6524d.material_helper_text_default_padding_top)), m47786s(g, i, C5723u.m25273F(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo41745g() {
        Animator animator = this.f48673f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo41746k() {
        return m47787v(this.f48676i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence mo41747m() {
        return this.f48680m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence mo41748n() {
        return this.f48677j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo41749o() {
        TextView textView = this.f48679l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList mo41750p() {
        TextView textView = this.f48679l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence mo41751q() {
        return this.f48683p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo41752r() {
        TextView textView = this.f48685r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo41753t() {
        this.f48677j = null;
        mo41745g();
        if (this.f48675h == 1) {
            if (!this.f48684q || TextUtils.isEmpty(this.f48683p)) {
                this.f48676i = 0;
            } else {
                this.f48676i = 2;
            }
        }
        m47777O(this.f48675h, this.f48676i, m47776L(this.f48679l, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo41754u() {
        mo41745g();
        int i = this.f48675h;
        if (i == 2) {
            this.f48676i = 0;
        }
        m47777O(i, this.f48676i, m47776L(this.f48685r, (CharSequence) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo41755w(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo41756x() {
        return this.f48678k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo41757y() {
        return this.f48684q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo41758z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f48670c != null) {
            if (!mo41755w(i) || (frameLayout = this.f48672e) == null) {
                this.f48670c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f48671d - 1;
            this.f48671d = i2;
            m47775K(this.f48670c, i2);
        }
    }
}
