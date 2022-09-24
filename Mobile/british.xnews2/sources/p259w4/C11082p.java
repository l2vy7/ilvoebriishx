package p259w4;

import android.content.Context;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.common.internal.C7423r;
import com.google.android.gms.common.internal.C7426s;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import p228l5.C10716d;

/* renamed from: w4.p */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C11082p extends C4591e<C7426s> implements C7423r {

    /* renamed from: a */
    private static final C7191a.C7202g<C11083q> f50018a;

    /* renamed from: b */
    private static final C7191a.C7192a<C11083q, C7426s> f50019b;

    /* renamed from: c */
    private static final C7191a<C7426s> f50020c;

    /* renamed from: d */
    public static final /* synthetic */ int f50021d = 0;

    static {
        C7191a.C7202g<C11083q> gVar = new C7191a.C7202g<>();
        f50018a = gVar;
        C11081o oVar = new C11081o();
        f50019b = oVar;
        f50020c = new C7191a<>("ClientTelemetry.API", oVar, gVar);
    }

    public C11082p(Context context, C7426s sVar) {
        super(context, f50020c, sVar, C4591e.C4592a.f19970c);
    }

    /* renamed from: b */
    public final Task<Void> mo30157b(TelemetryData telemetryData) {
        C7310t.C7311a a = C7310t.m29801a();
        a.mo29940d(C10716d.f49343a);
        a.mo29939c(false);
        a.mo29938b(new C11080n(telemetryData));
        return doBestEffortWrite(a.mo29937a());
    }
}
