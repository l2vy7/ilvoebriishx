package com.google.ads.interactivemedia.p039v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.any */
/* compiled from: IMASDK */
final class any extends aod<Boolean> {
    any(int i, String str, Boolean bool) {
        super(i, str, bool);
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
            return (Boolean) mo14148e();
        }
        String d2 = mo14147d();
        return Boolean.valueOf(bundle.getBoolean(d2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(d2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14144b(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo14147d(), ((Boolean) mo14148e()).booleanValue()));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo14145c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo14147d(), ((Boolean) mo14148e()).booleanValue()));
    }
}
