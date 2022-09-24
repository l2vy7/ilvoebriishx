package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wi2 implements zi2<yi2<Bundle>> {

    /* renamed from: a */
    private final nb3 f40807a;

    /* renamed from: b */
    private final Context f40808b;

    wi2(nb3 nb3, Context context) {
        this.f40807a = nb3;
        this.f40808b = context;
    }

    /* renamed from: a */
    public static Bundle m39190a(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt(SessionDescription.ATTR_TYPE, -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ yi2 mo35636b() throws Exception {
        String str = (String) C8311wv.m39277c().mo18570b(p00.f36836A4);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ui2(m39190a(this.f40808b, new JSONArray(str)));
        } catch (JSONException e) {
            co0.zzf("JSON parsing error", e);
            return null;
        }
    }

    public final mb3<yi2<Bundle>> zzb() {
        return this.f40807a.mo33675b(new vi2(this));
    }
}
