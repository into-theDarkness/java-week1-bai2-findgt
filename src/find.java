import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        String [] student = {"duc","hoang","du","tung","loan","quynh"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String input_name = input.nextLine();
        boolean isExit = false;
        for (int i =0; i<student.length;i++){
            if (student[i].equals(input_name)){
                System.out.println("Vi tri cua hoc sinh " + input_name +" trong danh sach la: " + i);
                isExit = true;
                break;
            }
        }
        if (!isExit)
            System.out.println("not found" + input_name + " in list");
    }
}
