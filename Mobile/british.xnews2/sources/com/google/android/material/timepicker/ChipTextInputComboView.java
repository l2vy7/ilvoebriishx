package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C10219l;
import com.google.android.material.textfield.TextInputLayout;
import p193c6.C6526f;
import p193c6.C6528h;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Chip f48703b;

    /* renamed from: c */
    private final TextInputLayout f48704c;

    /* renamed from: d */
    private final EditText f48705d;

    /* renamed from: e */
    private TextWatcher f48706e;

    /* renamed from: f */
    private TextView f48707f;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    private class C10357b extends C10219l {
        private C10357b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f48703b.setText(ChipTextInputComboView.this.m47834c("00"));
            } else {
                ChipTextInputComboView.this.f48703b.setText(ChipTextInputComboView.this.m47834c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m47834c(CharSequence charSequence) {
        return TimeModel.m47868a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m47835d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f48705d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f48703b.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m47835d();
    }

    public void setChecked(boolean z) {
        this.f48703b.setChecked(z);
        int i = 0;
        this.f48705d.setVisibility(z ? 0 : 4);
        Chip chip = this.f48703b;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            this.f48705d.requestFocus();
            if (!TextUtils.isEmpty(this.f48705d.getText())) {
                EditText editText = this.f48705d;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f48703b.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f48703b.setTag(i, obj);
    }

    public void toggle() {
        this.f48703b.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C6528h.material_time_chip, this, false);
        this.f48703b = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C6528h.material_time_input, this, false);
        this.f48704c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f48705d = editText;
        editText.setVisibility(4);
        C10357b bVar = new C10357b();
        this.f48706e = bVar;
        editText.addTextChangedListener(bVar);
        m47835d();
        addView(chip);
        addView(textInputLayout);
        this.f48707f = (TextView) findViewById(C6526f.material_label);
        editText.setSaveEnabled(false);
    }
}
