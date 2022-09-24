package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C10219l;
import com.google.android.material.textfield.TextInputLayout;
import p078g.C5264a;
import p193c6.C6525e;
import p193c6.C6530j;

/* renamed from: com.google.android.material.textfield.h */
/* compiled from: PasswordToggleEndIconDelegate */
class C10350h extends C10346e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f48694d = new C10351a();

    /* renamed from: e */
    private final TextInputLayout.C10318f f48695e = new C10352b();

    /* renamed from: f */
    private final TextInputLayout.C10319g f48696f = new C10353c();

    /* renamed from: com.google.android.material.textfield.h$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C10351a extends C10219l {
        C10351a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C10350h hVar = C10350h.this;
            hVar.f48667c.setChecked(!hVar.m47817g());
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C10352b implements TextInputLayout.C10318f {
        C10352b() {
        }

        /* renamed from: a */
        public void mo41705a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C10350h hVar = C10350h.this;
            hVar.f48667c.setChecked(!hVar.m47817g());
            editText.removeTextChangedListener(C10350h.this.f48694d);
            editText.addTextChangedListener(C10350h.this.f48694d);
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C10353c implements TextInputLayout.C10319g {

        /* renamed from: com.google.android.material.textfield.h$c$a */
        /* compiled from: PasswordToggleEndIconDelegate */
        class C10354a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ EditText f48700b;

            C10354a(EditText editText) {
                this.f48700b = editText;
            }

            public void run() {
                this.f48700b.removeTextChangedListener(C10350h.this.f48694d);
            }
        }

        C10353c() {
        }

        /* renamed from: a */
        public void mo41706a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C10354a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C10355d implements View.OnClickListener {
        C10355d() {
        }

        public void onClick(View view) {
            EditText editText = C10350h.this.f48665a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C10350h.this.m47817g()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C10350h.this.f48665a.mo41539V();
            }
        }
    }

    C10350h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m47817g() {
        EditText editText = this.f48665a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m47818h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41707a() {
        this.f48665a.setEndIconDrawable(C5264a.m23789d(this.f48666b, C6525e.design_password_eye));
        TextInputLayout textInputLayout = this.f48665a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C6530j.password_toggle_content_description));
        this.f48665a.setEndIconOnClickListener(new C10355d());
        this.f48665a.mo41547e(this.f48695e);
        this.f48665a.mo41549f(this.f48696f);
        EditText editText = this.f48665a.getEditText();
        if (m47818h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
