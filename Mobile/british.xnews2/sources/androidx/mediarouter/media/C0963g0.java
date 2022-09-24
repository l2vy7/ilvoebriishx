package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.view.Display;
import androidx.mediarouter.media.C0924a0;
import androidx.mediarouter.media.C0983l;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C0996n;
import androidx.mediarouter.media.C1003s;
import androidx.mediarouter.media.C1029y;
import androidx.mediarouter.media.C1038z;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p011b1.C1542j;
import p017c1.C2639f;
import p017c1.C2642i;

/* renamed from: androidx.mediarouter.media.g0 */
/* compiled from: SystemMediaRouteProvider */
abstract class C0963g0 extends C0985m {

    /* renamed from: androidx.mediarouter.media.g0$a */
    /* compiled from: SystemMediaRouteProvider */
    private static class C0964a extends C0970d {
        public C0964a(Context context, C0974f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo4544P(C0965b.C0967b bVar, C0983l.C0984a aVar) {
            super.mo4544P(bVar, aVar);
            aVar.mo4635i(C2642i.m9222a(bVar.f4463a));
        }
    }

    /* renamed from: androidx.mediarouter.media.g0$b */
    /* compiled from: SystemMediaRouteProvider */
    static class C0965b extends C0963g0 implements C1029y.C1030a, C1029y.C1036g {

        /* renamed from: v */
        private static final ArrayList<IntentFilter> f4448v;

        /* renamed from: w */
        private static final ArrayList<IntentFilter> f4449w;

        /* renamed from: j */
        private final C0974f f4450j;

        /* renamed from: k */
        protected final Object f4451k;

        /* renamed from: l */
        protected final Object f4452l;

        /* renamed from: m */
        protected final Object f4453m;

        /* renamed from: n */
        protected final Object f4454n;

        /* renamed from: o */
        protected int f4455o;

        /* renamed from: p */
        protected boolean f4456p;

        /* renamed from: q */
        protected boolean f4457q;

        /* renamed from: r */
        protected final ArrayList<C0967b> f4458r = new ArrayList<>();

        /* renamed from: s */
        protected final ArrayList<C0968c> f4459s = new ArrayList<>();

        /* renamed from: t */
        private C1029y.C1034e f4460t;

        /* renamed from: u */
        private C1029y.C1032c f4461u;

        /* renamed from: androidx.mediarouter.media.g0$b$a */
        /* compiled from: SystemMediaRouteProvider */
        protected static final class C0966a extends C0985m.C0995e {

            /* renamed from: a */
            private final Object f4462a;

            public C0966a(Object obj) {
                this.f4462a = obj;
            }

            /* renamed from: g */
            public void mo4493g(int i) {
                C1029y.C1033d.m5331i(this.f4462a, i);
            }

            /* renamed from: j */
            public void mo4496j(int i) {
                C1029y.C1033d.m5332j(this.f4462a, i);
            }
        }

        /* renamed from: androidx.mediarouter.media.g0$b$b */
        /* compiled from: SystemMediaRouteProvider */
        protected static final class C0967b {

            /* renamed from: a */
            public final Object f4463a;

            /* renamed from: b */
            public final String f4464b;

            /* renamed from: c */
            public C0983l f4465c;

            public C0967b(Object obj, String str) {
                this.f4463a = obj;
                this.f4464b = str;
            }
        }

        /* renamed from: androidx.mediarouter.media.g0$b$c */
        /* compiled from: SystemMediaRouteProvider */
        protected static final class C0968c {

            /* renamed from: a */
            public final C1003s.C1022i f4466a;

            /* renamed from: b */
            public final Object f4467b;

