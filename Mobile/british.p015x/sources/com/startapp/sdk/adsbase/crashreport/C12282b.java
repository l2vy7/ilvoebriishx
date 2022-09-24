package com.startapp.sdk.adsbase.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import com.startapp.C5015nb;
import com.startapp.sdk.components.C12305h;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.startapp.sdk.adsbase.crashreport.b */
/* compiled from: Sta */
public class C12282b extends Thread implements Handler.Callback, Printer {

    /* renamed from: a */
    public C12286d f54581a = new C12283a(this);

    /* renamed from: b */
    public C12287e f54582b = new C12284b(this);

    /* renamed from: c */
    public C12289g f54583c = new C12285c(this);

    /* renamed from: d */
    public C12288f f54584d;

    /* renamed from: e */
    public final Handler f54585e = new Handler(Looper.getMainLooper(), this);

    /* renamed from: f */
    public final AtomicLong f54586f = new AtomicLong(0);

    /* renamed from: g */
    public final long f54587g;

    /* renamed from: h */
    public final AtomicReference<String> f54588h = new AtomicReference<>("");

    /* renamed from: i */
    public final boolean f54589i;

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$a */
    /* compiled from: Sta */
    public class C12283a implements C12286d {
        public C12283a(C12282b bVar) {
        }

        /* renamed from: a */
        public void mo46230a() {
        }

        /* renamed from: a */
        public boolean mo46231a(long j, String str) {
            return false;
        }

        public void remove() {
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$b */
    /* compiled from: Sta */
    public class C12284b implements C12287e {
        public C12284b(C12282b bVar) {
        }

        /* renamed from: a */
        public long mo46239a(long j) {
            return 0;
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$c */
    /* compiled from: Sta */
    public class C12285c implements C12289g {
        public C12285c(C12282b bVar) {
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$d */
    /* compiled from: Sta */
    public interface C12286d {
        /* renamed from: a */
        void mo46230a();

        /* renamed from: a */
        boolean mo46231a(long j, String str);

        void remove();
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$e */
    /* compiled from: Sta */
    public interface C12287e {
        /* renamed from: a */
        long mo46239a(long j);
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$f */
    /* compiled from: Sta */
    public interface C12288f {
    }

    /* renamed from: com.startapp.sdk.adsbase.crashreport.b$g */
    /* compiled from: Sta */
    public interface C12289g {
    }

    public C12282b(long j, boolean z) {
        super("startapp-anr");
        this.f54587g = j;
        this.f54589i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0048 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46233a() {
        /*
            r12 = this;
            long r0 = r12.f54587g
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 1
        L_0x0006:
            boolean r6 = r12.isInterrupted()
            if (r6 != 0) goto L_0x008b
            java.util.concurrent.atomic.AtomicLong r6 = r12.f54586f
            long r6 = r6.getAndAdd(r0)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r5 = r12.f54588h
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r12.mo46234a(r5)
            if (r5 != 0) goto L_0x002e
            com.startapp.sdk.adsbase.crashreport.b$d r4 = r12.f54581a
            r4.remove()
            r4 = 0
        L_0x002e:
            android.os.Handler r5 = r12.f54585e
            r6 = 101(0x65, float:1.42E-43)
            r5.sendEmptyMessage(r6)
            r5 = 1
        L_0x0036:
            monitor-enter(r12)     // Catch:{ InterruptedException -> 0x0040, all -> 0x0045 }
            r12.wait(r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r12)     // Catch:{ all -> 0x003d }
            r6 = 0
            goto L_0x0046
        L_0x003d:
            r6 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x003d }
            throw r6     // Catch:{ InterruptedException -> 0x0040, all -> 0x0045 }
        L_0x0040:
            com.startapp.sdk.adsbase.crashreport.b$g r6 = r12.f54583c
            r6.getClass()
        L_0x0045:
            r6 = 1
        L_0x0046:
            if (r6 == 0) goto L_0x0049
            return
        L_0x0049:
            java.util.concurrent.atomic.AtomicLong r6 = r12.f54586f
            long r6 = r6.get()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r10 = r12.f54588h
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0006
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0065
            boolean r11 = r12.mo46234a(r10)
            if (r11 == 0) goto L_0x0006
        L_0x0065:
            boolean r11 = android.os.Debug.isDebuggerConnected()
            if (r11 != 0) goto L_0x0088
            boolean r11 = android.os.Debug.waitingForDebugger()
            if (r11 == 0) goto L_0x0072
            goto L_0x0088
        L_0x0072:
            com.startapp.sdk.adsbase.crashreport.b$e r0 = r12.f54582b
            long r0 = r0.mo46239a(r6)
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x007e
            r5 = 0
            goto L_0x0006
        L_0x007e:
            com.startapp.sdk.adsbase.crashreport.b$d r0 = r12.f54581a
            boolean r4 = r0.mo46231a(r6, r10)
            long r0 = r12.f54587g
            goto L_0x0006
        L_0x0088:
            r4 = 1
            goto L_0x0006
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.crashreport.C12282b.mo46233a():void");
    }

    public boolean handleMessage(Message message) {
        this.f54586f.set(0);
        return true;
    }

    public void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f54588h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f54588h.set("");
            this.f54586f.set(0);
        }
    }

    public void run() {
        try {
            mo46233a();
        } catch (Throwable unused) {
        }
    }

    public void start() {
        this.f54581a.mo46230a();
        this.f54581a.remove();
        if (this.f54589i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    /* renamed from: a */
    public final boolean mo46234a(String str) {
        boolean z = !this.f54589i || !TextUtils.isEmpty(str);
        C12288f fVar = this.f54584d;
        boolean z2 = fVar == null || (C5015nb.m22936e(((C12305h) fVar).f54696a.f22505b) ^ true);
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
