package p151t1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1485n;
import p145s1.C6014b;
import p156u1.C6185g;
import p167w1.C6283p;
import p177y1.C6400a;

/* renamed from: t1.d */
/* compiled from: NetworkConnectedController */
public class C6099d extends C6097c<C6014b> {
    public C6099d(Context context, C6400a aVar) {
        super(C6185g.m27124c(context, aVar).mo23603d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo23411b(C6283p pVar) {
        return pVar.f25950j.mo6870b() == C1485n.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo23412c(C6014b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return !bVar.mo23136a();
        }
        if (!bVar.mo23136a() || !bVar.mo23139d()) {
            return true;
        }
        return false;
    }
}
