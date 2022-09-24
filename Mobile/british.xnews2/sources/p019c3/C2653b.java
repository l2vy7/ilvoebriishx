package p019c3;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p071e3.C5237f;

/* renamed from: c3.b */
/* compiled from: MetadataMatcher */
final class C2653b {
    /* renamed from: a */
    static List<String> m9290a(View view) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(C5237f.m23740h(view));
        Object tag = view.getTag();
        if (tag != null) {
            arrayList.add(tag.toString());
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            arrayList.add(contentDescription.toString());
        }
        try {
            if (view.getId() != -1) {
                String[] split = view.getResources().getResourceName(view.getId()).split("/");
                if (split.length == 2) {
                    arrayList.add(split[1]);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!str.isEmpty() && str.length() <= 100) {
                arrayList2.add(str.toLowerCase());
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    static List<String> m9291b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof EditText) {
            return arrayList;
        }
        if (view instanceof TextView) {
            String charSequence = ((TextView) view).getText().toString();
            if (!charSequence.isEmpty() && charSequence.length() < 100) {
                arrayList.add(charSequence.toLowerCase());
            }
            return arrayList;
        }
        for (View b : C5237f.m23734b(view)) {
            arrayList.addAll(m9291b(b));
        }
        return arrayList;
    }

    /* renamed from: c */
    static boolean m9292c(String str, List<String> list) {
        for (String contains : list) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    static boolean m9293d(List<String> list, List<String> list2) {
        for (String c : list) {
            if (m9292c(c, list2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    static boolean m9294e(String str, String str2) {
        return str.matches(str2);
    }
}
