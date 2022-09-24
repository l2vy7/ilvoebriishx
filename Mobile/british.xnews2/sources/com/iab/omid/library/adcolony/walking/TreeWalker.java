package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.p043c.C4837a;
import com.iab.omid.library.adcolony.p043c.C4839b;
import com.iab.omid.library.adcolony.p044d.C4843b;
import com.iab.omid.library.adcolony.p044d.C4846d;
import com.iab.omid.library.adcolony.p044d.C4848f;
import com.iab.omid.library.adcolony.walking.C4858a;
import com.iab.omid.library.adcolony.walking.p046a.C4864c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C4837a.C4838a {

    /* renamed from: g */
    private static TreeWalker f21736g = new TreeWalker();

    /* renamed from: h */
    private static Handler f21737h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static Handler f21738i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f21739j = new C4856b();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f21740k = new C4857c();

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f21741a = new ArrayList();

    /* renamed from: b */
    private int f21742b;

    /* renamed from: c */
    private C4839b f21743c = new C4839b();

    /* renamed from: d */
    private C4858a f21744d = new C4858a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4868b f21745e = new C4868b(new C4864c());

    /* renamed from: f */
    private long f21746f;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.TreeWalker$a */
    class C4855a implements Runnable {
        C4855a() {
        }

        public void run() {
            TreeWalker.this.f21745e.mo20218a();
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.TreeWalker$b */
    static class C4856b implements Runnable {
        C4856b() {
        }

        public void run() {
            TreeWalker.getInstance().m22398h();
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.TreeWalker$c */
    static class C4857c implements Runnable {
        C4857c() {
        }

        public void run() {
            if (TreeWalker.f21738i != null) {
                TreeWalker.f21738i.post(TreeWalker.f21739j);
                TreeWalker.f21738i.postDelayed(TreeWalker.f21740k, 200);
            }
        }
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22389a(long j) {
        if (this.f21741a.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f21741a) {
                next.onTreeProcessed(this.f21742b, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f21742b, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22390a(View view, C4837a aVar, JSONObject jSONObject, C4869c cVar) {
        aVar.mo20149a(view, jSONObject, this, cVar == C4869c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22391a(String str, View view, JSONObject jSONObject) {
        C4837a b = this.f21743c.mo20152b();
        String a = this.f21744d.mo20192a(str);
        if (a != null) {
            JSONObject a2 = b.mo20148a(view);
            C4843b.m22328a(a2, str);
            C4843b.m22333b(a2, a);
            C4843b.m22330a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22392a(View view, JSONObject jSONObject) {
        String a = this.f21744d.mo20191a(view);
        if (a == null) {
            return false;
        }
        C4843b.m22328a(jSONObject, a);
        this.f21744d.mo20200e();
        return true;
    }

    /* renamed from: b */
    private void m22393b(View view, JSONObject jSONObject) {
        C4858a.C4859a b = this.f21744d.mo20195b(view);
        if (b != null) {
            C4843b.m22327a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f21736g;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22398h() {
        m22399i();
        mo20184d();
        m22400j();
    }

    /* renamed from: i */
    private void m22399i() {
        this.f21742b = 0;
        this.f21746f = C4846d.m22341a();
    }

    /* renamed from: j */
    private void m22400j() {
        m22389a(C4846d.m22341a() - this.f21746f);
    }

    /* renamed from: k */
    private void m22401k() {
        if (f21738i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21738i = handler;
            handler.post(f21739j);
            f21738i.postDelayed(f21740k, 200);
        }
    }

    /* renamed from: l */
    private void m22402l() {
        Handler handler = f21738i;
        if (handler != null) {
            handler.removeCallbacks(f21740k);
            f21738i = null;
        }
    }

    /* renamed from: a */
    public void mo20180a() {
        m22401k();
    }

    /* renamed from: a */
    public void mo20150a(View view, C4837a aVar, JSONObject jSONObject) {
        C4869c c;
        if (C4848f.m22358d(view) && (c = this.f21744d.mo20197c(view)) != C4869c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo20148a(view);
            C4843b.m22330a(jSONObject, a);
            if (!m22392a(view, a)) {
                m22393b(view, a);
                m22390a(view, aVar, a, c);
            }
            this.f21742b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f21741a.contains(treeWalkerTimeLogger)) {
            this.f21741a.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo20182b() {
        mo20183c();
        this.f21741a.clear();
        f21737h.post(new C4855a());
    }

    /* renamed from: c */
    public void mo20183c() {
        m22402l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo20184d() {
        this.f21744d.mo20198c();
        long a = C4846d.m22341a();
        C4837a a2 = this.f21743c.mo20151a();
        if (this.f21744d.mo20196b().size() > 0) {
            Iterator<String> it = this.f21744d.mo20196b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo20148a((View) null);
                m22391a(next, this.f21744d.mo20194b(next), a3);
                C4843b.m22326a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f21745e.mo20220b(a3, hashSet, a);
            }
        }
        if (this.f21744d.mo20193a().size() > 0) {
            JSONObject a4 = a2.mo20148a((View) null);
            m22390a((View) null, a2, a4, C4869c.PARENT_VIEW);
            C4843b.m22326a(a4);
            this.f21745e.mo20219a(a4, this.f21744d.mo20193a(), a);
        } else {
            this.f21745e.mo20218a();
        }
        this.f21744d.mo20199d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21741a.contains(treeWalkerTimeLogger)) {
            this.f21741a.remove(treeWalkerTimeLogger);
        }
    }
}
