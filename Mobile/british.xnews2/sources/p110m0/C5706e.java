package p110m0;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m0.e */
/* compiled from: KeyEventDispatcher */
public class C5706e {

    /* renamed from: a */
    private static boolean f24332a = false;

    /* renamed from: b */
    private static Method f24333b = null;

    /* renamed from: c */
    private static boolean f24334c = false;

    /* renamed from: d */
    private static Field f24335d;

    /* renamed from: m0.e$a */
    /* compiled from: KeyEventDispatcher */
    public interface C5707a {
        /* renamed from: h */
        boolean mo933h(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m25207a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f24332a) {
            try {
                f24333b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f24332a = true;
        }
        Method method = f24333b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m25208b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m25207a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C5723u.m25317i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m25209c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m25212f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C5723u.m25317i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m25210d(View view, KeyEvent keyEvent) {
        return C5723u.m25319j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m25211e(C5707a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo933h(keyEvent);
        }
        if (callback instanceof Activity) {
            return m25208b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m25209c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C5723u.m25317i(view, keyEvent)) && !aVar.mo933h(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m25212f(Dialog dialog) {
        if (!f24334c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f24335d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f24334c = true;
        }
        Field field = f24335d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
