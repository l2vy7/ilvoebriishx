package p005a4;

import android.database.Cursor;
import java.util.List;
import p005a4.C0073b0;
import p153t3.C6150m;

/* renamed from: a4.n */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0101n implements C0073b0.C0075b {

    /* renamed from: a */
    private final C0073b0 f245a;

    /* renamed from: b */
    private final List f246b;

    /* renamed from: c */
    private final C6150m f247c;

    private C0101n(C0073b0 b0Var, List list, C6150m mVar) {
        this.f245a = b0Var;
        this.f246b = list;
        this.f247c = mVar;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m394a(C0073b0 b0Var, List list, C6150m mVar) {
        return new C0101n(b0Var, list, mVar);
    }

    public Object apply(Object obj) {
        return C0073b0.m284B(this.f245a, this.f246b, this.f247c, (Cursor) obj);
    }
}
