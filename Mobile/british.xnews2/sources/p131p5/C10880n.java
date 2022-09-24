package p131p5;

import android.os.DeadObjectException;
import android.os.IInterface;

/* renamed from: p5.n */
final class C10880n implements C10876j<C10872e> {

    /* renamed from: a */
    private final /* synthetic */ C10879m f49662a;

    C10880n(C10879m mVar) {
        this.f49662a = mVar;
    }

    /* renamed from: a */
    public final void mo43063a() {
        this.f49662a.checkConnected();
    }

    /* renamed from: b */
    public final /* synthetic */ IInterface mo43064b() throws DeadObjectException {
        return (C10872e) this.f49662a.getService();
    }
}
