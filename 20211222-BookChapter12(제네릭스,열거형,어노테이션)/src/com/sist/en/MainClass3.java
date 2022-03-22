package com.sist.en;
import java.util.*;
import java.util.stream.Collectors;
enum AreaCode {
	 
	A01("02", "����Ư����"),  A02("031", "��⵵"), A03("032", "��õ������"), A04("033", "������"), A05("041", "��û����"),
	A06("042", "����������"), A07("043", "��û�ϵ�"), A08("044", "����Ư����ġ��"), A09("051", "�λ걤����"), A10("052", "��걤����"),
	A11("053", "�뱸������"), A12("054", "���ϵ�"), A13("055", "��󳲵�"), A14("061", "���󳲵�"), A15("062", "���ֱ�����"),
	A16("063", "����ϵ�"), A17("064", "����Ư����ġ��");
 
	private String areaCode;
	private String sido;
 
	AreaCode(String areaCode, String sido) {
		this.areaCode = areaCode;
		this.sido = sido;
	}
 
	private static final List<Map<String, String>> areaCodes = Arrays.stream(values())
			.map(AreaCode -> {
				Map<String, String> m = new HashMap();
				m.put("cd", AreaCode.name());
				m.put("nm", AreaCode.areaCode);
				return m;
			})
			.collect(Collectors.toList());
	public static List<Map<String, String>> getAreaCodes() {
		return areaCodes;
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Map<String,String>> list=AreaCode.getAreaCodes();
        System.out.println(list.toString());
	}

}
