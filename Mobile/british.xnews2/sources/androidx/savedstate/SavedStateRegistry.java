package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0769d;
import androidx.lifecycle.C0773e;
import androidx.lifecycle.C0775g;
import androidx.savedstate.Recreator;
import java.util.Map;
import p115n.C5762b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C5762b<String, C1217b> f5536a = new C5762b<>();

    /* renamed from: b */
    private Bundle f5537b;

    /* renamed from: c */
    private boolean f5538c;

    /* renamed from: d */
    private Recreator.C1214a f5539d;

    /* renamed from: e */
    boolean f5540e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C1216a {
        /* renamed from: a */
        void mo3970a(C1220c cVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C1217b {
        /* renamed from: a */
        Bundle mo798a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo5968a(String str) {
        if (this.f5538c) {
            Bundle bundle = this.f5537b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f5537b.remove(str);
            if (this.f5537b.isEmpty()) {
                this.f5537b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5969b(C0769d dVar, Bundle bundle) {
        if (!this.f5538c) {
            if (bundle != null) {
                this.f5537b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            dVar.mo3984a(new C0773e() {
                /* renamed from: c */
                public void mo660c(C0775g gVar, C0769d.C0771b bVar) {
                    if (bVar == C0769d.C0771b.ON_START) {
                        SavedStateRegistry.this.f5540e = true;
                    } else if (bVar == C0769d.C0771b.ON_STOP) {
                        SavedStateRegistry.this.f5540e = false;
                    }
                }
            });
            this.f5538c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5970c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5537b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C5762b<K, V>.d f = this.f5536a.mo22572f();
        while (f.hasNext()) {
            Map.Entry entry = (Map.Entry) f.next();
            bundle2.putBundle((String) entry.getKey(), ((C1217b) entry.getValue()).mo798a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void mo5971d(String str, C1217b bVar) {
        if (this.f5536a.mo22566i(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void mo5972e(Class<? extends C1216a> cls) {
        if (this.f5540e) {
            if (this.f5539d == null) {
                this.f5539d = new Recreator.C1214a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f5539d.mo5967b(cls.getName());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
