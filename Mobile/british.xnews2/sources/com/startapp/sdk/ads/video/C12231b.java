package com.startapp.sdk.ads.video;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.C11882e4;
import com.startapp.C11883e5;
import com.startapp.C11963i7;
import com.startapp.C12132pb;
import com.startapp.C12154r0;
import com.startapp.C12168rb;
import com.startapp.C5004d4;
import com.startapp.C5011i;
import com.startapp.C5015nb;
import com.startapp.sdk.ads.video.C12237d;
import com.startapp.sdk.ads.video.C12245j;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.ads.video.vast.C12255a;
import com.startapp.sdk.ads.video.vast.C12256b;
import com.startapp.sdk.ads.video.vast.C12257c;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.C5068d;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.C5059d;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.startapp.sdk.ads.video.b */
/* compiled from: Sta */
public class C12231b extends C12154r0 {

    /* renamed from: m */
    public final long f54385m = System.currentTimeMillis();

    /* renamed from: n */
    public volatile CacheKey f54386n;

    /* renamed from: o */
    public int f54387o = 0;

    /* renamed from: com.startapp.sdk.ads.video.b$a */
    /* compiled from: Sta */
    public class C12232a implements C12257c.C12258a {
        public C12232a() {
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$b */
    /* compiled from: Sta */
    public class C12233b implements C12245j.C12247b {

        /* renamed from: a */
        public final /* synthetic */ boolean f54389a;

        public C12233b(boolean z) {
            this.f54389a = z;
        }

        /* renamed from: a */
        public void mo46032a(String str) {
            if (str != null) {
                if (!str.equals("downloadInterrupted")) {
                    C12231b.this.f54533b.setState(this.f54389a ? C5041Ad.AdState.READY : C5041Ad.AdState.UN_INITIALIZED);
                    C12231b.this.mo46031g().mo45968a(str);
                }
                C12231b.this.mo45703c(this.f54389a);
                return;
            }
            C12231b.this.mo45703c(false);
            C12231b bVar = C12231b.this;
            C5011i.m22894a(bVar.f54532a, bVar.mo46154a(), C12231b.this.f54533b, false);
            C12231b.m53057a(C12231b.this, VASTErrorCodes.FileNotFound, (List) null);
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$c */
    /* compiled from: Sta */
    public class C12234c implements C12237d.C12238a {
        public C12234c() {
        }

        /* renamed from: a */
        public void mo46033a(String str) {
            C12231b.this.mo46031g().mo45968a(str);
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$d */
    /* compiled from: Sta */
    public class C12235d implements C5059d.C5060d {

        /* renamed from: a */
        public final /* synthetic */ boolean f54392a;

        public C12235d(boolean z) {
            this.f54392a = z;
        }

        /* renamed from: a */
        public void mo20975a(C5041Ad ad, CacheKey cacheKey, boolean z) {
            if (this.f54392a && z) {
                C12231b.this.f54386n = cacheKey;
            }
        }
    }

    public C12231b(Context context, C5041Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad, adPreferences, adEventListener, placement, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch:{ all -> 0x001e, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m53057a(com.startapp.sdk.ads.video.C12231b r5, com.startapp.sdk.ads.video.vast.VASTErrorCodes r6, java.util.List<java.lang.String> r7) {
        /*
            r5.getClass()
            if (r7 == 0) goto L_0x0023
            int r0 = r7.size()     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x0023
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r0 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.SAProcessSuccess     // Catch:{ all -> 0x001e }
            if (r6 != r0) goto L_0x0013
            java.util.List r7 = com.startapp.C5015nb.m22912a((java.util.List<java.lang.String>) r7)     // Catch:{ all -> 0x001e }
        L_0x0013:
            int r0 = r7.size()     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x0040
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r7 = com.startapp.sdk.ads.video.tracking.VideoTrackingDetails.m53085b(r7)     // Catch:{ all -> 0x001e }
            goto L_0x0041
        L_0x001e:
            r7 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0077 }
            goto L_0x0040
        L_0x0023:
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.mo46031g()     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0040
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.mo46031g()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r7 = r7.mo45976h()     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0040
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.mo46031g()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r7 = r7.mo45976h()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r7 = r7.mo46059e()     // Catch:{ all -> 0x0077 }
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            if (r7 == 0) goto L_0x007b
            int r0 = r7.length     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x007b
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r5.mo46031g()     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0059
            java.lang.String r2 = r0.mo45977i()     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r0.mo45977i()     // Catch:{ all -> 0x0077 }
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r2 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "1"
            r4 = 0
            r2.<init>(r1, r4, r4, r3)     // Catch:{ all -> 0x0077 }
            com.startapp.ic r1 = new com.startapp.ic     // Catch:{ all -> 0x0077 }
            r1.<init>(r7, r2, r0, r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "error"
            r1.f53121e = r7     // Catch:{ all -> 0x0077 }
            r1.f53122f = r6     // Catch:{ all -> 0x0077 }
            com.startapp.hc r6 = r1.mo45456a()     // Catch:{ all -> 0x0077 }
            android.content.Context r5 = r5.f54532a     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.VideoUtil.m53052a((android.content.Context) r5, (com.startapp.C11944hc) r6)     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r5 = move-exception
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r5)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.C12231b.m53057a(com.startapp.sdk.ads.video.b, com.startapp.sdk.ads.video.vast.VASTErrorCodes, java.util.List):void");
    }

    /* renamed from: b */
    public boolean mo45702b(GetAdRequest getAdRequest) {
        VideoUtil.VideoEligibility a;
        if (!(getAdRequest != null)) {
            return false;
        }
        if (!getAdRequest.mo46276b() || (a = VideoUtil.m53049a(this.f54532a)) == VideoUtil.VideoEligibility.ELIGIBLE) {
            return true;
        }
        this.f54537f = a.mo46027a();
        return false;
    }

    /* renamed from: d */
    public GetAdRequest mo45237d() {
        GetAdRequest a = mo46155a((GetAdRequest) new C12230a());
        if (a != null) {
            a.mo45515f(this.f54532a);
        }
        return a;
    }

    /* renamed from: g */
    public VideoAdDetails mo46031g() {
        return ((VideoEnabledAd) this.f54533b).mo45987w();
    }

    /* renamed from: d */
    public final void mo46030d(boolean z) {
        AdPreferences adPreferences;
        C5041Ad.AdType type = this.f54533b.getType();
        C5041Ad.AdType adType = C5041Ad.AdType.REWARDED_VIDEO;
        if ((type != adType && this.f54533b.getType() != C5041Ad.AdType.VIDEO) || z) {
            AdPreferences adPreferences2 = this.f54534c;
            if (adPreferences2 == null) {
                adPreferences = new AdPreferences();
            } else {
                adPreferences = new AdPreferences(adPreferences2);
            }
            adPreferences.setType((this.f54533b.getType() == adType || this.f54533b.getType() == C5041Ad.AdType.VIDEO) ? C5041Ad.AdType.VIDEO_NO_VAST : C5041Ad.AdType.NON_VIDEO);
            C5059d.f22346h.mo21045a(this.f54532a, (StartAppAd) null, this.f54536e, adPreferences, (C5059d.C5060d) new C12235d(z));
        }
    }

    /* renamed from: b */
    public void mo45701b(boolean z) {
        if (!(mo46031g() != null)) {
            this.f54533b.setState(z ? C5041Ad.AdState.READY : C5041Ad.AdState.UN_INITIALIZED);
        }
    }

    /* renamed from: a */
    public boolean mo45700a(Object obj) {
        VASTErrorCodes vASTErrorCodes;
        C11963i7.C11964a aVar = (C11963i7.C11964a) obj;
        String str = null;
        String str2 = aVar != null ? aVar.f53100b : null;
        boolean z = false;
        boolean z2 = true;
        if (str2 == null || !str2.toLowerCase().contains("json")) {
            if (aVar != null) {
                str = aVar.f53099a;
            }
            if (AdsCommonMetaData.f22242h.mo20877G().mo21010q()) {
                if (C5015nb.m22910a(str, "@videoJson@", "@videoJson@") == null) {
                    z2 = false;
                }
                if (z2) {
                    mo46030d(false);
                }
            }
            return super.mo45700a(obj);
        }
        VideoConfig G = AdsCommonMetaData.f22242h.mo20877G();
        if (G.mo21010q()) {
            Set<String> set = this.f54083i.f54596D0;
            if (!(set != null && set.size() > 0)) {
                mo46030d(true);
            }
        }
        try {
            C12168rb rbVar = (C12168rb) C11883e5.m52269a(aVar.f53099a, C12168rb.class);
            if (rbVar == null || rbVar.getVastTag() == null) {
                return mo46029a("no VAST wrapper in json", (Throwable) null, true);
            }
            String M = MetaData.f22407k.mo21171M();
            C12256b bVar = (!rbVar.isRecordHops() || TextUtils.isEmpty(M)) ? null : new C12256b(this.f54532a, M, rbVar.getPartnerResponse(), rbVar.getPartnerName(), rbVar.isSkipFailed());
            C12257c cVar = new C12257c(this.f54532a.getResources().getDisplayMetrics(), ComponentLocator.m23305a(this.f54532a).mo21235v().f53254a);
            cVar.f54487f = G.mo20996e();
            cVar.f54484c = new C12232a();
            String vastTag = rbVar.getVastTag();
            cVar.f54488g.clear();
            C12132pb a = cVar.mo46094a(vastTag, new ArrayList(), bVar);
            if (a != null) {
                int i = (int) (((float) cVar.f54482a) / cVar.f54483b);
                C12255a aVar2 = null;
                for (C12255a next : cVar.f54488g) {
                    if (aVar2 == null || next.mo46087a(cVar.f54482a, i) > aVar2.mo46087a(cVar.f54482a, i)) {
                        aVar2 = next;
                    }
                }
                a.f54030o = aVar2;
                ArrayList arrayList = new ArrayList(a.f54016a);
                VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
                cVar.mo46098a((List<String>) arrayList, vASTErrorCodes2);
                if (bVar != null) {
                    bVar.mo46092a(vASTErrorCodes2);
                }
            } else if (!(bVar == null || (vASTErrorCodes = cVar.f54485d) == null)) {
                bVar.mo46092a(vASTErrorCodes);
            }
            if (a != null) {
                C5041Ad ad = this.f54533b;
                VideoEnabledAd videoEnabledAd = (VideoEnabledAd) ad;
                if (ad.getType() != C5041Ad.AdType.REWARDED_VIDEO) {
                    z = true;
                }
                videoEnabledAd.mo45985a(a, G, z);
                if (rbVar.getTtlSec() != null) {
                    ((VideoEnabledAd) this.f54533b).mo20924b(rbVar.getTtlSec());
                }
                aVar.f53099a = rbVar.getAdmTag();
                aVar.f53100b = "text/html";
                return super.mo45700a(aVar);
            }
            if (rbVar.getCampaignId() != null) {
                this.f54082h.add(rbVar.getCampaignId());
            }
            this.f54387o++;
            ((VideoEnabledAd) this.f54533b).mo45986v();
            if (System.currentTimeMillis() - this.f54385m >= ((long) G.mo21007n())) {
                return mo46029a("VAST retry timeout", (Throwable) null, false);
            }
            if (this.f54387o > G.mo20995d()) {
                return mo46029a("VAST too many excludes", (Throwable) null, false);
            }
            return mo46156b();
        } catch (Exception e) {
            return mo46029a("VAST json parsing", (Throwable) e, true);
        }
    }

    /* renamed from: a */
    public void mo45316a(boolean z) {
        super.mo45316a(z);
        if (z) {
            if (mo46031g() != null) {
                if (AdsCommonMetaData.f22242h.mo20877G().mo21009p()) {
                    this.f54533b.setState(z ? C5041Ad.AdState.READY : C5041Ad.AdState.UN_INITIALIZED);
                }
                mo46031g().mo45969a(this.f54534c.isVideoMuted());
                C12233b bVar = new C12233b(z);
                C12234c cVar = new C12234c();
                C12243h b = ComponentLocator.m23305a(this.f54532a).f22434J.mo46698b();
                b.f54411c.execute(new C12240e(b, mo46031g().mo45977i(), bVar, cVar));
                return;
            }
        }
        mo45703c(z);
    }

    /* renamed from: a */
    public final boolean mo46029a(String str, Throwable th, boolean z) {
        if (th != null) {
            C5004d4.m22887a(th);
        } else if (z) {
            C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
            d4Var.f22126d = str;
            d4Var.mo20661a();
        }
        C5068d c = C5059d.f22346h.mo21052c(this.f54386n);
        if (c instanceof HtmlAd) {
            C11963i7.C11964a aVar = new C11963i7.C11964a();
            aVar.f53100b = "text/html";
            aVar.f53099a = ((HtmlAd) c).mo20929j();
            return super.mo45700a(aVar);
        }
        this.f54533b.setErrorMessage(this.f54537f);
        return false;
    }
}
