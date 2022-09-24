package com.google.ads.interactivemedia.p039v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aob */
/* compiled from: IMASDK */
final class aob extends aod<Float> {
    aob(String str, Float f) {
        super(1, str, f);
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
            return (Float) mo14148e();
        }
        String d2 = mo14147d();
        return Float.valueOf(bundle.getFloat(d2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(d2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14144b(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo14147d(), (double) ((Float) mo14148e()).floatValue()));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo14145c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo14147d(), ((Float) mo14148e()).floatValue()));
    }
}
