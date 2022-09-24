package com.startapp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.C11963i7;
import com.startapp.C5015nb;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C12261b;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.startapp.r0 */
/* compiled from: Sta */
public abstract class C12154r0 extends C12261b {

    /* renamed from: g */
    public Set<String> f54081g = new HashSet();

    /* renamed from: h */
    public Set<String> f54082h = new HashSet();

    /* renamed from: i */
    public GetAdRequest f54083i;

    /* renamed from: j */
    public int f54084j = 0;

    /* renamed from: k */
    public final boolean f54085k;

    /* renamed from: l */
    public C12021l f54086l;

    public C12154r0(Context context, C5041Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, boolean z) {
        super(context, ad, adPreferences, adEventListener, placement);
        this.f54085k = z;
    }

    /* renamed from: a */
    public boolean mo45700a(Object obj) {
        if (obj == null) {
            if (this.f54537f == null) {
                this.f54537f = "No response";
            }
            return false;
        } else if (!(obj instanceof C11963i7.C11964a)) {
            if (this.f54537f == null) {
                this.f54537f = "Unknown error";
            }
            return false;
        } else {
            C11963i7.C11964a aVar = (C11963i7.C11964a) obj;
            String str = aVar.f53099a;
            try {
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(str)) {
                    if (this.f54537f == null) {
                        GetAdRequest getAdRequest = this.f54083i;
                        if (getAdRequest == null || !getAdRequest.mo46276b()) {
                            this.f54537f = "Empty Ad";
                        } else {
                            this.f54537f = "Video isn't available";
                        }
                    }
                    return false;
                }
                boolean H = AdsCommonMetaData.f22242h.mo20878H();
                String a = C5015nb.m22910a(str, "@adId@", "@adId@");
                if (a != null && a.length() > 0) {
                    this.f54086l = new C12021l(a, aVar, this.f54085k, H);
                }
                List<AppPresenceDetails> a2 = C11839d0.m52130a(str, this.f54084j);
                boolean z = H && C11839d0.m52128a(this.f54532a, a2, this.f54084j, this.f54081g, (List<AppPresenceDetails>) arrayList).booleanValue();
                C12021l lVar = this.f54086l;
                if (lVar != null) {
                    lVar.f53232f = z;
                }
                if (z) {
                    new C11810c0(this.f54532a, arrayList).mo45177a();
                } else {
                    HtmlAd htmlAd = (HtmlAd) this.f54533b;
                    htmlAd.mo20921a(a2);
                    htmlAd.mo20925c(str);
                }
                C12021l lVar2 = this.f54086l;
                if (lVar2 != null) {
                    lVar2.f53233g = C5015nb.m22900a();
                }
                if (!z) {
                    return true;
                }
                mo45705f();
                this.f54084j++;
                return mo46156b();
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                return false;
            }
        }
    }

    /* renamed from: b */
    public void mo45701b(boolean z) {
        this.f54533b.setState(z ? C5041Ad.AdState.READY : C5041Ad.AdState.UN_INITIALIZED);
    }

    /* renamed from: b */
    public boolean mo45702b(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }

    /* renamed from: c */
    public void mo45703c(boolean z) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f54533b.hashCode());
        intent.putExtra("adResult", z);
        C5116u5.m23368a(this.f54532a).mo21244a(intent);
        if (!z) {
            C5011i.m22894a(this.f54532a, mo46154a(), this.f54533b, false);
            mo45705f();
        } else if (this.f54085k) {
            C12021l lVar = this.f54086l;
            if (lVar != null) {
                lVar.f53234h = C5015nb.m22900a();
            }
            ComponentLocator.m23305a(this.f54532a).f22436b.mo46698b().mo45224a(((HtmlAd) this.f54533b).mo20929j(), new C12155a());
        } else {
            C5011i.m22895b(this.f54532a, mo46154a(), this.f54533b, false);
            mo45705f();
        }
    }

    /* renamed from: e */
    public Object mo45704e() {
        Map<String, String> map;
        GetAdRequest d = mo45237d();
        this.f54083i = d;
        if (!mo45702b(d)) {
            return null;
        }
        if (this.f54081g.size() == 0) {
            this.f54081g.add(this.f54532a.getPackageName());
        }
        GetAdRequest getAdRequest = this.f54083i;
        getAdRequest.f54594B0 = this.f54081g;
        getAdRequest.f54596D0 = this.f54082h;
        if (this.f54084j > 0) {
            getAdRequest.f54598F0 = false;
            if (MetaData.f22407k.mo21165G().mo46418a(this.f54532a)) {
                SimpleTokenUtils.m23086e(this.f54532a);
            }
        }
        C12359u3 k = ComponentLocator.m23305a(this.f54532a).mo21224k();
        String a = AdsConstants.m53135a(AdsConstants.AdApiType.HTML, this.f54536e);
        k.getClass();
        GetAdRequest getAdRequest2 = this.f54083i;
        if (getAdRequest2 != null) {
            try {
                map = k.mo46649a();
                C12411w6 w6Var = new C12411w6();
                getAdRequest2.mo45384a(w6Var);
                a = C12359u3.m53528a(a, w6Var.toString());
            } catch (SDKException e) {
                C5004d4.m22887a((Throwable) e);
                return null;
            } catch (Throwable th) {
                C5004d4.m22887a(th);
                return null;
            }
        } else {
            map = null;
        }
        String str = k.f54809b.f53254a;
        boolean z = k.mo46650b().f54873a;
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = C5015nb.m22900a();
        C11781a7 a7Var = k.f54811d;
        C11940h7 h7Var = a7Var != null ? new C11940h7(a7Var) : null;
        try {
            C11963i7.C11964a a3 = C11963i7.m52453a(a, map, str, z);
            if (h7Var != null) {
                h7Var.mo45406a("GET", a, (SDKException) null);
            }
            a3.f53102d = currentTimeMillis;
            a3.f53103e = a2;
            a3.f53104f = C5015nb.m22900a();
            return a3;
        } catch (SDKException e2) {
            if (h7Var != null) {
                h7Var.mo45406a("GET", a, e2);
            }
            this.f54537f = e2.getMessage();
            return null;
        } catch (Throwable th2) {
            C5004d4.m22887a(th2);
            return null;
        }
    }

    /* renamed from: f */
    public final void mo45705f() {
        C12021l lVar = this.f54086l;
        if (lVar != null) {
            try {
                ComponentLocator.m23305a(this.f54532a).f22431G.mo46698b().mo45490a(lVar);
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
            this.f54086l = null;
        }
    }

    /* renamed from: com.startapp.r0$a */
    /* compiled from: Sta */
    public class C12155a implements C5015nb.C5016a {
        public C12155a() {
        }

        /* renamed from: a */
        public void mo20681a(boolean z, long j, long j2, boolean z2) {
            C12154r0 r0Var = C12154r0.this;
            C5011i.m22895b(r0Var.f54532a, r0Var.mo46154a(), C12154r0.this.f54533b, false);
            C12154r0 r0Var2 = C12154r0.this;
            C12021l lVar = r0Var2.f54086l;
            if (lVar != null) {
                lVar.f53231e = z;
                lVar.f53235i = j;
                lVar.f53236j = j2;
                lVar.f53238l = z2;
                r0Var2.mo45705f();
            }
        }

        /* renamed from: a */
        public void mo20680a(int i, String str) {
            C12154r0.this.f54533b.setErrorMessage(str);
            C12154r0 r0Var = C12154r0.this;
            C5011i.m22894a(r0Var.f54532a, r0Var.mo46154a(), C12154r0.this.f54533b, false);
            C12154r0 r0Var2 = C12154r0.this;
            C12021l lVar = r0Var2.f54086l;
            if (lVar != null) {
                lVar.f53237k = i;
                r0Var2.mo45705f();
            }
        }
    }
}
