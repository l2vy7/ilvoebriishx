package p205f4;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C7191a;
import p208g4.C10554a;
import p212h4.C10569a;
import p216i4.C10582a;
import p220j4.C10612f;
import p220j4.C10613g;
import p225k5.C10642d;
import p225k5.C10643e;

/* renamed from: f4.a */
public final class C10521a {

    /* renamed from: a */
    public static final C7191a.C7202g<C10643e> f49050a;

    /* renamed from: b */
    public static final C7191a.C7202g<C10613g> f49051b;

    /* renamed from: c */
    private static final C7191a.C7192a<C10643e, C10522a> f49052c;

    /* renamed from: d */
    private static final C7191a.C7192a<C10613g, GoogleSignInOptions> f49053d;
    @Deprecated

    /* renamed from: e */
    public static final C7191a<C10525c> f49054e = C10524b.f49066c;

    /* renamed from: f */
    public static final C7191a<C10522a> f49055f;

    /* renamed from: g */
    public static final C7191a<GoogleSignInOptions> f49056g;
    @Deprecated

    /* renamed from: h */
    public static final C10569a f49057h = C10524b.f49067d;

    /* renamed from: i */
    public static final C10554a f49058i = new C10642d();

    /* renamed from: j */
    public static final C10582a f49059j = new C10612f();

    @Deprecated
    /* renamed from: f4.a$a */
    public static class C10522a implements C7191a.C7195d.C7198c, C7191a.C7195d {

        /* renamed from: d */
        private static final C10522a f49060d = new C10523a().mo42654a();

        /* renamed from: b */
        private final String f49061b = null;

        /* renamed from: c */
        private final boolean f49062c;

        @Deprecated
        /* renamed from: f4.a$a$a */
        public static class C10523a {

            /* renamed from: a */
            protected Boolean f49063a = Boolean.FALSE;

            /* renamed from: a */
            public C10522a mo42654a() {
                return new C10522a(this);
            }
        }

        public C10522a(C10523a aVar) {
            this.f49062c = aVar.f49063a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle mo42653a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putBoolean("force_save_dialog", this.f49062c);
            return bundle;
        }
    }

    static {
        C7191a.C7202g<C10643e> gVar = new C7191a.C7202g<>();
        f49050a = gVar;
        C7191a.C7202g<C10613g> gVar2 = new C7191a.C7202g<>();
        f49051b = gVar2;
        C10527e eVar = new C10527e();
        f49052c = eVar;
        C10528f fVar = new C10528f();
        f49053d = fVar;
        f49055f = new C7191a<>("Auth.CREDENTIALS_API", eVar, gVar);
        f49056g = new C7191a<>("Auth.GOOGLE_SIGN_IN_API", fVar, gVar2);
    }
}
