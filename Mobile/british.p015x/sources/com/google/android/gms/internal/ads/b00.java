package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class b00 extends h00<Integer> {
    b00(int i, String str, Integer num) {
        super(1, str, num, (g00) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30274a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo32312m(), ((Integer) mo32311l()).intValue()));
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
            return (Integer) mo32311l();
        }
        String m2 = mo32312m();
        return Integer.valueOf(bundle.getInt(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30276c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo32312m(), ((Integer) mo32311l()).intValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30277d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo32312m(), ((Integer) obj).intValue());
    }
}
