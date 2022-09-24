package p186z5;

import android.util.SparseArray;
import javax.annotation.concurrent.GuardedBy;
import p186z5.C6471c;

/* renamed from: z5.b */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C11145b<T> {

    /* renamed from: a */
    private final Object f50159a = new Object();
    @GuardedBy("processorLock")

    /* renamed from: b */
    private C11147b<T> f50160b;

    /* renamed from: z5.b$a */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public static class C11146a<T> {

        /* renamed from: a */
        private final SparseArray<T> f50161a;

        /* renamed from: b */
        private final C6471c.C6473b f50162b;

        /* renamed from: c */
        private final boolean f50163c;

        public C11146a(SparseArray<T> sparseArray, C6471c.C6473b bVar, boolean z) {
            this.f50161a = sparseArray;
            this.f50162b = bVar;
            this.f50163c = z;
        }

        /* renamed from: a */
        public SparseArray<T> mo43449a() {
            return this.f50161a;
        }
    }

    /* renamed from: z5.b$b */
    /* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
    public interface C11147b<T> {
        /* renamed from: a */
        void mo8859a(C11146a<T> aVar);

        void release();
    }

    /* renamed from: a */
    public abstract SparseArray<T> mo24322a(C6471c cVar);

    /* renamed from: b */
    public abstract boolean mo24323b();

    /* renamed from: c */
    public void mo43447c(C6471c cVar) {
        C6471c.C6473b bVar = new C6471c.C6473b(cVar.mo24305c());
        bVar.mo24317m();
        C11146a aVar = new C11146a(mo24322a(cVar), bVar, mo24323b());
        synchronized (this.f50159a) {
            C11147b<T> bVar2 = this.f50160b;
            if (bVar2 != null) {
                bVar2.mo8859a(aVar);
            } else {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
        }
    }

    /* renamed from: d */
    public void mo24324d() {
        synchronized (this.f50159a) {
            C11147b<T> bVar = this.f50160b;
            if (bVar != null) {
                bVar.release();
                this.f50160b = null;
            }
        }
    }

    /* renamed from: e */
    public void mo43448e(C11147b<T> bVar) {
        synchronized (this.f50159a) {
            C11147b<T> bVar2 = this.f50160b;
            if (bVar2 != null) {
                bVar2.release();
            }
            this.f50160b = bVar;
        }
    }
}
