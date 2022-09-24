package com.appnext.nativeads.designed_native_ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3148Ad;
import com.appnext.core.C3187f;
import com.appnext.core.C3211o;
import com.appnext.core.C3213q;
import com.appnext.core.SettingsManager;
import com.appnext.core.adswatched.C3169a;
import com.appnext.nativeads.NativeAdObject;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appnext.nativeads.designed_native_ads.d */
public final class C3297d {
    /* access modifiers changed from: private */

    /* renamed from: aM */
    public Context f12538aM;
    /* access modifiers changed from: private */

    /* renamed from: go */
    public List<C3302a> f12539go;
    /* access modifiers changed from: private */

    /* renamed from: gp */
    public String f12540gp;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* renamed from: com.appnext.nativeads.designed_native_ads.d$a */
    private class C3302a {

        /* renamed from: aY */
        private String f12553aY;

        /* renamed from: gv */
        private DesignNativeAd f12555gv;

        /* renamed from: gw */
        private boolean f12556gw = false;

        /* renamed from: gx */
        private boolean f12557gx = false;

        public C3302a(DesignNativeAd designNativeAd) {
            this.f12553aY = designNativeAd.getBannerID();
            this.f12555gv = designNativeAd;
        }

        /* renamed from: bh */
        public final void mo11035bh() {
            this.f12556gw = true;
        }

        /* renamed from: bi */
        public final void mo11036bi() {
            this.f12557gx = true;
        }

        /* renamed from: bj */
        public final DesignNativeAd mo11037bj() {
            return this.f12555gv;
        }

        /* renamed from: bk */
        public final boolean mo11038bk() {
            return this.f12556gw;
        }

        /* renamed from: bl */
        public final boolean mo11039bl() {
            return this.f12557gx;
        }

        public final boolean equals(Object obj) {
            if (obj != null) {
                try {
                    if ((obj instanceof C3302a) && ((C3302a) obj).f12553aY.equals(this.f12553aY)) {
                        return true;
                    }
                } catch (Throwable th) {
                    C3117a.m10553a("DesignedNativeAdsActionsController$Reports", th);
                }
            }
            return super.equals(obj);
        }
    }

    /* renamed from: com.appnext.nativeads.designed_native_ads.d$b */
    private class C3303b implements C3213q.C3217a {

        /* renamed from: gv */
        private DesignNativeAd f12559gv;

        /* renamed from: gy */
        private NativeAdObject f12560gy;

        public C3303b(DesignNativeAd designNativeAd) {
            this.f12560gy = new NativeAdObject(C3297d.this.f12538aM, C3297d.this.f12540gp);
            this.f12559gv = designNativeAd;
        }

        /* renamed from: c */
        public final C3148Ad mo10141c() {
            return this.f12560gy;
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ AppnextAd mo10142d() {
            return this.f12559gv;
        }

        /* renamed from: e */
        public final SettingsManager mo10143e() {
            return C3296c.m11038bg();
        }

        public final void report(String str) {
        }
    }

    public C3297d(Context context, List<DesignNativeAd> list, String str) {
        this.f12538aM = context;
        this.f12540gp = str;
        m11050f(list);
    }

