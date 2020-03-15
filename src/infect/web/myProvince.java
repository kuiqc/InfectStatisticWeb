package infect.web;

public class myProvince {
	public String getProvincePinyin(String name) {
		String pinyin = new String("");
		switch (name) {
			case "安徽": 
				pinyin = "anhui";
				break;
			case "北京": 
				pinyin = "beijing";
				break;
			case "重庆": 
				pinyin = "chongqing";
				break;
			case "福建": 
				pinyin = "fujian";
				break;
			case "甘肃": 
				pinyin = "gansu";
				break;
			case "广东": 
				pinyin = "guangdong";
				break;
			case "广西": 
				pinyin = "guangxi";
				break;
			case "贵州": 
				pinyin = "guizhou";
				break;
			case "海南": 
				pinyin = "hainan";
				break;
			case "河北": 
				pinyin = "hebei";
				break;
			case "河南": 
				pinyin = "henan";
				break;
			case "黑龙江": 
				pinyin = "heilongjiang";
				break;
			case "湖北": 
				pinyin = "hubei";
				break;
			case "湖南": 
				pinyin = "hunan";
				break;
			case "吉林": 
				pinyin = "jilin";
				break;
			case "江苏": 
				pinyin = "jiangsu";
				break;
			case "江西": 
				pinyin = "jiangxi";
				break;
			case "辽宁": 
				pinyin = "liaoning";
				break;
			case "内蒙古": 
				pinyin = "neimenggu";
				break;
			case "宁夏": 
				pinyin = "ningxia";
				break;
			case "青海": 
				pinyin = "qinghai";
				break;
			case "山东": 
				pinyin = "shandong";
				break;
			case "山西": 
				pinyin = "shanxi";
				break;
			case "陕西": 
				pinyin = "shan_xi";
				break;
			case "上海": 
				pinyin = "shanghai";
				break;
			case "四川": 
				pinyin = "sichuan";
				break;
			case "天津": 
				pinyin = "tianjin";
				break;
			case "西藏": 
				pinyin = "xizang";
				break;
			case "新疆": 
				pinyin = "xinjaing";
				break;
			case "云南": 
				pinyin = "yunnan";
				break;
			case "浙江": 
				pinyin = "zhejiang";
				break;
			default: 
				pinyin = "quanguo";
				break;
		}
		return pinyin;
	}
}
