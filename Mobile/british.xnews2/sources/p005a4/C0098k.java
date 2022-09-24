package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;
import p153t3.C6150m;

/* renamed from: a4.k */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0098k implements C0073b0.C0075b {

    /* renamed from: a */
    private final C0073b0 f241a;

    /* renamed from: b */
    private final C6150m f242b;

    private C0098k(C0073b0 b0Var, C6150m mVar) {
        this.f241a = b0Var;
        this.f242b = mVar;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m391a(C0073b0 b0Var, C6150m mVar) {
        return new C0098k(b0Var, mVar);
    }

    public Object apply(Object obj) {
        return this.f241a.m290U((SQLiteDatabase) obj, this.f242b);
    }
}
