package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p006a5.C6481c;
import p006a5.C6483e;
import p006a5.C6486h;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class bo0 {

    /* renamed from: b */
    private static final Object f30049b = new Object();

    /* renamed from: c */
    private static boolean f30050c = false;

    /* renamed from: d */
    private static boolean f30051d = false;

    /* renamed from: e */
    private static final C6483e f30052e = C6486h.m28261b();

    /* renamed from: f */
    private static final Set<String> f30053f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: g */
    public static final /* synthetic */ int f30054g = 0;

    /* renamed from: a */
    private final List<String> f30055a;

    public bo0(String str) {
        List<String> list;
        if (!m30771l()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f30055a = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m30766a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m30778s(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(TtmlNode.TAG_BODY).value(C6481c.m28246a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: b */
    static /* synthetic */ void m30767b(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m30778s(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: i */
    public static void m30768i() {
        synchronized (f30049b) {
            f30050c = false;
            f30051d = false;
            co0.zzj("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: j */
    public static void m30769j(boolean z) {
        synchronized (f30049b) {
            f30050c = true;
            f30051d = z;
        }
    }

    /* renamed from: k */
    public static boolean m30770k(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !b20.f29868a.mo34648e().booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            co0.zzk("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m30771l() {
        boolean z;
        synchronized (f30049b) {
            z = false;
            if (f30050c && f30051d) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: m */
    public static boolean m30772m() {
        boolean z;
        synchronized (f30049b) {
            z = f30050c;
        }
        return z;
    }

    /* renamed from: n */
    private static synchronized void m30773n(String str) {
        synchronized (bo0.class) {
            co0.zzi("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                co0.zzi(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            co0.zzi("GMA Debug FINISH");
        }
    }

    /* renamed from: o */
    private final void m30774o(String str, ao0 ao0) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f30052e.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f30055a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            ao0.mo30441a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            co0.zzh("unable to log", e);
        }
        m30773n(stringWriter.toString());
    }

    /* renamed from: p */
    private final void m30775p(String str) {
        m30774o("onNetworkRequestError", new xn0(str));
    }

    /* renamed from: q */
    private final void m30776q(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m30774o("onNetworkRequest", new yn0(str, str2, map, bArr));
    }

    /* renamed from: r */
    private final void m30777r(Map<String, ?> map, int i) {
        m30774o("onNetworkResponse", new wn0(i, map));
    }

    /* renamed from: s */
    private static void m30778s(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f30053f.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            co0.zzg("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: c */
    public final void mo30738c(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m30771l()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m30776q(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: d */
    public final void mo30739d(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m30771l()) {
            m30776q(str, "GET", map, bArr);
        }
    }

    /* renamed from: e */
    public final void mo30740e(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (m30771l()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            }
            m30777r(hashMap, i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    co0.zzj(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m30775p(str);
            }
        }
    }

    /* renamed from: f */
    public final void mo30741f(Map<String, ?> map, int i) {
        if (m30771l()) {
            m30777r(map, i);
            if (i < 200 || i >= 300) {
                m30775p((String) null);
            }
        }
    }

    /* renamed from: g */
    public final void mo30742g(String str) {
        if (m30771l() && str != null) {
            mo30743h(str.getBytes());
        }
    }

    /* renamed from: h */
    public final void mo30743h(byte[] bArr) {
        m30774o("onNetworkResponseBody", new zn0(bArr));
    }
}
