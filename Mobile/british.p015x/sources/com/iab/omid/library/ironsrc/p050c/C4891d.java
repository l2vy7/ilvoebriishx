package com.iab.omid.library.ironsrc.p050c;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.p050c.C4887a;
import com.iab.omid.library.ironsrc.p051d.C4893b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.d */
public class C4891d implements C4887a {

    /* renamed from: a */
    private final int[] f21829a = new int[2];

    /* renamed from: a */
    private void m22536a(ViewGroup viewGroup, JSONObject jSONObject, C4887a.C4888a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo20336a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private void m22537b(ViewGroup viewGroup, JSONObject jSONObject, C4887a.C4888a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo20336a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo20334a(View view) {
        if (view == null) {
            return C4893b.m22545a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f21829a);
        int[] iArr = this.f21829a;
        return C4893b.m22545a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo20335a(View view, JSONObject jSONObject, C4887a.C4888a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22536a(viewGroup, jSONObject, aVar);
            } else {
                m22537b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
