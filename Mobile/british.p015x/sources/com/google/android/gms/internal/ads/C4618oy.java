package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.internal.ads.oy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4618oy {

    /* renamed from: a */
    private final Date f20629a;

    /* renamed from: b */
    private final String f20630b;

    /* renamed from: c */
    private final List<String> f20631c;

    /* renamed from: d */
    private final int f20632d;

    /* renamed from: e */
    private final Set<String> f20633e;

    /* renamed from: f */
    private final Location f20634f;

    /* renamed from: g */
    private final Bundle f20635g;

    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f20636h;

    /* renamed from: i */
    private final String f20637i;

    /* renamed from: j */
    private final String f20638j;
    @NotOnlyInitialized

    /* renamed from: k */
    private final SearchAdRequest f20639k;

    /* renamed from: l */
    private final int f20640l;

    /* renamed from: m */
    private final Set<String> f20641m;

    /* renamed from: n */
    private final Bundle f20642n;

    /* renamed from: o */
    private final Set<String> f20643o;

    /* renamed from: p */
    private final boolean f20644p;

    /* renamed from: q */
    private final AdInfo f20645q;

    /* renamed from: r */
    private final String f20646r;

    /* renamed from: s */
    private final int f20647s;

    public C4618oy(C7995ny nyVar, SearchAdRequest searchAdRequest) {
        this.f20629a = nyVar.f36175g;
        this.f20630b = nyVar.f36176h;
        this.f20631c = nyVar.f36177i;
        this.f20632d = nyVar.f36178j;
        this.f20633e = Collections.unmodifiableSet(nyVar.f36169a);
        this.f20634f = nyVar.f36179k;
        this.f20635g = nyVar.f36170b;
        this.f20636h = Collections.unmodifiableMap(nyVar.f36171c);
        this.f20637i = nyVar.f36180l;
        this.f20638j = nyVar.f36181m;
        this.f20639k = searchAdRequest;
        this.f20640l = nyVar.f36182n;
        this.f20641m = Collections.unmodifiableSet(nyVar.f36172d);
        this.f20642n = nyVar.f36173e;
        this.f20643o = Collections.unmodifiableSet(nyVar.f36174f);
        this.f20644p = nyVar.f36183o;
        this.f20645q = nyVar.f36184p;
        this.f20646r = nyVar.f36185q;
        this.f20647s = nyVar.f36186r;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo18620a() {
        return this.f20632d;
    }

    /* renamed from: b */
    public final int mo18621b() {
        return this.f20647s;
    }

    /* renamed from: c */
    public final int mo18622c() {
        return this.f20640l;
    }

    /* renamed from: d */
    public final Location mo18623d() {
        return this.f20634f;
    }

    /* renamed from: e */
    public final Bundle mo18624e(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.f20635g.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    /* renamed from: f */
    public final Bundle mo18625f() {
        return this.f20642n;
    }

    /* renamed from: g */
    public final Bundle mo18626g(Class<? extends MediationExtrasReceiver> cls) {
        return this.f20635g.getBundle(cls.getName());
    }

    /* renamed from: h */
    public final Bundle mo18627h() {
        return this.f20635g;
    }

    @Deprecated
    /* renamed from: i */
    public final <T extends NetworkExtras> T mo18628i(Class<T> cls) {
        return (NetworkExtras) this.f20636h.get(cls);
    }

    /* renamed from: j */
    public final AdInfo mo18629j() {
        return this.f20645q;
    }

    /* renamed from: k */
    public final SearchAdRequest mo18630k() {
        return this.f20639k;
    }

    /* renamed from: l */
    public final String mo18631l() {
        return this.f20646r;
    }

    /* renamed from: m */
    public final String mo18632m() {
        return this.f20630b;
    }

    /* renamed from: n */
    public final String mo18633n() {
        return this.f20637i;
    }

    /* renamed from: o */
    public final String mo18634o() {
        return this.f20638j;
    }

    @Deprecated
    /* renamed from: p */
    public final Date mo18635p() {
        return this.f20629a;
    }

    /* renamed from: q */
    public final List<String> mo18636q() {
        return new ArrayList(this.f20631c);
    }

    /* renamed from: r */
    public final Map<Class<? extends NetworkExtras>, NetworkExtras> mo18637r() {
        return this.f20636h;
    }

    /* renamed from: s */
    public final Set<String> mo18638s() {
        return this.f20643o;
    }

    /* renamed from: t */
    public final Set<String> mo18639t() {
        return this.f20633e;
    }

    @Deprecated
    /* renamed from: u */
    public final boolean mo18640u() {
        return this.f20644p;
    }

    /* renamed from: v */
    public final boolean mo18641v(Context context) {
        RequestConfiguration c = C4632yy.m21230f().mo19013c();
        C8241uv.m38463b();
        String t = vn0.m38861t(context);
        return this.f20641m.contains(t) || c.getTestDeviceIds().contains(t);
    }
}
