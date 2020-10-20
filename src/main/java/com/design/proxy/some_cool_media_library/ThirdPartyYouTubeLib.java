package com.design.proxy.some_cool_media_library;

import java.util.HashMap;
//代理接口
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
