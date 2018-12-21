package njupt.iot.hobert.iweather.gson;

import com.google.gson.annotations.SerializedName;

public class Update {
    /**
     * loc : 2017-10-26 23:09
     * utc : 2017-10-26 15:09
     */
    // private String loc;
    public String utc;

    @SerializedName("loc")
    public String updateTime;

}
