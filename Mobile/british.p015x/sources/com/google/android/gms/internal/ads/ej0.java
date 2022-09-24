package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.ironsource.mediationsdk.config.VersionInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ej0 extends fj0 {

    /* renamed from: a */
    private final Object f31390a = new Object();

    /* renamed from: b */
    private final Context f31391b;

    /* renamed from: c */
    private SharedPreferences f31392c;

    /* renamed from: d */
    private final hb0<JSONObject, JSONObject> f31393d;

    public ej0(Context context, hb0<JSONObject, JSONObject> hb0) {
        this.f31391b = context.getApplicationContext();
        this.f31393d = hb0;
    }

    /* renamed from: c */
    public static JSONObject m31845c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcjf.m40656C0().f43036b);
            jSONObject.put("mf", e20.f31166a.mo34648e());
            jSONObject.put("cl", "428884702");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", VersionInfo.GIT_BRANCH);
            jSONObject.put("admob_module_version", C7355d.f29215a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m30156c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", C7355d.f29215a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final mb3<Void> mo31584a() {
        synchronized (this.f31390a) {
            if (this.f31392c == null) {
                this.f31392c = this.f31391b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzt.zzA().currentTimeMillis() - this.f31392c.getLong("js_last_update", 0) < e20.f31167b.mo34648e().longValue()) {
            return bb3.m30649i(null);
        }
        return bb3.m30653m(this.f31393d.zzb(m31845c(this.f31391b)), new cj0(this), po0.f37727f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ Void mo31585b(JSONObject jSONObject) {
        p00.m35914d(this.f31391b, 1, jSONObject);
        this.f31392c.edit().putLong("js_last_update", zzt.zzA().currentTimeMillis()).apply();
        return null;
    }
}
