package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class l34 extends lb3 {

    /* renamed from: M0 */
    private static final byte[] f34818M0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private C8281w f34819A;

    /* renamed from: A0 */
    private boolean f34820A0;

    /* renamed from: B */
    private MediaCrypto f34821B;

    /* renamed from: B0 */
    private long f34822B0;

    /* renamed from: C */
    private boolean f34823C;

    /* renamed from: C0 */
    private long f34824C0;

    /* renamed from: D */
    private long f34825D;

    /* renamed from: D0 */
    private boolean f34826D0;

    /* renamed from: E */
    private float f34827E;

    /* renamed from: E0 */
    private boolean f34828E0;

    /* renamed from: F */
    private float f34829F;

    /* renamed from: F0 */
    private boolean f34830F0;

    /* renamed from: G */
    private h34 f34831G;

    /* renamed from: G0 */
    protected mc3 f34832G0;

    /* renamed from: H */
    private C8281w f34833H;

    /* renamed from: H0 */
    private long f34834H0;

    /* renamed from: I */
    private MediaFormat f34835I;

    /* renamed from: I0 */
    private long f34836I0;

    /* renamed from: J */
    private boolean f34837J;

    /* renamed from: J0 */
    private int f34838J0;

    /* renamed from: K */
    private float f34839K;

    /* renamed from: K0 */
    private m24 f34840K0;

    /* renamed from: L */
    private ArrayDeque<j34> f34841L;

    /* renamed from: L0 */
    private m24 f34842L0;

    /* renamed from: M */
    private k34 f34843M;

    /* renamed from: N */
    private j34 f34844N;

    /* renamed from: O */
    private int f34845O;

    /* renamed from: P */
    private boolean f34846P;

    /* renamed from: Q */
    private boolean f34847Q;

    /* renamed from: R */
    private boolean f34848R;

    /* renamed from: S */
    private boolean f34849S;

    /* renamed from: T */
    private boolean f34850T;

    /* renamed from: U */
    private boolean f34851U;

    /* renamed from: V */
    private boolean f34852V;

    /* renamed from: W */
    private boolean f34853W;

    /* renamed from: X */
    private boolean f34854X;

    /* renamed from: Y */
    private boolean f34855Y;

    /* renamed from: Z */
    private c34 f34856Z;

    /* renamed from: l0 */
    private long f34857l0;

    /* renamed from: m */
    private final g34 f34858m;

    /* renamed from: m0 */
    private int f34859m0;

    /* renamed from: n */
    private final n34 f34860n;

    /* renamed from: n0 */
    private int f34861n0;

    /* renamed from: o */
    private final float f34862o;

    /* renamed from: o0 */
    private ByteBuffer f34863o0;

    /* renamed from: p */
    private final s51 f34864p = new s51(0, 0);

    /* renamed from: p0 */
    private boolean f34865p0;

    /* renamed from: q */
    private final s51 f34866q = new s51(0, 0);

    /* renamed from: q0 */
    private boolean f34867q0;

    /* renamed from: r */
    private final s51 f34868r = new s51(2, 0);

    /* renamed from: r0 */
    private boolean f34869r0;

    /* renamed from: s */
    private final a34 f34870s;

    /* renamed from: s0 */
    private boolean f34871s0;

    /* renamed from: t */
    private final zw2<C8281w> f34872t;

    /* renamed from: t0 */
    private boolean f34873t0;

    /* renamed from: u */
    private final ArrayList<Long> f34874u;

    /* renamed from: u0 */
    private boolean f34875u0;

    /* renamed from: v */
    private final MediaCodec.BufferInfo f34876v;

    /* renamed from: v0 */
    private int f34877v0;

    /* renamed from: w */
    private final long[] f34878w;

    /* renamed from: w0 */
    private int f34879w0;

    /* renamed from: x */
    private final long[] f34880x;

    /* renamed from: x0 */
    private int f34881x0;

    /* renamed from: y */
    private final long[] f34882y;

    /* renamed from: y0 */
    private boolean f34883y0;

    /* renamed from: z */
    private C8281w f34884z;

    /* renamed from: z0 */
    private boolean f34885z0;

    public l34(int i, g34 g34, n34 n34, boolean z, float f) {
        super(i);
        this.f34858m = g34;
        Objects.requireNonNull(n34);
        this.f34860n = n34;
        this.f34862o = f;
        a34 a34 = new a34();
        this.f34870s = a34;
        this.f34872t = new zw2<>(10);
        this.f34874u = new ArrayList<>();
        this.f34876v = new MediaCodec.BufferInfo();
        this.f34827E = 1.0f;
        this.f34829F = 1.0f;
        this.f34825D = C6540C.TIME_UNSET;
        this.f34878w = new long[10];
        this.f34880x = new long[10];
        this.f34882y = new long[10];
        this.f34834H0 = C6540C.TIME_UNSET;
        this.f34836I0 = C6540C.TIME_UNSET;
        a34.mo18825i(0);
        a34.f20810c.order(ByteOrder.nativeOrder());
        this.f34839K = -1.0f;
        this.f34845O = 0;
        this.f34877v0 = 0;
        this.f34859m0 = -1;
        this.f34861n0 = -1;
        this.f34857l0 = C6540C.TIME_UNSET;
        this.f34822B0 = C6540C.TIME_UNSET;
        this.f34824C0 = C6540C.TIME_UNSET;
        this.f34879w0 = 0;
        this.f34881x0 = 0;
    }

    /* renamed from: H */
    private final void m34285H() {
        this.f34873t0 = false;
        this.f34870s.mo18824b();
        this.f34868r.mo18824b();
        this.f34871s0 = false;
        this.f34869r0 = false;
    }

    /* renamed from: I */
    private final void mo36027I() throws vk3 {
        if (this.f34883y0) {
            this.f34879w0 = 1;
            this.f34881x0 = 3;
            return;
        }
        mo33268i0();
        mo33266g0();
    }

    /* renamed from: P */
    private final boolean m34287P() throws vk3 {
        h34 h34 = this.f34831G;
        if (h34 == null || this.f34879w0 == 2 || this.f34826D0) {
            return false;
        }
        if (this.f34859m0 < 0) {
            int zza = h34.zza();
            this.f34859m0 = zza;
            if (zza < 0) {
                return false;
            }
            this.f34866q.f20810c = this.f34831G.zzf(zza);
            this.f34866q.mo18824b();
        }
        if (this.f34879w0 == 1) {
            if (!this.f34855Y) {
                this.f34885z0 = true;
                this.f34831G.mo31100a(this.f34859m0, 0, 0, 0, 4);
                m34295q0();
            }
            this.f34879w0 = 2;
            return false;
        } else if (this.f34853W) {
            this.f34853W = false;
            this.f34866q.f20810c.put(f34818M0);
            this.f34831G.mo31100a(this.f34859m0, 0, 38, 0, 0);
            m34295q0();
            this.f34883y0 = true;
            return true;
        } else {
            if (this.f34877v0 == 1) {
                for (int i = 0; i < this.f34833H.f40621n.size(); i++) {
                    this.f34866q.f20810c.put(this.f34833H.f40621n.get(i));
                }
                this.f34877v0 = 2;
            }
            int position = this.f34866q.f20810c.position();
            mw3 t = mo33304t();
            try {
                int o = mo33301o(t, this.f34866q, 0);
                if (mo32473b()) {
                    this.f34824C0 = this.f34822B0;
                }
                if (o == -3) {
                    return false;
                }
                if (o == -5) {
                    if (this.f34877v0 == 2) {
                        this.f34866q.mo18824b();
                        this.f34877v0 = 1;
                    }
                    mo33248G(t);
                    return true;
                } else if (this.f34866q.mo33441g()) {
                    if (this.f34877v0 == 2) {
                        this.f34866q.mo18824b();
                        this.f34877v0 = 1;
                    }
                    this.f34826D0 = true;
                    if (!this.f34883y0) {
                        m34294p0();
                        return false;
                    }
                    try {
                        if (!this.f34855Y) {
                            this.f34885z0 = true;
                            this.f34831G.mo31100a(this.f34859m0, 0, 0, 0, 4);
                            m34295q0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo33302p(e, this.f34884z, false, xy3.m39690b(e.getErrorCode()));
                    }
                } else if (this.f34883y0 || this.f34866q.mo33442h()) {
                    boolean k = this.f34866q.mo18827k();
                    if (k) {
                        this.f34866q.f20809b.mo33828b(position);
                    }
                    if (this.f34846P && !k) {
                        ByteBuffer byteBuffer = this.f34866q.f20810c;
                        byte[] bArr = kh2.f34333a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1) {
                                    if ((byteBuffer.get(i4) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer.duplicate();
                                        duplicate.position(i2 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer.position(0);
                                        byteBuffer.put(duplicate);
                                        break;
                                    }
                                    b = 1;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.f34866q.f20810c.position() == 0) {
                            return true;
                        }
                        this.f34846P = false;
                    }
                    s51 s51 = this.f34866q;
                    long j = s51.f20812e;
                    c34 c34 = this.f34856Z;
                    if (c34 != null) {
                        j = c34.mo30852b(this.f34884z, s51);
                        this.f34822B0 = Math.max(this.f34822B0, this.f34856Z.mo30851a(this.f34884z));
                    }
                    long j2 = j;
                    if (this.f34866q.mo33440f()) {
                        this.f34874u.add(Long.valueOf(j2));
                    }
                    if (this.f34830F0) {
                        this.f34872t.mo36140d(j2, this.f34884z);
                        this.f34830F0 = false;
                    }
                    this.f34822B0 = Math.max(this.f34822B0, j2);
                    this.f34866q.mo18826j();
                    if (this.f34866q.mo33439e()) {
                        mo33265f0(this.f34866q);
                    }
                    mo33256W(this.f34866q);
                    if (k) {
                        try {
                            this.f34831G.mo31102c(this.f34859m0, 0, this.f34866q.f20809b, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo33302p(e2, this.f34884z, false, xy3.m39690b(e2.getErrorCode()));
                        }
                    } else {
                        this.f34831G.mo31100a(this.f34859m0, 0, this.f34866q.f20810c.limit(), j2, 0);
                    }
                    m34295q0();
                    this.f34883y0 = true;
                    this.f34877v0 = 0;
                    this.f34832G0.f35486c++;
                    return true;
                } else {
                    this.f34866q.mo18824b();
                    if (this.f34877v0 == 2) {
                        this.f34877v0 = 1;
                    }
                    return true;
                }
            } catch (q41 e3) {
                mo33251L(e3);
                m34289R(0);
                mo35349U();
                return true;
            }
        }
    }

    /* renamed from: Q */
    private final boolean m34288Q() {
        return this.f34861n0 >= 0;
    }

    /* renamed from: R */
    private final boolean m34289R(int i) throws vk3 {
        mw3 t = mo33304t();
        this.f34864p.mo18824b();
        int o = mo33301o(t, this.f34864p, i | 4);
        if (o == -5) {
            mo33248G(t);
            return true;
        } else if (o != -4 || !this.f34864p.mo33441g()) {
            return false;
        } else {
            this.f34826D0 = true;
            m34294p0();
            return false;
        }
    }

    /* renamed from: S */
    private final boolean m34290S(long j) {
        return this.f34825D == C6540C.TIME_UNSET || SystemClock.elapsedRealtime() - j < this.f34825D;
    }

    /* renamed from: T */
    private final boolean m34291T(C8281w wVar) throws vk3 {
        if (!(d13.f20195a < 23 || this.f34831G == null || this.f34881x0 == 3 || mo32481l() == 0)) {
            float D = mo33245D(this.f34829F, wVar, mo33300n());
            float f = this.f34839K;
            if (f == D) {
                return true;
            }
            if (D == -1.0f) {
                mo36027I();
                return false;
            } else if (f == -1.0f && D <= this.f34862o) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", D);
                this.f34831G.mo31107i(bundle);
                this.f34839K = D;
            }
        }
        return true;
    }

    /* renamed from: U */
    private final void mo35349U() {
        try {
            this.f34831G.zzi();
        } finally {
            mo33269j0();
        }
    }

    /* renamed from: o0 */
    protected static boolean m34293o0(C8281w wVar) {
        return wVar.f40606E == 0;
    }

    @TargetApi(23)
    /* renamed from: p0 */
    private final void m34294p0() throws vk3 {
        int i = this.f34881x0;
        if (i == 1) {
            mo35349U();
        } else if (i == 2) {
            mo35349U();
            m34297s0();
        } else if (i != 3) {
            this.f34828E0 = true;
            mo33257X();
        } else {
            mo33268i0();
            mo33266g0();
        }
    }

    /* renamed from: q0 */
    private final void m34295q0() {
        this.f34859m0 = -1;
        this.f34866q.f20810c = null;
    }

    /* renamed from: r0 */
    private final void m34296r0() {
        this.f34861n0 = -1;
        this.f34863o0 = null;
    }

    /* renamed from: s0 */
    private final void m34297s0() throws vk3 {
        try {
            throw null;
        } catch (MediaCryptoException e) {
            throw mo33302p(e, this.f34884z, false, 6006);
        }
    }

    @TargetApi(23)
    /* renamed from: t0 */
    private final boolean m34298t0() throws vk3 {
        if (this.f34883y0) {
            this.f34879w0 = 1;
            if (this.f34847Q || this.f34849S) {
                this.f34881x0 = 3;
                return false;
            }
            this.f34881x0 = 2;
        } else {
            m34297s0();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo33244C(C8281w[] wVarArr, long j, long j2) throws vk3 {
        boolean z = true;
        if (this.f34836I0 == C6540C.TIME_UNSET) {
            if (this.f34834H0 != C6540C.TIME_UNSET) {
                z = false;
            }
            nu1.m20747f(z);
            this.f34834H0 = j;
            this.f34836I0 = j2;
            return;
        }
        int i = this.f34838J0;
        if (i == 10) {
            long j3 = this.f34880x[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f34838J0 = i + 1;
        }
        long[] jArr = this.f34878w;
        int i2 = this.f34838J0 - 1;
        jArr[i2] = j;
        this.f34880x[i2] = j2;
        this.f34882y[i2] = this.f34822B0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract float mo33245D(float f, C8281w wVar, C8281w[] wVarArr);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract int mo33246E(n34 n34, C8281w wVar) throws u34;

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract nd3 mo33247F(j34 j34, C8281w wVar, C8281w wVar2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (m34298t0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (m34298t0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (m34298t0() == false) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d0 A[RETURN] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.nd3 mo33248G(com.google.android.gms.internal.ads.mw3 r13) throws com.google.android.gms.internal.ads.vk3 {
        /*
            r12 = this;
            r0 = 1
            r12.f34830F0 = r0
            com.google.android.gms.internal.ads.w r4 = r13.f35636a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r1 = r4.f40619l
            r2 = 0
            if (r1 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.m24 r13 = r13.f35637b
            r12.f34842L0 = r13
            r12.f34884z = r4
            boolean r1 = r12.f34869r0
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r12.f34873t0 = r0
            return r3
        L_0x001b:
            com.google.android.gms.internal.ads.h34 r1 = r12.f34831G
            if (r1 != 0) goto L_0x0025
            r12.f34841L = r3
            r12.mo33266g0()
            return r3
        L_0x0025:
            com.google.android.gms.internal.ads.j34 r3 = r12.f34844N
            com.google.android.gms.internal.ads.w r5 = r12.f34833H
            com.google.android.gms.internal.ads.m24 r6 = r12.f34840K0
            r7 = 23
            if (r6 != r13) goto L_0x00d1
            if (r13 == r6) goto L_0x0038
            int r8 = com.google.android.gms.internal.ads.d13.f20195a
            if (r8 < r7) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            com.google.android.gms.internal.ads.nu1.m20747f(r7)
            com.google.android.gms.internal.ads.nd3 r7 = r12.mo33247F(r3, r5, r4)
            int r8 = r7.f35986d
            r9 = 3
            r10 = 16
            r11 = 2
            if (r8 == 0) goto L_0x00b4
            if (r8 == r0) goto L_0x008a
            if (r8 == r11) goto L_0x005e
            boolean r0 = r12.m34291T(r4)
            if (r0 != 0) goto L_0x0053
            goto L_0x0090
        L_0x0053:
            r12.f34833H = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m34298t0()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x005e:
            boolean r8 = r12.m34291T(r4)
            if (r8 != 0) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            r12.f34875u0 = r0
            r12.f34877v0 = r0
            int r8 = r12.f34845O
            if (r8 == r11) goto L_0x007d
            if (r8 != r0) goto L_0x007c
            int r8 = r4.f40624q
            int r10 = r5.f40624q
            if (r8 != r10) goto L_0x007c
            int r8 = r4.f40625r
            int r10 = r5.f40625r
            if (r8 != r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r12.f34853W = r0
            r12.f34833H = r4
            if (r13 == r6) goto L_0x00b7
            boolean r13 = r12.m34298t0()
            if (r13 != 0) goto L_0x00b7
            goto L_0x009d
        L_0x008a:
            boolean r8 = r12.m34291T(r4)
            if (r8 != 0) goto L_0x0093
        L_0x0090:
            r6 = 16
            goto L_0x00b8
        L_0x0093:
            r12.f34833H = r4
            if (r13 == r6) goto L_0x009f
            boolean r13 = r12.m34298t0()
            if (r13 != 0) goto L_0x00b7
        L_0x009d:
            r6 = 2
            goto L_0x00b8
        L_0x009f:
            boolean r13 = r12.f34883y0
            if (r13 == 0) goto L_0x00b7
            r12.f34879w0 = r0
            boolean r13 = r12.f34847Q
            if (r13 != 0) goto L_0x00b1
            boolean r13 = r12.f34849S
            if (r13 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r12.f34881x0 = r0
            goto L_0x00b7
        L_0x00b1:
            r12.f34881x0 = r9
            goto L_0x009d
        L_0x00b4:
            r12.mo36027I()
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            int r13 = r7.f35986d
            if (r13 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.h34 r13 = r12.f34831G
            if (r13 != r1) goto L_0x00c4
            int r13 = r12.f34881x0
            if (r13 != r9) goto L_0x00d0
        L_0x00c4:
            com.google.android.gms.internal.ads.nd3 r13 = new com.google.android.gms.internal.ads.nd3
            java.lang.String r2 = r3.f33740a
            r0 = 0
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00d0:
            return r7
        L_0x00d1:
            if (r13 == 0) goto L_0x00e7
            if (r6 != 0) goto L_0x00d6
            goto L_0x00e7
        L_0x00d6:
            int r13 = com.google.android.gms.internal.ads.d13.f20195a
            if (r13 < r7) goto L_0x00e7
            java.util.UUID r13 = com.google.android.gms.internal.ads.xy3.f41586e
            java.util.UUID r0 = com.google.android.gms.internal.ads.xy3.f41582a
            boolean r1 = r13.equals(r0)
            if (r1 != 0) goto L_0x00e7
            r13.equals(r0)
        L_0x00e7:
            r12.mo36027I()
            com.google.android.gms.internal.ads.nd3 r13 = new com.google.android.gms.internal.ads.nd3
            java.lang.String r2 = r3.f33740a
            r0 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r13
            r3 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L_0x00f8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.vk3 r13 = r12.mo33302p(r13, r4, r2, r0)
            goto L_0x0105
        L_0x0104:
            throw r13
        L_0x0105:
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l34.mo33248G(com.google.android.gms.internal.ads.mw3):com.google.android.gms.internal.ads.nd3");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract f34 mo33249J(j34 j34, C8281w wVar, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public abstract List<j34> mo33250K(n34 n34, C8281w wVar, boolean z) throws u34;

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract void mo33251L(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract void mo33252M(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo33253N(String str);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public abstract void mo33254O(C8281w wVar, MediaFormat mediaFormat) throws vk3;

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public abstract void mo33255V();

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public abstract void mo33256W(s51 s51) throws vk3;

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo33257X() throws vk3 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public abstract boolean mo33258Y(long j, long j2, h34 h34, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8281w wVar) throws vk3;

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public boolean mo33259Z(C8281w wVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final float mo33260a0() {
        return this.f34827E;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final long mo33261b0() {
        return this.f34836I0;
    }

    /* renamed from: c */
    public void mo32474c(float f, float f2) throws vk3 {
        this.f34827E = f;
        this.f34829F = f2;
        m34291T(this.f34833H);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final h34 mo33262c0() {
        return this.f34831G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public i34 mo33263d0(Throwable th, j34 j34) {
        return new i34(th, j34);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final j34 mo33264e0() {
        return this.f34844N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo33265f0(s51 s51) throws vk3 {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.google.android.gms.internal.ads.h34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: com.google.android.gms.internal.ads.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v89, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: com.google.android.gms.internal.ads.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: com.google.android.gms.internal.ads.l34} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:84|85|(1:87)(0)|88|263|(1:198)|202|213|214) */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x026d, code lost:
        if (r15.f34819A != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02b9, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        m34294p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02bc, code lost:
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02be, code lost:
        r1 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02c0, code lost:
        if (r15.f34828E0 != false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c2, code lost:
        mo33268i0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02c5, code lost:
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x033a, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0154, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        m34294p0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0159, code lost:
        if (r15.f34828E0 != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015b, code lost:
        mo33268i0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015e, code lost:
        r2 = r9;
        r1 = r15;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x02b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0154 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01b0 A[Catch:{ IllegalStateException -> 0x035f }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x031b A[Catch:{ IllegalStateException -> 0x035c }, LOOP:2: B:75:0x013d->B:196:0x031b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0325 A[Catch:{ IllegalStateException -> 0x035c }, LOOP:4: B:198:0x0325->B:201:0x032f, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x031a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0322 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x016e A[Catch:{ IllegalStateException -> 0x035f }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32478g(long r24, long r26) throws com.google.android.gms.internal.ads.vk3 {
        /*
            r23 = this;
            r15 = r23
            r14 = 1
            r13 = 0
            boolean r0 = r15.f34828E0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x000c
            r23.mo33257X()     // Catch:{ IllegalStateException -> 0x035f }
            return
        L_0x000c:
            com.google.android.gms.internal.ads.w r0 = r15.f34884z     // Catch:{ IllegalStateException -> 0x035f }
            r11 = 2
            if (r0 != 0) goto L_0x0019
            boolean r0 = r15.m34289R(r11)     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            r23.mo33266g0()     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r15.f34869r0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "bypassRender"
            com.google.android.gms.internal.ads.bz2.m30876a(r0)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0025:
            boolean r0 = r15.f34828E0     // Catch:{ IllegalStateException -> 0x035f }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.nu1.m20747f(r0)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo30300q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            java.nio.ByteBuffer r7 = r0.f20810c     // Catch:{ IllegalStateException -> 0x035f }
            int r8 = r15.f34861n0     // Catch:{ IllegalStateException -> 0x035f }
            int r10 = r0.mo30296m()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            long r11 = r0.f20812e     // Catch:{ IllegalStateException -> 0x035f }
            r6 = 0
            r9 = 0
            boolean r0 = r0.mo33440f()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.a34 r1 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            boolean r16 = r1.mo33441g()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.w r4 = r15.f34819A     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r23
            r2 = r24
            r17 = r4
            r4 = r26
            r13 = r0
            r14 = r16
            r15 = r17
            boolean r0 = r1.mo33258Y(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0079 }
            if (r0 == 0) goto L_0x0073
            r15 = r23
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            long r0 = r0.mo30297n()     // Catch:{ IllegalStateException -> 0x035f }
            r15.mo33267h0(r0)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            r0.mo18824b()     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x007f
        L_0x0073:
            r15 = r23
            r13 = 0
            r14 = 1
            goto L_0x0127
        L_0x0079:
            r0 = move-exception
            r2 = 1
            r19 = 0
            goto L_0x02cb
        L_0x007f:
            boolean r0 = r15.f34826D0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0089
            r14 = 1
            r15.f34828E0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            r13 = 0
            goto L_0x0127
        L_0x0089:
            r14 = 1
            boolean r0 = r15.f34871s0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.s51 r1 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo30299p(r1)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.nu1.m20747f(r0)     // Catch:{ IllegalStateException -> 0x035f }
            r13 = 0
            r15.f34871s0 = r13     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x009e
        L_0x009d:
            r13 = 0
        L_0x009e:
            boolean r0 = r15.f34873t0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x00b6
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo30300q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0025
            r23.m34285H()     // Catch:{ IllegalStateException -> 0x035f }
            r15.f34873t0 = r13     // Catch:{ IllegalStateException -> 0x035f }
            r23.mo33266g0()     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r15.f34869r0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0127
        L_0x00b6:
            boolean r0 = r15.f34826D0     // Catch:{ IllegalStateException -> 0x035f }
            r0 = r0 ^ r14
            com.google.android.gms.internal.ads.nu1.m20747f(r0)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.mw3 r0 = r23.mo33304t()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.s51 r1 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo18824b()     // Catch:{ IllegalStateException -> 0x035f }
        L_0x00c5:
            com.google.android.gms.internal.ads.s51 r1 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo18824b()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.s51 r1 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r15.mo33301o(r0, r1, r13)     // Catch:{ IllegalStateException -> 0x035f }
            r2 = -5
            if (r1 == r2) goto L_0x0105
            r2 = -4
            if (r1 == r2) goto L_0x00d7
            goto L_0x0108
        L_0x00d7:
            com.google.android.gms.internal.ads.s51 r1 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            boolean r1 = r1.mo33441g()     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x00e2
            r15.f34826D0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x0108
        L_0x00e2:
            boolean r1 = r15.f34830F0     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x00f3
            com.google.android.gms.internal.ads.w r1 = r15.f34884z     // Catch:{ IllegalStateException -> 0x035f }
            java.util.Objects.requireNonNull(r1)
            r15.f34819A = r1     // Catch:{ IllegalStateException -> 0x035f }
            r2 = 0
            r15.mo33254O(r1, r2)     // Catch:{ IllegalStateException -> 0x035f }
            r15.f34830F0 = r13     // Catch:{ IllegalStateException -> 0x035f }
        L_0x00f3:
            com.google.android.gms.internal.ads.s51 r1 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo18826j()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.a34 r1 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.s51 r2 = r15.f34868r     // Catch:{ IllegalStateException -> 0x035f }
            boolean r1 = r1.mo30299p(r2)     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 != 0) goto L_0x00c5
            r15.f34871s0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x0108
        L_0x0105:
            r15.mo33248G(r0)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0108:
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo30300q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0115
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            r0.mo18826j()     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0115:
            com.google.android.gms.internal.ads.a34 r0 = r15.f34870s     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r0.mo30300q()     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.f34826D0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0025
            boolean r0 = r15.f34873t0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0127
            goto L_0x0025
        L_0x0127:
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r15
            r2 = 1
            r19 = 0
            goto L_0x0354
        L_0x0130:
            com.google.android.gms.internal.ads.h34 r0 = r15.f34831G     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0342
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x033d }
            java.lang.String r0 = "drainAndFeed"
            com.google.android.gms.internal.ads.bz2.m30876a(r0)     // Catch:{ IllegalStateException -> 0x033d }
        L_0x013d:
            boolean r0 = r23.m34288Q()     // Catch:{ IllegalStateException -> 0x033d }
            if (r0 != 0) goto L_0x0278
            boolean r0 = r15.f34850T     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r15.f34885z0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0164
            com.google.android.gms.internal.ads.h34 r0 = r15.f34831G     // Catch:{ IllegalStateException -> 0x0154 }
            android.media.MediaCodec$BufferInfo r1 = r15.f34876v     // Catch:{ IllegalStateException -> 0x0154 }
            int r0 = r0.mo31105f(r1)     // Catch:{ IllegalStateException -> 0x0154 }
            goto L_0x016c
        L_0x0154:
            r23.m34294p0()     // Catch:{ IllegalStateException -> 0x035f }
            boolean r0 = r15.f34828E0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x015e
            r23.mo33268i0()     // Catch:{ IllegalStateException -> 0x035f }
        L_0x015e:
            r2 = r9
            r1 = r15
            r19 = 0
            goto L_0x0325
        L_0x0164:
            com.google.android.gms.internal.ads.h34 r0 = r15.f34831G     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaCodec$BufferInfo r1 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            int r0 = r0.mo31105f(r1)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x016c:
            if (r0 >= 0) goto L_0x01b0
            r1 = -2
            if (r0 != r1) goto L_0x01a0
            r15.f34820A0 = r14     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.h34 r0 = r15.f34831G     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaFormat r0 = r0.zzc()     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r15.f34845O     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x0192
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x035f }
            r2 = 32
            if (r1 != r2) goto L_0x0192
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 != r2) goto L_0x0192
            r15.f34854X = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x01bb
        L_0x0192:
            boolean r1 = r15.f34852V     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x019b:
            r15.f34835I = r0     // Catch:{ IllegalStateException -> 0x035f }
            r15.f34837J = r14     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x01bb
        L_0x01a0:
            boolean r0 = r15.f34855Y     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x015e
            boolean r0 = r15.f34826D0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x01ac
            int r0 = r15.f34879w0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != r11) goto L_0x015e
        L_0x01ac:
            r23.m34294p0()     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x015e
        L_0x01b0:
            boolean r1 = r15.f34854X     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x01c3
            r15.f34854X = r13     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.h34 r1 = r15.f34831G     // Catch:{ IllegalStateException -> 0x035f }
            r1.mo31104e(r0, r13)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x01bb:
            r2 = r9
            r1 = r15
            r16 = 2
            r19 = 0
            goto L_0x0314
        L_0x01c3:
            android.media.MediaCodec$BufferInfo r1 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r1.size     // Catch:{ IllegalStateException -> 0x035f }
            if (r2 != 0) goto L_0x01d3
            int r1 = r1.flags     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x01d3
            r23.m34294p0()     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x015e
        L_0x01d3:
            r15.f34861n0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.h34 r1 = r15.f34831G     // Catch:{ IllegalStateException -> 0x035f }
            java.nio.ByteBuffer r0 = r1.mo31108k(r0)     // Catch:{ IllegalStateException -> 0x035f }
            r15.f34863o0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x01f2
            android.media.MediaCodec$BufferInfo r1 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r1.offset     // Catch:{ IllegalStateException -> 0x035f }
            r0.position(r1)     // Catch:{ IllegalStateException -> 0x035f }
            java.nio.ByteBuffer r0 = r15.f34863o0     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaCodec$BufferInfo r1 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r1.offset     // Catch:{ IllegalStateException -> 0x035f }
            int r1 = r1.size     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r2 + r1
            r0.limit(r2)     // Catch:{ IllegalStateException -> 0x035f }
        L_0x01f2:
            boolean r0 = r15.f34851U     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0213
            android.media.MediaCodec$BufferInfo r0 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            long r1 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035f }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0213
            int r1 = r0.flags     // Catch:{ IllegalStateException -> 0x035f }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0213
            long r1 = r15.f34822B0     // Catch:{ IllegalStateException -> 0x035f }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0213
            r0.presentationTimeUs = r1     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0213:
            android.media.MediaCodec$BufferInfo r0 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            long r0 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035f }
            java.util.ArrayList<java.lang.Long> r2 = r15.f34874u     // Catch:{ IllegalStateException -> 0x035f }
            int r2 = r2.size()     // Catch:{ IllegalStateException -> 0x035f }
            r3 = 0
        L_0x021e:
            if (r3 >= r2) goto L_0x023a
            java.util.ArrayList<java.lang.Long> r4 = r15.f34874u     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IllegalStateException -> 0x035f }
            long r4 = r4.longValue()     // Catch:{ IllegalStateException -> 0x035f }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0237
            java.util.ArrayList<java.lang.Long> r0 = r15.f34874u     // Catch:{ IllegalStateException -> 0x035f }
            r0.remove(r3)     // Catch:{ IllegalStateException -> 0x035f }
            r0 = 1
            goto L_0x023b
        L_0x0237:
            int r3 = r3 + 1
            goto L_0x021e
        L_0x023a:
            r0 = 0
        L_0x023b:
            r15.f34865p0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            long r0 = r15.f34824C0     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaCodec$BufferInfo r2 = r15.f34876v     // Catch:{ IllegalStateException -> 0x035f }
            long r2 = r2.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035f }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0249
            r0 = 1
            goto L_0x024a
        L_0x0249:
            r0 = 0
        L_0x024a:
            r15.f34867q0 = r0     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.zw2<com.google.android.gms.internal.ads.w> r0 = r15.f34872t     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Object r0 = r0.mo36139c(r2)     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C8281w) r0     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 != 0) goto L_0x0262
            boolean r1 = r15.f34837J     // Catch:{ IllegalStateException -> 0x035f }
            if (r1 == 0) goto L_0x0262
            com.google.android.gms.internal.ads.zw2<com.google.android.gms.internal.ads.w> r0 = r15.f34872t     // Catch:{ IllegalStateException -> 0x035f }
            java.lang.Object r0 = r0.mo36138b()     // Catch:{ IllegalStateException -> 0x035f }
            com.google.android.gms.internal.ads.w r0 = (com.google.android.gms.internal.ads.C8281w) r0     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0262:
            if (r0 == 0) goto L_0x0267
            r15.f34819A = r0     // Catch:{ IllegalStateException -> 0x035f }
            goto L_0x026f
        L_0x0267:
            boolean r0 = r15.f34837J     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0278
            com.google.android.gms.internal.ads.w r0 = r15.f34819A     // Catch:{ IllegalStateException -> 0x035f }
            if (r0 == 0) goto L_0x0278
        L_0x026f:
            com.google.android.gms.internal.ads.w r0 = r15.f34819A     // Catch:{ IllegalStateException -> 0x035f }
            android.media.MediaFormat r1 = r15.f34835I     // Catch:{ IllegalStateException -> 0x035f }
            r15.mo33254O(r0, r1)     // Catch:{ IllegalStateException -> 0x035f }
            r15.f34837J = r13     // Catch:{ IllegalStateException -> 0x035f }
        L_0x0278:
            boolean r0 = r15.f34850T     // Catch:{ IllegalStateException -> 0x033d }
            if (r0 == 0) goto L_0x02d4
            boolean r0 = r15.f34885z0     // Catch:{ IllegalStateException -> 0x02cf }
            if (r0 == 0) goto L_0x02d4
            com.google.android.gms.internal.ads.h34 r6 = r15.f34831G     // Catch:{ IllegalStateException -> 0x02b5 }
            java.nio.ByteBuffer r7 = r15.f34863o0     // Catch:{ IllegalStateException -> 0x02b5 }
            int r8 = r15.f34861n0     // Catch:{ IllegalStateException -> 0x02b5 }
            android.media.MediaCodec$BufferInfo r0 = r15.f34876v     // Catch:{ IllegalStateException -> 0x02b5 }
            int r12 = r0.flags     // Catch:{ IllegalStateException -> 0x02b5 }
            r16 = 1
            long r4 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x02b5 }
            boolean r0 = r15.f34865p0     // Catch:{ IllegalStateException -> 0x02b5 }
            boolean r2 = r15.f34867q0     // Catch:{ IllegalStateException -> 0x02b5 }
            com.google.android.gms.internal.ads.w r3 = r15.f34819A     // Catch:{ IllegalStateException -> 0x02b5 }
            r1 = r23
            r17 = r2
            r18 = r3
            r2 = r24
            r19 = r4
            r4 = r26
            r21 = r9
            r9 = r12
            r10 = r16
            r16 = 2
            r11 = r19
            r19 = 0
            r13 = r0
            r14 = r17
            r15 = r18
            boolean r0 = r1.mo33258Y(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x02b9 }
            goto L_0x02f8
        L_0x02b5:
            r21 = r9
            r19 = 0
        L_0x02b9:
            r23.m34294p0()     // Catch:{ IllegalStateException -> 0x02c9 }
            r15 = r23
            boolean r0 = r15.f34828E0     // Catch:{ IllegalStateException -> 0x033a }
            if (r0 == 0) goto L_0x02c5
            r23.mo33268i0()     // Catch:{ IllegalStateException -> 0x033a }
        L_0x02c5:
            r1 = r15
        L_0x02c6:
            r2 = r21
            goto L_0x0325
        L_0x02c9:
            r0 = move-exception
            r2 = 1
        L_0x02cb:
            r1 = r23
            goto L_0x0364
        L_0x02cf:
            r0 = move-exception
            r19 = 0
            goto L_0x033b
        L_0x02d4:
            r21 = r9
            r16 = 2
            r19 = 0
            com.google.android.gms.internal.ads.h34 r6 = r15.f34831G     // Catch:{ IllegalStateException -> 0x033a }
            java.nio.ByteBuffer r7 = r15.f34863o0     // Catch:{ IllegalStateException -> 0x033a }
            int r8 = r15.f34861n0     // Catch:{ IllegalStateException -> 0x033a }
            android.media.MediaCodec$BufferInfo r0 = r15.f34876v     // Catch:{ IllegalStateException -> 0x033a }
            int r9 = r0.flags     // Catch:{ IllegalStateException -> 0x033a }
            r10 = 1
            long r11 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x033a }
            boolean r13 = r15.f34865p0     // Catch:{ IllegalStateException -> 0x033a }
            boolean r14 = r15.f34867q0     // Catch:{ IllegalStateException -> 0x033a }
            com.google.android.gms.internal.ads.w r0 = r15.f34819A     // Catch:{ IllegalStateException -> 0x033a }
            r1 = r23
            r2 = r24
            r4 = r26
            r15 = r0
            boolean r0 = r1.mo33258Y(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x0336 }
        L_0x02f8:
            if (r0 == 0) goto L_0x0322
            r1 = r23
            android.media.MediaCodec$BufferInfo r0 = r1.f34876v     // Catch:{ IllegalStateException -> 0x035c }
            long r2 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x035c }
            r1.mo33267h0(r2)     // Catch:{ IllegalStateException -> 0x035c }
            android.media.MediaCodec$BufferInfo r0 = r1.f34876v     // Catch:{ IllegalStateException -> 0x035c }
            int r0 = r0.flags     // Catch:{ IllegalStateException -> 0x035c }
            r23.m34296r0()     // Catch:{ IllegalStateException -> 0x035c }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0312
            r23.m34294p0()     // Catch:{ IllegalStateException -> 0x035c }
            goto L_0x02c6
        L_0x0312:
            r2 = r21
        L_0x0314:
            boolean r0 = r1.m34290S(r2)     // Catch:{ IllegalStateException -> 0x035c }
            if (r0 != 0) goto L_0x031b
            goto L_0x0325
        L_0x031b:
            r15 = r1
            r9 = r2
            r11 = 2
            r13 = 0
            r14 = 1
            goto L_0x013d
        L_0x0322:
            r1 = r23
            goto L_0x02c6
        L_0x0325:
            boolean r0 = r23.m34287P()     // Catch:{ IllegalStateException -> 0x035c }
            if (r0 == 0) goto L_0x0331
            boolean r0 = r1.m34290S(r2)     // Catch:{ IllegalStateException -> 0x035c }
            if (r0 != 0) goto L_0x0325
        L_0x0331:
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ IllegalStateException -> 0x035c }
            r2 = 1
            goto L_0x0354
        L_0x0336:
            r0 = move-exception
            r1 = r23
            goto L_0x035d
        L_0x033a:
            r0 = move-exception
        L_0x033b:
            r1 = r15
            goto L_0x035d
        L_0x033d:
            r0 = move-exception
            r1 = r15
            r19 = 0
            goto L_0x035d
        L_0x0342:
            r1 = r15
            r19 = 0
            com.google.android.gms.internal.ads.mc3 r0 = r1.f34832G0     // Catch:{ IllegalStateException -> 0x035c }
            int r2 = r0.f35487d     // Catch:{ IllegalStateException -> 0x035c }
            int r3 = r23.mo33303s(r24)     // Catch:{ IllegalStateException -> 0x035c }
            int r2 = r2 + r3
            r0.f35487d = r2     // Catch:{ IllegalStateException -> 0x035c }
            r2 = 1
            r1.m34289R(r2)     // Catch:{ IllegalStateException -> 0x035a }
        L_0x0354:
            com.google.android.gms.internal.ads.mc3 r0 = r1.f34832G0     // Catch:{ IllegalStateException -> 0x035a }
            r0.mo33526a()     // Catch:{ IllegalStateException -> 0x035a }
            return
        L_0x035a:
            r0 = move-exception
            goto L_0x0364
        L_0x035c:
            r0 = move-exception
        L_0x035d:
            r2 = 1
            goto L_0x0364
        L_0x035f:
            r0 = move-exception
            r1 = r15
            r2 = 1
            r19 = 0
        L_0x0364:
            int r3 = com.google.android.gms.internal.ads.d13.f20195a
            r4 = 21
            if (r3 < r4) goto L_0x036f
            boolean r5 = r0 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L_0x036f
            goto L_0x0384
        L_0x036f:
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x03ad
            r5 = r5[r19]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x03ad
        L_0x0384:
            r1.mo33251L(r0)
            if (r3 < r4) goto L_0x0398
            boolean r3 = r0 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x0398
            r3 = r0
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            boolean r3 = r3.isRecoverable()
            if (r3 == 0) goto L_0x0398
            r14 = 1
            goto L_0x0399
        L_0x0398:
            r14 = 0
        L_0x0399:
            if (r14 == 0) goto L_0x039e
            r23.mo33268i0()
        L_0x039e:
            com.google.android.gms.internal.ads.j34 r2 = r1.f34844N
            com.google.android.gms.internal.ads.i34 r0 = r1.mo33263d0(r0, r2)
            com.google.android.gms.internal.ads.w r2 = r1.f34884z
            r3 = 4003(0xfa3, float:5.61E-42)
            com.google.android.gms.internal.ads.vk3 r0 = r1.mo33302p(r0, r2, r14, r3)
            throw r0
        L_0x03ad:
            goto L_0x03af
        L_0x03ae:
            throw r0
        L_0x03af:
            goto L_0x03ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l34.mo32478g(long, long):void");
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.b44, android.view.Surface, android.media.MediaCrypto] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0202 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0204 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0233 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x024b A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x024d A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0252 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x025f A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x028f A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0291 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02ef A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f1 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02fa A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x033b A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x033c A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x034e A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x035c A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0380 A[Catch:{ Exception -> 0x0384, u34 -> 0x0090, k34 -> 0x03d1 }] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33266g0() throws com.google.android.gms.internal.ads.vk3 {
        /*
            r17 = this;
            r7 = r17
            com.google.android.gms.internal.ads.h34 r0 = r7.f34831G
            if (r0 != 0) goto L_0x03dc
            boolean r0 = r7.f34869r0
            if (r0 != 0) goto L_0x03dc
            com.google.android.gms.internal.ads.w r0 = r7.f34884z
            if (r0 != 0) goto L_0x0010
            goto L_0x03dc
        L_0x0010:
            com.google.android.gms.internal.ads.m24 r1 = r7.f34842L0
            r8 = 1
            if (r1 != 0) goto L_0x004a
            boolean r0 = r7.mo33259Z(r0)
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.internal.ads.w r0 = r7.f34884z
            r17.m34285H()
            java.lang.String r0 = r0.f40619l
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.a34 r0 = r7.f34870s
            r0.mo30298o(r8)
            goto L_0x0047
        L_0x0040:
            com.google.android.gms.internal.ads.a34 r0 = r7.f34870s
            r1 = 32
            r0.mo30298o(r1)
        L_0x0047:
            r7.f34869r0 = r8
            return
        L_0x004a:
            com.google.android.gms.internal.ads.m24 r0 = r7.f34842L0
            r7.f34840K0 = r0
            com.google.android.gms.internal.ads.w r1 = r7.f34884z
            java.lang.String r2 = r1.f40619l
            r9 = 0
            if (r0 == 0) goto L_0x0067
            boolean r2 = com.google.android.gms.internal.ads.n24.f35878a
            if (r2 != 0) goto L_0x005a
            goto L_0x0067
        L_0x005a:
            com.google.android.gms.internal.ads.d24 r0 = r0.mo33460a()
            com.google.android.gms.internal.ads.w r1 = r7.f34884z
            int r2 = r0.f30620b
            com.google.android.gms.internal.ads.vk3 r0 = r7.mo33302p(r0, r1, r9, r2)
            throw r0
        L_0x0067:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.j34> r0 = r7.f34841L     // Catch:{ k34 -> 0x03d1 }
            r10 = 0
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.n34 r0 = r7.f34860n     // Catch:{ u34 -> 0x0090 }
            java.util.List r0 = r7.mo33250K(r0, r1, r9)     // Catch:{ u34 -> 0x0090 }
            r0.isEmpty()     // Catch:{ u34 -> 0x0090 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ u34 -> 0x0090 }
            r1.<init>()     // Catch:{ u34 -> 0x0090 }
            r7.f34841L = r1     // Catch:{ u34 -> 0x0090 }
            boolean r1 = r0.isEmpty()     // Catch:{ u34 -> 0x0090 }
            if (r1 != 0) goto L_0x008d
            java.util.ArrayDeque<com.google.android.gms.internal.ads.j34> r1 = r7.f34841L     // Catch:{ u34 -> 0x0090 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ u34 -> 0x0090 }
            com.google.android.gms.internal.ads.j34 r0 = (com.google.android.gms.internal.ads.j34) r0     // Catch:{ u34 -> 0x0090 }
            r1.add(r0)     // Catch:{ u34 -> 0x0090 }
        L_0x008d:
            r7.f34843M = r10     // Catch:{ u34 -> 0x0090 }
            goto L_0x009c
        L_0x0090:
            r0 = move-exception
            com.google.android.gms.internal.ads.k34 r1 = new com.google.android.gms.internal.ads.k34     // Catch:{ k34 -> 0x03d1 }
            com.google.android.gms.internal.ads.w r2 = r7.f34884z     // Catch:{ k34 -> 0x03d1 }
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.C8281w) r2, (java.lang.Throwable) r0, (boolean) r9, (int) r3)     // Catch:{ k34 -> 0x03d1 }
            throw r1     // Catch:{ k34 -> 0x03d1 }
        L_0x009c:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.j34> r0 = r7.f34841L     // Catch:{ k34 -> 0x03d1 }
            boolean r0 = r0.isEmpty()     // Catch:{ k34 -> 0x03d1 }
            if (r0 != 0) goto L_0x03c4
        L_0x00a4:
            com.google.android.gms.internal.ads.h34 r0 = r7.f34831G     // Catch:{ k34 -> 0x03d1 }
            if (r0 != 0) goto L_0x03c0
            java.util.ArrayDeque<com.google.android.gms.internal.ads.j34> r0 = r7.f34841L     // Catch:{ k34 -> 0x03d1 }
            java.lang.Object r0 = r0.peekFirst()     // Catch:{ k34 -> 0x03d1 }
            r11 = r0
            com.google.android.gms.internal.ads.j34 r11 = (com.google.android.gms.internal.ads.j34) r11     // Catch:{ k34 -> 0x03d1 }
            boolean r0 = r7.mo33273n0(r11)     // Catch:{ k34 -> 0x03d1 }
            if (r0 != 0) goto L_0x00b8
            return
        L_0x00b8:
            java.lang.String r2 = r11.f33740a     // Catch:{ Exception -> 0x0384 }
            int r0 = com.google.android.gms.internal.ads.d13.f20195a     // Catch:{ Exception -> 0x0384 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r0 >= r3) goto L_0x00c5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00d1
        L_0x00c5:
            float r4 = r7.f34829F     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.w r5 = r7.f34884z     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.w[] r6 = r17.mo33300n()     // Catch:{ Exception -> 0x0384 }
            float r4 = r7.mo33245D(r4, r5, r6)     // Catch:{ Exception -> 0x0384 }
        L_0x00d1:
            float r5 = r7.f34862o     // Catch:{ Exception -> 0x0384 }
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r1 = r4
        L_0x00d9:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0384 }
            int r12 = r6.length()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r13 = "createCodec:"
            if (r12 == 0) goto L_0x00ee
            java.lang.String r6 = r13.concat(r6)     // Catch:{ Exception -> 0x0384 }
            goto L_0x00f3
        L_0x00ee:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0384 }
            r6.<init>(r13)     // Catch:{ Exception -> 0x0384 }
        L_0x00f3:
            com.google.android.gms.internal.ads.bz2.m30876a(r6)     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.w r6 = r7.f34884z     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.f34 r6 = r7.mo33249J(r11, r6, r10, r1)     // Catch:{ Exception -> 0x0384 }
            r12 = 31
            if (r0 < r12) goto L_0x012e
            com.google.android.gms.internal.ads.w r12 = r6.f31613c     // Catch:{ Exception -> 0x0384 }
            java.lang.String r12 = r12.f40619l     // Catch:{ Exception -> 0x0384 }
            int r12 = com.google.android.gms.internal.ads.C7773hx.m32959a(r12)     // Catch:{ Exception -> 0x0384 }
            java.lang.String r13 = "DefaultMediaCodecAdapterFactory"
            java.lang.String r14 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r15 = com.google.android.gms.internal.ads.d13.m20311j(r12)     // Catch:{ Exception -> 0x0384 }
            int r16 = r15.length()     // Catch:{ Exception -> 0x0384 }
            if (r16 == 0) goto L_0x011b
            java.lang.String r14 = r14.concat(r15)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0121
        L_0x011b:
            java.lang.String r15 = new java.lang.String     // Catch:{ Exception -> 0x0384 }
            r15.<init>(r14)     // Catch:{ Exception -> 0x0384 }
            r14 = r15
        L_0x0121:
            android.util.Log.i(r13, r14)     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.s24 r13 = new com.google.android.gms.internal.ads.s24     // Catch:{ Exception -> 0x0384 }
            r13.<init>(r12, r9)     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.u24 r6 = r13.mo34653c(r6)     // Catch:{ Exception -> 0x0384 }
            goto L_0x0173
        L_0x012e:
            com.google.android.gms.internal.ads.j34 r12 = r6.f31611a     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            java.util.Objects.requireNonNull(r12)
            java.lang.String r12 = r12.f33740a     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            int r15 = r14.length()     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            if (r15 == 0) goto L_0x0144
            java.lang.String r13 = r13.concat(r14)     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            goto L_0x014a
        L_0x0144:
            java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            r14.<init>(r13)     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            r13 = r14
        L_0x014a:
            com.google.android.gms.internal.ads.bz2.m30876a(r13)     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r12)     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ IOException -> 0x037c, RuntimeException -> 0x037a }
            java.lang.String r13 = "configureCodec"
            com.google.android.gms.internal.ads.bz2.m30876a(r13)     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            android.media.MediaFormat r13 = r6.f31612b     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            android.view.Surface r6 = r6.f31614d     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            r12.configure(r13, r6, r10, r9)     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            java.lang.String r6 = "startCodec"
            com.google.android.gms.internal.ads.bz2.m30876a(r6)     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            r12.start()     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            com.google.android.gms.internal.ads.bz2.m30877b()     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            com.google.android.gms.internal.ads.d44 r6 = new com.google.android.gms.internal.ads.d44     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
            r6.<init>(r12, r10, r10)     // Catch:{ IOException -> 0x0378, RuntimeException -> 0x0376 }
        L_0x0173:
            r7.f34831G = r6     // Catch:{ Exception -> 0x0384 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0384 }
            r7.f34844N = r11     // Catch:{ Exception -> 0x0384 }
            r7.f34839K = r1     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.w r1 = r7.f34884z     // Catch:{ Exception -> 0x0384 }
            r7.f34833H = r1     // Catch:{ Exception -> 0x0384 }
            java.lang.String r1 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r0 > r6) goto L_0x01b1
            boolean r15 = r1.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r15 == 0) goto L_0x01b1
            java.lang.String r15 = com.google.android.gms.internal.ads.d13.f20198d     // Catch:{ Exception -> 0x0384 }
            java.lang.String r10 = "SM-T585"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "SM-A510"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "SM-A520"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01af
            java.lang.String r10 = "SM-J700"
            boolean r10 = r15.startsWith(r10)     // Catch:{ Exception -> 0x0384 }
            if (r10 == 0) goto L_0x01b1
        L_0x01af:
            r10 = 2
            goto L_0x01ea
        L_0x01b1:
            r10 = 24
            if (r0 >= r10) goto L_0x01e9
            java.lang.String r10 = "OMX.Nvidia.h264.decode"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01c5
            java.lang.String r10 = "OMX.Nvidia.h264.decode.secure"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r10 == 0) goto L_0x01e9
        L_0x01c5:
            java.lang.String r10 = "flounder"
            java.lang.String r15 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0384 }
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = "flounder_lte"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = "grouper"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0384 }
            if (r10 != 0) goto L_0x01e7
            java.lang.String r10 = "tilapia"
            boolean r10 = r10.equals(r15)     // Catch:{ Exception -> 0x0384 }
            if (r10 == 0) goto L_0x01e9
        L_0x01e7:
            r10 = 1
            goto L_0x01ea
        L_0x01e9:
            r10 = 0
        L_0x01ea:
            r7.f34845O = r10     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.w r10 = r7.f34833H     // Catch:{ Exception -> 0x0384 }
            r15 = 21
            if (r0 >= r15) goto L_0x0204
            java.util.List<byte[]> r10 = r10.f40621n     // Catch:{ Exception -> 0x0384 }
            boolean r10 = r10.isEmpty()     // Catch:{ Exception -> 0x0384 }
            if (r10 == 0) goto L_0x0204
            java.lang.String r10 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r10 = r10.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r10 == 0) goto L_0x0204
            r10 = 1
            goto L_0x0205
        L_0x0204:
            r10 = 0
        L_0x0205:
            r7.f34846P = r10     // Catch:{ Exception -> 0x0384 }
            r10 = 19
            r9 = 18
            if (r0 < r9) goto L_0x023c
            if (r0 != r9) goto L_0x021f
            java.lang.String r14 = "OMX.SEC.avc.dec"
            boolean r14 = r14.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r14 != 0) goto L_0x023c
            java.lang.String r14 = "OMX.SEC.avc.dec.secure"
            boolean r14 = r14.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r14 != 0) goto L_0x023c
        L_0x021f:
            if (r0 != r10) goto L_0x023a
            java.lang.String r14 = com.google.android.gms.internal.ads.d13.f20198d     // Catch:{ Exception -> 0x0384 }
            java.lang.String r6 = "SM-G800"
            boolean r6 = r14.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r6 == 0) goto L_0x023a
            java.lang.String r6 = "OMX.Exynos.avc.dec"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x023c
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r1 == 0) goto L_0x023a
            goto L_0x023c
        L_0x023a:
            r1 = 0
            goto L_0x023d
        L_0x023c:
            r1 = 1
        L_0x023d:
            r7.f34847Q = r1     // Catch:{ Exception -> 0x0384 }
            r1 = 29
            if (r0 != r1) goto L_0x024d
            java.lang.String r6 = "c2.android.aac.decoder"
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r6 == 0) goto L_0x024d
            r6 = 1
            goto L_0x024e
        L_0x024d:
            r6 = 0
        L_0x024e:
            r7.f34848R = r6     // Catch:{ Exception -> 0x0384 }
            if (r0 > r3) goto L_0x025d
            java.lang.String r3 = "OMX.google.vorbis.decoder"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r3 != 0) goto L_0x025b
            goto L_0x025d
        L_0x025b:
            r3 = 1
            goto L_0x0283
        L_0x025d:
            if (r0 > r10) goto L_0x0282
            java.lang.String r3 = "hb2000"
            java.lang.String r6 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0384 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0384 }
            if (r3 != 0) goto L_0x0271
            java.lang.String r3 = "stvm8"
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x0282
        L_0x0271:
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r3 != 0) goto L_0x025b
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x0282
            goto L_0x025b
        L_0x0282:
            r3 = 0
        L_0x0283:
            r7.f34849S = r3     // Catch:{ Exception -> 0x0384 }
            if (r0 != r15) goto L_0x0291
            java.lang.String r3 = "OMX.google.aac.decoder"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x0291
            r3 = 1
            goto L_0x0292
        L_0x0291:
            r3 = 0
        L_0x0292:
            r7.f34850T = r3     // Catch:{ Exception -> 0x0384 }
            if (r0 >= r15) goto L_0x02dc
            java.lang.String r3 = "OMX.SEC.mp3.dec"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x02dc
            java.lang.String r3 = "samsung"
            java.lang.String r6 = com.google.android.gms.internal.ads.d13.f20197c     // Catch:{ Exception -> 0x0384 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x02dc
            java.lang.String r3 = com.google.android.gms.internal.ads.d13.f20196b     // Catch:{ Exception -> 0x0384 }
            java.lang.String r6 = "baffin"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "grand"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "fortuna"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "gprimelte"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "j2y18lte"
            boolean r6 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x02da
            java.lang.String r6 = "ms01"
            boolean r3 = r3.startsWith(r6)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x02dc
        L_0x02da:
            r3 = 1
            goto L_0x02dd
        L_0x02dc:
            r3 = 0
        L_0x02dd:
            r7.f34851U = r3     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.w r3 = r7.f34833H     // Catch:{ Exception -> 0x0384 }
            if (r0 > r9) goto L_0x02f1
            int r3 = r3.f40632y     // Catch:{ Exception -> 0x0384 }
            if (r3 != r8) goto L_0x02f1
            java.lang.String r3 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r3 = r3.equals(r2)     // Catch:{ Exception -> 0x0384 }
            if (r3 == 0) goto L_0x02f1
            r3 = 1
            goto L_0x02f2
        L_0x02f1:
            r3 = 0
        L_0x02f2:
            r7.f34852V = r3     // Catch:{ Exception -> 0x0384 }
            java.lang.String r3 = r11.f33740a     // Catch:{ Exception -> 0x0384 }
            r6 = 25
            if (r0 > r6) goto L_0x0305
            java.lang.String r6 = "OMX.rk.video_decoder.avc"
            boolean r6 = r6.equals(r3)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r0 = 1
            goto L_0x033d
        L_0x0305:
            r6 = 17
            if (r0 > r6) goto L_0x0311
            java.lang.String r6 = "OMX.allwinner.video.decoder.avc"
            boolean r6 = r6.equals(r3)     // Catch:{ Exception -> 0x0384 }
            if (r6 != 0) goto L_0x0303
        L_0x0311:
            if (r0 > r1) goto L_0x0323
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0384 }
            if (r0 != 0) goto L_0x0303
            java.lang.String r0 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0384 }
            if (r0 != 0) goto L_0x0303
        L_0x0323:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.google.android.gms.internal.ads.d13.f20197c     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0384 }
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = com.google.android.gms.internal.ads.d13.f20198d     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0384 }
            if (r0 == 0) goto L_0x033c
            boolean r0 = r11.f33745f     // Catch:{ Exception -> 0x0384 }
            if (r0 == 0) goto L_0x033c
            goto L_0x0303
        L_0x033c:
            r0 = 0
        L_0x033d:
            r7.f34855Y = r0     // Catch:{ Exception -> 0x0384 }
            com.google.android.gms.internal.ads.h34 r0 = r7.f34831G     // Catch:{ Exception -> 0x0384 }
            r0.zzr()     // Catch:{ Exception -> 0x0384 }
            java.lang.String r0 = "c2.android.mp3.decoder"
            java.lang.String r1 = r11.f33740a     // Catch:{ Exception -> 0x0384 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0384 }
            if (r0 == 0) goto L_0x0355
            com.google.android.gms.internal.ads.c34 r0 = new com.google.android.gms.internal.ads.c34     // Catch:{ Exception -> 0x0384 }
            r0.<init>()     // Catch:{ Exception -> 0x0384 }
            r7.f34856Z = r0     // Catch:{ Exception -> 0x0384 }
        L_0x0355:
            int r0 = r17.mo32481l()     // Catch:{ Exception -> 0x0384 }
            r1 = 2
            if (r0 != r1) goto L_0x0365
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0384 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r9
            r7.f34857l0 = r0     // Catch:{ Exception -> 0x0384 }
        L_0x0365:
            com.google.android.gms.internal.ads.mc3 r0 = r7.f34832G0     // Catch:{ Exception -> 0x0384 }
            int r1 = r0.f35484a     // Catch:{ Exception -> 0x0384 }
            int r1 = r1 + r8
            r0.f35484a = r1     // Catch:{ Exception -> 0x0384 }
            long r9 = r12 - r4
            r1 = r17
            r3 = r12
            r5 = r9
            r1.mo33252M(r2, r3, r5)     // Catch:{ Exception -> 0x0384 }
            goto L_0x03b9
        L_0x0376:
            r0 = move-exception
            goto L_0x037e
        L_0x0378:
            r0 = move-exception
            goto L_0x037e
        L_0x037a:
            r0 = move-exception
            goto L_0x037d
        L_0x037c:
            r0 = move-exception
        L_0x037d:
            r12 = 0
        L_0x037e:
            if (r12 == 0) goto L_0x0383
            r12.release()     // Catch:{ Exception -> 0x0384 }
        L_0x0383:
            throw r0     // Catch:{ Exception -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ k34 -> 0x03d1 }
            java.lang.String r2 = "MediaCodecRenderer"
            java.lang.String r3 = "Failed to initialize decoder: "
            java.lang.String r1 = r3.concat(r1)     // Catch:{ k34 -> 0x03d1 }
            com.google.android.gms.internal.ads.fc2.m20476b(r2, r1, r0)     // Catch:{ k34 -> 0x03d1 }
            java.util.ArrayDeque<com.google.android.gms.internal.ads.j34> r1 = r7.f34841L     // Catch:{ k34 -> 0x03d1 }
            r1.removeFirst()     // Catch:{ k34 -> 0x03d1 }
            com.google.android.gms.internal.ads.k34 r1 = new com.google.android.gms.internal.ads.k34     // Catch:{ k34 -> 0x03d1 }
            com.google.android.gms.internal.ads.w r2 = r7.f34884z     // Catch:{ k34 -> 0x03d1 }
            r3 = 0
            r1.<init>((com.google.android.gms.internal.ads.C8281w) r2, (java.lang.Throwable) r0, (boolean) r3, (com.google.android.gms.internal.ads.j34) r11)     // Catch:{ k34 -> 0x03d1 }
            r7.mo33251L(r1)     // Catch:{ k34 -> 0x03d1 }
            com.google.android.gms.internal.ads.k34 r0 = r7.f34843M     // Catch:{ k34 -> 0x03d1 }
            if (r0 != 0) goto L_0x03ab
            r7.f34843M = r1     // Catch:{ k34 -> 0x03d1 }
            goto L_0x03b1
        L_0x03ab:
            com.google.android.gms.internal.ads.k34 r0 = com.google.android.gms.internal.ads.k34.m33833a(r0, r1)     // Catch:{ k34 -> 0x03d1 }
            r7.f34843M = r0     // Catch:{ k34 -> 0x03d1 }
        L_0x03b1:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.j34> r0 = r7.f34841L     // Catch:{ k34 -> 0x03d1 }
            boolean r0 = r0.isEmpty()     // Catch:{ k34 -> 0x03d1 }
            if (r0 != 0) goto L_0x03bd
        L_0x03b9:
            r9 = 0
            r10 = 0
            goto L_0x00a4
        L_0x03bd:
            com.google.android.gms.internal.ads.k34 r0 = r7.f34843M     // Catch:{ k34 -> 0x03d1 }
            throw r0     // Catch:{ k34 -> 0x03d1 }
        L_0x03c0:
            r1 = r10
            r7.f34841L = r1     // Catch:{ k34 -> 0x03d1 }
            return
        L_0x03c4:
            com.google.android.gms.internal.ads.k34 r0 = new com.google.android.gms.internal.ads.k34     // Catch:{ k34 -> 0x03d1 }
            com.google.android.gms.internal.ads.w r1 = r7.f34884z     // Catch:{ k34 -> 0x03d1 }
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r3 = 0
            r4 = 0
            r0.<init>((com.google.android.gms.internal.ads.C8281w) r1, (java.lang.Throwable) r3, (boolean) r4, (int) r2)     // Catch:{ k34 -> 0x03d1 }
            throw r0     // Catch:{ k34 -> 0x03d1 }
        L_0x03d1:
            r0 = move-exception
            com.google.android.gms.internal.ads.w r1 = r7.f34884z
            r2 = 4001(0xfa1, float:5.607E-42)
            r3 = 0
            com.google.android.gms.internal.ads.vk3 r0 = r7.mo33302p(r0, r1, r3, r2)
            throw r0
        L_0x03dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l34.mo33266g0():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo33267h0(long j) {
        while (true) {
            int i = this.f34838J0;
            if (i != 0 && j >= this.f34882y[0]) {
                long[] jArr = this.f34878w;
                this.f34834H0 = jArr[0];
                this.f34836I0 = this.f34880x[0];
                int i2 = i - 1;
                this.f34838J0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f34880x;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f34838J0);
                long[] jArr3 = this.f34882y;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f34838J0);
                mo33255V();
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final int mo32801i(C8281w wVar) throws vk3 {
        try {
            return mo33246E(this.f34860n, wVar);
        } catch (u34 e) {
            throw mo33302p(e, wVar, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final void mo33268i0() {
        try {
            h34 h34 = this.f34831G;
            if (h34 != null) {
                h34.zzl();
                this.f34832G0.f35485b++;
                mo33253N(this.f34844N.f33740a);
            }
        } finally {
            this.f34831G = null;
            this.f34821B = null;
            this.f34840K0 = null;
            mo33270k0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public void mo33269j0() {
        m34295q0();
        m34296r0();
        this.f34857l0 = C6540C.TIME_UNSET;
        this.f34885z0 = false;
        this.f34883y0 = false;
        this.f34853W = false;
        this.f34854X = false;
        this.f34865p0 = false;
        this.f34867q0 = false;
        this.f34874u.clear();
        this.f34822B0 = C6540C.TIME_UNSET;
        this.f34824C0 = C6540C.TIME_UNSET;
        c34 c34 = this.f34856Z;
        if (c34 != null) {
            c34.mo30853c();
        }
        this.f34879w0 = 0;
        this.f34881x0 = 0;
        this.f34877v0 = this.f34875u0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final void mo33270k0() {
        mo33269j0();
        this.f34856Z = null;
        this.f34841L = null;
        this.f34844N = null;
        this.f34833H = null;
        this.f34835I = null;
        this.f34837J = false;
        this.f34820A0 = false;
        this.f34839K = -1.0f;
        this.f34845O = 0;
        this.f34846P = false;
        this.f34847Q = false;
        this.f34848R = false;
        this.f34849S = false;
        this.f34850T = false;
        this.f34851U = false;
        this.f34852V = false;
        this.f34855Y = false;
        this.f34875u0 = false;
        this.f34877v0 = 0;
        this.f34823C = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final boolean mo33271l0() throws vk3 {
        boolean m0 = mo33272m0();
        if (m0) {
            mo33266g0();
        }
        return m0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final boolean mo33272m0() {
        if (this.f34831G == null) {
            return false;
        }
        if (this.f34881x0 == 3 || this.f34847Q || ((this.f34848R && !this.f34820A0) || (this.f34849S && this.f34885z0))) {
            mo33268i0();
            return true;
        }
        mo35349U();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public boolean mo33273n0(j34 j34) {
        return true;
    }

    /* renamed from: u */
    public boolean mo32483u() {
        if (this.f34884z != null) {
            if (mo33299m() || m34288Q()) {
                return true;
            }
            if (this.f34857l0 == C6540C.TIME_UNSET || SystemClock.elapsedRealtime() >= this.f34857l0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo33274w() {
        this.f34884z = null;
        this.f34834H0 = C6540C.TIME_UNSET;
        this.f34836I0 = C6540C.TIME_UNSET;
        this.f34838J0 = 0;
        mo33272m0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo33275x(boolean z, boolean z2) throws vk3 {
        this.f34832G0 = new mc3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo33276y(long j, boolean z) throws vk3 {
        this.f34826D0 = false;
        this.f34828E0 = false;
        if (this.f34869r0) {
            this.f34870s.mo18824b();
            this.f34868r.mo18824b();
            this.f34871s0 = false;
        } else {
            mo33271l0();
        }
        if (this.f34872t.mo36137a() > 0) {
            this.f34830F0 = true;
        }
        this.f34872t.mo36141e();
        int i = this.f34838J0;
        if (i != 0) {
            int i2 = i - 1;
            this.f34836I0 = this.f34880x[i2];
            this.f34834H0 = this.f34878w[i2];
            this.f34838J0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo33277z() {
        try {
            m34285H();
            mo33268i0();
        } finally {
            this.f34842L0 = null;
        }
    }

    public boolean zzL() {
        return this.f34828E0;
    }

    public final int zze() {
        return 8;
    }
}
