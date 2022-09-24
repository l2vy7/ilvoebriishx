package p231m5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: m5.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10800d {

    /* renamed from: a */
    public static final int f49531a;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L_0x0029;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r2 = 0
            r3 = 31
            if (r0 < r3) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            r3 = 30
            if (r0 < r3) goto L_0x0028
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r3 = r0.length()
            r4 = 1
            if (r3 != r4) goto L_0x0028
            char r3 = r0.charAt(r2)
            r4 = 83
            if (r3 < r4) goto L_0x0028
            char r0 = r0.charAt(r2)
            r3 = 90
            if (r0 > r3) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            f49531a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231m5.C10800d.<clinit>():void");
    }

    /* renamed from: a */
    public static PendingIntent m48743a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}
