package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0600b;
import androidx.customview.view.AbsSavedState;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p110m0.C5682a;
import p110m0.C5690c0;
import p110m0.C5718p;
import p110m0.C5723u;
import p116n0.C5771c;

public class ViewPager extends ViewGroup {

    /* renamed from: t0 */
    static final int[] f6114t0 = {16842931};

    /* renamed from: u0 */
    private static final Comparator<C1378f> f6115u0 = new C1373a();

    /* renamed from: v0 */
    private static final Interpolator f6116v0 = new C1374b();

    /* renamed from: w0 */
    private static final C1384l f6117w0 = new C1384l();

    /* renamed from: A */
    private boolean f6118A;

    /* renamed from: B */
    private int f6119B;

    /* renamed from: C */
    private int f6120C;

    /* renamed from: D */
    private int f6121D;

    /* renamed from: E */
    private float f6122E;

    /* renamed from: F */
    private float f6123F;

    /* renamed from: G */
    private float f6124G;

    /* renamed from: H */
    private float f6125H;

    /* renamed from: I */
    private int f6126I = -1;

    /* renamed from: J */
    private VelocityTracker f6127J;

    /* renamed from: K */
    private int f6128K;

    /* renamed from: L */
    private int f6129L;

    /* renamed from: M */
    private int f6130M;

    /* renamed from: N */
    private int f6131N;

    /* renamed from: O */
    private boolean f6132O;

    /* renamed from: P */
    private EdgeEffect f6133P;

    /* renamed from: Q */
    private EdgeEffect f6134Q;

    /* renamed from: R */
    private boolean f6135R = true;

    /* renamed from: S */
    private boolean f6136S = false;

    /* renamed from: T */
    private boolean f6137T;

    /* renamed from: U */
    private int f6138U;

    /* renamed from: V */
    private List<C1381i> f6139V;

    /* renamed from: W */
    private C1381i f6140W;

    /* renamed from: b */
    private int f6141b;

    /* renamed from: c */
    private final ArrayList<C1378f> f6142c = new ArrayList<>();

    /* renamed from: d */
    private final C1378f f6143d = new C1378f();

    /* renamed from: e */
    private final Rect f6144e = new Rect();

    /* renamed from: f */
    C1385a f6145f;

    /* renamed from: g */
    int f6146g;

    /* renamed from: h */
    private int f6147h = -1;

    /* renamed from: i */
    private Parcelable f6148i = null;

    /* renamed from: j */
    private ClassLoader f6149j = null;

    /* renamed from: k */
    private Scroller f6150k;

    /* renamed from: l */
    private boolean f6151l;

    /* renamed from: l0 */
    private C1381i f6152l0;

    /* renamed from: m */
    private C1383k f6153m;

    /* renamed from: m0 */
    private List<C1380h> f6154m0;

    /* renamed from: n */
    private int f6155n;

    /* renamed from: n0 */
    private C1382j f6156n0;

    /* renamed from: o */
    private Drawable f6157o;

    /* renamed from: o0 */
    private int f6158o0;

    /* renamed from: p */
    private int f6159p;

    /* renamed from: p0 */
    private int f6160p0;

    /* renamed from: q */
    private int f6161q;

    /* renamed from: q0 */
    private ArrayList<View> f6162q0;

    /* renamed from: r */
    private float f6163r = -3.4028235E38f;

    /* renamed from: r0 */
    private final Runnable f6164r0 = new C1375c();

    /* renamed from: s */
    private float f6165s = Float.MAX_VALUE;

    /* renamed from: s0 */
    private int f6166s0 = 0;

    /* renamed from: t */
    private int f6167t;

    /* renamed from: u */
    private int f6168u;

    /* renamed from: v */
    private boolean f6169v;

    /* renamed from: w */
    private boolean f6170w;

    /* renamed from: x */
    private boolean f6171x;

    /* renamed from: y */
    private int f6172y = 1;

    /* renamed from: z */
    private boolean f6173z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1372a();

        /* renamed from: d */
        int f6180d;

        /* renamed from: e */
        Parcelable f6181e;

