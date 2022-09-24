package p114m4;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.cast.C4639n0;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: m4.r0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final /* synthetic */ class C10780r0 implements OnSuccessListener {

    /* renamed from: a */
    private final C5758b f49514a;

    /* renamed from: b */
    private final C4639n0 f49515b;

    /* renamed from: c */
    private final SharedPreferences f49516c;

    C10780r0(C5758b bVar, C4639n0 n0Var, SharedPreferences sharedPreferences) {
        this.f49514a = bVar;
        this.f49515b = n0Var;
        this.f49516c = sharedPreferences;
    }

    public final void onSuccess(Object obj) {
        this.f49514a.mo22538i(this.f49515b, this.f49516c, (Bundle) obj);
    }
}
