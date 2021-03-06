/*
@Input Format
There are two lines of input. The first line contains B: the breadth of the parallelogram.
The next line contains H: the height of the parallelogram.

@Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

@Sample input 1
1
3

@Sample output 1
3

@Sample input 2
-1
2

@Sample output 2
java.lang.Exception: Breadth and height must be positive
*/

public class Solution {
//Write your code here
    static boolean flag=true;
    static int B, H;
    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        try {   
            if(B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if(flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

    // Thinking in Java
    // Chapter 2
    // Practice 1
    // 创建一个类, 包含一个int类型的域和一个char类型的域, 证明Java执行了默认的初始化
    class AutoInit {
        private static int feildOne;
        private static char feildTwo;

        public static void main(String[] args) {
            System.out.println(feildOne + ", " +  feildTwo);
        }
    }

}