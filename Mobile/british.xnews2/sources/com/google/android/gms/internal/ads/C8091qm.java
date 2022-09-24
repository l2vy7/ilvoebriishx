package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.qm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8091qm extends C8051pi {

    /* renamed from: Q */
    private final Context f38171Q;

    /* renamed from: R */
    private final C8161sm f38172R;

    /* renamed from: S */
    private final C7509an f38173S;

    /* renamed from: T */
    private final boolean f38174T;

    /* renamed from: U */
    private final long[] f38175U;

    /* renamed from: V */
    private zzapg[] f38176V;

    /* renamed from: W */
    private C8055pm f38177W;

    /* renamed from: X */
    private Surface f38178X;

    /* renamed from: Y */
    private Surface f38179Y;

    /* renamed from: Z */
    private boolean f38180Z;

    /* renamed from: a0 */
    private long f38181a0;

    /* renamed from: b0 */
    private long f38182b0;

    /* renamed from: c0 */
    private int f38183c0;

    /* renamed from: d0 */
    private int f38184d0;

    /* renamed from: e0 */
    private int f38185e0;

    /* renamed from: f0 */
    private float f38186f0;

    /* renamed from: g0 */
    private int f38187g0;

    /* renamed from: h0 */
    private int f38188h0;

    /* renamed from: i0 */
    private int f38189i0;

    /* renamed from: j0 */
    private float f38190j0;

    /* renamed from: k0 */
    private int f38191k0;

    /* renamed from: l0 */
    private int f38192l0;

    /* renamed from: m0 */
    private int f38193m0;

    /* renamed from: n0 */
    private float f38194n0;

    /* renamed from: o0 */
    private long f38195o0;

    /* renamed from: p0 */
    private int f38196p0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8091qm(Context context, C8123ri riVar, long j, Handler handler, C7545bn bnVar, int i) {
        super(2, riVar, (C8049pg) null, false);
        boolean z = false;
        this.f38171Q = context.getApplicationContext();
        this.f38172R = new C8161sm(context);
        this.f38173S = new C7509an(handler, bnVar);
        if (C7836jm.f33934a <= 22 && "foster".equals(C7836jm.f33935b) && "NVIDIA".equals(C7836jm.f33936c)) {
            z = true;
        }
        this.f38174T = z;
        this.f38175U = new long[10];
        this.f38195o0 = C6540C.TIME_UNSET;
        this.f38181a0 = C6540C.TIME_UNSET;
        this.f38187g0 = -1;
        this.f38188h0 = -1;
        this.f38190j0 = -1.0f;
        this.f38186f0 = -1.0f;
        m36506Q();
    }

    /* renamed from: P */
    private static int m36505P(zzapg zzapg) {
        int i = zzapg.f42877n;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: Q */
    private final void m36506Q() {
        this.f38191k0 = -1;
        this.f38192l0 = -1;
        this.f38194n0 = -1.0f;
        this.f38193m0 = -1;
    }

    /* renamed from: R */
    private final void m36507R() {
        if (this.f38183c0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f38173S.mo30430d(this.f38183c0, elapsedRealtime - this.f38182b0);
            this.f38183c0 = 0;
            this.f38182b0 = elapsedRealtime;
        }
    }

    /* renamed from: S */
    private final void m36508S() {
        int i = this.f38191k0;
        int i2 = this.f38187g0;
        if (i != i2 || this.f38192l0 != this.f38188h0 || this.f38193m0 != this.f38189i0 || this.f38194n0 != this.f38190j0) {
            this.f38173S.mo30434h(i2, this.f38188h0, this.f38189i0, this.f38190j0);
            this.f38191k0 = this.f38187g0;
            this.f38192l0 = this.f38188h0;
            this.f38193m0 = this.f38189i0;
            this.f38194n0 = this.f38190j0;
        }
    }

    /* renamed from: T */
    private final void m36509T() {
        if (this.f38191k0 != -1 || this.f38192l0 != -1) {
            this.f38173S.mo30434h(this.f38187g0, this.f38188h0, this.f38189i0, this.f38190j0);
        }
    }

    /* renamed from: U */
    private static boolean m36510U(long j) {
        return j < -30000;
    }

    /* renamed from: V */
    private final boolean m36511V(boolean z) {
        if (C7836jm.f33934a < 23 || (z && !zzaxh.m40630b(this.f38171Q))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo30898A(String str, long j, long j2) {
        this.f38173S.mo30428b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo30899B(zzapg zzapg) throws C7536be {
        super.mo30899B(zzapg);
        this.f38173S.mo30432f(zzapg);
        float f = zzapg.f42878o;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f38186f0 = f;
        this.f38185e0 = m36505P(zzapg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo30900C(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f38187g0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f38188h0 = i2;
        float f = this.f38186f0;
        this.f38190j0 = f;
        if (C7836jm.f33934a >= 21) {
            int i3 = this.f38185e0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f38187g0;
                this.f38187g0 = i2;
                this.f38188h0 = i4;
                this.f38190j0 = 1.0f / f;
            }
        } else {
            this.f38189i0 = this.f38185e0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo30902E(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j4 = j3;
        while (true) {
            int i4 = this.f38196p0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.f38175U;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.f38195o0 = j5;
            int i5 = i4 - 1;
            this.f38196p0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.f38195o0;
        if (z) {
            mo34358O(mediaCodec2, i3, j6);
            return true;
        }
        long j7 = j4 - j;
        if (this.f38178X == this.f38179Y) {
            if (!m36510U(j7)) {
                return false;
            }
            mo34358O(mediaCodec2, i3, j6);
            return true;
        } else if (!this.f38180Z) {
            if (C7836jm.f33934a >= 21) {
                mo34357N(mediaCodec, i, j6, System.nanoTime());
            } else {
                mo34356M(mediaCodec2, i3, j6);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long a = this.f38172R.mo34725a(j4, ((j7 - ((elapsedRealtime * 1000) - j2)) * 1000) + nanoTime);
            long j8 = (a - nanoTime) / 1000;
            if (m36510U(j8)) {
                C7725gm.m32582a("dropVideoBuffer");
                mediaCodec2.releaseOutputBuffer(i3, false);
                C7725gm.m32583b();
                C7903lg lgVar = this.f37654O;
                lgVar.f35025f++;
                this.f38183c0++;
                int i6 = this.f38184d0 + 1;
                this.f38184d0 = i6;
                lgVar.f35026g = Math.max(i6, lgVar.f35026g);
                if (this.f38183c0 == -1) {
                    m36507R();
                }
                return true;
            }
            if (C7836jm.f33934a >= 21) {
                if (j8 < 50000) {
                    mo34357N(mediaCodec, i, j6, a);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                mo34356M(mediaCodec2, i3, j6);
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo34130I(C7940mg mgVar) {
        int i = C7836jm.f33934a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo34131J() {
        try {
            super.mo34131J();
        } finally {
            Surface surface = this.f38179Y;
            if (surface != null) {
                if (this.f38178X == surface) {
                    this.f38178X = null;
                }
                surface.release();
                this.f38179Y = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final boolean mo34132K(MediaCodec mediaCodec, boolean z, zzapg zzapg, zzapg zzapg2) {
        if (!zzapg.f42870g.equals(zzapg2.f42870g) || m36505P(zzapg) != m36505P(zzapg2)) {
            return false;
        }
        if (!z && (zzapg.f42874k != zzapg2.f42874k || zzapg.f42875l != zzapg2.f42875l)) {
            return false;
        }
        int i = zzapg2.f42874k;
        C8055pm pmVar = this.f38177W;
        return i <= pmVar.f37709a && zzapg2.f42875l <= pmVar.f37710b && zzapg2.f42871h <= pmVar.f37711c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final boolean mo34133L(C7980ni niVar) {
        return this.f38178X != null || m36511V(niVar.f36021d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo34356M(MediaCodec mediaCodec, int i, long j) {
        m36508S();
        C7725gm.m32582a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C7725gm.m32583b();
        this.f37654O.f35023d++;
        this.f38184d0 = 0;
        mo34360w();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    /* renamed from: N */
    public final void mo34357N(MediaCodec mediaCodec, int i, long j, long j2) {
        m36508S();
        C7725gm.m32582a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C7725gm.m32583b();
        this.f37654O.f35023d++;
        this.f38184d0 = 0;
        mo34360w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo34358O(MediaCodec mediaCodec, int i, long j) {
        C7725gm.m32582a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C7725gm.m32583b();
        this.f37654O.f35024e++;
    }

    /* renamed from: b */
    public final boolean mo30904b() {
        Surface surface;
        if (super.mo30904b() && (this.f38180Z || (((surface = this.f38179Y) != null && this.f38178X == surface) || mo34127F() == null))) {
            this.f38181a0 = C6540C.TIME_UNSET;
            return true;
        } else if (this.f38181a0 == C6540C.TIME_UNSET) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f38181a0) {
                return true;
            }
            this.f38181a0 = C6540C.TIME_UNSET;
            return false;
        }
    }

    /* renamed from: j */
    public final void mo30905j(int i, Object obj) throws C7536be {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f38179Y;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    C7980ni G = mo34128G();
                    if (G != null && m36511V(G.f36021d)) {
                        surface = zzaxh.m40629a(this.f38171Q, G.f36021d);
                        this.f38179Y = surface;
                    }
                }
            }
            if (this.f38178X != surface) {
                this.f38178X = surface;
                int zzb = zzb();
                if (zzb == 1 || zzb == 2) {
                    MediaCodec F = mo34127F();
                    if (C7836jm.f33934a < 23 || F == null || surface == null) {
                        mo34131J();
                        mo34129H();
                    } else {
                        F.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f38179Y) {
                    m36506Q();
                    this.f38180Z = false;
                    int i2 = C7836jm.f33934a;
                    return;
                }
                m36509T();
                this.f38180Z = false;
                int i3 = C7836jm.f33934a;
                if (zzb == 2) {
                    this.f38181a0 = C6540C.TIME_UNSET;
                }
            } else if (surface != null && surface != this.f38179Y) {
                m36509T();
                if (this.f38180Z) {
                    this.f38173S.mo30433g(this.f38178X);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo30906o() {
        this.f38187g0 = -1;
        this.f38188h0 = -1;
        this.f38190j0 = -1.0f;
        this.f38186f0 = -1.0f;
        this.f38195o0 = C6540C.TIME_UNSET;
        this.f38196p0 = 0;
        m36506Q();
        this.f38180Z = false;
        int i = C7836jm.f33934a;
        this.f38172R.mo34726b();
        try {
            super.mo30906o();
        } finally {
            this.f37654O.mo33328a();
            this.f38173S.mo30429c(this.f37654O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo30907p(boolean z) throws C7536be {
        super.mo30907p(z);
        int i = mo36051n().f40768a;
        this.f38173S.mo30431e(this.f37654O);
        this.f38172R.mo34727c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo30908q(long j, boolean z) throws C7536be {
        super.mo30908q(j, z);
        this.f38180Z = false;
        int i = C7836jm.f33934a;
        this.f38184d0 = 0;
        int i2 = this.f38196p0;
        if (i2 != 0) {
            this.f38195o0 = this.f38175U[i2 - 1];
            this.f38196p0 = 0;
        }
        this.f38181a0 = C6540C.TIME_UNSET;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo30909r() {
        this.f38183c0 = 0;
        this.f38182b0 = SystemClock.elapsedRealtime();
        this.f38181a0 = C6540C.TIME_UNSET;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo30910s() {
        m36507R();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo34359t(zzapg[] zzapgArr, long j) throws C7536be {
        this.f38176V = zzapgArr;
        if (this.f38195o0 == C6540C.TIME_UNSET) {
            this.f38195o0 = j;
            return;
        }
        int i = this.f38196p0;
        if (i == 10) {
            long j2 = this.f38175U[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j2);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.f38196p0 = i + 1;
        }
        this.f38175U[this.f38196p0 - 1] = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo30911v(C8123ri riVar, zzapg zzapg) throws C8228ui {
        boolean z;
        int i;
        int i2;
        String str = zzapg.f42870g;
        int i3 = 0;
        if (!C8374yl.m39951b(str)) {
            return 0;
        }
        zzarf zzarf = zzapg.f42873j;
        if (zzarf != null) {
            z = false;
            for (int i4 = 0; i4 < zzarf.f42897d; i4++) {
                z |= zzarf.mo36199a(i4).f42894f;
            }
        } else {
            z = false;
        }
        C7980ni c = C8407zi.m40355c(str, z);
        if (c == null) {
            return 1;
        }
        boolean e = c.mo33703e(zzapg.f42867d);
        if (e && (i = zzapg.f42874k) > 0 && (i2 = zzapg.f42875l) > 0) {
            if (C7836jm.f33934a >= 21) {
                e = c.mo33704f(i, i2, (double) zzapg.f42876m);
            } else {
                e = i * i2 <= C8407zi.m40353a();
                if (!e) {
                    int i5 = zzapg.f42874k;
                    int i6 = zzapg.f42875l;
                    String str2 = C7836jm.f33938e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
            }
        }
        int i7 = true != c.f36019b ? 4 : 8;
        if (true == c.f36020c) {
            i3 = 16;
        }
        return (true != e ? 2 : 3) | i7 | i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo34360w() {
        if (!this.f38180Z) {
            this.f38180Z = true;
            this.f38173S.mo30433g(this.f38178X);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30913z(com.google.android.gms.internal.ads.C7980ni r12, android.media.MediaCodec r13, com.google.android.gms.internal.ads.zzapg r14, android.media.MediaCrypto r15) throws com.google.android.gms.internal.ads.C8228ui {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzapg[] r15 = r11.f38176V
            int r0 = r14.f42874k
            int r1 = r14.f42875l
            int r2 = r14.f42871h
            r3 = 0
            r4 = -1
            if (r2 != r4) goto L_0x0091
            java.lang.String r2 = r14.f42870g
            if (r0 == r4) goto L_0x0090
            if (r1 != r4) goto L_0x0014
            goto L_0x0090
        L_0x0014:
            int r5 = r2.hashCode()
            r6 = 5
            r7 = 1
            r8 = 4
            r9 = 3
            r10 = 2
            switch(r5) {
                case -1664118616: goto L_0x0053;
                case -1662541442: goto L_0x0049;
                case 1187890754: goto L_0x003f;
                case 1331836730: goto L_0x0035;
                case 1599127256: goto L_0x002b;
                case 1599127257: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 5
            goto L_0x005e
        L_0x002b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 3
            goto L_0x005e
        L_0x0035:
            java.lang.String r5 = "video/avc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005e
        L_0x003f:
            java.lang.String r5 = "video/mp4v-es"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x0049:
            java.lang.String r5 = "video/hevc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 4
            goto L_0x005e
        L_0x0053:
            java.lang.String r5 = "video/3gpp"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            if (r2 == 0) goto L_0x0088
            if (r2 == r7) goto L_0x0088
            if (r2 == r10) goto L_0x006e
            if (r2 == r9) goto L_0x0088
            if (r2 == r8) goto L_0x006b
            if (r2 == r6) goto L_0x006b
            goto L_0x0090
        L_0x006b:
            int r2 = r0 * r1
            goto L_0x008b
        L_0x006e:
            java.lang.String r2 = com.google.android.gms.internal.ads.C7836jm.f33937d
            java.lang.String r5 = "BRAVIA 4K 2015"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            r2 = 16
            int r5 = com.google.android.gms.internal.ads.C7836jm.m33642d(r0, r2)
            int r2 = com.google.android.gms.internal.ads.C7836jm.m33642d(r1, r2)
            int r5 = r5 * r2
            int r2 = r5 * 256
            goto L_0x008a
        L_0x0088:
            int r2 = r0 * r1
        L_0x008a:
            r8 = 2
        L_0x008b:
            int r2 = r2 * 3
            int r8 = r8 + r8
            int r2 = r2 / r8
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            int r15 = r15.length
            com.google.android.gms.internal.ads.pm r15 = new com.google.android.gms.internal.ads.pm
            r15.<init>(r0, r1, r2)
            r11.f38177W = r15
            boolean r0 = r11.f38174T
            android.media.MediaFormat r14 = r14.mo36185b()
            int r1 = r15.f37709a
            java.lang.String r2 = "max-width"
            r14.setInteger(r2, r1)
            int r1 = r15.f37710b
            java.lang.String r2 = "max-height"
            r14.setInteger(r2, r1)
            int r15 = r15.f37711c
            if (r15 == r4) goto L_0x00b6
            java.lang.String r1 = "max-input-size"
            r14.setInteger(r1, r15)
        L_0x00b6:
            if (r0 == 0) goto L_0x00bd
            java.lang.String r15 = "auto-frc"
            r14.setInteger(r15, r3)
        L_0x00bd:
            android.view.Surface r15 = r11.f38178X
            if (r15 != 0) goto L_0x00dc
            boolean r15 = r12.f36021d
            boolean r15 = r11.m36511V(r15)
            com.google.android.gms.internal.ads.C8195tl.m37900e(r15)
            android.view.Surface r15 = r11.f38179Y
            if (r15 != 0) goto L_0x00d8
            android.content.Context r15 = r11.f38171Q
            boolean r12 = r12.f36021d
            com.google.android.gms.internal.ads.zzaxh r12 = com.google.android.gms.internal.ads.zzaxh.m40629a(r15, r12)
            r11.f38179Y = r12
        L_0x00d8:
            android.view.Surface r12 = r11.f38179Y
            r11.f38178X = r12
        L_0x00dc:
            android.view.Surface r12 = r11.f38178X
            r15 = 0
            r13.configure(r14, r12, r15, r3)
            int r12 = com.google.android.gms.internal.ads.C7836jm.f33934a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8091qm.mo30913z(com.google.android.gms.internal.ads.ni, android.media.MediaCodec, com.google.android.gms.internal.ads.zzapg, android.media.MediaCrypto):void");
    }
}