            public C0968c(C1003s.C1022i iVar, Object obj) {
                this.f4466a = iVar;
                this.f4467b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f4448v = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            f4449w = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public C0965b(Context context, C0974f fVar) {
            super(context);
            this.f4450j = fVar;
            Object g = C1029y.m5308g(context);
            this.f4451k = g;
            this.f4452l = mo4545H();
            this.f4453m = mo4546I();
            this.f4454n = C1029y.m5305d(g, context.getResources().getString(C1542j.mr_user_route_category_name), false);
            m4922U();
        }

        /* renamed from: F */
        private boolean m4920F(Object obj) {
            if (mo4552O(obj) != null || mo4547J(obj) >= 0) {
                return false;
            }
            C0967b bVar = new C0967b(obj, m4921G(obj));
            mo4556T(bVar);
            this.f4458r.add(bVar);
            return true;
        }

        /* renamed from: G */
        private String m4921G(Object obj) {
            String str;
            if (mo4550M() == obj) {
                str = "DEFAULT_ROUTE";
            } else {
                str = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(mo4551N(obj).hashCode())});
            }
            if (mo4548K(str) < 0) {
                return str;
            }
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str, Integer.valueOf(i)});
                if (mo4548K(format) < 0) {
                    return format;
                }
                i++;
            }
        }

        /* renamed from: U */
        private void m4922U() {
            mo4555S();
            boolean z = false;
            for (Object F : C1029y.m5309h(this.f4451k)) {
                z |= m4920F(F);
            }
            if (z) {
                mo4553Q();
            }
        }

        /* renamed from: B */
        public void mo4540B(C1003s.C1022i iVar) {
            if (iVar.mo4812r() != this) {
                Object e = C1029y.m5306e(this.f4451k, this.f4454n);
                C0968c cVar = new C0968c(iVar, e);
                C1029y.C1033d.m5333k(e, cVar);
                C1029y.C1035f.m5340f(e, this.f4453m);
                mo4557V(cVar);
                this.f4459s.add(cVar);
                C1029y.m5303b(this.f4451k, e);
                return;
            }
            int J = mo4547J(C1029y.m5310i(this.f4451k, 8388611));
            if (J >= 0 && this.f4458r.get(J).f4464b.equals(iVar.mo4799e())) {
                iVar.mo4791I();
            }
        }

        /* renamed from: C */
        public void mo4541C(C1003s.C1022i iVar) {
            int L;
            if (iVar.mo4812r() != this && (L = mo4549L(iVar)) >= 0) {
                mo4557V(this.f4459s.get(L));
            }
        }

        /* renamed from: D */
        public void mo4542D(C1003s.C1022i iVar) {
            int L;
            if (iVar.mo4812r() != this && (L = mo4549L(iVar)) >= 0) {
                C0968c remove = this.f4459s.remove(L);
                C1029y.C1033d.m5333k(remove.f4467b, (Object) null);
                C1029y.C1035f.m5340f(remove.f4467b, (Object) null);
                C1029y.m5312k(this.f4451k, remove.f4467b);
            }
        }

        /* renamed from: E */
        public void mo4543E(C1003s.C1022i iVar) {
            if (iVar.mo4786C()) {
                if (iVar.mo4812r() != this) {
                    int L = mo4549L(iVar);
                    if (L >= 0) {
                        mo4554R(this.f4459s.get(L).f4467b);
                        return;
                    }
                    return;
                }
                int K = mo4548K(iVar.mo4799e());
                if (K >= 0) {
                    mo4554R(this.f4458r.get(K).f4463a);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: H */
        public Object mo4545H() {
            return C1029y.m5304c(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: I */
        public Object mo4546I() {
            return C1029y.m5307f(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public int mo4547J(Object obj) {
            int size = this.f4458r.size();
            for (int i = 0; i < size; i++) {
                if (this.f4458r.get(i).f4463a == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public int mo4548K(String str) {
            int size = this.f4458r.size();
            for (int i = 0; i < size; i++) {
                if (this.f4458r.get(i).f4464b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public int mo4549L(C1003s.C1022i iVar) {
            int size = this.f4459s.size();
            for (int i = 0; i < size; i++) {
                if (this.f4459s.get(i).f4466a == iVar) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public Object mo4550M() {
            if (this.f4461u == null) {
                this.f4461u = new C1029y.C1032c();
            }
            return this.f4461u.mo4837a(this.f4451k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public String mo4551N(Object obj) {
            CharSequence a = C1029y.C1033d.m5323a(obj, mo4649n());
            return a != null ? a.toString() : "";
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public C0968c mo4552O(Object obj) {
            Object e = C1029y.C1033d.m5327e(obj);
            if (e instanceof C0968c) {
                return (C0968c) e;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo4544P(C0967b bVar, C0983l.C0984a aVar) {
            int d = C1029y.C1033d.m5326d(bVar.f4463a);
            if ((d & 1) != 0) {
                aVar.mo4628b(f4448v);
            }
            if ((d & 2) != 0) {
                aVar.mo4628b(f4449w);
            }
            aVar.mo4642p(C1029y.C1033d.m5325c(bVar.f4463a));
            aVar.mo4641o(C1029y.C1033d.m5324b(bVar.f4463a));
            aVar.mo4644r(C1029y.C1033d.m5328f(bVar.f4463a));
            aVar.mo4646t(C1029y.C1033d.m5330h(bVar.f4463a));
            aVar.mo4645s(C1029y.C1033d.m5329g(bVar.f4463a));
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public void mo4553Q() {
            C0996n.C0997a aVar = new C0996n.C0997a();
            int size = this.f4458r.size();
            for (int i = 0; i < size; i++) {
                aVar.mo4682a(this.f4458r.get(i).f4465c);
            }
            mo4655x(aVar.mo4684c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public void mo4554R(Object obj) {
            if (this.f4460t == null) {
                this.f4460t = new C1029y.C1034e();
            }
            this.f4460t.mo4838a(this.f4451k, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: S */
        public void mo4555S() {
            if (this.f4457q) {
                this.f4457q = false;
                C1029y.m5311j(this.f4451k, this.f4452l);
            }
            int i = this.f4455o;
            if (i != 0) {
                this.f4457q = true;
                C1029y.m5302a(this.f4451k, i, this.f4452l);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: T */
        public void mo4556T(C0967b bVar) {
            C0983l.C0984a aVar = new C0983l.C0984a(bVar.f4464b, mo4551N(bVar.f4463a));
            mo4544P(bVar, aVar);
            bVar.f4465c = aVar.mo4631e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public void mo4557V(C0968c cVar) {
            C1029y.C1035f.m5335a(cVar.f4467b, cVar.f4466a.mo4807m());
            C1029y.C1035f.m5337c(cVar.f4467b, cVar.f4466a.mo4809o());
            C1029y.C1035f.m5336b(cVar.f4467b, cVar.f4466a.mo4808n());
            C1029y.C1035f.m5339e(cVar.f4467b, cVar.f4466a.mo4813s());
            C1029y.C1035f.m5342h(cVar.f4467b, cVar.f4466a.mo4816u());
            C1029y.C1035f.m5341g(cVar.f4467b, cVar.f4466a.mo4814t());
        }

        /* renamed from: a */
        public void mo4558a(Object obj) {
            int J;
            if (mo4552O(obj) == null && (J = mo4547J(obj)) >= 0) {
                mo4556T(this.f4458r.get(J));
                mo4553Q();
            }
        }

        /* renamed from: b */
        public void mo4559b(int i, Object obj) {
        }

        /* renamed from: c */
        public void mo4535c(Object obj, int i) {
            C0968c O = mo4552O(obj);
            if (O != null) {
                O.f4466a.mo4790H(i);
            }
        }

        /* renamed from: d */
        public void mo4560d(Object obj) {
            int J;
            if (mo4552O(obj) == null && (J = mo4547J(obj)) >= 0) {
                this.f4458r.remove(J);
                mo4553Q();
            }
        }

        /* renamed from: e */
        public void mo4561e(int i, Object obj) {
            if (obj == C1029y.m5310i(this.f4451k, 8388611)) {
                C0968c O = mo4552O(obj);
                if (O != null) {
                    O.f4466a.mo4791I();
                    return;
                }
                int J = mo4547J(obj);
                if (J >= 0) {
                    this.f4450j.mo4570a(this.f4458r.get(J).f4464b);
                }
            }
        }

        /* renamed from: g */
        public void mo4562g(Object obj, Object obj2) {
        }

        /* renamed from: h */
        public void mo4563h(Object obj, Object obj2, int i) {
        }

        /* renamed from: i */
        public void mo4564i(Object obj) {
            if (m4920F(obj)) {
                mo4553Q();
            }
        }

        /* renamed from: j */
        public void mo4536j(Object obj, int i) {
            C0968c O = mo4552O(obj);
            if (O != null) {
                O.f4466a.mo4789G(i);
            }
        }

        /* renamed from: k */
        public void mo4565k(Object obj) {
            int J;
            if (mo4552O(obj) == null && (J = mo4547J(obj)) >= 0) {
                C0967b bVar = this.f4458r.get(J);
                int f = C1029y.C1033d.m5328f(obj);
                if (f != bVar.f4465c.mo4622u()) {
                    bVar.f4465c = new C0983l.C0984a(bVar.f4465c).mo4644r(f).mo4631e();
                    mo4553Q();
                }
            }
        }

        /* renamed from: t */
        public C0985m.C0995e mo4453t(String str) {
            int K = mo4548K(str);
            if (K >= 0) {
                return new C0966a(this.f4458r.get(K).f4463a);
            }
            return null;
        }

        /* renamed from: v */
        public void mo4456v(C2639f fVar) {
            boolean z;
            int i = 0;
            if (fVar != null) {
                List<String> e = fVar.mo9289d().mo4691e();
                int size = e.size();
                int i2 = 0;
                while (i < size) {
                    String str = e.get(i);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i2 |= 1;
                    } else {
                        i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                    }
                    i++;
                }
                z = fVar.mo9290e();
                i = i2;
            } else {
                z = false;
            }
            if (this.f4455o != i || this.f4456p != z) {
                this.f4455o = i;
                this.f4456p = z;
                m4922U();
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.g0$c */
    /* compiled from: SystemMediaRouteProvider */
    private static class C0969c extends C0965b implements C1038z.C1040b {

        /* renamed from: x */
        private C1038z.C1039a f4468x;

        /* renamed from: y */
        private C1038z.C1042d f4469y;

        public C0969c(Context context, C0974f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: H */
        public Object mo4545H() {
            return C1038z.m5345a(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo4544P(C0965b.C0967b bVar, C0983l.C0984a aVar) {
            super.mo4544P(bVar, aVar);
            if (!C1038z.C1043e.m5350b(bVar.f4463a)) {
                aVar.mo4636j(false);
            }
            if (mo4566W(bVar)) {
                aVar.mo4633g(1);
            }
            Display a = C1038z.C1043e.m5349a(bVar.f4463a);
            if (a != null) {
                aVar.mo4643q(a.getDisplayId());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: S */
        public void mo4555S() {
            super.mo4555S();
            if (this.f4468x == null) {
                this.f4468x = new C1038z.C1039a(mo4649n(), mo4652q());
            }
            this.f4468x.mo4841a(this.f4456p ? this.f4455o : 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4566W(C0965b.C0967b bVar) {
            if (this.f4469y == null) {
                this.f4469y = new C1038z.C1042d();
            }
            return this.f4469y.mo4844a(bVar.f4463a);
        }

        /* renamed from: f */
        public void mo4567f(Object obj) {
            int J = mo4547J(obj);
            if (J >= 0) {
                C0965b.C0967b bVar = this.f4458r.get(J);
                Display a = C1038z.C1043e.m5349a(obj);
                int displayId = a != null ? a.getDisplayId() : -1;
                if (displayId != bVar.f4465c.mo4619s()) {
                    bVar.f4465c = new C0983l.C0984a(bVar.f4465c).mo4643q(displayId).mo4631e();
                    mo4553Q();
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.g0$d */
    /* compiled from: SystemMediaRouteProvider */
    private static class C0970d extends C0969c {
        public C0970d(Context context, C0974f fVar) {
            super(context, fVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public Object mo4550M() {
            return C0924a0.m4773b(this.f4451k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo4544P(C0965b.C0967b bVar, C0983l.C0984a aVar) {
            super.mo4544P(bVar, aVar);
            CharSequence a = C0924a0.C0925a.m4774a(bVar.f4463a);
            if (a != null) {
                aVar.mo4634h(a.toString());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: R */
        public void mo4554R(Object obj) {
            C1029y.m5313l(this.f4451k, 8388611, obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: S */
        public void mo4555S() {
            if (this.f4457q) {
                C1029y.m5311j(this.f4451k, this.f4452l);
            }
            this.f4457q = true;
            C0924a0.m4772a(this.f4451k, this.f4455o, this.f4452l, this.f4456p | true ? 1 : 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: V */
        public void mo4557V(C0965b.C0968c cVar) {
            super.mo4557V(cVar);
            C0924a0.C0926b.m4776a(cVar.f4467b, cVar.f4466a.mo4798d());
        }

        /* access modifiers changed from: protected */
        /* renamed from: W */
        public boolean mo4566W(C0965b.C0967b bVar) {
            return C0924a0.C0925a.m4775b(bVar.f4463a);
        }
    }

    /* renamed from: androidx.mediarouter.media.g0$e */
    /* compiled from: SystemMediaRouteProvider */
    static class C0971e extends C0963g0 {

        /* renamed from: m */
        private static final ArrayList<IntentFilter> f4470m;

        /* renamed from: j */
        final AudioManager f4471j;

        /* renamed from: k */
        private final C0973b f4472k;

        /* renamed from: l */
        int f4473l = -1;

        /* renamed from: androidx.mediarouter.media.g0$e$a */
        /* compiled from: SystemMediaRouteProvider */
        final class C0972a extends C0985m.C0995e {
            C0972a() {
            }

            /* renamed from: g */
            public void mo4493g(int i) {
                C0971e.this.f4471j.setStreamVolume(3, i, 0);
                C0971e.this.mo4568F();
            }

            /* renamed from: j */
            public void mo4496j(int i) {
                int streamVolume = C0971e.this.f4471j.getStreamVolume(3);
                if (Math.min(C0971e.this.f4471j.getStreamMaxVolume(3), Math.max(0, i + streamVolume)) != streamVolume) {
                    C0971e.this.f4471j.setStreamVolume(3, streamVolume, 0);
                }
                C0971e.this.mo4568F();
            }
        }

        /* renamed from: androidx.mediarouter.media.g0$e$b */
        /* compiled from: SystemMediaRouteProvider */
        final class C0973b extends BroadcastReceiver {
            C0973b() {
            }

            public void onReceive(Context context, Intent intent) {
                int intExtra;
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1)) >= 0) {
                    C0971e eVar = C0971e.this;
                    if (intExtra != eVar.f4473l) {
                        eVar.mo4568F();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f4470m = arrayList;
            arrayList.add(intentFilter);
        }

        public C0971e(Context context) {
            super(context);
            this.f4471j = (AudioManager) context.getSystemService("audio");
            C0973b bVar = new C0973b();
            this.f4472k = bVar;
            context.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            mo4568F();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo4568F() {
            Resources resources = mo4649n().getResources();
            int streamMaxVolume = this.f4471j.getStreamMaxVolume(3);
            this.f4473l = this.f4471j.getStreamVolume(3);
            mo4655x(new C0996n.C0997a().mo4682a(new C0983l.C0984a("DEFAULT_ROUTE", resources.getString(C1542j.mr_system_route_name)).mo4628b(f4470m).mo4641o(3).mo4642p(0).mo4645s(1).mo4646t(streamMaxVolume).mo4644r(this.f4473l).mo4631e()).mo4684c());
        }

        /* renamed from: t */
        public C0985m.C0995e mo4453t(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new C0972a();
            }
            return null;
        }
    }

    /* renamed from: androidx.mediarouter.media.g0$f */
    /* compiled from: SystemMediaRouteProvider */
    public interface C0974f {
        /* renamed from: a */
        void mo4570a(String str);
    }

    protected C0963g0(Context context) {
        super(context, new C0985m.C0994d(new ComponentName(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, C0963g0.class.getName())));
    }

    /* renamed from: A */
    public static C0963g0 m4914A(Context context, C0974f fVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return new C0964a(context, fVar);
        }
        if (i >= 18) {
            return new C0970d(context, fVar);
        }
        if (i >= 17) {
            return new C0969c(context, fVar);
        }
        if (i >= 16) {
            return new C0965b(context, fVar);
        }
        return new C0971e(context);
    }

    /* renamed from: B */
    public void mo4540B(C1003s.C1022i iVar) {
    }

    /* renamed from: C */
    public void mo4541C(C1003s.C1022i iVar) {
    }

    /* renamed from: D */
    public void mo4542D(C1003s.C1022i iVar) {
    }

    /* renamed from: E */
    public void mo4543E(C1003s.C1022i iVar) {
    }
}
