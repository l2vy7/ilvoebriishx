package p243q4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.cast.C8564i0;
import java.util.Locale;

/* renamed from: q4.r */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10948r {

    /* renamed from: f */
    private static final C10922b f49892f = new C10922b("RequestTracker");

    /* renamed from: g */
    public static final Object f49893g = new Object();

    /* renamed from: a */
    private final long f49894a;

    /* renamed from: b */
    private final Handler f49895b = new C8564i0(Looper.getMainLooper());

    /* renamed from: c */
    long f49896c = -1;

    /* renamed from: d */
    C10946p f49897d;

    /* renamed from: e */
    Runnable f49898e;

    public C10948r(long j) {
        this.f49894a = j;
    }

    /* renamed from: g */
    private final boolean m49280g(int i, Object obj) {
        synchronized (f49893g) {
            long j = this.f49896c;
            if (j == -1) {
                return false;
            }
            m49281h(i, (Object) null, String.format(Locale.ROOT, "clearing request %d", new Object[]{Long.valueOf(j)}));
            return true;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    private final void m49281h(int r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            q4.b r0 = f49892f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.mo43190a(r6, r1)
            java.lang.Object r6 = f49893g
            monitor-enter(r6)
            q4.p r0 = r3.f49897d     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0014
            long r1 = r3.f49896c     // Catch:{ all -> 0x002f }
            r0.mo29608b(r1, r4, r5)     // Catch:{ all -> 0x002f }
        L_0x0014:
            r4 = -1
            r3.f49896c = r4     // Catch:{ all -> 0x002f }
            r4 = 0
            r3.f49897d = r4     // Catch:{ all -> 0x002f }
            monitor-enter(r6)     // Catch:{ all -> 0x002f }
            java.lang.Runnable r5 = r3.f49898e     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x0022
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0022:
            android.os.Handler r0 = r3.f49895b     // Catch:{ all -> 0x002c }
            r0.removeCallbacks(r5)     // Catch:{ all -> 0x002c }
            r3.f49898e = r4     // Catch:{ all -> 0x002c }
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            return
        L_0x002c:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002c }
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p243q4.C10948r.m49281h(int, java.lang.Object, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo43249a(long j, C10946p pVar) {
        C10946p pVar2;
        long j2;
        Object obj = f49893g;
        synchronized (obj) {
            pVar2 = this.f49897d;
            j2 = this.f49896c;
            this.f49896c = j;
            this.f49897d = pVar;
        }
        if (pVar2 != null) {
            pVar2.mo29607a(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.f49898e;
            if (runnable != null) {
                this.f49895b.removeCallbacks(runnable);
            }
            C10947q qVar = new C10947q(this);
            this.f49898e = qVar;
            this.f49895b.postDelayed(qVar, this.f49894a);
        }
    }

    /* renamed from: b */
    public final boolean mo43250b() {
        boolean z;
        synchronized (f49893g) {
            z = this.f49896c != -1;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo43251c(long j) {
        boolean z;
        synchronized (f49893g) {
            long j2 = this.f49896c;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43252d(long r8, int r10, java.lang.Object r11) {
        /*
            r7 = this;
            java.lang.Object r0 = f49893g
            monitor-enter(r0)
            long r1 = r7.f49896c     // Catch:{ all -> 0x0028 }
            r3 = -1
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0026
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0026
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch:{ all -> 0x0028 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0028 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0028 }
            r3[r5] = r8     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = "request %d completed"
            java.lang.String r8 = java.lang.String.format(r1, r8, r3)     // Catch:{ all -> 0x0028 }
            r7.m49281h(r10, r11, r8)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r2
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return r5
        L_0x0028:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p243q4.C10948r.mo43252d(long, int, java.lang.Object):boolean");
    }

    /* renamed from: e */
    public final boolean mo43253e(int i) {
        return m49280g(2002, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo43254f() {
        synchronized (f49893g) {
            if (this.f49896c != -1) {
                m49280g(15, (Object) null);
            }
        }
    }
}
