package com.google.ads.interactivemedia.p038v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anz */
/* compiled from: IMASDK */
final class anz extends aod<Integer> {
    anz(String str, Integer num) {
        super(1, str, num);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14143a(Bundle bundle) {
        String str;
        String d = mo14147d();
        if (d.length() != 0) {
            str = "com.google.android.gms.ads.flag.".concat(d);
        } else {
            str = new String("com.google.android.gms.ads.flag.");
        }
        if (!bundle.containsKey(str)) {
            return (Integer) mo14148e();
        }
        String d2 = mo14147d();
        return Integer.valueOf(bundle.getInt(d2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(d2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14144b(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo14147d(), ((Integer) mo14148e()).intValue()));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo14145c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo14147d(), ((Integer) mo14148e()).intValue()));
    }
}
