package navigationdrawer.arifhasnat.com.categorypagedetails.Model;



import org.litepal.crud.DataSupport;

import java.io.Serializable;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class CategoryPageDetailsModel extends DataSupport   implements Serializable {

    private  String id;
    private String url;
    private int thumbWitdth;
    private int getThumbHeight;

    public CategoryPageDetailsModel() {
    }

    public CategoryPageDetailsModel(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public CategoryPageDetailsModel(int getThumbHeight, int thumbWitdth, String url, String id) {
        this.getThumbHeight = getThumbHeight;
        this.thumbWitdth = thumbWitdth;
        this.url = url;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getThumbWitdth() {
        return thumbWitdth;
    }

    public void setThumbWitdth(int thumbWitdth) {
        this.thumbWitdth = thumbWitdth;
    }

    public int getGetThumbHeight() {
        return getThumbHeight;
    }

    public void setGetThumbHeight(int getThumbHeight) {
        this.getThumbHeight = getThumbHeight;
    }

    @Override
    public String toString() {
        return "CategoryPageDetailsModel{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", thumbWitdth=" + thumbWitdth +
                ", getThumbHeight=" + getThumbHeight +
                '}';
    }

}
