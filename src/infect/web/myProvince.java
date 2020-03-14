package infect.web;

public class myProvince {
	public String getProvincePinyin(String name) {
		String pinyin = new String("");
		switch (name) {
			case "����": 
				pinyin = "anhui";
				break;
			case "����": 
				pinyin = "beijing";
				break;
			case "����": 
				pinyin = "chongqing";
				break;
			case "����": 
				pinyin = "fujian";
				break;
			case "����": 
				pinyin = "gansu";
				break;
			case "�㶫": 
				pinyin = "guangdong";
				break;
			case "����": 
				pinyin = "guangxi";
				break;
			case "����": 
				pinyin = "guizhou";
				break;
			case "����": 
				pinyin = "hainan";
				break;
			case "�ӱ�": 
				pinyin = "hebei";
				break;
			case "����": 
				pinyin = "henan";
				break;
			case "������": 
				pinyin = "heilongjiang";
				break;
			case "����": 
				pinyin = "hubei";
				break;
			case "����": 
				pinyin = "hunan";
				break;
			case "����": 
				pinyin = "jilin";
				break;
			case "����": 
				pinyin = "jiangsu";
				break;
			case "����": 
				pinyin = "jiangxi";
				break;
			case "����": 
				pinyin = "liaoning";
				break;
			case "���ɹ�": 
				pinyin = "neimenggu";
				break;
			case "����": 
				pinyin = "ningxia";
				break;
			case "�ຣ": 
				pinyin = "qinghai";
				break;
			case "ɽ��": 
				pinyin = "shandong";
				break;
			case "ɽ��": 
				pinyin = "shanxi";
				break;
			case "����": 
				pinyin = "shan_xi";
				break;
			case "�Ϻ�": 
				pinyin = "shanghai";
				break;
			case "�Ĵ�": 
				pinyin = "sichuan";
				break;
			case "���": 
				pinyin = "tianjin";
				break;
			case "����": 
				pinyin = "xizang";
				break;
			case "�½�": 
				pinyin = "xinjaing";
				break;
			case "����": 
				pinyin = "yunnan";
				break;
			case "�㽭": 
				pinyin = "zhejiang";
				break;
			default: 
				pinyin = "quanguo";
				break;
		}
		return pinyin;
	}
}
