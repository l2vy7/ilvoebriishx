package p108l4;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.internal.cast.C8831z;
import com.google.android.gms.tasks.Task;
import p243q4.C10922b;
import p243q4.C10936i;

@TargetApi(19)
/* renamed from: l4.e */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C10673e extends C4591e<C7191a.C7195d.C7199d> {

    /* renamed from: c */
    private static final C7191a.C7192a<C8831z, C7191a.C7195d.C7199d> f49269c;

    /* renamed from: d */
    private static final C7191a<C7191a.C7195d.C7199d> f49270d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10922b f49271a = new C10922b("CastRemoteDisplay");

    /* renamed from: b */
    private VirtualDisplay f49272b;

    static {
        C10703s0 s0Var = new C10703s0();
        f49269c = s0Var;
        f49270d = new C7191a<>("CastRemoteDisplay.API", s0Var, C10936i.f49824d);
    }

    C10673e(Context context) {
        super(context, f49270d, C7191a.C7195d.f28897b0, C4591e.C4592a.f19970c);
    }

    /* renamed from: i */
    static /* synthetic */ void m48494i(C10673e eVar) {
        VirtualDisplay virtualDisplay = eVar.f49272b;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                C10922b bVar = eVar.f49271a;
                int displayId = eVar.f49272b.getDisplay().getDisplayId();
                StringBuilder sb = new StringBuilder(38);
                sb.append("releasing virtual display: ");
                sb.append(displayId);
                bVar.mo43190a(sb.toString(), new Object[0]);
            }
            VirtualDisplay virtualDisplay2 = eVar.f49272b;
            if (virtualDisplay2 != null) {
                virtualDisplay2.release();
                eVar.f49272b = null;
            }
        }
    }

    @RecentlyNonNull
    /* renamed from: g */
    public Task<Void> mo42811g() {
        return doWrite(C7310t.m29801a().mo29941e(8402).mo29938b(new C10701r0(this)).mo29937a());
    }
}
