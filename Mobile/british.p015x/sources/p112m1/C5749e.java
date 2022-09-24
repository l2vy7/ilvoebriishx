package p112m1;

import android.view.View;
import androidx.transition.C1336u;

/* renamed from: m1.e */
/* compiled from: VisibilityPropagation */
public abstract class C5749e extends C5748d {

    /* renamed from: a */
    private static final String[] f24390a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d */
    private static int m25441d(C1336u uVar, int i) {
        int[] iArr;
        if (uVar == null || (iArr = (int[]) uVar.f5949a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    /* renamed from: a */
    public void mo22520a(C1336u uVar) {
        View view = uVar.f5950b;
        Integer num = (Integer) uVar.f5949a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        uVar.f5949a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        uVar.f5949a.put("android:visibilityPropagation:center", iArr);
    }

    /* renamed from: b */
    public String[] mo22521b() {
        return f24390a;
    }

    /* renamed from: e */
    public int mo22522e(C1336u uVar) {
        Integer num;
        if (uVar == null || (num = (Integer) uVar.f5949a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: f */
    public int mo22523f(C1336u uVar) {
        return m25441d(uVar, 0);
    }

    /* renamed from: g */
    public int mo22524g(C1336u uVar) {
        return m25441d(uVar, 1);
    }
}
