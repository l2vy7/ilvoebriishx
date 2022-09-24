package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p006a5.C6482d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class io0 implements un0 {

    /* renamed from: a */
    private final String f33368a;

    public io0() {
        this.f33368a = null;
    }

    public io0(String str) {
        this.f33368a = str;
    }

    public void zza(String str) {
        String str2;
        HttpURLConnection httpURLConnection;
        try {
            if (C6482d.m28249a()) {
                TrafficStats.setThreadStatsTag(263);
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Pinging URL: ".concat(valueOf);
            } else {
                str2 = new String("Pinging URL: ");
            }
            co0.zze(str2);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            C8241uv.m38463b();
            String str3 = this.f33368a;
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setReadTimeout(60000);
            if (str3 != null) {
                httpURLConnection.setRequestProperty(RtspHeaders.USER_AGENT, str3);
            }
            httpURLConnection.setUseCaches(false);
            bo0 bo0 = new bo0((String) null);
            bo0.mo30738c(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            bo0.mo30740e(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(str);
                co0.zzj(sb.toString());
            }
            httpURLConnection.disconnect();
            if (C6482d.m28249a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            co0.zzj(sb2.toString());
            if (C6482d.m28249a()) {
                TrafficStats.clearThreadStatsTag();
            }
        } catch (IOException | RuntimeException e2) {
            try {
                String message2 = e2.getMessage();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message2).length());
                sb3.append("Error while pinging URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                co0.zzj(sb3.toString());
            } finally {
                if (C6482d.m28249a()) {
                    TrafficStats.clearThreadStatsTag();
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
