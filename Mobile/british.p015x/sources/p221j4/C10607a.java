package p221j4;

/* renamed from: j4.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C10607a {

    /* renamed from: b */
    static int f49159b = 31;

    /* renamed from: a */
    private int f49160a = 1;

    /* renamed from: a */
    public C10607a mo42719a(Object obj) {
        this.f49160a = (f49159b * this.f49160a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int mo42720b() {
        return this.f49160a;
    }

    /* renamed from: c */
    public final C10607a mo42721c(boolean z) {
        this.f49160a = (f49159b * this.f49160a) + (z ? 1 : 0);
        return this;
    }
}
