package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.exoplayer2.C6540C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.pi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C8051pi extends C8402zd {

    /* renamed from: P */
    private static final byte[] f37639P = C7836jm.m33654p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private ByteBuffer[] f37640A;

    /* renamed from: B */
    private ByteBuffer[] f37641B;

    /* renamed from: C */
    private long f37642C;

    /* renamed from: D */
    private int f37643D;

    /* renamed from: E */
    private int f37644E;

    /* renamed from: F */
    private boolean f37645F;

    /* renamed from: G */
    private boolean f37646G;

    /* renamed from: H */
    private int f37647H;

    /* renamed from: I */
    private int f37648I;

    /* renamed from: J */
    private boolean f37649J;

    /* renamed from: K */
    private boolean f37650K;

    /* renamed from: L */
    private boolean f37651L;

    /* renamed from: M */
    private boolean f37652M;

    /* renamed from: N */
    private boolean f37653N;

    /* renamed from: O */
    protected C7903lg f37654O;

    /* renamed from: i */
    private final C8123ri f37655i;

    /* renamed from: j */
    private final C7940mg f37656j;

    /* renamed from: k */
    private final C7940mg f37657k;

    /* renamed from: l */
    private final C8083qe f37658l;

    /* renamed from: m */
    private final List<Long> f37659m;

    /* renamed from: n */
    private final MediaCodec.BufferInfo f37660n;

    /* renamed from: o */
    private zzapg f37661o;

    /* renamed from: p */
    private MediaCodec f37662p;

    /* renamed from: q */
    private C7980ni f37663q;

    /* renamed from: r */
    private boolean f37664r;

    /* renamed from: s */
    private boolean f37665s;

    /* renamed from: t */
    private boolean f37666t;

    /* renamed from: u */
    private boolean f37667u;

    /* renamed from: v */
    private boolean f37668v;

    /* renamed from: w */
    private boolean f37669w;

    /* renamed from: x */
    private boolean f37670x;

    /* renamed from: y */
    private boolean f37671y;

    /* renamed from: z */
    private boolean f37672z;

    public C8051pi(int i, C8123ri riVar, C8049pg pgVar, boolean z) {
        super(i);
        C8195tl.m37900e(C7836jm.f33934a >= 16);
        this.f37655i = riVar;
        this.f37656j = new C7940mg(0);
        this.f37657k = new C7940mg(0);
        this.f37658l = new C8083qe();
        this.f37659m = new ArrayList();
        this.f37660n = new MediaCodec.BufferInfo();
        this.f37647H = 0;
        this.f37648I = 0;
    }

    /* renamed from: w */
    private final void mo34360w() throws C7536be {
        if (this.f37648I == 2) {
            mo34131J();
            mo34129H();
            return;
        }
        this.f37652M = true;
        mo30901D();
    }

    /* renamed from: x */
    private final boolean m36083x() throws C7536be {
        MediaCodec mediaCodec = this.f37662p;
        if (mediaCodec == null || this.f37648I == 2 || this.f37651L) {
            return false;
        }
        if (this.f37643D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.f37643D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            C7940mg mgVar = this.f37656j;
            mgVar.f35510c = this.f37640A[dequeueInputBuffer];
            mgVar.mo32117b();
        }
        if (this.f37648I == 1) {
            if (!this.f37667u) {
                this.f37650K = true;
                this.f37662p.queueInputBuffer(this.f37643D, 0, 0, 0, 4);
                this.f37643D = -1;
            }
            this.f37648I = 2;
            return false;
        } else if (this.f37671y) {
            this.f37671y = false;
            ByteBuffer byteBuffer = this.f37656j.f35510c;
            byte[] bArr = f37639P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f37662p;
            int i = this.f37643D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0, 0);
            this.f37643D = -1;
            this.f37649J = true;
            return true;
        } else {
            if (this.f37647H == 1) {
                for (int i2 = 0; i2 < this.f37661o.f42872i.size(); i2++) {
                    this.f37656j.f35510c.put(this.f37661o.f42872i.get(i2));
                }
                this.f37647H = 2;
            }
            int position = this.f37656j.f35510c.position();
            int m = mo36050m(this.f37658l, this.f37656j, false);
            if (m == -3) {
                return false;
            }
            if (m == -5) {
                if (this.f37647H == 2) {
                    this.f37656j.mo32117b();
                    this.f37647H = 1;
                }
                mo30899B(this.f37658l.f37994a);
                return true;
            } else if (this.f37656j.mo32121f()) {
                if (this.f37647H == 2) {
                    this.f37656j.mo32117b();
                    this.f37647H = 1;
                }
                this.f37651L = true;
                if (!this.f37649J) {
                    mo34360w();
                    return false;
                }
                try {
                    if (!this.f37667u) {
                        this.f37650K = true;
                        this.f37662p.queueInputBuffer(this.f37643D, 0, 0, 0, 4);
                        this.f37643D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw C7536be.m30676a(e, mo36049l());
                }
            } else if (!this.f37653N || this.f37656j.mo32122g()) {
                this.f37653N = false;
                boolean i3 = this.f37656j.mo33539i();
                if (this.f37664r && !i3) {
                    ByteBuffer byteBuffer2 = this.f37656j.f35510c;
                    byte[] bArr2 = C8410zl.f42494a;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        byte b = byteBuffer2.get(i4) & 255;
                        if (i5 == 3) {
                            if (b == 1) {
                                if ((byteBuffer2.get(i6) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i4 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                b = 1;
                            }
                        } else if (b == 0) {
                            i5++;
                        }
                        if (b != 0) {
                            i5 = 0;
                        }
                        i4 = i6;
                    }
                    if (this.f37656j.f35510c.position() == 0) {
                        return true;
                    }
                    this.f37664r = false;
                }
                try {
                    C7940mg mgVar2 = this.f37656j;
                    long j = mgVar2.f35511d;
                    if (mgVar2.mo32120e()) {
                        this.f37659m.add(Long.valueOf(j));
                    }
                    this.f37656j.f35510c.flip();
                    mo34130I(this.f37656j);
                    if (i3) {
                        MediaCodec.CryptoInfo a = this.f37656j.f35509b.mo32884a();
                        if (position != 0) {
                            if (a.numBytesOfClearData == null) {
                                a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f37662p.queueSecureInputBuffer(this.f37643D, 0, a, j, 0);
                    } else {
                        this.f37662p.queueInputBuffer(this.f37643D, 0, this.f37656j.f35510c.limit(), j, 0);
                    }
                    this.f37643D = -1;
                    this.f37649J = true;
                    this.f37647H = 0;
                    this.f37654O.f35022c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw C7536be.m30676a(e2, mo36049l());
                }
            } else {
                this.f37656j.mo32117b();
                if (this.f37647H == 2) {
                    this.f37647H = 1;
                }
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo30898A(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.f42875l == r0.f42875l) goto L_0x0053;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30899B(com.google.android.gms.internal.ads.zzapg r6) throws com.google.android.gms.internal.ads.C7536be {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzapg r0 = r5.f37661o
            r5.f37661o = r6
            com.google.android.gms.internal.ads.zzarf r6 = r6.f42873j
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.zzarf r1 = r0.f42873j
        L_0x000c:
            boolean r6 = com.google.android.gms.internal.ads.C7836jm.m33653o(r6, r1)
            if (r6 != 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzapg r6 = r5.f37661o
            com.google.android.gms.internal.ads.zzarf r6 = r6.f42873j
            if (r6 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.mo36049l()
            com.google.android.gms.internal.ads.be r6 = com.google.android.gms.internal.ads.C7536be.m30676a(r6, r0)
            throw r6
        L_0x0029:
            android.media.MediaCodec r6 = r5.f37662p
            r1 = 1
            if (r6 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.ni r2 = r5.f37663q
            boolean r2 = r2.f36019b
            com.google.android.gms.internal.ads.zzapg r3 = r5.f37661o
            boolean r6 = r5.mo34132K(r6, r2, r0, r3)
            if (r6 == 0) goto L_0x0056
            r5.f37646G = r1
            r5.f37647H = r1
            boolean r6 = r5.f37666t
            r2 = 0
            if (r6 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.zzapg r6 = r5.f37661o
            int r3 = r6.f42874k
            int r4 = r0.f42874k
            if (r3 != r4) goto L_0x0052
            int r6 = r6.f42875l
            int r0 = r0.f42875l
            if (r6 != r0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            r5.f37671y = r1
            return
        L_0x0056:
            boolean r6 = r5.f37649J
            if (r6 == 0) goto L_0x005d
            r5.f37648I = r1
            return
        L_0x005d:
            r5.mo34131J()
            r5.mo34129H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8051pi.mo30899B(com.google.android.gms.internal.ads.zzapg):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo30900C(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C7536be;

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo30901D() throws C7536be {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract boolean mo30902E(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C7536be;

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final MediaCodec mo34127F() {
        return this.f37662p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final C7980ni mo34128G() {
        return this.f37663q;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015c A[Catch:{ Exception -> 0x01d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0161 A[Catch:{ Exception -> 0x01d1 }] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34129H() throws com.google.android.gms.internal.ads.C7536be {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.f37662p
            if (r0 != 0) goto L_0x01e2
            com.google.android.gms.internal.ads.zzapg r0 = r11.f37661o
            if (r0 != 0) goto L_0x000a
            goto L_0x01e2
        L_0x000a:
            com.google.android.gms.internal.ads.ni r1 = r11.f37663q
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.ri r1 = r11.f37655i     // Catch:{ ui -> 0x002e }
            com.google.android.gms.internal.ads.ni r1 = r11.mo30912y(r1, r0, r3)     // Catch:{ ui -> 0x002e }
            r11.f37663q = r1     // Catch:{ ui -> 0x002e }
            if (r1 == 0) goto L_0x001b
            goto L_0x0042
        L_0x001b:
            com.google.android.gms.internal.ads.oi r0 = new com.google.android.gms.internal.ads.oi
            com.google.android.gms.internal.ads.zzapg r1 = r11.f37661o
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.google.android.gms.internal.ads.zzapg) r1, (java.lang.Throwable) r2, (boolean) r3, (int) r4)
            int r1 = r11.mo36049l()
            com.google.android.gms.internal.ads.be r0 = com.google.android.gms.internal.ads.C7536be.m30676a(r0, r1)
            throw r0
        L_0x002e:
            r0 = move-exception
            com.google.android.gms.internal.ads.oi r1 = new com.google.android.gms.internal.ads.oi
            com.google.android.gms.internal.ads.zzapg r2 = r11.f37661o
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.zzapg) r2, (java.lang.Throwable) r0, (boolean) r3, (int) r4)
            int r0 = r11.mo36049l()
            com.google.android.gms.internal.ads.be r0 = com.google.android.gms.internal.ads.C7536be.m30676a(r1, r0)
            throw r0
        L_0x0042:
            boolean r0 = r11.mo34133L(r1)
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            com.google.android.gms.internal.ads.ni r0 = r11.f37663q
            java.lang.String r0 = r0.f36018a
            com.google.android.gms.internal.ads.zzapg r1 = r11.f37661o
            int r4 = com.google.android.gms.internal.ads.C7836jm.f33934a
            r5 = 21
            r10 = 1
            if (r4 >= r5) goto L_0x0068
            java.util.List<byte[]> r1 = r1.f42872i
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            r11.f37664r = r1
            r1 = 19
            r6 = 18
            if (r4 < r6) goto L_0x00a2
            if (r4 != r6) goto L_0x0083
            java.lang.String r7 = "OMX.SEC.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.SEC.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
        L_0x0083:
            if (r4 != r1) goto L_0x00a0
            java.lang.String r7 = com.google.android.gms.internal.ads.C7836jm.f33937d
            java.lang.String r8 = "SM-G800"
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00a0
            java.lang.String r7 = "OMX.Exynos.avc.dec"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00a2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r7 = 0
            goto L_0x00a3
        L_0x00a2:
            r7 = 1
        L_0x00a3:
            r11.f37665s = r7
            r7 = 24
            if (r4 >= r7) goto L_0x00dd
            java.lang.String r7 = "OMX.Nvidia.h264.decode"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00b9
            java.lang.String r7 = "OMX.Nvidia.h264.decode.secure"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r7 = com.google.android.gms.internal.ads.C7836jm.f33935b
            java.lang.String r8 = "flounder"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "flounder_lte"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "grouper"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00db
            java.lang.String r8 = "tilapia"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x00dd
        L_0x00db:
            r7 = 1
            goto L_0x00de
        L_0x00dd:
            r7 = 0
        L_0x00de:
            r11.f37666t = r7
            r7 = 17
            if (r4 > r7) goto L_0x00f6
            java.lang.String r7 = "OMX.rk.video_decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00f4
            java.lang.String r7 = "OMX.allwinner.video.decoder.avc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x00f6
        L_0x00f4:
            r7 = 1
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            r11.f37667u = r7
            r7 = 23
            if (r4 > r7) goto L_0x0108
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r1 = 1
            goto L_0x0126
        L_0x0108:
            if (r4 > r1) goto L_0x0125
            java.lang.String r1 = com.google.android.gms.internal.ads.C7836jm.f33935b
            java.lang.String r7 = "hb2000"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0106
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0125
            goto L_0x0106
        L_0x0125:
            r1 = 0
        L_0x0126:
            r11.f37668v = r1
            if (r4 != r5) goto L_0x0134
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0134
            r1 = 1
            goto L_0x0135
        L_0x0134:
            r1 = 0
        L_0x0135:
            r11.f37669w = r1
            com.google.android.gms.internal.ads.zzapg r1 = r11.f37661o
            if (r4 > r6) goto L_0x0149
            int r1 = r1.f42882s
            if (r1 != r10) goto L_0x0149
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0149
            r1 = 1
            goto L_0x014a
        L_0x0149:
            r1 = 0
        L_0x014a:
            r11.f37670x = r1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "createCodec:"
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01d1 }
            int r7 = r6.length()     // Catch:{ Exception -> 0x01d1 }
            if (r7 == 0) goto L_0x0161
            java.lang.String r1 = r1.concat(r6)     // Catch:{ Exception -> 0x01d1 }
            goto L_0x0167
        L_0x0161:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x01d1 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x01d1 }
            r1 = r6
        L_0x0167:
            com.google.android.gms.internal.ads.C7725gm.m32582a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x01d1 }
            r11.f37662p = r1     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C7725gm.m32583b()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "configureCodec"
            com.google.android.gms.internal.ads.C7725gm.m32582a(r1)     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.ni r1 = r11.f37663q     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r6 = r11.f37662p     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.zzapg r7 = r11.f37661o     // Catch:{ Exception -> 0x01d1 }
            r11.mo30913z(r1, r6, r7, r2)     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C7725gm.m32583b()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "startCodec"
            com.google.android.gms.internal.ads.C7725gm.m32582a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f37662p     // Catch:{ Exception -> 0x01d1 }
            r1.start()     // Catch:{ Exception -> 0x01d1 }
            com.google.android.gms.internal.ads.C7725gm.m32583b()     // Catch:{ Exception -> 0x01d1 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            long r8 = r6 - r4
            r4 = r11
            r5 = r0
            r4.mo30898A(r5, r6, r8)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f37662p     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r11.f37640A = r1     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r11.f37662p     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r11.f37641B = r1     // Catch:{ Exception -> 0x01d1 }
            int r0 = r11.zzb()
            r1 = 2
            if (r0 != r1) goto L_0x01bb
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01c0
        L_0x01bb:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01c0:
            r11.f37642C = r0
            r0 = -1
            r11.f37643D = r0
            r11.f37644E = r0
            r11.f37653N = r10
            com.google.android.gms.internal.ads.lg r0 = r11.f37654O
            int r1 = r0.f35020a
            int r1 = r1 + r10
            r0.f35020a = r1
            return
        L_0x01d1:
            r1 = move-exception
            com.google.android.gms.internal.ads.oi r2 = new com.google.android.gms.internal.ads.oi
            com.google.android.gms.internal.ads.zzapg r4 = r11.f37661o
            r2.<init>((com.google.android.gms.internal.ads.zzapg) r4, (java.lang.Throwable) r1, (boolean) r3, (java.lang.String) r0)
            int r0 = r11.mo36049l()
            com.google.android.gms.internal.ads.be r0 = com.google.android.gms.internal.ads.C7536be.m30676a(r2, r0)
            throw r0
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8051pi.mo34129H():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo34130I(C7940mg mgVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo34131J() {
        this.f37642C = C6540C.TIME_UNSET;
        this.f37643D = -1;
        this.f37644E = -1;
        this.f37645F = false;
        this.f37659m.clear();
        this.f37640A = null;
        this.f37641B = null;
        this.f37663q = null;
        this.f37646G = false;
        this.f37649J = false;
        this.f37664r = false;
        this.f37665s = false;
        this.f37666t = false;
        this.f37667u = false;
        this.f37668v = false;
        this.f37670x = false;
        this.f37671y = false;
        this.f37672z = false;
        this.f37650K = false;
        this.f37647H = 0;
        this.f37648I = 0;
        this.f37656j.f35510c = null;
        MediaCodec mediaCodec = this.f37662p;
        if (mediaCodec != null) {
            this.f37654O.f35021b++;
            try {
                mediaCodec.stop();
                try {
                    this.f37662p.release();
                } finally {
                    this.f37662p = null;
                }
            } catch (Throwable th) {
                this.f37662p.release();
                throw th;
            } finally {
                this.f37662p = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo34132K(MediaCodec mediaCodec, boolean z, zzapg zzapg, zzapg zzapg2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo34133L(C7980ni niVar) {
        return true;
    }

    /* renamed from: b */
    public boolean mo30904b() {
        if (this.f37661o != null) {
            if (mo36048k() || this.f37644E >= 0) {
                return true;
            }
            if (this.f37642C == C6540C.TIME_UNSET || SystemClock.elapsedRealtime() >= this.f37642C) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo34134c(zzapg zzapg) throws C7536be {
        try {
            return mo30911v(this.f37655i, zzapg);
        } catch (C8228ui e) {
            throw C7536be.m30676a(e, mo36049l());
        }
    }

    /* renamed from: h */
    public final void mo34135h(long j, long j2) throws C7536be {
        boolean z;
        int i;
        boolean z2;
        if (this.f37652M) {
            mo30901D();
            return;
        }
        if (this.f37661o == null) {
            this.f37657k.mo32117b();
            int m = mo36050m(this.f37658l, this.f37657k, true);
            if (m == -5) {
                mo30899B(this.f37658l.f37994a);
            } else if (m == -4) {
                C8195tl.m37900e(this.f37657k.mo32121f());
                this.f37651L = true;
                mo34360w();
                return;
            } else {
                return;
            }
        }
        mo34129H();
        if (this.f37662p != null) {
            C7725gm.m32582a("drainAndFeed");
            while (true) {
                if (this.f37644E < 0) {
                    if (!this.f37669w || !this.f37650K) {
                        i = this.f37662p.dequeueOutputBuffer(this.f37660n, 0);
                        this.f37644E = i;
                    } else {
                        try {
                            i = this.f37662p.dequeueOutputBuffer(this.f37660n, 0);
                            this.f37644E = i;
                        } catch (IllegalStateException unused) {
                            mo34360w();
                            if (this.f37652M) {
                                mo34131J();
                            }
                        }
                    }
                    if (i >= 0) {
                        if (this.f37672z) {
                            this.f37672z = false;
                            this.f37662p.releaseOutputBuffer(i, false);
                            this.f37644E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f37660n;
                            if ((bufferInfo.flags & 4) != 0) {
                                mo34360w();
                                this.f37644E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.f37641B[this.f37644E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f37660n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.f37660n.presentationTimeUs;
                            int size = this.f37659m.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z2 = false;
                                    break;
                                } else if (this.f37659m.get(i2).longValue() == j3) {
                                    this.f37659m.remove(i2);
                                    z2 = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            this.f37645F = z2;
                        }
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f37662p.getOutputFormat();
                        if (this.f37666t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f37672z = true;
                        } else {
                            if (this.f37670x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            mo30900C(this.f37662p, outputFormat);
                        }
                    } else if (i == -3) {
                        this.f37641B = this.f37662p.getOutputBuffers();
                    } else if (this.f37667u && (this.f37651L || this.f37648I == 2)) {
                        mo34360w();
                    }
                }
                if (!this.f37669w || !this.f37650K) {
                    MediaCodec mediaCodec = this.f37662p;
                    ByteBuffer[] byteBufferArr = this.f37641B;
                    int i3 = this.f37644E;
                    ByteBuffer byteBuffer2 = byteBufferArr[i3];
                    MediaCodec.BufferInfo bufferInfo3 = this.f37660n;
                    z = mo30902E(j, j2, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f37645F);
                } else {
                    try {
                        MediaCodec mediaCodec2 = this.f37662p;
                        ByteBuffer[] byteBufferArr2 = this.f37641B;
                        int i4 = this.f37644E;
                        ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                        MediaCodec.BufferInfo bufferInfo4 = this.f37660n;
                        z = mo30902E(j, j2, mediaCodec2, byteBuffer3, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f37645F);
                    } catch (IllegalStateException unused2) {
                        mo34360w();
                        if (this.f37652M) {
                            mo34131J();
                        }
                    }
                }
                if (!z) {
                    break;
                }
                long j4 = this.f37660n.presentationTimeUs;
                this.f37644E = -1;
            }
            do {
            } while (m36083x());
            C7725gm.m32583b();
        } else {
            mo36052u(j);
            this.f37657k.mo32117b();
            int m2 = mo36050m(this.f37658l, this.f37657k, false);
            if (m2 == -5) {
                mo30899B(this.f37658l.f37994a);
            } else if (m2 == -4) {
                C8195tl.m37900e(this.f37657k.mo32121f());
                this.f37651L = true;
                mo34360w();
            }
        }
        this.f37654O.mo33328a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo30906o() {
        this.f37661o = null;
        mo34131J();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo30907p(boolean z) throws C7536be {
        this.f37654O = new C7903lg();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo30908q(long j, boolean z) throws C7536be {
        this.f37651L = false;
        this.f37652M = false;
        if (this.f37662p != null) {
            this.f37642C = C6540C.TIME_UNSET;
            this.f37643D = -1;
            this.f37644E = -1;
            this.f37653N = true;
            this.f37645F = false;
            this.f37659m.clear();
            this.f37671y = false;
            this.f37672z = false;
            if (this.f37665s || (this.f37668v && this.f37650K)) {
                mo34131J();
                mo34129H();
            } else if (this.f37648I != 0) {
                mo34131J();
                mo34129H();
            } else {
                this.f37662p.flush();
                this.f37649J = false;
            }
            if (this.f37646G && this.f37661o != null) {
                this.f37647H = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo30911v(C8123ri riVar, zzapg zzapg) throws C8228ui;

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C7980ni mo30912y(C8123ri riVar, zzapg zzapg, boolean z) throws C8228ui {
        return C8407zi.m40355c(zzapg.f42870g, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo30913z(C7980ni niVar, MediaCodec mediaCodec, zzapg zzapg, MediaCrypto mediaCrypto) throws C8228ui;

    public boolean zzE() {
        return this.f37652M;
    }

    public final int zze() {
        return 4;
    }
}
