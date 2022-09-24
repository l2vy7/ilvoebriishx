package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class fu3 implements Iterator<C7821j7>, Closeable, C7857k7 {

    /* renamed from: h */
    private static final C7821j7 f31881h = new eu3("eof ");

    /* renamed from: i */
    private static final mu3 f31882i = mu3.m34909b(fu3.class);

    /* renamed from: b */
    protected C7710g7 f31883b;

    /* renamed from: c */
    protected gu3 f31884c;

    /* renamed from: d */
    C7821j7 f31885d = null;

    /* renamed from: e */
    long f31886e = 0;

    /* renamed from: f */
    long f31887f = 0;

    /* renamed from: g */
    private final List<C7821j7> f31888g = new ArrayList();

    public void close() throws IOException {
    }

    /* renamed from: f */
    public final C7821j7 next() {
        C7821j7 a;
        C7821j7 j7Var = this.f31885d;
        if (j7Var == null || j7Var == f31881h) {
            gu3 gu3 = this.f31884c;
            if (gu3 == null || this.f31886e >= this.f31887f) {
                this.f31885d = f31881h;
                throw new NoSuchElementException();
            }
            try {
                synchronized (gu3) {
                    this.f31884c.mo32294a(this.f31886e);
                    a = this.f31883b.mo31776a(this.f31884c, this);
                    this.f31886e = this.f31884c.zzb();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f31885d = null;
            return j7Var;
        }
    }

    /* renamed from: g */
    public final List<C7821j7> mo31928g() {
        return (this.f31884c == null || this.f31885d == f31881h) ? this.f31888g : new lu3(this.f31888g, this);
    }

    /* renamed from: h */
    public final void mo31929h(gu3 gu3, long j, C7710g7 g7Var) throws IOException {
        this.f31884c = gu3;
        this.f31886e = gu3.zzb();
        gu3.mo32294a(gu3.zzb() + j);
        this.f31887f = gu3.zzb();
        this.f31883b = g7Var;
    }

    public final boolean hasNext() {
        C7821j7 j7Var = this.f31885d;
        if (j7Var == f31881h) {
            return false;
        }
        if (j7Var != null) {
            return true;
        }
        try {
            this.f31885d = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f31885d = f31881h;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f31888g.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f31888g.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
