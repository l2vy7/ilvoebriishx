package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dc0 implements s70 {

    /* renamed from: a */
    private final uo0 f30711a;

    /* renamed from: b */
    final /* synthetic */ ec0 f30712b;

    public dc0(ec0 ec0, uo0 uo0) {
        this.f30712b = ec0;
        this.f30711a = uo0;
    }

    /* renamed from: a */
    public final void mo31196a(JSONObject jSONObject) {
        try {
            this.f30711a.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f30711a.zze(e);
        }
    }

    public final void zza(String str) {
        if (str == null) {
            try {
                this.f30711a.zze(new gb0());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f30711a.zze(new gb0(str));
        }
    }
}
