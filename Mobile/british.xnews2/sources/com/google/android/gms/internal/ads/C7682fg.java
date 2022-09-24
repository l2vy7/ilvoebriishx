package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.fg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7682fg implements C7644ef {

    /* renamed from: b */
    private int f31724b = -1;

    /* renamed from: c */
    private int f31725c = -1;

    /* renamed from: d */
    private C7645eg f31726d;

    /* renamed from: e */
    private float f31727e = 1.0f;

    /* renamed from: f */
    private float f31728f = 1.0f;

    /* renamed from: g */
    private ByteBuffer f31729g;

    /* renamed from: h */
    private ShortBuffer f31730h;

    /* renamed from: i */
    private ByteBuffer f31731i;

    /* renamed from: j */
    private long f31732j;

    /* renamed from: k */
    private long f31733k;

    /* renamed from: l */
    private boolean f31734l;

    public C7682fg() {
        ByteBuffer byteBuffer = C7644ef.f31342a;
        this.f31729g = byteBuffer;
        this.f31730h = byteBuffer.asShortBuffer();
        this.f31731i = byteBuffer;
    }

    /* renamed from: a */
    public final void mo31231a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f31732j += (long) remaining;
            this.f31726d.mo31569d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = this.f31726d.mo31566a() * this.f31724b;
        int i = a + a;
        if (i > 0) {
            if (this.f31729g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f31729g = order;
                this.f31730h = order.asShortBuffer();
            } else {
                this.f31729g.clear();
                this.f31730h.clear();
            }
            this.f31726d.mo31567b(this.f31730h);
            this.f31733k += (long) i;
            this.f31729g.limit(i);
            this.f31731i = this.f31729g;
        }
    }

    /* renamed from: b */
    public final boolean mo31232b(int i, int i2, int i3) throws C7607df {
        if (i3 != 2) {
            throw new C7607df(i, i2, i3);
        } else if (this.f31725c == i && this.f31724b == i2) {
            return false;
        } else {
            this.f31725c = i;
            this.f31724b = i2;
            return true;
        }
    }

    /* renamed from: c */
    public final float mo31851c(float f) {
        this.f31728f = C7836jm.m33639a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: d */
    public final float mo31852d(float f) {
        float a = C7836jm.m33639a(f, 0.1f, 8.0f);
        this.f31727e = a;
        return a;
    }

    /* renamed from: e */
    public final long mo31853e() {
        return this.f31732j;
    }

    /* renamed from: f */
    public final long mo31854f() {
        return this.f31733k;
    }

    public final int zza() {
        return this.f31724b;
    }

    public final int zzb() {
        return 2;
    }

    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f31731i;
        this.f31731i = C7644ef.f31342a;
        return byteBuffer;
    }

    public final void zzd() {
        C7645eg egVar = new C7645eg(this.f31725c, this.f31724b);
        this.f31726d = egVar;
        egVar.mo31571f(this.f31727e);
        this.f31726d.mo31570e(this.f31728f);
        this.f31731i = C7644ef.f31342a;
        this.f31732j = 0;
        this.f31733k = 0;
        this.f31734l = false;
    }

    public final void zze() {
        this.f31726d.mo31568c();
        this.f31734l = true;
    }

    public final void zzg() {
        this.f31726d = null;
        ByteBuffer byteBuffer = C7644ef.f31342a;
        this.f31729g = byteBuffer;
        this.f31730h = byteBuffer.asShortBuffer();
        this.f31731i = byteBuffer;
        this.f31724b = -1;
        this.f31725c = -1;
        this.f31732j = 0;
        this.f31733k = 0;
        this.f31734l = false;
    }

    public final boolean zzi() {
        return Math.abs(this.f31727e + -1.0f) >= 0.01f || Math.abs(this.f31728f + -1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f31726d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzj() {
        /*
            r3 = this;
            boolean r0 = r3.f31734l
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.eg r0 = r3.f31726d
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo31566a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7682fg.zzj():boolean");
    }
}
