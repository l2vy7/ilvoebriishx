package p228k7;

import com.google.auto.value.AutoValue;
import p228k7.C10649a;
import p228k7.C10653c;

@AutoValue
/* renamed from: k7.d */
/* compiled from: PersistedInstallationEntry */
public abstract class C10655d {

    /* renamed from: a */
    public static C10655d f49242a = m48446a().mo42771a();

    @AutoValue.Builder
    /* renamed from: k7.d$a */
    /* compiled from: PersistedInstallationEntry */
    public static abstract class C10656a {
        /* renamed from: a */
        public abstract C10655d mo42771a();

        /* renamed from: b */
        public abstract C10656a mo42772b(String str);

        /* renamed from: c */
        public abstract C10656a mo42773c(long j);

        /* renamed from: d */
        public abstract C10656a mo42774d(String str);

        /* renamed from: e */
        public abstract C10656a mo42775e(String str);

        /* renamed from: f */
        public abstract C10656a mo42776f(String str);

        /* renamed from: g */
        public abstract C10656a mo42777g(C10653c.C10654a aVar);

        /* renamed from: h */
        public abstract C10656a mo42778h(long j);
    }

    /* renamed from: a */
    public static C10656a m48446a() {
        return new C10649a.C10651b().mo42778h(0).mo42777g(C10653c.C10654a.ATTEMPT_MIGRATION).mo42773c(0);
    }

    /* renamed from: b */
    public abstract String mo42760b();

    /* renamed from: c */
    public abstract long mo42761c();

    /* renamed from: d */
    public abstract String mo42762d();

    /* renamed from: e */
    public abstract String mo42763e();

    /* renamed from: f */
    public abstract String mo42765f();

    /* renamed from: g */
    public abstract C10653c.C10654a mo42766g();

    /* renamed from: h */
    public abstract long mo42767h();

    /* renamed from: i */
    public boolean mo42783i() {
        return mo42766g() == C10653c.C10654a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo42784j() {
        return mo42766g() == C10653c.C10654a.NOT_GENERATED || mo42766g() == C10653c.C10654a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo42785k() {
        return mo42766g() == C10653c.C10654a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo42786l() {
        return mo42766g() == C10653c.C10654a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo42787m() {
        return mo42766g() == C10653c.C10654a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract C10656a mo42769n();

    /* renamed from: o */
    public C10655d mo42788o(String str, long j, long j2) {
        return mo42769n().mo42772b(str).mo42773c(j).mo42778h(j2).mo42771a();
    }

    /* renamed from: p */
    public C10655d mo42789p() {
        return mo42769n().mo42772b((String) null).mo42771a();
    }

    /* renamed from: q */
    public C10655d mo42790q(String str) {
        return mo42769n().mo42775e(str).mo42777g(C10653c.C10654a.REGISTER_ERROR).mo42771a();
    }

    /* renamed from: r */
    public C10655d mo42791r() {
        return mo42769n().mo42777g(C10653c.C10654a.NOT_GENERATED).mo42771a();
    }

    /* renamed from: s */
    public C10655d mo42792s(String str, String str2, long j, String str3, long j2) {
        return mo42769n().mo42774d(str).mo42777g(C10653c.C10654a.REGISTERED).mo42772b(str3).mo42776f(str2).mo42773c(j2).mo42778h(j).mo42771a();
    }

    /* renamed from: t */
    public C10655d mo42793t(String str) {
        return mo42769n().mo42774d(str).mo42777g(C10653c.C10654a.UNREGISTERED).mo42771a();
    }
}