    /* renamed from: f */
    private void m11050f(List<DesignNativeAd> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f12539go = new ArrayList();
                    for (DesignNativeAd aVar : list) {
                        this.f12539go.add(new C3302a(aVar));
                    }
                }
            } catch (Throwable th) {
                C3117a.m10553a("DesignedNativeAdsActionsController$init", th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11049c(final DesignNativeAd designNativeAd) {
        try {
            new C3213q(this.f12538aM, new C3303b(designNativeAd)).mo10827d(designNativeAd);
            designNativeAd.getAdTitle();
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    C3169a.m10687o(C3297d.this.f12538aM).mo10753k(designNativeAd.getBannerID(), DesignNativeAdObject.AUID);
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdsActionsController$impression", th);
        }
    }

    /* renamed from: a */
    public final void mo11029a(final DesignNativeAd designNativeAd, final int i) {
        int indexOf;
        try {
            if (this.f12539go == null || (indexOf = this.f12539go.indexOf(new C3302a(designNativeAd))) < 0) {
                return;
            }
            if (indexOf <= this.f12539go.size() - 1) {
                final C3302a aVar = this.f12539go.get(indexOf);
                if ((!Boolean.parseBoolean(C3296c.m11038bg().mo10732y("report_vta_instead_of_impresssion")) || indexOf == 0) && !aVar.mo11039bl() && i >= Integer.parseInt(C3296c.m11038bg().mo10732y("min_imp_precentage"))) {
                    int parseInt = Integer.parseInt(C3296c.m11038bg().mo10732y("postpone_impression_sec"));
                    if (!Boolean.parseBoolean(C3296c.m11038bg().mo10732y("repeat_viewable_criteria")) || parseInt <= 0) {
                        int indexOf2 = this.f12539go.indexOf(new C3302a(designNativeAd));
                        if (indexOf2 <= 0 || !this.f12539go.get(indexOf2).mo11039bl()) {
                            aVar.mo11036bi();
                            m11049c(aVar.mo11037bj());
                            return;
                        }
                        return;
                    }
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.postDelayed(new Runnable() {
                            public final void run() {
                                try {
                                    int indexOf = C3297d.this.f12539go.indexOf(new C3302a(designNativeAd));
                                    if ((indexOf <= 0 || !((C3302a) C3297d.this.f12539go.get(indexOf)).mo11039bl()) && i >= Integer.parseInt(C3296c.m11038bg().mo10732y("min_imp_precentage"))) {
                                        C3297d.this.m11049c(aVar.mo11037bj());
                                        aVar.mo11036bi();
                                    }
                                } catch (Throwable th) {
                                    C3117a.m10553a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
                                }
                            }
                        }, (long) (parseInt * 1000));
                    }
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
        }
    }

    /* renamed from: b */
    public final void mo11030b(final DesignNativeAd designNativeAd, final int i) {
        try {
            if (this.f12539go != null) {
                int indexOf = this.f12539go.indexOf(new C3302a(designNativeAd));
                if (Boolean.parseBoolean(C3296c.m11038bg().mo10732y("report_vta_instead_of_impresssion"))) {
                    if ((Boolean.parseBoolean(C3296c.m11038bg().mo10732y("report_vta_instead_of_impresssion")) && indexOf == 0) || indexOf < 0) {
                        return;
                    }
                    if (indexOf <= this.f12539go.size() - 1) {
                        final C3302a aVar = this.f12539go.get(indexOf);
                        if (!aVar.mo11038bk() && i >= Integer.parseInt(C3296c.m11038bg().mo10732y("min_vta_precentage"))) {
                            int parseInt = Integer.parseInt(C3296c.m11038bg().mo10732y("postpone_vta_sec"));
                            if (!Boolean.parseBoolean(C3296c.m11038bg().mo10732y("repeat_vta_viewable_criteria")) || parseInt <= 0) {
                                int indexOf2 = this.f12539go.indexOf(new C3302a(designNativeAd));
                                if (indexOf2 <= 0 || !this.f12539go.get(indexOf2).mo11039bl()) {
                                    aVar.mo11035bh();
                                    m11046b(aVar.mo11037bj());
                                    return;
                                }
                                return;
                            }
                            Handler handler = this.mHandler;
                            if (handler != null) {
                                handler.postDelayed(new Runnable() {
                                    public final void run() {
                                        try {
                                            int indexOf = C3297d.this.f12539go.indexOf(new C3302a(designNativeAd));
                                            if ((indexOf <= 0 || !((C3302a) C3297d.this.f12539go.get(indexOf)).mo11039bl()) && i >= Integer.parseInt(C3296c.m11038bg().mo10732y("min_vta_precentage"))) {
                                                aVar.mo11035bh();
                                                C3297d.this.m11046b(aVar.mo11037bj());
                                            }
                                        } catch (Throwable th) {
                                            C3117a.m10553a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
                                        }
                                    }
                                }, (long) (parseInt * 1000));
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdsActionsController$impressionIfNecessary", th);
        }
    }

    /* renamed from: a */
    public final void mo11028a(DesignNativeAd designNativeAd) {
        try {
            new C3213q(this.f12538aM, new C3303b(designNativeAd)).mo10823a(designNativeAd, designNativeAd.getAppURL(), this.f12540gp, (C3187f.C3196a) null);
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdsActionsController$doClick", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11046b(final DesignNativeAd designNativeAd) {
        try {
            C3213q qVar = new C3213q(this.f12538aM, new C3303b(designNativeAd));
            designNativeAd.getAdTitle();
            designNativeAd.getBannerID();
            qVar.mo10822a(designNativeAd, designNativeAd.getImpressionUrl(), (C3187f.C3196a) null);
            C3211o.m10825az().mo10821a(new Runnable() {
                public final void run() {
                    C3169a.m10687o(C3297d.this.f12538aM).mo10753k(designNativeAd.getBannerID(), DesignNativeAdObject.AUID);
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("DesignedNativeAdsActionsController$vta", th);
        }
    }
}
