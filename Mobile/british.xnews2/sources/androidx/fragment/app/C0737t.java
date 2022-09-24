package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p089i0.C5421b;
import p110m0.C5720r;
import p110m0.C5723u;
import p110m0.C5738w;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.t */
/* compiled from: FragmentTransitionImpl */
public abstract class C0737t {

    /* renamed from: androidx.fragment.app.t$a */
    /* compiled from: FragmentTransitionImpl */
    class C0738a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f3734b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f3735c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3736d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f3737e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3738f;

        C0738a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3734b = i;
            this.f3735c = arrayList;
            this.f3736d = arrayList2;
            this.f3737e = arrayList3;
            this.f3738f = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f3734b; i++) {
                C5723u.m25274F0((View) this.f3735c.get(i), (String) this.f3736d.get(i));
                C5723u.m25274F0((View) this.f3737e.get(i), (String) this.f3738f.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    /* compiled from: FragmentTransitionImpl */
    class C0739b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3740b;

        /* renamed from: c */
        final /* synthetic */ Map f3741c;

        C0739b(ArrayList arrayList, Map map) {
            this.f3740b = arrayList;
            this.f3741c = map;
        }

        public void run() {
            int size = this.f3740b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3740b.get(i);
                String K = C5723u.m25283K(view);
                if (K != null) {
                    C5723u.m25274F0(view, C0737t.m4141i(this.f3741c, K));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$c */
    /* compiled from: FragmentTransitionImpl */
    class C0740c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ArrayList f3743b;

        /* renamed from: c */
        final /* synthetic */ Map f3744c;

        C0740c(ArrayList arrayList, Map map) {
            this.f3743b = arrayList;
            this.f3744c = map;
        }

        public void run() {
            int size = this.f3743b.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f3743b.get(i);
                C5723u.m25274F0(view, (String) this.f3744c.get(C5723u.m25283K(view)));
            }
        }
    }

    /* renamed from: d */
    protected static void m4139d(List<View> list, View view) {
        int size = list.size();
        if (!m4140h(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m4140h(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m4140h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m4141i(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* renamed from: l */
    protected static boolean m4142l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo3865A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo3866B(Object obj);

    /* renamed from: a */
    public abstract void mo3867a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3868b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo3869c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo3870e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3899f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C5738w.m25406a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo3899f(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: g */
    public abstract Object mo3871g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3900j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String K = C5723u.m25283K(view);
            if (K != null) {
                map.put(K, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo3900j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo3901k(View view, Rect rect) {
        if (C5723u.m25293S(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo3872m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo3873n(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> mo3902o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C5723u.m25283K(view));
            C5723u.m25274F0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo3874p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo3875q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo3876r(Object obj, View view, ArrayList<View> arrayList);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo3903s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C5720r.m25259a(viewGroup, new C0740c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo3877t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo3878u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo3879v(Object obj, View view);

    /* renamed from: w */
    public void mo3880w(Fragment fragment, Object obj, C5421b bVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3904x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C5720r.m25259a(view, new C0739b(arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3905y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String K = C5723u.m25283K(view2);
            arrayList4.add(K);
            if (K != null) {
                C5723u.m25274F0(view2, (String) null);
                String str = map.get(K);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C5723u.m25274F0(arrayList2.get(i2), K);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C5720r.m25259a(view, new C0738a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo3881z(Object obj, View view, ArrayList<View> arrayList);
}
