package p217i5;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: i5.p */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C10601p extends C4591e<C7191a.C7195d.C7199d> implements AppSetIdClient {

    /* renamed from: c */
    private static final C7191a.C7202g<C10589d> f49145c;

    /* renamed from: d */
    private static final C7191a.C7192a<C10589d, C7191a.C7195d.C7199d> f49146d;

    /* renamed from: e */
    private static final C7191a<C7191a.C7195d.C7199d> f49147e;

    /* renamed from: a */
    private final Context f49148a;

    /* renamed from: b */
    private final C7353b f49149b;

    static {
        C7191a.C7202g<C10589d> gVar = new C7191a.C7202g<>();
        f49145c = gVar;
        C10599n nVar = new C10599n();
        f49146d = nVar;
        f49147e = new C7191a<>("AppSet.API", nVar, gVar);
    }

    C10601p(Context context, C7353b bVar) {
        super(context, f49147e, C7191a.C7195d.f28897b0, C4591e.C4592a.f19970c);
        this.f49148a = context;
        this.f49149b = bVar;
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        if (this.f49149b.mo29709j(this.f49148a, 212800000) != 0) {
            return Tasks.forException(new C7203b(new Status(17)));
        }
        return doRead(C7310t.m29801a().mo29940d(zze.zza).mo29938b(new C10598m(this)).mo29939c(false).mo29941e(27601).mo29937a());
    }
}
