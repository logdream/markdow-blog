package win.log.models;

/**
 * Created by surface on 2017/7/2.
 */
public class Result {
    private boolean isok;
    private String info;

    public boolean isIsok() {
        return isok;
    }

    public void setIsok(boolean isok) {
        this.isok = isok;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public Result(){
        super();
    }

    public Result(boolean isok, String info) {
        this.isok = isok;
        this.info = info;
    }
}
