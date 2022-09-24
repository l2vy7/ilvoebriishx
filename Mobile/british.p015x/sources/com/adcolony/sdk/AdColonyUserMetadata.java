package com.adcolony.sdk;

import android.location.Location;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: d */
    static final int f10564d = 128;

    /* renamed from: a */
    JSONArray f10565a = C2976x.m10301a();

    /* renamed from: b */
    JSONObject f10566b = C2976x.m10319b();

    /* renamed from: c */
    Location f10567c;

    public AdColonyUserMetadata addUserInterest(String str) {
        if (C2916s0.m10083e(str)) {
            C2976x.m10322b(this.f10565a, str);
            C2976x.m10314a(this.f10566b, "adc_interests", this.f10565a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        JSONArray a = C2976x.m10301a();
        this.f10565a = a;
        C2976x.m10314a(this.f10566b, "adc_interests", a);
        return this;
    }

    public Object getMetadata(String str) {
        return C2976x.m10336h(this.f10566b, str);
    }

    public int getUserAge() {
        return C2976x.m10332e(this.f10566b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return C2976x.m10332e(this.f10566b, "adc_household_income");
    }

    public String getUserEducation() {
        return C2976x.m10337i(this.f10566b, "adc_education");
    }

    public String getUserGender() {
        return C2976x.m10337i(this.f10566b, "adc_gender");
    }

    public String[] getUserInterests() {
        String[] strArr = new String[this.f10565a.length()];
        for (int i = 0; i < this.f10565a.length(); i++) {
            strArr[i] = C2976x.m10331d(this.f10565a, i);
        }
        return strArr;
    }

    public Location getUserLocation() {
        return this.f10567c;
    }

    public String getUserMaritalStatus() {
        return C2976x.m10337i(this.f10566b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return C2976x.m10337i(this.f10566b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z) {
        if (C2916s0.m10083e(str)) {
            C2976x.m10325b(this.f10566b, str, z);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(int i) {
        setMetadata("adc_age", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i) {
        setMetadata("adc_household_income", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (C2916s0.m10083e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(String str) {
        if (C2916s0.m10083e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.f10567c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", (double) location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", (double) location.getTime());
        setMetadata("adc_accuracy", (double) location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (C2916s0.m10083e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (C2916s0.m10083e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, double d) {
        if (C2916s0.m10083e(str)) {
            C2976x.m10312a(this.f10566b, str, d);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (C2916s0.m10083e(str2) && C2916s0.m10083e(str)) {
            C2976x.m10313a(this.f10566b, str, str2);
        }
        return this;
    }
}
