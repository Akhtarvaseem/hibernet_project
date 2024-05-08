package com.jsp.hibernate_practoce.anotroller;

import com.jsp.hibernate_practoce.dao.PAPanDao;
import com.jsp.hibernate_practoce.dto.Address;
import com.jsp.hibernate_practoce.dto.Pan;
import com.jsp.hibernate_practoce.dto.Persion;

public class ControllerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PAPanDao dao=new PAPanDao();
		Persion p=new Persion();
		Pan pan=new Pan();
		Address ad=new Address();
//		
//		p.setId(101);
//		p.setName("hello");
//		
//		pan.setId(123);
//		pan.setName("chal nikal");
//		
//		ad.setId(111);
//		ad.setCityName("gunda");
//		
//		p.setPan(pan);
//		p.setAddress(ad);
//		
//		ad.setPersion(p);
//		
//		dao.insert(p, pan, ad);
		
		int id=111;
		dao.delete(id);
//		
		
		
	}

}
