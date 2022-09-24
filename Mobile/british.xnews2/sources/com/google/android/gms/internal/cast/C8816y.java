package com.google.android.gms.internal.cast;

import android.hardware.display.VirtualDisplay;
import com.google.android.gms.common.api.C7191a;
import p108l4.C10671d;
import p243q4.C10922b;

@Deprecated
/* renamed from: com.google.android.gms.internal.cast.y */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C8816y implements C10671d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C10922b f44213d = new C10922b("CastRemoteDisplayApiImpl");

    /* renamed from: a */
    private final C7191a<?> f44214a;

    /* renamed from: b */
    private VirtualDisplay f44215b;

    /* renamed from: c */
    private final C8531g0 f44216c = new C8800x(this);

    public C8816y(C7191a aVar) {
        this.f44214a = aVar;
    }

    /* renamed from: b */
    static /* synthetic */ void m41425b(C8816y yVar) {
        VirtualDisplay virtualDisplay = yVar.f44215b;
        if (virtualDisplay != null) {
            if (virtualDisplay.getDisplay() != null) {
                C10922b bVar = f44213d;
                int displayId = virtualDisplay.getDisplay().getDisplayId();
                StringBuilder sb = new StringBuilder(38);
                sb.append("releasing virtual display: ");
                sb.append(displayId);
                bVar.mo43190a(sb.toString(), new Object[0]);
            }
            virtualDisplay.release();
        }
        yVar.f44215b = null;
    }
}
