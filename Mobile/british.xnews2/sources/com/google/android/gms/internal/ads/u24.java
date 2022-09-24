package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class u24 implements h34 {

    /* renamed from: a */
    private final MediaCodec f39745a;

    /* renamed from: b */
    private final z24 f39746b;

    /* renamed from: c */
    private final x24 f39747c;

    /* renamed from: d */
    private boolean f39748d;

    /* renamed from: e */
    private int f39749e = 0;

    /* synthetic */ u24(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, t24 t24) {
        this.f39745a = mediaCodec;
        this.f39746b = new z24(handlerThread);
        this.f39747c = new x24(mediaCodec, handlerThread2);
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ void m38115l(u24 u24, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        u24.f39746b.mo36002e(u24.f39745a);
        bz2.m30876a("configureCodec");
        u24.f39745a.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        bz2.m30877b();
        u24.f39747c.mo35714f();
        bz2.m30876a("startCodec");
        u24.f39745a.start();
        bz2.m30877b();
        u24.f39749e = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static String m38116m(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo31100a(int i, int i2, int i3, long j, int i4) {
        this.f39747c.mo35711c(i, 0, i3, j, i4);
    }

    /* renamed from: b */
    public final void mo31101b(Surface surface) {
        this.f39745a.setOutputSurface(surface);
    }

    /* renamed from: c */
    public final void mo31102c(int i, int i2, o21 o21, long j, int i3) {
        this.f39747c.mo35712d(i, 0, o21, j, 0);
    }

    /* renamed from: d */
    public final void mo31103d(int i) {
        this.f39745a.setVideoScalingMode(i);
    }

    /* renamed from: e */
    public final void mo31104e(int i, boolean z) {
        this.f39745a.releaseOutputBuffer(i, z);
    }

    /* renamed from: f */
    public final int mo31105f(MediaCodec.BufferInfo bufferInfo) {
        return this.f39746b.mo35999b(bufferInfo);
    }

    /* renamed from: g */
    public final void mo31106g(int i, long j) {
        this.f39745a.releaseOutputBuffer(i, j);
    }

    /* renamed from: i */
    public final void mo31107i(Bundle bundle) {
        this.f39745a.setParameters(bundle);
    }

    /* renamed from: k */
    public final ByteBuffer mo31108k(int i) {
        return this.f39745a.getOutputBuffer(i);
    }

    public final int zza() {
        return this.f39746b.mo35998a();
    }

    public final MediaFormat zzc() {
        return this.f39746b.mo36000c();
    }

    public final ByteBuffer zzf(int i) {
        return this.f39745a.getInputBuffer(i);
    }

    public final void zzi() {
        this.f39747c.mo35710b();
        this.f39745a.flush();
        z24 z24 = this.f39746b;
        MediaCodec mediaCodec = this.f39745a;
        mediaCodec.getClass();
        z24.mo36001d(new p24(mediaCodec));
    }

    public final void zzl() {
        try {
            if (this.f39749e == 1) {
                this.f39747c.mo35713e();
                this.f39746b.mo36004g();
            }
            this.f39749e = 2;
            if (!this.f39748d) {
                this.f39745a.release();
                this.f39748d = true;
            }
        } catch (Throwable th) {
            if (!this.f39748d) {
                this.f39745a.release();
                this.f39748d = true;
            }
            throw th;
        }
    }

    public final boolean zzr() {
        return false;
    }
}
