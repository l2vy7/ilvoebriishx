package com.appnext.core.p034ra.p035a;

import android.content.Context;
import android.os.Bundle;
import com.appnext.core.p034ra.services.C3235a;

/* renamed from: com.appnext.core.ra.a.c */
public final class C3223c {

    /* renamed from: com.appnext.core.ra.a.c$1 */
    static /* synthetic */ class C32241 {

        /* renamed from: eP */
        static final /* synthetic */ int[] f12405eP;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.appnext.core.ra.services.a$a[] r0 = com.appnext.core.p034ra.services.C3235a.C3236a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12405eP = r0
                com.appnext.core.ra.services.a$a r1 = com.appnext.core.p034ra.services.C3235a.C3236a.SendRA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12405eP     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appnext.core.ra.services.a$a r1 = com.appnext.core.p034ra.services.C3235a.C3236a.StoreRa     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12405eP     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appnext.core.ra.services.a$a r1 = com.appnext.core.p034ra.services.C3235a.C3236a.DownloadingConfig     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.p034ra.p035a.C3223c.C32241.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C3222b m10865a(Context context, C3235a.C3236a aVar, Bundle bundle) {
        int i = C32241.f12405eP[aVar.ordinal()];
        if (i == 1) {
            return new C3225d(context, bundle);
        }
        if (i == 2) {
            return new C3226e(context, bundle);
        }
        if (i != 3) {
            return null;
        }
        return new C3221a(context, bundle);
    }
}
