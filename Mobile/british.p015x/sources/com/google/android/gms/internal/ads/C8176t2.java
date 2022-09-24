package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.t2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8176t2 {

    /* renamed from: f */
    private static final byte[] f39246f = {0, 0, 1};

    /* renamed from: a */
    private boolean f39247a;

    /* renamed from: b */
    private int f39248b;

    /* renamed from: c */
    public int f39249c;

    /* renamed from: d */
    public int f39250d;

    /* renamed from: e */
    public byte[] f39251e = new byte[128];

    public C8176t2(int i) {
    }

    /* renamed from: a */
    public final void mo34852a(byte[] bArr, int i, int i2) {
        if (this.f39247a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f39251e;
            int length = bArr2.length;
            int i4 = this.f39249c + i3;
            if (length < i4) {
                this.f39251e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f39251e, this.f39249c, i3);
            this.f39249c += i3;
        }
    }

    /* renamed from: b */
    public final void mo34853b() {
        this.f39247a = false;
        this.f39249c = 0;
        this.f39248b = 0;
    }

    /* renamed from: c */
    public final boolean mo34854c(int i, int i2) {
        int i3 = this.f39248b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f39249c -= i2;
                            this.f39247a = false;
                            return true;
                        }
                    } else if ((i & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                        Log.w("H263Reader", "Unexpected start code value");
                        mo34853b();
                    } else {
                        this.f39250d = this.f39249c;
                        this.f39248b = 4;
                    }
                } else if (i > 31) {
                    Log.w("H263Reader", "Unexpected start code value");
                    mo34853b();
                } else {
                    this.f39248b = 3;
                }
            } else if (i != 181) {
                Log.w("H263Reader", "Unexpected start code value");
                mo34853b();
            } else {
                this.f39248b = 2;
            }
        } else if (i == 176) {
            this.f39248b = 1;
            this.f39247a = true;
        }
        mo34852a(f39246f, 0, 3);
        return false;
    }
}
