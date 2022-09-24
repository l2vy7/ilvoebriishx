package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.ironsource.mediationsdk.p275a.C11291c;
import com.ironsource.mediationsdk.utils.C11483b;
import com.ironsource.mediationsdk.utils.C11491g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h */
public final class C11389h {

    /* renamed from: a */
    private final String f51170a = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;

    /* renamed from: b */
    private final String f51171b = "102";

    /* renamed from: c */
    private final String f51172c = "103";

    /* renamed from: d */
    private final String f51173d = "102";

    /* renamed from: e */
    private final String f51174e = "GenericNotifications";

    /* renamed from: f */
    private String f51175f;

    /* renamed from: g */
    private String f51176g;

    /* renamed from: h */
    private C11483b f51177h;

    /* renamed from: i */
    private C11386g f51178i;

    /* renamed from: j */
    ISBannerSize f51179j;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    static class C11390a extends AsyncTask<Object, Void, Boolean> {

        /* renamed from: a */
        private WeakReference<C11386g> f51180a;

        /* renamed from: b */
        private JSONObject f51181b;

        /* renamed from: c */
        private int f51182c;

        /* renamed from: d */
        private String f51183d;

        /* renamed from: e */
        private String f51184e;

        /* renamed from: f */
        private List<C11291c> f51185f;

        /* renamed from: g */
        private C11291c f51186g;

        /* renamed from: h */
        private JSONObject f51187h;

        /* renamed from: i */
        private long f51188i;

        /* renamed from: j */
        private int f51189j;

        /* renamed from: k */
        private String f51190k = "other";

        /* renamed from: l */
        private int f51191l;

        /* renamed from: m */
        private String f51192m = "";

        /* renamed from: n */
        private int f51193n = 0;

        C11390a(C11386g gVar) {
            this.f51180a = new WeakReference<>(gVar);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0258, code lost:
            r20 = r4;
            r19 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x027c, code lost:
            r16.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0297, code lost:
            r16.disconnect();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x024d, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0252, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0253, code lost:
            r20 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0255, code lost:
            r16 = r8;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x027c  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0297  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0233 A[Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x023c A[Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x024d A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:22:0x00e3] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0252 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:12:0x00bc] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Object... r23) {
            /*
                r22 = this;
                r1 = r22
                java.lang.String r2 = "decompression error"
                java.lang.String r3 = "decryption error"
                java.lang.String r4 = "other"
                java.util.Date r0 = new java.util.Date
                r0.<init>()
                long r5 = r0.getTime()
                r1.f51188i = r5
                r5 = 0
                java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x02bc }
                r0 = r23[r5]     // Catch:{ Exception -> 0x02bc }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02bc }
                r6.<init>(r0)     // Catch:{ Exception -> 0x02bc }
                r7 = 1
                r0 = r23[r7]     // Catch:{ Exception -> 0x02bc }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x02bc }
                r1.f51181b = r0     // Catch:{ Exception -> 0x02bc }
                r8 = 2
                r0 = r23[r8]     // Catch:{ Exception -> 0x02bc }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02bc }
                boolean r9 = r0.booleanValue()     // Catch:{ Exception -> 0x02bc }
                r0 = 3
                r0 = r23[r0]     // Catch:{ Exception -> 0x02bc }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x02bc }
                int r10 = r0.intValue()     // Catch:{ Exception -> 0x02bc }
                r0 = 4
                r0 = r23[r0]     // Catch:{ Exception -> 0x02bc }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x02bc }
                long r11 = r0.longValue()     // Catch:{ Exception -> 0x02bc }
                r0 = 5
                r0 = r23[r0]     // Catch:{ Exception -> 0x02bc }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02bc }
                boolean r13 = r0.booleanValue()     // Catch:{ Exception -> 0x02bc }
                r0 = 6
                r0 = r23[r0]     // Catch:{ Exception -> 0x02bc }
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x02bc }
                boolean r14 = r0.booleanValue()     // Catch:{ Exception -> 0x02bc }
                int r0 = r1.f51193n     // Catch:{ Exception -> 0x02bc }
                r15 = 1015(0x3f7, float:1.422E-42)
                if (r0 != r15) goto L_0x0059
                r0 = 1
                goto L_0x0062
            L_0x0059:
                r0 = 7
                r0 = r23[r0]     // Catch:{ Exception -> 0x02bc }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x02bc }
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x02bc }
            L_0x0062:
                r1.f51191l = r0     // Catch:{ Exception -> 0x02bc }
                r1.f51189j = r5
                r0 = 0
                r16 = r0
            L_0x0069:
                int r0 = r1.f51189j
                if (r0 >= r10) goto L_0x02b3
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                long r17 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.String r15 = "Auction Handler: auction trial "
                r0.<init>(r15)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                int r15 = r1.f51189j     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                int r15 = r15 + r7
                r0.append(r15)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.String r15 = " out of "
                r0.append(r15)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                r0.append(r10)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.String r15 = " max trials"
                r0.append(r15)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.String r0 = r0.toString()     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager r15 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                r15.log(r8, r0, r5)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                int r0 = (int) r11     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.net.URLConnection r8 = r6.openConnection()     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.String r15 = "POST"
                r8.setRequestMethod(r15)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                java.lang.String r15 = "Content-Type"
                java.lang.String r5 = "application/json; charset=utf-8"
                r8.setRequestProperty(r15, r5)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                r8.setReadTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                r8.setDoInput(r7)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                r8.setDoOutput(r7)     // Catch:{ SocketTimeoutException -> 0x0290, Exception -> 0x0264 }
                org.json.JSONObject r5 = r1.f51181b     // Catch:{ SocketTimeoutException -> 0x0258, Exception -> 0x0252 }
                java.io.OutputStream r15 = r8.getOutputStream()     // Catch:{ SocketTimeoutException -> 0x0258, Exception -> 0x0252 }
                java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ SocketTimeoutException -> 0x0258, Exception -> 0x0252 }
                java.lang.String r0 = "UTF-8"
                r7.<init>(r15, r0)     // Catch:{ SocketTimeoutException -> 0x0258, Exception -> 0x0252 }
                r19 = r6
                java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ SocketTimeoutException -> 0x024f, Exception -> 0x0252 }
                r6.<init>(r7)     // Catch:{ SocketTimeoutException -> 0x024f, Exception -> 0x0252 }
                java.lang.String r16 = ""
                int r0 = r1.f51191l     // Catch:{ SocketTimeoutException -> 0x024f, Exception -> 0x0252 }
                r20 = r4
                r4 = 2
                if (r0 != r4) goto L_0x00f0
                com.ironsource.mediationsdk.utils.g r0 = com.ironsource.mediationsdk.utils.C11491g.m51272a()     // Catch:{ JSONException -> 0x00e2 }
                java.lang.String r16 = r0.mo44554d()     // Catch:{ JSONException -> 0x00e2 }
                goto L_0x00f0
            L_0x00e2:
                r0 = move-exception
                java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
                r1.f51192m = r0     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
                r4 = 1015(0x3f7, float:1.422E-42)
                r1.f51193n = r4     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
                r4 = 1
                r1.f51191l = r4     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
            L_0x00f0:
                java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
                java.lang.String r4 = r22.m50964b()     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
                if (r13 == 0) goto L_0x0108
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x025c, Exception -> 0x024d }
                r21 = r13
                java.lang.String r13 = "compressing and encrypting auction request"
                r5.info(r13)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r4, r0)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                goto L_0x010e
            L_0x0108:
                r21 = r13
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.encode(r4, r0)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
            L_0x010e:
                int r4 = r1.f51191l     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r5 = 2
                if (r4 != r5) goto L_0x0122
                java.lang.String r4 = "{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}"
                java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r5 = 0
                r13[r5] = r16     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r5 = 1
                r13[r5] = r0     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                java.lang.String r0 = java.lang.String.format(r4, r13)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                goto L_0x012e
            L_0x0122:
                java.lang.String r4 = "{\"request\" : \"%1$s\"}"
                r5 = 1
                java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r5 = 0
                r13[r5] = r0     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                java.lang.String r0 = java.lang.String.format(r4, r13)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
            L_0x012e:
                r6.write(r0)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r6.flush()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r6.close()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r7.close()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r15.close()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                int r0 = r8.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r4 = 200(0xc8, float:2.8E-43)
                if (r0 == r4) goto L_0x0184
                r4 = 1001(0x3e9, float:1.403E-42)
                r1.f51182c = r4     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                java.lang.String r5 = "Auction status not 200 error, error code response from server - "
                r4.<init>(r5)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r4.append(r0)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                java.lang.String r0 = r4.toString()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r1.f51183d = r0     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r4.error(r0)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r8.disconnect()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                int r0 = r1.f51189j     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                int r4 = r10 + -1
                if (r0 >= r4) goto L_0x017d
                java.util.Date r0 = new java.util.Date     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                r0.<init>()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                long r4 = r0.getTime()     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                long r4 = r4 - r17
                long r4 = r11 - r4
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x017d
                android.os.SystemClock.sleep(r4)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
            L_0x017d:
                r16 = r8
                r4 = r20
                r6 = 2
                goto L_0x02a2
            L_0x0184:
                java.lang.String r0 = m50965c(r8)     // Catch:{ SocketTimeoutException -> 0x025e, Exception -> 0x024d }
                boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0209 }
                if (r4 != 0) goto L_0x01fe
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0209 }
                r4.<init>(r0)     // Catch:{ JSONException -> 0x0209 }
                if (r9 == 0) goto L_0x01d8
                java.lang.String r0 = r22.m50964b()     // Catch:{ JSONException -> 0x0209 }
                int r5 = r1.f51191l     // Catch:{ JSONException -> 0x0209 }
                r6 = 2
                if (r5 != r6) goto L_0x01a1
                java.lang.String r5 = "ct"
                goto L_0x01a3
            L_0x01a1:
                java.lang.String r5 = "response"
            L_0x01a3:
                java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x0207 }
                if (r14 == 0) goto L_0x01c2
                com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ JSONException -> 0x0207 }
                java.lang.String r7 = "decrypting and decompressing auction response"
                r5.info(r7)     // Catch:{ JSONException -> 0x0207 }
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decryptAndDecompress(r0, r4)     // Catch:{ JSONException -> 0x0207 }
                if (r0 == 0) goto L_0x01bc
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0207 }
                r4.<init>(r0)     // Catch:{ JSONException -> 0x0207 }
                goto L_0x01d9
            L_0x01bc:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0207 }
                r0.<init>(r2)     // Catch:{ JSONException -> 0x0207 }
                throw r0     // Catch:{ JSONException -> 0x0207 }
            L_0x01c2:
                java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.decode(r0, r4)     // Catch:{ JSONException -> 0x0207 }
                boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x0207 }
                if (r4 != 0) goto L_0x01d2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0207 }
                r4.<init>(r0)     // Catch:{ JSONException -> 0x0207 }
                goto L_0x01d9
            L_0x01d2:
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0207 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x0207 }
                throw r0     // Catch:{ JSONException -> 0x0207 }
            L_0x01d8:
                r6 = 2
            L_0x01d9:
                com.ironsource.mediationsdk.C11377f.m50856a()     // Catch:{ JSONException -> 0x0207 }
                com.ironsource.mediationsdk.f$a r0 = com.ironsource.mediationsdk.C11377f.m50858b((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x0207 }
                java.lang.String r4 = r0.f51105a     // Catch:{ JSONException -> 0x0207 }
                r1.f51184e = r4     // Catch:{ JSONException -> 0x0207 }
                java.util.List<com.ironsource.mediationsdk.a.c> r4 = r0.f51106b     // Catch:{ JSONException -> 0x0207 }
                r1.f51185f = r4     // Catch:{ JSONException -> 0x0207 }
                com.ironsource.mediationsdk.a.c r4 = r0.f51107c     // Catch:{ JSONException -> 0x0207 }
                r1.f51186g = r4     // Catch:{ JSONException -> 0x0207 }
                org.json.JSONObject r4 = r0.f51108d     // Catch:{ JSONException -> 0x0207 }
                r1.f51187h = r4     // Catch:{ JSONException -> 0x0207 }
                int r4 = r0.f51109e     // Catch:{ JSONException -> 0x0207 }
                r1.f51182c = r4     // Catch:{ JSONException -> 0x0207 }
                java.lang.String r0 = r0.f51110f     // Catch:{ JSONException -> 0x0207 }
                r1.f51183d = r0     // Catch:{ JSONException -> 0x0207 }
                r8.disconnect()     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                return r0
            L_0x01fe:
                r6 = 2
                org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0207 }
                java.lang.String r4 = "empty response"
                r0.<init>(r4)     // Catch:{ JSONException -> 0x0207 }
                throw r0     // Catch:{ JSONException -> 0x0207 }
            L_0x0207:
                r0 = move-exception
                goto L_0x020b
            L_0x0209:
                r0 = move-exception
                r6 = 2
            L_0x020b:
                java.lang.String r4 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                if (r4 == 0) goto L_0x0223
                java.lang.String r4 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                boolean r4 = r4.equalsIgnoreCase(r3)     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                if (r4 == 0) goto L_0x0223
                r4 = 1003(0x3eb, float:1.406E-42)
                r1.f51182c = r4     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                java.lang.String r4 = "Auction decryption error"
                r1.f51183d = r4     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
            L_0x0223:
                java.lang.String r4 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                if (r4 == 0) goto L_0x023c
                java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                if (r0 == 0) goto L_0x023c
                r0 = 1008(0x3f0, float:1.413E-42)
                r1.f51182c = r0     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                java.lang.String r0 = "Auction decompression error"
            L_0x0239:
                r1.f51183d = r0     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                goto L_0x0243
            L_0x023c:
                r0 = 1002(0x3ea, float:1.404E-42)
                r1.f51182c = r0     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                java.lang.String r0 = "Auction parsing error"
                goto L_0x0239
            L_0x0243:
                java.lang.String r0 = "parsing"
                r1.f51190k = r0     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                r8.disconnect()     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ SocketTimeoutException -> 0x025f, Exception -> 0x024d }
                return r0
            L_0x024d:
                r0 = move-exception
                goto L_0x0255
            L_0x024f:
                r20 = r4
                goto L_0x025c
            L_0x0252:
                r0 = move-exception
                r20 = r4
            L_0x0255:
                r16 = r8
                goto L_0x0267
            L_0x0258:
                r20 = r4
                r19 = r6
            L_0x025c:
                r21 = r13
            L_0x025e:
                r6 = 2
            L_0x025f:
                r16 = r8
                r4 = r20
                goto L_0x0295
            L_0x0264:
                r0 = move-exception
                r20 = r4
            L_0x0267:
                com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "getting exception "
                r3.<init>(r4)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.error(r3)
                if (r16 == 0) goto L_0x027f
                r16.disconnect()
            L_0x027f:
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.f51182c = r2
                java.lang.String r0 = r0.getMessage()
                r1.f51183d = r0
                r4 = r20
            L_0x028b:
                r1.f51190k = r4
            L_0x028d:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0290:
                r19 = r6
                r21 = r13
                r6 = 2
            L_0x0295:
                if (r16 == 0) goto L_0x029a
                r16.disconnect()
            L_0x029a:
                r0 = 1006(0x3ee, float:1.41E-42)
                r1.f51182c = r0
                java.lang.String r0 = "Connection timed out"
                r1.f51183d = r0
            L_0x02a2:
                int r0 = r1.f51189j
                r5 = 1
                int r0 = r0 + r5
                r1.f51189j = r0
                r6 = r19
                r13 = r21
                r5 = 0
                r7 = 1
                r8 = 2
                r15 = 1015(0x3f7, float:1.422E-42)
                goto L_0x0069
            L_0x02b3:
                r5 = 1
                int r10 = r10 - r5
                r1.f51189j = r10
                java.lang.String r0 = "trials_fail"
                r1.f51190k = r0
                goto L_0x028d
            L_0x02bc:
                r0 = move-exception
                r2 = 1007(0x3ef, float:1.411E-42)
                r1.f51182c = r2
                java.lang.String r0 = r0.getMessage()
                r1.f51183d = r0
                r2 = 0
                r1.f51189j = r2
                goto L_0x028b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C11389h.C11390a.doInBackground(java.lang.Object[]):java.lang.Boolean");
        }

        /* renamed from: b */
        private String m50964b() {
            return this.f51191l == 2 ? C11491g.m51272a().mo44553c() : C11491g.m51272a().mo44552b();
        }

        /* renamed from: c */
        private static String m50965c(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
            C11386g gVar = (C11386g) this.f51180a.get();
            if (gVar != null) {
                long time = new Date().getTime() - this.f51188i;
                if (bool.booleanValue()) {
                    gVar.mo43855a(this.f51185f, this.f51184e, this.f51186g, this.f51187h, this.f51189j + 1, time, this.f51193n, this.f51192m);
                } else {
                    gVar.mo43850a(this.f51182c, this.f51183d, this.f51189j + 1, this.f51190k, time);
                }
            }
        }
    }

    public C11389h(String str, C11483b bVar, C11386g gVar) {
        this.f51175f = str;
        this.f51177h = bVar;
        this.f51178i = gVar;
        this.f51176g = IronSourceUtils.getSessionId();
    }

    /* renamed from: a */
    private JSONObject m50957a(Context context, Map<String, Object> map, List<String> list, C11392i iVar, int i, boolean z) {
        new JSONObject();
        if (C11232E.m50103a().f50430t.f51666c.f51381e.mo44986c().f51747c) {
            return C11377f.m50856a().mo44256f(this.f51175f, z, map, list, iVar, i, this.f51179j);
        }
        JSONObject c = C11377f.m50856a().mo44255c(context, map, list, iVar, i, this.f51176g, this.f51177h, this.f51179j);
        c.put(IronSourceConstants.EVENTS_AD_UNIT, this.f51175f);
        c.put("doNotEncryptResponse", z ? "false" : "true");
        return c;
    }

    /* renamed from: a */
    public static void m50958a(C11291c cVar, int i, C11291c cVar2) {
        for (String a : cVar.mo44009f()) {
            String a2 = C11377f.m50856a().mo44254a(a, i, cVar, "", "", "");
            C11377f.m50856a();
            C11377f.m50864i("reportLoadSuccess", cVar.mo44004a(), a2);
        }
        if (cVar2 != null) {
            for (String a3 : cVar2.mo44009f()) {
                String a4 = C11377f.m50856a().mo44254a(a3, i, cVar, "", "102", "");
                C11377f.m50856a();
                C11377f.m50864i("reportLoadSuccess", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m50959a(C11291c cVar, int i, C11291c cVar2, String str) {
        for (String a : cVar.mo44007d()) {
            String a2 = C11377f.m50856a().mo44254a(a, i, cVar, "", "", str);
            C11377f.m50856a();
            C11377f.m50864i("reportImpression", cVar.mo44004a(), a2);
        }
        if (cVar2 != null) {
            for (String a3 : cVar2.mo44007d()) {
                String a4 = C11377f.m50856a().mo44254a(a3, i, cVar, "", "102", str);
                C11377f.m50856a();
                C11377f.m50864i("reportImpression", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public static void m50960a(ArrayList<String> arrayList, ConcurrentHashMap<String, C11291c> concurrentHashMap, int i, C11291c cVar, C11291c cVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(cVar2.mo44004a())) {
                z2 = i == 2;
                z = true;
            } else {
                int i2 = i;
                C11291c cVar3 = concurrentHashMap.get(next);
                String c = cVar3.mo44006c();
                String str = z ? z2 ? "102" : "103" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                for (String a : cVar3.mo44008e()) {
                    String a2 = C11377f.m50856a().mo44254a(a, i, cVar2, c, str, "");
                    C11377f.m50856a();
                    C11377f.m50864i("reportAuctionLose", cVar3.mo44004a(), a2);
                }
            }
        }
        int i3 = i;
        if (cVar != null) {
            for (String a3 : cVar.mo44008e()) {
                String a4 = C11377f.m50856a().mo44254a(a3, i, cVar2, "", "102", "");
                C11377f.m50856a();
                C11377f.m50864i("reportAuctionLose", "GenericNotifications", a4);
            }
        }
    }

    /* renamed from: a */
    public final void mo44287a(Context context, Map<String, Object> map, List<String> list, C11392i iVar, int i) {
        try {
            boolean z = IronSourceUtils.getSerr() == 1;
            new C11390a(this.f51178i).execute(new Object[]{this.f51177h.f51535d, m50957a(context, map, list, iVar, i, z), Boolean.valueOf(z), Integer.valueOf(this.f51177h.f51536e), Long.valueOf(this.f51177h.f51539h), Boolean.valueOf(this.f51177h.f51547p), Boolean.valueOf(this.f51177h.f51548q), Integer.valueOf(this.f51177h.f51549r)});
        } catch (Exception e) {
            this.f51178i.mo43850a(1000, e.getMessage(), 0, "other", 0);
        }
    }

    /* renamed from: a */
    public final void mo44288a(CopyOnWriteArrayList<C11261V> copyOnWriteArrayList, ConcurrentHashMap<String, C11291c> concurrentHashMap, int i, C11291c cVar, C11291c cVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<C11261V> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo43926k());
        }
        m50960a((ArrayList<String>) arrayList, concurrentHashMap, i, cVar, cVar2);
    }
}
