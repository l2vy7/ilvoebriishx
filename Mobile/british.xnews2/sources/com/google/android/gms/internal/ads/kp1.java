package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kp1 {

    /* renamed from: a */
    private final Context f34395a;

    /* renamed from: b */
    private final so1 f34396b;

    /* renamed from: c */
    private final C7497ab f34397c;

    /* renamed from: d */
    private final zzcjf f34398d;

    /* renamed from: e */
    private final zza f34399e;

    /* renamed from: f */
    private final C7728gq f34400f;

    /* renamed from: g */
    private final Executor f34401g;

    /* renamed from: h */
    private final zzbnw f34402h;

    /* renamed from: i */
    private final cq1 f34403i;

    /* renamed from: j */
    private final vs1 f34404j;

    /* renamed from: k */
    private final ScheduledExecutorService f34405k;

    /* renamed from: l */
    private final pr1 f34406l;

    /* renamed from: m */
    private final nv1 f34407m;

    /* renamed from: n */
    private final nw2 f34408n;

    /* renamed from: o */
    private final sx2 f34409o;

    /* renamed from: p */
    private final f42 f34410p;

    public kp1(Context context, so1 so1, C7497ab abVar, zzcjf zzcjf, zza zza, C7728gq gqVar, Executor executor, bs2 bs2, cq1 cq1, vs1 vs1, ScheduledExecutorService scheduledExecutorService, nv1 nv1, nw2 nw2, sx2 sx2, f42 f42, pr1 pr1) {
        this.f34395a = context;
        this.f34396b = so1;
        this.f34397c = abVar;
        this.f34398d = zzcjf;
        this.f34399e = zza;
        this.f34400f = gqVar;
        this.f34401g = executor;
        this.f34402h = bs2.f30092i;
        this.f34403i = cq1;
        this.f34404j = vs1;
        this.f34405k = scheduledExecutorService;
        this.f34407m = nv1;
        this.f34408n = nw2;
        this.f34409o = sx2;
        this.f34410p = f42;
        this.f34406l = pr1;
    }

    /* renamed from: i */
    public static final C8423zy m34037i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m34046r(optJSONObject);
    }

    /* renamed from: j */
    public static final List<C8423zy> m34038j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return p63.m20814A();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return p63.m20814A();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C8423zy r = m34046r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return p63.m20824y(arrayList);
    }

    /* renamed from: k */
    private final zzbfi m34039k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzbfi.m40643E0();
            }
            i = 0;
        }
        return new zzbfi(this.f34395a, new AdSize(i, i2));
    }

    /* renamed from: l */
    private static <T> mb3<T> m34040l(mb3<T> mb3, T t) {
        return bb3.m30647g(mb3, Exception.class, new zo1((Object) null), po0.f37727f);
    }

    /* renamed from: m */
    private static <T> mb3<T> m34041m(boolean z, mb3<T> mb3, T t) {
        if (z) {
            return bb3.m30654n(mb3, new gp1(mb3), po0.f37727f);
        }
        return m34040l(mb3, (Object) null);
    }

    /* renamed from: n */
    private final mb3<c30> m34042n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return bb3.m30649i(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return bb3.m30649i(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return bb3.m30649i(new c30((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m34041m(jSONObject.optBoolean("require"), bb3.m30653m(this.f34396b.mo34730b(optString, optDouble, optBoolean), new cp1(optString, optDouble, optInt, optInt2), this.f34401g), (Object) null);
    }

    /* renamed from: o */
    private final mb3<List<c30>> m34043o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return bb3.m30649i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m34042n(jSONArray.optJSONObject(i), z));
        }
        return bb3.m30653m(bb3.m30645e(arrayList), dp1.f30890a, this.f34401g);
    }

    /* renamed from: p */
    private final mb3<xt0> m34044p(JSONObject jSONObject, ir2 ir2, lr2 lr2) {
        mb3<xt0> b = this.f34403i.mo31009b(jSONObject.optString("base_url"), jSONObject.optString("html"), ir2, lr2, m34039k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return bb3.m30654n(b, new jp1(b), po0.f37727f);
    }

    /* renamed from: q */
    private static Integer m34045q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static final C8423zy m34046r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new C8423zy(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ z20 mo33129a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = m34045q(jSONObject, "bg_color");
        Integer q2 = m34045q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new z20(optString, list, q, q2, num, optInt3 + optInt2, this.f34402h.f42997f, optBoolean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ mb3 mo33130b(zzbfi zzbfi, ir2 ir2, lr2 lr2, String str, String str2, Object obj) throws Exception {
        xt0 a = this.f34404j.mo35491a(zzbfi, ir2, lr2);
        to0 c = to0.m37927c(a);
        mr1 b = this.f34406l.mo34168b();
        mr1 mr1 = b;
        mv0 u0 = a.mo18793u0();
        zzb zzb = r3;
        zzb zzb2 = new zzb(this.f34395a, (hl0) null, (zzcde) null);
        u0.mo18249E(b, mr1, b, b, b, false, (h70) null, zzb, (wf0) null, (hl0) null, this.f34410p, this.f34409o, this.f34407m, this.f34408n, (f70) null, b);
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37195r2)).booleanValue()) {
            a.mo18726O("/getNativeAdViewSignals", d70.f30672s);
        }
        a.mo18726O("/getNativeClickMeta", d70.f30673t);
        a.mo18793u0().mo18251F0(new yo1(c));
        a.mo18744d0(str, str2, (String) null);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ mb3 mo33131c(String str, Object obj) throws Exception {
        zzt.zzz();
        xt0 a = ku0.m20660a(this.f34395a, ov0.m35840a(), "native-omid", false, false, this.f34397c, (p10) null, this.f34398d, (e10) null, (zzl) null, this.f34399e, this.f34400f, (ir2) null, (lr2) null);
        to0 c = to0.m37927c(a);
        a.mo18793u0().mo18251F0(new ap1(c));
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36867E3)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a.loadData(str, "text/html", C6540C.UTF8_NAME);
        }
        return c;
    }

    /* renamed from: d */
    public final mb3<z20> mo33132d(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return bb3.m30649i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m34041m(optJSONObject.optBoolean("require"), bb3.m30653m(m34043o(optJSONArray, false, true), new bp1(this, optJSONObject), this.f34401g), (Object) null);
    }

    /* renamed from: e */
    public final mb3<c30> mo33133e(JSONObject jSONObject, String str) {
        return m34042n(jSONObject.optJSONObject(str), this.f34402h.f42994c);
    }

    /* renamed from: f */
    public final mb3<List<c30>> mo33134f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbnw zzbnw = this.f34402h;
        return m34043o(optJSONArray, zzbnw.f42994c, zzbnw.f42996e);
    }

    /* renamed from: g */
    public final mb3<xt0> mo33135g(JSONObject jSONObject, String str, ir2 ir2, lr2 lr2) {
        if (!((Boolean) C8311wv.m39277c().mo18570b(p00.f37038Z6)).booleanValue()) {
            return bb3.m30649i(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return bb3.m30649i(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return bb3.m30649i(null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        zzbfi k = m34039k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return bb3.m30649i(null);
        }
        mb3 n = bb3.m30654n(bb3.m30649i(null), new ep1(this, k, ir2, lr2, optString, optString2), po0.f37726e);
        return bb3.m30654n(n, new hp1(n), po0.f37727f);
    }

    /* renamed from: h */
    public final mb3<xt0> mo33136h(JSONObject jSONObject, ir2 ir2, lr2 lr2) {
        mb3<xt0> mb3;
        JSONObject zzg = zzby.zzg(jSONObject, "html_containers", "instream");
        if (zzg != null) {
            return m34044p(zzg, ir2, lr2);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return bb3.m30649i(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37030Y6)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                co0.zzj("Required field 'vast_xml' or 'html' is missing");
                return bb3.m30649i(null);
            }
        } else if (!z) {
            mb3 = this.f34403i.mo31008a(optJSONObject);
            return m34040l(bb3.m30655o(mb3, (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37204s2)).intValue(), TimeUnit.SECONDS, this.f34405k), (Object) null);
        }
        mb3 = m34044p(optJSONObject, ir2, lr2);
        return m34040l(bb3.m30655o(mb3, (long) ((Integer) C8311wv.m39277c().mo18570b(p00.f37204s2)).intValue(), TimeUnit.SECONDS, this.f34405k), (Object) null);
    }
}
