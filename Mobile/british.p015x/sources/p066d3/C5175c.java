package p066d3;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.facebook.internal.C3558v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p066d3.C5168a;
import p066d3.C5179d;
import p072e3.C5229a;
import p072e3.C5232b;
import p072e3.C5233c;
import p072e3.C5237f;

/* renamed from: d3.c */
/* compiled from: CodelessMatcher */
class C5175c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f22626f = "d3.c";

    /* renamed from: g */
    private static C5175c f22627g;

    /* renamed from: a */
    private final Handler f22628a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private Set<Activity> f22629b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private Set<C5178c> f22630c = new HashSet();

    /* renamed from: d */
    private HashSet<String> f22631d = new HashSet<>();

    /* renamed from: e */
    private HashMap<Integer, HashSet<String>> f22632e = new HashMap<>();

    /* renamed from: d3.c$a */
    /* compiled from: CodelessMatcher */
    class C5176a implements Runnable {
        C5176a() {
        }

        public void run() {
            C5175c.this.m23515g();
        }
    }

    /* renamed from: d3.c$b */
    /* compiled from: CodelessMatcher */
    public static class C5177b {

        /* renamed from: a */
        private WeakReference<View> f22634a;

        /* renamed from: b */
        private String f22635b;

        public C5177b(View view, String str) {
            this.f22634a = new WeakReference<>(view);
            this.f22635b = str;
        }

        /* renamed from: a */
        public View mo21359a() {
            WeakReference<View> weakReference = this.f22634a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        /* renamed from: b */
        public String mo21360b() {
            return this.f22635b;
        }
    }

    /* renamed from: d3.c$c */
    /* compiled from: CodelessMatcher */
    protected static class C5178c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: b */
        private WeakReference<View> f22636b;

        /* renamed from: c */
        private List<C5229a> f22637c;

        /* renamed from: d */
        private final Handler f22638d;

        /* renamed from: e */
        private HashSet<String> f22639e;

        /* renamed from: f */
        private final String f22640f;

        public C5178c(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f22636b = new WeakReference<>(view);
            this.f22638d = handler;
            this.f22639e = hashSet;
            this.f22640f = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        private void m23522a(C5177b bVar, View view, C5229a aVar) {
            if (aVar != null) {
                try {
                    View a = bVar.mo21359a();
                    if (a != null) {
                        View a2 = C5237f.m23733a(a);
                        if (a2 != null && C5237f.m23747o(a, a2)) {
                            m23525d(bVar, view, aVar);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react")) {
                            if (!(a instanceof AdapterView)) {
                                m23523b(bVar, view, aVar);
                            } else if (a instanceof ListView) {
                                m23524c(bVar, view, aVar);
                            }
                        }
                    }
                } catch (Exception e) {
                    C3481f0.m11608S(C5175c.f22626f, e);
                }
            }
        }

        /* renamed from: b */
        private void m23523b(C5177b bVar, View view, C5229a aVar) {
            View a = bVar.mo21359a();
            if (a != null) {
                String b = bVar.mo21360b();
                View.OnClickListener f = C5237f.m23738f(a);
                boolean z = (f instanceof C5168a.C5170b) && ((C5168a.C5170b) f).mo21349a();
                if (!this.f22639e.contains(b) && !z) {
                    a.setOnClickListener(C5168a.m23490b(aVar, view, a));
                    this.f22639e.add(b);
                }
            }
        }

        /* renamed from: c */
        private void m23524c(C5177b bVar, View view, C5229a aVar) {
            AdapterView adapterView = (AdapterView) bVar.mo21359a();
            if (adapterView != null) {
                String b = bVar.mo21360b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                boolean z = (onItemClickListener instanceof C5168a.C5171c) && ((C5168a.C5171c) onItemClickListener).mo21351a();
                if (!this.f22639e.contains(b) && !z) {
                    adapterView.setOnItemClickListener(C5168a.m23491c(aVar, view, adapterView));
                    this.f22639e.add(b);
                }
            }
        }

        /* renamed from: d */
        private void m23525d(C5177b bVar, View view, C5229a aVar) {
            View a = bVar.mo21359a();
            if (a != null) {
                String b = bVar.mo21360b();
                View.OnTouchListener g = C5237f.m23739g(a);
                boolean z = (g instanceof C5179d.C5180a) && ((C5179d.C5180a) g).mo21365a();
                if (!this.f22639e.contains(b) && !z) {
                    a.setOnTouchListener(C5179d.m23531a(aVar, view, a));
                    this.f22639e.add(b);
                }
            }
        }

        /* renamed from: f */
        public static List<C5177b> m23526f(C5229a aVar, View view, List<C5233c> list, int i, int i2, String str) {
            String str2 = str + "." + String.valueOf(i2);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C5177b(view, str2));
            } else {
                C5233c cVar = list.get(i);
                if (cVar.f22767a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> g = m23527g((ViewGroup) parent);
                        int size = g.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m23526f(aVar, g.get(i3), list, i + 1, i3, str2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f22767a.equals(".")) {
                    arrayList.add(new C5177b(view, str2));
                    return arrayList;
                } else if (!m23528h(view, cVar, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C5177b(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> g2 = m23527g((ViewGroup) view);
                int size2 = g2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m23526f(aVar, g2.get(i4), list, i + 1, i4, str2));
                }
            }
            return arrayList;
        }

        /* renamed from: g */
        private static List<View> m23527g(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0041;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m23528h(android.view.View r5, p072e3.C5233c r6, int r7) {
            /*
                int r0 = r6.f22768b
                r1 = 0
                r2 = -1
                if (r0 == r2) goto L_0x0009
                if (r7 == r0) goto L_0x0009
                return r1
            L_0x0009:
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.getCanonicalName()
                java.lang.String r0 = r6.f22767a
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 != 0) goto L_0x0042
                java.lang.String r7 = r6.f22767a
                java.lang.String r2 = ".*android\\..*"
                boolean r7 = r7.matches(r2)
                if (r7 == 0) goto L_0x0041
                java.lang.String r7 = r6.f22767a
                java.lang.String r2 = "\\."
                java.lang.String[] r7 = r7.split(r2)
                int r2 = r7.length
                if (r2 <= 0) goto L_0x0041
                int r2 = r7.length
                int r2 = r2 - r0
                r7 = r7[r2]
                java.lang.Class r2 = r5.getClass()
                java.lang.String r2 = r2.getSimpleName()
                boolean r7 = r2.equals(r7)
                if (r7 != 0) goto L_0x0042
            L_0x0041:
                return r1
            L_0x0042:
                int r7 = r6.f22774h
                e3.c$a r2 = p072e3.C5233c.C5234a.ID
                int r2 = r2.mo21471d()
                r7 = r7 & r2
                if (r7 <= 0) goto L_0x0056
                int r7 = r6.f22769c
                int r2 = r5.getId()
                if (r7 == r2) goto L_0x0056
                return r1
            L_0x0056:
                int r7 = r6.f22774h
                e3.c$a r2 = p072e3.C5233c.C5234a.f22776d
                int r2 = r2.mo21471d()
                r7 = r7 & r2
                java.lang.String r2 = ""
                if (r7 <= 0) goto L_0x007e
                java.lang.String r7 = r6.f22770d
                java.lang.String r3 = p072e3.C5237f.m23742j(r5)
                java.lang.String r4 = com.facebook.internal.C3481f0.m11647p0(r3)
                java.lang.String r4 = com.facebook.internal.C3481f0.m11632i(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x007e
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x007e
                return r1
            L_0x007e:
                int r7 = r6.f22774h
                e3.c$a r3 = p072e3.C5233c.C5234a.DESCRIPTION
                int r3 = r3.mo21471d()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00b0
                java.lang.String r7 = r6.f22772f
                java.lang.CharSequence r3 = r5.getContentDescription()
                if (r3 != 0) goto L_0x0093
                r3 = r2
                goto L_0x009b
            L_0x0093:
                java.lang.CharSequence r3 = r5.getContentDescription()
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L_0x009b:
                java.lang.String r4 = com.facebook.internal.C3481f0.m11647p0(r3)
                java.lang.String r4 = com.facebook.internal.C3481f0.m11632i(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00b0
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00b0
                return r1
            L_0x00b0:
                int r7 = r6.f22774h
                e3.c$a r3 = p072e3.C5233c.C5234a.HINT
                int r3 = r3.mo21471d()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00d6
                java.lang.String r7 = r6.f22773g
                java.lang.String r3 = p072e3.C5237f.m23740h(r5)
                java.lang.String r4 = com.facebook.internal.C3481f0.m11647p0(r3)
                java.lang.String r4 = com.facebook.internal.C3481f0.m11632i(r4, r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00d6
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00d6
                return r1
            L_0x00d6:
                int r7 = r6.f22774h
                e3.c$a r3 = p072e3.C5233c.C5234a.TAG
                int r3 = r3.mo21471d()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x0108
                java.lang.String r6 = r6.f22771e
                java.lang.Object r7 = r5.getTag()
                if (r7 != 0) goto L_0x00eb
                r5 = r2
                goto L_0x00f3
            L_0x00eb:
                java.lang.Object r5 = r5.getTag()
                java.lang.String r5 = java.lang.String.valueOf(r5)
            L_0x00f3:
                java.lang.String r7 = com.facebook.internal.C3481f0.m11647p0(r5)
                java.lang.String r7 = com.facebook.internal.C3481f0.m11632i(r7, r2)
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0108
                boolean r5 = r6.equals(r7)
                if (r5 != 0) goto L_0x0108
                return r1
            L_0x0108:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p066d3.C5175c.C5178c.m23528h(android.view.View, e3.c, int):boolean");
        }

        /* renamed from: i */
        private void m23529i() {
            if (this.f22637c != null && this.f22636b.get() != null) {
                for (int i = 0; i < this.f22637c.size(); i++) {
                    mo21361e(this.f22637c.get(i), (View) this.f22636b.get());
                }
            }
        }

        /* renamed from: e */
        public void mo21361e(C5229a aVar, View view) {
            if (aVar != null && view != null) {
                if (TextUtils.isEmpty(aVar.mo21467a()) || aVar.mo21467a().equals(this.f22640f)) {
                    List<C5233c> e = aVar.mo21470e();
                    if (e.size() <= 25) {
                        for (C5177b a : m23526f(aVar, view, e, 0, -1, this.f22640f)) {
                            m23522a(a, view, aVar);
                        }
                    }
                }
            }
        }

        public void onGlobalLayout() {
            m23529i();
        }

        public void onScrollChanged() {
            m23529i();
        }

        public void run() {
            View view;
            C3520m j = C3522n.m11804j(C3642m.m12280f());
            if (j != null && j.mo11997b()) {
                List<C5229a> f = C5229a.m23717f(j.mo11999d());
                this.f22637c = f;
                if (f != null && (view = (View) this.f22636b.get()) != null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    m23529i();
                }
            }
        }
    }

    private C5175c() {
    }

    /* renamed from: e */
    public static synchronized C5175c m23513e() {
        C5175c cVar;
        synchronized (C5175c.class) {
            if (f22627g == null) {
                f22627g = new C5175c();
            }
            cVar = f22627g;
        }
        return cVar;
    }

    /* renamed from: f */
    public static Bundle m23514f(C5229a aVar, View view, View view2) {
        List<C5232b> d;
        List<C5177b> list;
        Bundle bundle = new Bundle();
        if (!(aVar == null || (d = aVar.mo21469d()) == null)) {
            for (C5232b next : d) {
                String str = next.f22764b;
                if (str == null || str.length() <= 0) {
                    if (next.f22765c.size() > 0) {
                        if (next.f22766d.equals("relative")) {
                            list = C5178c.m23526f(aVar, view2, next.f22765c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            list = C5178c.m23526f(aVar, view, next.f22765c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<C5177b> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C5177b next2 = it.next();
                            if (next2.mo21359a() != null) {
                                String j = C5237f.m23742j(next2.mo21359a());
                                if (j.length() > 0) {
                                    bundle.putString(next.f22763a, j);
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    bundle.putString(next.f22763a, next.f22764b);
                }
            }
        }
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m23515g() {
        for (Activity next : this.f22629b) {
            if (next != null) {
                this.f22630c.add(new C5178c(next.getWindow().getDecorView().getRootView(), this.f22628a, this.f22631d, next.getClass().getSimpleName()));
            }
        }
    }

    /* renamed from: i */
    private void m23516i() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m23515g();
        } else {
            this.f22628a.post(new C5176a());
        }
    }

    /* renamed from: c */
    public void mo21355c(Activity activity) {
        if (!C3558v.m11885b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f22629b.add(activity);
                this.f22631d.clear();
                if (this.f22632e.containsKey(Integer.valueOf(activity.hashCode()))) {
                    this.f22631d = this.f22632e.get(Integer.valueOf(activity.hashCode()));
                }
                m23516i();
                return;
            }
            throw new C3572j("Can't add activity to CodelessMatcher on non-UI thread");
        }
    }

    /* renamed from: d */
    public void mo21356d(Activity activity) {
        this.f22632e.remove(Integer.valueOf(activity.hashCode()));
    }

    /* renamed from: h */
    public void mo21357h(Activity activity) {
        if (!C3558v.m11885b()) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f22629b.remove(activity);
                this.f22630c.clear();
                this.f22632e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f22631d.clone());
                this.f22631d.clear();
                return;
            }
            throw new C3572j("Can't remove activity from CodelessMatcher on non-UI thread");
        }
    }
}
