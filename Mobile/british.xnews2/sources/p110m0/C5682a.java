package p110m0;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p116n0.C5771c;
import p116n0.C5776d;
import p180z.C6420d;

/* renamed from: m0.a */
/* compiled from: AccessibilityDelegateCompat */
public class C5682a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f24293c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f24294a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f24295b;

    /* renamed from: m0.a$a */
    /* compiled from: AccessibilityDelegateCompat */
    static final class C5683a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C5682a f24296a;

        C5683a(C5682a aVar) {
            this.f24296a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f24296a.mo3313a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C5776d b = this.f24296a.mo5794b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo22678e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f24296a.mo3196f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C5771c H0 = C5771c.m25532H0(accessibilityNodeInfo);
            H0.mo22662w0(C5723u.m25297W(view));
            H0.mo22642l0(C5723u.m25292R(view));
            H0.mo22653r0(C5723u.m25331p(view));
            H0.mo22599C0(C5723u.m25281J(view));
            this.f24296a.mo3197g(view, H0);
            H0.mo22632f(accessibilityNodeInfo.getText(), view);
            List<C5771c.C5772a> c = C5682a.m25089c(view);
            for (int i = 0; i < c.size(); i++) {
                H0.mo22624b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f24296a.mo5795h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f24296a.mo3314i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f24296a.mo3198j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f24296a.mo5796l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f24296a.mo5797m(view, accessibilityEvent);
        }
    }

    public C5682a() {
        this(f24293c);
    }

    /* renamed from: c */
    static List<C5771c.C5772a> m25089c(View view) {
        List<C5771c.C5772a> list = (List) view.getTag(C6420d.f26378P);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m25090e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = C5771c.m25543q(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (q != null && i < q.length) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m25091k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C6420d.f26379Q);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m25090e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo3313a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f24294a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C5776d mo5794b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f24294a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C5776d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo22379d() {
        return this.f24295b;
    }

    /* renamed from: f */
    public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
        this.f24294a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3197g(View view, C5771c cVar) {
        this.f24294a.onInitializeAccessibilityNodeInfo(view, cVar.mo22607G0());
    }

    /* renamed from: h */
    public void mo5795h(View view, AccessibilityEvent accessibilityEvent) {
        this.f24294a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo3314i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f24294a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo3198j(View view, int i, Bundle bundle) {
        List<C5771c.C5772a> c = m25089c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C5771c.C5772a aVar = c.get(i2);
            if (aVar.mo22669b() == i) {
                z = aVar.mo22671d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f24294a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C6420d.f26386a) ? z : m25091k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo5796l(View view, int i) {
        this.f24294a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo5797m(View view, AccessibilityEvent accessibilityEvent) {
        this.f24294a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C5682a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f24294a = accessibilityDelegate;
        this.f24295b = new C5683a(this);
    }
}
