import java.util.*;
class Calculator{
String name;
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("Tax Calculator App");
System.out.println("------------------------");
System.out.println("*******WELCOME*******");
System.out.println("------------------------------");
System.out.println("enter total person count:");
int Count = sc.nextInt();
int arrCount[] = new int[Count];
String [] arrName = new String[Count];
long [] arrIncome = new long[Count];

for(int i=0;i<Count;i++){
int j = i+1;
System.out.println("enter the name"+j +":");
arrName[i]  = sc.next();
System.out.println("Enter " +arrName[i]+" 's annual income");
arrIncome[i] = sc.nextLong();
}

System.out.println("Name with liable taxes");
System.out.println("-----------------------------");
System.out.println("-----------------------------");
for(int i = 0;i<Count;i++){
calculateTax(arrName[i], arrIncome[i]);
}
sc.close();
}
public static double calculateTax(String name,long income){
double tax;
if(income>300000)
{
tax=income*0.02;
}
else if(income>=100000 && income<300000){
tax=income*0.01;
}
else 
{
tax = 0;
}
System.out.println(name+ ":"+tax);
return tax;}
}

