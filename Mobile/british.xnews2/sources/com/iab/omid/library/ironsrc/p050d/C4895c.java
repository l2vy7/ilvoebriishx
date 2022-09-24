package com.iab.omid.library.ironsrc.p050d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.ironsrc.C4870a;

/* renamed from: com.iab.omid.library.ironsrc.d.c */
public final class C4895c {
    /* renamed from: a */
    public static void m22560a(String str) {
        if (C4870a.f21773a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22561a(String str, Exception exc) {
        if ((C4870a.f21773a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
