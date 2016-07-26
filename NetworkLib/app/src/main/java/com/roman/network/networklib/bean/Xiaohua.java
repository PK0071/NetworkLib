package com.roman.network.networklib.bean;

import java.util.List;

/**
 * Created by roman
 * Describe:
 * On 2016/7/19.
 */
public class Xiaohua {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"allNum":7892,"allPages":395,"contentlist":[{"ct":"2016-05-30 16:30:27.242","id":"574bfa236e36c1d5f9289678","img":"http://www.zbjuran.com/uploads/allimg/160530/2-160530145631924.gif","title":"要不要来个鸳鸯戏水呢","type":3},{"ct":"2016-05-30 16:30:27.239","id":"574bfa236e36c1d5f9289677","img":"http://www.zbjuran.com/uploads/allimg/160530/2-160530151R09B.gif","title":"翻滚的美少女","type":3}],"currentPage":1,"maxResult":20,"ret_code":0}
     */

    private int showapi_res_code;
    private String showapi_res_error;

    @Override
    public String toString() {
        return "Xiaohua{" +
                "showapi_res_code=" + showapi_res_code +
                ", showapi_res_error='" + showapi_res_error + '\'' +
                ", showapi_res_body=" + showapi_res_body +
                '}';
    }

    /**
     * allNum : 7892
     * allPages : 395
     * contentlist : [{"ct":"2016-05-30 16:30:27.242","id":"574bfa236e36c1d5f9289678","img":"http://www.zbjuran.com/uploads/allimg/160530/2-160530145631924.gif","title":"要不要来个鸳鸯戏水呢","type":3},{"ct":"2016-05-30 16:30:27.239","id":"574bfa236e36c1d5f9289677","img":"http://www.zbjuran.com/uploads/allimg/160530/2-160530151R09B.gif","title":"翻滚的美少女","type":3}]
     * currentPage : 1
     * maxResult : 20
     * ret_code : 0
     */

    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        @Override
        public String toString() {
            return "ShowapiResBodyBean{" +
                    "allNum=" + allNum +
                    ", allPages=" + allPages +
                    ", currentPage=" + currentPage +
                    ", maxResult=" + maxResult +
                    ", ret_code=" + ret_code +
                    ", contentlist=" + contentlist +
                    '}';
        }

        private int allNum;
        private int allPages;
        private int currentPage;
        private int maxResult;
        private int ret_code;
        /**
         * ct : 2016-05-30 16:30:27.242
         * id : 574bfa236e36c1d5f9289678
         * img : http://www.zbjuran.com/uploads/allimg/160530/2-160530145631924.gif
         * title : 要不要来个鸳鸯戏水呢
         * type : 3
         */

        private List<ContentlistBean> contentlist;

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<ContentlistBean> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<ContentlistBean> contentlist) {
            this.contentlist = contentlist;
        }

        public static class ContentlistBean {
            private String ct;
            private String id;
            private String img;
            private String title;
            private int type;

            @Override
            public String toString() {
                return "ContentlistBean{" +
                        "ct='" + ct + '\'' +
                        ", id='" + id + '\'' +
                        ", img='" + img + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        '}';
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
