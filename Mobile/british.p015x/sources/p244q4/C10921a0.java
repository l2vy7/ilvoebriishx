package p244q4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.tasks.Task;
import p109l4.C10690m;

/* renamed from: q4.a0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10921a0 extends C4591e<C7191a.C7195d.C7199d> {

    /* renamed from: a */
    private static final C7191a.C7202g<C10923b0> f49797a;

    /* renamed from: b */
    private static final C7191a.C7192a<C10923b0, C7191a.C7195d.C7199d> f49798b;

    /* renamed from: c */
    private static final C7191a<C7191a.C7195d.C7199d> f49799c;

    static {
        C7191a.C7202g<C10923b0> gVar = new C7191a.C7202g<>();
        f49797a = gVar;
        C10953w wVar = new C10953w();
        f49798b = wVar;
        f49799c = new C7191a<>("CastApi.API", wVar, gVar);
    }

    public C10921a0(Context context) {
        super(context, f49799c, C7191a.C7195d.f28897b0, C4591e.C4592a.f19970c);
    }

    /* renamed from: g */
    public final Task<Bundle> mo43187g(String[] strArr) {
        return doRead(C7310t.m29801a().mo29938b(new C10950t(this, strArr)).mo29940d(C10690m.f49305d).mo29939c(false).mo29941e(8425).mo29937a());
    }

    /* renamed from: h */
    public final Task<Bundle> mo43188h(String[] strArr) {
        return doRead(C7310t.m29801a().mo29938b(new C10951u(this, strArr)).mo29940d(C10690m.f49308g).mo29939c(false).mo29941e(8426).mo29937a());
    }

    /* renamed from: i */
    public final Task<Bundle> mo43189i(String[] strArr) {
        return doRead(C7310t.m29801a().mo29938b(new C10952v(this, strArr)).mo29940d(C10690m.f49309h).mo29939c(false).mo29941e(8427).mo29937a());
    }
}
