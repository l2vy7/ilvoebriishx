package p263x5;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4601e;
import com.google.android.gms.signin.internal.C9986a;

/* renamed from: x5.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C11096b extends C7191a.C7192a<C9986a, C11095a> {
    C11096b() {
    }

    public final /* bridge */ /* synthetic */ C7191a.C7201f buildClient(Context context, Looper looper, C4601e eVar, Object obj, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        C11095a aVar = (C11095a) obj;
        return new C9986a(context, looper, true, eVar, C9986a.m45578e(eVar), bVar, cVar);
    }
}
