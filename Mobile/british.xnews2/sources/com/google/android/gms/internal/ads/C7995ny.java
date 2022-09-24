package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ny */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C7995ny {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final HashSet<String> f36169a = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f36170b = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f36171c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashSet<String> f36172d = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Bundle f36173e = new Bundle();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final HashSet<String> f36174f = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Date f36175g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f36176h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<String> f36177i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f36178j = -1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Location f36179k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f36180l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f36181m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f36182n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f36183o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public AdInfo f36184p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f36185q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f36186r = 60000;

    /* renamed from: D */
    public final void mo33792D(String str) {
        this.f36174f.add(str);
    }

    /* renamed from: E */
    public final void mo33793E(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.f36170b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f36170b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.f36170b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        C4604n.m20098k(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    /* renamed from: F */
    public final void mo33794F(String str, String str2) {
        this.f36173e.putString(str, str2);
    }

    /* renamed from: G */
    public final void mo33795G(String str) {
        this.f36169a.add(str);
    }

    /* renamed from: H */
    public final void mo33796H(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.f36170b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    /* renamed from: I */
    public final void mo33797I(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            mo33796H(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.f36171c.put(networkExtras.getClass(), networkExtras);
        }
    }

    /* renamed from: J */
    public final void mo33798J(String str) {
        this.f36172d.add(str);
    }

    /* renamed from: K */
    public final void mo33799K(String str) {
        this.f36172d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* renamed from: L */
    public final void mo33800L(AdInfo adInfo) {
        this.f36184p = adInfo;
    }

    /* renamed from: a */
    public final void mo33801a(String str) {
        this.f36185q = str;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo33802b(Date date) {
        this.f36175g = date;
    }

    /* renamed from: c */
    public final void mo33803c(String str) {
        this.f36176h = str;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo33804d(int i) {
        this.f36178j = i;
    }

    /* renamed from: e */
    public final void mo33805e(int i) {
        this.f36186r = i;
    }

    @Deprecated
    /* renamed from: f */
    public final void mo33806f(boolean z) {
        this.f36183o = z;
    }

    /* renamed from: g */
    public final void mo33807g(Location location) {
        this.f36179k = location;
    }

    /* renamed from: h */
    public final void mo33808h(List<String> list) {
        this.f36177i.clear();
        for (String next : list) {
            if (TextUtils.isEmpty(next)) {
                co0.zzj("neighboring content URL should not be null or empty");
            } else {
                this.f36177i.add(next);
            }
        }
    }

    /* renamed from: i */
    public final void mo33809i(String str) {
        this.f36180l = str;
    }

    /* renamed from: j */
    public final void mo33810j(String str) {
        this.f36181m = str;
    }

    @Deprecated
    /* renamed from: k */
    public final void mo33811k(boolean z) {
        this.f36182n = z ? 1 : 0;
    }
}
