package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.transition.u */
/* compiled from: TransitionValues */
public class C1336u {

    /* renamed from: a */
    public final Map<String, Object> f5949a = new HashMap();

    /* renamed from: b */
    public View f5950b;

    /* renamed from: c */
    final ArrayList<Transition> f5951c = new ArrayList<>();

    @Deprecated
    public C1336u() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1336u)) {
            return false;
        }
        C1336u uVar = (C1336u) obj;
        return this.f5950b == uVar.f5950b && this.f5949a.equals(uVar.f5949a);
    }

    public int hashCode() {
        return (this.f5950b.hashCode() * 31) + this.f5949a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5950b + "\n") + "    values:";
        for (String next : this.f5949a.keySet()) {
            str = str + "    " + next + ": " + this.f5949a.get(next) + "\n";
        }
        return str;
    }

    public C1336u(View view) {
        this.f5950b = view;
    }
}
