package p330u7;

import com.google.android.gms.ads.query.QueryInfo;

/* renamed from: u7.b */
/* compiled from: QueryInfoMetadata */
public class C12906b {

    /* renamed from: a */
    private String f55598a;

    /* renamed from: b */
    private QueryInfo f55599b;

    /* renamed from: c */
    private String f55600c;

    public C12906b(String str) {
        this.f55598a = str;
    }

    /* renamed from: a */
    public String mo48078a() {
        return this.f55600c;
    }

    /* renamed from: b */
    public String mo48079b() {
        return this.f55598a;
    }

    /* renamed from: c */
    public QueryInfo mo48080c() {
        return this.f55599b;
    }

    /* renamed from: d */
    public String mo48081d() {
        QueryInfo queryInfo = this.f55599b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    /* renamed from: e */
    public void mo48082e(String str) {
        this.f55600c = str;
    }

    /* renamed from: f */
    public void mo48083f(QueryInfo queryInfo) {
        this.f55599b = queryInfo;
    }
}
