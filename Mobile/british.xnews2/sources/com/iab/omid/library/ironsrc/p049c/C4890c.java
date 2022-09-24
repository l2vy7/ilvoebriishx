package com.iab.omid.library.ironsrc.p049c;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C4876a;
import com.iab.omid.library.ironsrc.p048b.C4878a;
import com.iab.omid.library.ironsrc.p049c.C4887a;
import com.iab.omid.library.ironsrc.p050d.C4893b;
import com.iab.omid.library.ironsrc.p050d.C4898f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.c.c */
public class C4890c implements C4887a {

    /* renamed from: a */
    private final C4887a f21828a;

    public C4890c(C4887a aVar) {
        this.f21828a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo20339a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4878a a = C4878a.m22477a();
        if (a != null) {
            Collection<C4876a> c = a.mo20299c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4876a d : c) {
                View d2 = d.mo20265d();
                if (d2 != null && C4898f.m22578c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4898f.m22576a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4898f.m22576a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo20334a(View view) {
        return C4893b.m22545a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo20335a(View view, JSONObject jSONObject, C4887a.C4888a aVar, boolean z) {
        Iterator<View> it = mo20339a().iterator();
        while (it.hasNext()) {
            aVar.mo20336a(it.next(), this.f21828a, jSONObject);
        }
    }
}
