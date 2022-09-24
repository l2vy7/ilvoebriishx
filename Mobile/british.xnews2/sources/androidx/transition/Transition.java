package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import p010b0.C1532g;
import p110m0.C5723u;
import p111m1.C5748d;
import p149t.C6077a;
import p149t.C6082d;
import p149t.C6090g;

public abstract class Transition implements Cloneable {

    /* renamed from: I */
    private static final int[] f5776I = {2, 1, 3, 4};

    /* renamed from: J */
    private static final PathMotion f5777J = new C1276a();

    /* renamed from: K */
    private static ThreadLocal<C6077a<Animator, C1279d>> f5778K = new ThreadLocal<>();

    /* renamed from: A */
    private boolean f5779A = false;

    /* renamed from: B */
    private boolean f5780B = false;

    /* renamed from: C */
    private ArrayList<C1281f> f5781C = null;

    /* renamed from: D */
    private ArrayList<Animator> f5782D = new ArrayList<>();

    /* renamed from: E */
    C5748d f5783E;

    /* renamed from: F */
    private C1280e f5784F;

    /* renamed from: G */
    private C6077a<String, String> f5785G;

    /* renamed from: H */
    private PathMotion f5786H = f5777J;

    /* renamed from: b */
    private String f5787b = getClass().getName();

    /* renamed from: c */
    private long f5788c = -1;

    /* renamed from: d */
    long f5789d = -1;

    /* renamed from: e */
    private TimeInterpolator f5790e = null;

    /* renamed from: f */
    ArrayList<Integer> f5791f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<View> f5792g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f5793h = null;

    /* renamed from: i */
    private ArrayList<Class<?>> f5794i = null;

    /* renamed from: j */
    private ArrayList<Integer> f5795j = null;

    /* renamed from: k */
    private ArrayList<View> f5796k = null;

    /* renamed from: l */
    private ArrayList<Class<?>> f5797l = null;

    /* renamed from: m */
    private ArrayList<String> f5798m = null;

    /* renamed from: n */
    private ArrayList<Integer> f5799n = null;

    /* renamed from: o */
    private ArrayList<View> f5800o = null;

    /* renamed from: p */
    private ArrayList<Class<?>> f5801p = null;

    /* renamed from: q */
    private C1337v f5802q = new C1337v();

    /* renamed from: r */
    private C1337v f5803r = new C1337v();

    /* renamed from: s */
    TransitionSet f5804s = null;

    /* renamed from: t */
    private int[] f5805t = f5776I;

    /* renamed from: u */
    private ArrayList<C1336u> f5806u;

    /* renamed from: v */
    private ArrayList<C1336u> f5807v;

    /* renamed from: w */
    private ViewGroup f5808w = null;

    /* renamed from: x */
    boolean f5809x = false;

    /* renamed from: y */
    ArrayList<Animator> f5810y = new ArrayList<>();

    /* renamed from: z */
    private int f5811z = 0;

    /* renamed from: androidx.transition.Transition$a */
    static class C1276a extends PathMotion {
        C1276a() {
        }

        /* renamed from: a */
        public Path mo6147a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    class C1277b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C6077a f5812a;

