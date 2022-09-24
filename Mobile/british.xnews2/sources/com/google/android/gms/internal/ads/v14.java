package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v14 extends l34 implements ow3 {

    /* renamed from: N0 */
    private final Context f40240N0;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public final r04 f40241O0;

    /* renamed from: P0 */
    private final y04 f40242P0;

    /* renamed from: Q0 */
    private int f40243Q0;

    /* renamed from: R0 */
    private boolean f40244R0;

    /* renamed from: S0 */
    private C8281w f40245S0;

    /* renamed from: T0 */
    private long f40246T0;

    /* renamed from: U0 */
    private boolean f40247U0;

    /* renamed from: V0 */
    private boolean f40248V0;

    /* renamed from: W0 */
    private boolean f40249W0;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public gx3 f40250X0;

    public v14(Context context, g34 g34, n34 n34, boolean z, Handler handler, s04 s04, y04 y04) {
        super(1, g34, n34, false, 44100.0f);
        this.f40240N0 = context.getApplicationContext();
        this.f40242P0 = y04;
        this.f40241O0 = new r04(handler, s04);
        y04.mo34481h(new u14(this, (t14) null));
    }

    /* renamed from: q0 */
    private final void m38651q0() {
        long q = this.f40242P0.mo34485q(zzL());
        if (q != Long.MIN_VALUE) {
            if (!this.f40248V0) {
                q = Math.max(this.f40246T0, q);
            }
            this.f40246T0 = q;
            this.f40248V0 = false;
        }
    }

    /* renamed from: w0 */
    private final int m38654w0(j34 j34, C8281w wVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(j34.f33740a) || (i = d13.f20195a) >= 24 || (i == 23 && d13.m20321t(this.f40240N0))) {
            return wVar.f40620m;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo33297A() {
        this.f40242P0.zzh();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo33298B() {
        m38651q0();
        this.f40242P0.zzg();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final float mo33245D(float f, C8281w wVar, C8281w[] wVarArr) {
        int i = -1;
        for (C8281w wVar2 : wVarArr) {
            int i2 = wVar2.f40633z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo33246E(n34 n34, C8281w wVar) throws u34 {
        if (!C7773hx.m32965g(wVar.f40619l)) {
            return 0;
        }
        int i = d13.f20195a >= 21 ? 32 : 0;
        int i2 = wVar.f40606E;
        boolean o0 = l34.m34293o0(wVar);
        if (o0 && this.f40242P0.mo34477d(wVar) && (i2 == 0 || a44.m30228d() != null)) {
            return i | 12;
        }
        if ((MimeTypes.AUDIO_RAW.equals(wVar.f40619l) && !this.f40242P0.mo34477d(wVar)) || !this.f40242P0.mo34477d(d13.m20298b(2, wVar.f40632y, wVar.f40633z))) {
            return 1;
        }
        List<j34> K = mo33250K(n34, wVar, false);
        if (K.isEmpty()) {
            return 1;
        }
        if (!o0) {
            return 2;
        }
        j34 j34 = K.get(0);
        boolean d = j34.mo32824d(wVar);
        int i3 = 8;
        if (d && j34.mo32825e(wVar)) {
            i3 = 16;
        }
        return (true != d ? 3 : 4) | i3 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final nd3 mo33247F(j34 j34, C8281w wVar, C8281w wVar2) {
        int i;
        int i2;
        nd3 b = j34.mo32823b(wVar, wVar2);
        int i3 = b.f35987e;
        if (m38654w0(j34, wVar2) > this.f40243Q0) {
            i3 |= 64;
        }
        String str = j34.f33740a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f35986d;
            i = 0;
        }
        return new nd3(str, wVar, wVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final nd3 mo33248G(mw3 mw3) throws vk3 {
        nd3 G = super.mo33248G(mw3);
        this.f40241O0.mo34459g(mw3.f35636a, G);
        return G;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.f34 mo33249J(com.google.android.gms.internal.ads.j34 r8, com.google.android.gms.internal.ads.C8281w r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.w[] r10 = r7.mo33300n()
            int r0 = r7.m38654w0(r8, r9)
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.nd3 r6 = r8.mo32823b(r9, r5)
            int r6 = r6.f35986d
            if (r6 == 0) goto L_0x0023
            int r5 = r7.m38654w0(r8, r5)
            int r0 = java.lang.Math.max(r0, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.f40243Q0 = r0
            java.lang.String r10 = r8.f33740a
            int r0 = com.google.android.gms.internal.ads.d13.f20195a
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.d13.f20197c
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.d13.f20196b
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.f40244R0 = r10
            java.lang.String r10 = r8.f33742c
            int r4 = r7.f40243Q0
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.f40632y
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.f40633z
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List<byte[]> r10 = r9.f40621n
            com.google.android.gms.internal.ads.he2.m32864b(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.he2.m32863a(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.d13.f20198d
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.f40619l
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.y04 r10 = r7.f40242P0
            int r11 = r9.f40632y
            int r0 = r9.f40633z
            r1 = 4
            com.google.android.gms.internal.ads.w r11 = com.google.android.gms.internal.ads.d13.m20298b(r1, r11, r0)
            int r10 = r10.mo34474a(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r1)
        L_0x00db:
            java.lang.String r10 = r8.f33741b
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00f0
            java.lang.String r10 = r9.f40619l
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00f0
            r10 = r9
            goto L_0x00f1
        L_0x00f0:
            r10 = r0
        L_0x00f1:
            r7.f40245S0 = r10
            com.google.android.gms.internal.ads.f34 r8 = com.google.android.gms.internal.ads.f34.m32022a(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v14.mo33249J(com.google.android.gms.internal.ads.j34, com.google.android.gms.internal.ads.w, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.f34");
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final List<j34> mo33250K(n34 n34, C8281w wVar, boolean z) throws u34 {
        j34 d;
        String str = wVar.f40619l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f40242P0.mo34477d(wVar) && (d = a44.m30228d()) != null) {
            return Collections.singletonList(d);
        }
        List<j34> f = a44.m30230f(a44.m30229e(str, false, false), wVar);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(f);
            arrayList.addAll(a44.m30229e(MimeTypes.AUDIO_E_AC3, false, false));
            f = arrayList;
        }
        return Collections.unmodifiableList(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo33251L(Exception exc) {
        fc2.m20475a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f40241O0.mo34453a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final void mo33252M(String str, long j, long j2) {
        this.f40241O0.mo34455c(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final void mo33253N(String str) {
        this.f40241O0.mo34456d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo33254O(C8281w wVar, MediaFormat mediaFormat) throws vk3 {
        int i;
        int i2;
        C8281w wVar2 = this.f40245S0;
        int[] iArr = null;
        if (wVar2 != null) {
            wVar = wVar2;
        } else if (mo33262c0() != null) {
            if (MimeTypes.AUDIO_RAW.equals(wVar.f40619l)) {
                i = wVar.f40602A;
            } else if (d13.f20195a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = d13.m20287R(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = MimeTypes.AUDIO_RAW.equals(wVar.f40619l) ? wVar.f40602A : 2;
            }
            ge4 ge4 = new ge4();
            ge4.mo32093s(MimeTypes.AUDIO_RAW);
            ge4.mo32088n(i);
            ge4.mo32071c(wVar.f40603B);
            ge4.mo32073d(wVar.f40604C);
            ge4.mo32076e0(mediaFormat.getInteger("channel-count"));
            ge4.mo32094t(mediaFormat.getInteger("sample-rate"));
            C8281w y = ge4.mo32099y();
            if (this.f40244R0 && y.f40632y == 6 && (i2 = wVar.f40632y) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < wVar.f40632y; i3++) {
                    iArr[i3] = i3;
                }
            }
            wVar = y;
        }
        try {
            this.f40242P0.mo34482i(wVar, 0, iArr);
        } catch (t04 e) {
            throw mo33302p(e, e.f39235b, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo35349U() {
        this.f40248V0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo33255V() {
        this.f40242P0.zzf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo33256W(s51 s51) {
        if (this.f40247U0 && !s51.mo33440f()) {
            if (Math.abs(s51.f20812e - this.f40246T0) > 500000) {
                this.f40246T0 = s51.f20812e;
            }
            this.f40247U0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo33257X() throws vk3 {
        try {
            this.f40242P0.zzi();
        } catch (x04 e) {
            throw mo33302p(e, e.f40979c, e.f40978b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final boolean mo33258Y(long j, long j2, h34 h34, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8281w wVar) throws vk3 {
        Objects.requireNonNull(byteBuffer);
        if (this.f40245S0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(h34);
            h34.mo31104e(i, false);
            return true;
        } else if (z) {
            if (h34 != null) {
                h34.mo31104e(i, false);
            }
            this.f34832G0.f35489f += i3;
            this.f40242P0.zzf();
            return true;
        } else {
            try {
                if (!this.f40242P0.mo34480g(byteBuffer, j3, i3)) {
                    return false;
                }
                if (h34 != null) {
                    h34.mo31104e(i, false);
                }
                this.f34832G0.f35488e += i3;
                return true;
            } catch (u04 e) {
                throw mo33302p(e, e.f39707c, false, IronSourceConstants.errorCode_biddingDataException);
            } catch (x04 e2) {
                throw mo33302p(e2, wVar, e2.f40978b, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final boolean mo33259Z(C8281w wVar) {
        return this.f40242P0.mo34477d(wVar);
    }

    /* renamed from: j */
    public final void mo31428j(int i, Object obj) throws vk3 {
        if (i == 2) {
            this.f40242P0.mo34479f(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f40242P0.mo34483j((oe3) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f40242P0.mo34484k(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f40242P0.mo34476c(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f40250X0 = (gx3) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f40242P0.mo34475b((uv3) obj);
        }
    }

    /* renamed from: r */
    public final void mo34017r(h20 h20) {
        this.f40242P0.mo34478e(h20);
    }

    /* renamed from: u */
    public final boolean mo32483u() {
        return this.f40242P0.zzs() || super.mo32483u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo33274w() {
        this.f40249W0 = true;
        try {
            this.f40242P0.zze();
            try {
                super.mo33274w();
            } finally {
                this.f40241O0.mo34457e(this.f34832G0);
            }
        } catch (Throwable th) {
            super.mo33274w();
            throw th;
        } finally {
            this.f40241O0.mo34457e(this.f34832G0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo33275x(boolean z, boolean z2) throws vk3 {
        super.mo33275x(z, z2);
        this.f40241O0.mo34458f(this.f34832G0);
        mo33305v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo33276y(long j, boolean z) throws vk3 {
        super.mo33276y(j, z);
        this.f40242P0.zze();
        this.f40246T0 = j;
        this.f40247U0 = true;
        this.f40248V0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo33277z() {
        try {
            super.mo33277z();
            if (this.f40249W0) {
                this.f40249W0 = false;
                this.f40242P0.zzj();
            }
        } catch (Throwable th) {
            if (this.f40249W0) {
                this.f40249W0 = false;
                this.f40242P0.zzj();
            }
            throw th;
        }
    }

    public final String zzJ() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzL() {
        return super.zzL() && this.f40242P0.zzt();
    }

    public final long zza() {
        if (mo32481l() == 2) {
            m38651q0();
        }
        return this.f40246T0;
    }

    public final h20 zzc() {
        return this.f40242P0.zzc();
    }

    public final ow3 zzi() {
        return this;
    }
}
