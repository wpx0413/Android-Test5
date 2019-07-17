package com.bytedance.android.lesson.restapi.solution.newtork;

import com.bytedance.android.lesson.restapi.solution.bean.FeedResponse;
import com.bytedance.android.lesson.restapi.solution.bean.PostVideoResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * @author Xavier.S
 * @date 2019.01.17 20:38
 */
public interface IMiniDouyinService {
    // TODO-C2 (7) Implement your MiniDouyin PostVideo Request here,

    @Multipart
    @POST("mini_douyin/invoke/video")
    Call<PostVideoResponse> createVideo(
            @Query("student_id") String student_id,
            @Query("user_name") String user_name,
            @Part MultipartBody.Part image,@Part MultipartBody.Part video);

    // TODO-C2 (8) Implement your MiniDouyin Feed Request here, url: (GET) http://test.androidcamp.bytedance.com/mini_douyin/invoke/video
    @GET("mini_douyin/invoke/video")
    Call<FeedResponse> fetchFeed();
}
