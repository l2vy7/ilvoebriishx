package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p21 {

    /* renamed from: a */
    private final String f37291a;

    /* renamed from: b */
    private final bc0 f37292b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f37293c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public u21 f37294d;

    /* renamed from: e */
    private final e70<Object> f37295e = new l21(this);

    /* renamed from: f */
    private final e70<Object> f37296f = new n21(this);

    public p21(String str, bc0 bc0, Executor executor) {
        this.f37291a = str;
        this.f37292b = bc0;
        this.f37293c = executor;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ boolean m35927g(p21 p21, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(p21.f37291a);
    }

    /* renamed from: c */
    public final void mo34039c(u21 u21) {
        this.f37292b.mo30654b("/updateActiveView", this.f37295e);
        this.f37292b.mo30654b("/untrackActiveViewUnit", this.f37296f);
        this.f37294d = u21;
    }

    /* renamed from: d */
    public final void mo34040d(xt0 xt0) {
        xt0.mo18726O("/updateActiveView", this.f37295e);
        xt0.mo18726O("/untrackActiveViewUnit", this.f37296f);
    }

    /* renamed from: e */
    public final void mo34041e() {
        this.f37292b.mo30655c("/updateActiveView", this.f37295e);
        this.f37292b.mo30655c("/untrackActiveViewUnit", this.f37296f);
    }

    /* renamed from: f */
    public final void mo34042f(xt0 xt0) {
        xt0.mo18728P("/updateActiveView", this.f37295e);
        xt0.mo18728P("/untrackActiveViewUnit", this.f37296f);
    }
}
