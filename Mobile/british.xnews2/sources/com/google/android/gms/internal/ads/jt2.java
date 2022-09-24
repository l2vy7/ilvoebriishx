package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jt2 {

    /* renamed from: a */
    private final LinkedList<st2<?, ?>> f34040a = new LinkedList<>();

    /* renamed from: b */
    private final int f34041b;

    /* renamed from: c */
    private final int f34042c;

    /* renamed from: d */
    private final iu2 f34043d;

    public jt2(int i, int i2) {
        this.f34041b = i;
        this.f34042c = i2;
        this.f34043d = new iu2();
    }

    /* renamed from: i */
    private final void m33746i() {
        while (!this.f34040a.isEmpty() && zzt.zzA().currentTimeMillis() - this.f34040a.getFirst().f39063d >= ((long) this.f34042c)) {
            this.f34043d.mo32774g();
            this.f34040a.remove();
        }
    }

    /* renamed from: a */
    public final int mo32979a() {
        return this.f34043d.mo32768a();
    }

    /* renamed from: b */
    public final int mo32980b() {
        m33746i();
        return this.f34040a.size();
    }

    /* renamed from: c */
    public final long mo32981c() {
        return this.f34043d.mo32769b();
    }

    /* renamed from: d */
    public final long mo32982d() {
        return this.f34043d.mo32770c();
    }

    /* renamed from: e */
    public final st2<?, ?> mo32983e() {
        this.f34043d.mo32773f();
        m33746i();
        if (this.f34040a.isEmpty()) {
            return null;
        }
        st2<?, ?> remove = this.f34040a.remove();
        if (remove != null) {
            this.f34043d.mo32775h();
        }
        return remove;
    }

    /* renamed from: f */
    public final hu2 mo32984f() {
        return this.f34043d.mo32771d();
    }

    /* renamed from: g */
    public final String mo32985g() {
        return this.f34043d.mo32772e();
    }

    /* renamed from: h */
    public final boolean mo32986h(st2<?, ?> st2) {
        this.f34043d.mo32773f();
        m33746i();
        if (this.f34040a.size() == this.f34041b) {
            return false;
        }
        this.f34040a.add(st2);
        return true;
    }
}
