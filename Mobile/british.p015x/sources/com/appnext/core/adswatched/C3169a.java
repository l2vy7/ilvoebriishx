package com.appnext.core.adswatched;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.C3117a;
import com.appnext.core.adswatched.database.AdWatched;
import com.appnext.core.adswatched.database.AdWatchedDatabase;
import com.appnext.core.p035ra.services.C3235a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appnext.core.adswatched.a */
public final class C3169a {

    /* renamed from: eu */
    private static C3169a f12277eu;

    /* renamed from: aM */
    private Context f12278aM;

    private C3169a(Context context) {
        this.f12278aM = context.getApplicationContext();
    }

    /* renamed from: o */
    public static C3169a m10687o(Context context) {
        if (f12277eu == null) {
            synchronized (C3235a.class) {
                if (f12277eu == null) {
                    f12277eu = new C3169a(context);
                }
            }
        }
        return f12277eu;
    }

    /* renamed from: B */
    public final List<String> mo10752B(String str) {
        try {
            List<String> C = AdWatchedDatabase.getInstance(this.f12278aM).adWatchedDao().mo10757C(str);
            C.toString();
            return C;
        } catch (Throwable th) {
            C3117a.m10553a("AdsWatchedManager$getAdsWatchedIdsByPlacement", th);
            return new ArrayList();
        }
    }

    /* renamed from: k */
    public final void mo10753k(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                AdWatched adWatched = new AdWatched();
                adWatched.bannerId = str;
                adWatched.auid = str2;
                adWatched.toString();
                AdWatchedDatabase.getInstance(this.f12278aM).adWatchedDao().mo10759a(adWatched);
            }
        } catch (Throwable th) {
            C3117a.m10553a("AdsWatchedManager$setBannerWatched", th);
        }
    }

    /* renamed from: l */
    public final void mo10754l(String str, String str2) {
        try {
            AdWatchedDatabase.getInstance(this.f12278aM).adWatchedDao().mo10758D(str2);
        } catch (Throwable unused) {
        }
    }
}
