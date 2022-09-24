package p109l4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import p109l4.C10657a;
import p244q4.C10939j0;

/* renamed from: l4.m0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10691m0 extends C7191a.C7192a<C10939j0, C10657a.C10660c> {
    C10691m0() {
    }

    public final /* bridge */ /* synthetic */ C7191a.C7201f buildClient(Context context, Looper looper, C4601e eVar, Object obj, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        C10657a.C10660c cVar2 = (C10657a.C10660c) obj;
        C4604n.m20099l(cVar2, "Setting the API options is required.");
        return new C10939j0(context, looper, eVar, cVar2.f49246b, (long) cVar2.f49249e, cVar2.f49247c, cVar2.f49248d, bVar, cVar);
    }
}
