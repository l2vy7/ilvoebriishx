package p243q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: q4.s */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public class C10949s extends C10925c0 {

    /* renamed from: d */
    private final List<C10948r> f49899d = Collections.synchronizedList(new ArrayList());

    public C10949s(String str, String str2, String str3) {
        super(str, "MediaControlChannel", (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo43255f() {
        synchronized (this.f49899d) {
            for (C10948r e : this.f49899d) {
                e.mo43253e(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final List<C10948r> mo43256g() {
        return this.f49899d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo43257h(C10948r rVar) {
        this.f49899d.add(rVar);
    }
}
