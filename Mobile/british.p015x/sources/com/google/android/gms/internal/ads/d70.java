package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d70 {

    /* renamed from: a */
    public static final e70<xt0> f30654a = l60.f34916a;

    /* renamed from: b */
    public static final e70<xt0> f30655b = i60.f33104a;

    /* renamed from: c */
    public static final e70<xt0> f30656c = j60.f33781a;

    /* renamed from: d */
    public static final e70<xt0> f30657d = new v60();

    /* renamed from: e */
    public static final e70<xt0> f30658e = new w60();

    /* renamed from: f */
    public static final e70<xt0> f30659f = m60.f35417a;

    /* renamed from: g */
    public static final e70<Object> f30660g = new x60();

    /* renamed from: h */
    public static final e70<xt0> f30661h = new y60();

    /* renamed from: i */
    public static final e70<xt0> f30662i = n60.f35909a;

    /* renamed from: j */
    public static final e70<xt0> f30663j = new z60();

    /* renamed from: k */
    public static final e70<xt0> f30664k = new a70();

    /* renamed from: l */
    public static final e70<mq0> f30665l = new zr0();

    /* renamed from: m */
    public static final e70<mq0> f30666m = new as0();

    /* renamed from: n */
    public static final e70<xt0> f30667n = new g60();

    /* renamed from: o */
    public static final t70 f30668o = new t70();

    /* renamed from: p */
    public static final e70<xt0> f30669p = new b70();

    /* renamed from: q */
    public static final e70<xt0> f30670q = new c70();

    /* renamed from: r */
    public static final e70<xt0> f30671r = new r60();

    /* renamed from: s */
    public static final e70<xt0> f30672s = new s60();

    /* renamed from: t */
    public static final e70<xt0> f30673t = new t60();

    /* renamed from: a */
    public static e70<xt0> m31258a(gi1 gi1) {
        return new h60(gi1);
    }

    /* renamed from: b */
    public static mb3<String> m31259b(xt0 xt0, String str) {
        Uri parse = Uri.parse(str);
        try {
            C7497ab zzK = xt0.zzK();
            if (zzK != null && zzK.mo30334f(parse)) {
                parse = zzK.mo30329a(parse, xt0.getContext(), xt0.mo18790t(), xt0.zzk());
            }
        } catch (C7533bb unused) {
            co0.zzj(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        String b = mm0.m34821b(parse, xt0.getContext());
        long longValue = d20.f30599e.mo34648e().longValue();
        if (longValue <= 0 || longValue > 214106404) {
            return bb3.m30649i(b);
        }
        sa3<String> D = sa3.m37369D(xt0.mo18791t0());
        q60 q60 = q60.f37879a;
        nb3 nb3 = po0.f37727f;
        return bb3.m30646f(bb3.m30653m(bb3.m30646f(D, Throwable.class, q60, nb3), new o60(b), nb3), Throwable.class, new p60(b), nb3);
    }

    /* renamed from: c */
    static /* synthetic */ void m31260c(zu0 zu0, Map map) {
        String str;
        PackageManager packageManager = zu0.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString(TtmlNode.ATTR_ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString(TtmlNode.TAG_P);
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                if (valueOf.length() != 0) {
                                    str = "Error parsing the url: ".concat(valueOf);
                                } else {
                                    str = new String("Error parsing the url: ");
                                }
                                co0.zzh(str, uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, C6540C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            co0.zzh("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        co0.zzh("Error parsing the intent data.", e3);
                    }
                }
                ((t90) zu0).mo18322a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((t90) zu0).mo18322a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((t90) zu0).mo18322a("openableIntents", new JSONObject());
        }
    }

    /* renamed from: d */
    public static void m31261d(Map<String, String> map, gi1 gi1) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37146l7)).booleanValue() && map.containsKey("sc") && map.get("sc").equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) && gi1 != null) {
            gi1.zzq();
        }
    }
}
