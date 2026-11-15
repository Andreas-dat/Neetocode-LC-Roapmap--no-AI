import ArraysAndHashing.*;

void main() {

    TopKFrequent q = new TopKFrequent();

    int[] nums = {1,1,1,1,5,5,5,7,7,7,7,7,7,7,7,7};
    int k = 2;

   int[] test = q.topKFrequent(nums,k);

   for(int t: test) {
       System.out.println(t);
   }


}
