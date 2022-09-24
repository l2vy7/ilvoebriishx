package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p111m1.C5746b;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.f */
/* compiled from: GhostViewHolder */
class C1304f extends FrameLayout {

    /* renamed from: b */
    private ViewGroup f5880b;

    /* renamed from: c */
    private boolean f5881c = true;

    C1304f(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f5880b = viewGroup;
        viewGroup.setTag(C5746b.ghost_view_holder, this);
        C1289a0.m7004b(this.f5880b).mo6389c(this);
    }

    /* renamed from: b */
    static C1304f m7053b(ViewGroup viewGroup) {
        return (C1304f) viewGroup.getTag(C5746b.ghost_view_holder);
    }

    /* renamed from: c */
    private int m7054c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m7055d(((C1310h) getChildAt(i2)).f5895d, arrayList2);
            if (m7057f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: d */
    private static void m7055d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m7055d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    private static boolean m7056e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (Build.VERSION.SDK_INT < 21 || view.getZ() == view2.getZ()) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(C1289a0.m7003a(viewGroup, i));
                if (childAt == view) {
                    return false;
                }
                if (childAt == view2) {
                    break;
                }
            }
            return true;
        } else if (view.getZ() > view2.getZ()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m7057f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return m7056e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6308a(C1310h hVar) {
        ArrayList arrayList = new ArrayList();
        m7055d(hVar.f5895d, arrayList);
        int c = m7054c(arrayList);
        if (c < 0 || c >= getChildCount()) {
            addView(hVar);
        } else {
            addView(hVar, c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6309g() {
        if (this.f5881c) {
            C1289a0.m7004b(this.f5880b).mo6390d(this);
            C1289a0.m7004b(this.f5880b).mo6389c(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewAdded(View view) {
        if (this.f5881c) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f5880b.setTag(C5746b.ghost_view_holder, (Object) null);
            C1289a0.m7004b(this.f5880b).mo6390d(this);
            this.f5881c = false;
        }
    }
}
