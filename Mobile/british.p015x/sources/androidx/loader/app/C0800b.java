package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0781l;
import androidx.lifecycle.C0782m;
import androidx.lifecycle.C0789q;
import androidx.lifecycle.C0790r;
import androidx.lifecycle.C0794s;
import androidx.loader.app.C0798a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p105l0.C5642b;
import p150t.C6091h;
import p172x0.C6339c;

/* renamed from: androidx.loader.app.b */
/* compiled from: LoaderManagerImpl */
class C0800b extends C0798a {

    /* renamed from: c */
    static boolean f3866c = false;

    /* renamed from: a */
    private final C0775g f3867a;

    /* renamed from: b */
    private final C0803c f3868b;

    /* renamed from: androidx.loader.app.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C0801a<D> extends C0781l<D> implements C6339c.C6342c<D> {

        /* renamed from: l */
        private final int f3869l;

        /* renamed from: m */
        private final Bundle f3870m;

        /* renamed from: n */
        private final C6339c<D> f3871n;

        /* renamed from: o */
        private C0775g f3872o;

        /* renamed from: p */
        private C0802b<D> f3873p;

        /* renamed from: q */
        private C6339c<D> f3874q;

        C0801a(int i, Bundle bundle, C6339c<D> cVar, C6339c<D> cVar2) {
            this.f3869l = i;
            this.f3870m = bundle;
            this.f3871n = cVar;
            this.f3874q = cVar2;
            cVar.mo24153u(i, this);
        }

