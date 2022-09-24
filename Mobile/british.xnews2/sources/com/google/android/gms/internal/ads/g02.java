package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import com.google.android.gms.ads.internal.zzt;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g02 {

    /* renamed from: a */
    private final uv0 f32080a;

    /* renamed from: b */
    private final Context f32081b;

    /* renamed from: c */
    private final zzcjf f32082c;

    /* renamed from: d */
    private final bs2 f32083d;

    /* renamed from: e */
    private final Executor f32084e;

    /* renamed from: f */
    private final String f32085f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final id1 f32086g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final md1 f32087h;

    public g02(uv0 uv0, Context context, zzcjf zzcjf, bs2 bs2, Executor executor, String str, id1 id1, md1 md1) {
        this.f32080a = uv0;
        this.f32081b = context;
        this.f32082c = zzcjf;
        this.f32083d = bs2;
        this.f32084e = executor;
        this.f32085f = str;
        this.f32086g = id1;
        this.f32087h = md1;
    }

    /* renamed from: e */
    private final mb3<ur2> m32326e(String str, String str2) {
        sb0 a = zzt.zzf().mo18420a(this.f32081b, this.f32082c);
        mb0<JSONObject> mb0 = pb0.f37568b;
        mb3<ur2> n = bb3.m30654n(bb3.m30654n(bb3.m30654n(bb3.m30649i(""), new e02(this, str, str2), this.f32084e), new c02(a.mo18829a("google.afma.response.normalize", mb0, mb0)), this.f32084e), new d02(this), this.f32084e);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            bb3.m30658r(n, new f02(this), po0.f37727f);
        }
        return n;
    }

    /* renamed from: f */
    private final String m32327f(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && C3791bd.UNKNOWN_CONTENT_TYPE.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f32085f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            co0.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    /* renamed from: g */
    private static final String m32328g(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: c */
    public final mb3<ur2> mo31992c() {
        String str = this.f32083d.f30087d.f42963y;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37180p5)).booleanValue()) {
                String g = m32328g(str);
                if (TextUtils.isEmpty(g)) {
                    if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
                        this.f32087h.mo30511l(true);
                    }
                    return bb3.m30648h(new l82(15, "Invalid ad string."));
                }
                String zzb = this.f32080a.mo35299u().zzb(g);
                if (!TextUtils.isEmpty(zzb)) {
                    return m32326e(str, m32327f(zzb));
                }
            }
        }
        zzbeu zzbeu = this.f32083d.f30087d.f42958t;
        if (zzbeu != null) {
            if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37162n5)).booleanValue()) {
                String g2 = m32328g(zzbeu.f42933b);
                String g3 = m32328g(zzbeu.f42934c);
                if (!TextUtils.isEmpty(g3) && g2.equals(g3)) {
                    this.f32080a.mo35299u().zzd(g2);
                }
            }
            return m32326e(zzbeu.f42933b, m32327f(zzbeu.f42934c));
        }
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37207s5)).booleanValue()) {
            this.f32087h.mo30511l(true);
        }
        return bb3.m30648h(new l82(14, "Mismatch request IDs."));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ mb3 mo31993d(JSONObject jSONObject) throws Exception {
        return bb3.m30649i(new ur2(new rr2(this.f32083d), tr2.m38007a(new StringReader(jSONObject.toString()))));
    }
}
