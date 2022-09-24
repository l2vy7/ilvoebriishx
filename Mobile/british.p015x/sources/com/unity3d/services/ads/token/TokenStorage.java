package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;

public class TokenStorage {
    private static int _accessCounter = 0;
    private static String _initToken = null;
    private static final Object _lock = new Object();
    private static boolean _peekMode = false;
    private static ConcurrentLinkedQueue<String> _queue;

    public static void appendTokens(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (_lock) {
            z = false;
            if (_queue == null) {
                _queue = new ConcurrentLinkedQueue<>();
                _accessCounter = 0;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                _queue.add(jSONArray.getString(i));
            }
            if (!_queue.isEmpty()) {
                z = true;
            }
        }
        if (z) {
            triggerTokenAvailable(Boolean.FALSE);
            AsyncTokenStorage.getInstance().onTokenAvailable(TokenType.TOKEN_REMOTE);
        }
    }

    public static void createTokens(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (_lock) {
            _queue = new ConcurrentLinkedQueue<>();
            z = false;
            _accessCounter = 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                _queue.add(jSONArray.getString(i));
            }
            if (!_queue.isEmpty()) {
                z = true;
            }
        }
        if (z) {
            triggerTokenAvailable(Boolean.FALSE);
            AsyncTokenStorage.getInstance().onTokenAvailable(TokenType.TOKEN_REMOTE);
        }
    }

    public static void deleteTokens() {
        synchronized (_lock) {
            _queue = null;
            _accessCounter = 0;
        }
    }

    public static String getToken() {
        synchronized (_lock) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = _queue;
            if (concurrentLinkedQueue == null) {
                String str = _initToken;
                return str;
            } else if (concurrentLinkedQueue.isEmpty()) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
                return null;
            } else if (_peekMode) {
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent = TokenEvent.TOKEN_ACCESS;
                int i = _accessCounter;
                _accessCounter = i + 1;
                currentApp.sendEvent(webViewEventCategory, tokenEvent, Integer.valueOf(i));
                String peek = _queue.peek();
                return peek;
            } else {
                WebViewApp currentApp2 = WebViewApp.getCurrentApp();
                WebViewEventCategory webViewEventCategory2 = WebViewEventCategory.TOKEN;
                TokenEvent tokenEvent2 = TokenEvent.TOKEN_ACCESS;
                int i2 = _accessCounter;
                _accessCounter = i2 + 1;
                currentApp2.sendEvent(webViewEventCategory2, tokenEvent2, Integer.valueOf(i2));
                String poll = _queue.poll();
                return poll;
            }
        }
    }

    public static void setInitToken(String str) {
        boolean z;
        synchronized (_lock) {
            _initToken = str;
            z = str != null;
        }
        if (z) {
            AsyncTokenStorage.getInstance().onTokenAvailable(TokenType.TOKEN_REMOTE);
            triggerTokenAvailable(Boolean.TRUE);
        }
    }

    public static void setPeekMode(boolean z) {
        synchronized (_lock) {
            _peekMode = z;
        }
    }

    private static void triggerTokenAvailable(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }
}
