package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p079g.C5264a;
import p194c6.C6525e;
import p194c6.C6530j;
import p200d6.C10493a;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: ClearTextEndIconDelegate */
class C10320a extends C10346e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f48616d = new C10321a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f48617e = new C10322b();

    /* renamed from: f */
    private final TextInputLayout.C10318f f48618f = new C10323c();

    /* renamed from: g */
    private final TextInputLayout.C10319g f48619g = new C10324d();

    /* renamed from: h */
    private AnimatorSet f48620h;

    /* renamed from: i */
    private ValueAnimator f48621i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    class C10321a implements TextWatcher {
        C10321a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C10320a.this.f48665a.getSuffixText() == null) {
                C10320a aVar = C10320a.this;
                aVar.m47713i(aVar.f48665a.hasFocus() && C10320a.m47716l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    class C10322b implements View.OnFocusChangeListener {
        C10322b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C10320a aVar = C10320a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.m47713i(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    class C10323c implements TextInputLayout.C10318f {
        C10323c() {
        }

        /* renamed from: a */
        public void mo41705a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C10320a.m47716l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C10320a.this.f48617e);
            editText.removeTextChangedListener(C10320a.this.f48616d);
            editText.addTextChangedListener(C10320a.this.f48616d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    class C10324d implements TextInputLayout.C10319g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* compiled from: ClearTextEndIconDelegate */
        class C10325a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ EditText f48626b;

            C10325a(EditText editText) {
                this.f48626b = editText;
            }

            public void run() {
                this.f48626b.removeTextChangedListener(C10320a.this.f48616d);
            }
        }

        C10324d() {
        }

        /* renamed from: a */
        public void mo41706a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C10325a(editText));
                if (editText.getOnFocusChangeListener() == C10320a.this.f48617e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    class C10326e implements View.OnClickListener {
        C10326e() {
        }

        public void onClick(View view) {
            Editable text = C10320a.this.f48665a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C10320a.this.f48665a.mo41539V();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    class C10327f extends AnimatorListenerAdapter {
        C10327f() {
        }

        public void onAnimationStart(Animator animator) {
            C10320a.this.f48665a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    class C10328g extends AnimatorListenerAdapter {
        C10328g() {
        }

        public void onAnimationEnd(Animator animator) {
            C10320a.this.f48665a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    /* compiled from: ClearTextEndIconDelegate */
    class C10329h implements ValueAnimator.AnimatorUpdateListener {
        C10329h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C10320a.this.f48667c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    /* compiled from: ClearTextEndIconDelegate */
    class C10330i implements ValueAnimator.AnimatorUpdateListener {
        C10330i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C10320a.this.f48667c.setScaleX(floatValue);
            C10320a.this.f48667c.setScaleY(floatValue);
        }
    }

    C10320a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m47713i(boolean z) {
        boolean z2 = this.f48665a.mo41534K() == z;
        if (z && !this.f48620h.isRunning()) {
            this.f48621i.cancel();
            this.f48620h.start();
            if (z2) {
                this.f48620h.end();
            }
        } else if (!z) {
            this.f48620h.cancel();
            this.f48621i.start();
            if (z2) {
                this.f48621i.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m47714j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10493a.f49008a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C10329h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m47715k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C10493a.f49011d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C10330i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m47716l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m47717m() {
        ValueAnimator k = m47715k();
        ValueAnimator j = m47714j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f48620h = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f48620h.addListener(new C10327f());
        ValueAnimator j2 = m47714j(1.0f, 0.0f);
        this.f48621i = j2;
        j2.addListener(new C10328g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41707a() {
        this.f48665a.setEndIconDrawable(C5264a.m23789d(this.f48666b, C6525e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f48665a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C6530j.clear_text_end_icon_content_description));
        this.f48665a.setEndIconOnClickListener(new C10326e());
        this.f48665a.mo41547e(this.f48618f);
        this.f48665a.mo41549f(this.f48619g);
        m47717m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41708c(boolean z) {
        if (this.f48665a.getSuffixText() != null) {
            m47713i(z);
        }
    }
}
