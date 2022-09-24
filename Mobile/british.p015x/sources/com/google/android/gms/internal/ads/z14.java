package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class z14 implements g04 {

    /* renamed from: b */
    private int f42259b;

    /* renamed from: c */
    private float f42260c = 1.0f;

    /* renamed from: d */
    private float f42261d = 1.0f;

    /* renamed from: e */
    private e04 f42262e;

    /* renamed from: f */
    private e04 f42263f;

    /* renamed from: g */
    private e04 f42264g;

    /* renamed from: h */
    private e04 f42265h;

    /* renamed from: i */
    private boolean f42266i;

    /* renamed from: j */
    private y14 f42267j;

    /* renamed from: k */
    private ByteBuffer f42268k;

    /* renamed from: l */
    private ShortBuffer f42269l;

    /* renamed from: m */
    private ByteBuffer f42270m;

    /* renamed from: n */
    private long f42271n;

    /* renamed from: o */
    private long f42272o;

    /* renamed from: p */
    private boolean f42273p;

    public z14() {
        e04 e04 = e04.f31142e;
        this.f42262e = e04;
        this.f42263f = e04;
        this.f42264g = e04;
        this.f42265h = e04;
        ByteBuffer byteBuffer = g04.f32090a;
        this.f42268k = byteBuffer;
        this.f42269l = byteBuffer.asShortBuffer();
        this.f42270m = byteBuffer;
        this.f42259b = -1;
    }

    /* renamed from: a */
    public final e04 mo31448a(e04 e04) throws f04 {
        if (e04.f31145c == 2) {
            int i = this.f42259b;
            if (i == -1) {
                i = e04.f31143a;
            }
            this.f42262e = e04;
            e04 e042 = new e04(i, e04.f31144b, 2);
            this.f42263f = e042;
            this.f42266i = true;
            return e042;
        }
        throw new f04(e04);
    }

    /* renamed from: b */
    public final void mo30600b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            y14 y14 = this.f42267j;
            Objects.requireNonNull(y14);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f42271n += (long) remaining;
            y14.mo35834f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: c */
    public final long mo35989c(long j) {
        if (this.f42272o >= 1024) {
            long j2 = this.f42271n;
            y14 y14 = this.f42267j;
            Objects.requireNonNull(y14);
            long b = j2 - ((long) y14.mo35830b());
            int i = this.f42265h.f31143a;
            int i2 = this.f42264g.f31143a;
            if (i == i2) {
                return d13.m20295Z(j, b, this.f42272o);
            }
            return d13.m20295Z(j, b * ((long) i), this.f42272o * ((long) i2));
        }
        double d = (double) this.f42260c;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    /* renamed from: d */
    public final void mo35990d(float f) {
        if (this.f42261d != f) {
            this.f42261d = f;
            this.f42266i = true;
        }
    }

    /* renamed from: e */
    public final void mo35991e(float f) {
        if (this.f42260c != f) {
            this.f42260c = f;
            this.f42266i = true;
        }
    }

    public final ByteBuffer zzb() {
        int a;
        y14 y14 = this.f42267j;
        if (y14 != null && (a = y14.mo35829a()) > 0) {
            if (this.f42268k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f42268k = order;
                this.f42269l = order.asShortBuffer();
            } else {
                this.f42268k.clear();
                this.f42269l.clear();
            }
            y14.mo35832d(this.f42269l);
            this.f42272o += (long) a;
            this.f42268k.limit(a);
            this.f42270m = this.f42268k;
        }
        ByteBuffer byteBuffer = this.f42270m;
        this.f42270m = g04.f32090a;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            e04 e04 = this.f42262e;
            this.f42264g = e04;
            e04 e042 = this.f42263f;
            this.f42265h = e042;
            if (this.f42266i) {
                this.f42267j = new y14(e04.f31143a, e04.f31144b, this.f42260c, this.f42261d, e042.f31143a);
            } else {
                y14 y14 = this.f42267j;
                if (y14 != null) {
                    y14.mo35831c();
                }
            }
        }
        this.f42270m = g04.f32090a;
        this.f42271n = 0;
        this.f42272o = 0;
        this.f42273p = false;
    }

    public final void zzd() {
        y14 y14 = this.f42267j;
        if (y14 != null) {
            y14.mo35833e();
        }
        this.f42273p = true;
    }

    public final void zzf() {
        this.f42260c = 1.0f;
        this.f42261d = 1.0f;
        e04 e04 = e04.f31142e;
        this.f42262e = e04;
        this.f42263f = e04;
        this.f42264g = e04;
        this.f42265h = e04;
        ByteBuffer byteBuffer = g04.f32090a;
        this.f42268k = byteBuffer;
        this.f42269l = byteBuffer.asShortBuffer();
        this.f42270m = byteBuffer;
        this.f42259b = -1;
        this.f42266i = false;
        this.f42267j = null;
        this.f42271n = 0;
        this.f42272o = 0;
        this.f42273p = false;
    }

    public final boolean zzg() {
        if (this.f42263f.f31143a != -1) {
            return Math.abs(this.f42260c + -1.0f) >= 1.0E-4f || Math.abs(this.f42261d + -1.0f) >= 1.0E-4f || this.f42263f.f31143a != this.f42262e.f31143a;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.f42267j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzh() {
        /*
            r3 = this;
            boolean r0 = r3.f42273p
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.y14 r0 = r3.f42267j
            if (r0 == 0) goto L_0x0013
            int r0 = r0.mo35829a()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z14.zzh():boolean");
    }
}
