package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.C8348xw;
import com.google.android.gms.internal.ads.C8385yw;
import com.google.android.gms.internal.ads.h50;
import com.google.android.gms.internal.ads.i50;
import p257v4.C11058b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();

    /* renamed from: b */
    private final boolean f27769b;

    /* renamed from: c */
    private final C8385yw f27770c;

    /* renamed from: d */
    private final IBinder f27771d;

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class Builder {

        /* renamed from: a */
        private ShouldDelayBannerRenderingListener f27772a;

        @RecentlyNonNull
        public Builder setShouldDelayBannerRenderingListener(@RecentlyNonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.f27772a = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f27769b = z;
        this.f27770c = iBinder != null ? C8348xw.m39619n6(iBinder) : null;
        this.f27771d = iBinder2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = C11058b.m49515a(parcel);
        C11058b.m49517c(parcel, 1, this.f27769b);
        C8385yw ywVar = this.f27770c;
        if (ywVar == null) {
            iBinder = null;
        } else {
            iBinder = ywVar.asBinder();
        }
        C11058b.m49526l(parcel, 2, iBinder, false);
        C11058b.m49526l(parcel, 3, this.f27771d, false);
        C11058b.m49516b(parcel, a);
    }

    public final C8385yw zza() {
        return this.f27770c;
    }

    public final i50 zzb() {
        IBinder iBinder = this.f27771d;
        if (iBinder == null) {
            return null;
        }
        return h50.m32815n6(iBinder);
    }

    public final boolean zzc() {
        return this.f27769b;
    }
}
