package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.C2686a0;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.m0 */
class C2846m0 {

    /* renamed from: h */
    static final String f11541h = "adcolony_android";

    /* renamed from: i */
    static final String f11542i = "adcolony_fatal_reports";

    /* renamed from: a */
    C2977y f11543a;

    /* renamed from: b */
    ScheduledExecutorService f11544b;

    /* renamed from: c */
    List<C2686a0> f11545c = new ArrayList();

    /* renamed from: d */
    List<C2686a0> f11546d = new ArrayList();

    /* renamed from: e */
    HashMap<String, Object> f11547e;

    /* renamed from: f */
    private C2972w f11548f = new C2972w(f11541h, "4.5.0", "Production");

    /* renamed from: g */
    private C2972w f11549g = new C2972w(f11542i, "4.5.0", "Production");

    /* renamed from: com.adcolony.sdk.m0$a */
    class C2847a implements Runnable {
        C2847a() {
        }

        public void run() {
            C2846m0.this.mo9816a();
        }
    }

    /* renamed from: com.adcolony.sdk.m0$b */
    class C2848b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2686a0 f11551a;

        C2848b(C2686a0 a0Var) {
            this.f11551a = a0Var;
        }

        public void run() {
            C2846m0.this.f11545c.add(this.f11551a);
        }
    }

    C2846m0(C2977y yVar, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f11543a = yVar;
        this.f11544b = scheduledExecutorService;
        this.f11547e = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9817a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f11544b.isShutdown() && !this.f11544b.isTerminated()) {
                this.f11544b.scheduleAtFixedRate(new C2847a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f11544b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo9821b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f11544b     // Catch:{ all -> 0x004c }
            r0.shutdown()     // Catch:{ all -> 0x004c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f11544b     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003e }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x004a
            java.util.concurrent.ScheduledExecutorService r0 = r4.f11544b     // Catch:{ InterruptedException -> 0x003e }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f11544b     // Catch:{ InterruptedException -> 0x003e }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x004a
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003e }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003e }
            java.lang.Class r2 = r4.getClass()     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003e }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003e }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003e }
            goto L_0x004a
        L_0x003e:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f11544b     // Catch:{ all -> 0x004c }
            r0.shutdownNow()     // Catch:{ all -> 0x004c }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004c }
            r0.interrupt()     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r4)
            return
        L_0x004c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2846m0.mo9821b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo9824c(String str) {
        mo9822b(new C2686a0.C2687a().mo9541a(2).mo9542a(this.f11548f).mo9543a(str).mo9545a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo9825d(String str) {
        mo9822b(new C2686a0.C2687a().mo9541a(1).mo9542a(this.f11548f).mo9543a(str).mo9545a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo9826e(String str) {
        this.f11547e.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo9827f(String str) {
        this.f11547e.put("sessionId", str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    synchronized void mo9816a() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0049 }
            java.util.List<com.adcolony.sdk.a0> r0 = r2.f11545c     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            if (r0 <= 0) goto L_0x001c
            com.adcolony.sdk.w r0 = r2.f11548f     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.a0> r1 = r2.f11545c     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.lang.String r0 = r2.mo9815a((com.adcolony.sdk.C2972w) r0, (java.util.List<com.adcolony.sdk.C2686a0>) r1)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            com.adcolony.sdk.y r1 = r2.f11543a     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r1.mo10083a(r0)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.a0> r0 = r2.f11545c     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r0.clear()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
        L_0x001c:
            java.util.List<com.adcolony.sdk.a0> r0 = r2.f11546d     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            if (r0 <= 0) goto L_0x0044
            com.adcolony.sdk.w r0 = r2.f11549g     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.a0> r1 = r2.f11546d     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.lang.String r0 = r2.mo9815a((com.adcolony.sdk.C2972w) r0, (java.util.List<com.adcolony.sdk.C2686a0>) r1)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            com.adcolony.sdk.y r1 = r2.f11543a     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r1.mo10083a(r0)     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            java.util.List<com.adcolony.sdk.a0> r0 = r2.f11546d     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            r0.clear()     // Catch:{ IOException -> 0x003f, JSONException -> 0x0039 }
            goto L_0x0044
        L_0x0037:
            r0 = move-exception
            goto L_0x0047
        L_0x0039:
            java.util.List<com.adcolony.sdk.a0> r0 = r2.f11545c     // Catch:{ all -> 0x0037 }
            r0.clear()     // Catch:{ all -> 0x0037 }
            goto L_0x0044
        L_0x003f:
            java.util.List<com.adcolony.sdk.a0> r0 = r2.f11545c     // Catch:{ all -> 0x0037 }
            r0.clear()     // Catch:{ all -> 0x0037 }
        L_0x0044:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)
            return
        L_0x0047:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2846m0.mo9816a():void");
    }

    /* renamed from: c */
    private synchronized JSONObject m9831c(C2686a0 a0Var) throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject(this.f11547e);
        jSONObject.put("environment", a0Var.mo9533a().mo10079a());
        jSONObject.put("level", a0Var.mo9537c());
        jSONObject.put("message", a0Var.mo9538d());
        jSONObject.put("clientTimestamp", a0Var.mo9539e());
        JSONObject mediationInfo = C2684a.m9409c().mo9733t().getMediationInfo();
        JSONObject pluginInfo = C2684a.m9409c().mo9733t().getPluginInfo();
        double g = C2684a.m9409c().mo9723j().mo9854g();
        jSONObject.put("mediation_network", C2976x.m10337i(mediationInfo, MediationMetaData.KEY_NAME));
        jSONObject.put("mediation_network_version", C2976x.m10337i(mediationInfo, MediationMetaData.KEY_VERSION));
        jSONObject.put("plugin", C2976x.m10337i(pluginInfo, MediationMetaData.KEY_NAME));
        jSONObject.put("plugin_version", C2976x.m10337i(pluginInfo, MediationMetaData.KEY_VERSION));
        jSONObject.put("batteryInfo", g);
        if (a0Var instanceof C2919t) {
            jSONObject = C2976x.m10307a(jSONObject, ((C2919t) a0Var).mo9985f());
            jSONObject.put("platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo9823b(String str) {
        mo9822b(new C2686a0.C2687a().mo9541a(0).mo9542a(this.f11548f).mo9543a(str).mo9545a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo9822b(C2686a0 a0Var) {
        try {
            if (!this.f11544b.isShutdown() && !this.f11544b.isTerminated()) {
                this.f11544b.submit(new C2848b(a0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9820a(String str) {
        mo9822b(new C2686a0.C2687a().mo9541a(3).mo9542a(this.f11548f).mo9543a(str).mo9545a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9819a(C2919t tVar) {
        tVar.mo9535a(this.f11549g);
        tVar.mo9534a(-1);
        mo9818a((C2686a0) tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9818a(C2686a0 a0Var) {
        this.f11546d.add(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9815a(C2972w wVar, List<C2686a0> list) throws IOException, JSONException {
        String b = C2684a.m9409c().mo9723j().mo9847b();
        String str = this.f11547e.get("advertiserId") != null ? (String) this.f11547e.get("advertiserId") : C3791bd.UNKNOWN_CONTENT_TYPE;
        if (b != null && b.length() > 0 && !b.equals(str)) {
            this.f11547e.put("advertiserId", b);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", wVar.mo10081c());
        jSONObject.put("environment", wVar.mo10079a());
        jSONObject.put(MediationMetaData.KEY_VERSION, wVar.mo10082d());
        JSONArray jSONArray = new JSONArray();
        for (C2686a0 c : list) {
            jSONArray.put(m9831c(c));
        }
        jSONObject.put("logs", jSONArray);
        return jSONObject.toString();
    }
}
