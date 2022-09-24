package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p257v4.C11058b;

/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Barcode> CREATOR = new C9993b();

    /* renamed from: b */
    public int f47012b;

    /* renamed from: c */
    public String f47013c;

    /* renamed from: d */
    public String f47014d;

    /* renamed from: e */
    public int f47015e;

    /* renamed from: f */
    public Point[] f47016f;

    /* renamed from: g */
    public Email f47017g;

    /* renamed from: h */
    public Phone f47018h;

    /* renamed from: i */
    public Sms f47019i;

    /* renamed from: j */
    public WiFi f47020j;

    /* renamed from: k */
    public UrlBookmark f47021k;

    /* renamed from: l */
    public GeoPoint f47022l;

    /* renamed from: m */
    public CalendarEvent f47023m;

    /* renamed from: n */
    public ContactInfo f47024n;

    /* renamed from: o */
    public DriverLicense f47025o;

    /* renamed from: p */
    public byte[] f47026p;

    /* renamed from: q */
    public boolean f47027q;

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Address> CREATOR = new C9992a();

        /* renamed from: b */
        public int f47028b;

        /* renamed from: c */
        public String[] f47029c;

        public Address() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49527m(parcel, 2, this.f47028b);
            C11058b.m49538x(parcel, 3, this.f47029c, false);
            C11058b.m49516b(parcel, a);
        }

        public Address(int i, String[] strArr) {
            this.f47028b = i;
            this.f47029c = strArr;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator<CalendarDateTime> CREATOR = new C9994c();

        /* renamed from: b */
        public int f47030b;

        /* renamed from: c */
        public int f47031c;

        /* renamed from: d */
        public int f47032d;

        /* renamed from: e */
        public int f47033e;

        /* renamed from: f */
        public int f47034f;

        /* renamed from: g */
        public int f47035g;

        /* renamed from: h */
        public boolean f47036h;

        /* renamed from: i */
        public String f47037i;

        public CalendarDateTime() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49527m(parcel, 2, this.f47030b);
            C11058b.m49527m(parcel, 3, this.f47031c);
            C11058b.m49527m(parcel, 4, this.f47032d);
            C11058b.m49527m(parcel, 5, this.f47033e);
            C11058b.m49527m(parcel, 6, this.f47034f);
            C11058b.m49527m(parcel, 7, this.f47035g);
            C11058b.m49517c(parcel, 8, this.f47036h);
            C11058b.m49537w(parcel, 9, this.f47037i, false);
            C11058b.m49516b(parcel, a);
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.f47030b = i;
            this.f47031c = i2;
            this.f47032d = i3;
            this.f47033e = i4;
            this.f47034f = i5;
            this.f47035g = i6;
            this.f47036h = z;
            this.f47037i = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator<CalendarEvent> CREATOR = new C9996e();

        /* renamed from: b */
        public String f47038b;

        /* renamed from: c */
        public String f47039c;

        /* renamed from: d */
        public String f47040d;

        /* renamed from: e */
        public String f47041e;

        /* renamed from: f */
        public String f47042f;

        /* renamed from: g */
        public CalendarDateTime f47043g;

        /* renamed from: h */
        public CalendarDateTime f47044h;

        public CalendarEvent() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49537w(parcel, 2, this.f47038b, false);
            C11058b.m49537w(parcel, 3, this.f47039c, false);
            C11058b.m49537w(parcel, 4, this.f47040d, false);
            C11058b.m49537w(parcel, 5, this.f47041e, false);
            C11058b.m49537w(parcel, 6, this.f47042f, false);
            C11058b.m49535u(parcel, 7, this.f47043g, i, false);
            C11058b.m49535u(parcel, 8, this.f47044h, i, false);
            C11058b.m49516b(parcel, a);
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.f47038b = str;
            this.f47039c = str2;
            this.f47040d = str3;
            this.f47041e = str4;
            this.f47042f = str5;
            this.f47043g = calendarDateTime;
            this.f47044h = calendarDateTime2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator<ContactInfo> CREATOR = new C9995d();

        /* renamed from: b */
        public PersonName f47045b;

        /* renamed from: c */
        public String f47046c;

        /* renamed from: d */
        public String f47047d;

        /* renamed from: e */
        public Phone[] f47048e;

        /* renamed from: f */
        public Email[] f47049f;

        /* renamed from: g */
        public String[] f47050g;

        /* renamed from: h */
        public Address[] f47051h;

        public ContactInfo() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49535u(parcel, 2, this.f47045b, i, false);
            C11058b.m49537w(parcel, 3, this.f47046c, false);
            C11058b.m49537w(parcel, 4, this.f47047d, false);
            C11058b.m49540z(parcel, 5, this.f47048e, i, false);
            C11058b.m49540z(parcel, 6, this.f47049f, i, false);
            C11058b.m49538x(parcel, 7, this.f47050g, false);
            C11058b.m49540z(parcel, 8, this.f47051h, i, false);
            C11058b.m49516b(parcel, a);
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.f47045b = personName;
            this.f47046c = str;
            this.f47047d = str2;
            this.f47048e = phoneArr;
            this.f47049f = emailArr;
            this.f47050g = strArr;
            this.f47051h = addressArr;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator<DriverLicense> CREATOR = new C9998g();

        /* renamed from: b */
        public String f47052b;

        /* renamed from: c */
        public String f47053c;

        /* renamed from: d */
        public String f47054d;

        /* renamed from: e */
        public String f47055e;

        /* renamed from: f */
        public String f47056f;

        /* renamed from: g */
        public String f47057g;

        /* renamed from: h */
        public String f47058h;

        /* renamed from: i */
        public String f47059i;

        /* renamed from: j */
        public String f47060j;

        /* renamed from: k */
        public String f47061k;

        /* renamed from: l */
        public String f47062l;

        /* renamed from: m */
        public String f47063m;

        /* renamed from: n */
        public String f47064n;

        /* renamed from: o */
        public String f47065o;

        public DriverLicense() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49537w(parcel, 2, this.f47052b, false);
            C11058b.m49537w(parcel, 3, this.f47053c, false);
            C11058b.m49537w(parcel, 4, this.f47054d, false);
            C11058b.m49537w(parcel, 5, this.f47055e, false);
            C11058b.m49537w(parcel, 6, this.f47056f, false);
            C11058b.m49537w(parcel, 7, this.f47057g, false);
            C11058b.m49537w(parcel, 8, this.f47058h, false);
            C11058b.m49537w(parcel, 9, this.f47059i, false);
            C11058b.m49537w(parcel, 10, this.f47060j, false);
            C11058b.m49537w(parcel, 11, this.f47061k, false);
            C11058b.m49537w(parcel, 12, this.f47062l, false);
            C11058b.m49537w(parcel, 13, this.f47063m, false);
            C11058b.m49537w(parcel, 14, this.f47064n, false);
            C11058b.m49537w(parcel, 15, this.f47065o, false);
            C11058b.m49516b(parcel, a);
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f47052b = str;
            this.f47053c = str2;
            this.f47054d = str3;
            this.f47055e = str4;
            this.f47056f = str5;
            this.f47057g = str6;
            this.f47058h = str7;
            this.f47059i = str8;
            this.f47060j = str9;
            this.f47061k = str10;
            this.f47062l = str11;
            this.f47063m = str12;
            this.f47064n = str13;
            this.f47065o = str14;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Email> CREATOR = new C9997f();

        /* renamed from: b */
        public int f47066b;

        /* renamed from: c */
        public String f47067c;

        /* renamed from: d */
        public String f47068d;

        /* renamed from: e */
        public String f47069e;

        public Email() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49527m(parcel, 2, this.f47066b);
            C11058b.m49537w(parcel, 3, this.f47067c, false);
            C11058b.m49537w(parcel, 4, this.f47068d, false);
            C11058b.m49537w(parcel, 5, this.f47069e, false);
            C11058b.m49516b(parcel, a);
        }

        public Email(int i, String str, String str2, String str3) {
            this.f47066b = i;
            this.f47067c = str;
            this.f47068d = str2;
            this.f47069e = str3;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GeoPoint> CREATOR = new C10000i();

        /* renamed from: b */
        public double f47070b;

        /* renamed from: c */
        public double f47071c;

        public GeoPoint() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49522h(parcel, 2, this.f47070b);
            C11058b.m49522h(parcel, 3, this.f47071c);
            C11058b.m49516b(parcel, a);
        }

        public GeoPoint(double d, double d2) {
            this.f47070b = d;
            this.f47071c = d2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PersonName> CREATOR = new C9999h();

        /* renamed from: b */
        public String f47072b;

        /* renamed from: c */
        public String f47073c;

        /* renamed from: d */
        public String f47074d;

        /* renamed from: e */
        public String f47075e;

        /* renamed from: f */
        public String f47076f;

        /* renamed from: g */
        public String f47077g;

        /* renamed from: h */
        public String f47078h;

        public PersonName() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49537w(parcel, 2, this.f47072b, false);
            C11058b.m49537w(parcel, 3, this.f47073c, false);
            C11058b.m49537w(parcel, 4, this.f47074d, false);
            C11058b.m49537w(parcel, 5, this.f47075e, false);
            C11058b.m49537w(parcel, 6, this.f47076f, false);
            C11058b.m49537w(parcel, 7, this.f47077g, false);
            C11058b.m49537w(parcel, 8, this.f47078h, false);
            C11058b.m49516b(parcel, a);
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f47072b = str;
            this.f47073c = str2;
            this.f47074d = str3;
            this.f47075e = str4;
            this.f47076f = str5;
            this.f47077g = str6;
            this.f47078h = str7;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Phone> CREATOR = new C10002k();

        /* renamed from: b */
        public int f47079b;

        /* renamed from: c */
        public String f47080c;

        public Phone() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49527m(parcel, 2, this.f47079b);
            C11058b.m49537w(parcel, 3, this.f47080c, false);
            C11058b.m49516b(parcel, a);
        }

        public Phone(int i, String str) {
            this.f47079b = i;
            this.f47080c = str;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Sms> CREATOR = new C10001j();

        /* renamed from: b */
        public String f47081b;

        /* renamed from: c */
        public String f47082c;

        public Sms() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49537w(parcel, 2, this.f47081b, false);
            C11058b.m49537w(parcel, 3, this.f47082c, false);
            C11058b.m49516b(parcel, a);
        }

        public Sms(String str, String str2) {
            this.f47081b = str;
            this.f47082c = str2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator<UrlBookmark> CREATOR = new C10004m();

        /* renamed from: b */
        public String f47083b;

        /* renamed from: c */
        public String f47084c;

        public UrlBookmark() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49537w(parcel, 2, this.f47083b, false);
            C11058b.m49537w(parcel, 3, this.f47084c, false);
            C11058b.m49516b(parcel, a);
        }

        public UrlBookmark(String str, String str2) {
            this.f47083b = str;
            this.f47084c = str2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator<WiFi> CREATOR = new C10003l();

        /* renamed from: b */
        public String f47085b;

        /* renamed from: c */
        public String f47086c;

        /* renamed from: d */
        public int f47087d;

        public WiFi() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C11058b.m49515a(parcel);
            C11058b.m49537w(parcel, 2, this.f47085b, false);
            C11058b.m49537w(parcel, 3, this.f47086c, false);
            C11058b.m49527m(parcel, 4, this.f47087d);
            C11058b.m49516b(parcel, a);
        }

        public WiFi(String str, String str2, int i) {
            this.f47085b = str;
            this.f47086c = str2;
            this.f47087d = i;
        }
    }

    public Barcode() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C11058b.m49515a(parcel);
        C11058b.m49527m(parcel, 2, this.f47012b);
        C11058b.m49537w(parcel, 3, this.f47013c, false);
        C11058b.m49537w(parcel, 4, this.f47014d, false);
        C11058b.m49527m(parcel, 5, this.f47015e);
        C11058b.m49540z(parcel, 6, this.f47016f, i, false);
        C11058b.m49535u(parcel, 7, this.f47017g, i, false);
        C11058b.m49535u(parcel, 8, this.f47018h, i, false);
        C11058b.m49535u(parcel, 9, this.f47019i, i, false);
        C11058b.m49535u(parcel, 10, this.f47020j, i, false);
        C11058b.m49535u(parcel, 11, this.f47021k, i, false);
        C11058b.m49535u(parcel, 12, this.f47022l, i, false);
        C11058b.m49535u(parcel, 13, this.f47023m, i, false);
        C11058b.m49535u(parcel, 14, this.f47024n, i, false);
        C11058b.m49535u(parcel, 15, this.f47025o, i, false);
        C11058b.m49520f(parcel, 16, this.f47026p, false);
        C11058b.m49517c(parcel, 17, this.f47027q);
        C11058b.m49516b(parcel, a);
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense, byte[] bArr, boolean z) {
        this.f47012b = i;
        this.f47013c = str;
        this.f47026p = bArr;
        this.f47014d = str2;
        this.f47015e = i2;
        this.f47016f = pointArr;
        this.f47027q = z;
        this.f47017g = email;
        this.f47018h = phone;
        this.f47019i = sms;
        this.f47020j = wiFi;
        this.f47021k = urlBookmark;
        this.f47022l = geoPoint;
        this.f47023m = calendarEvent;
        this.f47024n = contactInfo;
        this.f47025o = driverLicense;
    }
}
