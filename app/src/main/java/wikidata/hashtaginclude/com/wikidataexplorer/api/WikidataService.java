package wikidata.hashtaginclude.com.wikidataexplorer.api;

import com.google.gson.JsonElement;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import wikidata.hashtaginclude.com.wikidataexplorer.models.GetEntityResponseModel;
import wikidata.hashtaginclude.com.wikidataexplorer.models.RecentResponseModel;
import wikidata.hashtaginclude.com.wikidataexplorer.models.SearchEntityResponseModel;

/**
 * Created by matthewmichaud on 1/17/15.
 */
public interface WikidataService {
    @GET("/w/api.php")
    void getRecent(@Query("action") String action, @Query("list") String list, @Query("format") String format, @Query("rclimit") int rclimit, @Query("rcprop") String rcprop, Callback<RecentResponseModel> callback);

    @GET("/w/api.php")
    void getRecent(@Query("action") String action, @Query("list") String list, @Query("format") String format, @Query("rclimit") int rclimit, @Query("rcstart") String rcstart, @Query("rcprop") String rcprop, Callback<RecentResponseModel> callback);

    @GET("/w/api.php")
    void getEntity(@Query("action") String action, @Query("ids") String id, @Query("uselang") String useLang, @Query("format") String format, Callback<JsonElement> callback);

    @GET("/w/api.php")
    JsonElement getEntity(@Query("action") String action, @Query("ids") String id, @Query("uselang") String useLang, @Query("format") String format);

    @GET("/w/api.php")
    void searchEntities(@Query("action") String action,
                        @Query("search") String search,
                        @Query("language") String language,
                        @Query("type") String type,
                        @Query("limit") int limit,
                        @Query("continue") int continueQuery,
                        @Query("format") String format,
                        Callback<SearchEntityResponseModel> callback);

    @GET("/w/api.php")
    String searchEntities(@Query("action") String action,
                        @Query("search") String search,
                        @Query("language") String language,
                        @Query("type") String type,
                        @Query("limit") int limit,
                        @Query("continue") int continueQuery,
                        @Query("format") String format);

    @GET("/w/api.php")
    void getEntities(
            @Query("action") String action,
            @Query("ids") String ids,
            @Query("sites") String sites,
            @Query("titles") String titles,
            @Query("redirects") String redirects,
            @Query("props") String props,
            @Query("languages") String languages,
            @Query("languagefallback") String languageFallback,
            @Query("normalize") String normalize,
            @Query("ungroupedlist") String ungroupedList,
            @Query("sitefilter") String siteFilter,
            @Query("format") String format,
            Callback<JsonElement> callback);

    @GET("/w/api.php")
    void getEntities(
            @Query("action") String action,
            @Query("ids") String ids,
            @Query("format") String format,
            Callback<JsonElement> callback);
}
