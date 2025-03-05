package com.kh.member.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
	private int replyNo;
	private String replyContent;
	private int refBoardNo;
	private int repWriter;
	private String createDate;
	private String status;
}
