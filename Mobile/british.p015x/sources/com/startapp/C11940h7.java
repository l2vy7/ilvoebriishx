package com.startapp;

import android.net.Uri;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import com.startapp.sdk.common.SDKException;

/* renamed from: com.startapp.h7 */
/* compiled from: Sta */
public class C11940h7 {

    /* renamed from: a */
    public final C11781a7 f53041a;

    /* renamed from: b */
    public final long f53042b = C5015nb.m22900a();

    public C11940h7(C11781a7 a7Var) {
        this.f53041a = a7Var;
    }

    /* renamed from: a */
    public void mo45406a(String str, String str2, SDKException sDKException) {
        int i;
        String str3;
        long a = C5015nb.m22900a();
        C11781a7 a7Var = this.f53041a;
        long j = a - this.f53042b;
        NetworkDiagnosticConfig a2 = a7Var.mo45135a();
        if (a2 != null) {
            if (sDKException == null) {
                str3 = "Success";
                i = 4;
            } else if (sDKException.getCause() != null) {
                StringBuilder a3 = C12458z0.m53804a("Failure: ");
                a3.append(sDKException.getCause().getClass().getName());
                str3 = a3.toString();
                i = 2;
            } else {
                StringBuilder a4 = C12458z0.m53804a("Error: ");
                a4.append(sDKException.mo46440a());
                str3 = a4.toString();
                i = 1;
            }
            if ((a2.mo46373d() & i) != 0) {
                Uri b = sDKException != null ? sDKException.mo46441b() : null;
                if (b == null) {
                    b = Uri.parse(str2).buildUpon().query((String) null).build();
                }
                a7Var.f52575c.execute(new C11802b7(a7Var, str + ' ' + b, str3, j));
            }
            if (i == 4) {
                a7Var.f52575c.execute(a7Var.f52577e);
            }
        }
    }
}
