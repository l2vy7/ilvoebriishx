package p151t1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1483m;
import androidx.work.C1485n;
import p145s1.C6014b;
import p156u1.C6185g;
import p167w1.C6283p;
import p177y1.C6400a;

/* renamed from: t1.e */
/* compiled from: NetworkMeteredController */
public class C6100e extends C6097c<C6014b> {

    /* renamed from: e */
    private static final String f25343e = C1483m.m7773f("NetworkMeteredCtrlr");

    public C6100e(Context context, C6400a aVar) {
        super(C6185g.m27124c(context, aVar).mo23603d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo23411b(C6283p pVar) {
        return pVar.f25950j.mo6870b() == C1485n.METERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo23412c(C6014b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            C1483m.m7771c().mo7013a(f25343e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.mo23136a();
        } else if (!bVar.mo23136a() || !bVar.mo23137b()) {
            return true;
        } else {
            return false;
        }
    }
}
