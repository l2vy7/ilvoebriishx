package com.google.ads.interactivemedia.p038v3.internal;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bi */
/* compiled from: IMASDK */
public final class C3881bi implements C3878bf {

    /* renamed from: a */
    private final int[] f16362a = new int[2];

    /* renamed from: a */
    public final JSONObject mo14985a(View view) {
        if (view == null) {
            return C3887bo.m16851b(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f16362a);
        int[] iArr = this.f16362a;
        return C3887bo.m16851b(iArr[0], iArr[1], width, height);
    }

    /* renamed from: b */
    public final void mo14986b(View view, JSONObject jSONObject, C3877be beVar, boolean z) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    beVar.mo14955a(viewGroup.getChildAt(i2), this, jSONObject);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 >= size2) {
                        break;
                    }
                    beVar.mo14955a((View) arrayList3.get(i5), this, jSONObject);
                    i5++;
                }
                i4 = i;
            }
        }
    }
}
