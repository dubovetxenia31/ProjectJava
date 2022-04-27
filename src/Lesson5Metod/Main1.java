package Lesson5Metod;

public class Main1 {
    public static void main(String[] args) {
        int[][] nums = {{2, 4, 5},
                        {4, 2, 3},
                        {5, 3, 4}};

//        System.out.print(nums[0][0] + " ");
//        System.out.print(nums[0][1] + " ");
//        System.out.print(nums[0][2] + " ");
//        System.out.println();
//
//        System.out.print(nums[1][0] + " ");
//        System.out.print(nums[1][1] + " ");
//        System.out.print(nums[1][2] + " ");
//        System.out.println();
//
//        System.out.print(nums[2][0] + " ");
//        System.out.print(nums[2][1] + " ");
//        System.out.print(nums[2][2] + " ");
//        System.out.println();


        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }

}
