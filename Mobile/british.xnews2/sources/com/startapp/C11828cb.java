package com.startapp;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.JsonReader;
import android.util.MalformedJsonException;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import com.startapp.sdk.jobs.C12320b;
import com.startapp.sdk.jobs.C12323d;
import com.startapp.sdk.jobs.JobRequest;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.PeriodicAppEventMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.cb */
/* compiled from: Sta */
public class C11828cb {

    /* renamed from: a */
    public final String f52682a;

    /* renamed from: b */
    public final C5069e f52683b;

    /* renamed from: c */
    public final Executor f52684c;

    /* renamed from: d */
    public final C11920g5 f52685d;

    /* renamed from: e */
    public final Handler f52686e;

    /* renamed from: f */
    public final Map<String, Long> f52687f;

    /* renamed from: g */
    public final AdvertisingIdResolver f52688g;

    /* renamed from: h */
    public final C12034lb f52689h;

    /* renamed from: i */
    public final C12462z2<TriggeredLinksMetadata> f52690i;

    /* renamed from: j */
    public final Runnable f52691j = new C11829a();

    /* renamed from: com.startapp.cb$a */
    /* compiled from: Sta */
    public class C11829a implements Runnable {
        public C11829a() {
        }

        public void run() {
            C11828cb.this.mo45219b();
        }
    }

    /* renamed from: com.startapp.cb$b */
    /* compiled from: Sta */
    public class C11830b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ TriggeredLinksMetadata f52693a;

        /* renamed from: b */
        public final /* synthetic */ Map f52694b;

        /* renamed from: c */
        public final /* synthetic */ String f52695c;

        public C11830b(TriggeredLinksMetadata triggeredLinksMetadata, Map map, String str) {
            this.f52693a = triggeredLinksMetadata;
            this.f52694b = map;
            this.f52695c = str;
        }

