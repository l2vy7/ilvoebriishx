package com.google.ads.interactivemedia.p038v3.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.om */
/* compiled from: IMASDK */
final class C4236om {

    /* renamed from: A */
    private long f18169A;

    /* renamed from: B */
    private long f18170B;

    /* renamed from: C */
    private long f18171C;

    /* renamed from: D */
    private boolean f18172D;

    /* renamed from: E */
    private long f18173E;

    /* renamed from: F */
    private long f18174F;

    /* renamed from: a */
    private final C4235ol f18175a;

    /* renamed from: b */
    private final long[] f18176b;

    /* renamed from: c */
    private AudioTrack f18177c;

    /* renamed from: d */
    private int f18178d;

    /* renamed from: e */
    private int f18179e;

    /* renamed from: f */
    private C4234ok f18180f;

    /* renamed from: g */
    private int f18181g;

    /* renamed from: h */
    private boolean f18182h;

    /* renamed from: i */
    private long f18183i;

    /* renamed from: j */
    private float f18184j;

    /* renamed from: k */
    private boolean f18185k;

    /* renamed from: l */
    private long f18186l;

    /* renamed from: m */
    private long f18187m;

    /* renamed from: n */
    private Method f18188n;

    /* renamed from: o */
    private long f18189o;

    /* renamed from: p */
    private boolean f18190p;

    /* renamed from: q */
    private boolean f18191q;

    /* renamed from: r */
    private long f18192r;

    /* renamed from: s */
    private long f18193s;

    /* renamed from: t */
    private long f18194t;

    /* renamed from: u */
    private long f18195u;

    /* renamed from: v */
    private int f18196v;

    /* renamed from: w */
    private int f18197w;

    /* renamed from: x */
    private long f18198x;

    /* renamed from: y */
    private long f18199y;

    /* renamed from: z */
    private long f18200z;

