package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class e14 implements g04 {

    /* renamed from: b */
    protected e04 f31158b;

    /* renamed from: c */
    protected e04 f31159c;

    /* renamed from: d */
    private e04 f31160d;

    /* renamed from: e */
    private e04 f31161e;

    /* renamed from: f */
    private ByteBuffer f31162f;

    /* renamed from: g */
    private ByteBuffer f31163g;

    /* renamed from: h */
    private boolean f31164h;

    public e14() {
        ByteBuffer byteBuffer = g04.f32090a;
        this.f31162f = byteBuffer;
        this.f31163g = byteBuffer;
        e04 e04 = e04.f31142e;
        this.f31160d = e04;
        this.f31161e = e04;
        this.f31158b = e04;
        this.f31159c = e04;
    }

    /* renamed from: a */
    public final e04 mo31448a(e04 e04) throws f04 {
        this.f31160d = e04;
        this.f31161e = mo30601c(e04);
        return zzg() ? this.f31161e : e04.f31142e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract e04 mo30601c(e04 e04) throws f04;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ByteBuffer mo31449d(int i) {
        if (this.f31162f.capacity() < i) {
            this.f31162f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f31162f.clear();
        }
        ByteBuffer byteBuffer = this.f31162f;
        this.f31163g = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo30602e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo30603f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo30604g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo31450h() {
        return this.f31163g.hasRemaining();
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f31163g;
        this.f31163g = g04.f32090a;
        return byteBuffer;
    }

    public final void zzc() {
        this.f31163g = g04.f32090a;
        this.f31164h = false;
        this.f31158b = this.f31160d;
        this.f31159c = this.f31161e;
        mo30602e();
    }

    public final void zzd() {
        this.f31164h = true;
        mo30603f();
    }

    public final void zzf() {
        zzc();
        this.f31162f = g04.f32090a;
        e04 e04 = e04.f31142e;
        this.f31160d = e04;
        this.f31161e = e04;
        this.f31158b = e04;
        this.f31159c = e04;
        mo30604g();
    }

    public boolean zzg() {
        return this.f31161e != e04.f31142e;
    }

    public boolean zzh() {
        return this.f31164h && this.f31163g == g04.f32090a;
    }
}
