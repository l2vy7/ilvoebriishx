package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.os.Build;
import com.ironsource.environment.C4961c;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.b */
public abstract class C11741b implements C11743d {

    /* renamed from: a */
    public C11742c f52462a;

    protected C11741b(JSONObject jSONObject, Context context) {
        C11742c cVar;
        if (jSONObject.optInt("connectivityStrategy") == 1) {
            cVar = new C11739a(this);
        } else {
            cVar = (Build.VERSION.SDK_INT < 23 || !C4961c.m22743b(context, "android.permission.ACCESS_NETWORK_STATE")) ? new C11739a(this) : new C11744e(this);
        }
        this.f52462a = cVar;
        String simpleName = C11741b.class.getSimpleName();
        Logger.m51953i(simpleName, "created ConnectivityAdapter with strategy " + this.f52462a.getClass().getSimpleName());
    }

    /* renamed from: a */
    public void mo44896a() {
    }

    /* renamed from: a */
    public final void mo45047a(Context context) {
        this.f52462a.mo45043a(context);
    }

    /* renamed from: a */
    public void mo44897a(String str) {
    }

    /* renamed from: a */
    public void mo44898a(String str, JSONObject jSONObject) {
    }

    /* renamed from: b */
    public final void mo45048b(Context context) {
        this.f52462a.mo45044b(context);
    }
}
