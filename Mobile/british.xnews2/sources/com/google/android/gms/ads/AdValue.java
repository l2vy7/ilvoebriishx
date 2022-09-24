package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdValue {

    /* renamed from: a */
    private final int f27733a;

    /* renamed from: b */
    private final String f27734b;

    /* renamed from: c */
    private final long f27735c;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, String str, long j) {
        this.f27733a = i;
        this.f27734b = str;
        this.f27735c = j;
    }

    @RecentlyNonNull
    public static AdValue zza(int i, @RecentlyNonNull String str, long j) {
        return new AdValue(i, str, j);
    }

    @RecentlyNonNull
    public String getCurrencyCode() {
        return this.f27734b;
    }

    public int getPrecisionType() {
        return this.f27733a;
    }

    public long getValueMicros() {
        return this.f27735c;
    }
}
