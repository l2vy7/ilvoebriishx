package p130p3;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

@Deprecated
/* renamed from: p3.c */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5904c {
    @RecentlyNonNull

    /* renamed from: b */
    public static final C5904c f24746b = new C5904c(-1, -2, "mb");
    @RecentlyNonNull

    /* renamed from: c */
    public static final C5904c f24747c = new C5904c(320, 50, "mb");
    @RecentlyNonNull

    /* renamed from: d */
    public static final C5904c f24748d = new C5904c(300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "as");
    @RecentlyNonNull

    /* renamed from: e */
    public static final C5904c f24749e = new C5904c(468, 60, "as");
    @RecentlyNonNull

    /* renamed from: f */
    public static final C5904c f24750f = new C5904c(728, 90, "as");
    @RecentlyNonNull

    /* renamed from: g */
    public static final C5904c f24751g = new C5904c(160, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED, "as");

    /* renamed from: a */
    private final AdSize f24752a;

    private C5904c(int i, int i2, String str) {
        this(new AdSize(i, i2));
    }

    public C5904c(@RecentlyNonNull AdSize adSize) {
        this.f24752a = adSize;
    }

    /* renamed from: a */
    public int mo22886a() {
        return this.f24752a.getHeight();
    }

    /* renamed from: b */
    public int mo22887b() {
        return this.f24752a.getWidth();
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof C5904c)) {
            return false;
        }
        return this.f24752a.equals(((C5904c) obj).f24752a);
    }

    public int hashCode() {
        return this.f24752a.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f24752a.toString();
    }
}
