public class Calculator { 
String name; 
public String getName() { 
return name; 
} 
public void setName(String newName) { 
name = newName; 
} 
void whoAreYou(){ 
System.out.println("I'm a Calculator, my name is " + name); 
} 
public int add(int first, int second) { 
return first + second; 
} 
public int subtract(int first, int second) { 
return first - second; 
} 
public int multiply(int first, int second) { 
int sonuc = first * second; 
return sonuc; 
} 
public int multiplyByAdding(int first, int second) { 
int multiplication = 0; 
for(int i = 1; i <= second; i++) 
multiplication += first; 
System.out.println("Multiplication: " + multiplication); 
return multiplication; 
} 
public double divide(int first, int second) { 
return (double)first / second; 
} 
public double mod(int first, int second){
    return first % second;
}
public double power(int first, int second) {
    int result=1;
for(int i=1 ; i<= second; i++){ 
result*=first;
 }
return result;
 }
 public double factorial(int first){
    int result=1;
    for(int i=1; i<=first; i++){
        result*=i;
    }
    return result;
 }
public static void main(String[] args) { 
Calculator calculator = new Calculator(); 
calculator.setName("Texas Instruments T-308"); 
calculator.whoAreYou(); 
int i = calculator.add(12, 27); 
System.out.println("12 + 27 = " + i); 
double d = calculator.divide(82, 9); 
System.out.println("82 / 9 = " + d); 
System.out.println("83 - 56 = " + calculator.subtract(83, 56)); 
System.out.println("8 * 7 = " + calculator.multiply(8, 7)); 
calculator.multiplyByAdding(22, 5); 
System.out.println("15 % 4 = " + calculator.mod(15, 4));
System.out.println("2 ^ 3 = " + calculator.power(2, 3));
System.out.println("5! = " + calculator.factorial(5));
} 
} 