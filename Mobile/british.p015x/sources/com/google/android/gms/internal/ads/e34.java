package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class e34 {

    /* renamed from: a */
    private int f31212a = 0;

    /* renamed from: b */
    private int f31213b = -1;

    /* renamed from: c */
    private int f31214c = 0;

    /* renamed from: d */
    private int[] f31215d;

    /* renamed from: e */
    private int f31216e;

    public e34() {
        int[] iArr = new int[16];
        this.f31215d = iArr;
        this.f31216e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int mo31465a() {
        int i = this.f31214c;
        if (i != 0) {
            int[] iArr = this.f31215d;
            int i2 = this.f31212a;
            int i3 = iArr[i2];
            this.f31212a = (i2 + 1) & this.f31216e;
            this.f31214c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo31466b(int i) {
        int i2 = this.f31214c;
        int[] iArr = this.f31215d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 >= 0) {
                int[] iArr2 = new int[i3];
                int i4 = this.f31212a;
                int i5 = length - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f31215d, 0, iArr2, i5, i4);
                this.f31212a = 0;
                this.f31213b = this.f31214c - 1;
                this.f31215d = iArr2;
                this.f31216e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.f31213b + 1) & this.f31216e;
        this.f31213b = i6;
        iArr[i6] = i;
        this.f31214c++;
    }

    /* renamed from: c */
    public final void mo31467c() {
        this.f31212a = 0;
        this.f31213b = -1;
        this.f31214c = 0;
    }

    /* renamed from: d */
    public final boolean mo31468d() {
        return this.f31214c == 0;
    }
}
