package com.google.ads.interactivemedia.p039v3.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yk */
/* compiled from: IMASDK */
public final class C4504yk {

    /* renamed from: a */
    private final MediaCodec f19686a;

    /* renamed from: b */
    private ByteBuffer[] f19687b;

    /* renamed from: c */
    private ByteBuffer[] f19688c;

    /* synthetic */ C4504yk(MediaCodec mediaCodec) {
        this.f19686a = mediaCodec;
    }

    /* renamed from: a */
    public final void mo16812a() {
        this.f19686a.start();
        if (amm.f15298a < 21) {
            this.f19687b = this.f19686a.getInputBuffers();
            this.f19688c = this.f19686a.getOutputBuffers();
        }
    }

    /* renamed from: b */
    public final int mo16813b() {
        return this.f19686a.dequeueInputBuffer(0);
    }

    /* renamed from: c */
    public final int mo16814c(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f19686a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (amm.f15298a < 21) {
                    this.f19688c = this.f19686a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: d */
    public final MediaFormat mo16815d() {
        return this.f19686a.getOutputFormat();
    }

    /* renamed from: e */
    public final ByteBuffer mo16816e(int i) {
        if (amm.f15298a >= 21) {
            return this.f19686a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) amm.m14236f(this.f19687b))[i];
    }

    /* renamed from: f */
    public final ByteBuffer mo16817f(int i) {
        if (amm.f15298a >= 21) {
            return this.f19686a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) amm.m14236f(this.f19688c))[i];
    }

    /* renamed from: g */
    public final void mo16818g(int i, boolean z) {
        this.f19686a.releaseOutputBuffer(i, z);
    }

    /* renamed from: h */
    public final void mo16819h(int i, long j) {
        this.f19686a.releaseOutputBuffer(i, j);
    }

    /* renamed from: i */
    public final void mo16820i() {
        this.f19686a.flush();
    }

    /* renamed from: j */
    public final void mo16821j() {
        this.f19687b = null;
        this.f19688c = null;
        this.f19686a.release();
    }

    /* renamed from: k */
    public final void mo16822k(C4484xr xrVar, Handler handler) {
        this.f19686a.setOnFrameRenderedListener(new C4502yi(this, xrVar), handler);
    }

    /* renamed from: l */
    public final void mo16823l(Surface surface) {
        this.f19686a.setOutputSurface(surface);
    }

    /* renamed from: m */
    public final void mo16824m(Bundle bundle) {
        this.f19686a.setParameters(bundle);
    }

    /* renamed from: n */
    public final void mo16825n(int i) {
        this.f19686a.setVideoScalingMode(i);
    }

    /* renamed from: o */
    public final void mo16826o(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f19686a.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    /* renamed from: p */
    public final void mo16827p(int i, int i2, long j, int i3) {
        this.f19686a.queueInputBuffer(i, 0, i2, j, i3);
    }

    /* renamed from: q */
    public final void mo16828q(int i, C4265po poVar, long j) {
        this.f19686a.queueSecureInputBuffer(i, 0, poVar.mo16517b(), j, 0);
    }
}
