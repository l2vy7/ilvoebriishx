package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8404zf implements C7644ef {

    /* renamed from: b */
    private int f42449b = -1;

    /* renamed from: c */
    private int f42450c = -1;

    /* renamed from: d */
    private int[] f42451d;

    /* renamed from: e */
    private boolean f42452e;

    /* renamed from: f */
    private int[] f42453f;

    /* renamed from: g */
    private ByteBuffer f42454g;

    /* renamed from: h */
    private ByteBuffer f42455h;

    /* renamed from: i */
    private boolean f42456i;

    public C8404zf() {
        ByteBuffer byteBuffer = C7644ef.f31342a;
        this.f42454g = byteBuffer;
        this.f42455h = byteBuffer;
    }

    /* renamed from: a */
    public final void mo31231a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = this.f42449b;
        int length = ((limit - position) / (i + i)) * this.f42453f.length;
        int i2 = length + length;
        if (this.f42454g.capacity() < i2) {
            this.f42454g = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f42454g.clear();
        }
        while (position < limit) {
            for (int i3 : this.f42453f) {
                this.f42454g.putShort(byteBuffer.getShort(i3 + i3 + position));
            }
            int i4 = this.f42449b;
            position += i4 + i4;
        }
        byteBuffer.position(limit);
        this.f42454g.flip();
        this.f42455h = this.f42454g;
    }

    /* renamed from: b */
    public final boolean mo31232b(int i, int i2, int i3) throws C7607df {
        boolean z = !Arrays.equals(this.f42451d, this.f42453f);
        int[] iArr = this.f42451d;
        this.f42453f = iArr;
        if (iArr == null) {
            this.f42452e = false;
            return z;
        } else if (i3 != 2) {
            throw new C7607df(i, i2, i3);
        } else if (!z && this.f42450c == i && this.f42449b == i2) {
            return false;
        } else {
            this.f42450c = i;
            this.f42449b = i2;
            this.f42452e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f42453f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f42452e = (i5 != i4) | this.f42452e;
                    i4++;
                } else {
                    throw new C7607df(i, i2, 2);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo36055c(int[] iArr) {
        this.f42451d = iArr;
    }

    public final int zza() {
        int[] iArr = this.f42453f;
        return iArr == null ? this.f42449b : iArr.length;
    }

    public final int zzb() {
        return 2;
    }

    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f42455h;
        this.f42455h = C7644ef.f31342a;
        return byteBuffer;
    }

    public final void zzd() {
        this.f42455h = C7644ef.f31342a;
        this.f42456i = false;
    }

    public final void zze() {
        this.f42456i = true;
    }

    public final void zzg() {
        zzd();
        this.f42454g = C7644ef.f31342a;
        this.f42449b = -1;
        this.f42450c = -1;
        this.f42453f = null;
        this.f42452e = false;
    }

    public final boolean zzi() {
        return this.f42452e;
    }

    public final boolean zzj() {
        return this.f42456i && this.f42455h == C7644ef.f31342a;
    }
}
