package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.cg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7573cg extends C8051pi implements C8338xl {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C7939mf f30353Q;

    /* renamed from: R */
    private final C8368yf f30354R = new C8368yf((C7572cf) null, new C7644ef[0], new C7538bg(this, (C7502ag) null));

    /* renamed from: S */
    private boolean f30355S;

    /* renamed from: T */
    private int f30356T;

    /* renamed from: U */
    private int f30357U;

    /* renamed from: V */
    private long f30358V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f30359W;

    public C7573cg(C8123ri riVar, C8049pg pgVar, boolean z, Handler handler, C7977nf nfVar) {
        super(1, riVar, (C8049pg) null, true);
        this.f30353Q = new C7939mf(handler, nfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo30898A(String str, long j, long j2) {
        this.f30353Q.mo33533d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo30899B(zzapg zzapg) throws C7536be {
        super.mo30899B(zzapg);
        this.f30353Q.mo33536g(zzapg);
        this.f30356T = MimeTypes.AUDIO_RAW.equals(zzapg.f42870g) ? zzapg.f42884u : 2;
        this.f30357U = zzapg.f42882s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo30900C(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C7536be {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f30355S || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.f30357U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f30357U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.f30354R.mo35922e(MimeTypes.AUDIO_RAW, i, integer2, this.f30356T, 0, iArr);
        } catch (C8154sf e) {
            throw C7536be.m30676a(e, mo36049l());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo30901D() throws C7536be {
        try {
            this.f30354R.mo35926i();
        } catch (C8332xf e) {
            throw C7536be.m30676a(e, mo36049l());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo30902E(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C7536be {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f37654O.f35024e++;
            this.f30354R.mo35923f();
            return true;
        }
        try {
            if (!this.f30354R.mo35930m(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f37654O.f35023d++;
            return true;
        } catch (C8189tf | C8332xf e) {
            throw C7536be.m30676a(e, mo36049l());
        }
    }

    /* renamed from: a */
    public final C8188te mo30903a(C8188te teVar) {
        return this.f30354R.mo35921d(teVar);
    }

    /* renamed from: b */
    public final boolean mo30904b() {
        return this.f30354R.mo35931n() || super.mo30904b();
    }

    /* renamed from: j */
    public final void mo30905j(int i, Object obj) throws C7536be {
        if (i == 2) {
            this.f30354R.mo35929l(((Float) obj).floatValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo30906o() {
        try {
            this.f30354R.mo35927j();
            try {
                super.mo30906o();
            } finally {
                this.f37654O.mo33328a();
                this.f30353Q.mo33534e(this.f37654O);
            }
        } catch (Throwable th) {
            super.mo30906o();
            throw th;
        } finally {
            this.f37654O.mo33328a();
            this.f30353Q.mo33534e(this.f37654O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo30907p(boolean z) throws C7536be {
        super.mo30907p(z);
        this.f30353Q.mo33535f(this.f37654O);
        int i = mo36051n().f40768a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo30908q(long j, boolean z) throws C7536be {
        super.mo30908q(j, z);
        this.f30354R.mo35928k();
        this.f30358V = j;
        this.f30359W = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo30909r() {
        this.f30354R.mo35925h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo30910s() {
        this.f30354R.mo35924g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo30911v(C8123ri riVar, zzapg zzapg) throws C8228ui {
        int i;
        int i2;
        String str = zzapg.f42870g;
        if (!C8374yl.m39950a(str)) {
            return 0;
        }
        int i3 = C7836jm.f33934a;
        int i4 = i3 >= 21 ? 16 : 0;
        C7980ni c = C8407zi.m40355c(str, false);
        if (c == null) {
            return 1;
        }
        int i5 = 2;
        if (i3 < 21 || (((i = zzapg.f42883t) == -1 || c.mo33702d(i)) && ((i2 = zzapg.f42882s) == -1 || c.mo33701c(i2)))) {
            i5 = 3;
        }
        return i4 | 4 | i5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C7980ni mo30912y(C8123ri riVar, zzapg zzapg, boolean z) throws C8228ui {
        return super.mo30912y(riVar, zzapg, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L_0x0037;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30913z(com.google.android.gms.internal.ads.C7980ni r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzapg r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f36018a
            int r7 = com.google.android.gms.internal.ads.C7836jm.f33934a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L_0x0037
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C7836jm.f33936c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C7836jm.f33935b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r3.f30355S = r0
            android.media.MediaFormat r4 = r6.mo36185b()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7573cg.mo30913z(com.google.android.gms.internal.ads.ni, android.media.MediaCodec, com.google.android.gms.internal.ads.zzapg, android.media.MediaCrypto):void");
    }

    public final boolean zzE() {
        return super.zzE() && this.f30354R.mo35932o();
    }

    public final long zzI() {
        long a = this.f30354R.mo35919a(zzE());
        if (a != Long.MIN_VALUE) {
            if (!this.f30359W) {
                a = Math.max(this.f30358V, a);
            }
            this.f30358V = a;
            this.f30359W = false;
        }
        return this.f30358V;
    }

    public final C8188te zzJ() {
        return this.f30354R.mo35920c();
    }

    public final C8338xl zzi() {
        return this;
    }
}
