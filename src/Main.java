import ArraysAndHashing.*;

void main() {

    ProductOfArrayExecptSelf p = new ProductOfArrayExecptSelf();

    int[] nums = new int[]{-1, 1, 0, -3, 3};
    int[] real = p.productOfArrayExepctSelf(nums);

   for(int m: real) {
       System.out.println(m);
   }


}
