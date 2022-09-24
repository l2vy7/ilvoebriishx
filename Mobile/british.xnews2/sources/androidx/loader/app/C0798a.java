package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.C0775g;
import androidx.lifecycle.C0795t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p171x0.C6339c;

/* renamed from: androidx.loader.app.a */
/* compiled from: LoaderManager */
public abstract class C0798a {

    /* renamed from: androidx.loader.app.a$a */
    /* compiled from: LoaderManager */
    public interface C0799a<D> {
        /* renamed from: d */
        void mo4035d(C6339c<D> cVar, D d);

        /* renamed from: e */
        C6339c<D> mo4036e(int i, Bundle bundle);

        /* renamed from: j */
        void mo4037j(C6339c<D> cVar);
    }

    /* renamed from: b */
    public static <T extends C0775g & C0795t> C0798a m4332b(T t) {
        return new C0800b(t, ((C0795t) t).mo643g());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo4032a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C6339c<D> mo4033c(int i, Bundle bundle, C0799a<D> aVar);

    /* renamed from: d */
    public abstract void mo4034d();
}
