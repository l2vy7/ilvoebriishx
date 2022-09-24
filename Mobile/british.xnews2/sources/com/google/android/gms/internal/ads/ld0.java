package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class ld0 implements MediationAdRequest {

    /* renamed from: a */
    private final Date f34995a;

    /* renamed from: b */
    private final int f34996b;

    /* renamed from: c */
    private final Set<String> f34997c;

    /* renamed from: d */
    private final boolean f34998d;

    /* renamed from: e */
    private final Location f34999e;

    /* renamed from: f */
    private final int f35000f;

    /* renamed from: g */
    private final boolean f35001g;

    /* renamed from: h */
    private final String f35002h;

    public ld0(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f34995a = date;
        this.f34996b = i;
        this.f34997c = set;
        this.f34999e = location;
        this.f34998d = z;
        this.f35000f = i2;
        this.f35001g = z2;
        this.f35002h = str;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f34995a;
    }

    @Deprecated
    public final int getGender() {
        return this.f34996b;
    }

    public final Set<String> getKeywords() {
        return this.f34997c;
    }

    public final Location getLocation() {
        return this.f34999e;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f35001g;
    }

    public final boolean isTesting() {
        return this.f34998d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f35000f;
    }
}
