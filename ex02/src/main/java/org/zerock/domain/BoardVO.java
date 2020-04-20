package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

  private int bno;
  private int no;
  private String test;
  private String title;
  private String content;
  private String writer;
  private Date regdate;
  private Date updateDate;
}
