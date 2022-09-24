package p339y8;

/* renamed from: y8.a */
/* compiled from: AbstractContentBody */
public abstract class C12977a implements C12979c {

    /* renamed from: a */
    private final String f55714a;

    /* renamed from: b */
    private final String f55715b;

    /* renamed from: c */
    private final String f55716c;

    public C12977a(String str) {
        if (str != null) {
            this.f55714a = str;
            int indexOf = str.indexOf(47);
            if (indexOf != -1) {
                this.f55715b = str.substring(0, indexOf);
                this.f55716c = str.substring(indexOf + 1);
                return;
            }
            this.f55715b = str;
            this.f55716c = null;
            return;
        }
        throw new IllegalArgumentException("MIME type may not be null");
    }

    /* renamed from: e */
    public String mo48153e() {
        return this.f55714a;
    }
}
