package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer2.C6540C;
import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iv */
/* compiled from: IMASDK */
public final class C4083iv {

    /* renamed from: a */
    public static final UUID f17461a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f17462b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID f17463c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID f17464d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f17465e = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* renamed from: a */
    public static long m17451a(long j) {
        return (j == C6540C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: b */
    public static long m17452b(long j) {
        return (j == C6540C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: c */
    public static int m17453c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: d */
    public static String m17454d(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
}
