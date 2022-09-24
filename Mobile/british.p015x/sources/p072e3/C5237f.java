package p072e3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.facebook.internal.C3481f0;
import com.google.android.exoplayer2.C6540C;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p111m0.C5712j;

/* renamed from: e3.f */
/* compiled from: ViewHierarchy */
public class C5237f {

    /* renamed from: a */
    private static final String f22784a = "e3.f";

    /* renamed from: b */
    private static WeakReference<View> f22785b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static Method f22786c = null;

    /* renamed from: a */
    public static View m23733a(View view) {
        while (view != null) {
            if (m23748p(view)) {
                return view;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: b */
    public static List<View> m23734b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static int m23735c(View view) {
        int i = view instanceof ImageView ? 2 : 0;
        if (view.isClickable()) {
            i |= 32;
        }
        if (m23746n(view)) {
            i |= 512;
        }
        if (view instanceof TextView) {
            int i2 = i | 1024 | 1;
            if (view instanceof Button) {
                i2 |= 4;
                if (view instanceof Switch) {
                    i2 |= 8192;
                } else if (view instanceof CheckBox) {
                    i2 |= 32768;
                }
            }
            if (view instanceof EditText) {
                return i2 | 2048;
            }
            return i2;
        } else if ((view instanceof Spinner) || (view instanceof DatePicker)) {
            return i | 4096;
        } else {
            if (view instanceof RatingBar) {
                return i | C6540C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            if (view instanceof RadioGroup) {
                return i | 16384;
            }
            return (!(view instanceof ViewGroup) || !m23747o(view, (View) f22785b.get())) ? i : i | 64;
        }
    }

    /* renamed from: d */
    public static JSONObject m23736d(View view) {
        if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
            f22785b = new WeakReference<>(view);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            m23750r(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> b = m23734b(view);
            for (int i = 0; i < b.size(); i++) {
                jSONArray.put(m23736d(b.get(i)));
            }
            jSONObject.put("childviews", jSONArray);
        } catch (JSONException e) {
            Log.e(f22784a, "Failed to create JSONObject for view.", e);
        }
        return jSONObject;
    }

    /* renamed from: e */
    private static JSONObject m23737e(View view) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("top", view.getTop());
            jSONObject.put(TtmlNode.LEFT, view.getLeft());
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("scrollx", view.getScrollX());
            jSONObject.put("scrolly", view.getScrollY());
            jSONObject.put("visibility", view.getVisibility());
        } catch (JSONException e) {
            Log.e(f22784a, "Failed to create JSONObject for dimension.", e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static View.OnClickListener m23738f(View view) {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static View.OnTouchListener m23739g(View view) {
        Field declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnTouchListener) declaredField.get(obj);
        } catch (NoSuchFieldException e) {
            C3481f0.m11608S(f22784a, e);
            return null;
        } catch (ClassNotFoundException e2) {
            C3481f0.m11608S(f22784a, e2);
            return null;
        } catch (IllegalAccessException e3) {
            C3481f0.m11608S(f22784a, e3);
            return null;
        }
    }

    /* renamed from: h */
    public static String m23740h(View view) {
        CharSequence charSequence;
        if (view instanceof EditText) {
            charSequence = ((EditText) view).getHint();
        } else {
            charSequence = view instanceof TextView ? ((TextView) view).getHint() : null;
        }
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }

    /* renamed from: i */
    public static ViewGroup m23741i(View view) {
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m23742j(android.view.View r6) {
        /*
            boolean r0 = r6 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r1 = r0.getText()
            boolean r0 = r6 instanceof android.widget.Switch
            if (r0 == 0) goto L_0x00cb
            android.widget.Switch r6 = (android.widget.Switch) r6
            boolean r6 = r6.isChecked()
            if (r6 == 0) goto L_0x001b
            java.lang.String r6 = "1"
            goto L_0x001d
        L_0x001b:
            java.lang.String r6 = "0"
        L_0x001d:
            r1 = r6
            goto L_0x00cb
        L_0x0020:
            boolean r0 = r6 instanceof android.widget.Spinner
            if (r0 == 0) goto L_0x0038
            android.widget.Spinner r6 = (android.widget.Spinner) r6
            int r0 = r6.getCount()
            if (r0 <= 0) goto L_0x00cb
            java.lang.Object r6 = r6.getSelectedItem()
            if (r6 == 0) goto L_0x00cb
            java.lang.String r1 = r6.toString()
            goto L_0x00cb
        L_0x0038:
            boolean r0 = r6 instanceof android.widget.DatePicker
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0069
            android.widget.DatePicker r6 = (android.widget.DatePicker) r6
            int r0 = r6.getYear()
            int r1 = r6.getMonth()
            int r6 = r6.getDayOfMonth()
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5[r3] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r6 = "%04d-%02d-%02d"
            java.lang.String r1 = java.lang.String.format(r6, r5)
            goto L_0x00cb
        L_0x0069:
            boolean r0 = r6 instanceof android.widget.TimePicker
            if (r0 == 0) goto L_0x0094
            android.widget.TimePicker r6 = (android.widget.TimePicker) r6
            java.lang.Integer r0 = r6.getCurrentHour()
            int r0 = r0.intValue()
            java.lang.Integer r6 = r6.getCurrentMinute()
            int r6 = r6.intValue()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r3] = r6
            java.lang.String r6 = "%02d:%02d"
            java.lang.String r1 = java.lang.String.format(r6, r1)
            goto L_0x00cb
        L_0x0094:
            boolean r0 = r6 instanceof android.widget.RadioGroup
            if (r0 == 0) goto L_0x00bd
            android.widget.RadioGroup r6 = (android.widget.RadioGroup) r6
            int r0 = r6.getCheckedRadioButtonId()
            int r2 = r6.getChildCount()
        L_0x00a2:
            if (r4 >= r2) goto L_0x00cb
            android.view.View r3 = r6.getChildAt(r4)
            int r5 = r3.getId()
            if (r5 != r0) goto L_0x00ba
            boolean r5 = r3 instanceof android.widget.RadioButton
            if (r5 == 0) goto L_0x00ba
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            java.lang.CharSequence r6 = r3.getText()
            goto L_0x001d
        L_0x00ba:
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00bd:
            boolean r0 = r6 instanceof android.widget.RatingBar
            if (r0 == 0) goto L_0x00cb
            android.widget.RatingBar r6 = (android.widget.RatingBar) r6
            float r6 = r6.getRating()
            java.lang.String r1 = java.lang.String.valueOf(r6)
        L_0x00cb:
            if (r1 != 0) goto L_0x00d0
            java.lang.String r6 = ""
            goto L_0x00d4
        L_0x00d0:
            java.lang.String r6 = r1.toString()
        L_0x00d4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e3.C5237f.m23742j(android.view.View):java.lang.String");
    }

    /* renamed from: k */
    public static View m23743k(float[] fArr, View view) {
        View view2;
        m23745m();
        Method method = f22786c;
        if (!(method == null || view == null)) {
            try {
                View view3 = (View) method.invoke((Object) null, new Object[]{fArr, view});
                if (view3 == null || view3.getId() <= 0 || (view2 = (View) view3.getParent()) == null) {
                    return null;
                }
                return view2;
            } catch (IllegalAccessException e) {
                C3481f0.m11608S(f22784a, e);
            } catch (InvocationTargetException e2) {
                C3481f0.m11608S(f22784a, e2);
            }
        }
        return null;
    }

    /* renamed from: l */
    private static float[] m23744l(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new float[]{(float) iArr[0], (float) iArr[1]};
    }

    /* renamed from: m */
    private static void m23745m() {
        if (f22786c == null) {
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                f22786c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                C3481f0.m11608S(f22784a, e);
            } catch (NoSuchMethodException e2) {
                C3481f0.m11608S(f22784a, e2);
            }
        }
    }

    /* renamed from: n */
    private static boolean m23746n(View view) {
        ViewParent parent = view.getParent();
        return (parent instanceof AdapterView) || (parent instanceof C5712j);
    }

    /* renamed from: o */
    public static boolean m23747o(View view, View view2) {
        View k;
        if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (k = m23743k(m23744l(view), view2)) == null || k.getId() != view.getId()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m23748p(View view) {
        return view.getClass().getName().equals("com.facebook.react.ReactRootView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[ADDED_TO_REGION] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23749q(android.view.View r4, android.view.View.OnClickListener r5) {
        /*
            r0 = 0
            java.lang.String r1 = "android.view.View"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x001a }
            java.lang.String r2 = "mListenerInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x001a }
            java.lang.String r2 = "android.view.View$ListenerInfo"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x001b }
            java.lang.String r3 = "mOnClickListener"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException | NoSuchFieldException -> 0x001b }
            goto L_0x001c
        L_0x001a:
            r1 = r0
        L_0x001b:
            r2 = r0
        L_0x001c:
            if (r1 == 0) goto L_0x003b
            if (r2 != 0) goto L_0x0021
            goto L_0x003b
        L_0x0021:
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ Exception -> 0x003e }
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x003e }
            r1.setAccessible(r3)     // Catch:{ IllegalAccessException -> 0x0030 }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ IllegalAccessException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
        L_0x0031:
            if (r0 != 0) goto L_0x0037
            r4.setOnClickListener(r5)     // Catch:{ Exception -> 0x003e }
            return
        L_0x0037:
            r2.set(r0, r5)     // Catch:{ Exception -> 0x003e }
            goto L_0x003e
        L_0x003b:
            r4.setOnClickListener(r5)     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p072e3.C5237f.m23749q(android.view.View, android.view.View$OnClickListener):void");
    }

    /* renamed from: r */
    public static void m23750r(View view, JSONObject jSONObject) {
        try {
            String j = m23742j(view);
            String h = m23740h(view);
            Object tag = view.getTag();
            CharSequence contentDescription = view.getContentDescription();
            jSONObject.put("classname", view.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", m23735c(view));
            jSONObject.put(TtmlNode.ATTR_ID, view.getId());
            if (!C5235d.m23729g(view)) {
                jSONObject.put("text", C3481f0.m11632i(C3481f0.m11647p0(j), ""));
            } else {
                jSONObject.put("text", "");
                jSONObject.put("is_user_input", true);
            }
            jSONObject.put("hint", C3481f0.m11632i(C3481f0.m11647p0(h), ""));
            if (tag != null) {
                jSONObject.put("tag", C3481f0.m11632i(C3481f0.m11647p0(tag.toString()), ""));
            }
            if (contentDescription != null) {
                jSONObject.put("description", C3481f0.m11632i(C3481f0.m11647p0(contentDescription.toString()), ""));
            }
            jSONObject.put("dimension", m23737e(view));
        } catch (JSONException e) {
            C3481f0.m11608S(f22784a, e);
        }
    }
}
