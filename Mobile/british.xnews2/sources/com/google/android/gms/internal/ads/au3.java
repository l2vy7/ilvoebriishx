package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class au3 implements C7821j7 {

    /* renamed from: k */
    private static final mu3 f29760k = mu3.m34909b(au3.class);

    /* renamed from: b */
    protected final String f29761b;

    /* renamed from: c */
    private C7857k7 f29762c;

    /* renamed from: d */
    boolean f29763d;

    /* renamed from: e */
    boolean f29764e;

    /* renamed from: f */
    private ByteBuffer f29765f;

    /* renamed from: g */
    long f29766g;

    /* renamed from: h */
    long f29767h = -1;

    /* renamed from: i */
    gu3 f29768i;

    /* renamed from: j */
    private ByteBuffer f29769j = null;

    protected au3(String str) {
        this.f29761b = str;
        this.f29764e = true;
        this.f29763d = true;
    }

    /* renamed from: a */
    private final synchronized void m30482a() {
        String str;
        if (!this.f29764e) {
            try {
                mu3 mu3 = f29760k;
                String str2 = this.f29761b;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                mu3.mo32456a(str);
                this.f29765f = this.f29768i.mo32296z0(this.f29766g, this.f29767h);
                this.f29764e = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo30505b(ByteBuffer byteBuffer);

    /* renamed from: c */
    public final void mo30506c(C7857k7 k7Var) {
        this.f29762c = k7Var;
    }

    /* renamed from: d */
    public final synchronized void mo30507d() {
        String str;
        m30482a();
        mu3 mu3 = f29760k;
        String str2 = this.f29761b;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        mu3.mo32456a(str);
        ByteBuffer byteBuffer = this.f29765f;
        if (byteBuffer != null) {
            this.f29763d = true;
            byteBuffer.rewind();
            mo30505b(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f29769j = byteBuffer.slice();
            }
            this.f29765f = null;
        }
    }

    /* renamed from: e */
    public final void mo30508e(gu3 gu3, ByteBuffer byteBuffer, long j, C7710g7 g7Var) throws IOException {
        this.f29766g = gu3.zzb();
        byteBuffer.remaining();
        this.f29767h = j;
        this.f29768i = gu3;
        gu3.mo32294a(gu3.zzb() + j);
        this.f29764e = false;
        this.f29763d = false;
        mo30507d();
    }

    public final String zza() {
        return this.f29761b;
    }
}
