package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.k */
final class C8932k extends C4649f<Boolean> {
    C8932k(C8972p pVar, String str, Boolean bool) {
        super(pVar, str, bool, (C8925j) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Boolean mo19169f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f21223b, false));
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.f21223b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(valueOf) : new String("Invalid boolean value in SharedPreferences for "), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final /* synthetic */ Object mo19170m(String str) {
        if (C9048z5.f44813c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (C9048z5.f44814d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f21223b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb.append("Invalid boolean value for ");
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
