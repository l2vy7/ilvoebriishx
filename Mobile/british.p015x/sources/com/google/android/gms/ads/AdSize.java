package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.android.gms.internal.ads.C8241uv;
import com.google.android.gms.internal.ads.co0;
import com.google.android.gms.internal.ads.vn0;
import com.google.android.gms.internal.ads.zzbfi;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    @RecentlyNonNull
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    @RecentlyNonNull
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    @RecentlyNonNull
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final int FULL_WIDTH = -1;
    @RecentlyNonNull
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    @RecentlyNonNull
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    @RecentlyNonNull
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    @RecentlyNonNull
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "300x250_as");
    @RecentlyNonNull
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
    @RecentlyNonNull
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    @RecentlyNonNull
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED, "160x600_as");
    @RecentlyNonNull
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");

    /* renamed from: a */
    private final int f19845a;

    /* renamed from: b */
    private final int f19846b;

    /* renamed from: c */
    private final String f19847c;

    /* renamed from: d */
    private boolean f19848d;

    /* renamed from: e */
    private boolean f19849e;

    /* renamed from: f */
    private int f19850f;

    /* renamed from: g */
    private boolean f19851g;

    /* renamed from: h */
    private int f19852h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AdSize(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L_0x0006
            java.lang.String r0 = "FULL"
            goto L_0x000a
        L_0x0006:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        L_0x000a:
            r1 = -2
            if (r7 != r1) goto L_0x0010
            java.lang.String r1 = "AUTO"
            goto L_0x0014
        L_0x0010:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L_0x0014:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 4
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "_as"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i) {
        AdSize c = vn0.m38847c(context, i, 50, 0);
        c.f19848d = true;
        return c;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i) {
        int a = vn0.m38846a(context, 0);
        if (a == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f19850f = a;
        adSize.f19849e = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getCurrentOrientationInterscrollerAdSize(@RecentlyNonNull Context context, int i) {
        return m19800j(i, vn0.m38846a(context, 0));
    }

    @RecentlyNonNull
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.f19850f = i2;
        adSize.f19849e = true;
        if (i2 < 32) {
            StringBuilder sb = new StringBuilder(TsExtractor.TS_STREAM_TYPE_AC3);
            sb.append("The maximum height set for the inline adaptive ad size was ");
            sb.append(i2);
            sb.append(" dp, which is below the minimum recommended value of 32 dp.");
            co0.zzj(sb.toString());
        }
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i) {
        AdSize c = vn0.m38847c(context, i, 50, 2);
        c.f19848d = true;
        return c;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i) {
        int a = vn0.m38846a(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (a == -1) {
            return INVALID;
        }
        adSize.f19850f = a;
        adSize.f19849e = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getLandscapeInterscrollerAdSize(@RecentlyNonNull Context context, int i) {
        return m19800j(i, vn0.m38846a(context, 2));
    }

    @RecentlyNonNull
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i) {
        AdSize c = vn0.m38847c(context, i, 50, 1);
        c.f19848d = true;
        return c;
    }

    @RecentlyNonNull
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@RecentlyNonNull Context context, int i) {
        int a = vn0.m38846a(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (a == -1) {
            return INVALID;
        }
        adSize.f19850f = a;
        adSize.f19849e = true;
        return adSize;
    }

    @RecentlyNonNull
    public static AdSize getPortraitInterscrollerAdSize(@RecentlyNonNull Context context, int i) {
        return m19800j(i, vn0.m38846a(context, 1));
    }

    /* renamed from: j */
    private static AdSize m19800j(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.f19852h = i2;
        adSize.f19851g = true;
        return adSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo17580a() {
        return this.f19852h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo17581b() {
        return this.f19850f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo17582c(int i) {
        this.f19850f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo17583d(int i) {
        this.f19852h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo17584e(boolean z) {
        this.f19849e = true;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f19845a == adSize.f19845a && this.f19846b == adSize.f19846b && this.f19847c.equals(adSize.f19847c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo17586f(boolean z) {
        this.f19851g = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo17587g() {
        return this.f19848d;
    }

    public int getHeight() {
        return this.f19846b;
    }

    public int getHeightInPixels(@RecentlyNonNull Context context) {
        int i = this.f19846b;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzbfi.m40641C0(context.getResources().getDisplayMetrics());
        }
        C8241uv.m38463b();
        return vn0.m38860s(context, this.f19846b);
    }

    public int getWidth() {
        return this.f19845a;
    }

    public int getWidthInPixels(@RecentlyNonNull Context context) {
        int i = this.f19845a;
        if (i == -3) {
            return -1;
        }
        if (i != -1) {
            C8241uv.m38463b();
            return vn0.m38860s(context, this.f19845a);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<zzbfi> creator = zzbfi.CREATOR;
        return displayMetrics.widthPixels;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo17592h() {
        return this.f19849e;
    }

    public int hashCode() {
        return this.f19847c.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo17594i() {
        return this.f19851g;
    }

    public boolean isAutoHeight() {
        return this.f19846b == -2;
    }

    public boolean isFluid() {
        return this.f19845a == -3 && this.f19846b == -4;
    }

    public boolean isFullWidth() {
        return this.f19845a == -1;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f19847c;
    }

    AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f19845a = i;
            this.f19846b = i2;
            this.f19847c = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
