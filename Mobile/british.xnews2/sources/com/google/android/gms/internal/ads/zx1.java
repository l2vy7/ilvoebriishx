package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zx1 implements pa1, kd1, gc1 {

    /* renamed from: b */
    private final ly1 f42819b;

    /* renamed from: c */
    private final String f42820c;

    /* renamed from: d */
    private int f42821d = 0;

    /* renamed from: e */
    private yx1 f42822e = yx1.AD_REQUESTED;

    /* renamed from: f */
    private fa1 f42823f;

    /* renamed from: g */
    private zzbew f42824g;

    zx1(ly1 ly1, bs2 bs2) {
        this.f42819b = ly1;
        this.f42820c = bs2.f30089f;
    }

    /* renamed from: c */
    private static JSONObject m40577c(zzbew zzbew) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzbew.f42937d);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzbew.f42935b);
        jSONObject.put("errorDescription", zzbew.f42936c);
        zzbew zzbew2 = zzbew.f42938e;
        jSONObject.put("underlyingError", zzbew2 == null ? null : m40577c(zzbew2));
        return jSONObject;
    }

    /* renamed from: e */
    private static JSONObject m40578e(fa1 fa1) throws JSONException {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", fa1.zze());
        jSONObject2.put("responseSecsSinceEpoch", fa1.zzc());
        jSONObject2.put("responseId", fa1.zzf());
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36974R6)).booleanValue()) {
            String zzd = fa1.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                String valueOf = String.valueOf(zzd);
                if (valueOf.length() != 0) {
                    str = "Bidding data: ".concat(valueOf);
                } else {
                    str = new String("Bidding data: ");
                }
                co0.zze(str);
                jSONObject2.put("biddingData", new JSONObject(zzd));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<zzbfm> zzg = fa1.zzg();
        if (zzg != null) {
            for (zzbfm next : zzg) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("adapterClassName", next.f42979b);
                jSONObject3.put("latencyMillis", next.f42980c);
                zzbew zzbew = next.f42981d;
                if (zzbew == null) {
                    jSONObject = null;
                } else {
                    jSONObject = m40577c(zzbew);
                }
                jSONObject3.put("error", jSONObject);
                jSONArray.put(jSONObject3);
            }
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    /* renamed from: G */
    public final void mo18433G(ur2 ur2) {
        if (!ur2.f39937b.f39518a.isEmpty()) {
            this.f42821d = ur2.f39937b.f39518a.get(0).f33466b;
        }
    }

    /* renamed from: N */
    public final void mo31521N(o61 o61) {
        this.f42823f = o61.mo33838c();
        this.f42822e = yx1.AD_LOADED;
    }

    /* renamed from: a */
    public final JSONObject mo36142a() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f42822e);
        jSONObject.put("format", ir2.m33407a(this.f42821d));
        fa1 fa1 = this.f42823f;
        JSONObject jSONObject2 = null;
        if (fa1 != null) {
            jSONObject2 = m40578e(fa1);
        } else {
            zzbew zzbew = this.f42824g;
            if (!(zzbew == null || (iBinder = zzbew.f42939f) == null)) {
                fa1 fa12 = (fa1) iBinder;
                jSONObject2 = m40578e(fa12);
                List<zzbfm> zzg = fa12.zzg();
                if (zzg != null && zzg.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m40577c(this.f42824g));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    /* renamed from: b */
    public final boolean mo36143b() {
        return this.f42822e != yx1.AD_REQUESTED;
    }

    /* renamed from: d */
    public final void mo18436d(zzbew zzbew) {
        this.f42822e = yx1.AD_LOAD_FAILED;
        this.f42824g = zzbew;
    }

    /* renamed from: h0 */
    public final void mo18437h0(zzcdq zzcdq) {
        this.f42819b.mo33425e(this.f42820c, this);
    }
}