        /* renamed from: f */
        ClassLoader f6182f;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        static class C1372a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1372a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f6180d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6180d);
            parcel.writeParcelable(this.f6181e, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f6180d = parcel.readInt();
            this.f6181e = parcel.readParcelable(classLoader);
            this.f6182f = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C1373a implements Comparator<C1378f> {
        C1373a() {
        }

        /* renamed from: a */
        public int compare(C1378f fVar, C1378f fVar2) {
            return fVar.f6187b - fVar2.f6187b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C1374b implements Interpolator {
        C1374b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C1375c implements Runnable {
        C1375c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo6623E();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C1376d implements C5718p {

        /* renamed from: a */
        private final Rect f6184a = new Rect();

        C1376d() {
        }

        /* renamed from: a */
        public C5690c0 mo870a(View view, C5690c0 c0Var) {
            C5690c0 a0 = C5723u.m25302a0(view, c0Var);
            if (a0.mo22416p()) {
                return a0;
            }
            Rect rect = this.f6184a;
            rect.left = a0.mo22411j();
            rect.top = a0.mo22413l();
            rect.right = a0.mo22412k();
            rect.bottom = a0.mo22410i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C5690c0 h = C5723u.m25315h(ViewPager.this.getChildAt(i), a0);
                rect.left = Math.min(h.mo22411j(), rect.left);
                rect.top = Math.min(h.mo22413l(), rect.top);
                rect.right = Math.min(h.mo22412k(), rect.right);
                rect.bottom = Math.min(h.mo22410i(), rect.bottom);
            }
            return a0.mo22417q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C1377e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C1378f {

        /* renamed from: a */
        Object f6186a;

        /* renamed from: b */
        int f6187b;

        /* renamed from: c */
        boolean f6188c;

        /* renamed from: d */
        float f6189d;

        /* renamed from: e */
        float f6190e;

        C1378f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    class C1379g extends C5682a {
        C1379g() {
        }

        /* renamed from: n */
        private boolean m7354n() {
            C1385a aVar = ViewPager.this.f6145f;
            return aVar != null && aVar.mo6704e() > 1;
        }

        /* renamed from: f */
        public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
            C1385a aVar;
            super.mo3196f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m7354n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f6145f) != null) {
                accessibilityEvent.setItemCount(aVar.mo6704e());
                accessibilityEvent.setFromIndex(ViewPager.this.f6146g);
                accessibilityEvent.setToIndex(ViewPager.this.f6146g);
            }
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            super.mo3197g(view, cVar);
            cVar.mo22627c0(ViewPager.class.getName());
            cVar.mo22664x0(m7354n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo22622a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo22622a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo3198j(View view, int i, Bundle bundle) {
            if (super.mo3198j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f6146g - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f6146g + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface C1380h {
        /* renamed from: b */
        void mo6616b(ViewPager viewPager, C1385a aVar, C1385a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C1381i {
        /* renamed from: a */
        void mo6615a(int i, float f, int i2);

        /* renamed from: c */
        void mo6617c(int i);

        /* renamed from: d */
        void mo6618d(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C1382j {
        /* renamed from: a */
        void mo6695a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    private class C1383k extends DataSetObserver {
        C1383k() {
        }

        public void onChanged() {
            ViewPager.this.mo6655h();
        }

        public void onInvalidated() {
            ViewPager.this.mo6655h();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    static class C1384l implements Comparator<View> {
        C1384l() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f6174a;
            if (z != layoutParams2.f6174a) {
                return z ? 1 : -1;
            }
            return layoutParams.f6178e - layoutParams2.f6178e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6681v();
    }

    /* renamed from: C */
    private boolean m7304C(int i) {
        if (this.f6142c.size() != 0) {
            C1378f t = m7321t();
            int clientWidth = getClientWidth();
            int i2 = this.f6155n;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = t.f6187b;
            float f2 = ((((float) i) / f) - t.f6190e) / (t.f6189d + (((float) i2) / f));
            this.f6137T = false;
            mo6683y(i4, f2, (int) (((float) i3) * f2));
            if (this.f6137T) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f6135R) {
            return false;
        } else {
            this.f6137T = false;
            mo6683y(0, 0.0f, 0);
            if (this.f6137T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: D */
    private boolean m7305D(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f6122E - f;
        this.f6122E = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f6163r * clientWidth;
        float f4 = this.f6165s * clientWidth;
        boolean z3 = false;
        C1378f fVar = this.f6142c.get(0);
        ArrayList<C1378f> arrayList = this.f6142c;
        C1378f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f6187b != 0) {
            f3 = fVar.f6190e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f6187b != this.f6145f.mo6704e() - 1) {
            f4 = fVar2.f6190e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f6133P.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f6134Q.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f6122E += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m7304C(i);
        return z3;
    }

    /* renamed from: G */
    private void m7306G(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f6142c.isEmpty()) {
            C1378f u = mo6680u(this.f6146g);
            int min = (int) ((u != null ? Math.min(u.f6190e, this.f6165s) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m7313g(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f6150k.isFinished()) {
            this.f6150k.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* renamed from: H */
    private void m7307H() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f6174a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: K */
    private void m7308K(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: L */
    private boolean m7309L() {
        this.f6126I = -1;
        m7319o();
        this.f6133P.onRelease();
        this.f6134Q.onRelease();
        return this.f6133P.isFinished() || this.f6134Q.isFinished();
    }

    /* renamed from: M */
    private void m7310M(int i, boolean z, int i2, boolean z2) {
        C1378f u = mo6680u(i);
        int clientWidth = u != null ? (int) (((float) getClientWidth()) * Math.max(this.f6163r, Math.min(u.f6190e, this.f6165s))) : 0;
        if (z) {
            mo6631R(clientWidth, 0, i2);
            if (z2) {
                m7316k(i);
                return;
            }
            return;
        }
        if (z2) {
            m7316k(i);
        }
        m7313g(false);
        scrollTo(clientWidth, 0);
        m7304C(clientWidth);
    }

    /* renamed from: S */
    private void m7311S() {
        if (this.f6160p0 != 0) {
            ArrayList<View> arrayList = this.f6162q0;
            if (arrayList == null) {
                this.f6162q0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f6162q0.add(getChildAt(i));
            }
            Collections.sort(this.f6162q0, f6117w0);
        }
    }

    /* renamed from: e */
    private void m7312e(C1378f fVar, int i, C1378f fVar2) {
        int i2;
        int i3;
        C1378f fVar3;
        C1378f fVar4;
        int e = this.f6145f.mo6704e();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f6155n) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f6187b;
            int i5 = fVar.f6187b;
            if (i4 < i5) {
                float f2 = fVar2.f6190e + fVar2.f6189d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f6187b && i7 < this.f6142c.size()) {
                    Object obj = this.f6142c.get(i7);
                    while (true) {
                        fVar4 = (C1378f) obj;
                        if (i6 > fVar4.f6187b && i7 < this.f6142c.size() - 1) {
                            i7++;
                            obj = this.f6142c.get(i7);
                        }
                    }
                    while (i6 < fVar4.f6187b) {
                        f2 += this.f6145f.mo6707h(i6) + f;
                        i6++;
                    }
                    fVar4.f6190e = f2;
                    f2 += fVar4.f6189d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f6142c.size() - 1;
                float f3 = fVar2.f6190e;
                while (true) {
                    i4--;
                    if (i4 < fVar.f6187b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f6142c.get(size);
                    while (true) {
                        fVar3 = (C1378f) obj2;
                        if (i4 < fVar3.f6187b && size > 0) {
                            size--;
                            obj2 = this.f6142c.get(size);
                        }
                    }
                    while (i4 > fVar3.f6187b) {
                        f3 -= this.f6145f.mo6707h(i4) + f;
                        i4--;
                    }
                    f3 -= fVar3.f6189d + f;
                    fVar3.f6190e = f3;
                }
            }
        }
        int size2 = this.f6142c.size();
        float f4 = fVar.f6190e;
        int i8 = fVar.f6187b;
        int i9 = i8 - 1;
        this.f6163r = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = e - 1;
        this.f6165s = i8 == i10 ? (fVar.f6189d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1378f fVar5 = this.f6142c.get(i11);
            while (true) {
                i3 = fVar5.f6187b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f6145f.mo6707h(i9) + f;
                i9--;
            }
            f4 -= fVar5.f6189d + f;
            fVar5.f6190e = f4;
            if (i3 == 0) {
                this.f6163r = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f6190e + fVar.f6189d + f;
        int i12 = fVar.f6187b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1378f fVar6 = this.f6142c.get(i13);
            while (true) {
                i2 = fVar6.f6187b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f6145f.mo6707h(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f6165s = (fVar6.f6189d + f5) - 1.0f;
            }
            fVar6.f6190e = f5;
            f5 += fVar6.f6189d + f;
            i13++;
            i12++;
        }
        this.f6136S = false;
    }

    /* renamed from: g */
    private void m7313g(boolean z) {
        boolean z2 = this.f6166s0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f6150k.isFinished()) {
                this.f6150k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f6150k.getCurrX();
                int currY = this.f6150k.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m7304C(currX);
                    }
                }
            }
        }
        this.f6171x = false;
        for (int i = 0; i < this.f6142c.size(); i++) {
            C1378f fVar = this.f6142c.get(i);
            if (fVar.f6188c) {
                fVar.f6188c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C5723u.m25314g0(this, this.f6164r0);
        } else {
            this.f6164r0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: i */
    private int m7314i(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f6130M || Math.abs(i2) <= this.f6128K) {
            i += (int) (f + (i >= this.f6146g ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f6142c.size() <= 0) {
            return i;
        }
        ArrayList<C1378f> arrayList = this.f6142c;
        return Math.max(this.f6142c.get(0).f6187b, Math.min(i, arrayList.get(arrayList.size() - 1).f6187b));
    }

    /* renamed from: j */
    private void m7315j(int i, float f, int i2) {
        C1381i iVar = this.f6140W;
        if (iVar != null) {
            iVar.mo6615a(i, f, i2);
        }
        List<C1381i> list = this.f6139V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1381i iVar2 = this.f6139V.get(i3);
                if (iVar2 != null) {
                    iVar2.mo6615a(i, f, i2);
                }
            }
        }
        C1381i iVar3 = this.f6152l0;
        if (iVar3 != null) {
            iVar3.mo6615a(i, f, i2);
        }
    }

    /* renamed from: k */
    private void m7316k(int i) {
        C1381i iVar = this.f6140W;
        if (iVar != null) {
            iVar.mo6618d(i);
        }
        List<C1381i> list = this.f6139V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1381i iVar2 = this.f6139V.get(i2);
                if (iVar2 != null) {
                    iVar2.mo6618d(i);
                }
            }
        }
        C1381i iVar3 = this.f6152l0;
        if (iVar3 != null) {
            iVar3.mo6618d(i);
        }
    }

    /* renamed from: l */
    private void m7317l(int i) {
        C1381i iVar = this.f6140W;
        if (iVar != null) {
            iVar.mo6617c(i);
        }
        List<C1381i> list = this.f6139V;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1381i iVar2 = this.f6139V.get(i2);
                if (iVar2 != null) {
                    iVar2.mo6617c(i);
                }
            }
        }
        C1381i iVar3 = this.f6152l0;
        if (iVar3 != null) {
            iVar3.mo6617c(i);
        }
    }

    /* renamed from: n */
    private void m7318n(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f6158o0 : 0, (Paint) null);
        }
    }

    /* renamed from: o */
    private void m7319o() {
        this.f6173z = false;
        this.f6118A = false;
        VelocityTracker velocityTracker = this.f6127J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6127J = null;
        }
    }

    /* renamed from: q */
    private Rect m7320q(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f6170w != z) {
            this.f6170w = z;
        }
    }

    /* renamed from: t */
    private C1378f m7321t() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f6155n) / ((float) clientWidth) : 0.0f;
        C1378f fVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f6142c.size()) {
            C1378f fVar2 = this.f6142c.get(i3);
            if (!z && fVar2.f6187b != (i = i2 + 1)) {
                fVar2 = this.f6143d;
                fVar2.f6190e = f + f3 + f2;
                fVar2.f6187b = i;
                fVar2.f6189d = this.f6145f.mo6707h(i);
                i3--;
            }
            f = fVar2.f6190e;
            float f4 = fVar2.f6189d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i3 == this.f6142c.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f6187b;
            f3 = fVar2.f6189d;
            i3++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    /* renamed from: w */
    private static boolean m7322w(View view) {
        return view.getClass().getAnnotation(C1377e.class) != null;
    }

    /* renamed from: x */
    private boolean m7323x(float f, float f2) {
        return (f < ((float) this.f6120C) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f6120C)) && f2 < 0.0f);
    }

    /* renamed from: z */
    private void m7324z(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6126I) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f6122E = motionEvent.getX(i);
            this.f6126I = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f6127J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo6621A() {
        int i = this.f6146g;
        if (i <= 0) {
            return false;
        }
        mo6627N(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo6622B() {
        C1385a aVar = this.f6145f;
        if (aVar == null || this.f6146g >= aVar.mo6704e() - 1) {
            return false;
        }
        mo6627N(this.f6146g + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo6623E() {
        mo6624F(this.f6146g);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6624F(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f6146g
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo6680u(r2)
            r0.f6146g = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f6145f
            if (r1 != 0) goto L_0x0018
            r17.m7311S()
            return
        L_0x0018:
            boolean r1 = r0.f6171x
            if (r1 == 0) goto L_0x0020
            r17.m7311S()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f6145f
            r1.mo6718s(r0)
            int r1 = r0.f6172y
            int r4 = r0.f6146g
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f6145f
            int r6 = r6.mo6704e()
            int r7 = r6 + -1
            int r8 = r0.f6146g
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f6141b
            if (r6 != r7) goto L_0x020e
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f6142c
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f6142c
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C1378f) r8
            int r9 = r8.f6187b
            int r10 = r0.f6146g
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f6146g
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo6632a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f6142c
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C1378f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f6189d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f6146g
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f6187b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f6188c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f6145f
            java.lang.Object r11 = r11.f6186a
            r5.mo6701b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f6187b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f6189d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo6632a(r3, r5)
            float r5 = r5.f6189d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f6189d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f6146g
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.f6187b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.f6188c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f6142c
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f6145f
            java.lang.Object r5 = r5.f6186a
            r12.mo6701b(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.f6187b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f6189d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo6632a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f6189d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.m7312e(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f6145f
            int r2 = r0.f6146g
            java.lang.Object r3 = r8.f6186a
            r1.mo6715p(r0, r2, r3)
        L_0x019b:
            androidx.viewpager.widget.a r1 = r0.f6145f
            r1.mo6703d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f6179f = r2
            boolean r5 = r4.f6174a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.f6176c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6671s(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f6189d
            r4.f6176c = r5
            int r3 = r3.f6187b
            r4.f6178e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.m7311S()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6669r(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.f6187b
            int r2 = r0.f6146g
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo6671s(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.f6187b
            int r3 = r0.f6146g
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f6141b
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f6145f
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            goto L_0x0267
        L_0x0266:
            throw r2
        L_0x0267:
            goto L_0x0266
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6624F(int):void");
    }

    /* renamed from: I */
    public void mo6625I(C1380h hVar) {
        List<C1380h> list = this.f6154m0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    /* renamed from: J */
    public void mo6626J(C1381i iVar) {
        List<C1381i> list = this.f6139V;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: N */
    public void mo6627N(int i, boolean z) {
        this.f6171x = false;
        mo6628O(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo6628O(int i, boolean z, boolean z2) {
        mo6629P(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo6629P(int i, boolean z, boolean z2, int i2) {
        C1385a aVar = this.f6145f;
        boolean z3 = false;
        if (aVar == null || aVar.mo6704e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f6146g != i || this.f6142c.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f6145f.mo6704e()) {
                i = this.f6145f.mo6704e() - 1;
            }
            int i3 = this.f6172y;
            int i4 = this.f6146g;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f6142c.size(); i5++) {
                    this.f6142c.get(i5).f6188c = true;
                }
            }
            if (this.f6146g != i) {
                z3 = true;
            }
            if (this.f6135R) {
                this.f6146g = i;
                if (z3) {
                    m7316k(i);
                }
                requestLayout();
                return;
            }
            mo6624F(i);
            m7310M(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C1381i mo6630Q(C1381i iVar) {
        C1381i iVar2 = this.f6152l0;
        this.f6152l0 = iVar;
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo6631R(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f6150k;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f6151l ? this.f6150k.getCurrX() : this.f6150k.getStartX();
            this.f6150k.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m7313g(false);
            mo6623E();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float m = f2 + (mo6656m(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(m / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f6145f.mo6707h(this.f6146g)) + ((float) this.f6155n))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED);
        this.f6151l = false;
        this.f6150k.startScroll(i6, scrollY, i7, i8, min);
        C5723u.m25310e0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1378f mo6632a(int i, int i2) {
        C1378f fVar = new C1378f();
        fVar.f6187b = i;
        fVar.f6186a = this.f6145f.mo6709j(this, i);
        fVar.f6189d = this.f6145f.mo6707h(i);
        if (i2 < 0 || i2 >= this.f6142c.size()) {
            this.f6142c.add(fVar);
        } else {
            this.f6142c.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1378f s;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (s = mo6671s(childAt)) != null && s.f6187b == this.f6146g) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C1378f s;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (s = mo6671s(childAt)) != null && s.f6187b == this.f6146g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean w = layoutParams2.f6174a | m7322w(view);
        layoutParams2.f6174a = w;
        if (!this.f6169v) {
            super.addView(view, i, layoutParams);
        } else if (!w) {
            layoutParams2.f6177d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo6636b(C1380h hVar) {
        if (this.f6154m0 == null) {
            this.f6154m0 = new ArrayList();
        }
        this.f6154m0.add(hVar);
    }

    /* renamed from: c */
    public void mo6637c(C1381i iVar) {
        if (this.f6139V == null) {
            this.f6139V = new ArrayList();
        }
        this.f6139V.add(iVar);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f6145f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f6163r))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f6165s))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f6151l = true;
        if (this.f6150k.isFinished() || !this.f6150k.computeScrollOffset()) {
            m7313g(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f6150k.getCurrX();
        int currY = this.f6150k.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m7304C(currX)) {
                this.f6150k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C5723u.m25310e0(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6641d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ba
            if (r3 == r0) goto L_0x00ba
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f6144e
            android.graphics.Rect r1 = r6.m7320q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f6144e
            android.graphics.Rect r2 = r6.m7320q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo6621A()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00cd
        L_0x009a:
            if (r7 != r4) goto L_0x00cd
            android.graphics.Rect r1 = r6.f6144e
            android.graphics.Rect r1 = r6.m7320q(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f6144e
            android.graphics.Rect r2 = r6.m7320q(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b5
            if (r1 > r2) goto L_0x00b5
            boolean r0 = r6.mo6622B()
            goto L_0x0098
        L_0x00b5:
            boolean r0 = r3.requestFocus()
            goto L_0x0098
        L_0x00ba:
            if (r7 == r5) goto L_0x00c9
            if (r7 != r1) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            if (r7 == r4) goto L_0x00c4
            r0 = 2
            if (r7 != r0) goto L_0x00cd
        L_0x00c4:
            boolean r2 = r6.mo6622B()
            goto L_0x00cd
        L_0x00c9:
            boolean r2 = r6.mo6621A()
        L_0x00cd:
            if (r2 == 0) goto L_0x00d6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6641d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo6668p(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1378f s;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (s = mo6671s(childAt)) != null && s.f6187b == this.f6146g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        C1385a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f6145f) != null && aVar.mo6704e() > 1)) {
            if (!this.f6133P.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f6163r * ((float) width));
                this.f6133P.setSize(height, width);
                z = false | this.f6133P.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f6134Q.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f6165s + 1.0f)) * ((float) width2));
                this.f6134Q.setSize(height2, width2);
                z |= this.f6134Q.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f6133P.finish();
            this.f6134Q.finish();
        }
        if (z) {
            C5723u.m25310e0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6157o;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo6646f(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo6646f(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C1385a getAdapter() {
        return this.f6145f;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f6160p0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f6162q0.get(i2).getLayoutParams()).f6179f;
    }

    public int getCurrentItem() {
        return this.f6146g;
    }

    public int getOffscreenPageLimit() {
        return this.f6172y;
    }

    public int getPageMargin() {
        return this.f6155n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6655h() {
        int e = this.f6145f.mo6704e();
        this.f6141b = e;
        boolean z = this.f6142c.size() < (this.f6172y * 2) + 1 && this.f6142c.size() < e;
        int i = this.f6146g;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f6142c.size()) {
            C1378f fVar = this.f6142c.get(i2);
            int f = this.f6145f.mo6705f(fVar.f6186a);
            if (f != -1) {
                if (f == -2) {
                    this.f6142c.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f6145f.mo6718s(this);
                        z2 = true;
                    }
                    this.f6145f.mo6701b(this, fVar.f6187b, fVar.f6186a);
                    int i3 = this.f6146g;
                    if (i3 == fVar.f6187b) {
                        i = Math.max(0, Math.min(i3, e - 1));
                    }
                } else {
                    int i4 = fVar.f6187b;
                    if (i4 != f) {
                        if (i4 == this.f6146g) {
                            i = f;
                        }
                        fVar.f6187b = f;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f6145f.mo6703d(this);
        }
        Collections.sort(this.f6142c, f6115u0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f6174a) {
                    layoutParams.f6176c = 0.0f;
                }
            }
            mo6628O(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo6656m(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6135R = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f6164r0);
        Scroller scroller = this.f6150k;
        if (scroller != null && !scroller.isFinished()) {
            this.f6150k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f6155n
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.f6157o
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f6142c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            androidx.viewpager.widget.a r1 = r0.f6145f
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f6155n
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            float r7 = r5.f6190e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f6142c
            int r8 = r8.size()
            int r9 = r5.f6187b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f6142c
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C1378f) r10
            int r10 = r10.f6187b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f6187b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f6142c
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1378f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f6190e
            float r11 = r5.f6189d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            androidx.viewpager.widget.a r11 = r0.f6145f
            float r11 = r11.mo6707h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.f6155n
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.f6157o
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f6159p
            int r15 = r0.f6155n
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f6161q
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f6157o
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m7309L();
            return false;
        }
        if (action != 0) {
            if (this.f6173z) {
                return true;
            }
            if (this.f6118A) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f6124G = x;
            this.f6122E = x;
            float y = motionEvent.getY();
            this.f6125H = y;
            this.f6123F = y;
            this.f6126I = motionEvent2.getPointerId(0);
            this.f6118A = false;
            this.f6151l = true;
            this.f6150k.computeScrollOffset();
            if (this.f6166s0 != 2 || Math.abs(this.f6150k.getFinalX() - this.f6150k.getCurrX()) <= this.f6131N) {
                m7313g(false);
                this.f6173z = false;
            } else {
                this.f6150k.abortAnimation();
                this.f6171x = false;
                mo6623E();
                this.f6173z = true;
                m7308K(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f6126I;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f6122E;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f6125H);
                if (f != 0.0f && !m7323x(this.f6122E, f)) {
                    if (mo6646f(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f6122E = x2;
                        this.f6123F = y2;
                        this.f6118A = true;
                        return false;
                    }
                }
                int i2 = this.f6121D;
                if (abs > ((float) i2) && abs * 0.5f > abs2) {
                    this.f6173z = true;
                    m7308K(true);
                    setScrollState(1);
                    this.f6122E = f > 0.0f ? this.f6124G + ((float) this.f6121D) : this.f6124G - ((float) this.f6121D);
                    this.f6123F = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i2)) {
                    this.f6118A = true;
                }
                if (this.f6173z && m7305D(x2)) {
                    C5723u.m25310e0(this);
                }
            }
        } else if (action == 6) {
            m7324z(motionEvent);
        }
        if (this.f6127J == null) {
            this.f6127J = VelocityTracker.obtain();
        }
        this.f6127J.addMovement(motionEvent2);
        return this.f6173z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.f6174a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f6175b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f6174a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo6671s(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f6190e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f6177d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f6177d = r14
            float r9 = r9.f6176c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f6159p = r5
            int r3 = r3 - r7
            r0.f6161q = r3
            r0.f6138U = r11
            boolean r1 = r0.f6135R
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f6146g
            r2 = 0
            r0.m7310M(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f6135R = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f6119B
            int r15 = java.lang.Math.min(r15, r1)
            r13.f6120C = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r3 = (androidx.viewpager.widget.ViewPager.LayoutParams) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f6174a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f6175b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r13.f6167t = r1
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f6168u = r15
            r13.f6169v = r4
            r13.mo6623E()
            r13.f6169v = r0
            int r15 = r13.getChildCount()
        L_0x00c9:
            if (r0 >= r15) goto L_0x00f3
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00f0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            if (r2 == 0) goto L_0x00e1
            boolean r4 = r2.f6174a
            if (r4 != 0) goto L_0x00f0
        L_0x00e1:
            float r4 = (float) r14
            float r2 = r2.f6176c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f6168u
            r1.measure(r2, r4)
        L_0x00f0:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1378f s;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (s = mo6671s(childAt)) != null && s.f6187b == this.f6146g && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3233a());
        C1385a aVar = this.f6145f;
        if (aVar != null) {
            aVar.mo6712m(savedState.f6181e, savedState.f6182f);
            mo6628O(savedState.f6180d, false, true);
            return;
        }
        this.f6147h = savedState.f6180d;
        this.f6148i = savedState.f6181e;
        this.f6149j = savedState.f6182f;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6180d = this.f6146g;
        C1385a aVar = this.f6145f;
        if (aVar != null) {
            savedState.f6181e = aVar.mo6713n();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f6155n;
            m7306G(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1385a aVar;
        if (this.f6132O) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f6145f) == null || aVar.mo6704e() == 0) {
            return false;
        }
        if (this.f6127J == null) {
            this.f6127J = VelocityTracker.obtain();
        }
        this.f6127J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f6150k.abortAnimation();
            this.f6171x = false;
            mo6623E();
            float x = motionEvent.getX();
            this.f6124G = x;
            this.f6122E = x;
            float y = motionEvent.getY();
            this.f6125H = y;
            this.f6123F = y;
            this.f6126I = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f6173z) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6126I);
                    if (findPointerIndex == -1) {
                        z = m7309L();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f6122E);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f6123F);
                        if (abs > ((float) this.f6121D) && abs > abs2) {
                            this.f6173z = true;
                            m7308K(true);
                            float f = this.f6124G;
                            this.f6122E = x2 - f > 0.0f ? f + ((float) this.f6121D) : f - ((float) this.f6121D);
                            this.f6123F = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f6173z) {
                    z = false | m7305D(motionEvent.getX(motionEvent.findPointerIndex(this.f6126I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f6122E = motionEvent.getX(actionIndex);
                    this.f6126I = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m7324z(motionEvent);
                    this.f6122E = motionEvent.getX(motionEvent.findPointerIndex(this.f6126I));
                }
            } else if (this.f6173z) {
                m7310M(this.f6146g, true, 0, false);
                z = m7309L();
            }
        } else if (this.f6173z) {
            VelocityTracker velocityTracker = this.f6127J;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f6129L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f6126I);
            this.f6171x = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1378f t = m7321t();
            float f2 = (float) clientWidth;
            mo6629P(m7314i(t.f6187b, ((((float) scrollX) / f2) - t.f6190e) / (t.f6189d + (((float) this.f6155n) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f6126I)) - this.f6124G)), true, true, xVelocity);
            z = m7309L();
        }
        if (z) {
            C5723u.m25310e0(this);
        }
        return true;
    }

    /* renamed from: p */
    public boolean mo6668p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo6641d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo6641d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo6622B();
                } else {
                    return mo6641d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo6621A();
            } else {
                return mo6641d(17);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1378f mo6669r(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo6671s(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void removeView(View view) {
        if (this.f6169v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C1378f mo6671s(View view) {
        for (int i = 0; i < this.f6142c.size(); i++) {
            C1378f fVar = this.f6142c.get(i);
            if (this.f6145f.mo6710k(view, fVar.f6186a)) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(C1385a aVar) {
        C1385a aVar2 = this.f6145f;
        if (aVar2 != null) {
            aVar2.mo6716q((DataSetObserver) null);
            this.f6145f.mo6718s(this);
            for (int i = 0; i < this.f6142c.size(); i++) {
                C1378f fVar = this.f6142c.get(i);
                this.f6145f.mo6701b(this, fVar.f6187b, fVar.f6186a);
            }
            this.f6145f.mo6703d(this);
            this.f6142c.clear();
            m7307H();
            this.f6146g = 0;
            scrollTo(0, 0);
        }
        C1385a aVar3 = this.f6145f;
        this.f6145f = aVar;
        this.f6141b = 0;
        if (aVar != null) {
            if (this.f6153m == null) {
                this.f6153m = new C1383k();
            }
            this.f6145f.mo6716q(this.f6153m);
            this.f6171x = false;
            boolean z = this.f6135R;
            this.f6135R = true;
            this.f6141b = this.f6145f.mo6704e();
            if (this.f6147h >= 0) {
                this.f6145f.mo6712m(this.f6148i, this.f6149j);
                mo6628O(this.f6147h, false, true);
                this.f6147h = -1;
                this.f6148i = null;
                this.f6149j = null;
            } else if (!z) {
                mo6623E();
            } else {
                requestLayout();
            }
        }
        List<C1380h> list = this.f6154m0;
        if (list != null && !list.isEmpty()) {
            int size = this.f6154m0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6154m0.get(i2).mo6616b(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f6171x = false;
        mo6628O(i, !this.f6135R, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f6172y) {
            this.f6172y = i;
            mo6623E();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C1381i iVar) {
        this.f6140W = iVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f6155n;
        this.f6155n = i;
        int width = getWidth();
        m7306G(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f6157o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f6166s0 != i) {
            this.f6166s0 = i;
            if (this.f6156n0 != null) {
                m7318n(i != 0);
            }
            m7317l(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C1378f mo6680u(int i) {
        for (int i2 = 0; i2 < this.f6142c.size(); i2++) {
            C1378f fVar = this.f6142c.get(i2);
            if (fVar.f6187b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo6681v() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f6150k = new Scroller(context, f6116v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f6121D = viewConfiguration.getScaledPagingTouchSlop();
        this.f6128K = (int) (400.0f * f);
        this.f6129L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f6133P = new EdgeEffect(context);
        this.f6134Q = new EdgeEffect(context);
        this.f6130M = (int) (25.0f * f);
        this.f6131N = (int) (2.0f * f);
        this.f6119B = (int) (f * 16.0f);
        C5723u.m25330o0(this, new C1379g());
        if (C5723u.m25351z(this) == 0) {
            C5723u.m25350y0(this, 1);
        }
        C5723u.m25266B0(this, new C1376d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6157o;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6683y(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f6138U
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f6174a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f6175b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.m7315j(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.f6156n0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f6174a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f6156n0
            r3.mo6695a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f6137T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6683y(int, float, int):void");
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f6174a;

        /* renamed from: b */
        public int f6175b;

        /* renamed from: c */
        float f6176c = 0.0f;

        /* renamed from: d */
        boolean f6177d;

        /* renamed from: e */
        int f6178e;

        /* renamed from: f */
        int f6179f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f6114t0);
            this.f6175b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0600b.m3294f(getContext(), i));
    }
}
