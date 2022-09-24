package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e31 implements C7763hn {

    /* renamed from: b */
    private xt0 f31202b;

    /* renamed from: c */
    private final Executor f31203c;

    /* renamed from: d */
    private final q21 f31204d;

    /* renamed from: e */
    private final C6483e f31205e;

    /* renamed from: f */
    private boolean f31206f = false;

    /* renamed from: g */
    private boolean f31207g = false;

    /* renamed from: h */
    private final t21 f31208h = new t21();

    public e31(Executor executor, q21 q21, C6483e eVar) {
        this.f31203c = executor;
        this.f31204d = q21;
        this.f31205e = eVar;
    }

    /* renamed from: l */
    private final void m31688l() {
        try {
            JSONObject a = this.f31204d.zzb(this.f31208h);
            if (this.f31202b != null) {
                this.f31203c.execute(new d31(this, a));
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    /* renamed from: a */
    public final void mo31459a() {
        this.f31206f = false;
    }

    /* renamed from: c */
    public final void mo31460c() {
        this.f31206f = true;
        m31688l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo31461d(JSONObject jSONObject) {
        this.f31202b.mo18317E0("AFMA_updateActiveView", jSONObject);
    }

    /* renamed from: f */
    public final void mo31462f(boolean z) {
        this.f31207g = z;
    }

    /* renamed from: g */
    public final void mo31463g(xt0 xt0) {
        this.f31202b = xt0;
    }

    /* renamed from: n0 */
    public final void mo18767n0(C7689fn fnVar) {
        boolean z;
        t21 t21 = this.f31208h;
        if (this.f31207g) {
            z = false;
        } else {
            z = fnVar.f31824j;
        }
        t21.f39252a = z;
        t21.f39255d = this.f31205e.elapsedRealtime();
        this.f31208h.f39257f = fnVar;
        if (this.f31206f) {
            m31688l();
        }
    }
}
