package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bh */
/* compiled from: IMASDK */
public final class C3880bh implements C3878bf {

    /* renamed from: a */
    private final C3878bf f16326a;

    public C3880bh(C3878bf bfVar) {
        this.f16326a = bfVar;
    }

    /* renamed from: a */
    public final JSONObject mo14985a(View view) {
        return C3887bo.m16851b(0, 0, 0, 0);
    }

    /* renamed from: b */
    public final void mo14986b(View view, JSONObject jSONObject, C3877be beVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        C3855aw a = C3855aw.m14982a();
        if (a != null) {
            Collection<C3846ap> f = a.mo14652f();
            int size = f.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (C3846ap j : f) {
                View j2 = j.mo14173j();
                if (j2 != null && ((Build.VERSION.SDK_INT < 19 || j2.isAttachedToWindow()) && j2.isShown())) {
                    View view2 = j2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = j2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float d = C4130ko.m17748d(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (C4130ko.m17748d((View) arrayList.get(i)) <= d) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            beVar.mo14955a((View) arrayList.get(i2), this.f16326a, jSONObject);
        }
    }
}
