package builder;

/**
 * Created by abhisheks on 24-04-2020.
 */
public class RequestParams {

    private String appid;
    private String msisdn;
    private String text;

    private int intFlag;
    private int alertFlag;

    public RequestParams(RequestParamsBuilder requestParamsBuilder){
        this.appid= requestParamsBuilder.appid;
        this.msisdn= requestParamsBuilder.msisdn;
        this.text= requestParamsBuilder.text;
        this.intFlag= requestParamsBuilder.intFlag;
        this.alertFlag= requestParamsBuilder.alertFlag;

    }

    @Override
    public String toString() {
        return "RequestParams{" +
                "appid='" + appid + '\'' +
                ", msisdn='" + msisdn + '\'' +
                ", text='" + text + '\'' +
                ", intFlag=" + intFlag +
                ", alertFlag=" + alertFlag +
                '}';
    }

    public static class RequestParamsBuilder{

        private String appid;
        private String msisdn;
        private String text;

        private int intFlag;
        private int alertFlag;

        public RequestParamsBuilder(String appid, String msisdn, String text){
            this.msisdn=msisdn;
            this.appid=appid;
            this.text=text;
        }

        public RequestParamsBuilder setAlertFlag(int alert){
            this.alertFlag=alert;
            return this;
        }

        public RequestParamsBuilder setIntFlag(int intFlag){
            this.intFlag=intFlag;
            return this;
        }

        public RequestParams build(){
            return new RequestParams(this);
        }


    }

}