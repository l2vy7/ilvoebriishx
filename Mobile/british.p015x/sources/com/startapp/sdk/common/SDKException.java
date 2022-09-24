package com.startapp.sdk.common;

import android.net.Uri;

/* compiled from: Sta */
public class SDKException extends Exception {
    private static final long serialVersionUID = 1203685012128929267L;
    private String method;
    private boolean retry;
    private int statusCode;
    private Uri uri;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SDKException(java.lang.String r4, android.net.Uri r5, int r6, boolean r7, java.lang.Throwable r8) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r1 = 32
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x001b
            java.lang.String r2 = ", status "
            java.lang.String r2 = com.startapp.C12024l2.m52554a(r2, r6)
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            r0.append(r2)
            if (r7 == 0) goto L_0x0023
            java.lang.String r1 = ", retry"
        L_0x0023:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r8)
            r3.method = r4
            r3.uri = r5
            r3.statusCode = r6
            r3.retry = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.common.SDKException.<init>(java.lang.String, android.net.Uri, int, boolean, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public int mo46440a() {
        return this.statusCode;
    }

    /* renamed from: b */
    public Uri mo46441b() {
        return this.uri;
    }

    public SDKException() {
    }

    public SDKException(String str, Throwable th) {
        super(str, th);
    }
}
