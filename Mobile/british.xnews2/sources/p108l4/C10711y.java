package p108l4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.common.internal.C4604n;
import p108l4.C10657a;
import p243q4.C10941k0;

/* renamed from: l4.y */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
final class C10711y extends C7191a.C7192a<C10941k0, C10657a.C10660c> {
    C10711y() {
    }

    public final /* bridge */ /* synthetic */ C7191a.C7201f buildClient(Context context, Looper looper, C4601e eVar, Object obj, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        C10657a.C10660c cVar2 = (C10657a.C10660c) obj;
        C4604n.m20099l(cVar2, "Setting the API options is required.");
        return new C10941k0(context, looper, eVar, cVar2.f49246b, (long) cVar2.f49249e, cVar2.f49248d, cVar2.f49250f, bVar, cVar);
    }
}
