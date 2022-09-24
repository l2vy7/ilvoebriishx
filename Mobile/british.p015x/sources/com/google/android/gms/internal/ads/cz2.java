package com.google.android.gms.internal.ads;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cz2 implements zy2 {

    /* renamed from: a */
    private final zy2 f30528a;

    public cz2(zy2 zy2) {
        this.f30528a = zy2;
    }

    /* renamed from: a */
    public final void mo31057a(View view, JSONObject jSONObject, yy2 yy2, boolean z) {
        ArrayList arrayList = new ArrayList();
        qy2 a = qy2.m36822a();
        if (a != null) {
            Collection<fy2> b = a.mo34440b();
            int size = b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (fy2 f : b) {
                View f2 = f.mo31961f();
                if (f2 != null && ((Build.VERSION.SDK_INT < 19 || f2.isAttachedToWindow()) && f2.isShown())) {
                    View view2 = f2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = f2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float a2 = lz2.m34626a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (lz2.m34626a((View) arrayList.get(i)) <= a2) {
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
            yy2.mo35338a((View) arrayList.get(i2), this.f30528a, jSONObject);
        }
    }

    public final JSONObject zza(View view) {
        throw null;
    }
}
