package day18Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(11);
        //1.YOL
        for(Integer w:nums){


            if(w==7){
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);

        //2.YOL

        for(int i=0;i<nums.size();i++){
           int element=nums.get(i);

            if(element==7){
                continue;
            }
            nums.set(i,element+3);
        }
        System.out.println(nums);

         /*
            nums.indexOf(w) ilk gorunumun index'ini verir. List tekrarli elemana sahip ise
            nums.indexOf(w) kullanimi risk olusturabilir. Bu yuzden bu soruda en guvenli yol "for-loop" tur.
            set update eder.get elemani secer.
         */
    }
}
