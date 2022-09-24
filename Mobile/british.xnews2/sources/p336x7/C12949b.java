package p336x7;

import com.google.android.gms.ads.query.QueryInfo;

/* renamed from: x7.b */
/* compiled from: QueryInfoMetadata */
public class C12949b {

    /* renamed from: a */
    private String f55658a;

    /* renamed from: b */
    private QueryInfo f55659b;

    /* renamed from: c */
    private String f55660c;

    public C12949b(String str) {
        this.f55658a = str;
    }

    /* renamed from: a */
    public String mo48115a() {
        return this.f55660c;
    }

    /* renamed from: b */
    public String mo48116b() {
        return this.f55658a;
    }

    /* renamed from: c */
    public QueryInfo mo48117c() {
        return this.f55659b;
    }

    /* renamed from: d */
    public String mo48118d() {
        QueryInfo queryInfo = this.f55659b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    /* renamed from: e */
    public void mo48119e(String str) {
        this.f55660c = str;
    }

    /* renamed from: f */
    public void mo48120f(QueryInfo queryInfo) {
        this.f55659b = queryInfo;
    }
}
