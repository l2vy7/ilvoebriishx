package p108l4;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import org.json.JSONObject;

/* renamed from: l4.g */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C10678g {

    /* renamed from: a */
    private final long f49292a;

    /* renamed from: b */
    private final int f49293b;

    /* renamed from: c */
    private final boolean f49294c;

    /* renamed from: d */
    private final JSONObject f49295d;

    /* renamed from: l4.g$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C10679a {

        /* renamed from: a */
        private long f49296a;

        /* renamed from: b */
        private int f49297b = 0;

        /* renamed from: c */
        private boolean f49298c;

        /* renamed from: d */
        private JSONObject f49299d;

        @RecentlyNonNull
        /* renamed from: a */
        public C10678g mo42829a() {
            return new C10678g(this.f49296a, this.f49297b, this.f49298c, this.f49299d, (C10687k0) null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C10679a mo42830b(JSONObject jSONObject) {
            this.f49299d = jSONObject;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C10679a mo42831c(boolean z) {
            this.f49298c = z;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: d */
        public C10679a mo42832d(long j) {
            this.f49296a = j;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: e */
        public C10679a mo42833e(int i) {
            this.f49297b = i;
            return this;
        }
    }

    /* synthetic */ C10678g(long j, int i, boolean z, JSONObject jSONObject, C10687k0 k0Var) {
        this.f49292a = j;
        this.f49293b = i;
        this.f49294c = z;
        this.f49295d = jSONObject;
    }

    @RecentlyNullable
    /* renamed from: a */
    public JSONObject mo42823a() {
        return this.f49295d;
    }

    /* renamed from: b */
    public long mo42824b() {
        return this.f49292a;
    }

    /* renamed from: c */
    public int mo42825c() {
        return this.f49293b;
    }

    /* renamed from: d */
    public boolean mo42826d() {
        return this.f49294c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10678g)) {
            return false;
        }
        C10678g gVar = (C10678g) obj;
        return this.f49292a == gVar.f49292a && this.f49293b == gVar.f49293b && this.f49294c == gVar.f49294c && C7408m.m30028a(this.f49295d, gVar.f49295d);
    }

    public int hashCode() {
        return C7408m.m30029b(Long.valueOf(this.f49292a), Integer.valueOf(this.f49293b), Boolean.valueOf(this.f49294c), this.f49295d);
    }
}
