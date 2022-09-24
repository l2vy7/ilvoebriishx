package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C7685fj {

    /* renamed from: a */
    public final Uri f31774a;

    /* renamed from: b */
    public final String f31775b = null;

    /* renamed from: c */
    public final List f31776c;

    /* renamed from: d */
    public final String f31777d;

    /* renamed from: e */
    public final p63<C7762hm> f31778e;
    @Deprecated

    /* renamed from: f */
    public final List f31779f;

    /* renamed from: g */
    public final Object f31780g;

    /* synthetic */ C7685fj(Uri uri, String str, C7790id idVar, C8391z2 z2Var, List list, String str2, p63 p63, Object obj, C7868ki kiVar) {
        this.f31774a = uri;
        this.f31776c = list;
        this.f31777d = null;
        this.f31778e = p63;
        m63 t = p63.m20820t();
        if (p63.size() <= 0) {
            this.f31779f = t.mo33497g();
            this.f31780g = null;
            return;
        }
        C7762hm hmVar = (C7762hm) p63.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7685fj)) {
            return false;
        }
        C7685fj fjVar = (C7685fj) obj;
        return this.f31774a.equals(fjVar.f31774a) && d13.m20317p((Object) null, (Object) null) && d13.m20317p((Object) null, (Object) null) && d13.m20317p((Object) null, (Object) null) && this.f31776c.equals(fjVar.f31776c) && d13.m20317p((Object) null, (Object) null) && this.f31778e.equals(fjVar.f31778e) && d13.m20317p((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((this.f31774a.hashCode() * 923521) + this.f31776c.hashCode()) * 961) + this.f31778e.hashCode()) * 31;
    }
}
