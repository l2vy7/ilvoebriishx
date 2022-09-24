package p245q6;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p098k.C5525d;
import p193c6.C6522b;

/* renamed from: q6.a */
/* compiled from: MaterialThemeOverlay */
public class C10962a {

    /* renamed from: a */
    private static final int[] f49911a = {16842752, C6522b.f26597V};

    /* renamed from: b */
    private static final int[] f49912b = {C6522b.materialThemeOverlay};

    /* renamed from: a */
    private static int m49294a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f49911a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m49295b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f49912b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m49296c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b = m49295b(context, attributeSet, i, i2);
        boolean z = (context instanceof C5525d) && ((C5525d) context).mo22017c() == b;
        if (b == 0 || z) {
            return context;
        }
        C5525d dVar = new C5525d(context, b);
        int a = m49294a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
