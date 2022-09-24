package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.l */
final class C8939l extends C4649f<String> {
    C8939l(C8972p pVar, String str, String str2) {
        super(pVar, str, str2, (C8925j) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final String mo19169f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f21223b, (String) null);
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.f21223b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(valueOf) : new String("Invalid string value in SharedPreferences for "), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ Object mo19170m(String str) {
        return str;
    }
}
