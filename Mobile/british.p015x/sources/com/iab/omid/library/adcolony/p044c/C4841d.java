package com.iab.omid.library.adcolony.p044c;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.adcolony.p044c.C4837a;
import com.iab.omid.library.adcolony.p045d.C4843b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.d */
public class C4841d implements C4837a {

    /* renamed from: a */
    private final int[] f21715a = new int[2];

    /* renamed from: a */
    private void m22315a(ViewGroup viewGroup, JSONObject jSONObject, C4837a.C4838a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo20150a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private void m22316b(ViewGroup viewGroup, JSONObject jSONObject, C4837a.C4838a aVar) {
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
                aVar.mo20150a((View) it2.next(), this, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo20148a(View view) {
        if (view == null) {
            return C4843b.m22324a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f21715a);
        int[] iArr = this.f21715a;
        return C4843b.m22324a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public void mo20149a(View view, JSONObject jSONObject, C4837a.C4838a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || Build.VERSION.SDK_INT < 21) {
                m22315a(viewGroup, jSONObject, aVar);
            } else {
                m22316b(viewGroup, jSONObject, aVar);
            }
        }
    }
}
