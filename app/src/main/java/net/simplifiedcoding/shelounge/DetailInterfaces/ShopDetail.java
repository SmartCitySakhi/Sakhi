package net.simplifiedcoding.shelounge.DetailInterfaces;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by tjuhi on 6/26/2017.
 */

public interface ShopDetail {
    @FormUrlEncoded
    @POST("/shop_detail.php")
    public void where(
            @Field("longitude") String LONGITUDE,
            Callback<Response> callback
    );
}
