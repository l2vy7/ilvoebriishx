package com.startapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.startapp.e1 */
/* compiled from: Sta */
public class C11878e1 {

    /* renamed from: com.startapp.e1$a */
    /* compiled from: Sta */
    public static class C11879a extends FilterInputStream {
        public C11879a(InputStream inputStream) {
            super(inputStream);
        }

        public long skip(long j) throws IOException {
            long j2 = 0;
            while (j2 < j) {
                long skip = this.in.skip(j - j2);
                if (skip == 0) {
                    if (read() < 0) {
                        break;
                    }
                    skip = 1;
                }
                j2 += skip;
            }
            return j2;
        }
    }

    /* renamed from: a */
    public static Bitmap m52261a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m52263b(java.lang.String r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x002f }
            r1.<init>(r5)     // Catch:{ all -> 0x002f }
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ all -> 0x002f }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x002f }
            r5.connect()     // Catch:{ all -> 0x002b }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ all -> 0x002b }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002b }
            r2.<init>(r1)     // Catch:{ all -> 0x002b }
            com.startapp.e1$a r3 = new com.startapp.e1$a     // Catch:{ all -> 0x002b }
            r3.<init>(r1)     // Catch:{ all -> 0x002b }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x002b }
            r2.close()     // Catch:{ all -> 0x002b }
            r1.close()     // Catch:{ all -> 0x002b }
            r5.disconnect()
            goto L_0x0036
        L_0x002b:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x0030
        L_0x002f:
            r5 = r0
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.disconnect()
        L_0x0035:
            r0 = r5
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11878e1.m52263b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static Drawable m52262a(Resources resources, String str) {
        return new BitmapDrawable(resources, m52261a(str));
    }
}