        public void run() {
            try {
                C11828cb.this.mo45220b(this.f52693a, this.f52694b, this.f52695c);
            } catch (Throwable th) {
                if (C11828cb.this.mo45218a(2)) {
                    C5004d4.m22887a(th);
                }
            }
        }
    }

    public C11828cb(String str, C5069e eVar, Executor executor, C11920g5 g5Var, AdvertisingIdResolver advertisingIdResolver, C12034lb lbVar, C12462z2<TriggeredLinksMetadata> z2Var) {
        this.f52682a = str;
        this.f52683b = eVar;
        this.f52684c = new C12013k9(executor);
        this.f52685d = g5Var;
        this.f52686e = new Handler(Looper.getMainLooper());
        this.f52687f = new HashMap();
        this.f52688g = advertisingIdResolver;
        this.f52689h = lbVar;
        this.f52690i = z2Var;
    }

    /* renamed from: a */
    public final TriggeredLinksMetadata mo45212a() {
        TriggeredLinksMetadata call = this.f52690i.call();
        if (call == null || !call.mo46509e()) {
            return null;
        }
        return call;
    }

    /* renamed from: b */
    public void mo45219b() {
        String b;
        this.f52686e.removeCallbacks(this.f52691j);
        int i = 1;
        this.f52685d.mo45379a(JobRequest.m53446a((Class<? extends C12320b>[]) new Class[]{C11806bb.class}));
        TriggeredLinksMetadata a = mo45212a();
        Map<String, PeriodicAppEventMetadata> map = null;
        AppEventsMetadata a2 = a != null ? a.mo46505a() : null;
        if (a2 != null) {
            map = a2.mo46497d();
        }
        if (map != null && map.size() >= 1) {
            C5069e.C5070a a3 = this.f52683b.edit();
            long currentTimeMillis = System.currentTimeMillis();
            long j = Long.MAX_VALUE;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                PeriodicAppEventMetadata periodicAppEventMetadata = (PeriodicAppEventMetadata) next.getValue();
                if (!(str == null || str.length() < i || periodicAppEventMetadata == null || (b = periodicAppEventMetadata.mo46501b()) == null || b.length() < i)) {
                    int a4 = periodicAppEventMetadata.mo46500a();
                    int i2 = a4 < 5 ? 5 : a4;
                    long j2 = this.f52683b.getLong(str, 0);
                    if (j2 > currentTimeMillis) {
                        a3.mo21101a(str, Long.valueOf(j2));
                        a3.f22385a.putLong(str, j2);
                        if (j > j2) {
                            j = j2;
                        }
                    } else {
                        long j3 = (((long) i2) * 1000) + currentTimeMillis;
                        a3.mo21101a(str, Long.valueOf(j3));
                        a3.f22385a.putLong(str, j3);
                        C11889eb ebVar = r0;
                        Executor executor = this.f52684c;
                        C11889eb ebVar2 = new C11889eb(this, a, str, b, i2);
                        executor.execute(ebVar);
                    }
                }
                i = 1;
            }
            a3.apply();
            if (j != Long.MAX_VALUE) {
                long j4 = j - currentTimeMillis;
                if (j4 < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
                    mo45213a(j4);
                    return;
                }
                C12323d.C12324a aVar = new C12323d.C12324a(C11806bb.class);
                aVar.f54733d = Long.valueOf(j4);
                aVar.f54722b = JobRequest.Network.ANY;
                this.f52685d.mo45380a(new C12323d((C12323d.C12324a) aVar.mo46487a()));
            }
        }
    }

    /* renamed from: a */
    public boolean mo45218a(int i) {
        TriggeredLinksMetadata a = mo45212a();
        return a != null && (a.mo46506b() & i) == i;
    }

    /* renamed from: a */
    public void mo45213a(long j) {
        if (j > 0) {
            this.f52686e.postDelayed(this.f52691j, j);
        } else {
            this.f52686e.post(this.f52691j);
        }
    }

    /* renamed from: a */
    public void mo45216a(String str, int i) {
        C5069e.C5070a a = this.f52683b.edit();
        long currentTimeMillis = (((long) i) * 1000) + System.currentTimeMillis();
        a.mo21101a(str, Long.valueOf(currentTimeMillis));
        a.f22385a.putLong(str, currentTimeMillis);
        a.apply();
    }

    /* renamed from: a */
    public void mo45215a(TriggeredLinksMetadata triggeredLinksMetadata, Map<String, String> map, String str) {
        this.f52684c.execute(new C11830b(triggeredLinksMetadata, map, str));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0128 A[Catch:{ all -> 0x012d }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45214a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) throws java.io.IOException, org.json.JSONException {
        /*
            r11 = this;
            android.net.Uri r15 = android.net.Uri.parse(r15)
            android.net.Uri$Builder r0 = r15.buildUpon()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            r3 = 1
            r4 = 11
            r5 = 0
            r6 = 0
            if (r1 < r4) goto L_0x008f
            r0.query(r6)
            java.util.Set r1 = r15.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x001d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x008f
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x002c
            goto L_0x001d
        L_0x002c:
            java.lang.String r8 = r15.getQueryParameter(r7)
            if (r8 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r9 = -1
            int r10 = r8.hashCode()
            switch(r10) {
                case -1089147532: goto L_0x0052;
                case 613582261: goto L_0x0047;
                case 1311708630: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x005c
        L_0x003c:
            java.lang.String r10 = "startapp_advertising_id"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0045
            goto L_0x005c
        L_0x0045:
            r9 = 2
            goto L_0x005c
        L_0x0047:
            java.lang.String r10 = "startapp_no_tracking"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0050
            goto L_0x005c
        L_0x0050:
            r9 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r10 = "startapp_package_id"
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r9 = 0
        L_0x005c:
            java.lang.String r10 = "0"
            switch(r9) {
                case 0: goto L_0x0089;
                case 1: goto L_0x0079;
                case 2: goto L_0x0065;
                default: goto L_0x0061;
            }
        L_0x0061:
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x0065:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r8 = r11.f52688g
            com.startapp.s r8 = r8.mo46442a()
            java.lang.String r8 = r8.f54121a
            boolean r9 = r8.equals(r10)
            if (r9 == 0) goto L_0x0075
            java.lang.String r8 = "00000000-0000-0000-0000-000000000000"
        L_0x0075:
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x0079:
            com.startapp.sdk.common.advertisingid.AdvertisingIdResolver r8 = r11.f52688g
            com.startapp.s r8 = r8.mo46442a()
            boolean r8 = r8.f54123c
            if (r8 == 0) goto L_0x0085
            java.lang.String r10 = "1"
        L_0x0085:
            r0.appendQueryParameter(r7, r10)
            goto L_0x001d
        L_0x0089:
            java.lang.String r8 = r11.f52682a
            r0.appendQueryParameter(r7, r8)
            goto L_0x001d
        L_0x008f:
            android.net.Uri r15 = r0.build()
            java.lang.String r15 = r15.toString()
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x011f }
            r0.<init>(r15)     // Catch:{ all -> 0x011f }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x011f }
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x00df
            r1 = r0
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x011b }
            r1.setInstanceFollowRedirects(r3)     // Catch:{ all -> 0x011b }
            int r3 = r12.mo46507c()     // Catch:{ all -> 0x011b }
            int r3 = r3 * 1000
            r1.setReadTimeout(r3)     // Catch:{ all -> 0x011b }
            int r3 = r12.mo46507c()     // Catch:{ all -> 0x011b }
            int r3 = r3 * 1000
            r1.setConnectTimeout(r3)     // Catch:{ all -> 0x011b }
            com.startapp.lb r3 = r11.f52689h     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r3.f53254a     // Catch:{ all -> 0x011b }
            if (r3 == 0) goto L_0x00cd
            int r5 = r3.length()     // Catch:{ all -> 0x011b }
            if (r5 <= 0) goto L_0x00cd
            java.lang.String r5 = "User-Agent"
            r1.setRequestProperty(r5, r3)     // Catch:{ all -> 0x011b }
        L_0x00cd:
            r1.connect()     // Catch:{ all -> 0x011b }
            int r5 = r1.getResponseCode()     // Catch:{ all -> 0x011b }
            java.io.InputStream r6 = r1.getInputStream()     // Catch:{ all -> 0x011b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x011b }
            if (r1 < r4) goto L_0x00df
            r11.mo45217a((java.lang.String) r13, (java.lang.String) r14, (java.io.InputStream) r6)     // Catch:{ all -> 0x011b }
        L_0x00df:
            com.startapp.C5015nb.m22917a((java.io.Closeable) r6)
            boolean r1 = r0 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x00ec }
            if (r1 == 0) goto L_0x00ed
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ all -> 0x00ec }
            r0.disconnect()     // Catch:{ all -> 0x00ec }
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            boolean r12 = r12.mo46511f()
            if (r12 == 0) goto L_0x011a
            int r5 = r5 / 100
            if (r5 != r2) goto L_0x011a
            com.startapp.d4 r12 = new com.startapp.d4
            com.startapp.e4 r0 = com.startapp.C11882e4.f52895n
            r12.<init>((com.startapp.C11882e4) r0)
            r12.f22126d = r14
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r0 = "eventType"
            org.json.JSONObject r13 = r14.put(r0, r13)
            java.lang.String r14 = "url"
            org.json.JSONObject r13 = r13.put(r14, r15)
            java.lang.String r13 = r13.toString()
            r12.f22127e = r13
            r12.mo20661a()
        L_0x011a:
            return
        L_0x011b:
            r12 = move-exception
            r13 = r6
            r6 = r0
            goto L_0x0121
        L_0x011f:
            r12 = move-exception
            r13 = r6
        L_0x0121:
            com.startapp.C5015nb.m22917a((java.io.Closeable) r13)
            boolean r13 = r6 instanceof java.net.HttpURLConnection     // Catch:{ all -> 0x012d }
            if (r13 == 0) goto L_0x012d
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x012d }
            r6.disconnect()     // Catch:{ all -> 0x012d }
        L_0x012d:
            goto L_0x012f
        L_0x012e:
            throw r12
        L_0x012f:
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11828cb.mo45214a(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (r2.longValue() > android.os.SystemClock.elapsedRealtime()) goto L_0x0080;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45220b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
            r8 = this;
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0008:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L_0x0094
            int r2 = r1.length()
            r3 = 1
            if (r2 >= r3) goto L_0x002a
            goto L_0x0094
        L_0x002a:
            if (r0 == 0) goto L_0x0094
            int r2 = r0.length()
            if (r2 >= r3) goto L_0x0033
            goto L_0x0094
        L_0x0033:
            java.util.List r2 = r9.mo46508d()
            if (r2 != 0) goto L_0x003a
            goto L_0x007f
        L_0x003a:
            java.util.Iterator r2 = r2.iterator()
        L_0x003e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003e
            java.util.Map<java.lang.String, java.lang.Long> r2 = r8.f52687f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "-"
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x007f
            long r4 = r2.longValue()
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0083
            return
        L_0x0083:
            r8.mo45214a(r9, r11, r1, r0)     // Catch:{ all -> 0x0087 }
            goto L_0x0008
        L_0x0087:
            r0 = move-exception
            r1 = 4
            boolean r1 = r8.mo45218a((int) r1)
            if (r1 == 0) goto L_0x0008
            com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)
            goto L_0x0008
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11828cb.mo45220b(com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata, java.util.Map, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo45217a(String str, String str2, InputStream inputStream) throws IOException {
        try {
            Object b = C12008k5.m52530b(new JsonReader(new InputStreamReader(inputStream)));
            if (b instanceof Map) {
                Object obj = ((Map) b).get("throttleSec");
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    Map<String, Long> map = this.f52687f;
                    map.put(str2 + "-" + str, Long.valueOf((((long) intValue) * 1000) + SystemClock.elapsedRealtime()));
                }
            }
        } catch (IOException e) {
            if (!(e instanceof MalformedJsonException)) {
                throw e;
            }
        }
    }
}
