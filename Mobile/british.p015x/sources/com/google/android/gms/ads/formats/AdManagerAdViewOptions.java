package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.C8245uz;
import com.google.android.gms.internal.ads.h50;
import com.google.android.gms.internal.ads.i50;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();

    /* renamed from: b */
    private final boolean f27749b;

    /* renamed from: c */
    private final IBinder f27750c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f27751a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ShouldDelayBannerRenderingListener f27752b;

        @RecentlyNonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        @RecentlyNonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.f27751a = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setShouldDelayBannerRenderingListener(@RecentlyNonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.f27752b = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzb) {
        this.f27749b = builder.f27751a;
        this.f27750c = builder.f27752b != null ? new C8245uz(builder.f27752b) : null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f27749b;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, getManualImpressionsEnabled());
        C11058b.m49526l(parcel, 2, this.f27750c, false);
        C11058b.m49516b(parcel, a);
    }

    public final i50 zza() {
        IBinder iBinder = this.f27750c;
        if (iBinder == null) {
            return null;
        }
        return h50.m32815n6(iBinder);
    }

    AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.f27749b = z;
        this.f27750c = iBinder;
    }
}
