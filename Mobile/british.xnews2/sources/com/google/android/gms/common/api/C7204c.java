package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C7220b;
import com.google.android.gms.common.internal.C4604n;
import java.util.ArrayList;
import p149t.C6077a;

/* renamed from: com.google.android.gms.common.api.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7204c extends Exception {

    /* renamed from: b */
    private final C6077a<C7220b<?>, ConnectionResult> f28899b;

    public C7204c(C6077a<C7220b<?>, ConnectionResult> aVar) {
        this.f28899b = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C7220b next : this.f28899b.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C4604n.m20098k(this.f28899b.get(next));
            z &= !connectionResult.mo29686G0();
            String b = next.mo29817b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
