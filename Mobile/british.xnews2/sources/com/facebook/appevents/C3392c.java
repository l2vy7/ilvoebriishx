package com.facebook.appevents;

import android.os.Build;
import android.os.Bundle;
import com.facebook.C3572j;
import com.facebook.C3752u;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3561x;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p076f3.C5261a;
import p082g3.C5337b;
import p092i3.C5467a;
import p092i3.C5468b;

/* renamed from: com.facebook.appevents.c */
/* compiled from: AppEvent */
public class C3392c implements Serializable {

    /* renamed from: g */
    private static final HashSet<String> f12821g = new HashSet<>();

    /* renamed from: b */
    private final JSONObject f12822b;

    /* renamed from: c */
    private final boolean f12823c;

    /* renamed from: d */
    private final boolean f12824d;

    /* renamed from: e */
    private final String f12825e;

    /* renamed from: f */
    private final String f12826f;

    /* renamed from: com.facebook.appevents.c$b */
    /* compiled from: AppEvent */
    static class C3394b implements Serializable {

        /* renamed from: b */
        private final String f12827b;

        /* renamed from: c */
        private final boolean f12828c;

        /* renamed from: d */
        private final boolean f12829d;

        private Object readResolve() throws JSONException {
            return new C3392c(this.f12827b, this.f12828c, this.f12829d, (String) null);
        }
    }

    /* renamed from: com.facebook.appevents.c$c */
    /* compiled from: AppEvent */
    static class C3395c implements Serializable {

        /* renamed from: b */
        private final String f12830b;

        /* renamed from: c */
        private final boolean f12831c;

        /* renamed from: d */
        private final boolean f12832d;

        /* renamed from: e */
        private final String f12833e;

        private Object readResolve() throws JSONException {
            return new C3392c(this.f12830b, this.f12831c, this.f12832d, this.f12833e);
        }

        private C3395c(String str, boolean z, boolean z2, String str2) {
            this.f12830b = str;
            this.f12831c = z;
            this.f12832d = z2;
            this.f12833e = str2;
        }
    }

    /* renamed from: a */
    private String m11358a() {
        if (Build.VERSION.SDK_INT > 19) {
            return m11360g(this.f12822b.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.f12822b.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f12822b.optString(str));
            sb.append(10);
        }
        return m11360g(sb.toString());
    }

    /* renamed from: d */
    private JSONObject m11359d(String str, String str2, Double d, Bundle bundle, UUID uuid) throws JSONException {
        m11361h(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m11360g(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> i = m11362i(bundle);
            for (String next : i.keySet()) {
                jSONObject.put(next, i.get(next));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f12824d) {
            jSONObject.put("_inBackground", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (this.f12823c) {
            jSONObject.put("_implicitlyLogged", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } else {
            C3561x.m11894h(C3752u.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    /* renamed from: g */
    private static String m11360g(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(C6540C.UTF8_NAME);
            instance.update(bytes, 0, bytes.length);
            return C5337b.m24044c(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C3481f0.m11608S("Failed to generate checksum: ", e);
            return SessionDescription.SUPPORTED_SDP_VERSION;
        } catch (UnsupportedEncodingException e2) {
            C3481f0.m11608S("Failed to generate checksum: ", e2);
            return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
    }

    /* renamed from: h */
    private static void m11361h(String str) throws C3572j {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new C3572j(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, 40}));
        }
        HashSet<String> hashSet = f12821g;
        synchronized (hashSet) {
            contains = hashSet.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (hashSet) {
                hashSet.add(str);
            }
            return;
        }
        throw new C3572j(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    /* renamed from: i */
    private Map<String, String> m11362i(Bundle bundle) throws C3572j {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            m11361h(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                throw new C3572j(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str}));
            }
        }
        C5467a.m24476b(hashMap);
        C5468b.m24481d(hashMap, this.f12825e);
        C5261a.m23778c(hashMap, this.f12825e);
        return hashMap;
    }

    private Object writeReplace() {
        return new C3395c(this.f12822b.toString(), this.f12823c, this.f12824d, this.f12826f);
    }

    /* renamed from: b */
    public boolean mo11812b() {
        return this.f12823c;
    }

    /* renamed from: c */
    public JSONObject mo11813c() {
        return this.f12822b;
    }

    /* renamed from: e */
    public String mo11814e() {
        return this.f12825e;
    }

    /* renamed from: f */
    public boolean mo11815f() {
        if (this.f12826f == null) {
            return true;
        }
        return m11358a().equals(this.f12826f);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f12822b.optString("_eventName"), Boolean.valueOf(this.f12823c), this.f12822b.toString()});
    }

    public C3392c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, C3572j {
        this.f12823c = z;
        this.f12824d = z2;
        this.f12825e = str2;
        this.f12822b = m11359d(str, str2, d, bundle, uuid);
        this.f12826f = m11358a();
    }

    private C3392c(String str, boolean z, boolean z2, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f12822b = jSONObject;
        this.f12823c = z;
        this.f12825e = jSONObject.optString("_eventName");
        this.f12826f = str2;
        this.f12824d = z2;
    }
}
