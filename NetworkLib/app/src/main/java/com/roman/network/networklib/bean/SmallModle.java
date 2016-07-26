package com.roman.network.networklib.bean;

import java.util.List;

/**
 * Created by roman
 * Describe
 * On 2016/7/25.
 */
public class SmallModle {

    /**
     * moduleName : 头条
     * moduleId : 1
     * typeNum : 1rr9rl6cyi
     * modulePic :
     * adArray : [{"title":"澳洲租房须知","adstype":null,"link":"#","imgsrc":"/ausheadlines/Public/Admin/upload/o_1aki9b1bo1j3f1dhu1fuu1fqe16rea.jpg"}]
     */

    private String moduleName;
    private String moduleId;
    private String typeNum;
    private String modulePic;
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
