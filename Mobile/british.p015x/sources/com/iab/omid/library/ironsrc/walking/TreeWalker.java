package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.p050c.C4887a;
import com.iab.omid.library.ironsrc.p050c.C4889b;
import com.iab.omid.library.ironsrc.p051d.C4893b;
import com.iab.omid.library.ironsrc.p051d.C4896d;
import com.iab.omid.library.ironsrc.p051d.C4898f;
import com.iab.omid.library.ironsrc.walking.C4908a;
import com.iab.omid.library.ironsrc.walking.p053a.C4914c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4887a.C4888a {

    /* renamed from: a */
    private static TreeWalker f21850a = new TreeWalker();

    /* renamed from: b */
    private static Handler f21851b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f21852c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f21853j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m22619h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f21854k = new Runnable() {
        public final void run() {
            if (TreeWalker.f21852c != null) {
                TreeWalker.f21852c.post(TreeWalker.f21853j);
                TreeWalker.f21852c.postDelayed(TreeWalker.f21854k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f21855d = new ArrayList();

    /* renamed from: e */
    private int f21856e;

    /* renamed from: f */
    private C4889b f21857f = new C4889b();

    /* renamed from: g */
    private C4908a f21858g = new C4908a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4918b f21859h = new C4918b(new C4914c());

    /* renamed from: i */
    private long f21860i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22610a(long j) {
        if (this.f21855d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f21855d) {
                next.onTreeProcessed(this.f21856e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f21856e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22611a(View view, C4887a aVar, JSONObject jSONObject, C4919c cVar) {
        aVar.mo20335a(view, jSONObject, this, cVar == C4919c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22612a(String str, View view, JSONObject jSONObject) {
        C4887a b = this.f21857f.mo20338b();
        String a = this.f21858g.mo20378a(str);
        if (a != null) {
            JSONObject a2 = b.mo20334a(view);
            C4893b.m22549a(a2, str);
            C4893b.m22554b(a2, a);
            C4893b.m22551a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22613a(View view, JSONObject jSONObject) {
        String a = this.f21858g.mo20377a(view);
        if (a == null) {
            return false;
        }
        C4893b.m22549a(jSONObject, a);
        this.f21858g.mo20386e();
        return true;
    }

    /* renamed from: b */
    private void m22614b(View view, JSONObject jSONObject) {
        C4908a.C4909a b = this.f21858g.mo20381b(view);
        if (b != null) {
            C4893b.m22548a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f21850a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22619h() {
        m22620i();
        mo20370d();
        m22621j();
    }

    /* renamed from: i */
    private void m22620i() {
        this.f21856e = 0;
        this.f21860i = C4896d.m22562a();
    }

    /* renamed from: j */
    private void m22621j() {
        m22610a(C4896d.m22562a() - this.f21860i);
    }

    /* renamed from: k */
    private void m22622k() {
        if (f21852c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21852c = handler;
            handler.post(f21853j);
            f21852c.postDelayed(f21854k, 200);
        }
    }

    /* renamed from: l */
    private void m22623l() {
        Handler handler = f21852c;
        if (handler != null) {
            handler.removeCallbacks(f21854k);
            f21852c = null;
        }
    }

    /* renamed from: a */
    public void mo20366a() {
        m22622k();
    }

    /* renamed from: a */
    public void mo20336a(View view, C4887a aVar, JSONObject jSONObject) {
        C4919c c;
        if (C4898f.m22579d(view) && (c = this.f21858g.mo20383c(view)) != C4919c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo20334a(view);
            C4893b.m22551a(jSONObject, a);
            if (!m22613a(view, a)) {
                m22614b(view, a);
                m22611a(view, aVar, a, c);
            }
            this.f21856e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f21855d.contains(treeWalkerTimeLogger)) {
            this.f21855d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo20368b() {
        mo20369c();
        this.f21855d.clear();
        f21851b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f21859h.mo20404a();
            }
        });
    }

    /* renamed from: c */
    public void mo20369c() {
        m22623l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo20370d() {
        this.f21858g.mo20384c();
        long a = C4896d.m22562a();
        C4887a a2 = this.f21857f.mo20337a();
        if (this.f21858g.mo20382b().size() > 0) {
            Iterator<String> it = this.f21858g.mo20382b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo20334a((View) null);
                m22612a(next, this.f21858g.mo20380b(next), a3);
                C4893b.m22547a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f21859h.mo20406b(a3, hashSet, a);
            }
        }
        if (this.f21858g.mo20379a().size() > 0) {
            JSONObject a4 = a2.mo20334a((View) null);
            m22611a((View) null, a2, a4, C4919c.PARENT_VIEW);
            C4893b.m22547a(a4);
            this.f21859h.mo20405a(a4, this.f21858g.mo20379a(), a);
        } else {
            this.f21859h.mo20404a();
        }
        this.f21858g.mo20385d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21855d.contains(treeWalkerTimeLogger)) {
            this.f21855d.remove(treeWalkerTimeLogger);
        }
    }
}
