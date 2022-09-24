package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.startapp.C11840d1;
import com.startapp.C11868d9;
import com.startapp.C12011k7;
import com.startapp.C12339t2;
import com.startapp.C12448y6;
import com.startapp.C12454yc;
import com.startapp.C12458z0;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class NativeAdDetails implements NativeAdInterface {

    /* renamed from: a */
    public final AdDetails f22201a;

    /* renamed from: b */
    public Bitmap f22202b;

    /* renamed from: c */
    public Bitmap f22203c;

    /* renamed from: d */
    public boolean f22204d = false;

    /* renamed from: e */
    public boolean f22205e = false;

    /* renamed from: f */
    public String f22206f;

    /* renamed from: g */
    public C12454yc f22207g;

    /* renamed from: h */
    public WeakReference<View> f22208h = new WeakReference<>((Object) null);

    /* renamed from: i */
    public View.OnAttachStateChangeListener f22209i;

    /* renamed from: j */
    public NativeAdDisplayListener f22210j;

    /* renamed from: k */
    public C12011k7 f22211k;

    /* renamed from: l */
    public final C11868d9.C11869a f22212l = new C5034a();

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$a */
    /* compiled from: Sta */
    public class C5034a implements C11868d9.C11869a {
        public C5034a() {
        }

        public void onSent(String str) {
            NativeAdDetails nativeAdDetails = NativeAdDetails.this;
            boolean z = true;
            nativeAdDetails.f22204d = true;
            if (nativeAdDetails.f22210j == null) {
                z = false;
            }
            C12339t2.m53496a("onShow", z, str, (String) null);
            NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f22210j;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adDisplayed(nativeAdDetails);
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$b */
    /* compiled from: Sta */
    public class C5035b implements C11840d1.C11843b {

        /* renamed from: a */
        public int f22214a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f22215b;

        public C5035b(Runnable runnable) {
            this.f22215b = runnable;
        }

        /* renamed from: a */
        public void mo20798a(Bitmap bitmap, int i) {
            if (i == 0) {
                NativeAdDetails.this.f22202b = bitmap;
            } else {
                NativeAdDetails.this.f22203c = bitmap;
            }
            int i2 = this.f22214a + 1;
            this.f22214a = i2;
            if (i2 == 2) {
                this.f22215b.run();
            }
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$c */
    /* compiled from: Sta */
    public class C5036c implements View.OnClickListener {
        public C5036c() {
        }

        public void onClick(View view) {
            NativeAdDetails.m22988a(NativeAdDetails.this, view);
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$d */
    /* compiled from: Sta */
    public class C5037d implements View.OnClickListener {
        public C5037d() {
        }

        public void onClick(View view) {
            NativeAdDetails.m22988a(NativeAdDetails.this, view);
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$e */
    /* compiled from: Sta */
    public class C5038e implements C12454yc.C12455a {
        public C5038e() {
        }
    }

    /* renamed from: com.startapp.sdk.ads.nativead.NativeAdDetails$f */
    /* compiled from: Sta */
    public static /* synthetic */ class C5039f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22220a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction[] r0 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22220a = r0
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.OPEN_MARKET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22220a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.nativead.StartAppNativeAd$CampaignAction r1 = com.startapp.sdk.ads.nativead.StartAppNativeAd.CampaignAction.LAUNCH_APP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.nativead.NativeAdDetails.C5039f.<clinit>():void");
        }
    }

    public NativeAdDetails(AdDetails adDetails) {
        this.f22201a = adDetails;
    }

    /* renamed from: a */
    public static void m22988a(NativeAdDetails nativeAdDetails, View view) {
        nativeAdDetails.getClass();
        Context context = view.getContext();
        int i = C5039f.f22220a[nativeAdDetails.getCampaignAction().ordinal()];
        if (i == 1) {
            boolean a = C5055a.m23158a(context, AdPreferences.Placement.INAPP_NATIVE);
            if (!nativeAdDetails.f22201a.mo46241A() || a) {
                C5055a.m23149a(context, nativeAdDetails.f22201a.mo46251g(), nativeAdDetails.f22201a.mo46266u(), new TrackingParams(nativeAdDetails.f22206f), nativeAdDetails.f22201a.mo46242B() && !a, false);
            } else {
                C5055a.m23150a(context, nativeAdDetails.f22201a.mo46251g(), nativeAdDetails.f22201a.mo46266u(), nativeAdDetails.f22201a.mo46260p(), new TrackingParams(nativeAdDetails.f22206f), AdsCommonMetaData.f22242h.mo20913z(), AdsCommonMetaData.f22242h.mo20912y(), nativeAdDetails.f22201a.mo46242B(), nativeAdDetails.f22201a.mo46243C(), false, (Runnable) null);
            }
        } else if (i == 2) {
            C5055a.m23153a(nativeAdDetails.getPackageName(), nativeAdDetails.f22201a.mo46256l(), nativeAdDetails.f22201a.mo46251g(), context, new TrackingParams(nativeAdDetails.f22206f));
        }
        NativeAdDisplayListener nativeAdDisplayListener = nativeAdDetails.f22210j;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(nativeAdDetails);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public String getCallToAction() {
        String e;
        AdDetails adDetails = this.f22201a;
        if (adDetails == null || (e = adDetails.mo46249e()) == null) {
            return "";
        }
        return e;
    }

    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.f22201a;
        return (adDetails == null || !adDetails.mo46272z()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    public String getCategory() {
        String f;
        AdDetails adDetails = this.f22201a;
        if (adDetails == null || (f = adDetails.mo46250f()) == null) {
            return "";
        }
        return f;
    }

    public String getDescription() {
        String i;
        AdDetails adDetails = this.f22201a;
        if (adDetails == null || (i = adDetails.mo46253i()) == null) {
            return "";
        }
        return i;
    }

    public Bitmap getImageBitmap() {
        return this.f22202b;
    }

    public String getImageUrl() {
        AdDetails adDetails = this.f22201a;
        if (adDetails != null) {
            return adDetails.mo46254j();
        }
        return null;
    }

    public String getInstalls() {
        String k;
        AdDetails adDetails = this.f22201a;
        if (adDetails == null || (k = adDetails.mo46255k()) == null) {
            return "";
        }
        return k;
    }

    public String getPackageName() {
        String p;
        AdDetails adDetails = this.f22201a;
        if (adDetails == null || (p = adDetails.mo46260p()) == null) {
            return "";
        }
        return p;
    }

    public float getRating() {
        AdDetails adDetails = this.f22201a;
        if (adDetails != null) {
            return adDetails.mo46261q();
        }
        return 5.0f;
    }

    public Bitmap getSecondaryImageBitmap() {
        return this.f22203c;
    }

    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.f22201a;
        if (adDetails != null) {
            return adDetails.mo46262r();
        }
        return null;
    }

    public String getTitle() {
        String t;
        AdDetails adDetails = this.f22201a;
        if (adDetails == null || (t = adDetails.mo46264t()) == null) {
            return "";
        }
        return t;
    }

    public boolean isApp() {
        AdDetails adDetails = this.f22201a;
        if (adDetails != null) {
            return adDetails.mo46271y();
        }
        return true;
    }

    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.f22201a;
        return adDetails != null && adDetails.mo46258n();
    }

    public void loadImages(Context context, Runnable runnable) {
        C5035b bVar = new C5035b(runnable);
        new C11840d1(context, getImageUrl(), bVar, 0).mo45233a();
        new C11840d1(context, getSecondaryImageUrl(), bVar, 1).mo45233a();
    }

    public void registerViewForInteraction(View view) {
        mo20776a(view);
        ((View) this.f22208h.get()).setOnClickListener(new C5036c());
    }

    public String toString() {
        String description = getDescription();
        if (description != null) {
            description = description.substring(0, Math.min(30, description.length()));
        }
        StringBuilder a = C12458z0.m53804a("         Title: [");
        a.append(getTitle());
        a.append("]\n         Description: [");
        a.append(description);
        a.append("]...\n         Rating: [");
        a.append(getRating());
        a.append("]\n         Installs: [");
        a.append(getInstalls());
        a.append("]\n         Category: [");
        a.append(getCategory());
        a.append("]\n         PackageName: [");
        a.append(getPackageName());
        a.append("]\n         CampaginAction: [");
        a.append(getCampaignAction());
        a.append("]\n");
        return a.toString();
    }

    public void unregisterView() {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        C12454yc ycVar = this.f22207g;
        if (ycVar != null) {
            ycVar.mo46839a();
            this.f22207g = null;
        }
        View view = (View) this.f22208h.get();
        this.f22208h.clear();
        if (!(view == null || Build.VERSION.SDK_INT < 12 || (onAttachStateChangeListener = this.f22209i) == null)) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        Bitmap bitmap = this.f22202b;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22202b = null;
        }
        Bitmap bitmap2 = this.f22203c;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f22203c = null;
        }
    }

    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, (NativeAdDisplayListener) null);
    }

    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list == null || list.isEmpty() || this.f22208h.get() != null) {
            registerViewForInteraction(view);
        } else {
            C5037d dVar = new C5037d();
            for (View onClickListener : list) {
                onClickListener.setOnClickListener(dVar);
            }
            mo20776a(view);
        }
        this.f22210j = nativeAdDisplayListener;
    }

    /* renamed from: a */
    public final void mo20776a(View view) {
        this.f22208h = new WeakReference<>(view);
        if (view.hasWindowFocus() || Build.VERSION.SDK_INT < 12) {
            mo20775a();
            return;
        }
        if (this.f22209i == null) {
            this.f22209i = new C12448y6(this);
        }
        view.addOnAttachStateChangeListener(this.f22209i);
    }

    /* renamed from: a */
    public final void mo20775a() {
        long j;
        if (this.f22207g == null && !this.f22204d) {
            View view = (View) this.f22208h.get();
            if (view == null) {
                NativeAdDisplayListener nativeAdDisplayListener = this.f22210j;
                if (nativeAdDisplayListener != null) {
                    nativeAdDisplayListener.adNotDisplayed(this);
                    return;
                }
                return;
            }
            Context context = view.getContext();
            String[] w = this.f22201a.mo46268w();
            TrackingParams trackingParams = new TrackingParams(this.f22206f);
            if (this.f22201a.mo46252h() != null) {
                j = TimeUnit.SECONDS.toMillis(this.f22201a.mo46252h().longValue());
            } else {
                j = TimeUnit.SECONDS.toMillis(MetaData.f22407k.mo21203o());
            }
            C11868d9 d9Var = new C11868d9(context, w, trackingParams, j);
            d9Var.f52868j = new WeakReference<>(this.f22212l);
            C12454yc ycVar = new C12454yc(this.f22208h, d9Var, BannerMetaData.f54159b.mo45773a());
            this.f22207g = ycVar;
            ycVar.f55176c = new C5038e();
            if (ycVar.mo46840b()) {
                ycVar.run();
            }
        }
    }
}
