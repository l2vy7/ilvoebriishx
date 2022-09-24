package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p010b0.C1532g;

public abstract class DialogPreference extends Preference {

    /* renamed from: I */
    private CharSequence f4672I;

    /* renamed from: J */
    private CharSequence f4673J;

    /* renamed from: K */
    private Drawable f4674K;

    /* renamed from: L */
    private CharSequence f4675L;

    /* renamed from: M */
    private CharSequence f4676M;

    /* renamed from: N */
    private int f4677N;

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1074g.f4793C, i, i2);
        String o = C1532g.m7917o(obtainStyledAttributes, C1074g.f4823M, C1074g.f4796D);
        this.f4672I = o;
        if (o == null) {
            this.f4672I = mo4904u();
        }
        this.f4673J = C1532g.m7917o(obtainStyledAttributes, C1074g.f4820L, C1074g.f4799E);
        this.f4674K = C1532g.m7905c(obtainStyledAttributes, C1074g.f4814J, C1074g.f4802F);
        this.f4675L = C1532g.m7917o(obtainStyledAttributes, C1074g.f4829O, C1074g.f4805G);
        this.f4676M = C1532g.m7917o(obtainStyledAttributes, C1074g.f4826N, C1074g.f4808H);
        this.f4677N = C1532g.m7916n(obtainStyledAttributes, C1074g.f4817K, C1074g.f4811I, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo4848C() {
        mo4901p().mo4963j(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4775b, 16842897));
    }
}