        /* renamed from: a */
        public void mo4039a(C6339c<D> cVar, D d) {
            if (C0800b.f3866c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo3962n(d);
                return;
            }
            if (C0800b.f3866c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo3960l(d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo3958j() {
            if (C0800b.f3866c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f3871n.mo24156x();
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo3959k() {
            if (C0800b.f3866c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f3871n.mo24157y();
        }

        /* renamed from: m */
        public void mo3961m(C0782m<? super D> mVar) {
            super.mo3961m(mVar);
            this.f3872o = null;
            this.f3873p = null;
        }

        /* renamed from: n */
        public void mo3962n(D d) {
            super.mo3962n(d);
            C6339c<D> cVar = this.f3874q;
            if (cVar != null) {
                cVar.mo24154v();
                this.f3874q = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C6339c<D> mo4040o(boolean z) {
            if (C0800b.f3866c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f3871n.mo24141c();
            this.f3871n.mo24140b();
            C0802b<D> bVar = this.f3873p;
            if (bVar != null) {
                mo3961m(bVar);
                if (z) {
                    bVar.mo4048d();
                }
            }
            this.f3871n.mo24139A(this);
            if ((bVar == null || bVar.mo4047c()) && !z) {
                return this.f3871n;
            }
            this.f3871n.mo24154v();
            return this.f3874q;
        }

        /* renamed from: p */
        public void mo4041p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f3869l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f3870m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f3871n);
            C6339c<D> cVar = this.f3871n;
            cVar.mo24124h(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f3873p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f3873p);
                C0802b<D> bVar = this.f3873p;
                bVar.mo4046b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo4042q().mo24143e(mo3954f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo3955g());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public C6339c<D> mo4042q() {
            return this.f3871n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo4043r() {
            C0775g gVar = this.f3872o;
            C0802b<D> bVar = this.f3873p;
            if (gVar != null && bVar != null) {
                super.mo3961m(bVar);
                mo3956h(gVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public C6339c<D> mo4044s(C0775g gVar, C0798a.C0799a<D> aVar) {
            C0802b<D> bVar = new C0802b<>(this.f3871n, aVar);
            mo3956h(gVar, bVar);
            C0802b<D> bVar2 = this.f3873p;
            if (bVar2 != null) {
                mo3961m(bVar2);
            }
            this.f3872o = gVar;
            this.f3873p = bVar;
            return this.f3871n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f3869l);
            sb.append(" : ");
            C5642b.m24953a(this.f3871n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C0802b<D> implements C0782m<D> {

        /* renamed from: a */
        private final C6339c<D> f3875a;

        /* renamed from: b */
        private final C0798a.C0799a<D> f3876b;

        /* renamed from: c */
        private boolean f3877c = false;

        C0802b(C6339c<D> cVar, C0798a.C0799a<D> aVar) {
            this.f3875a = cVar;
            this.f3876b = aVar;
        }

        /* renamed from: a */
        public void mo3735a(D d) {
            if (C0800b.f3866c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f3875a + ": " + this.f3875a.mo24143e(d));
            }
            this.f3876b.mo4035d(this.f3875a, d);
            this.f3877c = true;
        }

        /* renamed from: b */
        public void mo4046b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f3877c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo4047c() {
            return this.f3877c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4048d() {
            if (this.f3877c) {
                if (C0800b.f3866c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f3875a);
                }
                this.f3876b.mo4037j(this.f3875a);
            }
        }

        public String toString() {
            return this.f3876b.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$c */
    /* compiled from: LoaderManagerImpl */
    static class C0803c extends C0789q {

        /* renamed from: e */
        private static final C0790r.C0791a f3878e = new C0804a();

        /* renamed from: c */
        private C6091h<C0801a> f3879c = new C6091h<>();

        /* renamed from: d */
        private boolean f3880d = false;

        /* renamed from: androidx.loader.app.b$c$a */
        /* compiled from: LoaderManagerImpl */
        static class C0804a implements C0790r.C0791a {
            C0804a() {
            }

            /* renamed from: a */
            public <T extends C0789q> T mo3803a(Class<T> cls) {
                return new C0803c();
            }
        }

        C0803c() {
        }

        /* renamed from: g */
        static C0803c m4357g(C0794s sVar) {
            return (C0803c) new C0790r(sVar, f3878e).mo4024a(C0803c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo3789d() {
            super.mo3789d();
            int m = this.f3879c.mo23408m();
            for (int i = 0; i < m; i++) {
                this.f3879c.mo23409n(i).mo4040o(true);
            }
            this.f3879c.mo23400b();
        }

        /* renamed from: e */
        public void mo4050e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3879c.mo23408m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f3879c.mo23408m(); i++) {
                    C0801a n = this.f3879c.mo23409n(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f3879c.mo23406k(i));
                    printWriter.print(": ");
                    printWriter.println(n.toString());
                    n.mo4041p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4051f() {
            this.f3880d = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public <D> C0801a<D> mo4052h(int i) {
            return this.f3879c.mo23403g(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo4053i() {
            return this.f3880d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4054j() {
            int m = this.f3879c.mo23408m();
            for (int i = 0; i < m; i++) {
                this.f3879c.mo23409n(i).mo4043r();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4055k(int i, C0801a aVar) {
            this.f3879c.mo23407l(i, aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo4056l() {
            this.f3880d = true;
        }
    }

    C0800b(C0775g gVar, C0794s sVar) {
        this.f3867a = gVar;
        this.f3868b = C0803c.m4357g(sVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private <D> C6339c<D> m4339e(int i, Bundle bundle, C0798a.C0799a<D> aVar, C6339c<D> cVar) {
        try {
            this.f3868b.mo4056l();
            C6339c<D> e = aVar.mo4036e(i, bundle);
            if (e != null) {
                if (e.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(e.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + e);
                    }
                }
                C0801a aVar2 = new C0801a(i, bundle, e, cVar);
                if (f3866c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f3868b.mo4055k(i, aVar2);
                this.f3868b.mo4051f();
                return aVar2.mo4044s(this.f3867a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f3868b.mo4051f();
            throw th;
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo4032a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3868b.mo4050e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public <D> C6339c<D> mo4033c(int i, Bundle bundle, C0798a.C0799a<D> aVar) {
        if (this.f3868b.mo4053i()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C0801a h = this.f3868b.mo4052h(i);
            if (f3866c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (h == null) {
                return m4339e(i, bundle, aVar, (C6339c) null);
            }
            if (f3866c) {
                Log.v("LoaderManager", "  Re-using existing loader " + h);
            }
            return h.mo4044s(this.f3867a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: d */
    public void mo4034d() {
        this.f3868b.mo4054j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C5642b.m24953a(this.f3867a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
