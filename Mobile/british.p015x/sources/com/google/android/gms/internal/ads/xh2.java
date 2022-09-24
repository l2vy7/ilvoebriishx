package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class xh2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f41170a;

    public /* synthetic */ xh2(List list) {
        this.f41170a = list;
    }

    public final Object call() {
        List<mb3> list = this.f41170a;
        JSONArray jSONArray = new JSONArray();
        for (mb3 mb3 : list) {
            if (((JSONObject) mb3.get()) != null) {
                jSONArray.put(mb3.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zh2(jSONArray.toString());
    }
}
