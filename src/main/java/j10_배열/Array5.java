package j10_배열;

public class Array5 {

    public static int getMinNumbner(int nums1, int nums2) {
        return nums1 < nums2 ? nums1 : nums2;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 8, 9, 16, 17};
        int[] nums2 = new int[]{2, 7, 10, 15, 18};
        int[] nums3 = new int[]{3, 6, 11, 14, 19};
        int[] nums4 = new int[]{4, 5, 12, 13, 20};

        int[] resultArray = new int[5];

        /*
        배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.
         */

        for(int i = 0; i < nums1.length; i++){
            resultArray[i] = getMinNumbner(getMinNumbner(nums1[i], nums2[i]), getMinNumbner(nums3[i], nums4[i]));
            System.out.println(resultArray[i]);
        }

        int a = 10;
        int b = 5;
        int c = 7;

        int min = a;
        if(a < b){
            min = a;
        }else{
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println("min : " + min);
    }
}
