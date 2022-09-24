package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0384f0;
import p194c6.C6522b;
import p194c6.C6532l;

/* renamed from: com.google.android.material.internal.m */
/* compiled from: ThemeEnforcement */
public final class C10220m {

    /* renamed from: a */
    private static final int[] f48129a = {C6522b.f26603p};

    /* renamed from: b */
    private static final int[] f48130b = {C6522b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m47109a(Context context) {
        m47113e(context, f48129a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m47110b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f27173z9, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C6532l.f26630B9, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C6522b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m47111c(context);
            }
        }
        m47109a(context);
    }

    /* renamed from: c */
    public static void m47111c(Context context) {
        m47113e(context, f48130b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m47112d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6532l.f27173z9, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C6532l.f26641C9, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C6532l.f26619A9, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m47114f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m47113e(Context context, int[] iArr, String str) {
        if (!m47115g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    private static boolean m47114f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m47115g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m47116h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m47110b(context, attributeSet, i, i2);
        m47112d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C0384f0 m47117i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m47110b(context, attributeSet, i, i2);
        m47112d(context, attributeSet, iArr, i, i2, iArr2);
        return C0384f0.m1994v(context, attributeSet, iArr, i, i2);
    }
}
