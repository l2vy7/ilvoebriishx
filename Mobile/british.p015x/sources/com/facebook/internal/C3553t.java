package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.C3752u;
import com.facebook.internal.C3528o;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.facebook.internal.t */
/* compiled from: ImageResponseCache */
class C3553t {

    /* renamed from: a */
    static final String f13266a = "t";

    /* renamed from: b */
    private static C3528o f13267b;

    /* renamed from: com.facebook.internal.t$a */
    /* compiled from: ImageResponseCache */
    private static class C3554a extends BufferedInputStream {

        /* renamed from: b */
        HttpURLConnection f13268b;

        C3554a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.f13268b = httpURLConnection;
        }

        public void close() throws IOException {
            super.close();
            C3481f0.m11642n(this.f13268b);
        }
    }

    C3553t() {
    }

    /* renamed from: a */
    static synchronized C3528o m11872a(Context context) throws IOException {
        C3528o oVar;
        synchronized (C3553t.class) {
            if (f13267b == null) {
                f13267b = new C3528o(f13266a, new C3528o.C3537g());
            }
            oVar = f13267b;
        }
        return oVar;
    }

    /* renamed from: b */
    static InputStream m11873b(Uri uri, Context context) {
        if (uri != null && m11875d(uri)) {
            try {
                return m11872a(context).mo12018f(uri.toString());
            } catch (IOException e) {
                C3561x.m11891e(C3752u.CACHE, 5, f13266a, e.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    static InputStream m11874c(Context context, HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            return m11875d(parse) ? m11872a(context).mo12020h(parse.toString(), new C3554a(inputStream, httpURLConnection)) : inputStream;
        } catch (IOException unused) {
            return inputStream;
        }
    }

    /* renamed from: d */
    private static boolean m11875d(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (host.endsWith("fbcdn.net")) {
            return true;
        }
        if (!host.startsWith("fbcdn") || !host.endsWith("akamaihd.net")) {
            return false;
        }
        return true;
    }
}
