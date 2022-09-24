package com.appnext.p021a;

import android.content.Context;
import android.widget.VideoView;

/* renamed from: com.appnext.a.a */
public final class C2983a extends VideoView {

    /* renamed from: ij */
    private C2984a f11964ij;

    /* renamed from: com.appnext.a.a$a */
    public interface C2984a {
        /* renamed from: bb */
        void mo10094bb();

        void onPause();
    }

    public C2983a(Context context) {
        super(context);
    }

    public final void pause() {
        super.pause();
        C2984a aVar = this.f11964ij;
        if (aVar != null) {
            aVar.onPause();
        }
    }

    public final void setPlayPauseListener(C2984a aVar) {
        this.f11964ij = aVar;
    }

    public final void start() {
        super.start();
        C2984a aVar = this.f11964ij;
        if (aVar != null) {
            aVar.mo10094bb();
        }
    }
}
