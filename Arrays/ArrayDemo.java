import java.io.*;
class ArrayDemo{
     public static void main(String args[]){
        int arr[] = new int[5];
        int nums[]={65,66,67,68,69,70,71,72,73};
        String names[]={"Yashwanth","Deepak","Ramakrishna"};
        int i;
        String contacts[][]={
             {
            "Yashwanth",
            "Deepak",
            "Ramakrishna",
            "Giridher"
             },
            {
            "6301888464",
            "7780648063",
            "9110713472"
            }
        };

        for(i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for(i=0;i<arr.length;i++){
            System.out.println("Contents of Arr["+i+"]="+arr[i]);
        }
        for(i=0;i<nums.length;i++){
            System.out.println("Contents of Nums["+i+"]="+nums[i]);
        }

        for(i=0;i<names.length;i++){
            System.out.println("Student Name:"+ names[i]);
        }


        for (String name : names) {
            System.out.println(name);
        }


        // for(int n : nums){
        //     char c=(char)n;
        //     System.out.println(c);
        // }

     
    
        String students[]=contacts[0];
        String numbers[]=contacts[1];

        for(String s[]:contacts){
            for(String data:s){
                System.out.println(data);
            }
        }

        for(i=0;i<students.length;i++){
            System.out.println("Student Name:"+students[i]+"\n Phone:"+numbers[i]);
        }


     }  




}