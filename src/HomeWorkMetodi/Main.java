package HomeWorkMetodi;

public class Main {
    public static void main(String[] args) {

//        String reverse = "mama myla ramy";
//
//
//        TextUtils.countGlass(reverse);
//        System.out.println();

        int[][]numbers1 = {{1,2,5},
                           {4,6,8},
                           {6,3,7}};
        int[][]numbers2 = {{15,23,45,45},
                           {46,65,48,45},
                           {65,36,77,45}};

       int nums1 = TextUtils.countAverage(numbers1);
        System.out.println(nums1);
       int nums2 = TextUtils.countAverage(numbers2);
        System.out.println(nums2);

    }
}
