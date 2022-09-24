package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* compiled from: KeyCache */
public class C0479e {

    /* renamed from: a */
    HashMap<Object, HashMap<String, float[]>> f1991a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2620a(Object obj, String str, int i) {
        if (!this.f1991a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = this.f1991a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length > i) {
            return fArr[i];
        }
        return Float.NaN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2621b(Object obj, String str, int i, float f) {
        if (!this.f1991a.containsKey(obj)) {
            HashMap hashMap = new HashMap();
            float[] fArr = new float[(i + 1)];
            fArr[i] = f;
            hashMap.put(str, fArr);
            this.f1991a.put(obj, hashMap);
            return;
        }
        HashMap hashMap2 = this.f1991a.get(obj);
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[(i + 1)];
            fArr2[i] = f;
            hashMap2.put(str, fArr2);
            this.f1991a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = (float[]) hashMap2.get(str);
        if (fArr3.length <= i) {
            fArr3 = Arrays.copyOf(fArr3, i + 1);
        }
        fArr3[i] = f;
        hashMap2.put(str, fArr3);
    }
}
