package com.startapp.sdk.adsbase.cache;

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
public class CacheMetaData implements Serializable {

    /* renamed from: a */
    public static volatile CacheMetaData f22345a = new CacheMetaData();
    private static final long serialVersionUID = -5733696220222242321L;
    @C5010hb(complex = true)
    private ACMConfig ACM = new ACMConfig();
    private String cacheMetaDataUpdateVersion = "4.10.2";
    private float sendCacheSizeProb = 20.0f;

    /* renamed from: b */
    public static CacheMetaData m23190b() {
        return f22345a;
    }

    /* renamed from: a */
    public ACMConfig mo21039a() {
        return this.ACM;
    }

    /* renamed from: c */
    public float mo21040c() {
        return this.sendCacheSizeProb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheMetaData cacheMetaData = (CacheMetaData) obj;
        if (Float.compare(cacheMetaData.sendCacheSizeProb, this.sendCacheSizeProb) != 0 || !C5015nb.m22922a(this.ACM, cacheMetaData.ACM) || !C5015nb.m22922a(this.cacheMetaDataUpdateVersion, cacheMetaData.cacheMetaDataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.ACM, Float.valueOf(this.sendCacheSizeProb), this.cacheMetaDataUpdateVersion};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m23189a(Context context, CacheMetaData cacheMetaData) {
        cacheMetaData.cacheMetaDataUpdateVersion = "4.10.2";
        f22345a = cacheMetaData;
        C5126w2.m23389a(context, "StartappCacheMetadata", (Serializable) cacheMetaData);
    }

    /* renamed from: a */
    public static void m23188a(Context context) {
        CacheMetaData cacheMetaData = (CacheMetaData) C5126w2.m23386a(context, "StartappCacheMetadata", CacheMetaData.class);
        CacheMetaData cacheMetaData2 = new CacheMetaData();
        if (cacheMetaData != null) {
            boolean b = C5015nb.m22930b(cacheMetaData, cacheMetaData2);
            if (!(!"4.10.2".equals(cacheMetaData.cacheMetaDataUpdateVersion)) && b) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "metadata_null";
                d4Var.mo20661a();
            }
            f22345a = cacheMetaData;
            return;
        }
        f22345a = cacheMetaData2;
    }
}
