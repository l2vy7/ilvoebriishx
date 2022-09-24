package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vb0 implements s70 {

    /* renamed from: a */
    private final xa0 f40376a;

    /* renamed from: b */
    private final uo0 f40377b;

    /* renamed from: c */
    final /* synthetic */ wb0 f40378c;

    public vb0(wb0 wb0, xa0 xa0, uo0 uo0) {
        this.f40378c = wb0;
        this.f40376a = xa0;
        this.f40377b = uo0;
    }

    /* renamed from: a */
    public final void mo31196a(JSONObject jSONObject) {
        xa0 xa0;
        try {
            this.f40377b.zzd(this.f40378c.f20956a.mo32877a(jSONObject));
            xa0 = this.f40376a;
        } catch (IllegalStateException unused) {
            xa0 = this.f40376a;
        } catch (JSONException e) {
            this.f40377b.zze(e);
            xa0 = this.f40376a;
        } catch (Throwable th) {
            this.f40376a.mo35743g();
            throw th;
        }
        xa0.mo35743g();
    }

    public final void zza(String str) {
        xa0 xa0;
        if (str == null) {
            try {
                this.f40377b.zze(new gb0());
            } catch (IllegalStateException unused) {
                xa0 = this.f40376a;
            } catch (Throwable th) {
                this.f40376a.mo35743g();
                throw th;
            }
        } else {
            this.f40377b.zze(new gb0(str));
        }
        xa0 = this.f40376a;
        xa0.mo35743g();
    }
}
