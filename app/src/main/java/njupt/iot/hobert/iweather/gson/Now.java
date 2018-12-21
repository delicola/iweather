package njupt.iot.hobert.iweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    /**
     * cond_code : 501
     * cond_txt : 雾
     * fl : 8
     * hum : 94
     * pcpn : 0
     * pres : 1018
     * tmp : 9
     * vis : 2
     * wind_deg : 48
     * wind_dir : 东北风
     * wind_sc : 微风
     * wind_spd : 7
     */
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String info;

    private String cond_code;
    //  private String cond_txt;
    private String fl;
    private String hum;
    private String pcpn;
    private String pres;
    //  private String tmp;
    private String vis;
    private String wind_deg;
    private String wind_dir;
    private String wind_sc;
    private String wind_spd;

}

