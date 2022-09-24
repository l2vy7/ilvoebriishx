package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.extractor.p039ts.TsExtractor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.internal.ads.yf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8368yf {

    /* renamed from: A */
    private Method f41801A;

    /* renamed from: B */
    private int f41802B;

    /* renamed from: C */
    private long f41803C;

    /* renamed from: D */
    private long f41804D;

    /* renamed from: E */
    private int f41805E;

    /* renamed from: F */
    private long f41806F;

    /* renamed from: G */
    private long f41807G;

    /* renamed from: H */
    private int f41808H;

    /* renamed from: I */
    private int f41809I;

    /* renamed from: J */
    private long f41810J;

    /* renamed from: K */
    private long f41811K;

    /* renamed from: L */
    private long f41812L;

    /* renamed from: M */
    private float f41813M;

    /* renamed from: N */
    private C7644ef[] f41814N;

    /* renamed from: O */
    private ByteBuffer[] f41815O;

    /* renamed from: P */
    private ByteBuffer f41816P;

    /* renamed from: Q */
    private ByteBuffer f41817Q;

    /* renamed from: R */
    private byte[] f41818R;

    /* renamed from: S */
    private int f41819S;

    /* renamed from: T */
    private int f41820T;

    /* renamed from: U */
    private boolean f41821U;

    /* renamed from: V */
    private boolean f41822V;

    /* renamed from: W */
    private int f41823W;

    /* renamed from: X */
    private boolean f41824X;

    /* renamed from: Y */
    private long f41825Y;

    /* renamed from: a */
    private final C8404zf f41826a;

    /* renamed from: b */
    private final C7682fg f41827b;

    /* renamed from: c */
    private final C7644ef[] f41828c;

    /* renamed from: d */
    private final C8225uf f41829d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ConditionVariable f41830e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f41831f;

    /* renamed from: g */
    private final C8084qf f41832g;

    /* renamed from: h */
    private final LinkedList<C8296wf> f41833h;

    /* renamed from: i */
    private AudioTrack f41834i;

    /* renamed from: j */
    private int f41835j;

    /* renamed from: k */
    private int f41836k;

    /* renamed from: l */
    private int f41837l;

    /* renamed from: m */
    private int f41838m;

    /* renamed from: n */
    private boolean f41839n;

    /* renamed from: o */
    private int f41840o;

    /* renamed from: p */
    private long f41841p;

    /* renamed from: q */
    private C8188te f41842q;

    /* renamed from: r */
    private C8188te f41843r;

    /* renamed from: s */
    private long f41844s;

    /* renamed from: t */
    private long f41845t;

    /* renamed from: u */
    private int f41846u;

    /* renamed from: v */
    private int f41847v;

    /* renamed from: w */
    private long f41848w;

    /* renamed from: x */
    private long f41849x;

    /* renamed from: y */
    private boolean f41850y;

    /* renamed from: z */
    private long f41851z;

    public C8368yf(C7572cf cfVar, C7644ef[] efVarArr, C8225uf ufVar) {
        this.f41829d = ufVar;
        if (C7836jm.f33934a >= 18) {
            try {
                this.f41801A = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C7836jm.f33934a >= 19) {
            this.f41832g = new C8120rf();
        } else {
            this.f41832g = new C8084qf((C8048pf) null);
        }
        C8404zf zfVar = new C8404zf();
        this.f41826a = zfVar;
        C7682fg fgVar = new C7682fg();
        this.f41827b = fgVar;
        C7644ef[] efVarArr2 = new C7644ef[3];
        this.f41828c = efVarArr2;
        efVarArr2[0] = new C7608dg();
        efVarArr2[1] = zfVar;
        System.arraycopy(efVarArr, 0, efVarArr2, 2, 0);
        efVarArr2[2] = fgVar;
        this.f41831f = new long[10];
        this.f41813M = 1.0f;
        this.f41809I = 0;
        this.f41823W = 0;
        this.f41843r = C8188te.f39400d;
        this.f41820T = -1;
        this.f41814N = new C7644ef[0];
        this.f41815O = new ByteBuffer[0];
        this.f41833h = new LinkedList<>();
    }

    /* renamed from: p */
    private final long m39897p(long j) {
        return (j * ((long) this.f41835j)) / 1000000;
    }

    /* renamed from: q */
    private final long m39898q(long j) {
        return (j * 1000000) / ((long) this.f41835j);
    }

    /* renamed from: r */
    private final long m39899r() {
        return this.f41839n ? this.f41807G : this.f41806F / ((long) this.f41805E);
    }

    /* renamed from: s */
    private final void m39900s(long j) throws C8332xf {
        ByteBuffer byteBuffer;
        int length = this.f41814N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f41815O[i - 1];
            } else {
                byteBuffer = this.f41816P;
                if (byteBuffer == null) {
                    byteBuffer = C7644ef.f31342a;
                }
            }
            if (i == length) {
                m39907z(byteBuffer, j);
            } else {
                C7644ef efVar = this.f41814N[i];
                efVar.mo31231a(byteBuffer);
                ByteBuffer zzc = efVar.zzc();
                this.f41815O[i] = zzc;
                if (zzc.hasRemaining()) {
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

    /* renamed from: t */
    private final void m39901t() {
        ArrayList arrayList = new ArrayList();
        C7644ef[] efVarArr = this.f41828c;
        for (int i = 0; i < 3; i++) {
            C7644ef efVar = efVarArr[i];
            if (efVar.zzi()) {
                arrayList.add(efVar);
            } else {
                efVar.zzd();
            }
        }
        int size = arrayList.size();
        this.f41814N = (C7644ef[]) arrayList.toArray(new C7644ef[size]);
        this.f41815O = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            C7644ef efVar2 = this.f41814N[i2];
            efVar2.zzd();
            this.f41815O[i2] = efVar2.zzc();
        }
    }

    /* renamed from: u */
    private final void m39902u() {
        this.f41848w = 0;
        this.f41847v = 0;
        this.f41846u = 0;
        this.f41849x = 0;
        this.f41850y = false;
        this.f41851z = 0;
    }

    /* renamed from: v */
    private final void m39903v() {
        if (m39905x()) {
            if (C7836jm.f33934a >= 21) {
                this.f41834i.setVolume(this.f41813M);
                return;
            }
            AudioTrack audioTrack = this.f41834i;
            float f = this.f41813M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m39904w() throws com.google.android.gms.internal.ads.C8332xf {
        /*
            r9 = this;
            int r0 = r9.f41820T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f41839n
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.ef[] r0 = r9.f41814N
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f41820T = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f41820T
            com.google.android.gms.internal.ads.ef[] r5 = r9.f41814N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.zze()
        L_0x0028:
            r9.m39900s(r7)
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f41820T
            int r0 = r0 + r2
            r9.f41820T = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f41817Q
            if (r0 == 0) goto L_0x0044
            r9.m39907z(r0, r7)
            java.nio.ByteBuffer r0 = r9.f41817Q
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f41820T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8368yf.m39904w():boolean");
    }

    /* renamed from: x */
    private final boolean m39905x() {
        return this.f41834i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r4.f41838m;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m39906y() {
        /*
            r4 = this;
            int r0 = com.google.android.gms.internal.ads.C7836jm.f33934a
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 >= r3) goto L_0x0012
            int r0 = r4.f41838m
            r3 = 5
            if (r0 == r3) goto L_0x0013
            r3 = 6
            if (r0 == r3) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8368yf.m39906y():boolean");
    }

    /* renamed from: z */
    private final boolean m39907z(ByteBuffer byteBuffer, long j) throws C8332xf {
        int i;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.f41817Q;
        if (byteBuffer2 != null) {
            C8195tl.m37898c(byteBuffer2 == byteBuffer);
        } else {
            this.f41817Q = byteBuffer;
            if (C7836jm.f33934a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.f41818R;
                if (bArr == null || bArr.length < remaining) {
                    this.f41818R = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f41818R, 0, remaining);
                byteBuffer.position(position);
                this.f41819S = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        if (C7836jm.f33934a < 21) {
            int a = this.f41840o - ((int) (this.f41806F - (this.f41832g.mo34327a() * ((long) this.f41805E))));
            if (a > 0) {
                i = this.f41834i.write(this.f41818R, this.f41819S, Math.min(remaining2, a));
                if (i > 0) {
                    this.f41819S += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else {
                i = 0;
            }
        } else {
            i = this.f41834i.write(byteBuffer, remaining2, 1);
        }
        this.f41825Y = SystemClock.elapsedRealtime();
        if (i >= 0) {
            boolean z = this.f41839n;
            if (!z) {
                this.f41806F += (long) i;
            }
            if (i != remaining2) {
                return false;
            }
            if (z) {
                this.f41807G += (long) this.f41808H;
            }
            this.f41817Q = null;
            return true;
        }
        throw new C8332xf(i);
    }

    /* renamed from: a */
    public final long mo35919a(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        if (!m39905x() || this.f41809I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f41834i.getPlayState() == 3) {
            long b = this.f41832g.mo34328b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f41849x >= 30000) {
                    long[] jArr = this.f41831f;
                    int i = this.f41846u;
                    jArr[i] = b - nanoTime;
                    this.f41846u = (i + 1) % 10;
                    int i2 = this.f41847v;
                    if (i2 < 10) {
                        this.f41847v = i2 + 1;
                    }
                    this.f41849x = nanoTime;
                    this.f41848w = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f41847v;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f41848w += this.f41831f[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m39906y() && nanoTime - this.f41851z >= 500000) {
                    boolean h = this.f41832g.mo34334h();
                    this.f41850y = h;
                    if (h) {
                        long d = this.f41832g.mo34330d() / 1000;
                        long c = this.f41832g.mo34329c();
                        if (d < this.f41811K) {
                            this.f41850y = false;
                        } else if (Math.abs(d - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(c);
                            sb.append(", ");
                            sb.append(d);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(b);
                            Log.w("AudioTrack", sb.toString());
                            this.f41850y = false;
                        } else if (Math.abs(m39898q(c) - b) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(TsExtractor.TS_STREAM_TYPE_DTS);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(c);
                            sb2.append(", ");
                            sb2.append(d);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(b);
                            Log.w("AudioTrack", sb2.toString());
                            this.f41850y = false;
                        }
                    }
                    Method method = this.f41801A;
                    if (method != null && !this.f41839n) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f41834i, (Object[]) null)).intValue()) * 1000) - this.f41841p;
                            this.f41812L = intValue;
                            long max = Math.max(intValue, 0);
                            this.f41812L = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.f41812L = 0;
                            }
                        } catch (Exception unused) {
                            this.f41801A = null;
                        }
                    }
                    this.f41851z = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f41850y) {
            j = m39898q(this.f41832g.mo34329c() + m39897p(nanoTime2 - (this.f41832g.mo34330d() / 1000)));
        } else {
            j = this.f41847v == 0 ? this.f41832g.mo34328b() : nanoTime2 + this.f41848w;
            if (!z) {
                j -= this.f41812L;
            }
        }
        long j5 = this.f41810J;
        while (!this.f41833h.isEmpty() && j >= this.f41833h.getFirst().f40774c) {
            C8296wf remove = this.f41833h.remove();
            this.f41843r = remove.f40772a;
            this.f41845t = remove.f40774c;
            this.f41844s = remove.f40773b - this.f41810J;
        }
        if (this.f41843r.f39401a == 1.0f) {
            j2 = (j + this.f41844s) - this.f41845t;
        } else {
            if (!this.f41833h.isEmpty() || this.f41827b.mo31854f() < 1024) {
                j3 = this.f41844s;
                double d2 = (double) this.f41843r.f39401a;
                double d3 = (double) (j - this.f41845t);
                Double.isNaN(d2);
                Double.isNaN(d3);
                j4 = (long) (d2 * d3);
            } else {
                j3 = this.f41844s;
                j4 = C7836jm.m33648j(j - this.f41845t, this.f41827b.mo31853e(), this.f41827b.mo31854f());
            }
            j2 = j4 + j3;
        }
        return j5 + j2;
    }

    /* renamed from: c */
    public final C8188te mo35920c() {
        return this.f41843r;
    }

    /* renamed from: d */
    public final C8188te mo35921d(C8188te teVar) {
        if (this.f41839n) {
            C8188te teVar2 = C8188te.f39400d;
            this.f41843r = teVar2;
            return teVar2;
        }
        float d = this.f41827b.mo31852d(teVar.f39401a);
        this.f41827b.mo31851c(1.0f);
        C8188te teVar3 = new C8188te(d, 1.0f);
        C8188te teVar4 = this.f41842q;
        if (teVar4 == null) {
            if (!this.f41833h.isEmpty()) {
                teVar4 = this.f41833h.getLast().f40772a;
            } else {
                teVar4 = this.f41843r;
            }
        }
        if (!teVar3.equals(teVar4)) {
            if (m39905x()) {
                this.f41842q = teVar3;
            } else {
                this.f41843r = teVar3;
            }
        }
        return this.f41843r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35922e(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.C8154sf {
        /*
            r6 = this;
            int r7 = com.google.android.gms.internal.ads.C7836jm.m33647i(r10, r8)
            r6.f41802B = r7
            com.google.android.gms.internal.ads.zf r7 = r6.f41826a
            r7.mo36055c(r12)
            com.google.android.gms.internal.ads.ef[] r7 = r6.f41828c
            r11 = 0
            r12 = 0
            r0 = 0
        L_0x0010:
            r1 = 3
            r2 = 2
            if (r12 >= r1) goto L_0x0033
            r1 = r7[r12]
            boolean r3 = r1.mo31232b(r9, r8, r10)     // Catch:{ df -> 0x002c }
            r0 = r0 | r3
            boolean r3 = r1.zzi()
            if (r3 == 0) goto L_0x0029
            int r8 = r1.zza()
            r1.zzb()
            r10 = 2
        L_0x0029:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x002c:
            r7 = move-exception
            com.google.android.gms.internal.ads.sf r8 = new com.google.android.gms.internal.ads.sf
            r8.<init>((java.lang.Throwable) r7)
            throw r8
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r6.m39901t()
        L_0x0038:
            r7 = 252(0xfc, float:3.53E-43)
            switch(r8) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0068;
                case 3: goto L_0x0065;
                case 4: goto L_0x0062;
                case 5: goto L_0x005f;
                case 6: goto L_0x005c;
                case 7: goto L_0x0059;
                case 8: goto L_0x0056;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.google.android.gms.internal.ads.sf r7 = new com.google.android.gms.internal.ads.sf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r10 = 38
            r9.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>((java.lang.String) r8)
            throw r7
        L_0x0056:
            int r12 = com.google.android.gms.internal.ads.C7500ae.f29612a
            goto L_0x006c
        L_0x0059:
            r12 = 1276(0x4fc, float:1.788E-42)
            goto L_0x006c
        L_0x005c:
            r12 = 252(0xfc, float:3.53E-43)
            goto L_0x006c
        L_0x005f:
            r12 = 220(0xdc, float:3.08E-43)
            goto L_0x006c
        L_0x0062:
            r12 = 204(0xcc, float:2.86E-43)
            goto L_0x006c
        L_0x0065:
            r12 = 28
            goto L_0x006c
        L_0x0068:
            r12 = 12
            goto L_0x006c
        L_0x006b:
            r12 = 4
        L_0x006c:
            int r3 = com.google.android.gms.internal.ads.C7836jm.f33934a
            r4 = 23
            if (r3 > r4) goto L_0x0092
            java.lang.String r4 = com.google.android.gms.internal.ads.C7836jm.f33935b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = com.google.android.gms.internal.ads.C7836jm.f33936c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0092
            if (r8 == r1) goto L_0x0093
            r1 = 5
            if (r8 == r1) goto L_0x0093
            r7 = 7
            if (r8 == r7) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            int r7 = com.google.android.gms.internal.ads.C7500ae.f29612a
            goto L_0x0093
        L_0x0092:
            r7 = r12
        L_0x0093:
            r12 = 25
            if (r3 > r12) goto L_0x009f
            java.lang.String r12 = com.google.android.gms.internal.ads.C7836jm.f33935b
            java.lang.String r1 = "fugu"
            boolean r12 = r1.equals(r12)
        L_0x009f:
            if (r0 != 0) goto L_0x00b5
            boolean r12 = r6.m39905x()
            if (r12 == 0) goto L_0x00b5
            int r12 = r6.f41837l
            if (r12 != r10) goto L_0x00b5
            int r12 = r6.f41835j
            if (r12 != r9) goto L_0x00b5
            int r12 = r6.f41836k
            if (r12 == r7) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            return
        L_0x00b5:
            r6.mo35928k()
            r6.f41837l = r10
            r6.f41839n = r11
            r6.f41835j = r9
            r6.f41836k = r7
            r6.f41838m = r2
            int r8 = com.google.android.gms.internal.ads.C7836jm.m33647i(r2, r8)
            r6.f41805E = r8
            int r8 = r6.f41838m
            int r7 = android.media.AudioTrack.getMinBufferSize(r9, r7, r8)
            r8 = -2
            if (r7 == r8) goto L_0x00d2
            r11 = 1
        L_0x00d2:
            com.google.android.gms.internal.ads.C8195tl.m37900e(r11)
            int r8 = r7 * 4
            r9 = 250000(0x3d090, double:1.235164E-318)
            long r9 = r6.m39897p(r9)
            int r10 = (int) r9
            int r9 = r6.f41805E
            int r10 = r10 * r9
            long r11 = (long) r7
            r0 = 750000(0xb71b0, double:3.70549E-318)
            long r0 = r6.m39897p(r0)
            int r7 = r6.f41805E
            long r2 = (long) r7
            long r0 = r0 * r2
            long r11 = java.lang.Math.max(r11, r0)
            int r7 = (int) r11
            if (r8 >= r10) goto L_0x00f9
            r8 = r10
            goto L_0x00fc
        L_0x00f9:
            if (r8 <= r7) goto L_0x00fc
            r8 = r7
        L_0x00fc:
            r6.f41840o = r8
            int r7 = r6.f41805E
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r6.m39898q(r7)
            r6.f41841p = r7
            com.google.android.gms.internal.ads.te r7 = r6.f41843r
            r6.mo35921d(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8368yf.mo35922e(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: f */
    public final void mo35923f() {
        if (this.f41809I == 1) {
            this.f41809I = 2;
        }
    }

    /* renamed from: g */
    public final void mo35924g() {
        this.f41822V = false;
        if (m39905x()) {
            m39902u();
            this.f41832g.mo34332f();
        }
    }

    /* renamed from: h */
    public final void mo35925h() {
        this.f41822V = true;
        if (m39905x()) {
            this.f41811K = System.nanoTime() / 1000;
            this.f41834i.play();
        }
    }

    /* renamed from: i */
    public final void mo35926i() throws C8332xf {
        if (!this.f41821U && m39905x() && m39904w()) {
            this.f41832g.mo34331e(m39899r());
            this.f41821U = true;
        }
    }

    /* renamed from: j */
    public final void mo35927j() {
        mo35928k();
        C7644ef[] efVarArr = this.f41828c;
        for (int i = 0; i < 3; i++) {
            efVarArr[i].zzg();
        }
        this.f41823W = 0;
        this.f41822V = false;
    }

    /* renamed from: k */
    public final void mo35928k() {
        if (m39905x()) {
            this.f41803C = 0;
            this.f41804D = 0;
            this.f41806F = 0;
            this.f41807G = 0;
            this.f41808H = 0;
            C8188te teVar = this.f41842q;
            if (teVar != null) {
                this.f41843r = teVar;
                this.f41842q = null;
            } else if (!this.f41833h.isEmpty()) {
                this.f41843r = this.f41833h.getLast().f40772a;
            }
            this.f41833h.clear();
            this.f41844s = 0;
            this.f41845t = 0;
            this.f41816P = null;
            this.f41817Q = null;
            int i = 0;
            while (true) {
                C7644ef[] efVarArr = this.f41814N;
                if (i >= efVarArr.length) {
                    break;
                }
                C7644ef efVar = efVarArr[i];
                efVar.zzd();
                this.f41815O[i] = efVar.zzc();
                i++;
            }
            this.f41821U = false;
            this.f41820T = -1;
            this.f41809I = 0;
            this.f41812L = 0;
            m39902u();
            if (this.f41834i.getPlayState() == 3) {
                this.f41834i.pause();
            }
            AudioTrack audioTrack = this.f41834i;
            this.f41834i = null;
            this.f41832g.mo34333g((AudioTrack) null, false);
            this.f41830e.close();
            new C8013of(this, audioTrack).start();
        }
    }

    /* renamed from: l */
    public final void mo35929l(float f) {
        if (this.f41813M != f) {
            this.f41813M = f;
            m39903v();
        }
    }

    /* renamed from: m */
    public final boolean mo35930m(ByteBuffer byteBuffer, long j) throws C8189tf, C8332xf {
        long j2;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.f41816P;
        C8195tl.m37898c(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m39905x()) {
            this.f41830e.block();
            int i2 = this.f41823W;
            if (i2 == 0) {
                this.f41834i = new AudioTrack(3, this.f41835j, this.f41836k, this.f41838m, this.f41840o, 1);
            } else {
                this.f41834i = new AudioTrack(3, this.f41835j, this.f41836k, this.f41838m, this.f41840o, 1, i2);
            }
            int state = this.f41834i.getState();
            if (state == 1) {
                int audioSessionId = this.f41834i.getAudioSessionId();
                if (this.f41823W != audioSessionId) {
                    this.f41823W = audioSessionId;
                    ((C7538bg) this.f41829d).f29997a.f30353Q.mo33531b(audioSessionId);
                }
                this.f41832g.mo34333g(this.f41834i, m39906y());
                m39903v();
                this.f41824X = false;
                if (this.f41822V) {
                    mo35925h();
                }
            } else {
                try {
                    this.f41834i.release();
                } catch (Exception unused) {
                } finally {
                    this.f41834i = null;
                }
                throw new C8189tf(state, this.f41835j, this.f41836k, this.f41840o);
            }
        }
        if (m39906y()) {
            if (this.f41834i.getPlayState() == 2) {
                this.f41824X = false;
                return false;
            } else if (this.f41834i.getPlayState() == 1 && this.f41832g.mo34327a() != 0) {
                return false;
            }
        }
        boolean z = this.f41824X;
        boolean n = mo35931n();
        this.f41824X = n;
        if (z && !n && this.f41834i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = this.f41825Y;
            C8225uf ufVar = this.f41829d;
            ((C7538bg) ufVar).f29997a.f30353Q.mo33532c(this.f41840o, C7500ae.m30301b(this.f41841p), elapsedRealtime - j4);
        }
        if (this.f41816P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f41839n && this.f41808H == 0) {
                int i3 = this.f41838m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = C7537bf.f29991d;
                    i = 1536;
                } else if (i3 == 6) {
                    i = C7537bf.m30689a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.f41808H = i;
            }
            if (this.f41842q != null) {
                if (!m39904w()) {
                    return false;
                }
                this.f41833h.add(new C8296wf(this.f41842q, Math.max(0, j3), m39898q(m39899r()), (C8262vf) null));
                this.f41842q = null;
                m39901t();
            }
            if (this.f41809I == 0) {
                this.f41810J = Math.max(0, j3);
                this.f41809I = 1;
            } else {
                long j5 = this.f41810J;
                if (this.f41839n) {
                    j2 = this.f41804D;
                } else {
                    j2 = this.f41803C / ((long) this.f41802B);
                }
                long q = j5 + m39898q(j2);
                if (this.f41809I == 1 && Math.abs(q - j3) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(q);
                    sb2.append(", got ");
                    sb2.append(j3);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.f41809I = 2;
                }
                if (this.f41809I == 2) {
                    this.f41810J += j3 - q;
                    this.f41809I = 1;
                    ((C7538bg) this.f41829d).f29997a.f30359W = true;
                }
            }
            if (this.f41839n) {
                this.f41804D += (long) this.f41808H;
            } else {
                this.f41803C += (long) byteBuffer.remaining();
            }
            this.f41816P = byteBuffer2;
        }
        if (this.f41839n) {
            m39907z(this.f41816P, j3);
        } else {
            m39900s(j3);
        }
        if (this.f41816P.hasRemaining()) {
            return false;
        }
        this.f41816P = null;
        return true;
    }

    /* renamed from: n */
    public final boolean mo35931n() {
        if (m39905x()) {
            if (m39899r() > this.f41832g.mo34327a()) {
                return true;
            }
            if (m39906y() && this.f41834i.getPlayState() == 2 && this.f41834i.getPlaybackHeadPosition() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo35932o() {
        return !m39905x() || (this.f41821U && !mo35931n());
    }
}
