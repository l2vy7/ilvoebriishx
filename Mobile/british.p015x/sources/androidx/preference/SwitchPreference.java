package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p010b0.C1532g;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: N */
    private final C1063a f4760N;

    /* renamed from: O */
    private CharSequence f4761O;

    /* renamed from: P */
    private CharSequence f4762P;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C1063a implements CompoundButton.OnCheckedChangeListener {
        C1063a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo4890a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo4946R(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4760N = new C1063a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4942z1, i, i2);
        mo4949U(C1532g.m7917o(obtainStyledAttributes, C1074g.f4810H1, C1074g.f4789A1));
        mo4948T(C1532g.m7917o(obtainStyledAttributes, C1074g.f4807G1, C1074g.f4792B1));
        mo4940Y(C1532g.m7917o(obtainStyledAttributes, C1074g.f4816J1, C1074g.f4798D1));
        mo4939W(C1532g.m7917o(obtainStyledAttributes, C1074g.f4813I1, C1074g.f4801E1));
        mo4947S(C1532g.m7904b(obtainStyledAttributes, C1074g.f4804F1, C1074g.f4795C1, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Z */
    private void m5440Z(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4768I);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f4761O);
            switchR.setTextOff(this.f4762P);
            switchR.setOnCheckedChangeListener(this.f4760N);
        }
    }

    /* renamed from: a0 */
    private void m5441a0(View view) {
        if (((AccessibilityManager) mo4893d().getSystemService("accessibility")).isEnabled()) {
            m5440Z(view.findViewById(16908352));
            mo4950V(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo4846H(View view) {
        super.mo4846H(view);
        m5441a0(view);
    }

    /* renamed from: W */
    public void mo4939W(CharSequence charSequence) {
        this.f4762P = charSequence;
        mo4849A();
    }

    /* renamed from: Y */
    public void mo4940Y(CharSequence charSequence) {
        this.f4761O = charSequence;
        mo4849A();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4783j, 16843629));
    }
}
