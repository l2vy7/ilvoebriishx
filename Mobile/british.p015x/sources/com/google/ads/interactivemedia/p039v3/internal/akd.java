package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.ads.interactivemedia.p039v3.internal.ake;
import com.google.android.exoplayer2.C6540C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.ads.interactivemedia.v3.internal.akd */
/* compiled from: IMASDK */
final class akd<T extends ake> extends Handler implements Runnable {

    /* renamed from: a */
    public final int f15134a;

    /* renamed from: b */
    final /* synthetic */ aki f15135b;

    /* renamed from: c */
    private final T f15136c;

    /* renamed from: d */
    private final long f15137d;

    /* renamed from: e */
    private akb<T> f15138e;

    /* renamed from: f */
    private IOException f15139f;

    /* renamed from: g */
    private int f15140g;

    /* renamed from: h */
    private Thread f15141h;

    /* renamed from: i */
    private boolean f15142i;

    /* renamed from: j */
    private volatile boolean f15143j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akd(aki aki, Looper looper, T t, akb<T> akb, int i, long j) {
        super(looper);
        this.f15135b = aki;
        this.f15136c = t;
        this.f15138e = akb;
        this.f15134a = i;
        this.f15137d = j;
    }

    /* renamed from: d */
    private final void m13921d() {
        this.f15139f = null;
        ExecutorService l = this.f15135b.f15148d;
        akd k = this.f15135b.f15149e;
        aup.m14890u(k);
        l.execute(k);
    }

    /* renamed from: e */
    private final void m13922e() {
        this.f15135b.f15149e = null;
    }

    /* renamed from: a */
    public final void mo13835a(int i) throws IOException {
        IOException iOException = this.f15139f;
        if (iOException != null && this.f15140g > i) {
            throw iOException;
        }
    }

    /* renamed from: b */
    public final void mo13836b(long j) {
        aup.m14887r(this.f15135b.f15149e == null);
        this.f15135b.f15149e = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m13921d();
        }
    }

    /* renamed from: c */
    public final void mo13837c(boolean z) {
        this.f15143j = z;
        this.f15139f = null;
        if (hasMessages(0)) {
            this.f15142i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f15142i = true;
                this.f15136c.mo13355b();
                Thread thread = this.f15141h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            m13922e();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            akb<T> akb = this.f15138e;
            aup.m14890u(akb);
            akb.mo13374w(this.f15136c, elapsedRealtime, elapsedRealtime - this.f15137d, true);
            this.f15138e = null;
        }
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.f15143j) {
            int i = message.what;
            if (i == 0) {
                m13921d();
            } else if (i != 3) {
                m13922e();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.f15137d;
                akb<T> akb = this.f15138e;
                aup.m14890u(akb);
                if (this.f15142i) {
                    akb.mo13374w(this.f15136c, elapsedRealtime, j2, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        akb.mo13375x(this.f15136c, elapsedRealtime, j2);
                    } catch (RuntimeException e) {
                        ali.m14023b("LoadTask", "Unexpected exception handling load completed", e);
                        this.f15135b.f15150f = new akh(e);
                    }
                } else if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f15139f = iOException;
                    int i3 = this.f15140g + 1;
                    this.f15140g = i3;
                    akc v = akb.mo13373v(this.f15136c, elapsedRealtime, j2, iOException, i3);
                    if (v.f15132a == 3) {
                        this.f15135b.f15150f = this.f15139f;
                    } else if (v.f15132a != 2) {
                        if (v.f15132a == 1) {
                            this.f15140g = 1;
                        }
                        if (v.f15133b != C6540C.TIME_UNSET) {
                            j = v.f15133b;
                        } else {
                            j = (long) Math.min((this.f15140g - 1) * 1000, 5000);
                        }
                        mo13836b(j);
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
                z = !this.f15142i;
                this.f15141h = Thread.currentThread();
            }
            if (z) {
                String simpleName = this.f15136c.getClass().getSimpleName();
                if (simpleName.length() != 0) {
                    str = "load:".concat(simpleName);
                } else {
                    str = new String("load:");
                }
                age.m13544b(str);
                this.f15136c.mo13356c();
                age.m13545c();
            }
            synchronized (this) {
                this.f15141h = null;
                Thread.interrupted();
            }
            if (!this.f15143j) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f15143j) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.f15143j) {
                ali.m14023b("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new akh(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.f15143j) {
                ali.m14023b("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new akh(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.f15143j) {
                ali.m14023b("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            age.m13545c();
            throw th;
        }
    }
}
