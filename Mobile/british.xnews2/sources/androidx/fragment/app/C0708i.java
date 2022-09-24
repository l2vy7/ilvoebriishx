package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import p150t0.C6094c;

/* renamed from: androidx.fragment.app.i */
/* compiled from: FragmentLayoutInflaterFactory */
class C0708i implements LayoutInflater.Factory2 {

    /* renamed from: b */
    private final FragmentManager f3621b;

    C0708i(FragmentManager fragmentManager) {
        this.f3621b = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0716o oVar;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3621b);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6094c.f25330d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C6094c.f25331e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C6094c.f25332f, -1);
        String string = obtainStyledAttributes.getString(C6094c.f25333g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0706g.m3988b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3621b.mo3589i0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3621b.mo3592j0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3621b.mo3589i0(id);
        }
        if (FragmentManager.m3729F0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f3621b.mo3603r0().mo3627a(context.getClassLoader(), attributeValue);
            fragment.f3376o = true;
            fragment.f3385x = resourceId != 0 ? resourceId : id;
            fragment.f3386y = id;
            fragment.f3387z = string;
            fragment.f3377p = true;
            FragmentManager fragmentManager = this.f3621b;
            fragment.f3381t = fragmentManager;
            fragment.f3382u = fragmentManager.mo3608u0();
            fragment.mo3357F0(this.f3621b.mo3608u0().mo3770k(), attributeSet, fragment.f3364c);
            oVar = this.f3621b.mo3610w(fragment);
            this.f3621b.mo3583g(fragment);
        } else if (!fragment.f3377p) {
            fragment.f3377p = true;
            FragmentManager fragmentManager2 = this.f3621b;
            fragment.f3381t = fragmentManager2;
            fragment.f3382u = fragmentManager2.mo3608u0();
            fragment.mo3357F0(this.f3621b.mo3608u0().mo3770k(), attributeSet, fragment.f3364c);
            oVar = this.f3621b.mo3610w(fragment);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        oVar.mo3815k();
        oVar.mo3813i();
        View view2 = fragment.f3345I;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.f3345I.getTag() == null) {
                fragment.f3345I.setTag(string);
            }
            return fragment.f3345I;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
