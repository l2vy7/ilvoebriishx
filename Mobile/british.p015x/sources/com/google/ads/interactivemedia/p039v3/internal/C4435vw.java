package com.google.ads.interactivemedia.p039v3.internal;

import android.util.Log;
import com.google.android.exoplayer2.extractor.p040ts.PsExtractor;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vw */
/* compiled from: IMASDK */
final class C4435vw {

    /* renamed from: d */
    private static final byte[] f19277d = {0, 0, 1};

    /* renamed from: a */
    public int f19278a;

    /* renamed from: b */
    public int f19279b;

    /* renamed from: c */
    public byte[] f19280c = new byte[128];

    /* renamed from: e */
    private boolean f19281e;

    /* renamed from: f */
    private int f19282f;

    /* renamed from: a */
    public final void mo16717a() {
        this.f19281e = false;
        this.f19278a = 0;
        this.f19282f = 0;
    }

    /* renamed from: b */
    public final boolean mo16718b(int i, int i2) {
        int i3 = this.f19282f;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f19278a -= i2;
                            this.f19281e = false;
                            return true;
                        }
                    } else if ((i & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                        Log.w("H263Reader", "Unexpected start code value");
                        mo16717a();
                    } else {
                        this.f19279b = this.f19278a;
                        this.f19282f = 4;
                    }
                } else if (i > 31) {
                    Log.w("H263Reader", "Unexpected start code value");
                    mo16717a();
                } else {
                    this.f19282f = 3;
                }
            } else if (i != 181) {
                Log.w("H263Reader", "Unexpected start code value");
                mo16717a();
            } else {
                this.f19282f = 2;
            }
        } else if (i == 176) {
            this.f19282f = 1;
            this.f19281e = true;
        }
        mo16719c(f19277d, 0, 3);
        return false;
    }

    /* renamed from: c */
    public final void mo16719c(byte[] bArr, int i, int i2) {
        if (this.f19281e) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f19280c;
            int length = bArr2.length;
            int i4 = this.f19278a + i3;
            if (length < i4) {
                this.f19280c = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f19280c, this.f19278a, i3);
            this.f19278a += i3;
        }
    }
}
