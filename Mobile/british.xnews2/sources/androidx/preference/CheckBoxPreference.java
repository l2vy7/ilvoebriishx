package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p010b0.C1532g;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: N */
    private final C1044a f4670N;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C1044a implements CompoundButton.OnCheckedChangeListener {
        C1044a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo4890a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo4946R(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: W */
    private void m5351W(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4768I);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f4670N);
        }
    }

    /* renamed from: Y */
    private void m5352Y(View view) {
        if (((AccessibilityManager) mo4893d().getSystemService("accessibility")).isEnabled()) {
            m5351W(view.findViewById(16908289));
            mo4950V(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo4846H(View view) {
        super.mo4846H(view);
        m5352Y(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4670N = new C1044a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4916r, i, i2);
        mo4949U(C1532g.m7917o(obtainStyledAttributes, C1074g.f4934x, C1074g.f4919s));
        mo4948T(C1532g.m7917o(obtainStyledAttributes, C1074g.f4931w, C1074g.f4922t));
        mo4947S(C1532g.m7904b(obtainStyledAttributes, C1074g.f4928v, C1074g.f4925u, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4774a, 16842895));
    }
}
