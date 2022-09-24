package com.ironsource.sdk.p298k;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.ironsource.sdk.p294h.C11715c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.ironsource.sdk.k.b */
public final class C11732b {

    /* renamed from: d */
    private static C11732b f52440d;

    /* renamed from: a */
    public C11731a f52441a = new C11731a();

    /* renamed from: b */
    public final String f52442b;

    /* renamed from: c */
    private Thread f52443c;

    /* renamed from: com.ironsource.sdk.k.b$a */
    static class C11733a implements Callable<C11734b> {

        /* renamed from: a */
        private String f52444a;

        /* renamed from: b */
        private String f52445b;

        /* renamed from: c */
        private String f52446c;

        /* renamed from: d */
        private long f52447d;

        /* renamed from: e */
        private String f52448e;

        C11733a(String str, String str2, String str3, long j, String str4) {
            this.f52444a = str;
            this.f52445b = str2;
            this.f52446c = str3;
            this.f52447d = j;
            this.f52448e = str4;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v9, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
            r10 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
            r2 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
            r2 = r4;
            r4 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
            r4 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x012d A[Catch:{ all -> 0x0129 }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:? A[ExcHandler: URISyntaxException (unused java.net.URISyntaxException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x013c A[SYNTHETIC, Splitter:B:109:0x013c] */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0144 A[Catch:{ all -> 0x0140 }] */
        /* JADX WARNING: Removed duplicated region for block: B:120:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0153 A[SYNTHETIC, Splitter:B:121:0x0153] */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x015b A[Catch:{ all -> 0x0157 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[ExcHandler: Error (e java.lang.Error), Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9 A[Catch:{ all -> 0x00f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[SYNTHETIC, Splitter:B:45:0x00b2] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00ba A[Catch:{ all -> 0x00b6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4 A[Catch:{ all -> 0x00f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00dd A[SYNTHETIC, Splitter:B:61:0x00dd] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00e5 A[Catch:{ all -> 0x00e1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00f7 A[SYNTHETIC, Splitter:B:72:0x00f7] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00ff A[Catch:{ all -> 0x00fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x010e A[SYNTHETIC, Splitter:B:85:0x010e] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0116 A[Catch:{ all -> 0x0112 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0125 A[SYNTHETIC, Splitter:B:97:0x0125] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x00ca=Splitter:B:56:0x00ca, B:40:0x009f=Splitter:B:40:0x009f} */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ironsource.sdk.p298k.C11732b.C11734b m51888b(java.lang.String r9, int r10) {
            /*
                r8 = this;
                java.lang.String r0 = "DownloadManager"
                com.ironsource.sdk.k.b$b r1 = new com.ironsource.sdk.k.b$b
                r1.<init>()
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 == 0) goto L_0x0014
                r1.f52449a = r9
                r9 = 1007(0x3ef, float:1.411E-42)
                r1.f52450b = r9
                return r1
            L_0x0014:
                r2 = 1019(0x3fb, float:1.428E-42)
                r3 = 0
                r4 = 0
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0150, URISyntaxException -> 0x0139, SocketTimeoutException -> 0x0122, FileNotFoundException -> 0x010b, Exception -> 0x00c7, Error -> 0x009d, all -> 0x0099 }
                r5.<init>(r9)     // Catch:{ MalformedURLException -> 0x0150, URISyntaxException -> 0x0139, SocketTimeoutException -> 0x0122, FileNotFoundException -> 0x010b, Exception -> 0x00c7, Error -> 0x009d, all -> 0x0099 }
                r5.toURI()     // Catch:{ MalformedURLException -> 0x0150, URISyntaxException -> 0x0139, SocketTimeoutException -> 0x0122, FileNotFoundException -> 0x010b, Exception -> 0x00c7, Error -> 0x009d, all -> 0x0099 }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x0150, URISyntaxException -> 0x0139, SocketTimeoutException -> 0x0122, FileNotFoundException -> 0x010b, Exception -> 0x00c7, Error -> 0x009d, all -> 0x0099 }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x0150, URISyntaxException -> 0x0139, SocketTimeoutException -> 0x0122, FileNotFoundException -> 0x010b, Exception -> 0x00c7, Error -> 0x009d, all -> 0x0099 }
                java.lang.String r6 = "GET"
                r5.setRequestMethod(r6)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x0095, Error -> 0x0091, all -> 0x008f }
                r6 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r6)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x0095, Error -> 0x0091, all -> 0x008f }
                r5.setReadTimeout(r6)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x0095, Error -> 0x0091, all -> 0x008f }
                r5.connect()     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x0095, Error -> 0x0091, all -> 0x008f }
                int r4 = r5.getResponseCode()     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x0095, Error -> 0x0091, all -> 0x008f }
                r6 = 200(0xc8, float:2.8E-43)
                if (r4 < r6) goto L_0x004e
                r6 = 400(0x190, float:5.6E-43)
                if (r4 < r6) goto L_0x0043
                goto L_0x004e
            L_0x0043:
                java.io.InputStream r3 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                byte[] r10 = m51889c(r3)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                r1.f52451c = r10     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                goto L_0x0071
            L_0x004e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                java.lang.String r7 = " RESPONSE CODE: "
                r6.<init>(r7)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                r6.append(r4)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                java.lang.String r7 = " URL: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                r6.append(r9)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                java.lang.String r7 = " ATTEMPT: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                r6.append(r10)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                java.lang.String r10 = r6.toString()     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                com.ironsource.sdk.utils.Logger.m51953i(r0, r10)     // Catch:{ MalformedURLException -> 0x0151, URISyntaxException -> 0x013a, SocketTimeoutException -> 0x0123, FileNotFoundException -> 0x010c, Exception -> 0x008a, Error -> 0x0091, all -> 0x0086 }
                r4 = 1011(0x3f3, float:1.417E-42)
            L_0x0071:
                if (r3 == 0) goto L_0x0079
                r3.close()     // Catch:{ all -> 0x0077 }
                goto L_0x0079
            L_0x0077:
                r10 = move-exception
                goto L_0x007d
            L_0x0079:
                r5.disconnect()     // Catch:{ all -> 0x0077 }
                goto L_0x0080
            L_0x007d:
                r10.printStackTrace()
            L_0x0080:
                r1.f52449a = r9
                r1.f52450b = r4
                goto L_0x0168
            L_0x0086:
                r10 = move-exception
                r2 = r4
                goto L_0x00f5
            L_0x008a:
                r10 = move-exception
                r2 = r4
                r4 = r3
                r3 = r5
                goto L_0x00ca
            L_0x008f:
                r10 = move-exception
                goto L_0x009b
            L_0x0091:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x009f
            L_0x0095:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x00c9
            L_0x0099:
                r10 = move-exception
                r5 = r3
            L_0x009b:
                r2 = 0
                goto L_0x00f5
            L_0x009d:
                r10 = move-exception
                r4 = r3
            L_0x009f:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00f2 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f2 }
                if (r5 != 0) goto L_0x00b0
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00f2 }
                com.ironsource.sdk.utils.Logger.m51953i(r0, r10)     // Catch:{ all -> 0x00f2 }
            L_0x00b0:
                if (r4 == 0) goto L_0x00b8
                r4.close()     // Catch:{ all -> 0x00b6 }
                goto L_0x00b8
            L_0x00b6:
                r10 = move-exception
                goto L_0x00be
            L_0x00b8:
                if (r3 == 0) goto L_0x00c1
                r3.disconnect()     // Catch:{ all -> 0x00b6 }
                goto L_0x00c1
            L_0x00be:
                r10.printStackTrace()
            L_0x00c1:
                r1.f52449a = r9
                r1.f52450b = r2
                goto L_0x0168
            L_0x00c7:
                r10 = move-exception
                r4 = r3
            L_0x00c9:
                r2 = 0
            L_0x00ca:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00f2 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f2 }
                if (r5 != 0) goto L_0x00db
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00f2 }
                com.ironsource.sdk.utils.Logger.m51953i(r0, r10)     // Catch:{ all -> 0x00f2 }
            L_0x00db:
                if (r4 == 0) goto L_0x00e3
                r4.close()     // Catch:{ all -> 0x00e1 }
                goto L_0x00e3
            L_0x00e1:
                r10 = move-exception
                goto L_0x00e9
            L_0x00e3:
                if (r3 == 0) goto L_0x00ec
                r3.disconnect()     // Catch:{ all -> 0x00e1 }
                goto L_0x00ec
            L_0x00e9:
                r10.printStackTrace()
            L_0x00ec:
                r1.f52449a = r9
                r9 = 1009(0x3f1, float:1.414E-42)
                goto L_0x0166
            L_0x00f2:
                r10 = move-exception
                r5 = r3
                r3 = r4
            L_0x00f5:
                if (r3 == 0) goto L_0x00fd
                r3.close()     // Catch:{ all -> 0x00fb }
                goto L_0x00fd
            L_0x00fb:
                r0 = move-exception
                goto L_0x0103
            L_0x00fd:
                if (r5 == 0) goto L_0x0106
                r5.disconnect()     // Catch:{ all -> 0x00fb }
                goto L_0x0106
            L_0x0103:
                r0.printStackTrace()
            L_0x0106:
                r1.f52449a = r9
                r1.f52450b = r2
                throw r10
            L_0x010b:
                r5 = r3
            L_0x010c:
                if (r3 == 0) goto L_0x0114
                r3.close()     // Catch:{ all -> 0x0112 }
                goto L_0x0114
            L_0x0112:
                r10 = move-exception
                goto L_0x011a
            L_0x0114:
                if (r5 == 0) goto L_0x011d
                r5.disconnect()     // Catch:{ all -> 0x0112 }
                goto L_0x011d
            L_0x011a:
                r10.printStackTrace()
            L_0x011d:
                r1.f52449a = r9
                r9 = 1018(0x3fa, float:1.427E-42)
                goto L_0x0166
            L_0x0122:
                r5 = r3
            L_0x0123:
                if (r3 == 0) goto L_0x012b
                r3.close()     // Catch:{ all -> 0x0129 }
                goto L_0x012b
            L_0x0129:
                r10 = move-exception
                goto L_0x0131
            L_0x012b:
                if (r5 == 0) goto L_0x0134
                r5.disconnect()     // Catch:{ all -> 0x0129 }
                goto L_0x0134
            L_0x0131:
                r10.printStackTrace()
            L_0x0134:
                r1.f52449a = r9
                r9 = 1008(0x3f0, float:1.413E-42)
                goto L_0x0166
            L_0x0139:
                r5 = r3
            L_0x013a:
                if (r3 == 0) goto L_0x0142
                r3.close()     // Catch:{ all -> 0x0140 }
                goto L_0x0142
            L_0x0140:
                r10 = move-exception
                goto L_0x0148
            L_0x0142:
                if (r5 == 0) goto L_0x014b
                r5.disconnect()     // Catch:{ all -> 0x0140 }
                goto L_0x014b
            L_0x0148:
                r10.printStackTrace()
            L_0x014b:
                r1.f52449a = r9
                r9 = 1010(0x3f2, float:1.415E-42)
                goto L_0x0166
            L_0x0150:
                r5 = r3
            L_0x0151:
                if (r3 == 0) goto L_0x0159
                r3.close()     // Catch:{ all -> 0x0157 }
                goto L_0x0159
            L_0x0157:
                r10 = move-exception
                goto L_0x015f
            L_0x0159:
                if (r5 == 0) goto L_0x0162
                r5.disconnect()     // Catch:{ all -> 0x0157 }
                goto L_0x0162
            L_0x015f:
                r10.printStackTrace()
            L_0x0162:
                r1.f52449a = r9
                r9 = 1004(0x3ec, float:1.407E-42)
            L_0x0166:
                r1.f52450b = r9
            L_0x0168:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p298k.C11732b.C11733a.m51888b(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        /* renamed from: c */
        private static byte[] m51889c(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            r2 = m51888b(r9.f52444a, r1);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ironsource.sdk.p298k.C11732b.C11734b call() {
            /*
                r9 = this;
                java.lang.String r0 = "DownloadManager"
                long r1 = r9.f52447d
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x000e
                r1 = 1
                r9.f52447d = r1
            L_0x000e:
                r1 = 0
                r2 = 0
            L_0x0010:
                long r3 = (long) r1
                long r5 = r9.f52447d
                r7 = 1009(0x3f1, float:1.414E-42)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 >= 0) goto L_0x002a
                java.lang.String r2 = r9.f52444a
                com.ironsource.sdk.k.b$b r2 = r9.m51888b(r2, r1)
                int r3 = r2.f52450b
                r4 = 1008(0x3f0, float:1.413E-42)
                if (r3 == r4) goto L_0x0027
                if (r3 != r7) goto L_0x002a
            L_0x0027:
                int r1 = r1 + 1
                goto L_0x0010
            L_0x002a:
                if (r2 == 0) goto L_0x00a9
                byte[] r1 = r2.f52451c
                if (r1 == 0) goto L_0x00a9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r9.f52445b
                r1.append(r3)
                java.lang.String r3 = java.io.File.separator
                r1.append(r3)
                java.lang.String r4 = r9.f52446c
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r9.f52448e
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = "tmp_"
                r4.append(r3)
                java.lang.String r3 = r9.f52446c
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                byte[] r4 = r2.f52451c     // Catch:{ FileNotFoundException -> 0x00a5, Exception -> 0x0090, Error -> 0x007b }
                int r4 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(r4, r3)     // Catch:{ FileNotFoundException -> 0x00a5, Exception -> 0x0090, Error -> 0x007b }
                if (r4 != 0) goto L_0x0070
                r1 = 1006(0x3ee, float:1.41E-42)
                r2.f52450b = r1     // Catch:{ FileNotFoundException -> 0x00a5, Exception -> 0x0090, Error -> 0x007b }
                goto L_0x00a9
            L_0x0070:
                boolean r1 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r3, r1)     // Catch:{ FileNotFoundException -> 0x00a5, Exception -> 0x0090, Error -> 0x007b }
                if (r1 != 0) goto L_0x00a9
                r1 = 1020(0x3fc, float:1.43E-42)
                r2.f52450b = r1     // Catch:{ FileNotFoundException -> 0x00a5, Exception -> 0x0090, Error -> 0x007b }
                goto L_0x00a9
            L_0x007b:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x008d
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.m51953i(r0, r1)
            L_0x008d:
                r0 = 1019(0x3fb, float:1.428E-42)
                goto L_0x00a7
            L_0x0090:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00a2
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.m51953i(r0, r1)
            L_0x00a2:
                r2.f52450b = r7
                goto L_0x00a9
            L_0x00a5:
                r0 = 1018(0x3fa, float:1.427E-42)
            L_0x00a7:
                r2.f52450b = r0
            L_0x00a9:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.p298k.C11732b.C11733a.call():com.ironsource.sdk.k.b$b");
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$b */
    static class C11734b {

        /* renamed from: a */
        public String f52449a;

        /* renamed from: b */
        int f52450b;

        /* renamed from: c */
        byte[] f52451c;

        C11734b() {
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$c */
    static class C11735c implements Runnable {

        /* renamed from: b */
        private final long f52452b = 3;

        /* renamed from: c */
        private final String f52453c;

        /* renamed from: d */
        private Handler f52454d;

        /* renamed from: e */
        private String f52455e;

        /* renamed from: f */
        private String f52456f;

        /* renamed from: g */
        private String f52457g;

        /* renamed from: h */
        private long f52458h;

        C11735c(C11715c cVar, String str, Handler handler, String str2) {
            this.f52455e = str;
            this.f52456f = cVar.getParent();
            this.f52457g = cVar.getName();
            this.f52458h = 3;
            this.f52454d = handler;
            this.f52453c = str2;
        }

        public final void run() {
            int i;
            C11715c cVar = new C11715c(this.f52456f, this.f52457g);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = 1020;
            } else {
                i = new C11733a(this.f52455e, makeDir, cVar.getName(), this.f52458h, this.f52453c).call().f52450b;
                if (i == 200) {
                    i = AnalyticsListener.EVENT_AUDIO_ATTRIBUTES_CHANGED;
                }
            }
            message.what = i;
            this.f52454d.sendMessage(message);
        }
    }

    private C11732b(String str) {
        this.f52442b = str;
        IronSourceStorageUtils.deleteFolder(m51883c());
        IronSourceStorageUtils.makeDir(m51883c());
    }

    /* renamed from: a */
    public static synchronized C11732b m51882a(String str) {
        C11732b bVar;
        synchronized (C11732b.class) {
            if (f52440d == null) {
                f52440d = new C11732b(str);
            }
            bVar = f52440d;
        }
        return bVar;
    }

    /* renamed from: c */
    private String m51883c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f52442b, "temp");
    }

    /* renamed from: a */
    public final synchronized void mo45035a() {
        f52440d = null;
        C11731a aVar = this.f52441a;
        if (aVar != null) {
            aVar.f52439a = null;
            this.f52441a = null;
        }
    }

    /* renamed from: a */
    public final void mo45036a(C11715c cVar, String str) {
        Thread thread = new Thread(new C11735c(cVar, str, this.f52441a, m51883c()));
        this.f52443c = thread;
        thread.start();
    }

    /* renamed from: a */
    public final void mo45037a(C11715c cVar, String str, Handler handler) {
        new Thread(new C11735c(cVar, str, handler, m51883c())).start();
    }

    /* renamed from: b */
    public final boolean mo45038b() {
        Thread thread = this.f52443c;
        return thread != null && thread.isAlive();
    }
}
