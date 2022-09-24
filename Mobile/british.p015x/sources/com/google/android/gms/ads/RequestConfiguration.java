package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.co0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class RequestConfiguration {
    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    @RecentlyNonNull
    public static final List<String> zza = Arrays.asList(new String[]{MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G});

    /* renamed from: a */
    private final int f19854a;

    /* renamed from: b */
    private final int f19855b;
    @Nullable

    /* renamed from: c */
    private final String f19856c;

    /* renamed from: d */
    private final List<String> f19857d;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static class Builder {

        /* renamed from: a */
        private int f19858a = -1;

        /* renamed from: b */
        private int f19859b = -1;
        @Nullable

        /* renamed from: c */
        private String f19860c = null;

        /* renamed from: d */
        private final List<String> f19861d = new ArrayList();

        @RecentlyNonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.f19858a, this.f19859b, this.f19860c, this.f19861d, (zzc) null);
        }

        @RecentlyNonNull
        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str == null || "".equals(str)) {
                this.f19860c = null;
            } else if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.f19860c = str;
            } else {
                co0.zzj(str.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(str) : new String("Invalid value passed to setMaxAdContentRating: "));
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f19858a = i;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i);
                co0.zzj(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.f19859b = i;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i);
                co0.zzj(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.f19861d.clear();
            if (list != null) {
                this.f19861d.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface MaxAdContentRating {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, zzc zzc) {
        this.f19854a = i;
        this.f19855b = i2;
        this.f19856c = str;
        this.f19857d = list;
    }

    @RecentlyNonNull
    public String getMaxAdContentRating() {
        String str = this.f19856c;
        return str == null ? "" : str;
    }

    public int getTagForChildDirectedTreatment() {
        return this.f19854a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.f19855b;
    }

    @RecentlyNonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f19857d);
    }

    @RecentlyNonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.f19854a);
        builder.setTagForUnderAgeOfConsent(this.f19855b);
        builder.setMaxAdContentRating(this.f19856c);
        builder.setTestDeviceIds(this.f19857d);
        return builder;
    }
}
