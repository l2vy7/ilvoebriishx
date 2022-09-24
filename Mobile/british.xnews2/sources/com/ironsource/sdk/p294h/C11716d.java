package com.ironsource.sdk.p294h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.d */
public final class C11716d {

    /* renamed from: a */
    private String f52436a;

    public C11716d(String str) {
        this.f52436a = str;
    }

    /* renamed from: d */
    private boolean m51839d(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m51840e().getPath()) != 0;
    }

    /* renamed from: e */
    private C11715c m51840e() {
        C11715c cVar = new C11715c(this.f52436a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }

    /* renamed from: a */
    public final synchronized JSONObject mo45028a() {
        return new JSONObject(IronSourceStorageUtils.readFile(m51840e()));
    }

    /* renamed from: a */
    public final synchronized boolean mo45029a(String str) {
        JSONObject a = mo45028a();
        if (!a.has(str)) {
            return true;
        }
        a.remove(str);
        return m51839d(a);
    }

    /* renamed from: a */
    public final boolean mo45030a(ArrayList<C11715c> arrayList) {
        Iterator<C11715c> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!mo45029a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized boolean mo45031b(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo45028a();
        JSONObject optJSONObject = a.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a.putOpt(str, jSONObject);
        }
        return m51839d(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo45032c(String str, JSONObject jSONObject) {
        JSONObject a;
        a = mo45028a();
        a.put(str, jSONObject);
        return m51839d(a);
    }
}
