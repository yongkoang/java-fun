import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.LegoProductTechnic;

public class MainLego {	
	public static void main(String[] args) throws IOException {		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader keyBr = new BufferedReader(reader);
		System.out.println("Plese input sort method! ex)pn,pr,pd");
		String key = keyBr.readLine();
 		
		List<LegoProductTechnic> legos = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("D:\\Projects\\lego\\legoTechnic.txt"));
		while(true) {
			String line = br.readLine();
			if (line == null) break;
			String[] lego = line.split(",", -1);
			int price = 0;
			if ( lego[4] == null || lego[4].equals("")) {
				price = 0;
			} else {
				price = Integer.parseInt(lego[4]);
			}
			LegoProductTechnic lpt = new LegoProductTechnic(Integer.parseInt(lego[0]), lego[1], lego[2], lego[3], price);
			legos.add(lpt);	
		}
		br.close();
		
		System.out.println("total count : " + legos.size());		
		
		if ("pn".equals(key)) {
			System.out.println("Sorted product number!");
			Collections.sort(legos, new LegoProductNumberComparator());
			for (LegoProductTechnic lego : legos) {
				lego.print();
			} 
		}
		
		if ("pr".equals(key)) {
			System.out.println("Sorted product price!");
			Collections.sort(legos, new LegoProductPriceComparator());
			for (LegoProductTechnic lego : legos) {
				lego.print();
			}
		}
		
		if ("pd".equals(key)) {
			System.out.println("Sorted product date!");
			List<LegoProductTechnic> legoSort = new ArrayList<>();
			List<LegoProductTechnic> legoRemain = new ArrayList<>();			
			List<LegoProductTechnic> legoRemain2 = new ArrayList<>();
			List<LegoProductTechnic> legoFor = new ArrayList<>();
			
			LocalDate ldMin = LocalDate.now();
			
			for (int i=1; i <= legos.size(); i++) {				
				ldMin = LocalDate.now();
				if (legoRemain.size() == 0 && legoRemain2.size() == 0 ) {
					legoFor = legos;
				} else if (i % 2 == 0 ) {					
					legoFor = legoRemain;
					legoRemain2.clear();
				} else if (i % 2 == 1 ) {					
					legoFor = legoRemain2;
					legoRemain.clear();
				}
				
				for (LegoProductTechnic lego : legoFor) {
					if (ldMin.isAfter(lego.date)) {
						ldMin = lego.date;
					}
				}
				
				for (LegoProductTechnic lego : legoFor) {
					if (ldMin.isEqual(lego.date)) {
						legoSort.add(lego);
					} else {	
						if (i % 2 == 1) {				
							legoRemain.add(lego);
						} else {				
							legoRemain2.add(lego);
						}
					}
				}
				
				if (legoSort.size() == legos.size()) {
					i = legos.size();
				}
			}
			
			for (LegoProductTechnic lego : legoSort) {
				lego.print();
			}			
		}
	}
}

class LegoProductNumberComparator implements java.util.Comparator<LegoProductTechnic> {
	public int compare(LegoProductTechnic a, LegoProductTechnic b) {
		return a.productNumber - b.productNumber;
	}
}

class LegoProductPriceComparator implements java.util.Comparator<LegoProductTechnic> {
	public int compare(LegoProductTechnic a, LegoProductTechnic b) {
		return a.price - b.price;
	}
}

/* Data
8110  메르세데스-벤츠 유니목 U400 2011-01 295000 2011-01-01
30433 Volvo Wheel Loader 볼보 휠 로더 2021-12 4900 2021-12-01
30655 Forklift with Pallet 지게차와 팔레트 2022-12 4900 2022-12-01
42009  모바일 크레인 MK II 2013-01 349000 2013-01-01
42030  볼보 휠 로더 L350F 2014-01 439900 2014-01-01
42043 Mercedes-Benz Acros 3245 메르세데스-벤츠 아록스 3245 2015-01 329000 2015-01-01
42055  버킷 휠 굴착기 2016-01 167800 2016-01-01
42056  포르쉐 911 GT3 2016-06 449900 2016-06-01
42082  험지형 크레인 2018-01 369900 2018-01-01
42083  부가티 시론 2018-06 570000 2018-06-01
42096  포르쉐 911 RSR 2018-06 514290 2018-06-01
42100  립헬 R 9800 2019-01 600000 2019-01-01
42107 Ducati Panigale V4 R  2020-08 89900 2020-08-01
42114  볼보 6x6 굴절식 트럭 A60H 2020-01 319900 2020-01-01
42115 Lamborghini Sián FKP 37  2020-06 489900 2020-06-01
42116 Skid Steer Loader 스키드 스티어 로더 2021-03 21980 2021-03-01
42117 Race Plane 경주용 비행기 2021-01 12900 2021-01-01
42118 Monster Jam™ Grave Digger™  2022-01 29900 2022-01-01
42119 Monster Jam™ Max-D™  2022-01 29900 2022-01-01
42120  구조용 호버크래프트 2021-01 44900 2021-01-01
42121  헤비듀터 쿨착기 2021-01 59900 2021-01-01
42122  지프 랭글러 루비콘 2도어 2021-01 74900 2021-01-01
42123  맥라렌 세나 GTR 2020-08 74900 2020-08-01
42124  오프로드 버기카 2021-01 179900 2021-01-01
42125 Ferrari 488 GTE“AF Corse #51  2021-01 239900 2021-01-01
42125  포드 F-150 2022-01 199900 2022-01-01
42130 BMW M 1000 RR  2022-01 259900 2022-01-01
42131  캐터필러 D11T 2021-01 599000 2021-01-01
42132 Motorcycle 모터사이클 2022-01 12900 2022-01-01
42133 Telehandler 텔레핸들러 2022-03 12900 2022-03-01
42134 Monster Jam™ Megalodon™  2022-01 29900 2022-01-01
42135 Monster Jam™ El Toro Loco™  2022-01 29900 2022-01-01
42136 John Deere 9620R 4WD Tractor  2022-01 44900 2022-01-01
42137  포르쉐 포뮬러 E 2022-01 74900 2022-01-01
42138  포드 머스탱 쉘비 2022-01 74900 2022-01-01
42139  전지형 차량 2022-01 129900 2022-01-01
42143  페라리 데이토나 SP3 2022-06 599900 2022-06-01
42144  머티리얼 핸들러 2022-01 159900 2022-01-01
42145  에어버스 H175 구조 헬리콥터 2022-01 269900 2022-01-01
42145  멕라렌 포뮬러 1 레이스카 2022-03 273100 2022-03-01
42147 Dump Truck 덤프트럭 2023-01 12900 2023-01-01
42148 Snow Groomer 제설차량 2023-01 12900 2023-01-01
42149 Monster Jam Dragon 몬스터 잼 드래곤 2023-01 29900 2023-01-01
42154  포드 GT 2023-03 198600 2023-03-01
42156  푸조 9X8 르망 24시 하이퍼카 2023-05 259900 2023-05-01
*/