package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import com.startapp.C11882e4;
import com.startapp.C5004d4;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import com.startapp.C5126w2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class BannerMetaData implements Serializable {

    /* renamed from: a */
    public static Object f54158a = new Object();

    /* renamed from: b */
    public static volatile BannerMetaData f54159b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;
    @C5010hb(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "4.10.2";

    /* renamed from: a */
    public BannerOptions mo45773a() {
        return this.BannerOptions;
    }

    /* renamed from: b */
    public BannerOptions mo45774b() {
        return new BannerOptions(this.BannerOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerMetaData bannerMetaData = (BannerMetaData) obj;
        if (!C5015nb.m22922a(this.BannerOptions, bannerMetaData.BannerOptions) || !C5015nb.m22922a(this.bannerMetadataUpdateVersion, bannerMetaData.bannerMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m52841a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f54158a) {
            bannerMetaData.bannerMetadataUpdateVersion = "4.10.2";
            f54159b = bannerMetaData;
            C5126w2.m23389a(context, "StartappBannerMetadata", (Serializable) bannerMetaData);
        }
    }

    /* renamed from: a */
    public static void m52840a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) C5126w2.m23386a(context, "StartappBannerMetadata", BannerMetaData.class);
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean b = C5015nb.m22930b(bannerMetaData, bannerMetaData2);
            if (!(!"4.10.2".equals(bannerMetaData.bannerMetadataUpdateVersion)) && b) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "metadata_null";
                d4Var.mo20661a();
            }
            f54159b = bannerMetaData;
            return;
        }
        f54159b = bannerMetaData2;
    }
}
