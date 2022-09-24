package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class c00 extends h00<Long> {
    c00(int i, String str, Long l) {
        super(1, str, l, (g00) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo30274a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo32312m(), ((Long) mo32311l()).longValue()));
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
            return (Long) mo32311l();
        }
        String m2 = mo32312m();
        return Long.valueOf(bundle.getLong(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo30276c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo32312m(), ((Long) mo32311l()).longValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30277d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo32312m(), ((Long) obj).longValue());
    }
}
