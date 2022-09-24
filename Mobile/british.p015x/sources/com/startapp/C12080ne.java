package com.startapp;

import android.text.TextUtils;
import com.startapp.C12398vd;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.startapp.ne */
/* compiled from: Sta */
public class C12080ne extends C12079nd {
    public C12080ne(C12398vd.C12400b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public void mo45513a(String str) {
        C11931gd gdVar;
        if (!TextUtils.isEmpty(str) && (gdVar = C11931gd.f53013c) != null) {
            for (T t : Collections.unmodifiableCollection(gdVar.f53014a)) {
                if (this.f53336c.contains(t.f53131h)) {
                    t.f53128e.mo20420b(str, this.f53338e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        if (C12377ud.m53550c(this.f53337d, ((C12061md) this.f54937b).f53306a)) {
            return null;
        }
        C12398vd.C12400b bVar = this.f54937b;
        JSONObject jSONObject = this.f53337d;
        ((C12061md) bVar).f53306a = jSONObject;
        return jSONObject.toString();
    }
}
