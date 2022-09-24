package p005a4;

import p005a4.C0073b0;

/* renamed from: a4.s */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0106s implements C0073b0.C0077d {

    /* renamed from: a */
    private final C0093h0 f252a;

    private C0106s(C0093h0 h0Var) {
        this.f252a = h0Var;
    }

    /* renamed from: b */
    public static C0073b0.C0077d m400b(C0093h0 h0Var) {
        return new C0106s(h0Var);
    }

    /* renamed from: a */
    public Object mo231a() {
        return this.f252a.getWritableDatabase();
    }
}
