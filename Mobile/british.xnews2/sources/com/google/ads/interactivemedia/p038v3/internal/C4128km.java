package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.km */
/* compiled from: IMASDK */
public final class C4128km {

    /* renamed from: a */
    public final Uri f17720a;

    /* renamed from: b */
    public final String f17721b;

    /* renamed from: c */
    public final C4126kk f17722c = null;

    /* renamed from: d */
    public final C4123kh f17723d = null;

    /* renamed from: e */
    public final List<C4543zw> f17724e;

    /* renamed from: f */
    public final String f17725f;

    /* renamed from: g */
    public final List f17726g;

    /* renamed from: h */
    public final Object f17727h;

    /* synthetic */ C4128km(Uri uri, String str, C4126kk kkVar, C4123kh khVar, List list, List list2) {
        this.f17720a = uri;
        this.f17721b = str;
        this.f17724e = list;
        this.f17725f = null;
        this.f17726g = list2;
        this.f17727h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4128km)) {
            return false;
        }
        C4128km kmVar = (C4128km) obj;
        return this.f17720a.equals(kmVar.f17720a) && amm.m14233c(this.f17721b, kmVar.f17721b) && amm.m14233c((Object) null, (Object) null) && amm.m14233c((Object) null, (Object) null) && this.f17724e.equals(kmVar.f17724e) && amm.m14233c((Object) null, (Object) null) && this.f17726g.equals(kmVar.f17726g) && amm.m14233c((Object) null, (Object) null);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f17720a.hashCode() * 31;
        String str = this.f17721b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return (((((hashCode + i) * 29791) + this.f17724e.hashCode()) * 961) + this.f17726g.hashCode()) * 31;
    }
}
