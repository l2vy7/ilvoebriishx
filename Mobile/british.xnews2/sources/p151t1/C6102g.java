package p151t1;

import android.content.Context;
import android.os.Build;
import androidx.work.C1485n;
import p145s1.C6014b;
import p156u1.C6185g;
import p167w1.C6283p;
import p177y1.C6400a;

/* renamed from: t1.g */
/* compiled from: NetworkUnmeteredController */
public class C6102g extends C6097c<C6014b> {
    public C6102g(Context context, C6400a aVar) {
        super(C6185g.m27124c(context, aVar).mo23603d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo23411b(C6283p pVar) {
        return pVar.f25950j.mo6870b() == C1485n.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f25950j.mo6870b() == C1485n.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo23412c(C6014b bVar) {
        return !bVar.mo23136a() || bVar.mo23137b();
    }
}
