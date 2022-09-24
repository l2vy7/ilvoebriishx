package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lq0 {

    /* renamed from: a */
    public final boolean f35184a;

    /* renamed from: b */
    public final int f35185b;

    /* renamed from: c */
    public final int f35186c;

    /* renamed from: d */
    public final int f35187d;

    /* renamed from: e */
    public final String f35188e;

    /* renamed from: f */
    public final int f35189f;

    /* renamed from: g */
    public final int f35190g;

    /* renamed from: h */
    public final int f35191h;

    /* renamed from: i */
    public final int f35192i;

    /* renamed from: j */
    public final boolean f35193j;

    /* renamed from: k */
    public final int f35194k;

    /* renamed from: l */
    public final boolean f35195l;

    /* renamed from: m */
    public final boolean f35196m;

    /* renamed from: n */
    public final boolean f35197n;

    public lq0(String str) {
        String str2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f35184a = m34530a(jSONObject, "aggressive_media_codec_release", p00.f36855D);
        this.f35185b = m34531b(jSONObject, "byte_buffer_precache_limit", p00.f37120j);
        this.f35186c = m34531b(jSONObject, "exo_cache_buffer_size", p00.f37192r);
        this.f35187d = m34531b(jSONObject, "exo_connect_timeout_millis", p00.f37084f);
        h00 h00 = p00.f37075e;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f35188e = str2;
            this.f35189f = m34531b(jSONObject, "exo_read_timeout_millis", p00.f37093g);
            this.f35190g = m34531b(jSONObject, "load_check_interval_bytes", p00.f37102h);
            this.f35191h = m34531b(jSONObject, "player_precache_limit", p00.f37111i);
            this.f35192i = m34531b(jSONObject, "socket_receive_buffer_size", p00.f37129k);
            this.f35193j = m34530a(jSONObject, "use_cache_data_source", p00.f36946O2);
            this.f35194k = m34531b(jSONObject, "min_retry_count", p00.f37138l);
            this.f35195l = m34530a(jSONObject, "treat_load_exception_as_non_fatal", p00.f37165o);
            this.f35196m = m34530a(jSONObject, "using_official_simple_exo_player", p00.f37203s1);
            this.f35197n = m34530a(jSONObject, "enable_multiple_video_playback", p00.f37211t1);
        }
        str2 = (String) C8311wv.m39277c().mo18570b(h00);
        this.f35188e = str2;
        this.f35189f = m34531b(jSONObject, "exo_read_timeout_millis", p00.f37093g);
        this.f35190g = m34531b(jSONObject, "load_check_interval_bytes", p00.f37102h);
        this.f35191h = m34531b(jSONObject, "player_precache_limit", p00.f37111i);
        this.f35192i = m34531b(jSONObject, "socket_receive_buffer_size", p00.f37129k);
        this.f35193j = m34530a(jSONObject, "use_cache_data_source", p00.f36946O2);
        this.f35194k = m34531b(jSONObject, "min_retry_count", p00.f37138l);
        this.f35195l = m34530a(jSONObject, "treat_load_exception_as_non_fatal", p00.f37165o);
        this.f35196m = m34530a(jSONObject, "using_official_simple_exo_player", p00.f37203s1);
        this.f35197n = m34530a(jSONObject, "enable_multiple_video_playback", p00.f37211t1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.h00<java.lang.Boolean>, com.google.android.gms.internal.ads.h00] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean m34530a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.h00<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r3 = r0.mo18570b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r1 == 0) goto L_0x0014
            boolean r3 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x0014 }
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lq0.m34530a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.h00):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.h00<java.lang.Integer>, com.google.android.gms.internal.ads.h00] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int m34531b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.h00<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.n00 r0 = com.google.android.gms.internal.ads.C8311wv.m39277c()
            java.lang.Object r0 = r0.mo18570b(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lq0.m34531b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.h00):int");
    }
}
