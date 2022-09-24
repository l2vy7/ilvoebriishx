package com.startapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.ads.list3d.List3DView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.startapp.c4 */
/* compiled from: Sta */
public class C11818c4 {

    /* renamed from: a */
    public HashMap<String, C11868d9> f52654a = new HashMap<>();

    /* renamed from: b */
    public Hashtable<String, Bitmap> f52655b = new Hashtable<>();

    /* renamed from: c */
    public Set<String> f52656c = new HashSet();

    /* renamed from: d */
    public C12030l7 f52657d;

    /* renamed from: e */
    public int f52658e = 0;

    /* renamed from: f */
    public ConcurrentLinkedQueue<C11820b> f52659f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.startapp.c4$a */
    /* compiled from: Sta */
    public class C11819a extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a */
        public int f52660a = -1;

        /* renamed from: b */
        public String f52661b;

        /* renamed from: c */
        public String f52662c;

        public C11819a(int i, String str, String str2) {
            this.f52660a = i;
            this.f52661b = str;
            this.f52662c = str2;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return C11878e1.m52263b(this.f52662c);
        }

        public void onPostExecute(Object obj) {
            List<C12142q5> list;
            Bitmap bitmap = (Bitmap) obj;
            C11818c4 c4Var = C11818c4.this;
            boolean z = true;
            c4Var.f52658e--;
            if (bitmap != null) {
                c4Var.f52655b.put(this.f52661b, bitmap);
                C12030l7 l7Var = C11818c4.this.f52657d;
                if (l7Var != null) {
                    int i = this.f52660a;
                    List3DActivity list3DActivity = (List3DActivity) l7Var;
                    List3DView list3DView = list3DActivity.f54229a;
                    View childAt = list3DView.getChildAt(i - list3DView.f54251i);
                    if (childAt != null) {
                        C12160r5 r5Var = (C12160r5) childAt.getTag();
                        C12178s5 a = C12342t5.f54758b.mo46637a(list3DActivity.f54234f);
                        if (!(a == null || (list = a.f54141b) == null || i >= list.size())) {
                            C12142q5 q5Var = a.f54141b.get(i);
                            r5Var.f54102b.setImageBitmap(a.f54140a.mo45194a(i, q5Var.f54052a, q5Var.f54060i));
                            r5Var.f54102b.requestLayout();
                            if (q5Var.f54065n == null) {
                                z = false;
                            }
                            r5Var.mo45712a(z);
                        }
                    }
                }
                C11818c4 c4Var2 = C11818c4.this;
                if (!c4Var2.f52659f.isEmpty()) {
                    C11820b poll = c4Var2.f52659f.poll();
                    new C11819a(poll.f52664a, poll.f52665b, poll.f52666c).execute(new Void[0]);
                }
            }
        }
    }

    /* renamed from: com.startapp.c4$b */
    /* compiled from: Sta */
    public class C11820b {

        /* renamed from: a */
        public int f52664a;

        /* renamed from: b */
        public String f52665b;

        /* renamed from: c */
        public String f52666c;

        public C11820b(C11818c4 c4Var, int i, String str, String str2) {
            this.f52664a = i;
            this.f52665b = str;
            this.f52666c = str2;
        }
    }

    /* renamed from: a */
    public final String mo45195a(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        return TextUtils.join("^", strArr) + str;
    }

    /* renamed from: a */
    public Bitmap mo45194a(int i, String str, String str2) {
        Bitmap bitmap = this.f52655b.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f52656c.contains(str)) {
            return null;
        }
        this.f52656c.add(str);
        int i2 = this.f52658e;
        if (i2 >= 15) {
            this.f52659f.add(new C11820b(this, i, str, str2));
            return null;
        }
        this.f52658e = i2 + 1;
        new C11819a(i, str, str2).execute(new Void[0]);
        return null;
    }
}
