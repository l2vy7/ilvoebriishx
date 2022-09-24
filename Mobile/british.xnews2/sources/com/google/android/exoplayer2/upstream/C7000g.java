package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import p148s6.C10995b;
import p148s6.C6074l;

/* renamed from: com.google.android.exoplayer2.upstream.g */
/* compiled from: HttpDataSource */
public final /* synthetic */ class C7000g {
    static {
        C6074l<String> lVar = HttpDataSource.REJECT_PAYWALL_TYPES;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m28731b(String str) {
        if (str == null) {
            return false;
        }
        String e = C10995b.m49338e(str);
        if (TextUtils.isEmpty(e)) {
            return false;
        }
        if ((!e.contains("text") || e.contains(MimeTypes.TEXT_VTT)) && !e.contains("html") && !e.contains("xml")) {
            return true;
        }
        return false;
    }
}
