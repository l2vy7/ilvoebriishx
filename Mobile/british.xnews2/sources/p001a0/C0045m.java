package p001a0;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: a0.m */
/* compiled from: Person */
public class C0045m {

    /* renamed from: a */
    CharSequence f148a;

    /* renamed from: b */
    IconCompat f149b;

    /* renamed from: c */
    String f150c;

    /* renamed from: d */
    String f151d;

    /* renamed from: e */
    boolean f152e;

    /* renamed from: f */
    boolean f153f;

    /* renamed from: a */
    public IconCompat mo115a() {
        return this.f149b;
    }

    /* renamed from: b */
    public String mo116b() {
        return this.f151d;
    }

    /* renamed from: c */
    public CharSequence mo117c() {
        return this.f148a;
    }

    /* renamed from: d */
    public String mo118d() {
        return this.f150c;
    }

    /* renamed from: e */
    public boolean mo119e() {
        return this.f152e;
    }

    /* renamed from: f */
    public boolean mo120f() {
        return this.f153f;
    }

    /* renamed from: g */
    public String mo121g() {
        String str = this.f150c;
        if (str != null) {
            return str;
        }
        if (this.f148a == null) {
            return "";
        }
        return "name:" + this.f148a;
    }

    /* renamed from: h */
    public Person mo122h() {
        return new Person.Builder().setName(mo117c()).setIcon(mo115a() != null ? mo115a().mo3121u() : null).setUri(mo118d()).setKey(mo116b()).setBot(mo119e()).setImportant(mo120f()).build();
    }
}
