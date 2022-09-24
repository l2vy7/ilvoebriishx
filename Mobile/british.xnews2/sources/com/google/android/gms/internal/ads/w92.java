package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.yb1;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w92<AdT, AdapterT, ListenerT extends yb1> implements r42<AdT> {

    /* renamed from: a */
    private final t42<AdapterT, ListenerT> f40734a;

    /* renamed from: b */
    private final a52<AdT, AdapterT, ListenerT> f40735b;

    /* renamed from: c */
    private final dw2 f40736c;

    /* renamed from: d */
    private final nb3 f40737d;

    public w92(dw2 dw2, nb3 nb3, t42<AdapterT, ListenerT> t42, a52<AdT, AdapterT, ListenerT> a52) {
        this.f40736c = dw2;
        this.f40737d = nb3;
        this.f40735b = a52;
        this.f40734a = t42;
    }

    /* renamed from: e */
    static final String m39076e(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo31509a(ur2 ur2, ir2 ir2) {
        return !ir2.f33495u.isEmpty();
    }

    /* renamed from: b */
    public final mb3<AdT> mo31510b(ur2 ur2, ir2 ir2) {
        u42<AdapterT, ListenerT> u42;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator<String> it = ir2.f33495u.iterator();
        while (true) {
            if (!it.hasNext()) {
                u42 = null;
                break;
            }
            try {
                u42 = this.f40734a.mo32361a(it.next(), ir2.f33497w);
                break;
            } catch (gs2 unused) {
            }
        }
        if (u42 == null) {
            return bb3.m30648h(new w72("Unable to instantiate mediation adapter class."));
        }
        uo0 uo0 = new uo0();
        u42.f39764c.mo34072f3(new v92(this, u42, uo0));
        if (ir2.f33447J) {
            Bundle bundle = ur2.f39936a.f38765a.f30087d.f42952n;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        dw2 dw2 = this.f40736c;
        return mv2.m34933d(new u92(this, ur2, ir2, u42), this.f40737d, wv2.ADAPTER_LOAD_AD_SYN, dw2).mo35043b(wv2.ADAPTER_LOAD_AD_ACK).mo35045d(uo0).mo35043b(wv2.ADAPTER_WRAP_ADAPTER).mo35046e(new t92(this, ur2, ir2, u42)).mo35042a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo35596c(ur2 ur2, ir2 ir2, u42 u42, Void voidR) throws Exception {
        return this.f40735b.mo30307a(ur2, ir2, u42);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo35597d(ur2 ur2, ir2 ir2, u42 u42) throws Exception {
        this.f40735b.mo30308b(ur2, ir2, u42);
    }
}
