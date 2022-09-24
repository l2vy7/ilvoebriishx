package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.ads.C4618oy;
import com.google.android.gms.internal.ads.C7995ny;
import com.google.android.gms.internal.ads.co0;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class AdRequest {
    @RecentlyNonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* renamed from: a */
    protected final C4618oy f19843a;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static class Builder {

        /* renamed from: a */
        protected final C7995ny f19844a;

        public Builder() {
            C7995ny nyVar = new C7995ny();
            this.f19844a = nyVar;
            nyVar.mo33798J("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        public Builder addCustomEventExtrasBundle(@RecentlyNonNull Class<? extends CustomEvent> cls, @RecentlyNonNull Bundle bundle) {
            this.f19844a.mo33793E(cls, bundle);
            return this;
        }

        @RecentlyNonNull
        public Builder addKeyword(@RecentlyNonNull String str) {
            this.f19844a.mo33795G(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder addNetworkExtras(@RecentlyNonNull NetworkExtras networkExtras) {
            this.f19844a.mo33797I(networkExtras);
            return this;
        }

        @RecentlyNonNull
        public Builder addNetworkExtrasBundle(@RecentlyNonNull Class<? extends MediationExtrasReceiver> cls, @RecentlyNonNull Bundle bundle) {
            this.f19844a.mo33796H(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f19844a.mo33799K("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @RecentlyNonNull
        public AdRequest build() {
            return new AdRequest(this);
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setAdInfo(@RecentlyNonNull AdInfo adInfo) {
            this.f19844a.mo33800L(adInfo);
            return this;
        }

        @RecentlyNonNull
        public Builder setAdString(@RecentlyNonNull String str) {
            this.f19844a.mo33801a(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setContentUrl(@RecentlyNonNull String str) {
            C4604n.m20099l(str, "Content URL must be non-null.");
            C4604n.m20095h(str, "Content URL must be non-empty.");
            C4604n.m20090c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f19844a.mo33803c(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setHttpTimeoutMillis(int i) {
            this.f19844a.mo33805e(i);
            return this;
        }

        @RecentlyNonNull
        public Builder setLocation(@RecentlyNonNull Location location) {
            this.f19844a.mo33807g(location);
            return this;
        }

        @RecentlyNonNull
        public Builder setNeighboringContentUrls(@RecentlyNonNull List<String> list) {
            if (list == null) {
                co0.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.f19844a.mo33808h(list);
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestAgent(@RecentlyNonNull String str) {
            this.f19844a.mo33810j(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zza(@RecentlyNonNull String str) {
            this.f19844a.mo33798J(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zzb(@RecentlyNonNull Date date) {
            this.f19844a.mo33802b(date);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zzc(int i) {
            this.f19844a.mo33804d(i);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zzd(boolean z) {
            this.f19844a.mo33806f(z);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zze(boolean z) {
            this.f19844a.mo33811k(z);
            return this;
        }
    }

    protected AdRequest(@RecentlyNonNull Builder builder) {
        this.f19843a = new C4618oy(builder.f19844a, (SearchAdRequest) null);
    }

    @RecentlyNonNull
    public String getContentUrl() {
        return this.f19843a.mo18632m();
    }

    @RecentlyNullable
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@RecentlyNonNull Class<T> cls) {
        return this.f19843a.mo18624e(cls);
    }

    @RecentlyNonNull
    public Bundle getCustomTargeting() {
        return this.f19843a.mo18625f();
    }

    @RecentlyNonNull
    public Set<String> getKeywords() {
        return this.f19843a.mo18639t();
    }

    @RecentlyNonNull
    public Location getLocation() {
        return this.f19843a.mo18623d();
    }

    @RecentlyNonNull
    public List<String> getNeighboringContentUrls() {
        return this.f19843a.mo18636q();
    }

    @RecentlyNullable
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@RecentlyNonNull Class<T> cls) {
        return this.f19843a.mo18626g(cls);
    }

    public boolean isTestDevice(@RecentlyNonNull Context context) {
        return this.f19843a.mo18641v(context);
    }

    public C4618oy zza() {
        return this.f19843a;
    }
}
