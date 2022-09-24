package com.google.firebase.iid;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p201d7.C10507d;
import p212g7.C10568a;
import p262w6.C11086c;
import p268y6.C11114d;
import p268y6.C11125i;
import p268y6.C11133q;

@Keep
public final class Registrar implements C11125i {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C10417a implements C10568a {

        /* renamed from: a */
        private final FirebaseInstanceId f48845a;

        public C10417a(FirebaseInstanceId firebaseInstanceId) {
            this.f48845a = firebaseInstanceId;
        }
    }

    @Keep
    public final List<C11114d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new C11114d[]{C11114d.m49620c(cls).mo43400b(C11133q.m49699h(C11086c.class)).mo43400b(C11133q.m49699h(C10507d.class)).mo43404f(C10420b.f48851a).mo43401c().mo43402d(), C11114d.m49620c(C10568a.class).mo43400b(C11133q.m49699h(cls)).mo43404f(C10422c.f48853a).mo43402d()});
    }
}
