package p154t3;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p154t3.C6126a;

@AutoValue
/* renamed from: t3.h */
/* compiled from: EventInternal */
public abstract class C6141h {

    @AutoValue.Builder
    /* renamed from: t3.h$a */
    /* compiled from: EventInternal */
    public static abstract class C6142a {
        /* renamed from: a */
        public final C6142a mo23527a(String str, int i) {
            mo23482e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C6142a mo23528b(String str, long j) {
            mo23482e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C6142a mo23529c(String str, String str2) {
            mo23482e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C6141h mo23481d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map<String, String> mo23482e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C6142a mo23483f(Map<String, String> map);

        /* renamed from: g */
        public abstract C6142a mo23484g(Integer num);

        /* renamed from: h */
        public abstract C6142a mo23485h(C6140g gVar);

        /* renamed from: i */
        public abstract C6142a mo23486i(long j);

        /* renamed from: j */
        public abstract C6142a mo23487j(String str);

        /* renamed from: k */
        public abstract C6142a mo23488k(long j);
    }

    /* renamed from: a */
    public static C6142a m26951a() {
        return new C6126a.C6128b().mo23483f(new HashMap());
    }

    /* renamed from: b */
    public final String mo23522b(String str) {
        String str2 = mo23472c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo23472c();

    /* renamed from: d */
    public abstract Integer mo23473d();

    /* renamed from: e */
    public abstract C6140g mo23474e();

    /* renamed from: f */
    public abstract long mo23476f();

    /* renamed from: g */
    public final int mo23523g(String str) {
        String str2 = mo23472c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo23524h(String str) {
        String str2 = mo23472c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> mo23525i() {
        return Collections.unmodifiableMap(mo23472c());
    }

    /* renamed from: j */
    public abstract String mo23478j();

    /* renamed from: k */
    public abstract long mo23479k();

    /* renamed from: l */
    public C6142a mo23526l() {
        return new C6126a.C6128b().mo23487j(mo23478j()).mo23484g(mo23473d()).mo23485h(mo23474e()).mo23486i(mo23476f()).mo23488k(mo23479k()).mo23483f(new HashMap(mo23472c()));
    }
}
