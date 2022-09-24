package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p111m0.C5682a;
import p111m0.C5723u;
import p117n0.C5771c;
import p117n0.C5776d;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: RecyclerViewAccessibilityDelegate */
public class C1162k extends C5682a {

    /* renamed from: d */
    final RecyclerView f5389d;

    /* renamed from: e */
    private final C1163a f5390e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class C1163a extends C5682a {

        /* renamed from: d */
        final C1162k f5391d;

        /* renamed from: e */
        private Map<View, C5682a> f5392e = new WeakHashMap();

        public C1163a(C1162k kVar) {
            this.f5391d = kVar;
        }

        /* renamed from: a */
        public boolean mo3313a(View view, AccessibilityEvent accessibilityEvent) {
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                return aVar.mo3313a(view, accessibilityEvent);
            }
            return super.mo3313a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public C5776d mo5794b(View view) {
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                return aVar.mo5794b(view);
            }
            return super.mo5794b(view);
        }

        /* renamed from: f */
        public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                aVar.mo3196f(view, accessibilityEvent);
            } else {
                super.mo3196f(view, accessibilityEvent);
            }
        }

        /* renamed from: g */
        public void mo3197g(View view, C5771c cVar) {
            if (this.f5391d.mo5793o() || this.f5391d.f5389d.getLayoutManager() == null) {
                super.mo3197g(view, cVar);
                return;
            }
            this.f5391d.f5389d.getLayoutManager().mo5427O0(view, cVar);
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                aVar.mo3197g(view, cVar);
            } else {
                super.mo3197g(view, cVar);
            }
        }

        /* renamed from: h */
        public void mo5795h(View view, AccessibilityEvent accessibilityEvent) {
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                aVar.mo5795h(view, accessibilityEvent);
            } else {
                super.mo5795h(view, accessibilityEvent);
            }
        }

        /* renamed from: i */
        public boolean mo3314i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C5682a aVar = this.f5392e.get(viewGroup);
            if (aVar != null) {
                return aVar.mo3314i(viewGroup, view, accessibilityEvent);
            }
            return super.mo3314i(viewGroup, view, accessibilityEvent);
        }

        /* renamed from: j */
        public boolean mo3198j(View view, int i, Bundle bundle) {
            if (this.f5391d.mo5793o() || this.f5391d.f5389d.getLayoutManager() == null) {
                return super.mo3198j(view, i, bundle);
            }
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                if (aVar.mo3198j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo3198j(view, i, bundle)) {
                return true;
            }
            return this.f5391d.f5389d.getLayoutManager().mo5462i1(view, i, bundle);
        }

        /* renamed from: l */
        public void mo5796l(View view, int i) {
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                aVar.mo5796l(view, i);
            } else {
                super.mo5796l(view, i);
            }
        }

        /* renamed from: m */
        public void mo5797m(View view, AccessibilityEvent accessibilityEvent) {
            C5682a aVar = this.f5392e.get(view);
            if (aVar != null) {
                aVar.mo5797m(view, accessibilityEvent);
            } else {
                super.mo5797m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C5682a mo5798n(View view) {
            return this.f5392e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo5799o(View view) {
            C5682a l = C5723u.m25323l(view);
            if (l != null && l != this) {
                this.f5392e.put(view, l);
            }
        }
    }

    public C1162k(RecyclerView recyclerView) {
        this.f5389d = recyclerView;
        C5682a n = mo5792n();
        if (n == null || !(n instanceof C1163a)) {
            this.f5390e = new C1163a(this);
        } else {
            this.f5390e = (C1163a) n;
        }
    }

    /* renamed from: f */
    public void mo3196f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3196f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo5793o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo5015K0(accessibilityEvent);
            }
        }
    }

    /* renamed from: g */
    public void mo3197g(View view, C5771c cVar) {
        super.mo3197g(view, cVar);
        if (!mo5793o() && this.f5389d.getLayoutManager() != null) {
            this.f5389d.getLayoutManager().mo5425N0(cVar);
        }
    }

    /* renamed from: j */
    public boolean mo3198j(View view, int i, Bundle bundle) {
        if (super.mo3198j(view, i, bundle)) {
            return true;
        }
        if (mo5793o() || this.f5389d.getLayoutManager() == null) {
            return false;
        }
        return this.f5389d.getLayoutManager().mo5457g1(i, bundle);
    }

    /* renamed from: n */
    public C5682a mo5792n() {
        return this.f5390e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5793o() {
        return this.f5389d.mo5170o0();
    }
}
