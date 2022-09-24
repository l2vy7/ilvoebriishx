package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p010b0.C1532g;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: N */
    private final C1064a f4764N;

    /* renamed from: O */
    private CharSequence f4765O;

    /* renamed from: P */
    private CharSequence f4766P;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C1064a implements CompoundButton.OnCheckedChangeListener {
        C1064a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo4890a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo4946R(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4764N = new C1064a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4819K1, i, i2);
        mo4949U(C1532g.m7917o(obtainStyledAttributes, C1074g.f4843S1, C1074g.f4822L1));
        mo4948T(C1532g.m7917o(obtainStyledAttributes, C1074g.f4840R1, C1074g.f4825M1));
        mo4943Y(C1532g.m7917o(obtainStyledAttributes, C1074g.f4849U1, C1074g.f4831O1));
        mo4942W(C1532g.m7917o(obtainStyledAttributes, C1074g.f4846T1, C1074g.f4834P1));
        mo4947S(C1532g.m7904b(obtainStyledAttributes, C1074g.f4837Q1, C1074g.f4828N1, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Z */
    private void m5445Z(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4768I);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f4765O);
            switchCompat.setTextOff(this.f4766P);
            switchCompat.setOnCheckedChangeListener(this.f4764N);
        }
    }

    /* renamed from: a0 */
    private void m5446a0(View view) {
        if (((AccessibilityManager) mo4893d().getSystemService("accessibility")).isEnabled()) {
            m5445Z(view.findViewById(C1071d.f4784a));
            mo4950V(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo4846H(View view) {
        super.mo4846H(view);
        m5446a0(view);
    }

    /* renamed from: W */
    public void mo4942W(CharSequence charSequence) {
        this.f4766P = charSequence;
        mo4849A();
    }

    /* renamed from: Y */
    public void mo4943Y(CharSequence charSequence) {
        this.f4765O = charSequence;
        mo4849A();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1070c.f4782i);
    }
}
