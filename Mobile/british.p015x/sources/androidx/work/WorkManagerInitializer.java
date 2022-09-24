package androidx.work;

import android.content.Context;
import androidx.work.C1419b;
import java.util.Collections;
import java.util.List;
import p101k1.C5551a;

public final class WorkManagerInitializer implements C5551a<C1503x> {

    /* renamed from: a */
    private static final String f6266a = C1483m.m7773f("WrkMgrInitializer");

    /* renamed from: a */
    public List<Class<? extends C5551a<?>>> mo6838a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C1503x mo6839b(Context context) {
        C1483m.m7771c().mo7013a(f6266a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C1503x.m7803l(context, new C1419b.C1421b().mo6867a());
        return C1503x.m7802j(context);
    }
}
