package com.facebook;

import android.os.Handler;
import com.facebook.C3652q;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.y */
/* compiled from: ProgressOutputStream */
class C3756y extends FilterOutputStream implements C3758z {

    /* renamed from: b */
    private final Map<GraphRequest, C3369a0> f13875b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3652q f13876c;

    /* renamed from: d */
    private final long f13877d = C3642m.m12292r();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f13878e;

    /* renamed from: f */
    private long f13879f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f13880g;

    /* renamed from: h */
    private C3369a0 f13881h;

    /* renamed from: com.facebook.y$a */
    /* compiled from: ProgressOutputStream */
    class C3757a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C3652q.C3654b f13882b;

        C3757a(C3652q.C3654b bVar) {
            this.f13882b = bVar;
        }

        public void run() {
            this.f13882b.mo12379b(C3756y.this.f13876c, C3756y.this.f13878e, C3756y.this.f13880g);
        }
    }

    C3756y(OutputStream outputStream, C3652q qVar, Map<GraphRequest, C3369a0> map, long j) {
        super(outputStream);
        this.f13876c = qVar;
        this.f13875b = map;
        this.f13880g = j;
    }

    /* renamed from: g */
    private void m12669g(long j) {
        C3369a0 a0Var = this.f13881h;
        if (a0Var != null) {
            a0Var.mo11299a(j);
        }
        long j2 = this.f13878e + j;
        this.f13878e = j2;
        if (j2 >= this.f13879f + this.f13877d || j2 >= this.f13880g) {
            m12670h();
        }
    }

    /* renamed from: h */
    private void m12670h() {
        if (this.f13878e > this.f13879f) {
            for (C3652q.C3653a next : this.f13876c.mo12374u()) {
                if (next instanceof C3652q.C3654b) {
                    Handler t = this.f13876c.mo12373t();
                    C3652q.C3654b bVar = (C3652q.C3654b) next;
                    if (t == null) {
                        bVar.mo12379b(this.f13876c, this.f13878e, this.f13880g);
                    } else {
                        t.post(new C3757a(bVar));
                    }
                }
            }
            this.f13879f = this.f13878e;
        }
    }

    /* renamed from: c */
    public void mo12614c(GraphRequest graphRequest) {
        this.f13881h = graphRequest != null ? this.f13875b.get(graphRequest) : null;
    }

    public void close() throws IOException {
        super.close();
        for (C3369a0 c : this.f13875b.values()) {
            c.mo11301c();
        }
        m12670h();
    }

    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        m12669g((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        m12669g((long) i2);
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        m12669g(1);
    }
}
