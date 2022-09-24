package com.google.ads.interactivemedia.p039v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amr */
/* compiled from: IMASDK */
final class C3843amr extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    private akx f15324a;

    /* renamed from: b */
    private Handler f15325b;

    /* renamed from: c */
    private Error f15326c;

    /* renamed from: d */
    private RuntimeException f15327d;

    /* renamed from: e */
    private ams f15328e;

    public C3843amr() {
        super("ExoPlayer:DummySurface");
    }

    /* renamed from: a */
    public final ams mo14008a(int i) {
        boolean z;
        start();
        this.f15325b = new Handler(getLooper(), this);
        this.f15324a = new akx(this.f15325b);
        synchronized (this) {
            z = false;
            this.f15325b.obtainMessage(1, i, 0).sendToTarget();
            while (this.f15328e == null && this.f15327d == null && this.f15326c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f15327d;
        if (runtimeException == null) {
            Error error = this.f15326c;
            if (error == null) {
                ams ams = this.f15328e;
                aup.m14890u(ams);
                return ams;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo14009b() {
        aup.m14890u(this.f15325b);
        this.f15325b.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                aup.m14890u(this.f15324a);
                this.f15324a.mo13863a(i2);
                this.f15328e = new ams(this, this.f15324a.mo13865c());
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                ali.m14023b("DummySurface", "Failed to initialize dummy surface", e);
                this.f15327d = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    ali.m14023b("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f15326c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                aup.m14890u(this.f15324a);
                this.f15324a.mo13864b();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
