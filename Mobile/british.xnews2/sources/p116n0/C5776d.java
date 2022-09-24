package p116n0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n0.d */
/* compiled from: AccessibilityNodeProviderCompat */
public class C5776d {

    /* renamed from: a */
    private final Object f24501a;

    /* renamed from: n0.d$a */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C5777a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C5776d f24502a;

        C5777a(C5776d dVar) {
            this.f24502a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C5771c b = this.f24502a.mo22675b(i);
            if (b == null) {
                return null;
            }
            return b.mo22607G0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C5771c> c = this.f24502a.mo22676c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo22607G0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f24502a.mo22679f(i, i2, bundle);
        }
    }

    /* renamed from: n0.d$b */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C5778b extends C5777a {
        C5778b(C5776d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C5771c d = this.f24502a.mo22677d(i);
            if (d == null) {
                return null;
            }
            return d.mo22607G0();
        }
    }

    /* renamed from: n0.d$c */
    /* compiled from: AccessibilityNodeProviderCompat */
    static class C5779c extends C5778b {
        C5779c(C5776d dVar) {
            super(dVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f24502a.mo22674a(i, C5771c.m25532H0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C5776d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f24501a = new C5779c(this);
        } else if (i >= 19) {
            this.f24501a = new C5778b(this);
        } else if (i >= 16) {
            this.f24501a = new C5777a(this);
        } else {
            this.f24501a = null;
        }
    }

    /* renamed from: a */
    public void mo22674a(int i, C5771c cVar, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C5771c mo22675b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C5771c> mo22676c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C5771c mo22677d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo22678e() {
        return this.f24501a;
    }

    /* renamed from: f */
    public boolean mo22679f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C5776d(Object obj) {
        this.f24501a = obj;
    }
}
