package p172x0;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p105l0.C5642b;

/* renamed from: x0.c */
/* compiled from: Loader */
public class C6339c<D> {

    /* renamed from: a */
    int f26170a;

    /* renamed from: b */
    C6342c<D> f26171b;

    /* renamed from: c */
    C6341b<D> f26172c;

    /* renamed from: d */
    Context f26173d;

    /* renamed from: e */
    boolean f26174e = false;

    /* renamed from: f */
    boolean f26175f = false;

    /* renamed from: g */
    boolean f26176g = true;

    /* renamed from: h */
    boolean f26177h = false;

    /* renamed from: i */
    boolean f26178i = false;

    /* renamed from: x0.c$a */
    /* compiled from: Loader */
    public final class C6340a extends ContentObserver {
        public C6340a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C6339c.this.mo24151p();
        }
    }

    /* renamed from: x0.c$b */
    /* compiled from: Loader */
    public interface C6341b<D> {
        /* renamed from: a */
        void mo24161a(C6339c<D> cVar);
    }

    /* renamed from: x0.c$c */
    /* compiled from: Loader */
    public interface C6342c<D> {
        /* renamed from: a */
        void mo4039a(C6339c<D> cVar, D d);
    }

    public C6339c(Context context) {
        this.f26173d = context.getApplicationContext();
    }

    /* renamed from: A */
    public void mo24139A(C6342c<D> cVar) {
        C6342c<D> cVar2 = this.f26171b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar2 == cVar) {
            this.f26171b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: b */
    public void mo24140b() {
        this.f26175f = true;
        mo24150n();
    }

    /* renamed from: c */
    public boolean mo24141c() {
        return mo24125o();
    }

    /* renamed from: d */
    public void mo24142d() {
        this.f26178i = false;
    }

    /* renamed from: e */
    public String mo24143e(D d) {
        StringBuilder sb = new StringBuilder(64);
        C5642b.m24953a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: f */
    public void mo24144f() {
        C6341b<D> bVar = this.f26172c;
        if (bVar != null) {
            bVar.mo24161a(this);
        }
    }

    /* renamed from: g */
    public void mo24135g(D d) {
        C6342c<D> cVar = this.f26171b;
        if (cVar != null) {
            cVar.mo4039a(this, d);
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo24124h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f26170a);
        printWriter.print(" mListener=");
        printWriter.println(this.f26171b);
        if (this.f26174e || this.f26177h || this.f26178i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f26174e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f26177h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f26178i);
        }
        if (this.f26175f || this.f26176g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f26175f);
            printWriter.print(" mReset=");
            printWriter.println(this.f26176g);
        }
    }

    /* renamed from: i */
    public void mo24145i() {
        mo24126q();
    }

    /* renamed from: j */
    public Context mo24146j() {
        return this.f26173d;
    }

    /* renamed from: k */
    public boolean mo24147k() {
        return this.f26175f;
    }

    /* renamed from: l */
    public boolean mo24148l() {
        return this.f26176g;
    }

    /* renamed from: m */
    public boolean mo24149m() {
        return this.f26174e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo24150n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo24125o() {
        throw null;
    }

    /* renamed from: p */
    public void mo24151p() {
        if (this.f26174e) {
            mo24145i();
        } else {
            this.f26177h = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24126q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo24136r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo24137s() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo24138t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C5642b.m24953a(this, sb);
        sb.append(" id=");
        sb.append(this.f26170a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo24153u(int i, C6342c<D> cVar) {
        if (this.f26171b == null) {
            this.f26171b = cVar;
            this.f26170a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: v */
    public void mo24154v() {
        mo24136r();
        this.f26176g = true;
        this.f26174e = false;
        this.f26175f = false;
        this.f26177h = false;
        this.f26178i = false;
    }

    /* renamed from: w */
    public void mo24155w() {
        if (this.f26178i) {
            mo24151p();
        }
    }

    /* renamed from: x */
    public final void mo24156x() {
        this.f26174e = true;
        this.f26176g = false;
        this.f26175f = false;
        mo24137s();
    }

    /* renamed from: y */
    public void mo24157y() {
        this.f26174e = false;
        mo24138t();
    }

    /* renamed from: z */
    public boolean mo24158z() {
        boolean z = this.f26177h;
        this.f26177h = false;
        this.f26178i |= z;
        return z;
    }
}
