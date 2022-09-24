package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.C8054pl;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.internal.ads.ol */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8019ol<T extends C8054pl> extends Handler implements Runnable {

    /* renamed from: b */
    private final T f36520b;

    /* renamed from: c */
    private final C7983nl<T> f36521c;

    /* renamed from: d */
    public final int f36522d;

    /* renamed from: e */
    private final long f36523e;

    /* renamed from: f */
    private IOException f36524f;

    /* renamed from: g */
    private int f36525g;

    /* renamed from: h */
    private volatile Thread f36526h;

    /* renamed from: i */
    private volatile boolean f36527i;

    /* renamed from: j */
    final /* synthetic */ C8126rl f36528j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8019ol(C8126rl rlVar, Looper looper, T t, C7983nl<T> nlVar, int i, long j) {
        super(looper);
        this.f36528j = rlVar;
        this.f36520b = t;
        this.f36521c = nlVar;
        this.f36522d = i;
        this.f36523e = j;
    }

    /* renamed from: d */
    private final void m35751d() {
        this.f36524f = null;
        this.f36528j.f38701a.execute(this.f36528j.f38702b);
    }

    /* renamed from: a */
    public final void mo33939a(boolean z) {
        this.f36527i = z;
        this.f36524f = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f36520b.zzb();
            if (this.f36526h != null) {
                this.f36526h.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f36528j.f38702b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f36521c.mo33713d(this.f36520b, elapsedRealtime, elapsedRealtime - this.f36523e, true);
    }

    /* renamed from: b */
    public final void mo33940b(int i) throws IOException {
        IOException iOException = this.f36524f;
        if (iOException != null && this.f36525g > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void mo33941c(long j) {
        C8195tl.m37900e(this.f36528j.f38702b == null);
        this.f36528j.f38702b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m35751d();
        }
    }

    public final void handleMessage(Message message) {
        if (!this.f36527i) {
            int i = message.what;
            if (i == 0) {
                m35751d();
            } else if (i != 4) {
                this.f36528j.f38702b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f36523e;
                if (this.f36520b.zze()) {
                    this.f36521c.mo33713d(this.f36520b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                int i3 = 1;
                if (i2 == 1) {
                    this.f36521c.mo33713d(this.f36520b, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    this.f36521c.mo33712b(this.f36520b, elapsedRealtime, j);
                } else if (i2 == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.f36524f = iOException;
                    int e = this.f36521c.mo33714e(this.f36520b, elapsedRealtime, j, iOException);
                    if (e == 3) {
                        this.f36528j.f38703c = this.f36524f;
                    } else if (e != 2) {
                        if (e != 1) {
                            i3 = 1 + this.f36525g;
                        }
                        this.f36525g = i3;
                        mo33941c((long) Math.min((i3 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        String str;
        try {
            this.f36526h = Thread.currentThread();
            if (!this.f36520b.zze()) {
                String simpleName = this.f36520b.getClass().getSimpleName();
                if (simpleName.length() != 0) {
                    str = "load:".concat(simpleName);
                } else {
                    str = new String("load:");
                }
                C7725gm.m32582a(str);
                this.f36520b.zzc();
                C7725gm.m32583b();
            }
            if (!this.f36527i) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f36527i) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (InterruptedException unused) {
            C8195tl.m37900e(this.f36520b.zze());
            if (!this.f36527i) {
                sendEmptyMessage(2);
            }
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (!this.f36527i) {
                obtainMessage(3, new C8090ql(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (!this.f36527i) {
                obtainMessage(3, new C8090ql(e3)).sendToTarget();
            }
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.f36527i) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            C7725gm.m32583b();
            throw th;
        }
    }
}
