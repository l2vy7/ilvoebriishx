package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.common.util.concurrent.C10412b;
import java.util.Collections;
import java.util.List;
import p128p1.C5892i;

@SuppressLint({"AddedAbstractMethod"})
/* renamed from: androidx.work.x */
/* compiled from: WorkManager */
public abstract class C1503x {
    protected C1503x() {
    }

    /* renamed from: j */
    public static C1503x m7802j(Context context) {
        return C5892i.m25998s(context);
    }

    /* renamed from: l */
    public static void m7803l(Context context, C1419b bVar) {
        C5892i.m25996l(context, bVar);
    }

    /* renamed from: a */
    public final C1500v mo7039a(C1486o oVar) {
        return mo7040b(Collections.singletonList(oVar));
    }

    /* renamed from: b */
    public abstract C1500v mo7040b(List<C1486o> list);

    /* renamed from: c */
    public abstract C1488p mo7041c(String str);

    /* renamed from: d */
    public abstract C1488p mo7042d(String str);

    /* renamed from: e */
    public final C1488p mo7043e(C1504y yVar) {
        return mo7044f(Collections.singletonList(yVar));
    }

    /* renamed from: f */
    public abstract C1488p mo7044f(List<? extends C1504y> list);

    /* renamed from: g */
    public abstract C1488p mo7045g(String str, C1429f fVar, C1495r rVar);

    /* renamed from: h */
    public C1488p mo7046h(String str, C1430g gVar, C1486o oVar) {
        return mo7047i(str, gVar, Collections.singletonList(oVar));
    }

    /* renamed from: i */
    public abstract C1488p mo7047i(String str, C1430g gVar, List<C1486o> list);

    /* renamed from: k */
    public abstract C10412b<List<C1501w>> mo7048k(String str);
}