        C1277b(C6077a aVar) {
            this.f5812a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5812a.remove(animator);
            Transition.this.f5810y.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.f5810y.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    class C1278c extends AnimatorListenerAdapter {
        C1278c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.mo6222B();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    private static class C1279d {

        /* renamed from: a */
        View f5815a;

        /* renamed from: b */
        String f5816b;

        /* renamed from: c */
        C1336u f5817c;

        /* renamed from: d */
        C1327o0 f5818d;

        /* renamed from: e */
        Transition f5819e;

        C1279d(View view, String str, Transition transition, C1327o0 o0Var, C1336u uVar) {
            this.f5815a = view;
            this.f5816b = str;
            this.f5817c = uVar;
            this.f5818d = o0Var;
            this.f5819e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    public static abstract class C1280e {
        /* renamed from: a */
        public abstract Rect mo6268a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$f */
    public interface C1281f {
        /* renamed from: a */
        void mo6269a(Transition transition);

        /* renamed from: b */
        void mo6183b(Transition transition);

        /* renamed from: c */
        void mo6184c(Transition transition);

        /* renamed from: d */
        void mo6185d(Transition transition);

        /* renamed from: e */
        void mo6186e(Transition transition);
    }

    public Transition() {
    }

    /* renamed from: O */
    private static C6077a<Animator, C1279d> m6876O() {
        C6077a<Animator, C1279d> aVar = f5778K.get();
        if (aVar != null) {
            return aVar;
        }
        C6077a<Animator, C1279d> aVar2 = new C6077a<>();
        f5778K.set(aVar2);
        return aVar2;
    }

    /* renamed from: X */
    private static boolean m6877X(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: Z */
    private static boolean m6878Z(C1336u uVar, C1336u uVar2, String str) {
        Object obj = uVar.f5949a.get(str);
        Object obj2 = uVar2.f5949a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: a0 */
    private void m6879a0(C6077a<View, C1336u> aVar, C6077a<View, C1336u> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo6238Y(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo6238Y(view)) {
                C1336u uVar = aVar.get(valueAt);
                C1336u uVar2 = aVar2.get(view);
                if (!(uVar == null || uVar2 == null)) {
                    this.f5806u.add(uVar);
                    this.f5807v.add(uVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: b0 */
    private void m6880b0(C6077a<View, C1336u> aVar, C6077a<View, C1336u> aVar2) {
        C1336u remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j = aVar.mo23390j(size);
            if (j != null && mo6238Y(j) && (remove = aVar2.remove(j)) != null && mo6238Y(remove.f5950b)) {
                this.f5806u.add(aVar.mo159m(size));
                this.f5807v.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m6881c(C6077a<View, C1336u> aVar, C6077a<View, C1336u> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1336u o = aVar.mo23391o(i);
            if (mo6238Y(o.f5950b)) {
                this.f5806u.add(o);
                this.f5807v.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1336u o2 = aVar2.mo23391o(i2);
            if (mo6238Y(o2.f5950b)) {
                this.f5807v.add(o2);
                this.f5806u.add((Object) null);
            }
        }
    }

    /* renamed from: c0 */
    private void m6882c0(C6077a<View, C1336u> aVar, C6077a<View, C1336u> aVar2, C6082d<View> dVar, C6082d<View> dVar2) {
        View g;
        int o = dVar.mo23305o();
        for (int i = 0; i < o; i++) {
            View p = dVar.mo23306p(i);
            if (p != null && mo6238Y(p) && (g = dVar2.mo23298g(dVar.mo23301k(i))) != null && mo6238Y(g)) {
                C1336u uVar = aVar.get(p);
                C1336u uVar2 = aVar2.get(g);
                if (!(uVar == null || uVar2 == null)) {
                    this.f5806u.add(uVar);
                    this.f5807v.add(uVar2);
                    aVar.remove(p);
                    aVar2.remove(g);
                }
            }
        }
    }

    /* renamed from: d */
    private static void m6883d(C1337v vVar, View view, C1336u uVar) {
        vVar.f5952a.put(view, uVar);
        int id = view.getId();
        if (id >= 0) {
            if (vVar.f5953b.indexOfKey(id) >= 0) {
                vVar.f5953b.put(id, (Object) null);
            } else {
                vVar.f5953b.put(id, view);
            }
        }
        String K = C5723u.m25283K(view);
        if (K != null) {
            if (vVar.f5955d.containsKey(K)) {
                vVar.f5955d.put(K, null);
            } else {
                vVar.f5955d.put(K, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (vVar.f5954c.mo23300i(itemIdAtPosition) >= 0) {
                    View g = vVar.f5954c.mo23298g(itemIdAtPosition);
                    if (g != null) {
                        C5723u.m25348x0(g, false);
                        vVar.f5954c.mo23302l(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C5723u.m25348x0(view, true);
                vVar.f5954c.mo23302l(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: d0 */
    private void m6884d0(C6077a<View, C1336u> aVar, C6077a<View, C1336u> aVar2, C6077a<String, View> aVar3, C6077a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View o = aVar3.mo23391o(i);
            if (o != null && mo6238Y(o) && (view = aVar4.get(aVar3.mo23390j(i))) != null && mo6238Y(view)) {
                C1336u uVar = aVar.get(o);
                C1336u uVar2 = aVar2.get(view);
                if (!(uVar == null || uVar2 == null)) {
                    this.f5806u.add(uVar);
                    this.f5807v.add(uVar2);
                    aVar.remove(o);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: e0 */
    private void m6885e0(C1337v vVar, C1337v vVar2) {
        C6077a aVar = new C6077a((C6090g) vVar.f5952a);
        C6077a aVar2 = new C6077a((C6090g) vVar2.f5952a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5805t;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m6880b0(aVar, aVar2);
                } else if (i2 == 2) {
                    m6884d0(aVar, aVar2, vVar.f5955d, vVar2.f5955d);
                } else if (i2 == 3) {
                    m6879a0(aVar, aVar2, vVar.f5953b, vVar2.f5953b);
                } else if (i2 == 4) {
                    m6882c0(aVar, aVar2, vVar.f5954c, vVar2.f5954c);
                }
                i++;
            } else {
                m6881c(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: f0 */
    private static int[] m6886f0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (TtmlNode.ATTR_ID.equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if (MediationMetaData.KEY_NAME.equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: g */
    private static boolean m6887g(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private void m6888l(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f5795j;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f5796k;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f5797l;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f5797l.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1336u uVar = new C1336u(view);
                        if (z) {
                            mo6153n(uVar);
                        } else {
                            mo6152k(uVar);
                        }
                        uVar.f5951c.add(this);
                        mo6249m(uVar);
                        if (z) {
                            m6883d(this.f5802q, view, uVar);
                        } else {
                            m6883d(this.f5803r, view, uVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f5799n;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f5800o;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f5801p;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f5801p.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m6888l(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: l0 */
    private void m6889l0(Animator animator, C6077a<Animator, C1279d> aVar) {
        if (animator != null) {
            animator.addListener(new C1277b(aVar));
            mo6243h(animator);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo6222B() {
        int i = this.f5811z - 1;
        this.f5811z = i;
        if (i == 0) {
            ArrayList<C1281f> arrayList = this.f5781C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5781C.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C1281f) arrayList2.get(i2)).mo6184c(this);
                }
            }
            for (int i3 = 0; i3 < this.f5802q.f5954c.mo23305o(); i3++) {
                View p = this.f5802q.f5954c.mo23306p(i3);
                if (p != null) {
                    C5723u.m25348x0(p, false);
                }
            }
            for (int i4 = 0; i4 < this.f5803r.f5954c.mo23305o(); i4++) {
                View p2 = this.f5803r.f5954c.mo23306p(i4);
                if (p2 != null) {
                    C5723u.m25348x0(p2, false);
                }
            }
            this.f5780B = true;
        }
    }

    /* renamed from: C */
    public long mo6223C() {
        return this.f5789d;
    }

    /* renamed from: H */
    public Rect mo6224H() {
        C1280e eVar = this.f5784F;
        if (eVar == null) {
            return null;
        }
        return eVar.mo6268a(this);
    }

    /* renamed from: I */
    public C1280e mo6225I() {
        return this.f5784F;
    }

    /* renamed from: J */
    public TimeInterpolator mo6226J() {
        return this.f5790e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public C1336u mo6227K(View view, boolean z) {
        TransitionSet transitionSet = this.f5804s;
        if (transitionSet != null) {
            return transitionSet.mo6227K(view, z);
        }
        ArrayList<C1336u> arrayList = z ? this.f5806u : this.f5807v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1336u uVar = arrayList.get(i2);
            if (uVar == null) {
                return null;
            }
            if (uVar.f5950b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f5807v : this.f5806u).get(i);
    }

    /* renamed from: L */
    public String mo6228L() {
        return this.f5787b;
    }

    /* renamed from: M */
    public PathMotion mo6229M() {
        return this.f5786H;
    }

    /* renamed from: N */
    public C5748d mo6230N() {
        return this.f5783E;
    }

    /* renamed from: P */
    public long mo6231P() {
        return this.f5788c;
    }

    /* renamed from: Q */
    public List<Integer> mo6232Q() {
        return this.f5791f;
    }

    /* renamed from: R */
    public List<String> mo6233R() {
        return this.f5793h;
    }

    /* renamed from: S */
    public List<Class<?>> mo6234S() {
        return this.f5794i;
    }

    /* renamed from: T */
    public List<View> mo6235T() {
        return this.f5792g;
    }

    /* renamed from: U */
    public String[] mo6151U() {
        return null;
    }

    /* renamed from: V */
    public C1336u mo6236V(View view, boolean z) {
        TransitionSet transitionSet = this.f5804s;
        if (transitionSet != null) {
            return transitionSet.mo6236V(view, z);
        }
        return (z ? this.f5802q : this.f5803r).f5952a.get(view);
    }

    /* renamed from: W */
    public boolean mo6237W(C1336u uVar, C1336u uVar2) {
        if (uVar == null || uVar2 == null) {
            return false;
        }
        String[] U = mo6151U();
        if (U != null) {
            int length = U.length;
            int i = 0;
            while (i < length) {
                if (!m6878Z(uVar, uVar2, U[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String Z : uVar.f5949a.keySet()) {
            if (m6878Z(uVar, uVar2, Z)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo6238Y(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f5795j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f5796k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f5797l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f5797l.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f5798m != null && C5723u.m25283K(view) != null && this.f5798m.contains(C5723u.m25283K(view))) {
            return false;
        }
        if ((this.f5791f.size() == 0 && this.f5792g.size() == 0 && (((arrayList = this.f5794i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5793h) == null || arrayList2.isEmpty()))) || this.f5791f.contains(Integer.valueOf(id)) || this.f5792g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5793h;
        if (arrayList6 != null && arrayList6.contains(C5723u.m25283K(view))) {
            return true;
        }
        if (this.f5794i != null) {
            for (int i2 = 0; i2 < this.f5794i.size(); i2++) {
                if (this.f5794i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public Transition mo6239a(C1281f fVar) {
        if (this.f5781C == null) {
            this.f5781C = new ArrayList<>();
        }
        this.f5781C.add(fVar);
        return this;
    }

    /* renamed from: b */
    public Transition mo6240b(View view) {
        this.f5792g.add(view);
        return this;
    }

    /* renamed from: g0 */
    public void mo6242g0(View view) {
        if (!this.f5780B) {
            C6077a<Animator, C1279d> O = m6876O();
            int size = O.size();
            C1327o0 d = C1305f0.m7063d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1279d o = O.mo23391o(i);
                if (o.f5815a != null && d.equals(o.f5818d)) {
                    C1287a.m7001b(O.mo23390j(i));
                }
            }
            ArrayList<C1281f> arrayList = this.f5781C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5781C.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1281f) arrayList2.get(i2)).mo6183b(this);
                }
            }
            this.f5779A = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo6243h(Animator animator) {
        if (animator == null) {
            mo6222B();
            return;
        }
        if (mo6223C() >= 0) {
            animator.setDuration(mo6223C());
        }
        if (mo6231P() >= 0) {
            animator.setStartDelay(mo6231P() + animator.getStartDelay());
        }
        if (mo6226J() != null) {
            animator.setInterpolator(mo6226J());
        }
        animator.addListener(new C1278c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo6244h0(ViewGroup viewGroup) {
        C1279d dVar;
        this.f5806u = new ArrayList<>();
        this.f5807v = new ArrayList<>();
        m6885e0(this.f5802q, this.f5803r);
        C6077a<Animator, C1279d> O = m6876O();
        int size = O.size();
        C1327o0 d = C1305f0.m7063d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator j = O.mo23390j(i);
            if (!(j == null || (dVar = O.get(j)) == null || dVar.f5815a == null || !d.equals(dVar.f5818d))) {
                C1336u uVar = dVar.f5817c;
                View view = dVar.f5815a;
                C1336u V = mo6236V(view, true);
                C1336u K = mo6227K(view, true);
                if (V == null && K == null) {
                    K = this.f5803r.f5952a.get(view);
                }
                if (!(V == null && K == null) && dVar.f5819e.mo6237W(uVar, K)) {
                    if (j.isRunning() || j.isStarted()) {
                        j.cancel();
                    } else {
                        O.remove(j);
                    }
                }
            }
        }
        mo6264y(viewGroup, this.f5802q, this.f5803r, this.f5806u, this.f5807v);
        mo6250m0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6245i() {
        for (int size = this.f5810y.size() - 1; size >= 0; size--) {
            this.f5810y.get(size).cancel();
        }
        ArrayList<C1281f> arrayList = this.f5781C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5781C.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C1281f) arrayList2.get(i)).mo6185d(this);
            }
        }
    }

    /* renamed from: i0 */
    public Transition mo6246i0(C1281f fVar) {
        ArrayList<C1281f> arrayList = this.f5781C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f5781C.size() == 0) {
            this.f5781C = null;
        }
        return this;
    }

    /* renamed from: j0 */
    public Transition mo6247j0(View view) {
        this.f5792g.remove(view);
        return this;
    }

    /* renamed from: k */
    public abstract void mo6152k(C1336u uVar);

    /* renamed from: k0 */
    public void mo6248k0(View view) {
        if (this.f5779A) {
            if (!this.f5780B) {
                C6077a<Animator, C1279d> O = m6876O();
                int size = O.size();
                C1327o0 d = C1305f0.m7063d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1279d o = O.mo23391o(i);
                    if (o.f5815a != null && d.equals(o.f5818d)) {
                        C1287a.m7002c(O.mo23390j(i));
                    }
                }
                ArrayList<C1281f> arrayList = this.f5781C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5781C.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1281f) arrayList2.get(i2)).mo6186e(this);
                    }
                }
            }
            this.f5779A = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6249m(C1336u uVar) {
        String[] b;
        if (this.f5783E != null && !uVar.f5949a.isEmpty() && (b = this.f5783E.mo22521b()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= b.length) {
                    z = true;
                    break;
                } else if (!uVar.f5949a.containsKey(b[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f5783E.mo22520a(uVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo6250m0() {
        mo6262u0();
        C6077a<Animator, C1279d> O = m6876O();
        Iterator<Animator> it = this.f5782D.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (O.containsKey(next)) {
                mo6262u0();
                m6889l0(next, O);
            }
        }
        this.f5782D.clear();
        mo6222B();
    }

    /* renamed from: n */
    public abstract void mo6153n(C1336u uVar);

    /* renamed from: n0 */
    public Transition mo6251n0(long j) {
        this.f5789d = j;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6252o(ViewGroup viewGroup, boolean z) {
        C6077a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo6254p(z);
        if ((this.f5791f.size() > 0 || this.f5792g.size() > 0) && (((arrayList = this.f5793h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5794i) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f5791f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f5791f.get(i).intValue());
                if (findViewById != null) {
                    C1336u uVar = new C1336u(findViewById);
                    if (z) {
                        mo6153n(uVar);
                    } else {
                        mo6152k(uVar);
                    }
                    uVar.f5951c.add(this);
                    mo6249m(uVar);
                    if (z) {
                        m6883d(this.f5802q, findViewById, uVar);
                    } else {
                        m6883d(this.f5803r, findViewById, uVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f5792g.size(); i2++) {
                View view = this.f5792g.get(i2);
                C1336u uVar2 = new C1336u(view);
                if (z) {
                    mo6153n(uVar2);
                } else {
                    mo6152k(uVar2);
                }
                uVar2.f5951c.add(this);
                mo6249m(uVar2);
                if (z) {
                    m6883d(this.f5802q, view, uVar2);
                } else {
                    m6883d(this.f5803r, view, uVar2);
                }
            }
        } else {
            m6888l(viewGroup, z);
        }
        if (!z && (aVar = this.f5785G) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f5802q.f5955d.remove(this.f5785G.mo23390j(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f5802q.f5955d.put(this.f5785G.mo23391o(i4), view2);
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo6253o0(C1280e eVar) {
        this.f5784F = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6254p(boolean z) {
        if (z) {
            this.f5802q.f5952a.clear();
            this.f5802q.f5953b.clear();
            this.f5802q.f5954c.mo23295b();
            return;
        }
        this.f5803r.f5952a.clear();
        this.f5803r.f5953b.clear();
        this.f5803r.f5954c.mo23295b();
    }

    /* renamed from: p0 */
    public Transition mo6255p0(TimeInterpolator timeInterpolator) {
        this.f5790e = timeInterpolator;
        return this;
    }

    /* renamed from: q0 */
    public void mo6256q0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f5805t = f5776I;
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            if (!m6877X(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!m6887g(iArr, i)) {
                i++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f5805t = (int[]) iArr.clone();
    }

    /* renamed from: r0 */
    public void mo6257r0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f5786H = f5777J;
        } else {
            this.f5786H = pathMotion;
        }
    }

    /* renamed from: s */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f5782D = new ArrayList<>();
            transition.f5802q = new C1337v();
            transition.f5803r = new C1337v();
            transition.f5806u = null;
            transition.f5807v = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: s0 */
    public void mo6259s0(C5748d dVar) {
        this.f5783E = dVar;
    }

    /* renamed from: t0 */
    public Transition mo6260t0(long j) {
        this.f5788c = j;
        return this;
    }

    public String toString() {
        return mo6263v0("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo6262u0() {
        if (this.f5811z == 0) {
            ArrayList<C1281f> arrayList = this.f5781C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5781C.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C1281f) arrayList2.get(i)).mo6269a(this);
                }
            }
            this.f5780B = false;
        }
        this.f5811z++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public String mo6263v0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5789d != -1) {
            str2 = str2 + "dur(" + this.f5789d + ") ";
        }
        if (this.f5788c != -1) {
            str2 = str2 + "dly(" + this.f5788c + ") ";
        }
        if (this.f5790e != null) {
            str2 = str2 + "interp(" + this.f5790e + ") ";
        }
        if (this.f5791f.size() <= 0 && this.f5792g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f5791f.size() > 0) {
            for (int i = 0; i < this.f5791f.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5791f.get(i);
            }
        }
        if (this.f5792g.size() > 0) {
            for (int i2 = 0; i2 < this.f5792g.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f5792g.get(i2);
            }
        }
        return str3 + ")";
    }

    /* renamed from: w */
    public Animator mo6154w(ViewGroup viewGroup, C1336u uVar, C1336u uVar2) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6264y(ViewGroup viewGroup, C1337v vVar, C1337v vVar2, ArrayList<C1336u> arrayList, ArrayList<C1336u> arrayList2) {
        int i;
        int i2;
        Animator w;
        View view;
        Animator animator;
        C1336u uVar;
        C1336u uVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C6077a<Animator, C1279d> O = m6876O();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1336u uVar3 = arrayList.get(i3);
            C1336u uVar4 = arrayList2.get(i3);
            if (uVar3 != null && !uVar3.f5951c.contains(this)) {
                uVar3 = null;
            }
            if (uVar4 != null && !uVar4.f5951c.contains(this)) {
                uVar4 = null;
            }
            if (!(uVar3 == null && uVar4 == null)) {
                if ((uVar3 == null || uVar4 == null || mo6237W(uVar3, uVar4)) && (w = mo6154w(viewGroup2, uVar3, uVar4)) != null) {
                    if (uVar4 != null) {
                        view = uVar4.f5950b;
                        String[] U = mo6151U();
                        if (U != null && U.length > 0) {
                            uVar2 = new C1336u(view);
                            Animator animator3 = w;
                            i2 = size;
                            C1336u uVar5 = vVar2.f5952a.get(view);
                            if (uVar5 != null) {
                                int i4 = 0;
                                while (i4 < U.length) {
                                    uVar2.f5949a.put(U[i4], uVar5.f5949a.get(U[i4]));
                                    i4++;
                                    ArrayList<C1336u> arrayList3 = arrayList2;
                                    i3 = i3;
                                    uVar5 = uVar5;
                                }
                            }
                            i = i3;
                            int size2 = O.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C1279d dVar = O.get(O.mo23390j(i5));
                                if (dVar.f5817c != null && dVar.f5815a == view && dVar.f5816b.equals(mo6228L()) && dVar.f5817c.equals(uVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = w;
                            uVar2 = null;
                        }
                        animator = animator2;
                        uVar = uVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = uVar3.f5950b;
                        animator = w;
                        uVar = null;
                    }
                    if (animator != null) {
                        C5748d dVar2 = this.f5783E;
                        if (dVar2 != null) {
                            long c = dVar2.mo22518c(viewGroup2, this, uVar3, uVar4);
                            sparseIntArray.put(this.f5782D.size(), (int) c);
                            j = Math.min(c, j);
                        }
                        O.put(animator, new C1279d(view, mo6228L(), this, C1305f0.m7063d(viewGroup), uVar));
                        this.f5782D.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f5782D.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1329q.f5927c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k = (long) C1532g.m7913k(obtainStyledAttributes, xmlResourceParser, IronSourceConstants.EVENTS_DURATION, 1, -1);
        if (k >= 0) {
            mo6251n0(k);
        }
        long k2 = (long) C1532g.m7913k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k2 > 0) {
            mo6260t0(k2);
        }
        int l = C1532g.m7914l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l > 0) {
            mo6255p0(AnimationUtils.loadInterpolator(context, l));
        }
        String m = C1532g.m7915m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m != null) {
            mo6256q0(m6886f0(m));
        }
        obtainStyledAttributes.recycle();
    }
}
