package fix_bugs_of_application;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Scanner;

	public class FixBugs
	{
		public static void main(String[] args) {
	        System.out.println("INDEX");
	        System.out.println();
	        System.out.println("BUGFIXING ");
	        System.out.println();
	        options();

	    }
	    private static void options() {
	        String[] arr = {"1. I wish to review my expenditure",
	                "2. I want to add my expenditure",
	                "3. I want to delete my expenditure",
	                "4. I want to sort out  the expenditures",
	                "5. I want to search for a particular expenditure",
	                "6. Close this application"
	        };
	        int[] arr1 = {1,2,3,4,5,6};
	        int  slen = arr1.length;
	        for(int i=0; i<slen;i++){
	            System.out.println(arr[i]);
	            
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(4000);
	        expenses.add(4300);
	        expenses.add(65000);
	        expenses.add(82000);
	        expenses.add(210);
	        expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  choice =  sc.nextInt();
	        for(int j=1;j<=slen;j++){
	            if(choice==j){
	                switch (choice){
	                    case 1:
	                        System.out.println("Your saved expenses are listed below: ");
	                        System.out.println(expenses+"\n");
	                        options();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: ");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Your value is updated ");
	                        expenses.addAll(arrlist);
	                        System.out.println(expenses+" ");
	                        options();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! nConfirm again by selecting the same option... ");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==choice){
	                               expenses.clear();
	                            System.out.println(expenses+" ");
	                            System.out.println("All your expenses are removed or deleted ! ");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        options();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        options();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        options();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("You opt for choosen an invalid choice!");
	                        break;
	                }
	            }
	        }

	    }
	    private static void closeApp() {
	        System.out.println("Closing your application...  Thank you!");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList) {
	        int leng = arrayList.size();
	        System.out.println("Enter the expense you need to search:");
	        //
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        //Linear Search
	        for(int i=0;i<leng;i++) {
	        	if(arrayList.get(i)==input) {
	        		System.out.println("Found the expense " + input + " at " + i + " position");
	        	}
	        }
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        int arrlength =  arrayList.size();
	       
	        
	        Collections.sort(arrayList);
	        System.out.println("Sorted expenses: ");
	        for(Integer i: arrayList) {
	        	System.out.print(i + " ");
	        }
	        
	        System.out.println("");
	       
	    }

}
