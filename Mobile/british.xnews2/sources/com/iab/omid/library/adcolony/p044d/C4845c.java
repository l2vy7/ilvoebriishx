package com.iab.omid.library.adcolony.p044d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.adcolony.C4820a;

/* renamed from: com.iab.omid.library.adcolony.d.c */
public final class C4845c {
    /* renamed from: a */
    public static void m22339a(String str) {
        if (C4820a.f21622a.booleanValue() && !TextUtils.isEmpty(str)) {
            Log.i("OMIDLIB", str);
        }
    }

    /* renamed from: a */
    public static void m22340a(String str, Exception exc) {
        if ((C4820a.f21622a.booleanValue() && !TextUtils.isEmpty(str)) || exc != null) {
            Log.e("OMIDLIB", str, exc);
        }
    }
}
