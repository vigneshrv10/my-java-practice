import java.util.*;
public class TrappingRainwater {
    public static void trappingwater(int h[],int width){
        int trappedwater = 0;
        int n = h.length;
        int leftmaxboundaries[] = new int[h.length]; // left max array
        leftmaxboundaries[0] = h[0];
        for (int i=1;i<h.length;i++){
            leftmaxboundaries[i] = Math.max(h[i], leftmaxboundaries[i-1]);
        }
        int rightmaxboundaries[] = new int[n]; // right max array
        rightmaxboundaries[n - 1] = h[n - 1];
        for (int i=n-2;i>=0;i--){
            rightmaxboundaries[i] = Math.max(h[i],rightmaxboundaries[i+1]);
        }
        for (int i=0;i<n;i++){ // calculating trap water
            int waterlevel = Math.min(leftmaxboundaries[i],rightmaxboundaries[i]);
            trappedwater += (waterlevel - h[i])*width;
        }
        System.out.println("Trapped water is : "+trappedwater);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of heights array : ");
        int hlen = sc.nextInt();
        int height[] = new int[hlen];
        System.out.println("Enter the elements of array as follows ");
        for (int i=0;i<hlen;i++){
            System.out.print("Enter the "+i+" index element : ");
            height[i] = sc.nextInt();
        }
        System.out.print("Enter the width of each bar : ");
        int width = sc.nextInt();
        trappingwater(height, width);
        sc.close();
    }
}
