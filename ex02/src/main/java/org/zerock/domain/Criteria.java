package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Criteria {

  private int pageNum;
  private int amount;
  private int offsetNum;
  
  private String type;
  private String keyword;

  public Criteria() {
    this(1, 2);
  }
  public Criteria(int pageNum, int amount) {
	  this.pageNum = pageNum;
	  this.amount = amount;
  }
  
  public void updateOffsetNum() {
	  this.offsetNum = (pageNum-1)*amount;
  }

  
  public String[] getTypeArr() {
    
    return type == null? new String[] {}: type.split("");
  }
}
