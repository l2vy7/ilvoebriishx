package com.startapp;

import com.startapp.C12398vd;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.startapp.ke */
/* compiled from: Sta */
public class C12020ke extends C12079nd {
    public C12020ke(C12398vd.C12400b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public void mo45513a(String str) {
        C11931gd gdVar = C11931gd.f53013c;
        if (gdVar != null) {
            for (T t : Collections.unmodifiableCollection(gdVar.f53014a)) {
                if (this.f53336c.contains(t.f53131h)) {
                    t.f53128e.mo20418a(str, this.f53338e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        return this.f53337d.toString();
    }
}
