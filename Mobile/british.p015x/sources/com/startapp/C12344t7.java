package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5069e;

/* renamed from: com.startapp.t7 */
/* compiled from: Sta */
public abstract class C12344t7<T> extends C11896f2<T> {

    /* renamed from: e */
    public final C5069e f54760e;

    /* renamed from: f */
    public final C12071n3 f54761f;

    /* renamed from: g */
    public final String f54762g;

    /* renamed from: h */
    public final String f54763h;

    /* renamed from: i */
    public final Runnable f54764i = new C12345a();

    /* renamed from: com.startapp.t7$a */
    /* compiled from: Sta */
    public class C12345a implements Runnable {
        public C12345a() {
        }

        public void run() {
            C12344t7.this.mo45395g();
        }
    }

    public C12344t7(Context context, C5069e eVar, C12071n3 n3Var, String str, String str2) {
        super(context, 1000);
        this.f54760e = eVar;
        this.f54761f = n3Var;
        this.f54762g = str;
        this.f54763h = str2;
    }

    /* renamed from: a */
    public final T mo45341a() {
        T a;
        if (!mo45394f()) {
            return null;
        }
        synchronized (this) {
            a = mo45391a(this.f54760e.getString(this.f54762g, (String) null));
        }
        return a;
    }

    /* renamed from: a */
    public abstract T mo45391a(String str);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public synchronized void mo46638b(T r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x0020
            com.startapp.sdk.adsbase.e r0 = r4.f54760e     // Catch:{ all -> 0x0046 }
            com.startapp.sdk.adsbase.e$a r0 = r0.edit()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = r4.f54762g     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = r4.mo45484c(r5)     // Catch:{ all -> 0x0046 }
            com.startapp.sdk.adsbase.e$a r5 = r0.mo21100a((java.lang.String) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r4.f54763h     // Catch:{ all -> 0x0046 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0046 }
            com.startapp.sdk.adsbase.e$a r5 = r5.mo21099a((java.lang.String) r0, (long) r1)     // Catch:{ all -> 0x0046 }
            r5.apply()     // Catch:{ all -> 0x0046 }
        L_0x0020:
            long r0 = r4.mo45393d()     // Catch:{ all -> 0x0046 }
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0046 }
            monitor-enter(r4)     // Catch:{ all -> 0x0046 }
            boolean r5 = r4.mo45394f()     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0040
            com.startapp.n3 r5 = r4.f54761f     // Catch:{ all -> 0x0043 }
            java.lang.Runnable r2 = r4.f54764i     // Catch:{ all -> 0x0043 }
            r5.mo45564a(r2)     // Catch:{ all -> 0x0043 }
            com.startapp.n3 r5 = r4.f54761f     // Catch:{ all -> 0x0043 }
            java.lang.Runnable r2 = r4.f54764i     // Catch:{ all -> 0x0043 }
            r5.mo45565a(r2, r0)     // Catch:{ all -> 0x0043 }
        L_0x0040:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)
            return
        L_0x0043:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r5     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12344t7.mo46638b(java.lang.Object):void");
    }

    /* renamed from: c */
    public String mo45484c(T t) {
        return t.toString();
    }

    /* renamed from: d */
    public abstract long mo45393d();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public synchronized void mo46639e() {
        /*
            r8 = this;
            monitor-enter(r8)
            com.startapp.sdk.adsbase.e r0 = r8.f54760e     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r8.f54763h     // Catch:{ all -> 0x003b }
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch:{ all -> 0x003b }
            long r4 = r8.mo45393d()     // Catch:{ all -> 0x003b }
            r6 = 60000(0xea60, double:2.9644E-319)
            long r4 = java.lang.Math.max(r6, r4)     // Catch:{ all -> 0x003b }
            long r4 = r4 + r0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003b }
            long r4 = r4 - r0
            long r0 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x003b }
            monitor-enter(r8)     // Catch:{ all -> 0x003b }
            boolean r2 = r8.mo45394f()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0035
            com.startapp.n3 r2 = r8.f54761f     // Catch:{ all -> 0x0038 }
            java.lang.Runnable r3 = r8.f54764i     // Catch:{ all -> 0x0038 }
            r2.mo45564a(r3)     // Catch:{ all -> 0x0038 }
            com.startapp.n3 r2 = r8.f54761f     // Catch:{ all -> 0x0038 }
            java.lang.Runnable r3 = r8.f54764i     // Catch:{ all -> 0x0038 }
            r2.mo45565a(r3, r0)     // Catch:{ all -> 0x0038 }
        L_0x0035:
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            monitor-exit(r8)
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12344t7.mo46639e():void");
    }

    /* renamed from: f */
    public abstract boolean mo45394f();

    /* renamed from: g */
    public abstract void mo45395g();
}
