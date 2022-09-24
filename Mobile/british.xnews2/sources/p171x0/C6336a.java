package p171x0;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p089i0.C5432j;
import p104l0.C5649i;

/* renamed from: x0.a */
/* compiled from: AsyncTaskLoader */
public abstract class C6336a<D> extends C6339c<D> {

    /* renamed from: j */
    private final Executor f26153j;

    /* renamed from: k */
    volatile C6336a<D>.a f26154k;

    /* renamed from: l */
    volatile C6336a<D>.a f26155l;

    /* renamed from: m */
    long f26156m;

    /* renamed from: n */
    long f26157n;

    /* renamed from: o */
    Handler f26158o;

    /* renamed from: x0.a$a */
    /* compiled from: AsyncTaskLoader */
    final class C6337a extends C6343d<Void, Void, D> implements Runnable {

        /* renamed from: l */
        private final CountDownLatch f26159l = new CountDownLatch(1);

        /* renamed from: m */
        boolean f26160m;

        C6337a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo24128h(D d) {
            try {
                C6336a.this.mo24117C(this, d);
            } finally {
                this.f26159l.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo24129i(D d) {
            try {
                C6336a.this.mo24118D(this, d);
            } finally {
                this.f26159l.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public D mo24127b(Void... voidArr) {
            try {
                return C6336a.this.mo24123I();
            } catch (C5432j e) {
                if (mo24165f()) {
                    return null;
                }
                throw e;
            }
        }

        public void run() {
            this.f26160m = false;
            C6336a.this.mo24119E();
        }
    }

    public C6336a(Context context) {
        this(context, C6343d.f26182i);
    }

    /* renamed from: B */
    public void mo24116B() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo24117C(C6336a<D>.a aVar, D d) {
        mo24122H(d);
        if (this.f26155l == aVar) {
            mo24155w();
            this.f26157n = SystemClock.uptimeMillis();
            this.f26155l = null;
            mo24144f();
            mo24119E();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo24118D(C6336a<D>.a aVar, D d) {
        if (this.f26154k != aVar) {
            mo24117C(aVar, d);
        } else if (mo24147k()) {
            mo24122H(d);
        } else {
            mo24142d();
            this.f26157n = SystemClock.uptimeMillis();
            this.f26154k = null;
            mo24135g(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo24119E() {
        if (this.f26155l == null && this.f26154k != null) {
            if (this.f26154k.f26160m) {
                this.f26154k.f26160m = false;
                this.f26158o.removeCallbacks(this.f26154k);
            }
            if (this.f26156m <= 0 || SystemClock.uptimeMillis() >= this.f26157n + this.f26156m) {
                this.f26154k.mo24163c(this.f26153j, (Params[]) null);
                return;
            }
            this.f26154k.f26160m = true;
            this.f26158o.postAtTime(this.f26154k, this.f26157n + this.f26156m);
        }
    }

    /* renamed from: F */
    public boolean mo24120F() {
        return this.f26155l != null;
    }

    /* renamed from: G */
    public abstract D mo24121G();

    /* renamed from: H */
    public void mo24122H(D d) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public D mo24123I() {
        return mo24121G();
    }

    @Deprecated
    /* renamed from: h */
    public void mo24124h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo24124h(str, fileDescriptor, printWriter, strArr);
        if (this.f26154k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f26154k);
            printWriter.print(" waiting=");
            printWriter.println(this.f26154k.f26160m);
        }
        if (this.f26155l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f26155l);
            printWriter.print(" waiting=");
            printWriter.println(this.f26155l.f26160m);
        }
        if (this.f26156m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C5649i.m24968c(this.f26156m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C5649i.m24967b(this.f26157n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo24125o() {
        if (this.f26154k == null) {
            return false;
        }
        if (!this.f26174e) {
            this.f26177h = true;
        }
        if (this.f26155l != null) {
            if (this.f26154k.f26160m) {
                this.f26154k.f26160m = false;
                this.f26158o.removeCallbacks(this.f26154k);
            }
            this.f26154k = null;
            return false;
        } else if (this.f26154k.f26160m) {
            this.f26154k.f26160m = false;
            this.f26158o.removeCallbacks(this.f26154k);
            this.f26154k = null;
            return false;
        } else {
            boolean a = this.f26154k.mo24162a(false);
            if (a) {
                this.f26155l = this.f26154k;
                mo24116B();
            }
            this.f26154k = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo24126q() {
        super.mo24126q();
        mo24141c();
        this.f26154k = new C6337a();
        mo24119E();
    }

    private C6336a(Context context, Executor executor) {
        super(context);
        this.f26157n = -10000;
        this.f26153j = executor;
    }
}
