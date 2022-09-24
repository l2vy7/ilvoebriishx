package p207f5;

@Deprecated
/* renamed from: f5.a */
public abstract class C10529a<T> {

    /* renamed from: a */
    private final int f49068a;

    /* renamed from: b */
    private final String f49069b;

    /* renamed from: c */
    private final T f49070c;

    @Deprecated
    /* renamed from: f5.a$a */
    public static class C10530a extends C10529a<Boolean> {
        public C10530a(int i, String str, Boolean bool) {
            super(i, str, bool);
        }
    }

    private C10529a(int i, String str, T t) {
        this.f49068a = i;
        this.f49069b = str;
        this.f49070c = t;
        C10532c.m48264a().mo42655a(this);
    }

    @Deprecated
    /* renamed from: a */
    public static C10530a m48262a(int i, String str, Boolean bool) {
        return new C10530a(i, str, bool);
    }
}
