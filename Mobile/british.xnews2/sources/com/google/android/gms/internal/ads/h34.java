package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public interface h34 {
    /* renamed from: a */
    void mo31100a(int i, int i2, int i3, long j, int i4);

    /* renamed from: b */
    void mo31101b(Surface surface);

    /* renamed from: c */
    void mo31102c(int i, int i2, o21 o21, long j, int i3);

    /* renamed from: d */
    void mo31103d(int i);

    /* renamed from: e */
    void mo31104e(int i, boolean z);

    /* renamed from: f */
    int mo31105f(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: g */
    void mo31106g(int i, long j);

    /* renamed from: i */
    void mo31107i(Bundle bundle);

    /* renamed from: k */
    ByteBuffer mo31108k(int i);

    int zza();

    MediaFormat zzc();

    ByteBuffer zzf(int i);

    void zzi();

    void zzl();

    boolean zzr();
}
