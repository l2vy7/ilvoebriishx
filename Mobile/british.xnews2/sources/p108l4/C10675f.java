package p108l4;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.json.JSONObject;

/* renamed from: l4.f */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C10675f {

    /* renamed from: a */
    private boolean f49275a;

    /* renamed from: b */
    private long f49276b;

    /* renamed from: c */
    private double f49277c;

    /* renamed from: d */
    private final long[] f49278d;

    /* renamed from: e */
    private final JSONObject f49279e;

    /* renamed from: f */
    private final String f49280f;

    /* renamed from: g */
    private final String f49281g;

    /* renamed from: l4.f$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C10676a {

        /* renamed from: a */
        private boolean f49282a = true;

        /* renamed from: b */
        private long f49283b = -1;

        /* renamed from: c */
        private double f49284c = 1.0d;

        /* renamed from: d */
        private long[] f49285d;

        /* renamed from: e */
        private JSONObject f49286e;

        /* renamed from: f */
        private String f49287f;

        /* renamed from: g */
        private String f49288g;

        @RecentlyNonNull
        /* renamed from: a */
        public C10675f mo42820a() {
            return new C10675f(this.f49282a, this.f49283b, this.f49284c, this.f49285d, this.f49286e, this.f49287f, this.f49288g, (C10685j0) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C10676a mo42821b(boolean z) {
            this.f49282a = z;
            return this;
        }
    }

    /* synthetic */ C10675f(boolean z, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, C10685j0 j0Var) {
        this.f49275a = z;
        this.f49276b = j;
        this.f49277c = d;
        this.f49278d = jArr;
        this.f49279e = jSONObject;
        this.f49280f = str;
        this.f49281g = str2;
    }

    @RecentlyNullable
    /* renamed from: a */
    public long[] mo42813a() {
        return this.f49278d;
    }

    /* renamed from: b */
    public boolean mo42814b() {
        return this.f49275a;
    }

    @RecentlyNullable
    /* renamed from: c */
    public String mo42815c() {
        return this.f49280f;
    }

    @RecentlyNullable
    /* renamed from: d */
    public String mo42816d() {
        return this.f49281g;
    }

    @RecentlyNullable
    /* renamed from: e */
    public JSONObject mo42817e() {
        return this.f49279e;
    }

    /* renamed from: f */
    public long mo42818f() {
        return this.f49276b;
    }

    /* renamed from: g */
    public double mo42819g() {
        return this.f49277c;
    }
}
