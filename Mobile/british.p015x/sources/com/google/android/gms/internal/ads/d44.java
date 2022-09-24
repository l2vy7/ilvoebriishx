package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d44 implements h34 {

    /* renamed from: a */
    private final MediaCodec f30633a;

    /* renamed from: b */
    private ByteBuffer[] f30634b;

    /* renamed from: c */
    private ByteBuffer[] f30635c;

    /* synthetic */ d44(MediaCodec mediaCodec, Surface surface, b44 b44) {
        this.f30633a = mediaCodec;
        if (d13.f20195a < 21) {
            this.f30634b = mediaCodec.getInputBuffers();
            this.f30635c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: a */
    public final void mo31100a(int i, int i2, int i3, long j, int i4) {
        this.f30633a.queueInputBuffer(i, 0, i3, j, i4);
    }

    /* renamed from: b */
    public final void mo31101b(Surface surface) {
        this.f30633a.setOutputSurface(surface);
    }

    /* renamed from: c */
    public final void mo31102c(int i, int i2, o21 o21, long j, int i3) {
        this.f30633a.queueSecureInputBuffer(i, 0, o21.mo33827a(), j, 0);
    }

    /* renamed from: d */
    public final void mo31103d(int i) {
        this.f30633a.setVideoScalingMode(i);
    }

    /* renamed from: e */
    public final void mo31104e(int i, boolean z) {
        this.f30633a.releaseOutputBuffer(i, z);
    }

    /* renamed from: f */
    public final int mo31105f(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f30633a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                if (d13.f20195a < 21) {
                    this.f30635c = this.f30633a.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: g */
    public final void mo31106g(int i, long j) {
        this.f30633a.releaseOutputBuffer(i, j);
    }

    /* renamed from: i */
    public final void mo31107i(Bundle bundle) {
        this.f30633a.setParameters(bundle);
    }

    /* renamed from: k */
    public final ByteBuffer mo31108k(int i) {
        if (d13.f20195a >= 21) {
            return this.f30633a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) d13.m20300c(this.f30635c))[i];
    }

    public final int zza() {
        return this.f30633a.dequeueInputBuffer(0);
    }

    public final MediaFormat zzc() {
        return this.f30633a.getOutputFormat();
    }

    public final ByteBuffer zzf(int i) {
        if (d13.f20195a >= 21) {
            return this.f30633a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) d13.m20300c(this.f30634b))[i];
    }

    public final void zzi() {
        this.f30633a.flush();
    }

    public final void zzl() {
        this.f30634b = null;
        this.f30635c = null;
        this.f30633a.release();
    }

    public final boolean zzr() {
        return false;
    }
}
