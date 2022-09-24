package com.startapp.sdk.ads.splash;

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
public class SplashMetaData implements Serializable {

    /* renamed from: a */
    public static volatile SplashMetaData f54294a = new SplashMetaData();

    /* renamed from: b */
    public static Object f54295b = new Object();
    private static final long serialVersionUID = 5949259263399692883L;
    @C5010hb(complex = true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = "4.10.2";

    /* renamed from: a */
    public SplashConfig mo45954a() {
        return this.SplashConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashMetaData splashMetaData = (SplashMetaData) obj;
        if (!C5015nb.m22922a(this.SplashConfig, splashMetaData.SplashConfig) || !C5015nb.m22922a(this.splashMetadataUpdateVersion, splashMetaData.splashMetadataUpdateVersion)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.SplashConfig, this.splashMetadataUpdateVersion};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public static void m52957a(Context context, SplashMetaData splashMetaData) {
        synchronized (f54295b) {
            splashMetaData.splashMetadataUpdateVersion = "4.10.2";
            f54294a = splashMetaData;
            C5126w2.m23389a(context, "StartappSplashMetadata", (Serializable) splashMetaData);
        }
    }

    /* renamed from: a */
    public static void m52956a(Context context) {
        SplashMetaData splashMetaData = (SplashMetaData) C5126w2.m23386a(context, "StartappSplashMetadata", SplashMetaData.class);
        SplashMetaData splashMetaData2 = new SplashMetaData();
        if (splashMetaData != null) {
            boolean b = C5015nb.m22930b(splashMetaData, splashMetaData2);
            if (!(!"4.10.2".equals(splashMetaData.splashMetadataUpdateVersion)) && b) {
                C5004d4 d4Var = new C5004d4(C11882e4.f52886e);
                d4Var.f22126d = "metadata_null";
                d4Var.mo20661a();
            }
            f54294a = splashMetaData;
            return;
        }
        f54294a = splashMetaData2;
    }
}
