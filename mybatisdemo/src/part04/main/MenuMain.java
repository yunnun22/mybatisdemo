package part04.main;

import java.util.ArrayList;
import java.util.List;

import part04.controller.MemController;
import part04.dto.MemDTO;

public class MenuMain {
  public static void main(String[] args) {
	
	  MemController mController = new MemController();
	  
//	  List<MemDTO> insertList = new ArrayList<MemDTO>();
//	  insertList.add(new MemDTO("이기용", 40,"제주"));
//	  insertList.add(new MemDTO("이소라",33,"대전"));
//	 int cnt = mController.multiInsertProcess(insertList);
//	  System.out.printf("Insert Count:%d\n",cnt);
 
	  
//	  List<Integer> deleteList = new ArrayList<Integer>();
//	  deleteList.add(20);
//	  deleteList.add(21);
//	  deleteList.add(22);
//	  deleteList.add(23);
//	  
//	  int delCnt = mController.multiDeleteProcess(deleteList);
//	  System.out.printf("Delete Count:%d\n",delCnt);
	  
//	  System.out.println("검색결과");
//	  MemDTO dto = new MemDTO();
//	  dto.setAge(35);
//	  dto.setName("밤");
//	  List<MemDTO> searList = mController.searchProcess(dto);
//	  display(searList);
	  
	  
//	  MemDTO mt = new MemDTO();
//	  mt.setNum(24);
//	  mt.setName("홍재수");
//	  mt.setAge(50);
//	  int uptCnt = mController.multiUpdateProcess(mt);
//	  System.out.printf("Update Count:%d\n", uptCnt);
	  
	  
//	  int insCnt = mController.insertDataProcess(new MemDTO("틀쟁이",10,"부산"));
      int insCnt = mController.insertDataProcess(new MemDTO("김수현",34));
      System.out.printf("Insert Count:%d\n", insCnt);
	  
	  List<MemDTO> aList = mController.selectProcess();
	  display(aList);
  
}//main
  
  public static void display(List<MemDTO> aList) {
	  for(MemDTO dto : aList)
		  System.out.printf("%d %s %d %s\n",
				  dto.getNum(),dto.getName(),dto.getAge(),dto.getLoc());
	  
	
}//display

}//class