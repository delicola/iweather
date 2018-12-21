package njupt.iot.hobert.iweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("location")
    public String cityName;

    @SerializedName("cid")
    public String weatherId;

    //private String cid;
    // private String location;
    private String parent_city;
    private String admin_area;
    private String cnty;
    private String lat;
    private String lon;
    private String tz;
//    public Update update;
//
//    public class Update {
//
//        @SerializedName("loc")
//        public String updateTime;

}



