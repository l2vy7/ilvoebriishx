package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p193c6.C6522b;
import p193c6.C6532l;
import p232m6.C10804b;
import p232m6.C10805c;
import p245q6.C10962a;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: f */
    private void m47822f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C6532l.f26735L4);
        int i2 = m47825i(getContext(), obtainStyledAttributes, C6532l.f26757N4, C6532l.f26768O4);
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    /* renamed from: g */
    private static boolean m47823g(Context context) {
        return C10804b.m48750b(context, C6522b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m47824h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6532l.f26779P4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C6532l.f26790Q4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m47825i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C10805c.m48755c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m47826j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6532l.f26779P4, i, i2);
        int i3 = m47825i(context, obtainStyledAttributes, C6532l.f26801R4, C6532l.f26812S4);
        obtainStyledAttributes.recycle();
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m47823g(context)) {
            m47822f(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C10962a.m49296c(context, attributeSet, i, i2), attributeSet, i);
        int h;
        Context context2 = getContext();
        if (m47823g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m47826j(context2, theme, attributeSet, i, i2) && (h = m47824h(theme, attributeSet, i, i2)) != -1) {
                m47822f(theme, h);
            }
        }
    }
}
