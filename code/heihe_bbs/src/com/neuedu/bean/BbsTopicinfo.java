package com.neuedu.bean;
import java.util.*;
import com.tgb.lk.annotation.*;

@AutoBean(alias = "BbsTopicinfo",table="tab_bbs_topicinfo")
public class BbsTopicinfo {

  @AutoField(alias = "ÐòºÅ", column = "id", isKey = true , isRequired = true , type="Integer", length=0)
  @ExcelVOAttribute(name = "id", column = "A")
  private int id;

  @AutoField(alias = "title", column = "title", isRequired = true, length = 200)
  @ExcelVOAttribute(name = "title", column = "B")
  private String title;

  @AutoField(alias = "content", column = "content", isRequired = true)
  @ExcelVOAttribute(name = "content", column = "C")
  private String content;

  @AutoField(alias = "createtime", column = "createtime", isRequired = true, type = "Date")
  @ExcelVOAttribute(name = "createtime", column = "D")
  private Date createtime;

  @AutoField(alias = "categoryId", column = "category_id", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "category_id", column = "E")
  private int categoryId;

  @AutoField(alias = "viewCount", column = "view_count", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "view_count", column = "F")
  private int viewCount;

  @AutoField(alias = "userid", column = "userid", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "userid", column = "G")
  private int userid;

  @AutoField(alias = "isGood", column = "is_good", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "is_good", column = "H")
  private int isGood;

  @AutoField(alias = "isEnd", column = "is_end", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "is_end", column = "I")
  private int isEnd;


  public int getId() {
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content){
    this.content = content;
  }
  public Date getCreatetime() {
    return createtime;
  }
  public void setCreatetime(Date createtime){
    this.createtime = createtime;
  }
  public int getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(int categoryId){
    this.categoryId = categoryId;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount){
    this.viewCount = viewCount;
  }
  public int getUserid() {
    return userid;
  }
  public void setUserid(int userid){
    this.userid = userid;
  }
  public int getIsGood() {
    return isGood;
  }
  public void setIsGood(int isGood){
    this.isGood = isGood;
  }
  public int getIsEnd() {
    return isEnd;
  }
  public void setIsEnd(int isEnd){
    this.isEnd = isEnd;
  }
}
