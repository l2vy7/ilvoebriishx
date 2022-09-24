package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import p010b0.C1532g;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: M */
    public boolean mo4854M() {
        return !super.mo4906x();
    }

    /* renamed from: x */
    public boolean mo4906x() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1532g.m7903a(context, C1070c.f4778e, 16842892));
    }
}
