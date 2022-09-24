package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0572f;
import java.util.HashMap;
import p154u.C6164c;

/* renamed from: androidx.constraintlayout.motion.widget.i */
/* compiled from: KeyPosition */
public class C0500i extends C0502j {

    /* renamed from: h */
    String f2040h = null;

    /* renamed from: i */
    int f2041i = C0476c.f1967f;

    /* renamed from: j */
    int f2042j = 0;

    /* renamed from: k */
    float f2043k = Float.NaN;

    /* renamed from: l */
    float f2044l = Float.NaN;

    /* renamed from: m */
    float f2045m = Float.NaN;

    /* renamed from: n */
    float f2046n = Float.NaN;

    /* renamed from: o */
    float f2047o = Float.NaN;

    /* renamed from: p */
    float f2048p = Float.NaN;

    /* renamed from: q */
    int f2049q = 0;

    /* renamed from: r */
    private float f2050r = Float.NaN;

    /* renamed from: s */
    private float f2051s = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.i$a */
    /* compiled from: KeyPosition */
    private static class C0501a {

        /* renamed from: a */
        private static SparseIntArray f2052a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2052a = sparseIntArray;
            sparseIntArray.append(C0572f.f2994t4, 1);
            f2052a.append(C0572f.f2976r4, 2);
            f2052a.append(C0572f.f2577A4, 3);
            f2052a.append(C0572f.f2958p4, 4);
            f2052a.append(C0572f.f2967q4, 5);
            f2052a.append(C0572f.f3030x4, 6);
            f2052a.append(C0572f.f3039y4, 7);
            f2052a.append(C0572f.f2985s4, 9);
            f2052a.append(C0572f.f3048z4, 8);
            f2052a.append(C0572f.f3021w4, 11);
            f2052a.append(C0572f.f3012v4, 12);
            f2052a.append(C0572f.f3003u4, 10);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m2722b(C0500i iVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f2052a.get(index)) {
                    case 1:
                        if (!MotionLayout.f1843Z0) {
                            if (typedArray.peekValue(index).type != 3) {
                                iVar.f1969b = typedArray.getResourceId(index, iVar.f1969b);
                                break;
                            } else {
                                iVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, iVar.f1969b);
                            iVar.f1969b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                iVar.f1970c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        iVar.f1968a = typedArray.getInt(index, iVar.f1968a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type != 3) {
                            iVar.f2040h = C6164c.f25470c[typedArray.getInteger(index, 0)];
                            break;
                        } else {
                            iVar.f2040h = typedArray.getString(index);
                            break;
                        }
                    case 4:
                        iVar.f2053g = typedArray.getInteger(index, iVar.f2053g);
                        break;
                    case 5:
                        iVar.f2042j = typedArray.getInt(index, iVar.f2042j);
                        break;
                    case 6:
                        iVar.f2045m = typedArray.getFloat(index, iVar.f2045m);
                        break;
                    case 7:
                        iVar.f2046n = typedArray.getFloat(index, iVar.f2046n);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, iVar.f2044l);
                        iVar.f2043k = f;
                        iVar.f2044l = f;
                        break;
                    case 9:
                        iVar.f2049q = typedArray.getInt(index, iVar.f2049q);
                        break;
                    case 10:
                        iVar.f2041i = typedArray.getInt(index, iVar.f2041i);
                        break;
                    case 11:
                        iVar.f2043k = typedArray.getFloat(index, iVar.f2043k);
                        break;
                    case 12:
                        iVar.f2044l = typedArray.getFloat(index, iVar.f2044l);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2052a.get(index));
                        break;
                }
            }
            if (iVar.f1968a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public C0500i() {
        this.f1971d = 2;
    }

    /* renamed from: a */
    public void mo2615a(HashMap<String, C0515r> hashMap) {
    }

    /* renamed from: c */
    public void mo2617c(Context context, AttributeSet attributeSet) {
        C0501a.m2722b(this, context.obtainStyledAttributes(attributeSet, C0572f.f2949o4));
    }
}
