package com.google.ads.interactivemedia.p039v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoa */
/* compiled from: IMASDK */
final class aoa extends aod<Long> {
    aoa(String str, Long l) {
        super(1, str, l);
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
            return (Long) mo14148e();
        }
        String d2 = mo14147d();
        return Long.valueOf(bundle.getLong(d2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(d2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo14144b(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo14147d(), ((Long) mo14148e()).longValue()));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo14145c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo14147d(), ((Long) mo14148e()).longValue()));
    }
}
