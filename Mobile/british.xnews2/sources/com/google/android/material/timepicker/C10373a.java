package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.google.android.material.timepicker.a */
/* compiled from: MaxInputValidator */
class C10373a implements InputFilter {

    /* renamed from: a */
    private int f48769a;

    public C10373a(int i) {
        this.f48769a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f48769a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
