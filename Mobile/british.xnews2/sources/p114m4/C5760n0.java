package p114m4;

import android.os.RemoteException;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p114m4.C10775p;
import p198d5.C10487a;
import p198d5.C10489b;

/* renamed from: m4.n0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C5760n0<T extends C10775p> extends C10750e0 {
    @NotOnlyInitialized

    /* renamed from: b */
    private final C10779r<T> f24432b;

    /* renamed from: c */
    private final Class<T> f24433c;

    public C5760n0(C10779r<T> rVar, Class<T> cls) {
        this.f24432b = rVar;
        this.f24433c = cls;
    }

    /* renamed from: A */
    public final void mo22554A(C10487a aVar, int i) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9071b((C10775p) this.f24433c.cast(pVar), i);
        }
    }

    /* renamed from: K */
    public final void mo22555K(C10487a aVar) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9070a((C10775p) this.f24433c.cast(pVar));
        }
    }

    /* renamed from: U3 */
    public final void mo22556U3(C10487a aVar, boolean z) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9073i((C10775p) this.f24433c.cast(pVar), z);
        }
    }

    /* renamed from: b0 */
    public final void mo22557b0(C10487a aVar, int i) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9078o((C10775p) this.f24433c.cast(pVar), i);
        }
    }

    /* renamed from: f6 */
    public final void mo22558f6(C10487a aVar, int i) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9074j((C10775p) this.f24433c.cast(pVar), i);
        }
    }

    /* renamed from: m4 */
    public final void mo22559m4(C10487a aVar, String str) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9076m((C10775p) this.f24433c.cast(pVar), str);
        }
    }

    /* renamed from: q1 */
    public final void mo22560q1(C10487a aVar, String str) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9077n((C10775p) this.f24433c.cast(pVar), str);
        }
    }

    /* renamed from: y */
    public final void mo22561y(C10487a aVar) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9075k((C10775p) this.f24433c.cast(pVar));
        }
    }

    public final C10487a zzb() {
        return C10489b.m48195m6(this.f24432b);
    }

    public final void zzg(C10487a aVar, int i) throws RemoteException {
        C10779r<T> rVar;
        C10775p pVar = (C10775p) C10489b.m48194f3(aVar);
        if (this.f24433c.isInstance(pVar) && (rVar = this.f24432b) != null) {
            rVar.mo9072h((C10775p) this.f24433c.cast(pVar), i);
        }
    }
}
