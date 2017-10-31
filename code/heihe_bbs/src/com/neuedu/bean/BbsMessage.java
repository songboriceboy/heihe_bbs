package com.neuedu.bean;
import java.util.*;
import com.tgb.lk.annotation.*;

@AutoBean(alias = "BbsMessage",table="tab_bbs_message")
public class BbsMessage {

  @AutoField(alias = "ÐòºÅ", column = "id", isKey = true , isRequired = true , type="Integer", length=0)
  @ExcelVOAttribute(name = "id", column = "A")
  private int id;

  @AutoField(alias = "commentId", column = "comment_id", isRequired = true, type = "Integer")
  @ExcelVOAttribute(name = "comment_id", column = "B")
  private int commentId;


  public int getId() {
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public int getCommentId() {
    return commentId;
  }
  public void setCommentId(int commentId){
    this.commentId = commentId;
  }
}
