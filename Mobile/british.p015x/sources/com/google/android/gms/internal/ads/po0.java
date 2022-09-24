package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class po0 {

    /* renamed from: a */
    public static final nb3 f37722a;

    /* renamed from: b */
    public static final nb3 f37723b;

    /* renamed from: c */
    public static final nb3 f37724c;

    /* renamed from: d */
    public static final ScheduledExecutorService f37725d = new ko0(3, new lo0("Schedule"));

    /* renamed from: e */
    public static final nb3 f37726e = new oo0(new mo0(), (no0) null);

    /* renamed from: f */
    public static final nb3 f37727f = new oo0(tb3.m37771b(), (no0) null);

    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = p006a5.C6482d.m28249a()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.c33.m30893a()
            com.google.android.gms.internal.ads.lo0 r0 = new com.google.android.gms.internal.ads.lo0
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            goto L_0x0031
        L_0x0019:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.google.android.gms.internal.ads.lo0 r8 = new com.google.android.gms.internal.ads.lo0
            r8.<init>(r1)
            r2 = 2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 10
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x0031:
            com.google.android.gms.internal.ads.oo0 r1 = new com.google.android.gms.internal.ads.oo0
            r2 = 0
            r1.<init>(r0, r2)
            f37722a = r1
            boolean r0 = p006a5.C6482d.m28249a()
            java.lang.String r1 = "Loader"
            r3 = 1
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.z23 r0 = com.google.android.gms.internal.ads.c33.m30893a()
            com.google.android.gms.internal.ads.lo0 r4 = new com.google.android.gms.internal.ads.lo0
            r4.<init>(r1)
            r1 = 5
            java.util.concurrent.ExecutorService r0 = r0.mo30615a(r1, r4, r3)
            goto L_0x006a
        L_0x0051:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.lo0 r11 = new com.google.android.gms.internal.ads.lo0
            r11.<init>(r1)
            r5 = 5
            r6 = 5
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x006a:
            com.google.android.gms.internal.ads.oo0 r1 = new com.google.android.gms.internal.ads.oo0
            r1.<init>(r0, r2)
            f37723b = r1
            boolean r0 = p006a5.C6482d.m28249a()
            java.lang.String r1 = "Activeview"
            if (r0 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.z23 r0 = com.google.android.gms.internal.ads.c33.m30893a()
            com.google.android.gms.internal.ads.lo0 r4 = new com.google.android.gms.internal.ads.lo0
            r4.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.mo30616b(r4, r3)
            goto L_0x00a0
        L_0x0087:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.lo0 r11 = new com.google.android.gms.internal.ads.lo0
            r11.<init>(r1)
            r5 = 1
            r6 = 1
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x00a0:
            com.google.android.gms.internal.ads.oo0 r1 = new com.google.android.gms.internal.ads.oo0
            r1.<init>(r0, r2)
            f37724c = r1
            com.google.android.gms.internal.ads.ko0 r0 = new com.google.android.gms.internal.ads.ko0
            com.google.android.gms.internal.ads.lo0 r1 = new com.google.android.gms.internal.ads.lo0
            java.lang.String r3 = "Schedule"
            r1.<init>(r3)
            r3 = 3
            r0.<init>(r3, r1)
            f37725d = r0
            com.google.android.gms.internal.ads.mo0 r0 = new com.google.android.gms.internal.ads.mo0
            r0.<init>()
            com.google.android.gms.internal.ads.oo0 r1 = new com.google.android.gms.internal.ads.oo0
            r1.<init>(r0, r2)
            f37726e = r1
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.tb3.m37771b()
            com.google.android.gms.internal.ads.oo0 r1 = new com.google.android.gms.internal.ads.oo0
            r1.<init>(r0, r2)
            f37727f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.po0.<clinit>():void");
    }
}
