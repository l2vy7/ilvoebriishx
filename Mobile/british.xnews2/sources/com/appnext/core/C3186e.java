package com.appnext.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.appnext.core.adswatched.C3169a;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;

/* renamed from: com.appnext.core.e */
public class C3186e {

    /* renamed from: cV */
    private static volatile C3186e f12317cV;

    /* renamed from: a */
    public static String m10747a(Context context, String str, String str2, long j, String str3, String str4, String str5) {
        String str6;
        String str7 = str2;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String str8 = "adsServerResponseAuid" + str7;
        String str9 = "adsServerResponseAcceptedTimeAuid" + str7;
        if (!TextUtils.isEmpty(str4.trim()) || !TextUtils.isEmpty(str5.trim()) || System.currentTimeMillis() >= C3209m.m10816l(context).mo10816a(str9, 0) + (60000 * j)) {
            str6 = "";
        } else {
            str6 = C3209m.m10816l(context).mo10819d(str8, (String) null);
        }
        if (TextUtils.isEmpty(str6)) {
            try {
                if (TextUtils.isEmpty(str4.trim()) && TextUtils.isEmpty(str5.trim())) {
                    String str10 = str;
                    C3169a.m10687o(context).mo10754l(str, str7);
                }
                Context context2 = context;
                str6 = C3198g.m10775a(context, str3, (ArrayList<Pair<String, String>>) null, (int) AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND);
                if (TextUtils.isEmpty(str4.trim()) && TextUtils.isEmpty(str5.trim())) {
                    if (TextUtils.isEmpty(str6) || str6.equals("{\"apps\":[]}")) {
                        C3209m.m10816l(context).mo10820e(str8, "");
                        C3209m.m10816l(context).mo10818b(str9, 0);
                    } else {
                        C3209m.m10816l(context).mo10820e(str8, str6);
                        C3209m.m10816l(context).mo10818b(str9, System.currentTimeMillis());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str6;
    }

    /* renamed from: ap */
    public static C3186e m10748ap() {
        if (f12317cV == null) {
            synchronized (C3186e.class) {
                if (f12317cV == null) {
                    f12317cV = new C3186e();
                }
            }
        }
        return f12317cV;
    }
}
