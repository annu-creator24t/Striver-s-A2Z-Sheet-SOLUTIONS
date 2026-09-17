1- Input/Output

class Solution {
    public void printNumber(Scanner sc) {
        int n=sc.nextInt();
      System.out.println(n);
    }
}



2- If ElseIf

  class Solution {
    public void studentGrade(int marks) {
     if(marks>=90){
        System.out.println("Grade A");
     }else if(marks>=70){
        System.out.println("Grade B");
     }else if(marks>=50){
        System.out.println("Grade C");
     }else if(marks>=35){
        System.out.println("Grade D");
     }else{
        System.out.println("Fail");
     }
    }
}


3- Switch Case

  class Solution {
    public void whichWeekDay(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}


4- For Loop

class Solution {

    public int forLoop(int low, int high) {

        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }

        System.out.println(sum);
        return sum;
    }
}

5- While Loop

  class Solution {
    public int whileLoop(int d) {

        int sum = 0;
        int count = 0;
        int num = d;

        if (d == 0) {
            num = 10;
        }

        while (count < 50) {
            sum += num;
            num += 10;
            count++;
        }

        return sum;
    }
}

6- Pass by Ref

  class Solution {
    public void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}


  
