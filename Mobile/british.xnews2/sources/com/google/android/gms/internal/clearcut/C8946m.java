package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.m */
final class C8946m extends C4649f {

    /* renamed from: m */
    private final Object f44605m = new Object();

    /* renamed from: n */
    private String f44606n;

    /* renamed from: o */
    private Object f44607o;

    /* renamed from: p */
    private final /* synthetic */ C8965o f44608p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8946m(C8972p pVar, String str, Object obj, C8965o oVar) {
        super(pVar, str, obj, (C8925j) null);
        this.f44608p = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Object mo19169f(SharedPreferences sharedPreferences) {
        try {
            return mo19170m(sharedPreferences.getString(this.f21223b, ""));
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(this.f21223b);
            Log.e("PhenotypeFlag", valueOf.length() != 0 ? "Invalid byte[] value in SharedPreferences for ".concat(valueOf) : new String("Invalid byte[] value in SharedPreferences for "), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Object mo19170m(String str) {
        Object obj;
        try {
            synchronized (this.f44605m) {
                if (!str.equals(this.f44606n)) {
                    Object a = this.f44608p.mo37052a(Base64.decode(str, 3));
                    this.f44606n = str;
                    this.f44607o = a;
                }
                obj = this.f44607o;
            }
            return obj;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.f21223b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 27 + String.valueOf(str).length());
            sb.append("Invalid byte[] value for ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
