package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.k */
final class C10438k {

    /* renamed from: d */
    private static final long f48887d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f48888a;

    /* renamed from: b */
    private final String f48889b;

    /* renamed from: c */
    private final long f48890c;

    private C10438k(String str, String str2, long j) {
        this.f48888a = str;
        this.f48889b = str2;
        this.f48890c = j;
    }

    /* renamed from: a */
    static String m48093a(C10438k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.f48888a;
    }

    /* renamed from: b */
    static String m48094b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    static C10438k m48095c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C10438k(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C10438k(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo41897d(String str) {
        return System.currentTimeMillis() > this.f48890c + f48887d || !str.equals(this.f48889b);
    }
}
