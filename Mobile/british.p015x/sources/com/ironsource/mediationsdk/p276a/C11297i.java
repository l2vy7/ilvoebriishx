package com.ironsource.mediationsdk.p276a;

import android.os.Handler;
import android.os.HandlerThread;
import com.ironsource.mediationsdk.logger.C11411c;

/* renamed from: com.ironsource.mediationsdk.a.i */
public final class C11297i extends Thread {

    /* renamed from: c */
    private static C11297i f50730c;

    /* renamed from: b */
    private C11298a f50731b;

    /* renamed from: com.ironsource.mediationsdk.a.i$a */
    class C11298a extends HandlerThread {

        /* renamed from: b */
        Handler f50732b;

        C11298a(String str) {
            super(str);
            setUncaughtExceptionHandler(new C11411c());
        }
    }

    private C11297i() {
        C11298a aVar = new C11298a(C11297i.class.getSimpleName());
        this.f50731b = aVar;
        aVar.start();
        C11298a aVar2 = this.f50731b;
        aVar2.f50732b = new Handler(aVar2.getLooper());
    }

    /* renamed from: a */
    public static synchronized C11297i m50472a() {
        C11297i iVar;
        synchronized (C11297i.class) {
            if (f50730c == null) {
                f50730c = new C11297i();
            }
            iVar = f50730c;
        }
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44011a(java.lang.Runnable r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ironsource.mediationsdk.a.i$a r0 = r1.f50731b     // Catch:{ all -> 0x0010 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.os.Handler r0 = r0.f50732b     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x000e
            r0.post(r2)     // Catch:{ all -> 0x0010 }
        L_0x000e:
            monitor-exit(r1)
            return
        L_0x0010:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p276a.C11297i.mo44011a(java.lang.Runnable):void");
    }
}
