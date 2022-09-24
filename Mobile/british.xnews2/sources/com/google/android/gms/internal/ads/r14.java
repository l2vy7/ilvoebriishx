package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r14 implements y04 {

    /* renamed from: A */
    private ByteBuffer[] f38460A;

    /* renamed from: B */
    private ByteBuffer f38461B;

    /* renamed from: C */
    private ByteBuffer f38462C;

    /* renamed from: D */
    private byte[] f38463D;

    /* renamed from: E */
    private int f38464E;

    /* renamed from: F */
    private int f38465F;

    /* renamed from: G */
    private boolean f38466G;

    /* renamed from: H */
    private boolean f38467H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f38468I;

    /* renamed from: J */
    private boolean f38469J;

    /* renamed from: K */
    private int f38470K;

    /* renamed from: L */
    private uv3 f38471L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public long f38472M;

    /* renamed from: N */
    private boolean f38473N;

    /* renamed from: O */
    private boolean f38474O;

    /* renamed from: P */
    private final i14 f38475P;

    /* renamed from: a */
    private final f14 f38476a;

    /* renamed from: b */
    private final b24 f38477b;

    /* renamed from: c */
    private final g04[] f38478c;

    /* renamed from: d */
    private final g04[] f38479d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f38480e = new ConditionVariable(true);

    /* renamed from: f */
    private final d14 f38481f = new d14(new n14(this, (m14) null));

    /* renamed from: g */
    private final ArrayDeque<k14> f38482g;

    /* renamed from: h */
    private q14 f38483h;

    /* renamed from: i */
    private final l14<u04> f38484i;

    /* renamed from: j */
    private final l14<x04> f38485j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public v04 f38486k;

    /* renamed from: l */
    private h14 f38487l;

    /* renamed from: m */
    private h14 f38488m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AudioTrack f38489n;

    /* renamed from: o */
    private oe3 f38490o;

    /* renamed from: p */
    private k14 f38491p;

    /* renamed from: q */
    private k14 f38492q;

    /* renamed from: r */
    private final h20 f38493r;

    /* renamed from: s */
    private long f38494s;

    /* renamed from: t */
    private long f38495t;

    /* renamed from: u */
    private long f38496u;

    /* renamed from: v */
    private boolean f38497v;

    /* renamed from: w */
    private boolean f38498w;

    /* renamed from: x */
    private long f38499x;

    /* renamed from: y */
    private float f38500y;

    /* renamed from: z */
    private g04[] f38501z;

    public r14(d04 d04, g04[] g04Arr, boolean z) {
        i14 i14 = new i14(g04Arr);
        this.f38475P = i14;
        int i = d13.f20195a;
        f14 f14 = new f14();
        this.f38476a = f14;
        b24 b24 = new b24();
        this.f38477b = b24;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new e14[]{new w14(), f14, b24});
        Collections.addAll(arrayList, i14.mo32525e());
        this.f38478c = (g04[]) arrayList.toArray(new g04[0]);
        this.f38479d = new g04[]{new s14()};
        this.f38500y = 1.0f;
        this.f38490o = oe3.f36450c;
        this.f38470K = 0;
        this.f38471L = new uv3(0, 0.0f);
        h20 h20 = h20.f32588d;
        this.f38492q = new k14(h20, false, 0, 0, (j14) null);
        this.f38493r = h20;
        this.f38465F = -1;
        this.f38501z = new g04[0];
        this.f38460A = new ByteBuffer[0];
        this.f38482g = new ArrayDeque<>();
        this.f38484i = new l14<>(100);
        this.f38485j = new l14<>(100);
    }

    /* renamed from: A */
    private final boolean m36870A() {
        return this.f38489n != null;
    }

    /* renamed from: B */
    private static boolean m36871B(AudioTrack audioTrack) {
        return d13.f20195a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: C */
    private final boolean m36872C() {
        if (!MimeTypes.AUDIO_RAW.equals(this.f38488m.f32578a.f40619l)) {
            return false;
        }
        int i = this.f38488m.f32578a.f40602A;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final long m36881o() {
        h14 h14 = this.f38488m;
        int i = h14.f32580c;
        return this.f38494s / ((long) h14.f32579b);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final long m36882p() {
        h14 h14 = this.f38488m;
        int i = h14.f32580c;
        return this.f38495t / ((long) h14.f32581d);
    }

    /* renamed from: r */
    private final k14 m36883r() {
        k14 k14 = this.f38491p;
        if (k14 != null) {
            return k14;
        }
        return !this.f38482g.isEmpty() ? this.f38482g.getLast() : this.f38492q;
    }

    /* renamed from: s */
    private final void m36884s(long j) {
        h20 h20;
        boolean z;
        if (m36872C()) {
            i14 i14 = this.f38475P;
            h20 = m36883r().f34119a;
            i14.mo32523c(h20);
        } else {
            h20 = h20.f32588d;
        }
        h20 h202 = h20;
        if (m36872C()) {
            i14 i142 = this.f38475P;
            boolean z2 = m36883r().f34120b;
            i142.mo32524d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.f38482g.add(new k14(h202, z, Math.max(0, j), this.f38488m.mo32318b(m36882p()), (j14) null));
        g04[] g04Arr = this.f38488m.f32586i;
        ArrayList arrayList = new ArrayList();
        for (g04 g04 : g04Arr) {
            if (g04.zzg()) {
                arrayList.add(g04);
            } else {
                g04.zzc();
            }
        }
        int size = arrayList.size();
        this.f38501z = (g04[]) arrayList.toArray(new g04[size]);
        this.f38460A = new ByteBuffer[size];
        m36885t();
        v04 v04 = this.f38486k;
        if (v04 != null) {
            ((u14) v04).f39722a.f40241O0.mo34471s(z);
        }
    }

    /* renamed from: t */
    private final void m36885t() {
        int i = 0;
        while (true) {
            g04[] g04Arr = this.f38501z;
            if (i < g04Arr.length) {
                g04 g04 = g04Arr[i];
                g04.zzc();
                this.f38460A[i] = g04.zzb();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    private final void m36886u() {
        if (!this.f38467H) {
            this.f38467H = true;
            this.f38481f.mo31068d(m36882p());
            this.f38489n.stop();
        }
    }

    /* renamed from: v */
    private final void m36887v(long j) throws x04 {
        ByteBuffer byteBuffer;
        int length = this.f38501z.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f38460A[i - 1];
            } else {
                byteBuffer = this.f38461B;
                if (byteBuffer == null) {
                    byteBuffer = g04.f32090a;
                }
            }
            if (i == length) {
                m36890y(byteBuffer, j);
            } else {
                g04 g04 = this.f38501z[i];
                if (i > this.f38465F) {
                    g04.mo30600b(byteBuffer);
                }
                ByteBuffer zzb = g04.zzb();
                this.f38460A[i] = zzb;
                if (zzb.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    private final void m36888w(h20 h20, boolean z) {
        k14 r = m36883r();
        if (!h20.equals(r.f34119a) || z != r.f34120b) {
            k14 k14 = new k14(h20, z, C6540C.TIME_UNSET, C6540C.TIME_UNSET, (j14) null);
            if (m36870A()) {
                this.f38491p = k14;
            } else {
                this.f38492q = k14;
            }
        }
    }

    /* renamed from: x */
    private final void m36889x() {
        if (m36870A()) {
            if (d13.f20195a >= 21) {
                this.f38489n.setVolume(this.f38500y);
                return;
            }
            AudioTrack audioTrack = this.f38489n;
            float f = this.f38500y;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: y */
    private final void m36890y(ByteBuffer byteBuffer, long j) throws x04 {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f38462C;
            boolean z = true;
            if (byteBuffer2 != null) {
                nu1.m20745d(byteBuffer2 == byteBuffer);
            } else {
                this.f38462C = byteBuffer;
                if (d13.f20195a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f38463D;
                    if (bArr == null || bArr.length < remaining) {
                        this.f38463D = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f38463D, 0, remaining);
                    byteBuffer.position(position);
                    this.f38464E = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i2 = d13.f20195a;
            if (i2 < 21) {
                int a = this.f38481f.mo31065a(this.f38495t);
                if (a > 0) {
                    i = this.f38489n.write(this.f38463D, this.f38464E, Math.min(remaining2, a));
                    if (i > 0) {
                        this.f38464E += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.f38489n.write(byteBuffer, remaining2, 1);
            }
            this.f38472M = SystemClock.elapsedRealtime();
            if (i < 0) {
                if ((i2 < 24 || i != -6) && i != -32) {
                    z = false;
                }
                x04 x04 = new x04(i, this.f38488m.f32578a, z);
                v04 v04 = this.f38486k;
                if (v04 != null) {
                    v04.mo35086a(x04);
                }
                if (!x04.f40978b) {
                    this.f38485j.mo33234b(x04);
                    return;
                }
                throw x04;
            }
            this.f38485j.mo33233a();
            if (m36871B(this.f38489n) && this.f38468I && this.f38486k != null && i < remaining2 && !this.f38474O) {
                long c = this.f38481f.mo31067c(0);
                u14 u14 = (u14) this.f38486k;
                if (u14.f39722a.f40250X0 != null) {
                    u14.f39722a.f40250X0.mo31416a(c);
                }
            }
            int i3 = this.f38488m.f32580c;
            this.f38495t += (long) i;
            if (i == remaining2) {
                this.f38462C = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m36891z() throws com.google.android.gms.internal.ads.x04 {
        /*
            r9 = this;
            int r0 = r9.f38465F
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f38465F = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f38465F
            com.google.android.gms.internal.ads.g04[] r5 = r9.f38501z
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.zzd()
        L_0x001f:
            r9.m36887v(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f38465F
            int r0 = r0 + r2
            r9.f38465F = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f38462C
            if (r0 == 0) goto L_0x003b
            r9.m36890y(r0, r7)
            java.nio.ByteBuffer r0 = r9.f38462C
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f38465F = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r14.m36891z():boolean");
    }

    /* renamed from: a */
    public final int mo34474a(C8281w wVar) {
        if (!MimeTypes.AUDIO_RAW.equals(wVar.f40619l)) {
            int i = d13.f20195a;
            return 0;
        } else if (d13.m20319r(wVar.f40602A)) {
            return wVar.f40602A != 2 ? 1 : 2;
        } else {
            int i2 = wVar.f40602A;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i2);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo34475b(uv3 uv3) {
        if (!this.f38471L.equals(uv3)) {
            int i = uv3.f40001a;
            if (this.f38489n != null) {
                int i2 = this.f38471L.f40001a;
            }
            this.f38471L = uv3;
        }
    }

    /* renamed from: c */
    public final void mo34476c(int i) {
        if (this.f38470K != i) {
            this.f38470K = i;
            this.f38469J = i != 0;
            zze();
        }
    }

    /* renamed from: d */
    public final boolean mo34477d(C8281w wVar) {
        return mo34474a(wVar) != 0;
    }

    /* renamed from: e */
    public final void mo34478e(h20 h20) {
        m36888w(new h20(d13.m20270A(h20.f32590a, 0.1f, 8.0f), d13.m20270A(h20.f32591b, 0.1f, 8.0f)), m36883r().f34120b);
    }

    /* renamed from: f */
    public final void mo34479f(float f) {
        if (this.f38500y != f) {
            this.f38500y = f;
            m36889x();
        }
    }

    /* renamed from: g */
    public final boolean mo34480g(ByteBuffer byteBuffer, long j, int i) throws u04, x04 {
        ByteBuffer byteBuffer2 = this.f38461B;
        nu1.m20745d(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f38487l != null) {
            if (!m36891z()) {
                return false;
            }
            h14 h14 = this.f38487l;
            h14 h142 = this.f38488m;
            int i2 = h142.f32580c;
            int i3 = h14.f32580c;
            if (h142.f32584g == h14.f32584g && h142.f32582e == h14.f32582e && h142.f32583f == h14.f32583f && h142.f32581d == h14.f32581d) {
                this.f38488m = h14;
                this.f38487l = null;
                if (m36871B(this.f38489n)) {
                    this.f38489n.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f38489n;
                    C8281w wVar = this.f38488m.f32578a;
                    audioTrack.setOffloadDelayPadding(wVar.f40603B, wVar.f40604C);
                    this.f38474O = true;
                }
            } else {
                m36886u();
                if (zzs()) {
                    return false;
                }
                zze();
            }
            m36884s(j);
        }
        if (!m36870A()) {
            try {
                this.f38480e.block();
                h14 h143 = this.f38488m;
                Objects.requireNonNull(h143);
                AudioTrack c = h143.mo32319c(false, this.f38490o, this.f38470K);
                this.f38489n = c;
                if (m36871B(c)) {
                    AudioTrack audioTrack2 = this.f38489n;
                    if (this.f38483h == null) {
                        this.f38483h = new q14(this);
                    }
                    this.f38483h.mo34230a(audioTrack2);
                    AudioTrack audioTrack3 = this.f38489n;
                    C8281w wVar2 = this.f38488m.f32578a;
                    audioTrack3.setOffloadDelayPadding(wVar2.f40603B, wVar2.f40604C);
                }
                this.f38470K = this.f38489n.getAudioSessionId();
                d14 d14 = this.f38481f;
                AudioTrack audioTrack4 = this.f38489n;
                h14 h144 = this.f38488m;
                int i4 = h144.f32580c;
                d14.mo31070f(audioTrack4, false, h144.f32584g, h144.f32581d, h144.f32585h);
                m36889x();
                int i5 = this.f38471L.f40001a;
                this.f38498w = true;
            } catch (u04 e) {
                v04 v04 = this.f38486k;
                if (v04 != null) {
                    v04.mo35086a(e);
                }
                throw e;
            } catch (u04 e2) {
                this.f38484i.mo33234b(e2);
                return false;
            }
        }
        this.f38484i.mo33233a();
        if (this.f38498w) {
            this.f38499x = Math.max(0, j);
            this.f38497v = false;
            this.f38498w = false;
            m36884s(j);
            if (this.f38468I) {
                zzh();
            }
        }
        if (!this.f38481f.mo31075k(m36882p())) {
            return false;
        }
        if (this.f38461B == null) {
            nu1.m20745d(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            int i6 = this.f38488m.f32580c;
            if (this.f38491p != null) {
                if (!m36891z()) {
                    return false;
                }
                m36884s(j);
                this.f38491p = null;
            }
            long o = this.f38499x + (((m36881o() - this.f38477b.mo30605i()) * 1000000) / ((long) this.f38488m.f32578a.f40633z));
            if (!this.f38497v && Math.abs(o - j) > 200000) {
                this.f38486k.mo35086a(new w04(j, o));
                this.f38497v = true;
            }
            if (this.f38497v) {
                if (!m36891z()) {
                    return false;
                }
                long j2 = j - o;
                this.f38499x += j2;
                this.f38497v = false;
                m36884s(j);
                v04 v042 = this.f38486k;
                if (!(v042 == null || j2 == 0)) {
                    ((u14) v042).f39722a.mo35349U();
                }
            }
            int i7 = this.f38488m.f32580c;
            this.f38494s += (long) byteBuffer.remaining();
            this.f38461B = byteBuffer;
        }
        m36887v(j);
        if (!this.f38461B.hasRemaining()) {
            this.f38461B = null;
            return true;
        } else if (!this.f38481f.mo31074j(m36882p())) {
            return false;
        } else {
            Log.w("DefaultAudioSink", "Resetting stalled audio track");
            zze();
            return true;
        }
    }

    /* renamed from: h */
    public final void mo34481h(v04 v04) {
        this.f38486k = v04;
    }

    /* renamed from: i */
    public final void mo34482i(C8281w wVar, int i, int[] iArr) throws t04 {
        if (MimeTypes.AUDIO_RAW.equals(wVar.f40619l)) {
            nu1.m20745d(d13.m20319r(wVar.f40602A));
            int S = d13.m20288S(wVar.f40602A, wVar.f40632y);
            g04[] g04Arr = this.f38478c;
            this.f38477b.mo30607k(wVar.f40603B, wVar.f40604C);
            if (d13.f20195a < 21 && wVar.f40632y == 8 && iArr == null) {
                iArr = new int[6];
                for (int i2 = 0; i2 < 6; i2++) {
                    iArr[i2] = i2;
                }
            }
            this.f38476a.mo31709i(iArr);
            e04 e04 = new e04(wVar.f40633z, wVar.f40632y, wVar.f40602A);
            int length = g04Arr.length;
            int i3 = 0;
            while (i3 < length) {
                g04 g04 = g04Arr[i3];
                try {
                    e04 a = g04.mo31448a(e04);
                    if (true == g04.zzg()) {
                        e04 = a;
                    }
                    i3++;
                } catch (f04 e) {
                    throw new t04((Throwable) e, wVar);
                }
            }
            int i4 = e04.f31145c;
            int i5 = e04.f31143a;
            int P = d13.m20285P(e04.f31144b);
            int S2 = d13.m20288S(i4, e04.f31144b);
            if (i4 == 0) {
                String valueOf = String.valueOf(wVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Invalid output encoding (mode=0) for: ");
                sb.append(valueOf);
                throw new t04(sb.toString(), wVar);
            } else if (P != 0) {
                this.f38473N = false;
                h14 h14 = new h14(wVar, S, 0, S2, i5, P, i4, 0, false, g04Arr);
                if (m36870A()) {
                    this.f38487l = h14;
                } else {
                    this.f38488m = h14;
                }
            } else {
                String valueOf2 = String.valueOf(wVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 54);
                sb2.append("Invalid output channel config (mode=0) for: ");
                sb2.append(valueOf2);
                throw new t04(sb2.toString(), wVar);
            }
        } else {
            int i6 = d13.f20195a;
            throw new t04("Unable to configure passthrough for: ".concat(String.valueOf(wVar)), wVar);
        }
    }

    /* renamed from: j */
    public final void mo34483j(oe3 oe3) {
        if (!this.f38490o.equals(oe3)) {
            this.f38490o = oe3;
            zze();
        }
    }

    /* renamed from: k */
    public final void mo34484k(boolean z) {
        m36888w(m36883r().f34119a, z);
    }

    /* renamed from: q */
    public final long mo34485q(boolean z) {
        long j;
        if (!m36870A() || this.f38498w) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f38481f.mo31066b(z), this.f38488m.mo32318b(m36882p()));
        while (!this.f38482g.isEmpty() && min >= this.f38482g.getFirst().f34122d) {
            this.f38492q = this.f38482g.remove();
        }
        k14 k14 = this.f38492q;
        long j2 = min - k14.f34122d;
        if (k14.f34119a.equals(h20.f32588d)) {
            j = this.f38492q.f34121c + j2;
        } else if (this.f38482g.isEmpty()) {
            j = this.f38475P.mo32521a(j2) + this.f38492q.f34121c;
        } else {
            k14 first = this.f38482g.getFirst();
            j = first.f34121c - d13.m20291V(first.f34122d - min, this.f38492q.f34119a.f32590a);
        }
        return j + this.f38488m.mo32318b(this.f38475P.mo32522b());
    }

    public final h20 zzc() {
        return m36883r().f34119a;
    }

    public final void zze() {
        if (m36870A()) {
            this.f38494s = 0;
            this.f38495t = 0;
            this.f38496u = 0;
            this.f38474O = false;
            this.f38492q = new k14(m36883r().f34119a, m36883r().f34120b, 0, 0, (j14) null);
            this.f38499x = 0;
            this.f38491p = null;
            this.f38482g.clear();
            this.f38461B = null;
            this.f38462C = null;
            this.f38467H = false;
            this.f38466G = false;
            this.f38465F = -1;
            this.f38477b.mo30606j();
            m36885t();
            if (this.f38481f.mo31073i()) {
                this.f38489n.pause();
            }
            if (m36871B(this.f38489n)) {
                q14 q14 = this.f38483h;
                Objects.requireNonNull(q14);
                q14.mo34231b(this.f38489n);
            }
            AudioTrack audioTrack = this.f38489n;
            this.f38489n = null;
            if (d13.f20195a < 21 && !this.f38469J) {
                this.f38470K = 0;
            }
            h14 h14 = this.f38487l;
            if (h14 != null) {
                this.f38488m = h14;
                this.f38487l = null;
            }
            this.f38481f.mo31069e();
            this.f38480e.close();
            new g14(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f38485j.mo33233a();
        this.f38484i.mo33233a();
    }

    public final void zzf() {
        this.f38497v = true;
    }

    public final void zzg() {
        this.f38468I = false;
        if (m36870A() && this.f38481f.mo31076l()) {
            this.f38489n.pause();
        }
    }

    public final void zzh() {
        this.f38468I = true;
        if (m36870A()) {
            this.f38481f.mo31071g();
            this.f38489n.play();
        }
    }

    public final void zzi() throws x04 {
        if (!this.f38466G && m36870A() && m36891z()) {
            m36886u();
            this.f38466G = true;
        }
    }

    public final void zzj() {
        zze();
        for (g04 zzf : this.f38478c) {
            zzf.zzf();
        }
        g04[] g04Arr = this.f38479d;
        int length = g04Arr.length;
        for (int i = 0; i <= 0; i++) {
            g04Arr[i].zzf();
        }
        this.f38468I = false;
        this.f38473N = false;
    }

    public final boolean zzs() {
        return m36870A() && this.f38481f.mo31072h(m36882p());
    }

    public final boolean zzt() {
        return !m36870A() || (this.f38466G && !zzs());
    }
}
