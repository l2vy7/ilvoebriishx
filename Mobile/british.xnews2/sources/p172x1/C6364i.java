package p172x1;

import androidx.work.C1501w;
import androidx.work.impl.utils.futures.C1476d;
import com.google.common.util.concurrent.C10412b;
import java.util.List;
import p128p1.C5892i;
import p167w1.C6283p;

/* renamed from: x1.i */
/* compiled from: StatusRunnable */
public abstract class C6364i<T> implements Runnable {

    /* renamed from: b */
    private final C1476d<T> f26225b = C1476d.m7752t();

    /* renamed from: x1.i$a */
    /* compiled from: StatusRunnable */
    class C6365a extends C6364i<List<C1501w>> {

        /* renamed from: c */
        final /* synthetic */ C5892i f26226c;

        /* renamed from: d */
        final /* synthetic */ String f26227d;

        C6365a(C5892i iVar, String str) {
            this.f26226c = iVar;
            this.f26227d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public List<C1501w> mo24194c() {
            return C6283p.f25940t.apply(this.f26226c.mo22867w().mo6924j().mo23999p(this.f26227d));
        }
    }

    /* renamed from: a */
    public static C6364i<List<C1501w>> m28006a(C5892i iVar, String str) {
        return new C6365a(iVar, str);
    }

    /* renamed from: b */
    public C10412b<T> mo24193b() {
        return this.f26225b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract T mo24194c();

    public void run() {
        try {
            this.f26225b.mo6989p(mo24194c());
        } catch (Throwable th) {
            this.f26225b.mo6990q(th);
        }
    }
}
