package p109l4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.internal.cast.C8447b0;
import p109l4.C10667c;

/* renamed from: l4.q0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10699q0 extends C7191a.C7192a<C8447b0, C10667c.C10668a> {
    C10699q0() {
    }

    public final /* bridge */ /* synthetic */ C7191a.C7201f buildClient(Context context, Looper looper, C4601e eVar, Object obj, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        C10667c.C10668a aVar = (C10667c.C10668a) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("configuration", aVar.f49264d);
        return new C8447b0(context, looper, eVar, aVar.f49262b, bundle, aVar.f49263c, bVar, cVar);
    }
}
