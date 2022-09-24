package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class d00 extends h00<Float> {
    d00(int i, String str, Float f) {
        super(1, str, f, (g00) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30274a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo32312m(), (double) ((Float) mo32311l()).floatValue()));
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
            return (Float) mo32311l();
        }
        String m2 = mo32312m();
        return Float.valueOf(bundle.getFloat(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30276c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo32312m(), ((Float) mo32311l()).floatValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30277d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo32312m(), ((Float) obj).floatValue());
    }
}
