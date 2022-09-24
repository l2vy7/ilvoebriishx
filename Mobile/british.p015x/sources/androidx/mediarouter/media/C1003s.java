package androidx.mediarouter.media;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p007v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.core.content.C0600b;
import androidx.mediarouter.media.C0939c;
import androidx.mediarouter.media.C0951e0;
import androidx.mediarouter.media.C0956f0;
import androidx.mediarouter.media.C0963g0;
import androidx.mediarouter.media.C0985m;
import androidx.mediarouter.media.C1001r;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.google.common.util.concurrent.C10412b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p001a0.C0014b;
import p018c1.C2639f;
import p018c1.C2643j;
import p069e0.C5195a;
import p105l0.C5643c;
import p105l0.C5644d;
import p150t.C6077a;
import p182z0.C6432i;

/* renamed from: androidx.mediarouter.media.s */
/* compiled from: MediaRouter */
public final class C1003s {

    /* renamed from: c */
    static final boolean f4557c = Log.isLoggable("MediaRouter", 3);

    /* renamed from: d */
    static C1008e f4558d;

    /* renamed from: a */
    final Context f4559a;

    /* renamed from: b */
    final ArrayList<C1006c> f4560b = new ArrayList<>();

    /* renamed from: androidx.mediarouter.media.s$b */
    /* compiled from: MediaRouter */
    public static abstract class C1005b {
        /* renamed from: a */
        public void mo4165a(C1003s sVar, C1021h hVar) {
        }

        /* renamed from: b */
        public void mo4166b(C1003s sVar, C1021h hVar) {
        }

        /* renamed from: c */
        public void mo4167c(C1003s sVar, C1021h hVar) {
        }

        /* renamed from: d */
        public void mo4168d(C1003s sVar, C1022i iVar) {
        }

        /* renamed from: e */
        public void mo4169e(C1003s sVar, C1022i iVar) {
        }

        /* renamed from: f */
        public void mo4718f(C1003s sVar, C1022i iVar) {
        }

        /* renamed from: g */
        public void mo4170g(C1003s sVar, C1022i iVar) {
        }

        @Deprecated
        /* renamed from: h */
        public void mo4196h(C1003s sVar, C1022i iVar) {
        }

        /* renamed from: i */
        public void mo4719i(C1003s sVar, C1022i iVar, int i) {
            mo4196h(sVar, iVar);
        }

        /* renamed from: j */
        public void mo4720j(C1003s sVar, C1022i iVar, int i, C1022i iVar2) {
            mo4719i(sVar, iVar, i);
        }

        @Deprecated
        /* renamed from: k */
        public void mo4197k(C1003s sVar, C1022i iVar) {
        }

        /* renamed from: l */
        public void mo4721l(C1003s sVar, C1022i iVar, int i) {
            mo4197k(sVar, iVar);
        }

        /* renamed from: m */
        public void mo4289m(C1003s sVar, C1022i iVar) {
        }
    }

    /* renamed from: androidx.mediarouter.media.s$c */
    /* compiled from: MediaRouter */
    private static final class C1006c {

        /* renamed from: a */
        public final C1003s f4561a;

        /* renamed from: b */
        public final C1005b f4562b;

        /* renamed from: c */
        public C1001r f4563c = C1001r.f4553c;

        /* renamed from: d */
        public int f4564d;

        public C1006c(C1003s sVar, C1005b bVar) {
            this.f4561a = sVar;
            this.f4562b = bVar;
        }

        /* renamed from: a */
        public boolean mo4722a(C1022i iVar, int i, C1022i iVar2, int i2) {
            if ((this.f4564d & 2) != 0 || iVar.mo4787E(this.f4563c)) {
                return true;
            }
            if (!C1003s.m5135o() || !iVar.mo4818w() || i != 262 || i2 != 3 || iVar2 == null) {
                return false;
            }
            return !iVar2.mo4818w();
        }
    }

    /* renamed from: androidx.mediarouter.media.s$d */
    /* compiled from: MediaRouter */
    public static abstract class C1007d {
        @SuppressLint({"UnknownNullness"})
        /* renamed from: a */
        public void mo4422a(String str, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo4423b(Bundle bundle) {
        }
    }

    /* renamed from: androidx.mediarouter.media.s$e */
    /* compiled from: MediaRouter */
    private static final class C1008e implements C0963g0.C0974f, C0951e0.C0954c {

        /* renamed from: A */
        C1019f f4565A;

        /* renamed from: B */
        C1020g f4566B;

        /* renamed from: C */
        private C1012d f4567C;

        /* renamed from: D */
        MediaSessionCompat f4568D;

        /* renamed from: E */
        private MediaSessionCompat f4569E;

        /* renamed from: F */
        private MediaSessionCompat.C0175j f4570F = new C1009a();

        /* renamed from: G */
        C0985m.C0987b.C0992d f4571G = new C1010b();

        /* renamed from: a */
        final Context f4572a;

        /* renamed from: b */
        final boolean f4573b;

        /* renamed from: c */
        final C0939c f4574c;

        /* renamed from: d */
        final ArrayList<WeakReference<C1003s>> f4575d = new ArrayList<>();

        /* renamed from: e */
        private final ArrayList<C1022i> f4576e = new ArrayList<>();

        /* renamed from: f */
        private final Map<C5644d<String, String>, String> f4577f = new HashMap();

        /* renamed from: g */
        private final ArrayList<C1021h> f4578g = new ArrayList<>();

        /* renamed from: h */
        private final ArrayList<C1018g> f4579h = new ArrayList<>();

        /* renamed from: i */
        final C0956f0.C0960c f4580i = new C0956f0.C0960c();

        /* renamed from: j */
        private final C1017f f4581j = new C1017f();

        /* renamed from: k */
        final C1011c f4582k = new C1011c();

        /* renamed from: l */
        private final C5195a f4583l;

        /* renamed from: m */
        final C0963g0 f4584m;

        /* renamed from: n */
        private final boolean f4585n;

        /* renamed from: o */
        private C2643j f4586o;

        /* renamed from: p */
        private C0951e0 f4587p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public C1022i f4588q;

        /* renamed from: r */
        private C1022i f4589r;

        /* renamed from: s */
        C1022i f4590s;

        /* renamed from: t */
        C0985m.C0995e f4591t;

        /* renamed from: u */
        C1022i f4592u;

        /* renamed from: v */
        C0985m.C0995e f4593v;

        /* renamed from: w */
        final Map<String, C0985m.C0995e> f4594w = new HashMap();

        /* renamed from: x */
        private C2639f f4595x;

        /* renamed from: y */
        private C2639f f4596y;

        /* renamed from: z */
        private int f4597z;

        /* renamed from: androidx.mediarouter.media.s$e$a */
        /* compiled from: MediaRouter */
        class C1009a implements MediaSessionCompat.C0175j {
            C1009a() {
            }

            /* renamed from: a */
            public void mo589a() {
                MediaSessionCompat mediaSessionCompat = C1008e.this.f4568D;
                if (mediaSessionCompat == null) {
                    return;
                }
                if (mediaSessionCompat.mo409h()) {
                    C1008e eVar = C1008e.this;
                    eVar.mo4742g(eVar.f4568D.mo407e());
                    return;
                }
                C1008e eVar2 = C1008e.this;
                eVar2.mo4727F(eVar2.f4568D.mo407e());
            }
        }

        /* renamed from: androidx.mediarouter.media.s$e$b */
        /* compiled from: MediaRouter */
        class C1010b implements C0985m.C0987b.C0992d {
            C1010b() {
            }

