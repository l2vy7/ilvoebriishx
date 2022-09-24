package p173x1;

import androidx.work.WorkerParameters;
import p129p1.C5892i;

/* renamed from: x1.h */
/* compiled from: StartWorkRunnable */
public class C6363h implements Runnable {

    /* renamed from: b */
    private C5892i f26222b;

    /* renamed from: c */
    private String f26223c;

    /* renamed from: d */
    private WorkerParameters.C1417a f26224d;

    public C6363h(C5892i iVar, String str, WorkerParameters.C1417a aVar) {
        this.f26222b = iVar;
        this.f26223c = str;
        this.f26224d = aVar;
    }

    public void run() {
        this.f26222b.mo22865u().mo22839k(this.f26223c, this.f26224d);
    }
}
