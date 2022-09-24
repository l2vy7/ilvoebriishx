package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C0773e {

    /* renamed from: a */
    private final C1220c f5534a;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C1214a implements SavedStateRegistry.C1217b {

        /* renamed from: a */
        final Set<String> f5535a = new HashSet();

        C1214a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo5971d("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo798a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f5535a));
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5967b(String str) {
            this.f5535a.add(str);
        }
    }

    Recreator(C1220c cVar) {
        this.f5534a = cVar;
    }

    /* renamed from: h */
    private void m6637h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.C1216a.class);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.C1216a) declaredConstructor.newInstance(new Object[0])).mo3970a(this.f5534a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: c */
    public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
        if (bVar == C0769d.C0771b.ON_CREATE) {
            gVar.mo639a().mo3986c(this);
            Bundle a = this.f5534a.mo644i().mo5968a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m6637h(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
