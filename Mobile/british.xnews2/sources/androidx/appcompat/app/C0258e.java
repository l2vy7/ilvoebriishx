package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C0377c0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p072f.C5247j;
import p098k.C5525d;
import p110m0.C5723u;
import p149t.C6090g;

/* renamed from: androidx.appcompat.app.e */
/* compiled from: AppCompatViewInflater */
public class C0258e {

    /* renamed from: b */
    private static final Class<?>[] f780b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f781c = {16843375};

    /* renamed from: d */
    private static final String[] f782d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C6090g<String, Constructor<? extends View>> f783e = new C6090g<>();

    /* renamed from: a */
    private final Object[] f784a = new Object[2];

    /* renamed from: androidx.appcompat.app.e$a */
    /* compiled from: AppCompatViewInflater */
    private static class C0259a implements View.OnClickListener {

        /* renamed from: b */
        private final View f785b;

        /* renamed from: c */
        private final String f786c;

        /* renamed from: d */
        private Method f787d;

        /* renamed from: e */
        private Context f788e;

        public C0259a(View view, String str) {
            this.f785b = view;
            this.f786c = str;
        }

        /* renamed from: a */
        private void m1223a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f786c, new Class[]{View.class})) != null) {
                        this.f787d = method;
                        this.f788e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f785b.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f785b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f786c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f785b.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f787d == null) {
                m1223a(this.f785b.getContext());
            }
            try {
                this.f787d.invoke(this.f788e, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m1202a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C5723u.m25289O(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f781c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0259a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m1203r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        C6090g<String, Constructor<? extends View>> gVar = f783e;
        Constructor<? extends U> constructor = gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f780b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f784a);
    }

    /* renamed from: s */
    private View m1204s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f784a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f782d;
                    if (i < strArr.length) {
                        View r = m1203r(context, str, strArr[i]);
                        if (r != null) {
                            return r;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f784a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r2 = m1203r(context, str, (String) null);
                Object[] objArr3 = this.f784a;
                objArr3[0] = null;
                objArr3[1] = null;
                return r2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f784a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m1205t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23064Q3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C5247j.f23069R3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C5247j.f23074S3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof C5525d) || ((C5525d) context).mo22017c() != resourceId) ? new C5525d(context, resourceId) : context;
        }
        return context;
    }

    /* renamed from: u */
    private void m1206u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatAutoCompleteTextView mo934b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppCompatButton mo935c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatCheckBox mo936d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatCheckedTextView mo937e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatEditText mo938f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatImageButton mo939g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatImageView mo940h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatMultiAutoCompleteTextView mo941i(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public AppCompatRadioButton mo942j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatRatingBar mo943k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public AppCompatSeekBar mo944l(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatSpinner mo945m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatTextView mo946n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCompatToggleButton mo947o(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public View mo948p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final View mo949q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m1205t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0377c0.m1949b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo943k(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 1:
                view2 = mo937e(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 2:
                view2 = mo941i(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 3:
                view2 = mo946n(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 4:
                view2 = mo939g(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 5:
                view2 = mo944l(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 6:
                view2 = mo945m(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 7:
                view2 = mo942j(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 8:
                view2 = mo947o(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 9:
                view2 = mo940h(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 10:
                view2 = mo934b(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 11:
                view2 = mo936d(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 12:
                view2 = mo938f(context2, attributeSet);
                m1206u(view2, str);
                break;
            case 13:
                view2 = mo935c(context2, attributeSet);
                m1206u(view2, str);
                break;
            default:
                view2 = mo948p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m1204s(context2, str, attributeSet);
        }
        if (view2 != null) {
            m1202a(view2, attributeSet);
        }
        return view2;
    }
}
