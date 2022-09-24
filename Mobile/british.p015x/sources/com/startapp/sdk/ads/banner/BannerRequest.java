package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.C5041Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class BannerRequest {
    private BannerFormat adFormat = BannerFormat.BANNER;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final Context context;

    /* compiled from: Sta */
    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$a */
    /* compiled from: Sta */
    public class C12188a implements AdEventListener {

        /* renamed from: a */
        public final /* synthetic */ Callback f54160a;

        /* renamed from: b */
        public final /* synthetic */ BannerFormat f54161b;

        /* renamed from: c */
        public final /* synthetic */ AdPreferences f54162c;

        /* renamed from: d */
        public final /* synthetic */ BannerStandardAd f54163d;

        /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$a$a */
        /* compiled from: Sta */
        public class C12189a implements BannerCreator {

            /* renamed from: a */
            public boolean f54164a;

            public C12189a() {
            }

            public View create(Context context, BannerListener bannerListener) {
                BannerStandard bannerStandard;
                if (!this.f54164a) {
                    int i = C12190b.f54166a[C12188a.this.f54161b.ordinal()];
                    if (i == 1) {
                        C12188a aVar = C12188a.this;
                        bannerStandard = new Mrec(context, false, aVar.f54162c, aVar.f54163d);
                    } else if (i != 2) {
                        C12188a aVar2 = C12188a.this;
                        bannerStandard = new Banner(context, false, aVar2.f54162c, aVar2.f54163d);
                    } else {
                        C12188a aVar3 = C12188a.this;
                        bannerStandard = new Cover(context, false, aVar3.f54162c, aVar3.f54163d);
                    }
                    bannerStandard.setBannerListener(bannerListener);
                    bannerStandard.onReceiveAd(C12188a.this.f54163d);
                    this.f54164a = true;
                    return bannerStandard;
                }
                throw new IllegalStateException();
            }
        }

        public C12188a(BannerRequest bannerRequest, Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
            this.f54160a = callback;
            this.f54161b = bannerFormat;
            this.f54162c = adPreferences;
            this.f54163d = bannerStandardAd;
        }

        public void onFailedToReceiveAd(C5041Ad ad) {
            this.f54160a.onFinished((BannerCreator) null, String.valueOf(this.f54163d.getErrorMessage()));
        }

        public void onReceiveAd(C5041Ad ad) {
            this.f54160a.onFinished(new C12189a(), (String) null);
        }
    }

    /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$b */
    /* compiled from: Sta */
    public static /* synthetic */ class C12190b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54166a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.startapp.sdk.ads.banner.BannerFormat[] r0 = com.startapp.sdk.ads.banner.BannerFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54166a = r0
                com.startapp.sdk.ads.banner.BannerFormat r1 = com.startapp.sdk.ads.banner.BannerFormat.MREC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54166a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.ads.banner.BannerFormat r1 = com.startapp.sdk.ads.banner.BannerFormat.COVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.banner.BannerRequest.C12190b.<clinit>():void");
        }
    }

    public BannerRequest(Context context2) {
        this.context = context2.getApplicationContext();
    }

    public void load(Callback callback) {
        int i;
        int i2;
        AdPreferences adPreferences2 = this.adPreferences;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        BannerStandardAd bannerStandardAd = new BannerStandardAd(this.context, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point point = this.adSizeDp;
        if (point != null) {
            i = point.x;
            i2 = point.y;
        } else {
            i = bannerFormat.widthDp;
            i2 = bannerFormat.heightDp;
        }
        bannerStandardAd.mo45850c(bannerFormat.type);
        bannerStandardAd.mo20919a(i, i2);
        bannerStandardAd.load(adPreferences2, new C12188a(this, callback, bannerFormat, adPreferences2, bannerStandardAd), true);
    }

    public BannerRequest setAdFormat(BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    public BannerRequest setAdPreferences(AdPreferences adPreferences2) {
        this.adPreferences = adPreferences2;
        return this;
    }

    public BannerRequest setAdSize(int i, int i2) {
        this.adSizeDp = new Point(i, i2);
        return this;
    }
}
