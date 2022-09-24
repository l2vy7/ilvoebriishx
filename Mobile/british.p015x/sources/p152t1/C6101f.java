package p152t1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1483m;
import androidx.work.C1485n;
import p146s1.C6014b;
import p157u1.C6185g;
import p168w1.C6283p;
import p178y1.C6400a;

/* renamed from: t1.f */
/* compiled from: NetworkNotRoamingController */
public class C6101f extends C6097c<C6014b> {

    /* renamed from: e */
    private static final String f25344e = C1483m.m7773f("NetworkNotRoamingCtrlr");

    public C6101f(Context context, C6400a aVar) {
        super(C6185g.m27124c(context, aVar).mo23603d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo23411b(C6283p pVar) {
        return pVar.f25950j.mo6870b() == C1485n.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo23412c(C6014b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            C1483m.m7771c().mo7013a(f25344e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.mo23136a();
        } else if (!bVar.mo23136a() || !bVar.mo23138c()) {
            return true;
        } else {
            return false;
        }
    }
}
