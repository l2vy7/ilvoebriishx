package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.j */
public final class C11424j {

    /* renamed from: a */
    public ArrayList<C11425k> f51392a = new ArrayList<>();

    /* renamed from: b */
    public C11425k f51393b;

    /* renamed from: c */
    public C11417c f51394c;

    /* renamed from: d */
    public JSONObject f51395d;

    public C11424j(C11417c cVar) {
        this.f51394c = cVar;
    }

    /* renamed from: a */
    public final C11425k mo44434a() {
        Iterator<C11425k> it = this.f51392a.iterator();
        while (it.hasNext()) {
            C11425k next = it.next();
            if (next.f51398c) {
                return next;
            }
        }
        return this.f51393b;
    }

    /* renamed from: a */
    public final C11425k mo44435a(String str) {
        Iterator<C11425k> it = this.f51392a.iterator();
        while (it.hasNext()) {
            C11425k next = it.next();
            if (next.f51397b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo44436b() {
        JSONObject jSONObject = this.f51395d;
        return (jSONObject == null || TextUtils.isEmpty(jSONObject.optString("adapterName"))) ? IronSourceConstants.SUPERSONIC_CONFIG_NAME : this.f51395d.optString("adapterName");
    }
}
