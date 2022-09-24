package com.google.android.gms.internal.ads;

import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class da2<T> {
    @Nonnull

    /* renamed from: a */
    public final T f20258a;

    /* renamed from: b */
    private e94 f20259b = new e94();

    /* renamed from: c */
    private boolean f20260c;

    /* renamed from: d */
    private boolean f20261d;

    public da2(@Nonnull T t) {
        this.f20258a = t;
    }

    /* renamed from: a */
    public final void mo18229a(int i, b82<T> b82) {
        if (!this.f20261d) {
            if (i != -1) {
                this.f20259b.mo31506a(i);
            }
            this.f20260c = true;
            b82.zza(this.f20258a);
        }
    }

    /* renamed from: b */
    public final void mo18230b(c92<T> c92) {
        if (!this.f20261d && this.f20260c) {
            fb4 b = this.f20259b.mo31507b();
            this.f20259b = new e94();
            this.f20260c = false;
            c92.mo30863a(this.f20258a, b);
        }
    }

    /* renamed from: c */
    public final void mo18231c(c92<T> c92) {
        this.f20261d = true;
        if (this.f20260c) {
            c92.mo30863a(this.f20258a, this.f20259b.mo31507b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || da2.class != obj.getClass()) {
            return false;
        }
        return this.f20258a.equals(((da2) obj).f20258a);
    }

    public final int hashCode() {
        return this.f20258a.hashCode();
    }
}
