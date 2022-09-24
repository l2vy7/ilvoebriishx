package p233m7;

/* renamed from: m7.b */
/* compiled from: SystemClock */
public class C10812b implements C10811a {

    /* renamed from: a */
    private static C10812b f49558a;

    private C10812b() {
    }

    /* renamed from: a */
    public static C10812b m48780a() {
        if (f49558a == null) {
            f49558a = new C10812b();
        }
        return f49558a;
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
