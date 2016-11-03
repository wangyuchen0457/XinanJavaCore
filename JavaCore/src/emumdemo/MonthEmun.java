package emumdemo;

import lombok.Getter;
import lombok.Setter;

public enum MonthEmun {
	January(1, "一月"), February(2, "二月"), March(3, "三月"), April(4, "四月"),
	May(5, "五月"), June(6, "六月"), July(7,"七月"), August(8, "八月"), 
	September(9, "九月"), October(10, "十月"), November(11, "十一月"), 
	December(12, "十二月");
	@Getter@Setter
	private Integer index;
	@Getter@Setter
	private String name;

	private MonthEmun(Integer index, String name) {
         this.index=index;
         this.name=name;
	}
}

