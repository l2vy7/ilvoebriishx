package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class os0 implements x23 {

    /* renamed from: a */
    public final /* synthetic */ String f36591a;

    public /* synthetic */ os0(String str) {
        this.f36591a = str;
    }

    public final URLConnection zza() {
        String str;
        String str2;
        String str3 = this.f36591a;
        int i = ps0.f37760i;
        zzt.zzw();
        int intValue = ((Integer) C8311wv.m39277c().mo18570b(p00.f37217u)).intValue();
        URL url = new URL(str3);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(intValue);
                openConnection.setReadTimeout(intValue);
                if (openConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    bo0 bo0 = new bo0((String) null);
                    bo0.mo30738c(httpURLConnection, (byte[]) null);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    bo0.mo30740e(httpURLConnection, responseCode);
                    if (responseCode / 100 != 3) {
                        return httpURLConnection;
                    }
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            throw new IOException("Protocol is null");
                        } else if (protocol.equals("http") || protocol.equals("https")) {
                            if (headerField.length() != 0) {
                                str = "Redirecting to ".concat(headerField);
                            } else {
                                str = new String("Redirecting to ");
                            }
                            co0.zze(str);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            if (protocol.length() != 0) {
                                str2 = "Unsupported scheme: ".concat(protocol);
                            } else {
                                str2 = new String("Unsupported scheme: ");
                            }
                            throw new IOException(str2);
                        }
                    } else {
                        throw new IOException("Missing Location header in redirect");
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                throw new IOException("Too many redirects (20)");
            }
        }
    }
}
