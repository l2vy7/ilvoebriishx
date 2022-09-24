package p200d6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import p150t.C6090g;

/* renamed from: d6.h */
/* compiled from: MotionSpec */
public class C10500h {

    /* renamed from: a */
    private final C6090g<String, C10501i> f49021a = new C6090g<>();

    /* renamed from: b */
    private final C6090g<String, PropertyValuesHolder[]> f49022b = new C6090g<>();

    /* renamed from: a */
    private static void m48211a(C10500h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.mo42629l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.mo42630m(objectAnimator.getPropertyName(), C10501i.m48224b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    private PropertyValuesHolder[] m48212b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: c */
    public static C10500h m48213c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m48214d(context, resourceId);
    }

    /* renamed from: d */
    public static C10500h m48214d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m48215e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m48215e(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: e */
    private static C10500h m48215e(List<Animator> list) {
        C10500h hVar = new C10500h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m48211a(hVar, list.get(i));
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10500h)) {
            return false;
        }
        return this.f49021a.equals(((C10500h) obj).f49021a);
    }

    /* renamed from: f */
    public <T> ObjectAnimator mo42622f(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, mo42623g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo42624h(str).mo42632a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] mo42623g(String str) {
        if (mo42627j(str)) {
            return m48212b(this.f49022b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public C10501i mo42624h(String str) {
        if (mo42628k(str)) {
            return this.f49021a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f49021a.hashCode();
    }

    /* renamed from: i */
    public long mo42626i() {
        int size = this.f49021a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C10501i o = this.f49021a.mo23391o(i);
            j = Math.max(j, o.mo42633c() + o.mo42634d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean mo42627j(String str) {
        return this.f49022b.get(str) != null;
    }

    /* renamed from: k */
    public boolean mo42628k(String str) {
        return this.f49021a.get(str) != null;
    }

    /* renamed from: l */
    public void mo42629l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f49022b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void mo42630m(String str, C10501i iVar) {
        this.f49021a.put(str, iVar);
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f49021a + "}\n";
    }
}
