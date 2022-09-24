package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import com.google.android.gms.internal.ads.d94;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c94<T extends d94> extends Handler implements Runnable {

    /* renamed from: b */
    private final T f30289b;

    /* renamed from: c */
    private final long f30290c;

    /* renamed from: d */
    private z84<T> f30291d;

    /* renamed from: e */
    private IOException f30292e;

    /* renamed from: f */
    private int f30293f;

    /* renamed from: g */
    private Thread f30294g;

    /* renamed from: h */
    private boolean f30295h;

    /* renamed from: i */
    private volatile boolean f30296i;

    /* renamed from: j */
    final /* synthetic */ i94 f30297j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c94(i94 i94, Looper looper, T t, z84<T> z84, int i, long j) {
        super(looper);
        this.f30297j = i94;
        this.f30289b = t;
        this.f30291d = z84;
        this.f30290c = j;
    }

    /* renamed from: d */
    private final void m30933d() {
        this.f30292e = null;
        ExecutorService d = this.f30297j.f33156a;
        c94 c = this.f30297j.f33157b;
        Objects.requireNonNull(c);
        d.execute(c);
    }

    /* renamed from: a */
    public final void mo30864a(boolean z) {
        this.f30296i = z;
        this.f30292e = null;
        if (hasMessages(0)) {
            this.f30295h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f30295h = true;
                this.f30289b.zzh();
                Thread thread = this.f30294g;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f30297j.f33157b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            z84<T> z84 = this.f30291d;
            Objects.requireNonNull(z84);
            z84.mo18204f(this.f30289b, elapsedRealtime, elapsedRealtime - this.f30290c, true);
            this.f30291d = null;
        }
    }

    /* renamed from: b */
    public final void mo30865b(int i) throws IOException {
        IOException iOException = this.f30292e;
        if (iOException != null && this.f30293f > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo30866c(long j) {
        nu1.m20747f(this.f30297j.f33157b == null);
        this.f30297j.f33157b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m30933d();
        }
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.f30296i) {
            int i = message.what;
            if (i == 0) {
                m30933d();
            } else if (i != 3) {
                this.f30297j.f33157b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f30290c;
                z84<T> z84 = this.f30291d;
                Objects.requireNonNull(z84);
                if (this.f30295h) {
                    z84.mo18204f(this.f30289b, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        z84.mo18202d(this.f30289b, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        fc2.m20475a("LoadTask", "Unexpected exception handling load completed", e);
                        this.f30297j.f33158c = new h94(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f30292e = iOException;
                    int i3 = this.f30293f + 1;
                    this.f30293f = i3;
                    b94 j3 = z84.mo18208j(this.f30289b, elapsedRealtime, j2, iOException, i3);
                    if (j3.f29938a == 3) {
                        this.f30297j.f33158c = this.f30292e;
                    } else if (j3.f29938a != 2) {
                        if (j3.f29938a == 1) {
                            this.f30293f = 1;
                        }
                        if (j3.f29939b != C6540C.TIME_UNSET) {
                            j = j3.f29939b;
                        } else {
                            j = (long) Math.min((this.f30293f - 1) * 1000, 5000);
                        }
                        mo30866c(j);
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        String str;
        try {
            synchronized (this) {
                z = !this.f30295h;
                this.f30294g = Thread.currentThread();
            }
            if (z) {
                String simpleName = this.f30289b.getClass().getSimpleName();
                if (simpleName.length() != 0) {
                    str = "load:".concat(simpleName);
                } else {
                    str = new String("load:");
                }
                bz2.m30876a(str);
                this.f30289b.zzi();
                bz2.m30877b();
            }
            synchronized (this) {
                this.f30294g = null;
                Thread.interrupted();
            }
            if (!this.f30296i) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f30296i) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.f30296i) {
                fc2.m20475a("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new h94(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f30296i) {
                fc2.m20475a("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new h94(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f30296i) {
                fc2.m20475a("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            bz2.m30877b();
            throw th;
        }
    }
}
