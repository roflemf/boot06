package net.daum.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든속성들에 대해 생성자 만들어줌(생성자 오버로딩)
public class MemberVO {
	
	private int mno;
	private String mid;
	private String mpw;
	private String mname;
	private Timestamp regdate;

}