            /* renamed from: a */
            public void mo4431a(C0985m.C0987b bVar, C0983l lVar, Collection<C0985m.C0987b.C0990c> collection) {
                C1008e eVar = C1008e.this;
                if (bVar == eVar.f4593v && lVar != null) {
                    C1021h q = eVar.f4592u.mo4811q();
                    String m = lVar.mo4613m();
                    C1022i iVar = new C1022i(q, m, C1008e.this.mo4743h(q, m));
                    iVar.mo4788F(lVar);
                    C1008e eVar2 = C1008e.this;
                    if (eVar2.f4590s != iVar) {
                        eVar2.mo4725D(eVar2, iVar, eVar2.f4593v, 3, eVar2.f4592u, collection);
                        C1008e eVar3 = C1008e.this;
                        eVar3.f4592u = null;
                        eVar3.f4593v = null;
                    }
                } else if (bVar == eVar.f4591t) {
                    if (lVar != null) {
                        eVar.mo4739U(eVar.f4590s, lVar);
                    }
                    C1008e.this.f4590s.mo4794L(collection);
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.s$e$c */
        /* compiled from: MediaRouter */
        private final class C1011c extends Handler {

            /* renamed from: a */
            private final ArrayList<C1006c> f4600a = new ArrayList<>();

            /* renamed from: b */
            private final List<C1022i> f4601b = new ArrayList();

            C1011c() {
            }

            /* renamed from: a */
            private void m5218a(C1006c cVar, int i, Object obj, int i2) {
                C1022i iVar;
                C1003s sVar = cVar.f4561a;
                C1005b bVar = cVar.f4562b;
                int i3 = 65280 & i;
                if (i3 == 256) {
                    C1022i iVar2 = (i == 264 || i == 262) ? (C1022i) ((C5644d) obj).f24211b : (C1022i) obj;
                    if (i == 264 || i == 262) {
                        iVar = (C1022i) ((C5644d) obj).f24210a;
                    } else {
                        iVar = null;
                    }
                    if (iVar2 != null && cVar.mo4722a(iVar2, i, iVar, i2)) {
                        switch (i) {
                            case TsExtractor.TS_STREAM_TYPE_AIT /*257*/:
                                bVar.mo4168d(sVar, iVar2);
                                return;
                            case 258:
                                bVar.mo4170g(sVar, iVar2);
                                return;
                            case 259:
                                bVar.mo4169e(sVar, iVar2);
                                return;
                            case 260:
                                bVar.mo4289m(sVar, iVar2);
                                return;
                            case 261:
                                bVar.mo4718f(sVar, iVar2);
                                return;
                            case 262:
                                bVar.mo4720j(sVar, iVar2, i2, iVar2);
                                return;
                            case 263:
                                bVar.mo4721l(sVar, iVar2, i2);
                                return;
                            case 264:
                                bVar.mo4720j(sVar, iVar2, i2, iVar);
                                return;
                            default:
                                return;
                        }
                    }
                } else if (i3 == 512) {
                    C1021h hVar = (C1021h) obj;
                    switch (i) {
                        case 513:
                            bVar.mo4165a(sVar, hVar);
                            return;
                        case IronSourceConstants.INIT_COMPLETE /*514*/:
                            bVar.mo4167c(sVar, hVar);
                            return;
                        case 515:
                            bVar.mo4166b(sVar, hVar);
                            return;
                        default:
                            return;
                    }
                }
            }

            /* renamed from: d */
            private void m5219d(int i, Object obj) {
                if (i == 262) {
                    C1022i iVar = (C1022i) ((C5644d) obj).f24211b;
                    C1008e.this.f4584m.mo4543E(iVar);
                    if (C1008e.this.f4588q != null && iVar.mo4818w()) {
                        for (C1022i D : this.f4601b) {
                            C1008e.this.f4584m.mo4542D(D);
                        }
                        this.f4601b.clear();
                    }
                } else if (i != 264) {
                    switch (i) {
                        case TsExtractor.TS_STREAM_TYPE_AIT /*257*/:
                            C1008e.this.f4584m.mo4540B((C1022i) obj);
                            return;
                        case 258:
                            C1008e.this.f4584m.mo4542D((C1022i) obj);
                            return;
                        case 259:
                            C1008e.this.f4584m.mo4541C((C1022i) obj);
                            return;
                        default:
                            return;
                    }
                } else {
                    C1022i iVar2 = (C1022i) ((C5644d) obj).f24211b;
                    this.f4601b.add(iVar2);
                    C1008e.this.f4584m.mo4540B(iVar2);
                    C1008e.this.f4584m.mo4543E(iVar2);
                }
            }

            /* renamed from: b */
            public void mo4758b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            /* renamed from: c */
            public void mo4759c(int i, Object obj, int i2) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
            }

            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                if (i == 259 && C1008e.this.mo4754v().mo4805k().equals(((C1022i) obj).mo4805k())) {
                    C1008e.this.mo4740V(true);
                }
                m5219d(i, obj);
                try {
                    int size = C1008e.this.f4575d.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C1003s sVar = (C1003s) C1008e.this.f4575d.get(size).get();
                        if (sVar == null) {
                            C1008e.this.f4575d.remove(size);
                        } else {
                            this.f4600a.addAll(sVar.f4560b);
                        }
                    }
                    int size2 = this.f4600a.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        m5218a(this.f4600a.get(i3), i, obj, i2);
                    }
                } finally {
                    this.f4600a.clear();
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.s$e$d */
        /* compiled from: MediaRouter */
        private final class C1012d {

            /* renamed from: a */
            private final MediaSessionCompat f4603a;

            /* renamed from: b */
            private int f4604b;

            /* renamed from: c */
            private int f4605c;

            /* renamed from: d */
            private C6432i f4606d;

            /* renamed from: androidx.mediarouter.media.s$e$d$a */
            /* compiled from: MediaRouter */
            class C1013a extends C6432i {

                /* renamed from: androidx.mediarouter.media.s$e$d$a$a */
                /* compiled from: MediaRouter */
                class C1014a implements Runnable {

                    /* renamed from: b */
                    final /* synthetic */ int f4609b;

                    C1014a(int i) {
                        this.f4609b = i;
                    }

                    public void run() {
                        C1022i iVar = C1008e.this.f4590s;
                        if (iVar != null) {
                            iVar.mo4789G(this.f4609b);
                        }
                    }
                }

                /* renamed from: androidx.mediarouter.media.s$e$d$a$b */
                /* compiled from: MediaRouter */
                class C1015b implements Runnable {

                    /* renamed from: b */
                    final /* synthetic */ int f4611b;

                    C1015b(int i) {
                        this.f4611b = i;
                    }

                    public void run() {
                        C1022i iVar = C1008e.this.f4590s;
                        if (iVar != null) {
                            iVar.mo4790H(this.f4611b);
                        }
                    }
                }

                C1013a(int i, int i2, int i3, String str) {
                    super(i, i2, i3, str);
                }

                /* renamed from: e */
                public void mo4764e(int i) {
                    C1008e.this.f4582k.post(new C1015b(i));
                }

                /* renamed from: f */
                public void mo4765f(int i) {
                    C1008e.this.f4582k.post(new C1014a(i));
                }
            }

            C1012d(MediaSessionCompat mediaSessionCompat) {
                this.f4603a = mediaSessionCompat;
            }

            /* renamed from: a */
            public void mo4761a() {
                MediaSessionCompat mediaSessionCompat = this.f4603a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.mo417p(C1008e.this.f4580i.f4444d);
                    this.f4606d = null;
                }
            }

            /* renamed from: b */
            public void mo4762b(int i, int i2, int i3, String str) {
                if (this.f4603a != null) {
                    C6432i iVar = this.f4606d;
                    if (iVar != null && i == this.f4604b && i2 == this.f4605c) {
                        iVar.mo24253h(i3);
                        return;
                    }
                    C1013a aVar = new C1013a(i, i2, i3, str);
                    this.f4606d = aVar;
                    this.f4603a.mo418q(aVar);
                }
            }

            /* renamed from: c */
            public MediaSessionCompat.Token mo4763c() {
                MediaSessionCompat mediaSessionCompat = this.f4603a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.mo408f();
                }
                return null;
            }
        }

        /* renamed from: androidx.mediarouter.media.s$e$e */
        /* compiled from: MediaRouter */
        private final class C1016e extends C0939c.C0940a {
            private C1016e() {
            }

            /* renamed from: a */
            public void mo4507a(C0985m.C0995e eVar) {
                if (eVar == C1008e.this.f4591t) {
                    mo4768d(2);
                } else if (C1003s.f4557c) {
                    Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + eVar);
                }
            }

            /* renamed from: b */
            public void mo4508b(int i) {
                mo4768d(i);
            }