    public C4236om(C4235ol olVar) {
        this.f18175a = olVar;
        if (amm.f15298a >= 18) {
            try {
                this.f18188n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f18176b = new long[10];
    }

    /* renamed from: m */
    private final long m18360m(long j) {
        return (j * 1000000) / ((long) this.f18181g);
    }

    /* renamed from: n */
    private final void m18361n() {
        this.f18186l = 0;
        this.f18197w = 0;
        this.f18196v = 0;
        this.f18187m = 0;
        this.f18171C = 0;
        this.f18174F = 0;
        this.f18185k = false;
    }

    /* renamed from: o */
    private final long m18362o() {
        return m18360m(m18363p());
    }

    /* renamed from: p */
    private final long m18363p() {
        AudioTrack audioTrack = this.f18177c;
        aup.m14890u(audioTrack);
        if (this.f18198x != C6540C.TIME_UNSET) {
            return Math.min(this.f18169A, this.f18200z + ((((SystemClock.elapsedRealtime() * 1000) - this.f18198x) * ((long) this.f18181g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f18182h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f18195u = this.f18193s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f18195u;
        }
        if (amm.f15298a <= 29) {
            if (playbackHeadPosition == 0 && this.f18193s > 0 && playState == 3) {
                if (this.f18199y == C6540C.TIME_UNSET) {
                    this.f18199y = SystemClock.elapsedRealtime();
                }
                return this.f18193s;
            }
            this.f18199y = C6540C.TIME_UNSET;
        }
        if (this.f18193s > playbackHeadPosition) {
            this.f18194t++;
        }
        this.f18193s = playbackHeadPosition;
        return playbackHeadPosition + (this.f18194t << 32);
    }

    /* renamed from: a */
    public final void mo16451a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f18177c = audioTrack;
        this.f18178d = i2;
        this.f18179e = i3;
        this.f18180f = new C4234ok(audioTrack);
        this.f18181g = audioTrack.getSampleRate();
        boolean z2 = true;
        if (!z || amm.f15298a >= 23 || !(i == 5 || i == 6)) {
            z2 = false;
        }
        this.f18182h = z2;
        boolean X = amm.m14207X(i);
        this.f18191q = X;
        this.f18183i = X ? m18360m((long) (i3 / i2)) : -9223372036854775807L;
        this.f18193s = 0;
        this.f18194t = 0;
        this.f18195u = 0;
        this.f18190p = false;
        this.f18198x = C6540C.TIME_UNSET;
        this.f18199y = C6540C.TIME_UNSET;
        this.f18192r = 0;
        this.f18189o = 0;
        this.f18184j = 1.0f;
    }

    /* renamed from: b */
    public final long mo16452b(boolean z) {
        long j;
        long j2;
        long j3;
        Method method;
        AudioTrack audioTrack = this.f18177c;
        aup.m14890u(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long o = m18362o();
            if (o != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f18187m >= 30000) {
                    long[] jArr = this.f18176b;
                    int i = this.f18196v;
                    jArr[i] = o - nanoTime;
                    this.f18196v = (i + 1) % 10;
                    int i2 = this.f18197w;
                    if (i2 < 10) {
                        this.f18197w = i2 + 1;
                    }
                    this.f18187m = nanoTime;
                    this.f18186l = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f18197w;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f18186l += this.f18176b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!this.f18182h) {
                    C4234ok okVar = this.f18180f;
                    aup.m14890u(okVar);
                    if (!okVar.mo16439a(nanoTime)) {
                        j3 = nanoTime;
                    } else {
                        long f = okVar.mo16444f();
                        long g = okVar.mo16445g();
                        if (Math.abs(f - nanoTime) > 5000000) {
                            j3 = nanoTime;
                            this.f18175a.mo16448c(g, f, nanoTime, o);
                            okVar.mo16440b();
                        } else {
                            j3 = nanoTime;
                            if (Math.abs(m18360m(g) - o) > 5000000) {
                                this.f18175a.mo16447b(g, f, j3, o);
                                okVar.mo16440b();
                            } else {
                                okVar.mo16441c();
                            }
                        }
                    }
                    if (this.f18191q && (method = this.f18188n) != null) {
                        long j4 = j3;
                        if (j4 - this.f18192r >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f18177c;
                                aup.m14890u(audioTrack2);
                                int i5 = amm.f15298a;
                                long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - this.f18183i;
                                this.f18189o = intValue;
                                long max = Math.max(intValue, 0);
                                this.f18189o = max;
                                if (max > 5000000) {
                                    this.f18175a.mo16449d(max);
                                    this.f18189o = 0;
                                }
                            } catch (Exception unused) {
                                this.f18188n = null;
                            }
                            this.f18192r = j4;
                        }
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        C4234ok okVar2 = this.f18180f;
        aup.m14890u(okVar2);
        boolean d = okVar2.mo16442d();
        if (d) {
            j = m18360m(okVar2.mo16445g()) + amm.m14197N(nanoTime2 - okVar2.mo16444f(), this.f18184j);
        } else {
            if (this.f18197w == 0) {
                j2 = m18362o();
            } else {
                j2 = this.f18186l + nanoTime2;
            }
            j = !z ? Math.max(0, j2 - this.f18189o) : j2;
        }
        if (this.f18172D != d) {
            this.f18174F = this.f18171C;
            this.f18173E = this.f18170B;
        }
        long j5 = nanoTime2 - this.f18174F;
        if (j5 < 1000000) {
            long j6 = (j5 * 1000) / 1000000;
            j = ((j * j6) + ((1000 - j6) * (this.f18173E + amm.m14197N(j5, this.f18184j)))) / 1000;
        }
        if (!this.f18185k) {
            long j7 = this.f18170B;
            if (j > j7) {
                this.f18185k = true;
                this.f18175a.mo16446a(System.currentTimeMillis() - C4083iv.m17451a(amm.m14198O(C4083iv.m17451a(j - j7), this.f18184j)));
            }
        }
        this.f18171C = nanoTime2;
        this.f18170B = j;
        this.f18172D = d;
        return j;
    }

    /* renamed from: c */
    public final void mo16453c() {
        C4234ok okVar = this.f18180f;
        aup.m14890u(okVar);
        okVar.mo16443e();
    }

    /* renamed from: d */
    public final boolean mo16454d() {
        AudioTrack audioTrack = this.f18177c;
        aup.m14890u(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: e */
    public final boolean mo16455e(long j) {
        AudioTrack audioTrack = this.f18177c;
        aup.m14890u(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f18182h) {
            if (playState == 2) {
                this.f18190p = false;
                return false;
            } else if (playState == 1) {
                if (m18363p() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f18190p;
        boolean j2 = mo16460j(j);
        this.f18190p = j2;
        if (z && !j2 && playState != 1) {
            this.f18175a.mo16450e(this.f18179e, C4083iv.m17451a(this.f18183i));
        }
        return true;
    }

    /* renamed from: f */
    public final int mo16456f(long j) {
        return this.f18179e - ((int) (j - (m18363p() * ((long) this.f18178d))));
    }

    /* renamed from: g */
    public final long mo16457g(long j) {
        return C4083iv.m17451a(m18360m(j - m18363p()));
    }

    /* renamed from: h */
    public final boolean mo16458h(long j) {
        return this.f18199y != C6540C.TIME_UNSET && j > 0 && SystemClock.elapsedRealtime() - this.f18199y >= 200;
    }

    /* renamed from: i */
    public final void mo16459i(long j) {
        this.f18200z = m18363p();
        this.f18198x = SystemClock.elapsedRealtime() * 1000;
        this.f18169A = j;
    }

    /* renamed from: j */
    public final boolean mo16460j(long j) {
        if (j > m18363p()) {
            return true;
        }
        if (!this.f18182h) {
            return false;
        }
        AudioTrack audioTrack = this.f18177c;
        aup.m14890u(audioTrack);
        return audioTrack.getPlayState() == 2 && m18363p() == 0;
    }

    /* renamed from: k */
    public final boolean mo16461k() {
        m18361n();
        if (this.f18198x != C6540C.TIME_UNSET) {
            return false;
        }
        C4234ok okVar = this.f18180f;
        aup.m14890u(okVar);
        okVar.mo16443e();
        return true;
    }

    /* renamed from: l */
    public final void mo16462l() {
        m18361n();
        this.f18177c = null;
        this.f18180f = null;
    }
}
