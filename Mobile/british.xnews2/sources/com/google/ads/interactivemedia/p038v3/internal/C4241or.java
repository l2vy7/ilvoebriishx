package com.google.ads.interactivemedia.p038v3.internal;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;

/* renamed from: com.google.ads.interactivemedia.v3.internal.or */
/* compiled from: IMASDK */
final class C4241or {

    /* renamed from: a */
    public final C4120ke f18214a;

    /* renamed from: b */
    public final int f18215b;

    /* renamed from: c */
    public final int f18216c;

    /* renamed from: d */
    public final int f18217d;

    /* renamed from: e */
    public final int f18218e;

    /* renamed from: f */
    public final int f18219f;

    /* renamed from: g */
    public final int f18220g;

    /* renamed from: h */
    public final int f18221h;

    /* renamed from: i */
    public final C4215ns[] f18222i;

    public C4241or(C4120ke keVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, C4215ns[] nsVarArr) {
        int i7;
        this.f18214a = keVar;
        this.f18215b = i;
        this.f18216c = i2;
        this.f18217d = i3;
        this.f18218e = i4;
        this.f18219f = i5;
        this.f18220g = i6;
        this.f18222i = nsVarArr;
        boolean z2 = true;
        if (i2 == 0) {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            aup.m14887r(minBufferSize == -2 ? false : z2);
            i7 = amm.m14191H(minBufferSize * 4, ((int) mo16474b(250000)) * i3, Math.max(minBufferSize, ((int) mo16474b(750000)) * i3));
        } else if (i2 != 1) {
            i7 = m18394e(250000);
        } else {
            i7 = m18394e(50000000);
        }
        this.f18221h = i7;
    }

    /* renamed from: e */
    private final int m18394e(long j) {
        int i;
        int i2 = this.f18220g;
        switch (i2) {
            case 5:
                i = Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 6:
            case 18:
                i = Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 7:
                i = DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 8:
                i = DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 9:
                i = MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
                break;
            case 10:
                i = AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 11:
                i = AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 12:
                i = AacUtil.AAC_HE_V2_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 14:
                i = Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 15:
                i = 8000;
                break;
            case 16:
                i = AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                break;
            case 17:
                i = Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (i2 == 5) {
            i += i;
        }
        return (int) ((j * ((long) i)) / 1000000);
    }

    /* renamed from: f */
    private static AudioAttributes m18395f(C4210nn nnVar, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return nnVar.mo16365a();
    }

    /* renamed from: a */
    public final long mo16473a(long j) {
        return (j * 1000000) / ((long) this.f18218e);
    }

    /* renamed from: b */
    public final long mo16474b(long j) {
        return (j * ((long) this.f18218e)) / 1000000;
    }

    /* renamed from: c */
    public final AudioTrack mo16475c(boolean z, C4210nn nnVar, int i) throws C4228oe {
        AudioTrack audioTrack;
        try {
            int i2 = amm.f15298a;
            if (i2 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(m18395f(nnVar, z)).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f18218e).setChannelMask(this.f18219f).setEncoding(this.f18220g).build()).setTransferMode(1).setBufferSizeInBytes(this.f18221h).setSessionId(i).setOffloadedPlayback(this.f18216c == 1).build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(m18395f(nnVar, z), new AudioFormat.Builder().setSampleRate(this.f18218e).setChannelMask(this.f18219f).setEncoding(this.f18220g).build(), this.f18221h, 1, i);
            } else {
                int i3 = nnVar.f18090c;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.f18218e, this.f18219f, this.f18220g, this.f18221h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f18218e, this.f18219f, this.f18220g, this.f18221h, 1, i);
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
            throw new C4228oe(state, this.f18218e, this.f18219f, this.f18221h, this.f18214a, mo16476d(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C4228oe(0, this.f18218e, this.f18219f, this.f18221h, this.f18214a, mo16476d(), e);
        }
    }

    /* renamed from: d */
    public final boolean mo16476d() {
        return this.f18216c == 1;
    }
}
