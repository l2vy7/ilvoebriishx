package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d14 {

    /* renamed from: A */
    private long f30563A;

    /* renamed from: B */
    private long f30564B;

    /* renamed from: C */
    private long f30565C;

    /* renamed from: D */
    private boolean f30566D;

    /* renamed from: E */
    private long f30567E;

    /* renamed from: F */
    private long f30568F;

    /* renamed from: a */
    private final c14 f30569a;

    /* renamed from: b */
    private final long[] f30570b;

    /* renamed from: c */
    private AudioTrack f30571c;

    /* renamed from: d */
    private int f30572d;

    /* renamed from: e */
    private int f30573e;

    /* renamed from: f */
    private b14 f30574f;

    /* renamed from: g */
    private int f30575g;

    /* renamed from: h */
    private boolean f30576h;

    /* renamed from: i */
    private long f30577i;

    /* renamed from: j */
    private float f30578j;

    /* renamed from: k */
    private boolean f30579k;

    /* renamed from: l */
    private long f30580l;

    /* renamed from: m */
    private long f30581m;

    /* renamed from: n */
    private Method f30582n;

    /* renamed from: o */
    private long f30583o;

    /* renamed from: p */
    private boolean f30584p;

    /* renamed from: q */
    private boolean f30585q;

    /* renamed from: r */
    private long f30586r;

    /* renamed from: s */
    private long f30587s;

    /* renamed from: t */
    private long f30588t;

    /* renamed from: u */
    private long f30589u;

    /* renamed from: v */
    private int f30590v;

    /* renamed from: w */
    private int f30591w;

    /* renamed from: x */
    private long f30592x;

    /* renamed from: y */
    private long f30593y;

    /* renamed from: z */
    private long f30594z;

    public d14(c14 c14) {
        this.f30569a = c14;
        if (d13.f20195a >= 18) {
            try {
                this.f30582n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f30570b = new long[10];
    }

    /* renamed from: m */
    private final long m31190m(long j) {
        return (j * 1000000) / ((long) this.f30575g);
    }

    /* renamed from: n */
    private final long m31191n() {
        AudioTrack audioTrack = this.f30571c;
        Objects.requireNonNull(audioTrack);
        if (this.f30592x != C6540C.TIME_UNSET) {
            return Math.min(this.f30563A, this.f30594z + ((((SystemClock.elapsedRealtime() * 1000) - this.f30592x) * ((long) this.f30575g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f30576h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.f30589u = this.f30587s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.f30589u;
        }
        if (d13.f20195a <= 29) {
            if (playbackHeadPosition == 0 && this.f30587s > 0 && playState == 3) {
                if (this.f30593y == C6540C.TIME_UNSET) {
                    this.f30593y = SystemClock.elapsedRealtime();
                }
                return this.f30587s;
            }
            this.f30593y = C6540C.TIME_UNSET;
        }
        if (this.f30587s > playbackHeadPosition) {
            this.f30588t++;
        }
        this.f30587s = playbackHeadPosition;
        return playbackHeadPosition + (this.f30588t << 32);
    }

    /* renamed from: o */
    private final void m31192o() {
        this.f30580l = 0;
        this.f30591w = 0;
        this.f30590v = 0;
        this.f30581m = 0;
        this.f30565C = 0;
        this.f30568F = 0;
        this.f30579k = false;
    }

    /* renamed from: a */
    public final int mo31065a(long j) {
        return this.f30573e - ((int) (j - (m31191n() * ((long) this.f30572d))));
    }

    /* renamed from: b */
    public final long mo31066b(boolean z) {
        long j;
        Method method;
        d14 d14 = this;
        AudioTrack audioTrack = d14.f30571c;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long m = d14.m31190m(m31191n());
            if (m != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - d14.f30581m >= 30000) {
                    long[] jArr = d14.f30570b;
                    int i = d14.f30590v;
                    jArr[i] = m - nanoTime;
                    d14.f30590v = (i + 1) % 10;
                    int i2 = d14.f30591w;
                    if (i2 < 10) {
                        d14.f30591w = i2 + 1;
                    }
                    d14.f30581m = nanoTime;
                    d14.f30580l = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = d14.f30591w;
                        if (i3 >= i4) {
                            break;
                        }
                        d14.f30580l += d14.f30570b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!d14.f30576h) {
                    b14 b14 = d14.f30574f;
                    Objects.requireNonNull(b14);
                    if (b14.mo30596g(nanoTime)) {
                        long b = b14.mo30591b();
                        long a = b14.mo30590a();
                        if (Math.abs(b - nanoTime) > 5000000) {
                            n14 n14 = (n14) d14.f30569a;
                            long E = n14.f35869a.m36881o();
                            long F = n14.f35869a.m36882p();
                            StringBuilder sb = new StringBuilder(180);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(a);
                            sb.append(", ");
                            sb.append(b);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(m);
                            sb.append(", ");
                            sb.append(E);
                            sb.append(", ");
                            sb.append(F);
                            Log.w("DefaultAudioSink", sb.toString());
                            b14.mo30593d();
                        } else {
                            b14 b142 = b14;
                            if (Math.abs(d14.m31190m(a) - m) > 5000000) {
                                n14 n142 = (n14) d14.f30569a;
                                long E2 = n142.f35869a.m36881o();
                                long F2 = n142.f35869a.m36882p();
                                StringBuilder sb2 = new StringBuilder(182);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(a);
                                sb2.append(", ");
                                sb2.append(b);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(m);
                                sb2.append(", ");
                                sb2.append(E2);
                                sb2.append(", ");
                                sb2.append(F2);
                                Log.w("DefaultAudioSink", sb2.toString());
                                b142.mo30593d();
                            } else {
                                b142.mo30592c();
                            }
                        }
                        d14 = this;
                    }
                    if (d14.f30585q && (method = d14.f30582n) != null && nanoTime - d14.f30586r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = d14.f30571c;
                            Objects.requireNonNull(audioTrack2);
                            int i5 = d13.f20195a;
                            long intValue = (((long) ((Integer) method.invoke(audioTrack2, new Object[0])).intValue()) * 1000) - d14.f30577i;
                            d14.f30583o = intValue;
                            long max = Math.max(intValue, 0);
                            d14.f30583o = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("DefaultAudioSink", sb3.toString());
                                d14.f30583o = 0;
                            }
                        } catch (Exception unused) {
                            d14.f30582n = null;
                        }
                        d14.f30586r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        b14 b143 = d14.f30574f;
        Objects.requireNonNull(b143);
        boolean f = b143.mo30595f();
        if (f) {
            j = d14.m31190m(b143.mo30590a()) + d13.m20291V(nanoTime2 - b143.mo30591b(), d14.f30578j);
        } else {
            if (d14.f30591w == 0) {
                j = d14.m31190m(m31191n());
            } else {
                j = d14.f30580l + nanoTime2;
            }
            if (!z) {
                j = Math.max(0, j - d14.f30583o);
            }
        }
        if (d14.f30566D != f) {
            d14.f30568F = d14.f30565C;
            d14.f30567E = d14.f30564B;
        }
        long j2 = nanoTime2 - d14.f30568F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (d14.f30567E + d13.m20291V(j2, d14.f30578j)))) / 1000;
        }
        if (!d14.f30579k) {
            long j4 = d14.f30564B;
            if (j > j4) {
                d14.f30579k = true;
                long currentTimeMillis = System.currentTimeMillis() - xy3.m39692d(d13.m20293X(xy3.m39692d(j - j4), d14.f30578j));
                n14 n143 = (n14) d14.f30569a;
                if (n143.f35869a.f38486k != null) {
                    ((u14) n143.f35869a.f38486k).f39722a.f40241O0.mo34470r(currentTimeMillis);
                }
            }
        }
        d14.f30565C = nanoTime2;
        d14.f30564B = j;
        d14.f30566D = f;
        return j;
    }

    /* renamed from: c */
    public final long mo31067c(long j) {
        return xy3.m39692d(m31190m(-m31191n()));
    }

    /* renamed from: d */
    public final void mo31068d(long j) {
        this.f30594z = m31191n();
        this.f30592x = SystemClock.elapsedRealtime() * 1000;
        this.f30563A = j;
    }

    /* renamed from: e */
    public final void mo31069e() {
        m31192o();
        this.f30571c = null;
        this.f30574f = null;
    }

    /* renamed from: f */
    public final void mo31070f(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.f30571c = audioTrack;
        this.f30572d = i2;
        this.f30573e = i3;
        this.f30574f = new b14(audioTrack);
        this.f30575g = audioTrack.getSampleRate();
        this.f30576h = false;
        boolean r = d13.m20319r(i);
        this.f30585q = r;
        this.f30577i = r ? m31190m((long) (i3 / i2)) : -9223372036854775807L;
        this.f30587s = 0;
        this.f30588t = 0;
        this.f30589u = 0;
        this.f30584p = false;
        this.f30592x = C6540C.TIME_UNSET;
        this.f30593y = C6540C.TIME_UNSET;
        this.f30586r = 0;
        this.f30583o = 0;
        this.f30578j = 1.0f;
    }

    /* renamed from: g */
    public final void mo31071g() {
        b14 b14 = this.f30574f;
        Objects.requireNonNull(b14);
        b14.mo30594e();
    }

    /* renamed from: h */
    public final boolean mo31072h(long j) {
        if (j > m31191n()) {
            return true;
        }
        if (!this.f30576h) {
            return false;
        }
        AudioTrack audioTrack = this.f30571c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 2 && m31191n() == 0;
    }

    /* renamed from: i */
    public final boolean mo31073i() {
        AudioTrack audioTrack = this.f30571c;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: j */
    public final boolean mo31074j(long j) {
        return this.f30593y != C6540C.TIME_UNSET && j > 0 && SystemClock.elapsedRealtime() - this.f30593y >= 200;
    }

    /* renamed from: k */
    public final boolean mo31075k(long j) {
        AudioTrack audioTrack = this.f30571c;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f30576h) {
            if (playState == 2) {
                this.f30584p = false;
                return false;
            } else if (playState == 1) {
                if (m31191n() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.f30584p;
        boolean h = mo31072h(j);
        this.f30584p = h;
        if (z && !h && playState != 1) {
            c14 c14 = this.f30569a;
            int i = this.f30573e;
            long d = xy3.m39692d(this.f30577i);
            n14 n14 = (n14) c14;
            if (n14.f35869a.f38486k != null) {
                ((u14) n14.f35869a.f38486k).f39722a.f40241O0.mo34472t(i, d, SystemClock.elapsedRealtime() - n14.f35869a.f38472M);
            }
        }
        return true;
    }

    /* renamed from: l */
    public final boolean mo31076l() {
        m31192o();
        if (this.f30592x != C6540C.TIME_UNSET) {
            return false;
        }
        b14 b14 = this.f30574f;
        Objects.requireNonNull(b14);
        b14.mo30594e();
        return true;
    }
}
