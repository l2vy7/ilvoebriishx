package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbak> CREATOR = new C8199tp();

    /* renamed from: b */
    public final String f42923b;

    /* renamed from: c */
    public final long f42924c;

    /* renamed from: d */
    public final String f42925d;

    /* renamed from: e */
    public final String f42926e;

    /* renamed from: f */
    public final String f42927f;

    /* renamed from: g */
    public final Bundle f42928g;

    /* renamed from: h */
    public final boolean f42929h;

    /* renamed from: i */
    public long f42930i;

    /* renamed from: j */
    public String f42931j;

    /* renamed from: k */
    public int f42932k;

    zzbak(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.f42923b = str;
        this.f42924c = j;
        this.f42925d = str2 == null ? "" : str2;
        this.f42926e = str3 == null ? "" : str3;
        this.f42927f = str4 == null ? "" : str4;
        this.f42928g = bundle == null ? new Bundle() : bundle;
        this.f42929h = z;
        this.f42930i = j2;
        this.f42931j = str5;
        this.f42932k = i;
    }

    /* renamed from: C0 */
    public static zzbak m40638C0(Uri uri) {
        long parseLong;
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                co0.zzj(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new zzbak(queryParameter, j, host, str, str2, bundle, equals, 0, "", 0);
        } catch (NullPointerException | NumberFormatException e) {
            co0.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49537w(parcel, 2, this.f42923b, false);
        C11058b.m49531q(parcel, 3, this.f42924c);
        C11058b.m49537w(parcel, 4, this.f42925d, false);
        C11058b.m49537w(parcel, 5, this.f42926e, false);
        C11058b.m49537w(parcel, 6, this.f42927f, false);
        C11058b.m49519e(parcel, 7, this.f42928g, false);
        C11058b.m49517c(parcel, 8, this.f42929h);
        C11058b.m49531q(parcel, 9, this.f42930i);
        C11058b.m49537w(parcel, 10, this.f42931j, false);
        C11058b.m49527m(parcel, 11, this.f42932k);
        C11058b.m49516b(parcel, a);
    }
}
