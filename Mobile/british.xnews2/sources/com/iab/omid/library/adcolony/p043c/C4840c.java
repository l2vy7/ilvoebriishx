package com.iab.omid.library.adcolony.p043c;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.C4826a;
import com.iab.omid.library.adcolony.p042b.C4828a;
import com.iab.omid.library.adcolony.p043c.C4837a;
import com.iab.omid.library.adcolony.p044d.C4843b;
import com.iab.omid.library.adcolony.p044d.C4848f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.c */
public class C4840c implements C4837a {

    /* renamed from: a */
    private final C4837a f21714a;

    public C4840c(C4837a aVar) {
        this.f21714a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<View> mo20153a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C4828a a = C4828a.m22256a();
        if (a != null) {
            Collection<C4826a> c = a.mo20113c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C4826a d : c) {
                View d2 = d.mo20079d();
                if (d2 != null && C4848f.m22357c(d2) && (rootView = d2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float a2 = C4848f.m22355a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C4848f.m22355a(arrayList.get(size - 1)) > a2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JSONObject mo20148a(View view) {
        return C4843b.m22324a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public void mo20149a(View view, JSONObject jSONObject, C4837a.C4838a aVar, boolean z) {
        Iterator<View> it = mo20153a().iterator();
        while (it.hasNext()) {
            aVar.mo20150a(it.next(), this.f21714a, jSONObject);
        }
    }
}