            /* renamed from: c */
            public void mo4509c(String str, int i) {
                C1022i iVar;
                Iterator<C1022i> it = C1008e.this.mo4753u().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        iVar = null;
                        break;
                    }
                    iVar = it.next();
                    if (iVar.mo4812r() == C1008e.this.f4574c && TextUtils.equals(str, iVar.mo4799e())) {
                        break;
                    }
                }
                if (iVar == null) {
                    Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
                    return;
                }
                C1008e.this.mo4731J(iVar, i);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: d */
            public void mo4768d(int i) {
                C1022i i2 = C1008e.this.mo4744i();
                if (C1008e.this.mo4754v() != i2) {
                    C1008e.this.mo4731J(i2, i);
                }
            }
        }

        /* renamed from: androidx.mediarouter.media.s$e$f */
        /* compiled from: MediaRouter */
        private final class C1017f extends C0985m.C0986a {
            C1017f() {
            }

            /* renamed from: a */
            public void mo4432a(C0985m mVar, C0996n nVar) {
                C1008e.this.mo4738T(mVar, nVar);
            }
        }

        /* renamed from: androidx.mediarouter.media.s$e$g */
        /* compiled from: MediaRouter */
        private final class C1018g implements C0956f0.C0961d {

            /* renamed from: a */
            private final C0956f0 f4615a;

            /* renamed from: b */
            private boolean f4616b;

            public C1018g(Object obj) {
                C0956f0 b = C0956f0.m4905b(C1008e.this.f4572a, obj);
                this.f4615a = b;
                b.mo4534d(this);
                mo4771e();
            }

            /* renamed from: a */
            public void mo4537a(int i) {
                C1022i iVar;
                if (!this.f4616b && (iVar = C1008e.this.f4590s) != null) {
                    iVar.mo4789G(i);
                }
            }

            /* renamed from: b */
            public void mo4538b(int i) {
                C1022i iVar;
                if (!this.f4616b && (iVar = C1008e.this.f4590s) != null) {
                    iVar.mo4790H(i);
                }
            }

            /* renamed from: c */
            public void mo4769c() {
                this.f4616b = true;
                this.f4615a.mo4534d((C0956f0.C0961d) null);
            }

            /* renamed from: d */
            public Object mo4770d() {
                return this.f4615a.mo4532a();
            }

            /* renamed from: e */
            public void mo4771e() {
                this.f4615a.mo4533c(C1008e.this.f4580i);
            }
        }

        @SuppressLint({"SyntheticAccessor", "NewApi"})
        C1008e(Context context) {
            this.f4572a = context;
            this.f4583l = C5195a.m23567a(context);
            this.f4585n = C0014b.m39a((ActivityManager) context.getSystemService("activity"));
            if (Build.VERSION.SDK_INT >= 30) {
                this.f4573b = MediaTransferReceiver.m4771a(context);
            } else {
                this.f4573b = false;
            }
            if (this.f4573b) {
                this.f4574c = new C0939c(context, new C1016e());
            } else {
                this.f4574c = null;
            }
            this.f4584m = C0963g0.m4914A(context, this);
        }

        /* renamed from: A */
        private boolean m5168A(C1022i iVar) {
            return iVar.mo4812r() == this.f4584m && iVar.mo4792J("android.media.intent.category.LIVE_AUDIO") && !iVar.mo4792J("android.media.intent.category.LIVE_VIDEO");
        }

        /* renamed from: L */
        private void m5169L(C1012d dVar) {
            C1012d dVar2 = this.f4567C;
            if (dVar2 != null) {
                dVar2.mo4761a();
            }
            this.f4567C = dVar;
            if (dVar != null) {
                mo4737R();
            }
        }

        /* renamed from: Q */
        private void m5170Q(C1001r rVar, boolean z) {
            if (mo4756x()) {
                C2639f fVar = this.f4596y;
                if (fVar == null || !fVar.mo9289d().equals(rVar) || this.f4596y.mo9290e() != z) {
                    if (!rVar.mo4693f() || z) {
                        this.f4596y = new C2639f(rVar, z);
                    } else if (this.f4596y != null) {
                        this.f4596y = null;
                    } else {
                        return;
                    }
                    if (C1003s.f4557c) {
                        Log.d("MediaRouter", "Updated MediaRoute2Provider's discovery request: " + this.f4596y);
                    }
                    this.f4574c.mo4656y(this.f4596y);
                }
            }
        }

