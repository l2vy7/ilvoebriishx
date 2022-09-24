package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzby;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mm1 extends nm1 {

    /* renamed from: b */
    private final JSONObject f35556b;

    /* renamed from: c */
    private final boolean f35557c;

    /* renamed from: d */
    private final boolean f35558d;

    /* renamed from: e */
    private final boolean f35559e;

    /* renamed from: f */
    private final boolean f35560f;

    /* renamed from: g */
    private final String f35561g;

    public mm1(ir2 ir2, JSONObject jSONObject) {
        super(ir2);
        this.f35556b = zzby.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f35557c = zzby.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.f35558d = zzby.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f35559e = zzby.zzk(false, jSONObject, "enable_omid");
        this.f35561g = zzby.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f35560f = jSONObject.optJSONObject("overlay") != null ? true : z;
    }

    /* renamed from: a */
    public final String mo33562a() {
        return this.f35561g;
    }

    /* renamed from: b */
    public final JSONObject mo33563b() {
        JSONObject jSONObject = this.f35556b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f36046a.f33438A);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final boolean mo33564c() {
        return this.f35559e;
    }

    /* renamed from: d */
    public final boolean mo33565d() {
        return this.f35557c;
    }

    /* renamed from: e */
    public final boolean mo33566e() {
        return this.f35558d;
    }

    /* renamed from: f */
    public final boolean mo33567f() {
        return this.f35560f;
    }
}
