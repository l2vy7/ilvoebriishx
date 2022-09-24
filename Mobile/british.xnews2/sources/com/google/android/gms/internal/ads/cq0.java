package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class cq0 {

    /* renamed from: b */
    protected static final AtomicInteger f30460b = new AtomicInteger(0);

    /* renamed from: c */
    protected static final AtomicInteger f30461c = new AtomicInteger(0);

    /* renamed from: R */
    public static int m31088R() {
        return f30460b.get();
    }

    /* renamed from: T */
    public static int m31089T() {
        return f30461c.get();
    }

    /* renamed from: A */
    public abstract void mo30982A(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    /* renamed from: B */
    public abstract void mo30983B();

    /* renamed from: C */
    public abstract void mo30984C(long j);

    /* renamed from: D */
    public abstract void mo30985D(int i);

    /* renamed from: E */
    public abstract void mo30986E(int i);

    /* renamed from: F */
    public abstract void mo30987F(bq0 bq0);

    /* renamed from: G */
    public abstract void mo30988G(int i);

    /* renamed from: H */
    public abstract void mo30989H(int i);

    /* renamed from: I */
    public abstract void mo30990I(boolean z);

    /* renamed from: J */
    public abstract void mo30991J(boolean z);

    /* renamed from: K */
    public abstract void mo30992K(int i);

    /* renamed from: L */
    public abstract void mo30993L(Surface surface, boolean z) throws IOException;

    /* renamed from: M */
    public abstract void mo30994M(float f, boolean z) throws IOException;

    /* renamed from: N */
    public abstract void mo30995N();

    /* renamed from: O */
    public abstract boolean mo30996O();

    /* renamed from: P */
    public abstract boolean mo30997P();

    /* renamed from: Q */
    public abstract int mo30998Q();

    /* renamed from: S */
    public abstract int mo30999S();

    /* renamed from: U */
    public abstract long mo31000U();

    /* renamed from: V */
    public abstract long mo31001V();

    /* renamed from: W */
    public abstract long mo31002W();

    /* renamed from: X */
    public abstract long mo31003X();

    /* renamed from: Y */
    public abstract long mo31004Y();

    /* renamed from: Z */
    public abstract long mo31005Z();

    /* renamed from: a0 */
    public abstract long mo31006a0();

    /* renamed from: z */
    public abstract void mo31007z(Uri[] uriArr, String str);
}