        /* renamed from: S */
        private void m5171S(C1021h hVar, C0996n nVar) {
            boolean z;
            if (hVar.mo4783h(nVar)) {
                int i = 0;
                if (nVar == null || (!nVar.mo4679d() && nVar != this.f4584m.mo4650o())) {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + nVar);
                    z = false;
                } else {
                    List<C0983l> c = nVar.mo4678c();
                    ArrayList<C5644d> arrayList = new ArrayList<>();
                    ArrayList<C5644d> arrayList2 = new ArrayList<>();
                    z = false;
                    for (C0983l next : c) {
                        if (next == null || !next.mo4626y()) {
                            Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + next);
                        } else {
                            String m = next.mo4613m();
                            int b = hVar.mo4777b(m);
                            if (b < 0) {
                                C1022i iVar = new C1022i(hVar, m, mo4743h(hVar, m));
                                int i2 = i + 1;
                                hVar.f4629b.add(i, iVar);
                                this.f4576e.add(iVar);
                                if (next.mo4611k().size() > 0) {
                                    arrayList.add(new C5644d(iVar, next));
                                } else {
                                    iVar.mo4788F(next);
                                    if (C1003s.f4557c) {
                                        Log.d("MediaRouter", "Route added: " + iVar);
                                    }
                                    this.f4582k.mo4758b(TsExtractor.TS_STREAM_TYPE_AIT, iVar);
                                }
                                i = i2;
                            } else if (b < i) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + next);
                            } else {
                                C1022i iVar2 = hVar.f4629b.get(b);
                                int i3 = i + 1;
                                Collections.swap(hVar.f4629b, b, i);
                                if (next.mo4611k().size() > 0) {
                                    arrayList2.add(new C5644d(iVar2, next));
                                } else if (mo4739U(iVar2, next) != 0 && iVar2 == this.f4590s) {
                                    i = i3;
                                    z = true;
                                }
                                i = i3;
                            }
                        }
                    }
                    for (C5644d dVar : arrayList) {
                        C1022i iVar3 = (C1022i) dVar.f24210a;
                        iVar3.mo4788F((C0983l) dVar.f24211b);
                        if (C1003s.f4557c) {
                            Log.d("MediaRouter", "Route added: " + iVar3);
                        }
                        this.f4582k.mo4758b(TsExtractor.TS_STREAM_TYPE_AIT, iVar3);
                    }
                    for (C5644d dVar2 : arrayList2) {
                        C1022i iVar4 = (C1022i) dVar2.f24210a;
                        if (mo4739U(iVar4, (C0983l) dVar2.f24211b) != 0 && iVar4 == this.f4590s) {
                            z = true;
                        }
                    }
                }
                for (int size = hVar.f4629b.size() - 1; size >= i; size--) {
                    C1022i iVar5 = hVar.f4629b.get(size);
                    iVar5.mo4788F((C0983l) null);
                    this.f4576e.remove(iVar5);
                }
                mo4740V(z);
                for (int size2 = hVar.f4629b.size() - 1; size2 >= i; size2--) {
                    C1022i remove = hVar.f4629b.remove(size2);
                    if (C1003s.f4557c) {
                        Log.d("MediaRouter", "Route removed: " + remove);
                    }
                    this.f4582k.mo4758b(258, remove);
                }
                if (C1003s.f4557c) {
                    Log.d("MediaRouter", "Provider changed: " + hVar);
                }
                this.f4582k.mo4758b(515, hVar);
            }
        }

        /* renamed from: j */
        private C1021h m5173j(C0985m mVar) {
            int size = this.f4578g.size();
            for (int i = 0; i < size; i++) {
                if (this.f4578g.get(i).f4628a == mVar) {
                    return this.f4578g.get(i);
                }
            }
            return null;
        }

        /* renamed from: k */
        private int m5174k(Object obj) {
            int size = this.f4579h.size();
            for (int i = 0; i < size; i++) {
                if (this.f4579h.get(i).mo4770d() == obj) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: l */
        private int m5175l(String str) {
            int size = this.f4576e.size();
            for (int i = 0; i < size; i++) {
                if (this.f4576e.get(i).f4634c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: z */
        private boolean m5176z(C1022i iVar) {
            return iVar.mo4812r() == this.f4584m && iVar.f4633b.equals("DEFAULT_ROUTE");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public boolean mo4723B() {
            C2643j jVar = this.f4586o;
            if (jVar == null) {
                return false;
            }
            return jVar.mo9300d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4724C() {
            if (this.f4590s.mo4820y()) {
                List<C1022i> l = this.f4590s.mo4806l();
                HashSet hashSet = new HashSet();
                for (C1022i iVar : l) {
                    hashSet.add(iVar.f4634c);
                }
                Iterator<Map.Entry<String, C0985m.C0995e>> it = this.f4594w.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        C0985m.C0995e eVar = (C0985m.C0995e) next.getValue();
                        eVar.mo4495i(0);
                        eVar.mo4491e();
                        it.remove();
                    }
                }
                for (C1022i next2 : l) {
                    if (!this.f4594w.containsKey(next2.f4634c)) {
                        C0985m.C0995e u = next2.mo4812r().mo4455u(next2.f4633b, this.f4590s.f4633b);
                        u.mo4492f();
                        this.f4594w.put(next2.f4634c, u);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo4725D(C1008e eVar, C1022i iVar, C0985m.C0995e eVar2, int i, C1022i iVar2, Collection<C0985m.C0987b.C0990c> collection) {
            C1019f fVar;
            C1020g gVar = this.f4566B;
            if (gVar != null) {
                gVar.mo4773b();
                this.f4566B = null;
            }
            C1020g gVar2 = new C1020g(eVar, iVar, eVar2, i, iVar2, collection);
            this.f4566B = gVar2;
            if (gVar2.f4619b != 3 || (fVar = this.f4565A) == null) {
                gVar2.m5239d();
                return;
            }
            C10412b<Void> a = fVar.mo4772a(this.f4590s, gVar2.f4621d);
            if (a == null) {
                this.f4566B.m5239d();
            } else {
                this.f4566B.mo4775f(a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo4726E(C1022i iVar) {
            if (this.f4591t instanceof C0985m.C0987b) {
                C1022i.C1023a p = mo4748p(iVar);
                if (!this.f4590s.mo4806l().contains(iVar) || p == null || !p.mo4824d()) {
                    Log.w("MediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + iVar);
                } else if (this.f4590s.mo4806l().size() <= 1) {
                    Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
                } else {
                    ((C0985m.C0987b) this.f4591t).mo4500o(iVar.mo4799e());
                }
            } else {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
        }

        /* renamed from: F */
        public void mo4727F(Object obj) {
            int k = m5174k(obj);
            if (k >= 0) {
                this.f4579h.remove(k).mo4769c();
            }
        }

        /* renamed from: G */
        public void mo4728G(C1022i iVar, int i) {
            C0985m.C0995e eVar;
            C0985m.C0995e eVar2;
            if (iVar == this.f4590s && (eVar2 = this.f4591t) != null) {
                eVar2.mo4493g(i);
            } else if (!this.f4594w.isEmpty() && (eVar = this.f4594w.get(iVar.f4634c)) != null) {
                eVar.mo4493g(i);
            }
        }

        /* renamed from: H */
        public void mo4729H(C1022i iVar, int i) {
            C0985m.C0995e eVar;
            C0985m.C0995e eVar2;
            if (iVar == this.f4590s && (eVar2 = this.f4591t) != null) {
                eVar2.mo4496j(i);
            } else if (!this.f4594w.isEmpty() && (eVar = this.f4594w.get(iVar.f4634c)) != null) {
                eVar.mo4496j(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I */
        public void mo4730I(C1022i iVar, int i) {
            C0939c cVar;
            if (!this.f4576e.contains(iVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + iVar);
            } else if (!iVar.f4638g) {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + iVar);
            } else if (Build.VERSION.SDK_INT < 30 || iVar.mo4812r() != (cVar = this.f4574c) || this.f4590s == iVar) {
                mo4731J(iVar, i);
            } else {
                cVar.mo4506H(iVar.mo4799e());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo4731J(C1022i iVar, int i) {
            if (C1003s.f4558d == null || (this.f4589r != null && iVar.mo4817v())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 3; i2 < stackTrace.length; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    sb.append(stackTraceElement.getClassName());
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(":");
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append("  ");
                }
                if (C1003s.f4558d == null) {
                    Log.w("MediaRouter", "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.f4572a.getPackageName() + ", callers=" + sb.toString());
                } else {
                    Log.w("MediaRouter", "Default route is selected while a BT route is available: pkgName=" + this.f4572a.getPackageName() + ", callers=" + sb.toString());
                }
            }
            if (this.f4590s != iVar) {
                if (this.f4592u != null) {
                    this.f4592u = null;
                    C0985m.C0995e eVar = this.f4593v;
                    if (eVar != null) {
                        eVar.mo4495i(3);
                        this.f4593v.mo4491e();
                        this.f4593v = null;
                    }
                }
                if (mo4756x() && iVar.mo4811q().mo4782g()) {
                    C0985m.C0987b s = iVar.mo4812r().mo4452s(iVar.f4633b);
                    if (s != null) {
                        s.mo4659q(C0600b.m3297i(this.f4572a), this.f4571G);
                        this.f4592u = iVar;
                        this.f4593v = s;
                        s.mo4492f();
                        return;
                    }
                    Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + iVar);
                }
                C0985m.C0995e t = iVar.mo4812r().mo4453t(iVar.f4633b);
                if (t != null) {
                    t.mo4492f();
                }
                if (C1003s.f4557c) {
                    Log.d("MediaRouter", "Route selected: " + iVar);
                }
                if (this.f4590s == null) {
                    this.f4590s = iVar;
                    this.f4591t = t;
                    this.f4582k.mo4759c(262, new C5644d(null, iVar), i);
                    return;
                }
                mo4725D(this, iVar, t, i, (C1022i) null, (Collection<C0985m.C0987b.C0990c>) null);
            }
        }

        /* renamed from: K */
        public void mo4732K(MediaSessionCompat mediaSessionCompat) {
            this.f4569E = mediaSessionCompat;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                m5169L(mediaSessionCompat != null ? new C1012d(mediaSessionCompat) : null);
            } else if (i >= 14) {
                MediaSessionCompat mediaSessionCompat2 = this.f4568D;
                if (mediaSessionCompat2 != null) {
                    mo4727F(mediaSessionCompat2.mo407e());
                    this.f4568D.mo411j(this.f4570F);
                }
                this.f4568D = mediaSessionCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.mo405a(this.f4570F);
                    if (mediaSessionCompat.mo409h()) {
                        mo4742g(mediaSessionCompat.mo407e());
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo4733M(C2643j jVar) {
            boolean z;
            C2643j jVar2 = this.f4586o;
            this.f4586o = jVar;
            if (mo4756x()) {
                boolean z2 = false;
                if (jVar2 == null) {
                    z = false;
                } else {
                    z = jVar2.mo9300d();
                }
                if (jVar != null) {
                    z2 = jVar.mo9300d();
                }
                if (z != z2) {
                    this.f4574c.mo4657z(this.f4596y);
                }
            }
        }

        /* renamed from: N */
        public void mo4734N() {
            mo4529c(this.f4584m);
            C0939c cVar = this.f4574c;
            if (cVar != null) {
                mo4529c(cVar);
            }
            C0951e0 e0Var = new C0951e0(this.f4572a, this);
            this.f4587p = e0Var;
            e0Var.mo4525i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo4735O(C1022i iVar) {
            if (this.f4591t instanceof C0985m.C0987b) {
                C1022i.C1023a p = mo4748p(iVar);
                if (p == null || !p.mo4823c()) {
                    Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((C0985m.C0987b) this.f4591t).mo4501p(Collections.singletonList(iVar.mo4799e()));
                }
            } else {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
        }

        /* renamed from: P */
        public void mo4736P() {
            C1001r.C1002a aVar = new C1001r.C1002a();
            int size = this.f4575d.size();
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1003s sVar = (C1003s) this.f4575d.get(size).get();
                if (sVar == null) {
                    this.f4575d.remove(size);
                } else {
                    int size2 = sVar.f4560b.size();
                    i += size2;
                    for (int i2 = 0; i2 < size2; i2++) {
                        C1006c cVar = sVar.f4560b.get(i2);
                        aVar.mo4700c(cVar.f4563c);
                        int i3 = cVar.f4564d;
                        if ((i3 & 1) != 0) {
                            z = true;
                            z2 = true;
                        }
                        if ((i3 & 4) != 0 && !this.f4585n) {
                            z = true;
                        }
                        if ((i3 & 8) != 0) {
                            z = true;
                        }
                    }
                }
            }
            this.f4597z = i;
            C1001r d = z ? aVar.mo4701d() : C1001r.f4553c;
            m5170Q(aVar.mo4701d(), z2);
            C2639f fVar = this.f4595x;
            if (fVar == null || !fVar.mo9289d().equals(d) || this.f4595x.mo9290e() != z2) {
                if (!d.mo4693f() || z2) {
                    this.f4595x = new C2639f(d, z2);
                } else if (this.f4595x != null) {
                    this.f4595x = null;
                } else {
                    return;
                }
                if (C1003s.f4557c) {
                    Log.d("MediaRouter", "Updated discovery request: " + this.f4595x);
                }
                if (z && !z2 && this.f4585n) {
                    Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                int size3 = this.f4578g.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    C0985m mVar = this.f4578g.get(i4).f4628a;
                    if (mVar != this.f4574c) {
                        mVar.mo4656y(this.f4595x);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        /* renamed from: R */
        public void mo4737R() {
            C1022i iVar = this.f4590s;
            if (iVar != null) {
                this.f4580i.f4441a = iVar.mo4813s();
                this.f4580i.f4442b = this.f4590s.mo4816u();
                this.f4580i.f4443c = this.f4590s.mo4814t();
                this.f4580i.f4444d = this.f4590s.mo4808n();
                this.f4580i.f4445e = this.f4590s.mo4809o();
                if (!this.f4573b || this.f4590s.mo4812r() != this.f4574c) {
                    this.f4580i.f4446f = null;
                } else {
                    this.f4580i.f4446f = C0939c.m4864D(this.f4591t);
                }
                int size = this.f4579h.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    this.f4579h.get(i2).mo4771e();
                }
                if (this.f4567C == null) {
                    return;
                }
                if (this.f4590s == mo4747o() || this.f4590s == mo4745m()) {
                    this.f4567C.mo4761a();
                    return;
                }
                C0956f0.C0960c cVar = this.f4580i;
                if (cVar.f4443c == 1) {
                    i = 2;
                }
                this.f4567C.mo4762b(i, cVar.f4442b, cVar.f4441a, cVar.f4446f);
                return;
            }
            C1012d dVar = this.f4567C;
            if (dVar != null) {
                dVar.mo4761a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public void mo4738T(C0985m mVar, C0996n nVar) {
            C1021h j = m5173j(mVar);
            if (j != null) {
                m5171S(j, nVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public int mo4739U(C1022i iVar, C0983l lVar) {
            int F = iVar.mo4788F(lVar);
            if (F != 0) {
                if ((F & 1) != 0) {
                    if (C1003s.f4557c) {
                        Log.d("MediaRouter", "Route changed: " + iVar);
                    }
                    this.f4582k.mo4758b(259, iVar);
                }
                if ((F & 2) != 0) {
                    if (C1003s.f4557c) {
                        Log.d("MediaRouter", "Route volume changed: " + iVar);
                    }
                    this.f4582k.mo4758b(260, iVar);
                }
                if ((F & 4) != 0) {
                    if (C1003s.f4557c) {
                        Log.d("MediaRouter", "Route presentation display changed: " + iVar);
                    }
                    this.f4582k.mo4758b(261, iVar);
                }
            }
            return F;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: V */
        public void mo4740V(boolean z) {
            C1022i iVar = this.f4588q;
            if (iVar != null && !iVar.mo4785B()) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f4588q);
                this.f4588q = null;
            }
            if (this.f4588q == null && !this.f4576e.isEmpty()) {
                Iterator<C1022i> it = this.f4576e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1022i next = it.next();
                    if (m5176z(next) && next.mo4785B()) {
                        this.f4588q = next;
                        Log.i("MediaRouter", "Found default route: " + this.f4588q);
                        break;
                    }
                }
            }
            C1022i iVar2 = this.f4589r;
            if (iVar2 != null && !iVar2.mo4785B()) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f4589r);
                this.f4589r = null;
            }
            if (this.f4589r == null && !this.f4576e.isEmpty()) {
                Iterator<C1022i> it2 = this.f4576e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1022i next2 = it2.next();
                    if (m5168A(next2) && next2.mo4785B()) {
                        this.f4589r = next2;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.f4589r);
                        break;
                    }
                }
            }
            C1022i iVar3 = this.f4590s;
            if (iVar3 == null || !iVar3.mo4819x()) {
                Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f4590s);
                mo4731J(mo4744i(), 0);
            } else if (z) {
                mo4724C();
                mo4737R();
            }
        }

        /* renamed from: a */
        public void mo4570a(String str) {
            C1022i a;
            this.f4582k.removeMessages(262);
            C1021h j = m5173j(this.f4584m);
            if (j != null && (a = j.mo4776a(str)) != null) {
                a.mo4791I();
            }
        }

        /* renamed from: b */
        public void mo4528b(C0928b0 b0Var, C0985m.C0995e eVar) {
            if (this.f4591t == eVar) {
                mo4730I(mo4744i(), 2);
            }
        }

        /* renamed from: c */
        public void mo4529c(C0985m mVar) {
            if (m5173j(mVar) == null) {
                C1021h hVar = new C1021h(mVar);
                this.f4578g.add(hVar);
                if (C1003s.f4557c) {
                    Log.d("MediaRouter", "Provider added: " + hVar);
                }
                this.f4582k.mo4758b(513, hVar);
                m5171S(hVar, mVar.mo4650o());
                mVar.mo4654w(this.f4581j);
                mVar.mo4656y(this.f4595x);
            }
        }

        /* renamed from: d */
        public void mo4530d(C0985m mVar) {
            C1021h j = m5173j(mVar);
            if (j != null) {
                mVar.mo4654w((C0985m.C0986a) null);
                mVar.mo4656y((C2639f) null);
                m5171S(j, (C0996n) null);
                if (C1003s.f4557c) {
                    Log.d("MediaRouter", "Provider removed: " + j);
                }
                this.f4582k.mo4758b(IronSourceConstants.INIT_COMPLETE, j);
                this.f4578g.remove(j);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4741f(C1022i iVar) {
            if (this.f4591t instanceof C0985m.C0987b) {
                C1022i.C1023a p = mo4748p(iVar);
                if (this.f4590s.mo4806l().contains(iVar) || p == null || !p.mo4822b()) {
                    Log.w("MediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + iVar);
                    return;
                }
                ((C0985m.C0987b) this.f4591t).mo4499n(iVar.mo4799e());
                return;
            }
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }

        /* renamed from: g */
        public void mo4742g(Object obj) {
            if (m5174k(obj) < 0) {
                this.f4579h.add(new C1018g(obj));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public String mo4743h(C1021h hVar, String str) {
            String flattenToShortString = hVar.mo4778c().flattenToShortString();
            String str2 = flattenToShortString + ":" + str;
            if (m5175l(str2) < 0) {
                this.f4577f.put(new C5644d(flattenToShortString, str), str2);
                return str2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str2, Integer.valueOf(i)});
                if (m5175l(format) < 0) {
                    this.f4577f.put(new C5644d(flattenToShortString, str), format);
                    return format;
                }
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1022i mo4744i() {
            Iterator<C1022i> it = this.f4576e.iterator();
            while (it.hasNext()) {
                C1022i next = it.next();
                if (next != this.f4588q && m5168A(next) && next.mo4785B()) {
                    return next;
                }
            }
            return this.f4588q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1022i mo4745m() {
            return this.f4589r;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo4746n() {
            return this.f4597z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C1022i mo4747o() {
            C1022i iVar = this.f4588q;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public C1022i.C1023a mo4748p(C1022i iVar) {
            return this.f4590s.mo4802h(iVar);
        }

        /* renamed from: q */
        public MediaSessionCompat.Token mo4749q() {
            C1012d dVar = this.f4567C;
            if (dVar != null) {
                return dVar.mo4763c();
            }
            MediaSessionCompat mediaSessionCompat = this.f4569E;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.mo408f();
            }
            return null;
        }

        /* renamed from: r */
        public C1022i mo4750r(String str) {
            Iterator<C1022i> it = this.f4576e.iterator();
            while (it.hasNext()) {
                C1022i next = it.next();
                if (next.f4634c.equals(str)) {
                    return next;
                }
            }
            return null;
        }

        /* renamed from: s */
        public C1003s mo4751s(Context context) {
            int size = this.f4575d.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C1003s sVar = (C1003s) this.f4575d.get(size).get();
                    if (sVar == null) {
                        this.f4575d.remove(size);
                    } else if (sVar.f4559a == context) {
                        return sVar;
                    }
                } else {
                    C1003s sVar2 = new C1003s(context);
                    this.f4575d.add(new WeakReference(sVar2));
                    return sVar2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public C2643j mo4752t() {
            return this.f4586o;
        }

        /* renamed from: u */
        public List<C1022i> mo4753u() {
            return this.f4576e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public C1022i mo4754v() {
            C1022i iVar = this.f4590s;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public String mo4755w(C1021h hVar, String str) {
            return this.f4577f.get(new C5644d(hVar.mo4778c().flattenToShortString(), str));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public boolean mo4756x() {
            return this.f4573b;
        }

        /* renamed from: y */
        public boolean mo4757y(C1001r rVar, int i) {
            if (rVar.mo4693f()) {
                return false;
            }
            if ((i & 2) == 0 && this.f4585n) {
                return true;
            }
            int size = this.f4576e.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1022i iVar = this.f4576e.get(i2);
                if (((i & 1) == 0 || !iVar.mo4818w()) && iVar.mo4787E(rVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.mediarouter.media.s$f */
    /* compiled from: MediaRouter */
    public interface C1019f {
        /* renamed from: a */
        C10412b<Void> mo4772a(C1022i iVar, C1022i iVar2);
    }

    /* renamed from: androidx.mediarouter.media.s$g */
    /* compiled from: MediaRouter */
    static final class C1020g {

        /* renamed from: a */
        final C0985m.C0995e f4618a;

        /* renamed from: b */
        final int f4619b;

        /* renamed from: c */
        private final C1022i f4620c;

        /* renamed from: d */
        final C1022i f4621d;

        /* renamed from: e */
        private final C1022i f4622e;

        /* renamed from: f */
        final List<C0985m.C0987b.C0990c> f4623f;

        /* renamed from: g */
        private final WeakReference<C1008e> f4624g;

        /* renamed from: h */
        private C10412b<Void> f4625h = null;

        /* renamed from: i */
        private boolean f4626i = false;

        /* renamed from: j */
        private boolean f4627j = false;

        C1020g(C1008e eVar, C1022i iVar, C0985m.C0995e eVar2, int i, C1022i iVar2, Collection<C0985m.C0987b.C0990c> collection) {
            ArrayList arrayList = null;
            this.f4624g = new WeakReference<>(eVar);
            this.f4621d = iVar;
            this.f4618a = eVar2;
            this.f4619b = i;
            this.f4620c = eVar.f4590s;
            this.f4622e = iVar2;
            this.f4623f = collection != null ? new ArrayList(collection) : arrayList;
            eVar.f4582k.postDelayed(new C1025u(this), 15000);
        }

        /* renamed from: e */
        private void m5240e() {
            C1008e eVar = (C1008e) this.f4624g.get();
            if (eVar != null) {
                C1022i iVar = this.f4621d;
                eVar.f4590s = iVar;
                eVar.f4591t = this.f4618a;
                C1022i iVar2 = this.f4622e;
                if (iVar2 == null) {
                    eVar.f4582k.mo4759c(262, new C5644d(this.f4620c, iVar), this.f4619b);
                } else {
                    eVar.f4582k.mo4759c(264, new C5644d(iVar2, iVar), this.f4619b);
                }
                eVar.f4594w.clear();
                eVar.mo4724C();
                eVar.mo4737R();
                List<C0985m.C0987b.C0990c> list = this.f4623f;
                if (list != null) {
                    eVar.f4590s.mo4794L(list);
                }
            }
        }

        /* renamed from: g */
        private void m5241g() {
            C1022i iVar;
            C1008e eVar = (C1008e) this.f4624g.get();
            if (eVar != null && eVar.f4590s == (iVar = this.f4620c)) {
                eVar.f4582k.mo4759c(263, iVar, this.f4619b);
                C0985m.C0995e eVar2 = eVar.f4591t;
                if (eVar2 != null) {
                    eVar2.mo4495i(this.f4619b);
                    eVar.f4591t.mo4491e();
                }
                if (!eVar.f4594w.isEmpty()) {
                    for (C0985m.C0995e next : eVar.f4594w.values()) {
                        next.mo4495i(this.f4619b);
                        next.mo4491e();
                    }
                    eVar.f4594w.clear();
                }
                eVar.f4591t = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4773b() {
            if (!this.f4626i && !this.f4627j) {
                this.f4627j = true;
                C0985m.C0995e eVar = this.f4618a;
                if (eVar != null) {
                    eVar.mo4495i(0);
                    this.f4618a.mo4491e();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void m5239d() {
            C10412b<Void> bVar;
            C1003s.m5130d();
            if (!this.f4626i && !this.f4627j) {
                C1008e eVar = (C1008e) this.f4624g.get();
                if (eVar == null || eVar.f4566B != this || ((bVar = this.f4625h) != null && bVar.isCancelled())) {
                    mo4773b();
                    return;
                }
                this.f4626i = true;
                eVar.f4566B = null;
                m5241g();
                m5240e();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4775f(C10412b<Void> bVar) {
            C1008e eVar = (C1008e) this.f4624g.get();
            if (eVar == null || eVar.f4566B != this) {
                Log.w("MediaRouter", "Router is released. Cancel transfer");
                mo4773b();
            } else if (this.f4625h == null) {
                this.f4625h = bVar;
                C1024t tVar = new C1024t(this);
                C1008e.C1011c cVar = eVar.f4582k;
                Objects.requireNonNull(cVar);
                bVar.mo6980a(tVar, new C1026v(cVar));
            } else {
                throw new IllegalStateException("future is already set");
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.s$h */
    /* compiled from: MediaRouter */
    public static final class C1021h {

        /* renamed from: a */
        final C0985m f4628a;

        /* renamed from: b */
        final List<C1022i> f4629b = new ArrayList();

        /* renamed from: c */
        private final C0985m.C0994d f4630c;

        /* renamed from: d */
        private C0996n f4631d;

        C1021h(C0985m mVar) {
            this.f4628a = mVar;
            this.f4630c = mVar.mo4653r();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1022i mo4776a(String str) {
            int size = this.f4629b.size();
            for (int i = 0; i < size; i++) {
                if (this.f4629b.get(i).f4633b.equals(str)) {
                    return this.f4629b.get(i);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4777b(String str) {
            int size = this.f4629b.size();
            for (int i = 0; i < size; i++) {
                if (this.f4629b.get(i).f4633b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: c */
        public ComponentName mo4778c() {
            return this.f4630c.mo4674a();
        }

        /* renamed from: d */
        public String mo4779d() {
            return this.f4630c.mo4675b();
        }

        /* renamed from: e */
        public C0985m mo4780e() {
            C1003s.m5130d();
            return this.f4628a;
        }

        /* renamed from: f */
        public List<C1022i> mo4781f() {
            C1003s.m5130d();
            return Collections.unmodifiableList(this.f4629b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo4782g() {
            C0996n nVar = this.f4631d;
            return nVar != null && nVar.mo4680e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4783h(C0996n nVar) {
            if (this.f4631d == nVar) {
                return false;
            }
            this.f4631d = nVar;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + mo4779d() + " }";
        }
    }

    /* renamed from: androidx.mediarouter.media.s$i */
    /* compiled from: MediaRouter */
    public static class C1022i {

        /* renamed from: a */
        private final C1021h f4632a;

        /* renamed from: b */
        final String f4633b;

        /* renamed from: c */
        final String f4634c;

        /* renamed from: d */
        private String f4635d;

        /* renamed from: e */
        private String f4636e;

        /* renamed from: f */
        private Uri f4637f;

        /* renamed from: g */
        boolean f4638g;

        /* renamed from: h */
        private int f4639h;

        /* renamed from: i */
        private boolean f4640i;

        /* renamed from: j */
        private final ArrayList<IntentFilter> f4641j = new ArrayList<>();

        /* renamed from: k */
        private int f4642k;

        /* renamed from: l */
        private int f4643l;

        /* renamed from: m */
        private int f4644m;

        /* renamed from: n */
        private int f4645n;

        /* renamed from: o */
        private int f4646o;

        /* renamed from: p */
        private int f4647p;

        /* renamed from: q */
        private Display f4648q;

        /* renamed from: r */
        private int f4649r = -1;

        /* renamed from: s */
        private Bundle f4650s;

        /* renamed from: t */
        private IntentSender f4651t;

        /* renamed from: u */
        C0983l f4652u;

        /* renamed from: v */
        private List<C1022i> f4653v = new ArrayList();

        /* renamed from: w */
        private Map<String, C0985m.C0987b.C0990c> f4654w;

        /* renamed from: androidx.mediarouter.media.s$i$a */
        /* compiled from: MediaRouter */
        public static final class C1023a {

            /* renamed from: a */
            final C0985m.C0987b.C0990c f4655a;

            C1023a(C0985m.C0987b.C0990c cVar) {
                this.f4655a = cVar;
            }

            /* renamed from: a */
            public int mo4821a() {
                C0985m.C0987b.C0990c cVar = this.f4655a;
                if (cVar != null) {
                    return cVar.mo4663c();
                }
                return 1;
            }

            /* renamed from: b */
            public boolean mo4822b() {
                C0985m.C0987b.C0990c cVar = this.f4655a;
                return cVar != null && cVar.mo4664d();
            }

            /* renamed from: c */
            public boolean mo4823c() {
                C0985m.C0987b.C0990c cVar = this.f4655a;
                return cVar != null && cVar.mo4665e();
            }

            /* renamed from: d */
            public boolean mo4824d() {
                C0985m.C0987b.C0990c cVar = this.f4655a;
                return cVar == null || cVar.mo4666f();
            }
        }

        C1022i(C1021h hVar, String str, String str2) {
            this.f4632a = hVar;
            this.f4633b = str;
            this.f4634c = str2;
        }

        /* renamed from: A */
        private boolean m5253A(List<IntentFilter> list, List<IntentFilter> list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator<IntentFilter> listIterator = list.listIterator();
            ListIterator<IntentFilter> listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!m5255z(listIterator.next(), listIterator2.next())) {
                    return false;
                }
            }
            if (listIterator.hasNext() || listIterator2.hasNext()) {
                return false;
            }
            return true;
        }

        /* renamed from: D */
        private static boolean m5254D(C1022i iVar) {
            return TextUtils.equals(iVar.mo4812r().mo4653r().mo4675b(), MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        }

        /* renamed from: z */
        private boolean m5255z(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int countActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i = 0; i < countActions; i++) {
                if (!intentFilter.getAction(i).equals(intentFilter2.getAction(i))) {
                    return false;
                }
            }
            int countCategories = intentFilter.countCategories();
            if (countCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i2 = 0; i2 < countCategories; i2++) {
                if (!intentFilter.getCategory(i2).equals(intentFilter2.getCategory(i2))) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public boolean mo4785B() {
            return this.f4652u != null && this.f4638g;
        }

        /* renamed from: C */
        public boolean mo4786C() {
            C1003s.m5130d();
            return C1003s.f4558d.mo4754v() == this;
        }

        /* renamed from: E */
        public boolean mo4787E(C1001r rVar) {
            if (rVar != null) {
                C1003s.m5130d();
                return rVar.mo4695h(this.f4641j);
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public int mo4788F(C0983l lVar) {
            if (this.f4652u != lVar) {
                return mo4793K(lVar);
            }
            return 0;
        }

        /* renamed from: G */
        public void mo4789G(int i) {
            C1003s.m5130d();
            C1003s.f4558d.mo4728G(this, Math.min(this.f4647p, Math.max(0, i)));
        }

        /* renamed from: H */
        public void mo4790H(int i) {
            C1003s.m5130d();
            if (i != 0) {
                C1003s.f4558d.mo4729H(this, i);
            }
        }

        /* renamed from: I */
        public void mo4791I() {
            C1003s.m5130d();
            C1003s.f4558d.mo4730I(this, 3);
        }

        /* renamed from: J */
        public boolean mo4792J(String str) {
            if (str != null) {
                C1003s.m5130d();
                int size = this.f4641j.size();
                for (int i = 0; i < size; i++) {
                    if (this.f4641j.get(i).hasCategory(str)) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public int mo4793K(C0983l lVar) {
            int i;
            this.f4652u = lVar;
            boolean z = false;
            if (lVar == null) {
                return 0;
            }
            if (!C5643c.m24954a(this.f4635d, lVar.mo4616p())) {
                this.f4635d = lVar.mo4616p();
                i = 1;
            } else {
                i = 0;
            }
            if (!C5643c.m24954a(this.f4636e, lVar.mo4608h())) {
                this.f4636e = lVar.mo4608h();
                i |= 1;
            }
            if (!C5643c.m24954a(this.f4637f, lVar.mo4612l())) {
                this.f4637f = lVar.mo4612l();
                i |= 1;
            }
            if (this.f4638g != lVar.mo4625x()) {
                this.f4638g = lVar.mo4625x();
                i |= 1;
            }
            if (this.f4639h != lVar.mo4606f()) {
                this.f4639h = lVar.mo4606f();
                i |= 1;
            }
            if (!m5253A(this.f4641j, lVar.mo4607g())) {
                this.f4641j.clear();
                this.f4641j.addAll(lVar.mo4607g());
                i |= 1;
            }
            if (this.f4642k != lVar.mo4618r()) {
                this.f4642k = lVar.mo4618r();
                i |= 1;
            }
            if (this.f4643l != lVar.mo4617q()) {
                this.f4643l = lVar.mo4617q();
                i |= 1;
            }
            if (this.f4644m != lVar.mo4609i()) {
                this.f4644m = lVar.mo4609i();
                i |= 1;
            }
            if (this.f4645n != lVar.mo4623v()) {
                this.f4645n = lVar.mo4623v();
                i |= 3;
            }
            if (this.f4646o != lVar.mo4622u()) {
                this.f4646o = lVar.mo4622u();
                i |= 3;
            }
            if (this.f4647p != lVar.mo4624w()) {
                this.f4647p = lVar.mo4624w();
                i |= 3;
            }
            if (this.f4649r != lVar.mo4619s()) {
                this.f4649r = lVar.mo4619s();
                this.f4648q = null;
                i |= 5;
            }
            if (!C5643c.m24954a(this.f4650s, lVar.mo4610j())) {
                this.f4650s = lVar.mo4610j();
                i |= 1;
            }
            if (!C5643c.m24954a(this.f4651t, lVar.mo4620t())) {
                this.f4651t = lVar.mo4620t();
                i |= 1;
            }
            if (this.f4640i != lVar.mo4603b()) {
                this.f4640i = lVar.mo4603b();
                i |= 5;
            }
            List<String> k = lVar.mo4611k();
            ArrayList arrayList = new ArrayList();
            if (k.size() != this.f4653v.size()) {
                z = true;
            }
            for (String w : k) {
                C1022i r = C1003s.f4558d.mo4750r(C1003s.f4558d.mo4755w(mo4811q(), w));
                if (r != null) {
                    arrayList.add(r);
                    if (!z && !this.f4653v.contains(r)) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return i;
            }
            this.f4653v = arrayList;
            return i | 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public void mo4794L(Collection<C0985m.C0987b.C0990c> collection) {
            this.f4653v.clear();
            if (this.f4654w == null) {
                this.f4654w = new C6077a();
            }
            this.f4654w.clear();
            for (C0985m.C0987b.C0990c next : collection) {
                C1022i b = mo4796b(next);
                if (b != null) {
                    this.f4654w.put(b.f4634c, next);
                    if (next.mo4663c() == 2 || next.mo4663c() == 3) {
                        this.f4653v.add(b);
                    }
                }
            }
            C1003s.f4558d.f4582k.mo4758b(259, this);
        }

        /* renamed from: a */
        public boolean mo4795a() {
            return this.f4640i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1022i mo4796b(C0985m.C0987b.C0990c cVar) {
            return mo4811q().mo4776a(cVar.mo4662b().mo4613m());
        }

        /* renamed from: c */
        public int mo4797c() {
            return this.f4639h;
        }

        /* renamed from: d */
        public String mo4798d() {
            return this.f4636e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo4799e() {
            return this.f4633b;
        }

        /* renamed from: f */
        public int mo4800f() {
            return this.f4644m;
        }

        /* renamed from: g */
        public C0985m.C0987b mo4801g() {
            C0985m.C0995e eVar = C1003s.f4558d.f4591t;
            if (eVar instanceof C0985m.C0987b) {
                return (C0985m.C0987b) eVar;
            }
            return null;
        }

        /* renamed from: h */
        public C1023a mo4802h(C1022i iVar) {
            Map<String, C0985m.C0987b.C0990c> map = this.f4654w;
            if (map == null || !map.containsKey(iVar.f4634c)) {
                return null;
            }
            return new C1023a(this.f4654w.get(iVar.f4634c));
        }

        /* renamed from: i */
        public Bundle mo4803i() {
            return this.f4650s;
        }

        /* renamed from: j */
        public Uri mo4804j() {
            return this.f4637f;
        }

        /* renamed from: k */
        public String mo4805k() {
            return this.f4634c;
        }

        /* renamed from: l */
        public List<C1022i> mo4806l() {
            return Collections.unmodifiableList(this.f4653v);
        }

        /* renamed from: m */
        public String mo4807m() {
            return this.f4635d;
        }

        /* renamed from: n */
        public int mo4808n() {
            return this.f4643l;
        }

        /* renamed from: o */
        public int mo4809o() {
            return this.f4642k;
        }

        /* renamed from: p */
        public int mo4810p() {
            return this.f4649r;
        }

        /* renamed from: q */
        public C1021h mo4811q() {
            return this.f4632a;
        }

        /* renamed from: r */
        public C0985m mo4812r() {
            return this.f4632a.mo4780e();
        }

        /* renamed from: s */
        public int mo4813s() {
            return this.f4646o;
        }

        /* renamed from: t */
        public int mo4814t() {
            return this.f4645n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.f4634c + ", name=" + this.f4635d + ", description=" + this.f4636e + ", iconUri=" + this.f4637f + ", enabled=" + this.f4638g + ", connectionState=" + this.f4639h + ", canDisconnect=" + this.f4640i + ", playbackType=" + this.f4642k + ", playbackStream=" + this.f4643l + ", deviceType=" + this.f4644m + ", volumeHandling=" + this.f4645n + ", volume=" + this.f4646o + ", volumeMax=" + this.f4647p + ", presentationDisplayId=" + this.f4649r + ", extras=" + this.f4650s + ", settingsIntent=" + this.f4651t + ", providerPackageName=" + this.f4632a.mo4779d());
            if (mo4820y()) {
                sb.append(", members=[");
                int size = this.f4653v.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (this.f4653v.get(i) != this) {
                        sb.append(this.f4653v.get(i).mo4805k());
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }

        /* renamed from: u */
        public int mo4816u() {
            return this.f4647p;
        }

        /* renamed from: v */
        public boolean mo4817v() {
            C1003s.m5130d();
            return C1003s.f4558d.mo4747o() == this;
        }

        /* renamed from: w */
        public boolean mo4818w() {
            if (mo4817v() || this.f4644m == 3) {
                return true;
            }
            if (!m5254D(this) || !mo4792J("android.media.intent.category.LIVE_AUDIO") || mo4792J("android.media.intent.category.LIVE_VIDEO")) {
                return false;
            }
            return true;
        }

        /* renamed from: x */
        public boolean mo4819x() {
            return this.f4638g;
        }

        /* renamed from: y */
        public boolean mo4820y() {
            return mo4806l().size() >= 1;
        }
    }

    C1003s(Context context) {
        this.f4559a = context;
    }

    /* renamed from: d */
    static void m5130d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    /* renamed from: e */
    private int m5131e(C1005b bVar) {
        int size = this.f4560b.size();
        for (int i = 0; i < size; i++) {
            if (this.f4560b.get(i).f4562b == bVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: g */
    static int m5132g() {
        C1008e eVar = f4558d;
        if (eVar == null) {
            return 0;
        }
        return eVar.mo4746n();
    }

    /* renamed from: h */
    public static C1003s m5133h(Context context) {
        if (context != null) {
            m5130d();
            if (f4558d == null) {
                C1008e eVar = new C1008e(context.getApplicationContext());
                f4558d = eVar;
                eVar.mo4734N();
            }
            return f4558d.mo4751s(context);
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* renamed from: m */
    public static boolean m5134m() {
        C1008e eVar = f4558d;
        if (eVar == null) {
            return false;
        }
        return eVar.mo4756x();
    }

    /* renamed from: o */
    static boolean m5135o() {
        C1008e eVar = f4558d;
        if (eVar == null) {
            return false;
        }
        return eVar.mo4723B();
    }

    /* renamed from: a */
    public void mo4702a(C1001r rVar, C1005b bVar) {
        mo4703b(rVar, bVar, 0);
    }

    /* renamed from: b */
    public void mo4703b(C1001r rVar, C1005b bVar, int i) {
        C1006c cVar;
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (bVar != null) {
            m5130d();
            if (f4557c) {
                Log.d("MediaRouter", "addCallback: selector=" + rVar + ", callback=" + bVar + ", flags=" + Integer.toHexString(i));
            }
            int e = m5131e(bVar);
            if (e < 0) {
                cVar = new C1006c(this, bVar);
                this.f4560b.add(cVar);
            } else {
                cVar = this.f4560b.get(e);
            }
            boolean z = false;
            boolean z2 = true;
            if (i != cVar.f4564d) {
                cVar.f4564d = i;
                z = true;
            }
            if (!cVar.f4563c.mo4689b(rVar)) {
                cVar.f4563c = new C1001r.C1002a(cVar.f4563c).mo4700c(rVar).mo4701d();
            } else {
                z2 = z;
            }
            if (z2) {
                f4558d.mo4736P();
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    /* renamed from: c */
    public void mo4704c(C1022i iVar) {
        m5130d();
        f4558d.mo4741f(iVar);
    }

    /* renamed from: f */
    public C1022i mo4705f() {
        m5130d();
        return f4558d.mo4747o();
    }

    /* renamed from: i */
    public MediaSessionCompat.Token mo4706i() {
        return f4558d.mo4749q();
    }

    /* renamed from: j */
    public C2643j mo4707j() {
        m5130d();
        return f4558d.mo4752t();
    }

    /* renamed from: k */
    public List<C1022i> mo4708k() {
        m5130d();
        return f4558d.mo4753u();
    }

    /* renamed from: l */
    public C1022i mo4709l() {
        m5130d();
        return f4558d.mo4754v();
    }

    /* renamed from: n */
    public boolean mo4710n(C1001r rVar, int i) {
        if (rVar != null) {
            m5130d();
            return f4558d.mo4757y(rVar, i);
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* renamed from: p */
    public void mo4711p(C1005b bVar) {
        if (bVar != null) {
            m5130d();
            if (f4557c) {
                Log.d("MediaRouter", "removeCallback: callback=" + bVar);
            }
            int e = m5131e(bVar);
            if (e >= 0) {
                this.f4560b.remove(e);
                f4558d.mo4736P();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* renamed from: q */
    public void mo4712q(C1022i iVar) {
        m5130d();
        f4558d.mo4726E(iVar);
    }

    /* renamed from: r */
    public void mo4713r(C1022i iVar) {
        if (iVar != null) {
            m5130d();
            if (f4557c) {
                Log.d("MediaRouter", "selectRoute: " + iVar);
            }
            f4558d.mo4730I(iVar, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    /* renamed from: s */
    public void mo4714s(MediaSessionCompat mediaSessionCompat) {
        if (f4557c) {
            Log.d("MediaRouter", "addMediaSessionCompat: " + mediaSessionCompat);
        }
        f4558d.mo4732K(mediaSessionCompat);
    }

    /* renamed from: t */
    public void mo4715t(C2643j jVar) {
        m5130d();
        f4558d.mo4733M(jVar);
    }

    /* renamed from: u */
    public void mo4716u(C1022i iVar) {
        m5130d();
        f4558d.mo4735O(iVar);
    }

    /* renamed from: v */
    public void mo4717v(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        m5130d();
        C1022i i2 = f4558d.mo4744i();
        if (f4558d.mo4754v() != i2) {
            f4558d.mo4730I(i2, i);
        }
    }
}
