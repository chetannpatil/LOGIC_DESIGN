package others;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TreeSet;

public class TestDate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt =null ;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar gc = new GregorianCalendar();
		/*System.out.println(sdf.MONTH_FIELD);
		System.out.println(sdf.DATE_FIELD);
		System.out.println(sdf.DAY_OF_YEAR_FIELD);
		System.out.println(sdf.YEAR_FIELD);*/
		
		//System.out.println(dt.toString().split(" ")[2]+" "+dt.toString().split(" ")[1]);
		Date dt2 = null ;
		System.out.println("enter past in dd/mm/yyyy format");
		String dobStr = new Scanner(System.in).next();
		
		try {
			dt = sdf.parse(dobStr);
			
			Date today = new Date();
			Date today2 = new Date();
			
			System.out.println("enter future in dd/mm/yyyy format");
			String dobStr2 = new Scanner(System.in).next();
			dt2 = sdf.parse(dobStr2);
		/*	//
			//dt = new Date(dobStr);
			//dt = new Date(28, 2, 2017);
			String datSa [] = dobStr.split("/");
			gc = new GregorianCalendar(Integer.parseInt(datSa[2]), (Integer.parseInt(datSa[1])-1),Integer.parseInt(datSa[0]));
			//dt = new Date(Integer.parseInt(datSa[2])-1900, (Integer.parseInt(datSa[1])-1),Integer.parseInt(datSa[0]));
			dt=sdf.parse("01/01/1234");*/
			
			
			System.out.println("prevs");
			System.out.println(dt);
			System.out.println("prevs getime = "+dt.getTime());
			System.out.println("prevs getmonth  = "+dt.getMonth());
			System.out.println("prv hour = "+dt.getHours());
			System.out.println("prev het mins = "+dt.getMinutes());
			System.out.println("prvget sec  ="+dt.getSeconds());
			System.out.println("today");
			System.out.println(today);
			System.out.println("tdy gettime = "+today.getTime());
			System.out.println("toady get hour = "+today.getHours());
			System.out.println("tdy het mins = "+today.getMinutes());
			System.out.println("tdy get sec  ="+today.getSeconds());
			System.out.println("prev  - today                 =  "+(dt.getTime()-today.getTime()));
			System.out.println("int of [prev  - today ]       =  "+(int)(dt.getTime()-today.getTime()));
			System.out.println("int of prev  - int of  today  =  "+((int)dt.getTime()-(int)today.getTime()));
			System.out.println("futere");
			System.out.println(dt2);
			System.out.println("FUTURE GETTI = "+dt2.getTime());
			System.out.println("ftyu hour = "+dt2.getHours());
			System.out.println("ftr het mins = "+dt2.getMinutes());
			System.out.println("ftrget sec  ="+dt2.getSeconds());
			System.out.println("today - furu           = "+(today.getTime() - dt2.getTime()));
			System.out.println("int [today - furu]     = "+(int)(today.getTime() - dt2.getTime()));
			System.out.println("int [today - int [furu = "+((int)today.getTime() - (int)dt2.getTime()));
			
		
			System.out.println("year prv");
			System.out.println("tody1 equls tdy2 = "+(today.equals(today2)));
			System.out.println("");
			System.out.println("y1 prv -y2 today = "+(dt.getYear()-today.getYear()));
			System.out.println("y1 today -y2 dt2 = "+(today.getYear()-dt2.getYear()));
			DateComparator dc = new DateComparator() ;
			Collection<Date>  coldate = new TreeSet<Date>(dc);
			
			//coldate.add(today);
			//coldate.add(dt2);
			System.out.println("coldate.add(prv) = "+coldate.add(dt));
			System.out.println("coldate.add(tody) = "+coldate.add(today));
			System.out.println("coldate.add(futre) = "+coldate.add(dt2));
			System.out.println("col = ");
			for(Date dispDate : coldate)
				System.out.println(dispDate);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*
		System.out.println("dob = "+gc.getTime().toString().split(" ")[1]+" "+gc.getTime().toString().split(" ")[2]);
		System.out.println(gc.getTime());
		
		System.out.println("-------------");
		System.out.println(dt);
		System.out.println(sdf.toPattern());
		System.out.println(new Date());*/
	}

}
