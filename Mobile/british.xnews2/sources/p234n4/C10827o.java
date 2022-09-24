package p234n4;

import android.content.Intent;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import p108l4.C10678g;

/* renamed from: n4.o */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
final class C10827o extends MediaSessionCompat.C0158b {

    /* renamed from: f */
    final /* synthetic */ C10828p f49574f;

    C10827o(C10828p pVar) {
        this.f49574f = pVar;
    }

    /* renamed from: g */
    public final boolean mo457g(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
            return true;
        }
        this.f49574f.f49584i.mo17829N();
        return true;
    }

    /* renamed from: h */
    public final void mo458h() {
        this.f49574f.f49584i.mo17829N();
    }

    /* renamed from: i */
    public final void mo459i() {
        this.f49574f.f49584i.mo17829N();
    }

    /* renamed from: s */
    public final void mo469s(long j) {
        C10678g.C10679a aVar = new C10678g.C10679a();
        aVar.mo42832d(j);
        this.f49574f.f49584i.mo17826K(aVar.mo42829a());
    }
}
