package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0558a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.c */
/* compiled from: Key */
public abstract class C0476c {

    /* renamed from: f */
    public static int f1967f = -1;

    /* renamed from: a */
    int f1968a;

    /* renamed from: b */
    int f1969b;

    /* renamed from: c */
    String f1970c = null;

    /* renamed from: d */
    protected int f1971d;

    /* renamed from: e */
    HashMap<String, C0558a> f1972e;

    public C0476c() {
        int i = f1967f;
        this.f1968a = i;
        this.f1969b = i;
    }

    /* renamed from: a */
    public abstract void mo2615a(HashMap<String, C0515r> hashMap);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo2616b(HashSet<String> hashSet);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo2617c(Context context, AttributeSet attributeSet);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2618d(String str) {
        String str2 = this.f1970c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: e */
    public void mo2619e(HashMap<String, Integer> hashMap) {
    }
}
