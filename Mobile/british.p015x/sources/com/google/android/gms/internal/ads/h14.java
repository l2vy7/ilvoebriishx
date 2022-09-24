package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class h14 {

    /* renamed from: a */
    public final C8281w f32578a;

    /* renamed from: b */
    public final int f32579b;

    /* renamed from: c */
    public final int f32580c = 0;

    /* renamed from: d */
    public final int f32581d;

    /* renamed from: e */
    public final int f32582e;

    /* renamed from: f */
    public final int f32583f;

    /* renamed from: g */
    public final int f32584g;

    /* renamed from: h */
    public final int f32585h;

    /* renamed from: i */
    public final g04[] f32586i;

    public h14(C8281w wVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, g04[] g04Arr) {
        this.f32578a = wVar;
        this.f32579b = i;
        boolean z2 = false;
        this.f32581d = i3;
        this.f32582e = i4;
        this.f32583f = i5;
        this.f32584g = i6;
        this.f32586i = g04Arr;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
        nu1.m20747f(minBufferSize != -2 ? true : z2);
        this.f32585h = d13.m20281L(minBufferSize * 4, ((int) mo32317a(250000)) * i3, Math.max(minBufferSize, ((int) mo32317a(750000)) * i3));
    }

    /* renamed from: a */
    public final long mo32317a(long j) {
        return (j * ((long) this.f32582e)) / 1000000;
    }

    /* renamed from: b */
    public final long mo32318b(long j) {
        return (j * 1000000) / ((long) this.f32582e);
    }

    /* renamed from: c */
    public final AudioTrack mo32319c(boolean z, oe3 oe3, int i) throws u04 {
        AudioTrack audioTrack;
        try {
            int i2 = d13.f20195a;
            if (i2 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(oe3.mo33889a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f32582e).setChannelMask(this.f32583f).setEncoding(this.f32584g).build()).setTransferMode(1).setBufferSizeInBytes(this.f32585h).setSessionId(i).setOffloadedPlayback(false).build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(oe3.mo33889a(), new AudioFormat.Builder().setSampleRate(this.f32582e).setChannelMask(this.f32583f).setEncoding(this.f32584g).build(), this.f32585h, 1, i);
            } else {
                int i3 = oe3.f36452a;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.f32582e, this.f32583f, this.f32584g, this.f32585h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f32582e, this.f32583f, this.f32584g, this.f32585h, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new u04(state, this.f32582e, this.f32583f, this.f32585h, this.f32578a, false, (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new u04(0, this.f32582e, this.f32583f, this.f32585h, this.f32578a, false, e);
        }
    }
}
