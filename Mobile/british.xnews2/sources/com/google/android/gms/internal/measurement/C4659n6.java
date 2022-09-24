package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.n6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public abstract class C4659n6 {

    /* renamed from: g */
    private static final Object f21244g = new Object();
    @Nullable

    /* renamed from: h */
    private static volatile C4658l6 f21245h;

    /* renamed from: i */
    private static final AtomicReference f21246i = new AtomicReference();

    /* renamed from: j */
    private static final C9297p6 f21247j = new C9297p6(C9130e6.f45004a, (byte[]) null);

    /* renamed from: k */
    private static final AtomicInteger f21248k = new AtomicInteger();

    /* renamed from: l */
    public static final /* synthetic */ int f21249l = 0;

    /* renamed from: a */
    final C4657k6 f21250a;

    /* renamed from: b */
    final String f21251b;

    /* renamed from: c */
    private final Object f21252c;

    /* renamed from: d */
    private volatile int f21253d = -1;

    /* renamed from: e */
    private volatile Object f21254e;

    /* renamed from: f */
    private final boolean f21255f;

    /* synthetic */ C4659n6(C4657k6 k6Var, String str, Object obj, boolean z, C9251m6 m6Var) {
        if (k6Var.f21236b != null) {
            this.f21250a = k6Var;
            this.f21251b = str;
            this.f21252c = obj;
            this.f21255f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    static void m21448d() {
        f21248k.incrementAndGet();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static void m21449e(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.l6 r0 = f21245h
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f21244g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.l6 r1 = f21245h     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.measurement.l6 r1 = f21245h     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo19206a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            com.google.android.gms.internal.measurement.C9359t5.m43654e()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.C9282o6.m43326c()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.C4650a6.m21417e()     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.f6 r1 = new com.google.android.gms.internal.measurement.f6     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.v6 r1 = com.google.android.gms.internal.measurement.C9451z6.m43938a(r1)     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.measurement.p5 r2 = new com.google.android.gms.internal.measurement.p5     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f21245h = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f21248k     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4659n6.m21449e(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo19200a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo19208b() {
        /*
            r7 = this;
            boolean r0 = r7.f21255f
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r7.f21251b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f21248k
            int r0 = r0.get()
            int r1 = r7.f21253d
            if (r1 >= r0) goto L_0x0119
            monitor-enter(r7)
            int r1 = r7.f21253d     // Catch:{ all -> 0x0116 }
            if (r1 >= r0) goto L_0x0114
            com.google.android.gms.internal.measurement.l6 r1 = f21245h     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x010e
            com.google.android.gms.internal.measurement.k6 r2 = r7.f21250a     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.f21240f     // Catch:{ all -> 0x0116 }
            android.content.Context r2 = r1.mo19206a()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.a6 r2 = com.google.android.gms.internal.measurement.C4650a6.m21416b(r2)     // Catch:{ all -> 0x0116 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.mo19172a(r3)     // Catch:{ all -> 0x0116 }
            r3 = 0
            if (r2 == 0) goto L_0x006c
            java.util.regex.Pattern r4 = com.google.android.gms.internal.measurement.C9266n5.f45302c     // Catch:{ all -> 0x0116 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.mo19209c()     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0116 }
            int r6 = r5.length()     // Catch:{ all -> 0x0116 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0116 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0116 }
            r5.<init>(r4)     // Catch:{ all -> 0x0116 }
            r4 = r5
        L_0x0067:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0116 }
        L_0x006a:
            r2 = r3
            goto L_0x00b3
        L_0x006c:
            com.google.android.gms.internal.measurement.k6 r2 = r7.f21250a     // Catch:{ all -> 0x0116 }
            android.net.Uri r2 = r2.f21236b     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0097
            android.content.Context r2 = r1.mo19206a()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.k6 r4 = r7.f21250a     // Catch:{ all -> 0x0116 }
            android.net.Uri r4 = r4.f21236b     // Catch:{ all -> 0x0116 }
            boolean r2 = com.google.android.gms.internal.measurement.C9098c6.m42749a(r2, r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.measurement.k6 r2 = r7.f21250a     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.f21242h     // Catch:{ all -> 0x0116 }
            android.content.Context r2 = r1.mo19206a()     // Catch:{ all -> 0x0116 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.k6 r4 = r7.f21250a     // Catch:{ all -> 0x0116 }
            android.net.Uri r4 = r4.f21236b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.t5 r2 = com.google.android.gms.internal.measurement.C9359t5.m43653b(r2, r4)     // Catch:{ all -> 0x0116 }
            goto L_0x00a3
        L_0x0095:
            r2 = r3
            goto L_0x00a3
        L_0x0097:
            android.content.Context r2 = r1.mo19206a()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.k6 r4 = r7.f21250a     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = r4.f21235a     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.o6 r2 = com.google.android.gms.internal.measurement.C9282o6.m43325b(r2, r3)     // Catch:{ all -> 0x0116 }
        L_0x00a3:
            if (r2 == 0) goto L_0x006a
            java.lang.String r4 = r7.mo19209c()     // Catch:{ all -> 0x0116 }
            java.lang.Object r2 = r2.mo19172a(r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r7.mo19200a(r2)     // Catch:{ all -> 0x0116 }
        L_0x00b3:
            if (r2 == 0) goto L_0x00b6
            goto L_0x00de
        L_0x00b6:
            com.google.android.gms.internal.measurement.k6 r2 = r7.f21250a     // Catch:{ all -> 0x0116 }
            boolean r2 = r2.f21239e     // Catch:{ all -> 0x0116 }
            if (r2 != 0) goto L_0x00d9
            android.content.Context r2 = r1.mo19206a()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.a6 r2 = com.google.android.gms.internal.measurement.C4650a6.m21416b(r2)     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.k6 r4 = r7.f21250a     // Catch:{ all -> 0x0116 }
            boolean r4 = r4.f21239e     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x00cc
            r4 = r3
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r4 = r7.f21251b     // Catch:{ all -> 0x0116 }
        L_0x00ce:
            java.lang.String r2 = r2.mo19172a(r4)     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r7.mo19200a(r2)     // Catch:{ all -> 0x0116 }
            goto L_0x00da
        L_0x00d9:
            r2 = r3
        L_0x00da:
            if (r2 != 0) goto L_0x00de
            java.lang.Object r2 = r7.f21252c     // Catch:{ all -> 0x0116 }
        L_0x00de:
            com.google.android.gms.internal.measurement.v6 r1 = r1.mo19207b()     // Catch:{ all -> 0x0116 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.s6 r1 = (com.google.android.gms.internal.measurement.C9344s6) r1     // Catch:{ all -> 0x0116 }
            boolean r4 = r1.mo19214b()     // Catch:{ all -> 0x0116 }
            if (r4 == 0) goto L_0x0109
            java.lang.Object r1 = r1.mo19213a()     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.b6 r1 = (com.google.android.gms.internal.measurement.C4651b6) r1     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.measurement.k6 r2 = r7.f21250a     // Catch:{ all -> 0x0116 }
            android.net.Uri r4 = r2.f21236b     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f21238d     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r7.f21251b     // Catch:{ all -> 0x0116 }
            java.lang.String r1 = r1.mo19175a(r4, r3, r2, r5)     // Catch:{ all -> 0x0116 }
            if (r1 != 0) goto L_0x0105
            java.lang.Object r2 = r7.f21252c     // Catch:{ all -> 0x0116 }
            goto L_0x0109
        L_0x0105:
            java.lang.Object r2 = r7.mo19200a(r1)     // Catch:{ all -> 0x0116 }
        L_0x0109:
            r7.f21254e = r2     // Catch:{ all -> 0x0116 }
            r7.f21253d = r0     // Catch:{ all -> 0x0116 }
            goto L_0x0114
        L_0x010e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0116 }
            r0.<init>(r2)     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r7)     // Catch:{ all -> 0x0116 }
            goto L_0x0119
        L_0x0116:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0116 }
            throw r0
        L_0x0119:
            java.lang.Object r0 = r7.f21254e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4659n6.mo19208b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo19209c() {
        String str = this.f21250a.f21238d;
        return this.f21251b;
    }
}
