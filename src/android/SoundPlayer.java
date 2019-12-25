package soundPlugin;

import android.app.Activity;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.net.Uri;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;
import android.util.Log;

public class SoundPlayer extends CordovaPlugin {

    private Map<String, Integer> map = new HashMap<String, Integer>();
    private Activity mActivity;
    private SoundPool soundPool;
    private Uri uri;
    private Ringtone rt;

    private CallbackContext mCallback = null;

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        mActivity = cordova.getActivity();
        soundPool = new SoundPool(2, AudioManager.STREAM_NOTIFICATION, 100);
        map.put("ok", soundPool.load(mActivity,mActivity.getResources().getIdentifier("ok", "raw",mActivity.getPackageName()), 1));
        map.put("error", soundPool.load(mActivity,mActivity.getResources().getIdentifier("error", "raw",mActivity.getPackageName()), 1));
        map.put("dataerror", soundPool.load(mActivity,mActivity.getResources().getIdentifier("dataerror", "raw",mActivity.getPackageName()), 1));
        map.put("scan", soundPool.load(mActivity,mActivity.getResources().getIdentifier("scan", "raw",mActivity.getPackageName()), 1));
        map.put("pifa", soundPool.load(mActivity,mActivity.getResources().getIdentifier("pifa", "raw",mActivity.getPackageName()), 1));
        map.put("yufenhuo", soundPool.load(mActivity,mActivity.getResources().getIdentifier("yufenhuo", "raw",mActivity.getPackageName()), 1));
        map.put("zhitong", soundPool.load(mActivity,mActivity.getResources().getIdentifier("zhitong", "raw",mActivity.getPackageName()), 1));
        map.put("zhouyang", soundPool.load(mActivity,mActivity.getResources().getIdentifier("zhouyang", "raw",mActivity.getPackageName()), 1));
        uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);//播放音量
        rt = RingtoneManager.getRingtone(mActivity, uri);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         
        if(action.equals("init")) {
            this.mCallback = callbackContext;
            return true;
        } else if(action.equals("playOk")) {
            soundPool.play(map.get("ok"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        } else if(action.equals("playError")) {
            soundPool.play(map.get("error"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        } else if(action.equals("playDataError")) {
            soundPool.play(map.get("dataerror"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        } else if(action.equals("playScan")){
            soundPool.play(map.get("scan"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        }else if(action.equals("playPifa")){
            soundPool.play(map.get("pifa"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        }else if(action.equals("playYufenhuo")){
            soundPool.play(map.get("yufenhuo"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        }else if(action.equals("playZhitong")){
            soundPool.play(map.get("zhitong"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        }else if(action.equals("playZhouyang")){
            soundPool.play(map.get("zhouyang"), 1.0f, 1.0f, 0, 0, 1);
            return true;
        }
        
        return false;
    }
}