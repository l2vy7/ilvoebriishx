package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.dg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7608dg implements C7644ef {

    /* renamed from: b */
    private int f30737b = -1;

    /* renamed from: c */
    private int f30738c = -1;

    /* renamed from: d */
    private int f30739d = 0;

    /* renamed from: e */
    private ByteBuffer f30740e;

    /* renamed from: f */
    private ByteBuffer f30741f;

    /* renamed from: g */
    private boolean f30742g;

    public C7608dg() {
        ByteBuffer byteBuffer = C7644ef.f31342a;
        this.f30740e = byteBuffer;
        this.f30741f = byteBuffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[LOOP:2: B:23:0x0080->B:24:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0040, B:24:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31231a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f30739d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 + r2
        L_0x0022:
            java.nio.ByteBuffer r3 = r7.f30740e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x0039
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f30740e = r2
            goto L_0x003e
        L_0x0039:
            java.nio.ByteBuffer r2 = r7.f30740e
            r2.clear()
        L_0x003e:
            int r2 = r7.f30739d
            if (r2 == r5) goto L_0x0080
            if (r2 == r6) goto L_0x0067
            if (r2 != r4) goto L_0x0061
        L_0x0046:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f30740e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f30740e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0046
        L_0x0061:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0067:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f30740e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f30740e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0067
        L_0x0080:
            if (r0 >= r1) goto L_0x009b
            java.nio.ByteBuffer r2 = r7.f30740e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f30740e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0080
        L_0x009b:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f30740e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f30740e
            r7.f30741f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7608dg.mo31231a(java.nio.ByteBuffer):void");
    }

    /* renamed from: b */
    public final boolean mo31232b(int i, int i2, int i3) throws C7607df {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C7607df(i, i2, i3);
        } else if (this.f30737b == i && this.f30738c == i2 && this.f30739d == i3) {
            return false;
        } else {
            this.f30737b = i;
            this.f30738c = i2;
            this.f30739d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f30740e = C7644ef.f31342a;
            return true;
        }
    }

    public final int zza() {
        return this.f30738c;
    }

    public final int zzb() {
        return 2;
    }

    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f30741f;
        this.f30741f = C7644ef.f31342a;
        return byteBuffer;
    }

    public final void zzd() {
        this.f30741f = C7644ef.f31342a;
        this.f30742g = false;
    }

    public final void zze() {
        this.f30742g = true;
    }

    public final void zzg() {
        zzd();
        this.f30740e = C7644ef.f31342a;
        this.f30737b = -1;
        this.f30738c = -1;
        this.f30739d = 0;
    }

    public final boolean zzi() {
        int i = this.f30739d;
        return (i == 0 || i == 2) ? false : true;
    }

    public final boolean zzj() {
        return this.f30742g && this.f30741f == C7644ef.f31342a;
    }
}
