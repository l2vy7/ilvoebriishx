package p270a8;

import com.google.android.gms.ads.query.QueryInfo;

/* renamed from: a8.b */
/* compiled from: QueryInfoMetadata */
public class C11153b {

    /* renamed from: a */
    private String f50166a;

    /* renamed from: b */
    private QueryInfo f50167b;

    /* renamed from: c */
    private String f50168c;

    public C11153b(String str) {
        this.f50166a = str;
    }

    /* renamed from: a */
    public String mo43450a() {
        return this.f50168c;
    }

    /* renamed from: b */
    public String mo43451b() {
        return this.f50166a;
    }

    /* renamed from: c */
    public QueryInfo mo43452c() {
        return this.f50167b;
    }

    /* renamed from: d */
    public String mo43453d() {
        QueryInfo queryInfo = this.f50167b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    /* renamed from: e */
    public void mo43454e(String str) {
        this.f50168c = str;
    }

    /* renamed from: f */
    public void mo43455f(QueryInfo queryInfo) {
        this.f50167b = queryInfo;
    }
}
