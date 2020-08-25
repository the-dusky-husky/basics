package tasks;

/**
 * Created by abhisheks on 21-04-2020.
 */
public class RequestParams {

    private String msisdn;
    private String appid;
    private String supappid;
    private String msgText;
    private int contentType;
    private int intFlag;

    public RequestParams(RequestParamsBuilder requestParamsBuilder) {
        this.msisdn= requestParamsBuilder.msisdn;
        this.appid=requestParamsBuilder.appid;
        this.msgText=requestParamsBuilder.msgText;
        this.contentType=requestParamsBuilder.contentType;
        this.intFlag=requestParamsBuilder.intFlag;
        this.supappid=requestParamsBuilder.supappid;
    }

    @Override
    public String toString() {
        return "RequestParams{" +
                "msisdn='" + msisdn + '\'' +
                ", appid='" + appid + '\'' +
                ", supappid='" + supappid + '\'' +
                ", msgText='" + msgText + '\'' +
                ", contentType=" + contentType +
                ", intFlag=" + intFlag +
                '}';
    }

    public static class RequestParamsBuilder
    {
        private String msisdn;
        private String appid;
        private String supappid;
        private String msgText;
        private int contentType;
        private int intFlag;

        public RequestParamsBuilder(String msisdn,String appid, String msgText){
            this.msisdn= msisdn;
            this.appid=appid;
            this.msgText=msgText;
        }

        public RequestParamsBuilder setSupappid(String supappid) {
            this.supappid = supappid;
            return this;
        }

        public RequestParamsBuilder setContentType(int contentType) {
            this.contentType = contentType;
            return this;
        }

        public RequestParamsBuilder setIntFlag(int intFlag) {
            this.intFlag = intFlag;
            return this;
        }

        public RequestParams build(){
            return new RequestParams(this);
        }
    }
}
