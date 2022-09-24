package com.google.ads.interactivemedia.p038v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoc */
/* compiled from: IMASDK */
final class aoc extends aod<String> {
    aoc(String str, String str2) {
        super(1, str, str2);
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
            return (String) mo14148e();
        }
        String d2 = mo14147d();
        return bundle.getString(d2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(d2) : new String("com.google.android.gms.ads.flag."));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14144b(JSONObject jSONObject) {
        return jSONObject.optString(mo14147d(), (String) mo14148e());
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo14145c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo14147d(), (String) mo14148e());
    }
}
