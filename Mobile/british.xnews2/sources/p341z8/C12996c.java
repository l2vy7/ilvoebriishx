package p341z8;

import java.util.Locale;
import p307g8.C12713a0;
import p307g8.C12717c0;
import p307g8.C12733q;
import p307g8.C12734r;
import p310h9.C12769h;
import p314j9.C12811e;

/* renamed from: z8.c */
/* compiled from: DefaultHttpResponseFactory */
public class C12996c implements C12734r {

    /* renamed from: a */
    protected final C12713a0 f55753a;

    public C12996c(C12713a0 a0Var) {
        if (a0Var != null) {
            this.f55753a = a0Var;
            return;
        }
        throw new IllegalArgumentException("Reason phrase catalog must not be null.");
    }

    /* renamed from: a */
    public C12733q mo47807a(C12717c0 c0Var, C12811e eVar) {
        if (c0Var != null) {
            return new C12769h(c0Var, this.f55753a, mo48178b(eVar));
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Locale mo48178b(C12811e eVar) {
        return Locale.getDefault();
    }

    public C12996c() {
        this(C12997d.f55754a);
    }
}
