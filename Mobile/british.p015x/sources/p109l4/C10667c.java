package p109l4;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.internal.cast.C8447b0;
import com.google.android.gms.internal.cast.C8816y;
import p244q4.C10936i;

/* renamed from: l4.c */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10667c {
    @RecentlyNonNull
    @Deprecated

    /* renamed from: a */
    public static final C7191a<C10668a> f49259a;
    @RecentlyNonNull
    @Deprecated

    /* renamed from: b */
    public static final C10671d f49260b;

    /* renamed from: c */
    private static final C7191a.C7192a<C8447b0, C10668a> f49261c;

    @Deprecated
    /* renamed from: l4.c$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static final class C10668a implements C7191a.C7195d.C7198c {

        /* renamed from: b */
        final CastDevice f49262b;

        /* renamed from: c */
        final C10669b f49263c;

        /* renamed from: d */
        final int f49264d;
    }

    @Deprecated
    /* renamed from: l4.c$b */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public interface C10669b {
    }

    static {
        C10699q0 q0Var = new C10699q0();
        f49261c = q0Var;
        C7191a<C10668a> aVar = new C7191a<>("CastRemoteDisplay.API", q0Var, C10936i.f49823c);
        f49259a = aVar;
        f49260b = new C8816y(aVar);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C10673e m48492a(@RecentlyNonNull Context context) {
        return new C10673e(context);
    }
}
