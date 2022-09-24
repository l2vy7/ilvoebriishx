package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;
import p153t3.C6141h;
import p153t3.C6150m;

/* renamed from: a4.w */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0110w implements C0073b0.C0075b {

    /* renamed from: a */
    private final C0073b0 f256a;

    /* renamed from: b */
    private final C6150m f257b;

    /* renamed from: c */
    private final C6141h f258c;

    private C0110w(C0073b0 b0Var, C6150m mVar, C6141h hVar) {
        this.f256a = b0Var;
        this.f257b = mVar;
        this.f258c = hVar;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m405a(C0073b0 b0Var, C6150m mVar, C6141h hVar) {
        return new C0110w(b0Var, mVar, hVar);
    }

    public Object apply(Object obj) {
        return C0073b0.m286H(this.f256a, this.f257b, this.f258c, (SQLiteDatabase) obj);
    }
}
