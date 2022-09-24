package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t94 extends HandlerThread implements Handler.Callback {

    /* renamed from: b */
    private w22 f39340b;

    /* renamed from: c */
    private Handler f39341c;

    /* renamed from: d */
    private Error f39342d;

    /* renamed from: e */
    private RuntimeException f39343e;

    /* renamed from: f */
    private zzuq f39344f;

    public t94() {
        super("ExoPlayer:DummySurface");
    }

    /* renamed from: a */
    public final zzuq mo34874a(int i) {
        boolean z;
        start();
        this.f39341c = new Handler(getLooper(), this);
        this.f39340b = new w22(this.f39341c, (v12) null);
        synchronized (this) {
            z = false;
            this.f39341c.obtainMessage(1, i, 0).sendToTarget();
            while (this.f39344f == null && this.f39343e == null && this.f39342d == null) {
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
        RuntimeException runtimeException = this.f39343e;
        if (runtimeException == null) {
            Error error = this.f39342d;
            if (error == null) {
                zzuq zzuq = this.f39344f;
                Objects.requireNonNull(zzuq);
                return zzuq;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void mo34875b() {
        Handler handler = this.f39341c;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                w22 w22 = this.f39340b;
                Objects.requireNonNull(w22);
                w22.mo35544b(i2);
                this.f39344f = new zzuq(this, this.f39340b.mo35543a(), i2 != 0, (u94) null);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                fc2.m20475a("DummySurface", "Failed to initialize dummy surface", e);
                this.f39343e = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    fc2.m20475a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f39342d = e2;
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
                w22 w222 = this.f39340b;
                Objects.requireNonNull(w222);
                w222.mo35545c();
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
            quit();
            return true;
        }
    }
}
