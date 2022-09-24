package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;
import p153t3.C6150m;

/* renamed from: a4.a0 */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0071a0 implements C0073b0.C0075b {

    /* renamed from: a */
    private final C0073b0 f204a;

    /* renamed from: b */
    private final C6150m f205b;

    private C0071a0(C0073b0 b0Var, C6150m mVar) {
        this.f204a = b0Var;
        this.f205b = mVar;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m280a(C0073b0 b0Var, C6150m mVar) {
        return new C0071a0(b0Var, mVar);
    }

    public Object apply(Object obj) {
        return C0073b0.m312u(this.f204a, this.f205b, (SQLiteDatabase) obj);
    }
}
