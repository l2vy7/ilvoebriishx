package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p149t.C6077a;

/* renamed from: com.google.android.gms.internal.measurement.d6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9114d6 {

    /* renamed from: a */
    private static final C6077a f44951a = new C6077a();

    /* renamed from: a */
    public static synchronized Uri m42777a(String str) {
        Uri uri;
        String str2;
        synchronized (C9114d6.class) {
            C6077a aVar = f44951a;
            uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                aVar.put("com.google.android.gms.measurement", uri);
            }
        }
        return uri;
    }
}
