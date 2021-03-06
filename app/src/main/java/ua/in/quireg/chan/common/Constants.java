package ua.in.quireg.chan.common;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.http.protocol.HTTP;

import android.os.Build;

import ua.in.quireg.chan.BuildConfig;

public class Constants {

    public static final boolean LOGGING = BuildConfig.DEBUG;

    public static final ArrayList<String> IMAGE_EXTENSIONS = new ArrayList<String>(Arrays.asList(new String[] { "jpg",
            "jpeg", "png", "gif" }));
    public static final String GIF_IMAGE = "gif";

    public static final ArrayList<String> COOKIE_REQUIRE_BOARDS = new ArrayList<String>(Arrays.asList(new String[] {
            "h", "ho", "hc", "e", "fet" }));


    public static final int SDK_VERSION = Integer.parseInt(Build.VERSION.SDK);

    public static final String DEFAULT_DOWNLOAD_FOLDER = "/download/2ch Browser/";

    // Иногда меняется (когда-то был 2ch.so), поэтому добавил в настройки.
    public static final String DEFAULT_DOMAIN = "2ch.hk";

    // Для http-запросов
    public static final String USER_AGENT_STRING = "2ch Browser (Android)";
    public static final String SAGE_EMAIL = "sage";
    public static final Charset UTF8_CHARSET = Charset.forName(HTTP.UTF_8);
    public static final String MULTIPART_BOUNDARY = "----WebKitFormBoundaryyD8qfvcSfpRMHx9M";

    public static final String CF_CLEARANCE_COOKIE = "cf_clearance";
    public static final String USERCODE_NOCAPTCHA_COOKIE = "passcode_auth";
    public static final String ADULT_ACCESS_COOKIE = "usercode_auth";

    // После этого числа порядковый номер поста становится красного цвета
    public static final int BUMP_LIMIT = 500;
    public static final int BUMP_LIMIT_EXTENDED = 1000;

    public static final int MAX_ATTACHMENTS = 8;

    public static final int OP_POST_POSITION = 0;

    // Request-коды для запуска метода startActivityForResult
    public static final int REQUEST_CODE_PICK_BOARD_ACTIVITY = 0;
    public static final int REQUEST_CODE_FILE_LIST_ACTIVITY = 1;
    public static final int REQUEST_CODE_ADD_POST_ACTIVITY = 2;
    public static final int REQUEST_CODE_GALLERY = 3;
    public static final int REQUEST_CODE_RECAPTCHA = 4;
    public static final int REQUEST_CODE_VIDEO_FILE = 5;
    public static final int REQUEST_CODE_INSTANT_PHOTO = 6;

    // Extra-параметры для передачи в объект Intent
    public static final String EXTRA_BOARD_NAME = "ExtraBoardName";
    public static final String EXTRA_BOARD_PAGE = "ExtraBoardPage";
    public static final String EXTRA_THREAD_NUMBER = "ExtraThreadNumber";
    public static final String EXTRA_THREAD_SUBJECT = "ExtraThreadSubject";
    public static final String EXTRA_POST_NUMBER = "ExtraPostNumber";
    public static final String EXTRA_POST_COMMENT = "ExtraPostComment";
    public static final String EXTRA_SELECTED_FILE = "ExtraSelectedFile";
    public static final String EXTRA_REDIRECTED_THREAD_NUMBER = "ExtraRedirectedThreadNumber";
    public static final String EXTRA_CURRENT_URL = "ExtraCurrentUrl";
    public static final String EXTRA_IMAGE_URI = "ExtraImageUri";
    public static final String EXTRA_PREFER_DESERIALIZED = "ExtraPreferDeserialized";
    public static final String EXTRA_THREAD_URL = "ExtraThreadUrl";
    public static final String EXTRA_WEBSITE = "ExtraWebsite";
    public static final String EXTRA_CATALOG = "ExtraCatalog";

    // Идентификаторы для контекстного меню
    public static final int CONTEXT_MENU_ANSWER = 1001;
    public static final int CONTEXT_MENU_OPEN_ATTACHMENT = 1002;
    public static final int CONTEXT_MENU_REPLY_POST = 1003;
    public static final int CONTEXT_MENU_REPLY_POST_QUOTE = 1004;
    public static final int CONTEXT_MENU_DOWNLOAD_FILE = 1005;
    public static final int CONTEXT_MENU_COPY_TEXT = 1006;
    public static final int CONTEXT_MENU_COPY_URL = 1007;
    public static final int CONTEXT_MENU_VIEW_FULL_POST = 1008;
    public static final int CONTEXT_MENU_ADD_FAVORITES = 1009;
    public static final int CONTEXT_MENU_REMOVE_FAVORITES = 1010;
    public static final int CONTEXT_MENU_SEARCH_IMAGE = 1011;
    public static final int CONTEXT_MENU_HIDE_THREAD = 1012;
    public static final int CONTEXT_MENU_SHARE = 1013;
    public static final int CONTEXT_MENU_OPEN_THREAD = 1014;
    public static final int CONTEXT_MENU_SEARCH_IMAGE_GOOGLE = 1015;

    public static final int IMAGE_VIEW_WEB_VIEW = 0;
    public static final int IMAGE_VIEW_SUBSCALEVIEW = 1;

    public static final int GIF_WEB_VIEW = 0;
    public static final int GIF_NATIVE_LIB = 1;

    public static final int VIDEO_PLAYER_WEBVIEW = 0;
    public static final int VIDEO_PLAYER_VIDEOVIEW = 1;
    public static final int VIDEO_PLAYER_EXTERNAL_1CLICK = 2;
    public static final int VIDEO_PLAYER_EXTERNAL_2CLICK = 3;
}
