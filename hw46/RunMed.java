/*****************************************************
 * class RunMed
 * Implements an online algorithm to track the median of a growing dataset
 * Maintains 2 heaps: minheap for upper half of dataset, maxheap for lower half
 * Median will always be one of these:
 *  - max of left heap  (lower range)
 *  - min of right heap (upper range)
 *  - mean of heap roots
 *****************************************************/

public class RunMed {

    //instance vars
    private ALMaxHeap leftHeap;  //for lower range of dataset
    private ALMinHeap rightHeap; //for upper range of dataset


    /*****************************************************
     * default constructor  ---  inits empty heap
     *****************************************************/
    public RunMed()
    {
      leftHeap  = new ALMaxHeap();
      rightHeap = new ALMinHeap();
    }//O(1)



    /*****************************************************
     * double getMedian()  ---  returns median of dataset
     *****************************************************/
    public double getMedian()
    {

    }//O(1)



    /*****************************************************
     * insert(int)  ---  adds a new element to the dataset
     * postcondition: dataset is maintained such that
     *                getMedian() can run in constant time
     *****************************************************/
    public void insert( int addVal )
    {
          if ( leftHeap.size() == 0 || addVal < leftHeap.peekMax() )
              leftHeap.add( addVal );
          else
              rightHeap.add( addVal );
          if ( leftHeap.size()-rightHeap.size() > 1 )  	//balance height of both trees
              rightHeap.add( leftHeap.removeMax() );
          else if ( rightHeap.size()-leftHeap.size() > 1 )
              leftHeap.add( rightHeap.removeMin() );
     }//O(?)



    /*****************************************************
     * boolean isEmpty()  ---  tells whether a median may be calculated
     * postcondition: dataset structure unchanged
     *****************************************************/
    public boolean isEmpty()
    {
      return  leftHeap.size() + rightHeap.size() == 0;
    }//O(?)



    //main method for testing
    public static void main( String[] args ) {

	/*~~~V~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~V~~~
        RunMed med = new RunMed();

        med.insert(1);
	System.out.println( med.getMedian() ); //1
        med.insert(3);
	System.out.println( med.getMedian() ); //2
        med.insert(5);
	System.out.println( med.getMedian() ); //3
        med.insert(7);
	System.out.println( med.getMedian() ); //4
        med.insert(9);
	System.out.println( med.getMedian() ); //5
	~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~*/

    }//end main()

}//end class RunMed



    /*****************************************************
     *
     *****************************************************/
    // (  )
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)
