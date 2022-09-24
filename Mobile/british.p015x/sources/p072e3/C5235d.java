package p072e3;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* renamed from: e3.d */
/* compiled from: SensitiveUserDataUtils */
public class C5235d {
    /* renamed from: a */
    private static boolean m23723a(TextView textView) {
        String replaceAll = C5237f.m23742j(textView).replaceAll("\\s", "");
        int length = replaceAll.length();
        if (length < 12 || length > 19) {
            return false;
        }
        int i = 0;
        boolean z = false;
        for (int i2 = length - 1; i2 >= 0; i2--) {
            char charAt = replaceAll.charAt(i2);
            if (charAt < '0' || charAt > '9') {
                return false;
            }
            int i3 = charAt - '0';
            if (z && (i3 = i3 * 2) > 9) {
                i3 = (i3 % 10) + 1;
            }
            i += i3;
            z = !z;
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m23724b(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        String j = C5237f.m23742j(textView);
        if (j == null || j.length() == 0) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(j).matches();
    }

    /* renamed from: c */
    private static boolean m23725c(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    /* renamed from: d */
    private static boolean m23726d(TextView textView) {
        return textView.getInputType() == 96;
    }

    /* renamed from: e */
    private static boolean m23727e(TextView textView) {
        return textView.getInputType() == 3;
    }

    /* renamed from: f */
    private static boolean m23728f(TextView textView) {
        return textView.getInputType() == 112;
    }

    /* renamed from: g */
    public static boolean m23729g(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (m23725c(textView) || m23723a(textView) || m23726d(textView) || m23728f(textView) || m23727e(textView) || m23724b(textView)) {
            return true;
        }
        return false;
    }
}
