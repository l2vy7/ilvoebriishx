package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class SensorsConfig implements Serializable {
    private static final long serialVersionUID = -4658637722934999907L;
    @C5010hb(complex = true)
    private BaseSensorConfig ambientTemperatureSensor = new BaseSensorConfig(14);
    private boolean enabled = false;
    @C5010hb(complex = true)
    private BaseSensorConfig gravitySensor = new BaseSensorConfig(9);
    @C5010hb(complex = true)
    private BaseSensorConfig gyroscopeUncalibratedSensor = new BaseSensorConfig(18);
    @C5010hb(complex = true)
    private BaseSensorConfig lightSensor = new BaseSensorConfig(3);
    @C5010hb(complex = true)
    private BaseSensorConfig linearAccelerationSensor = new BaseSensorConfig(9);
    @C5010hb(complex = true)
    private BaseSensorConfig magneticFieldSensor = new BaseSensorConfig(3);
    @C5010hb(complex = true)
    private BaseSensorConfig pressureSensor = new BaseSensorConfig(9);
    private long refreshInterval = 900000;
    @C5010hb(complex = true)
    private BaseSensorConfig relativeHumiditySensor = new BaseSensorConfig(14);
    @C5010hb(complex = true)
    private BaseSensorConfig rotationVectorSensor = new BaseSensorConfig(9);
    private int timeoutInSec = 10;

    /* renamed from: a */
    public BaseSensorConfig mo46404a() {
        return this.ambientTemperatureSensor;
    }

    /* renamed from: b */
    public BaseSensorConfig mo46405b() {
        return this.gravitySensor;
    }

    /* renamed from: c */
    public BaseSensorConfig mo46406c() {
        return this.gyroscopeUncalibratedSensor;
    }

    /* renamed from: d */
    public BaseSensorConfig mo46407d() {
        return this.lightSensor;
    }

    /* renamed from: e */
    public BaseSensorConfig mo46408e() {
        return this.linearAccelerationSensor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SensorsConfig sensorsConfig = (SensorsConfig) obj;
        if (this.timeoutInSec != sensorsConfig.timeoutInSec || this.enabled != sensorsConfig.enabled || this.refreshInterval != sensorsConfig.refreshInterval || !C5015nb.m22922a(this.ambientTemperatureSensor, sensorsConfig.ambientTemperatureSensor) || !C5015nb.m22922a(this.gravitySensor, sensorsConfig.gravitySensor) || !C5015nb.m22922a(this.lightSensor, sensorsConfig.lightSensor) || !C5015nb.m22922a(this.linearAccelerationSensor, sensorsConfig.linearAccelerationSensor) || !C5015nb.m22922a(this.magneticFieldSensor, sensorsConfig.magneticFieldSensor) || !C5015nb.m22922a(this.pressureSensor, sensorsConfig.pressureSensor) || !C5015nb.m22922a(this.relativeHumiditySensor, sensorsConfig.relativeHumiditySensor) || !C5015nb.m22922a(this.rotationVectorSensor, sensorsConfig.rotationVectorSensor) || !C5015nb.m22922a(this.gyroscopeUncalibratedSensor, sensorsConfig.gyroscopeUncalibratedSensor)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public BaseSensorConfig mo46410f() {
        return this.magneticFieldSensor;
    }

    /* renamed from: g */
    public BaseSensorConfig mo46411g() {
        return this.pressureSensor;
    }

    /* renamed from: h */
    public long mo46412h() {
        return this.refreshInterval;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.timeoutInSec), Boolean.valueOf(this.enabled), Long.valueOf(this.refreshInterval), this.ambientTemperatureSensor, this.gravitySensor, this.lightSensor, this.linearAccelerationSensor, this.magneticFieldSensor, this.pressureSensor, this.relativeHumiditySensor, this.rotationVectorSensor, this.gyroscopeUncalibratedSensor};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: i */
    public BaseSensorConfig mo46414i() {
        return this.relativeHumiditySensor;
    }

    /* renamed from: j */
    public BaseSensorConfig mo46415j() {
        return this.rotationVectorSensor;
    }

    /* renamed from: k */
    public int mo46416k() {
        return this.timeoutInSec;
    }

    /* renamed from: l */
    public boolean mo46417l() {
        return this.enabled;
    }
}
