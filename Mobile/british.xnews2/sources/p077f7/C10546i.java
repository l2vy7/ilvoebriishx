package p077f7;

/* renamed from: f7.i */
final /* synthetic */ class C10546i implements Runnable {

    /* renamed from: b */
    private final C10543f f49092b;

    C10546i(C10543f fVar) {
        this.f49092b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(r4.length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r3 = r0.f49089g.f49080a;
        r4 = r0.f49085c;
        r5 = android.os.Message.obtain();
        r5.what = r1.f49099c;
        r5.arg1 = r1.f49097a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo42672c());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f49100d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.f49086d.mo42671a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        r0.mo42660b(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            f7.f r0 = r8.f49092b
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f49084b     // Catch:{ all -> 0x00aa }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x000a:
            java.util.Queue<f7.m<?>> r1 = r0.f49087e     // Catch:{ all -> 0x00aa }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0017
            r0.mo42664g()     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return
        L_0x0017:
            java.util.Queue<f7.m<?>> r1 = r0.f49087e     // Catch:{ all -> 0x00aa }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00aa }
            f7.m r1 = (p077f7.C10550m) r1     // Catch:{ all -> 0x00aa }
            android.util.SparseArray<f7.m<?>> r3 = r0.f49088f     // Catch:{ all -> 0x00aa }
            int r4 = r1.f49097a     // Catch:{ all -> 0x00aa }
            r3.put(r4, r1)     // Catch:{ all -> 0x00aa }
            f7.d r3 = r0.f49089g     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f49081b     // Catch:{ all -> 0x00aa }
            f7.j r4 = new f7.j     // Catch:{ all -> 0x00aa }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00aa }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00aa }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00aa }
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r5 = r4.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
        L_0x0062:
            f7.d r3 = r0.f49089g
            android.content.Context r3 = r3.f49080a
            android.os.Messenger r4 = r0.f49085c
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f49099c
            r5.what = r6
            int r6 = r1.f49097a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo42672c()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f49100d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            f7.k r1 = r0.f49086d     // Catch:{ RemoteException -> 0x00a0 }
            r1.mo42671a(r5)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x0002
        L_0x00a0:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo42660b(r2, r1)
            goto L_0x0002
        L_0x00aa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00ad:
            throw r1
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f7.C10546i.run():void");
    }
}
