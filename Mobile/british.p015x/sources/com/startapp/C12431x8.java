package com.startapp;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* renamed from: com.startapp.x8 */
/* compiled from: Sta */
public abstract class C12431x8 extends HttpURLConnection {
    /* renamed from: a */
    public static HttpURLConnection m53752a(String str, String str2) throws IOException {
        boolean z;
        try {
            URLDecoder.decode(str, C6540C.UTF8_NAME);
            z = false;
        } catch (UnsupportedEncodingException unused) {
            z = true;
        }
        if (!z) {
            try {
                str = m53751a(str);
            } catch (Exception unused2) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, str2);
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            return httpURLConnection;
        }
        throw new UnsupportedEncodingException(str);
    }

    /* renamed from: a */
    public static String m53751a(String str) throws Exception {
        boolean z;
        URI uri;
        try {
            new URI(str);
            z = false;
        } catch (URISyntaxException unused) {
            z = true;
        }
        if (z) {
            URL url = new URL(str);
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        } else {
            uri = new URI(str);
        }
        return uri.toURL().toString();
    }
}
