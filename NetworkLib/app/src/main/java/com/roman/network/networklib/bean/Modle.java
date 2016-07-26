package com.roman.network.networklib.bean;

import java.util.List;

/**
 * Created by roman
 * Describe
 * On 2016/7/25.
 */
public class Modle {

    /**
     * errorcode : 200
     * errormsg : 正确
     * data : [{"moduleName":"头条","moduleId":"1","typeNum":"1rr9rl6cyi","modulePic":"","adArray":[{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1aki9b1bo1j3f1dhu1fuu1fqe16rea.jpg"},{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1akifes5k1f5bb3g6obm4ffloa.jpg"}]},{"moduleName":"租房","moduleId":"69","typeNum":"14537042970056wmsryj","modulePic":"","adArray":[{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1aki578ml5nk17tf45l1d0q1fv2a.jpg"},{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1aki5hra0flpepkcsi66kglla.jpg"}]},{"moduleName":"工作","moduleId":"75","typeNum":"1454466102cycfun0rl6","modulePic":"","adArray":null},{"moduleName":"移民","moduleId":"78","typeNum":"1455777881y53bd27l75","modulePic":"/ausheadlines/Public/Admin/upload/o_1ad0ndqq8ue825daen1hm4kh8a.png","adArray":null},{"moduleName":"旅游","moduleId":"79","typeNum":"14557794100dge8mhji9","modulePic":"/ausheadlines/Public/Admin/upload/o_1ad0odertvis10k3jrr1r611n9oa.png","adArray":null},{"moduleName":"精品","moduleId":"80","typeNum":"1456215216uun0vlc6c8","modulePic":"/ausheadlines/Public/Admin/upload/o_1ad0ol3onjgi1a1u16kb1njg198ha.png","adArray":null}]
     */

    private String errorcode;
    private String errormsg;

    @Override
    public String toString() {
        return "Modle{" +
                "errorcode='" + errorcode + '\'' +
                ", errormsg='" + errormsg + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * moduleName : 头条
     * moduleId : 1
     * typeNum : 1rr9rl6cyi
     * modulePic :
     * adArray : [{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1aki9b1bo1j3f1dhu1fuu1fqe16rea.jpg"},{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1akifes5k1f5bb3g6obm4ffloa.jpg"}]
     */

    private List<DataBean> data;

    public String getErrorcode() {
        return errorcode;
    }

    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String moduleName;
        private String moduleId;
        private String typeNum;
        private String modulePic;

        @Override
        public String toString() {
            return "DataBean{" +
                    "moduleName='" + moduleName + '\'' +
                    ", moduleId='" + moduleId + '\'' +
                    ", typeNum='" + typeNum + '\'' +
                    ", modulePic='" + modulePic + '\'' +
                    ", adArray=" + adArray +
                    '}';
        }

        /**
         * title : 澳洲租房须知
         * adstype : null
         * link : #
         * imgsrc : /ausheadlines/Public/Admin/upload/o_1aki9b1bo1j3f1dhu1fuu1fqe16rea.jpg
         */

        private List<AdArrayBean> adArray;

        public String getModuleName() {
            return moduleName;
        }

        public void setModuleName(String moduleName) {
            this.moduleName = moduleName;
        }

        public String getModuleId() {
            return moduleId;
        }

        public void setModuleId(String moduleId) {
            this.moduleId = moduleId;
        }

        public String getTypeNum() {
            return typeNum;
        }

        public void setTypeNum(String typeNum) {
            this.typeNum = typeNum;
        }

        public String getModulePic() {
            return modulePic;
        }

        public void setModulePic(String modulePic) {
            this.modulePic = modulePic;
        }

        public List<AdArrayBean> getAdArray() {
            return adArray;
        }

        public void setAdArray(List<AdArrayBean> adArray) {
            this.adArray = adArray;
        }

        public static class AdArrayBean {
            private String title;
            private Object adstype;
            private String link;
            private String imgsrc;

            @Override
            public String toString() {
                return "AdArrayBean{" +
                        "title='" + title + '\'' +
                        ", adstype=" + adstype +
                        ", link='" + link + '\'' +
                        ", imgsrc='" + imgsrc + '\'' +
                        '}';
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public Object getAdstype() {
                return adstype;
            }

            public void setAdstype(Object adstype) {
                this.adstype = adstype;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }
    }
}
