package syscro;

class Table{  
	 synchronized void printTable(int j){
	   for(int i=1;i<=5;i++){  
	     System.out.println(j	*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class Synco1 extends Thread{  
	Table t;  
	Synco1(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class Synco2 extends Thread{  
	Table t;  
	Synco2(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class SyncroProjects {  
	public static void main(String args[]){  
	Table obj = new Table();  
	Synco1 s1=new Synco1(obj);  
	Synco2 s2=new Synco2(obj);  
	s1.start();  
	s2.start();  
	}  
	}  

		



