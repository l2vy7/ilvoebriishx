package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class e00 extends h00<String> {
    e00(int i, String str, String str2) {
        super(1, str, str2, (g00) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30274a(JSONObject jSONObject) {
        return jSONObject.optString(mo32312m(), (String) mo32311l());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo30275b(Bundle bundle) {
        String str;
        String m = mo32312m();
        if (m.length() != 0) {
            str = "com.google.android.gms.ads.flag.".concat(m);
        } else {
            str = new String("com.google.android.gms.ads.flag.");
        }
        if (!bundle.containsKey(str)) {
            return (String) mo32311l();
        }
        String m2 = mo32312m();
        return bundle.getString(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag."));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30276c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo32312m(), (String) mo32311l());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30277d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo32312m(), (String) obj);
    }
}
