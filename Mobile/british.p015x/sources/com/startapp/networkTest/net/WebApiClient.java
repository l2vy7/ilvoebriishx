package com.startapp.networkTest.net;

import com.startapp.C11791ad;
import com.startapp.C11808bd;
import com.startapp.C12028l5;
import com.startapp.C12356u2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p330t8.C12900d;

/* compiled from: Sta */
public abstract class WebApiClient {

    /* renamed from: a */
    private static final String f53825a = "WebApiClient";

    /* renamed from: b */
    private static final int f53826b = 10000;

    /* compiled from: Sta */
    public enum RequestMethod {
        POST,
        GET,
        PUT,
        DELETE
    }

    /* renamed from: com.startapp.networkTest.net.WebApiClient$a */
    /* compiled from: Sta */
    public class C12086a implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: a */
    public static C11808bd m52650a(RequestMethod requestMethod, String str) throws IOException {
        return m52651a(requestMethod, str, (Object) null);
    }

    /* renamed from: a */
    public static C11808bd m52651a(RequestMethod requestMethod, String str, Object obj) throws IOException {
        return m52652a(requestMethod, str, obj, new C11791ad[]{new C11791ad(RtspHeaders.CONTENT_TYPE, "application/json; charset=UTF-8"), new C11791ad(RtspHeaders.ACCEPT, "application/json")});
    }

    /* renamed from: a */
    public static C11808bd m52652a(RequestMethod requestMethod, String str, Object obj, C11791ad[] adVarArr) throws IOException {
        return m52653a(requestMethod, str, obj, adVarArr, false);
    }

    /* renamed from: a */
    public static C11808bd m52653a(RequestMethod requestMethod, String str, Object obj, C11791ad[] adVarArr, boolean z) throws IOException {
        HttpsURLConnection httpsURLConnection;
        C11808bd bdVar = new C11808bd();
        URL url = new URL(str);
        URL url2 = new URL(str);
        if (!z || !url2.getProtocol().toLowerCase().equals("https")) {
            httpsURLConnection = (HttpURLConnection) url.openConnection();
        } else {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
            m52654a(httpsURLConnection2);
            httpsURLConnection2.setHostnameVerifier(C12900d.f55588d);
            httpsURLConnection = httpsURLConnection2;
        }
        httpsURLConnection.setRequestMethod(requestMethod.toString());
        if (adVarArr != null) {
            for (C11791ad adVar : adVarArr) {
                httpsURLConnection.setRequestProperty(adVar.f52591a, adVar.f52592b);
            }
        }
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        if (obj != null) {
            if (requestMethod.equals(RequestMethod.GET) || requestMethod.equals(RequestMethod.DELETE)) {
                throw new IOException("GET and DELETE does not support a body");
            }
            httpsURLConnection.setDoOutput(true);
            String a = C12028l5.m52559a(obj);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        }
        bdVar.f52632a = httpsURLConnection.getResponseCode();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        }
        httpsURLConnection.disconnect();
        bdVar.f52633b = sb.toString();
        return bdVar;
    }

    /* renamed from: a */
    private static void m52654a(HttpsURLConnection httpsURLConnection) {
        TrustManager[] trustManagerArr = {new C12086a()};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        }
    }
}
