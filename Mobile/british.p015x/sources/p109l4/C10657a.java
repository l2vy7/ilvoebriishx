package p109l4;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7341k;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7408m;
import java.util.UUID;
import p244q4.C10936i;
import p244q4.C10939j0;

/* renamed from: l4.a */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10657a {
    @RecentlyNonNull

    /* renamed from: a */
    public static final C7191a<C10660c> f49243a;
    @RecentlyNonNull

    /* renamed from: b */
    public static final C10659b f49244b = new C10693n0();

    /* renamed from: c */
    static final C7191a.C7192a<C10939j0, C10660c> f49245c;

    /* renamed from: l4.a$a */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public interface C10658a extends C7341k {
        @RecentlyNullable
        /* renamed from: Z */
        ApplicationMetadata mo42794Z();

        @RecentlyNullable
        String getSessionId();

        /* renamed from: j */
        boolean mo42796j();

        @RecentlyNullable
        /* renamed from: u */
        String mo42797u();
    }

    @Deprecated
    /* renamed from: l4.a$b */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public interface C10659b {
    }

    /* renamed from: l4.a$c */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static final class C10660c implements C7191a.C7195d.C7198c {

        /* renamed from: b */
        final CastDevice f49246b;

        /* renamed from: c */
        final C10662d f49247c;

        /* renamed from: d */
        final Bundle f49248d;

        /* renamed from: e */
        final int f49249e;

        /* renamed from: f */
        final String f49250f = UUID.randomUUID().toString();

        /* renamed from: l4.a$c$a */
        /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
        public static final class C10661a {

            /* renamed from: a */
            CastDevice f49251a;

            /* renamed from: b */
            C10662d f49252b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public int f49253c = 0;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public Bundle f49254d;

            public C10661a(@RecentlyNonNull CastDevice castDevice, @RecentlyNonNull C10662d dVar) {
                C4604n.m20099l(castDevice, "CastDevice parameter cannot be null");
                C4604n.m20099l(dVar, "CastListener parameter cannot be null");
                this.f49251a = castDevice;
                this.f49252b = dVar;
            }

            @RecentlyNonNull
            /* renamed from: a */
            public C10660c mo42800a() {
                return new C10660c(this, (C10691m0) null);
            }

            @RecentlyNonNull
            /* renamed from: b */
            public final C10661a mo42801b(@RecentlyNonNull Bundle bundle) {
                this.f49254d = bundle;
                return this;
            }
        }

        /* synthetic */ C10660c(C10661a aVar, C10691m0 m0Var) {
            this.f49246b = aVar.f49251a;
            this.f49247c = aVar.f49252b;
            this.f49249e = aVar.f49253c;
            this.f49248d = aVar.f49254d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
            if (r1 == r3) goto L_0x0059;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 1
                if (r8 != r7) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r8 instanceof p109l4.C10657a.C10660c
                r2 = 0
                if (r1 != 0) goto L_0x000a
                return r2
            L_0x000a:
                l4.a$c r8 = (p109l4.C10657a.C10660c) r8
                com.google.android.gms.cast.CastDevice r1 = r7.f49246b
                com.google.android.gms.cast.CastDevice r3 = r8.f49246b
                boolean r1 = com.google.android.gms.common.internal.C7408m.m30028a(r1, r3)
                if (r1 == 0) goto L_0x006a
                android.os.Bundle r1 = r7.f49248d
                android.os.Bundle r3 = r8.f49248d
                if (r1 == 0) goto L_0x0057
                if (r3 != 0) goto L_0x001f
                goto L_0x0057
            L_0x001f:
                int r4 = r1.size()
                int r5 = r3.size()
                if (r4 == r5) goto L_0x002a
                goto L_0x006a
            L_0x002a:
                java.util.Set r4 = r1.keySet()
                java.util.Set r5 = r3.keySet()
                boolean r5 = r4.containsAll(r5)
                if (r5 == 0) goto L_0x006a
                java.util.Iterator r4 = r4.iterator()
            L_0x003c:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0059
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r1.get(r5)
                java.lang.Object r5 = r3.get(r5)
                boolean r5 = com.google.android.gms.common.internal.C7408m.m30028a(r6, r5)
                if (r5 != 0) goto L_0x003c
                goto L_0x006a
            L_0x0057:
                if (r1 != r3) goto L_0x006a
            L_0x0059:
                int r1 = r7.f49249e
                int r3 = r8.f49249e
                if (r1 != r3) goto L_0x006a
                java.lang.String r1 = r7.f49250f
                java.lang.String r8 = r8.f49250f
                boolean r8 = com.google.android.gms.common.internal.C7408m.m30028a(r1, r8)
                if (r8 == 0) goto L_0x006a
                return r0
            L_0x006a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p109l4.C10657a.C10660c.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return C7408m.m30029b(this.f49246b, this.f49248d, Integer.valueOf(this.f49249e), this.f49250f);
        }
    }

    /* renamed from: l4.a$d */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public static class C10662d {
        /* renamed from: a */
        public void mo42802a(int i) {
        }

        /* renamed from: b */
        public void mo42803b(int i) {
        }

        /* renamed from: c */
        public void mo42804c(ApplicationMetadata applicationMetadata) {
        }

        /* renamed from: d */
        public void mo42805d() {
        }

        /* renamed from: e */
        public void mo42806e(int i) {
        }

        /* renamed from: f */
        public void mo36584f() {
        }
    }

    /* renamed from: l4.a$e */
    /* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
    public interface C10663e {
        /* renamed from: a */
        void mo17836a(@RecentlyNonNull CastDevice castDevice, @RecentlyNonNull String str, @RecentlyNonNull String str2);
    }

    static {
        C10691m0 m0Var = new C10691m0();
        f49245c = m0Var;
        f49243a = new C7191a<>("Cast.API", m0Var, C10936i.f49821a);
    }

    /* renamed from: a */
    public static C10697p0 m48474a(Context context, C10660c cVar) {
        return new C5675h0(context, cVar);
    }
}
