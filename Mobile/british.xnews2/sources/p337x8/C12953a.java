package p337x8;

import p339y8.C12979c;

/* renamed from: x8.a */
/* compiled from: FormBodyPart */
public class C12953a {

    /* renamed from: a */
    private final String f55665a;

    /* renamed from: b */
    private final C12954b f55666b;

    /* renamed from: c */
    private final C12979c f55667c;

    public C12953a(String str, C12979c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (cVar != null) {
            this.f55665a = str;
            this.f55667c = cVar;
            this.f55666b = new C12954b();
            mo48126b(cVar);
            mo48127c(cVar);
            mo48128d(cVar);
        } else {
            throw new IllegalArgumentException("Body may not be null");
        }
    }

    /* renamed from: a */
    public void mo48125a(String str, String str2) {
        if (str != null) {
            this.f55666b.mo48132a(new C12959f(str, str2));
            return;
        }
        throw new IllegalArgumentException("Field name may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo48126b(C12979c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(mo48131g());
        sb.append("\"");
        if (cVar.mo48158f() != null) {
            sb.append("; filename=\"");
            sb.append(cVar.mo48158f());
            sb.append("\"");
        }
        mo48125a("Content-Disposition", sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo48127c(C12979c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.mo48153e());
        if (cVar.mo48157d() != null) {
            sb.append("; charset=");
            sb.append(cVar.mo48157d());
        }
        mo48125a(RtspHeaders.CONTENT_TYPE, sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo48128d(C12979c cVar) {
        mo48125a("Content-Transfer-Encoding", cVar.mo48156c());
    }

    /* renamed from: e */
    public C12979c mo48129e() {
        return this.f55667c;
    }

    /* renamed from: f */
    public C12954b mo48130f() {
        return this.f55666b;
    }

    /* renamed from: g */
    public String mo48131g() {
        return this.f55665a;
    }
}
